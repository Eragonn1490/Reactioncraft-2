package Reactioncraft.mobs.common;

import Reactioncraft.mobs.RCmobs;
import Reactioncraft.mobs.client.ClientProxy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCloth;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.potion.Potion;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityHydrolisc extends EntityTameable 
{
	private int force_sync = 50; //Force server and client to sync health!
	
	/**
     * The tempt AI task for this mob, used to prevent taming while it is fleeing.
     */
    private EntityAITempt aiTempt;
	
	public EntityHydrolisc(World par1World)
	{
		super(par1World);
		this.texture = (ClientProxy.MODEL_TEXTURE + "hydrolisctexture.png");
		this.setSize(0.5F, 0.5F);
		this.moveSpeed = 0.25F;
		this.fireResistance = 100;
		this.getNavigator().setAvoidsWater(false);
		this.setSitting(false);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, this.aiSit);
		this.tasks.addTask(2, this.aiTempt = new EntityAITempt(this, 0.2F, Item.fishRaw.itemID, true));
		this.tasks.addTask(3, new EntityAITempt(this, 0.5F, Item.carrotOnAStick.itemID, false));
		this.tasks.addTask(4, new EntityAIFollowOwner(this, 0.3F, 10.0F, 5.0F));
		this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 10.0F));
		this.tasks.addTask(6, new EntityAIPanic(this, 0.5F));
		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(8, new EntityAIWander(this, 0.20F));
		this.tasks.addTask(9, new EntityAILookIdle(this));           
		this.tasks.addTask(10, new EntityAIMoveIndoors(this));
	}

	protected void entityInit()
	{
		super.entityInit();  
		this.dataWatcher.addObject(18, new Integer(this.getMaxHealth()));
		this.health = this.getMaxHealth();
		this.force_sync = 50; //Force server and client to sync health!
		this.setSitting(false);
	}
	
	/**
     * Determines if an entity can be despawned, used on idle far away entities
     */
    protected boolean canDespawn()
    {
        return !this.isTamed();
    }

	public int foodNum;
	public int tamedNum;
	
	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeEntityToNBT(par1NBTTagCompound);
		par1NBTTagCompound.setInteger("HydroHealth",this.dataWatcher.getWatchableObjectInt(18));
		
		//par1NBTTagCompound.setInteger("tamednum", tamedNum);
		//par1NBTTagCompound.setBoolean("on", on);
		//par1NBTTagCompound.setInteger("foodnum", foodNum);
		//par1NBTTagCompound.setInteger("tamednum", tamedNum);


		
		if (this.getOwnerName() == null)
		{
			par1NBTTagCompound.setString("Owner", "");
		}
		else
		{
			par1NBTTagCompound.setString("Owner", this.getOwnerName());
		} 
	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readEntityFromNBT(par1NBTTagCompound);
		this.health = par1NBTTagCompound.getInteger("HydroHealth");
		this.dataWatcher.updateObject(18, Integer.valueOf(this.health));
		String var2 = par1NBTTagCompound.getString("Owner");

		if (var2.length() > 0)
		{
			this.setOwner(var2);
			this.setTamed(true);
			//System.out.printf("Restored Owner %s has type %d and id %d, %s\n", this.getOwnerName(), this.getTameSkin(), this.entityId, this.worldObj.isRemote?"is Remote":"is NOT remote");
		}
	}

	private int closest = 99999;
	private int tx = 0, ty = 0, tz = 0;

	private boolean scan_it(int x, int y, int z, int dx, int dy, int dz){
		int found = 0;
		int i, j, bid, d;

		//Fixed x, scan two sides of 3d rectangle
		for(i=-dy;i<=dy;i++)
		{
			for(j=-dz;j<=dz;j++)
			{
				bid = this.worldObj.getBlockId(x+dx, y+i, z+j);
				if(bid == Block.waterStill.blockID || bid == Block.waterMoving.blockID)
				{
					d = dx*dx + j*j + i*i;
					if(d < closest)
					{
						closest = d;
						tx = x+dx; ty = y+i; tz = z+j;
						found++;
					}
				}
				bid = this.worldObj.getBlockId(x-dx, y+i, z+j);
				if(bid == Block.waterStill.blockID || bid == Block.waterMoving.blockID)
				{
					d = dx*dx + j*j + i*i;
					if(d < closest)
					{
						closest = d;
						tx = x-dx; ty = y+i; tz = z+j;
						found++;
					}
				} 			
			}
		}
		//Fixed y, scan two sides of 3d rectangle
		for(i=-dx;i<=dx;i++)
		{
			for(j=-dz;j<=dz;j++)
			{
				bid = this.worldObj.getBlockId(x+i, y+dy, z+j);
				if(bid == Block.waterStill.blockID || bid == Block.waterMoving.blockID)
				{
					d = dy*dy + j*j + i*i;
					if(d < closest)
					{
						closest = d;
						tx = x+i; ty = y+dy; tz = z+j;
						found++;
					}
				}
				bid = this.worldObj.getBlockId(x+i, y-dy, z+j);
				if(bid == Block.waterStill.blockID || bid == Block.waterMoving.blockID)
				{
					d = dy*dy + j*j + i*i;
					if(d < closest)
					{
						closest = d;
						tx = x+i; ty = y-dy; tz = z+j;
						found++;
					}
				} 			
			}
		}    	
		//Fixed z, scan two sides of 3d rectangle
		for(i=-dx;i<=dx;i++)
		{
			for(j=-dy;j<=dy;j++)
			{
				bid = this.worldObj.getBlockId(x+i, y+j, z+dz);
				if(bid == Block.waterStill.blockID || bid == Block.waterMoving.blockID)
				{
					d = dz*dz + j*j + i*i;
					if(d < closest)
					{
						closest = d;
						tx = x+i; ty = y+i; tz = z+dz;
						found++;
					}
				}
				bid = this.worldObj.getBlockId(x+i, y+j, z-dz);
				if(bid == Block.waterStill.blockID || bid == Block.waterMoving.blockID)
				{
					d = dz*dz + j*j + i*i;
					if(d < closest)
					{
						closest = d;
						tx = x+i; ty = y+i; tz = z-dz;
						found++;
					}
				} 			
			}
		}    	

		if(found != 0)return true;
		return false;
	}

	/**
	 * main AI tick function
	 */
	protected void updateAITick()
	{
		int i, j;

		if(this.isSitting() == false){
			//Find water. We love water!
			if((this.worldObj.rand.nextInt(20) == 0 && this.getHydroHealth() < this.getMaxHealth()) || this.worldObj.rand.nextInt(100) == 0)
			{
				//System.out.printf("Searching for food %d\n",this.getHydroHealth()); 
				//Very efficient search from near to far.
				closest = 99999;
				tx = ty = tz = 0;
				for(i=1;i<11;i++){
					j = i;
					if(j > 4)j = 4; //Limit y range
					if(scan_it((int)this.posX, (int)this.posY-1, (int)this.posZ, i, j, i) == true)break;
					if(i>=6)i++; //skip to reduce long-range intensive processing...
				}

				if(closest < 99999)
				{
					this.getNavigator().tryMoveToXYZ(tx,  ty-1,  tz,  this.moveSpeed);
					if(this.isInWater())
					{
						this.heal(1);
						this.playSound("splash", 1.0F, this.worldObj.rand.nextFloat()*0.2F + 0.9F );
					}
				}		
			}
		}

		//Transfer health to owner!
		if(this.worldObj.rand.nextInt(20) == 0 )
		{
			if(this.isTamed())
			{
				EntityLiving e = this.getOwner();
				if(e != null){  			
					if(e.getHealth() != e.getMaxHealth())
					{  
						if(this.getHydroHealth() > 1)
						{
							e.heal(1);
							this.health--;
							this.dataWatcher.updateObject(18, Integer.valueOf(this.getHealth()));
						}
					}
				}
			}
		}

	}

	private void settexture()
	{
		this.texture = (ClientProxy.MODEL_TEXTURE + "hydrolisctexture.png");
	}

	/**
	 * Returns the texture's file path as a String.
	 */
	public String getTexture()
	{
		this.settexture();
		return this.texture;
	}

	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	public boolean isAIEnabled()
	{
		return true;
	}

	//Because AISwimming doesn't always work!
	public boolean canBreatheUnderwater()
	{
		return true;
	}

	public int getMaxHealth()
	{
		return this.isTamed() ? 30 : 10;
	}

	/**
	 * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
	 * use this to react to sunlight and start to burn.
	 */
	public void onLivingUpdate()
	{

		super.onLivingUpdate();

		//Force Client to synch with server (or vice-versa).
		//One side gets from this.health and passes through the watchable object to the other.
		//the other side gets from the watchable object and sets this.health.
		//YES. There ARE two copies of the entity. One in the client. One in the server.
		//The trick is to keep them synchronized at all times.
		//Some things work correctly, automagically.
		//Some don't!
		this.force_sync--;
		if(this.force_sync <= 0)
		{
			this.force_sync = 50; //Not too often...  
			if (!this.worldObj.isRemote)//is CLIENT
			{
				this.dataWatcher.updateObject(18, Integer.valueOf(this.getHealth()));
				this.setSitting(this.isSitting());

			}else
			{
				this.health = this.getHydroHealth();
			}
			//Use health as a clue that we are tamed, which doesn't always seem to sync properly either.
			if(this.health >= 15)
			{
				this.setTamed(true);
			}
		}
	}

	/**
	 * Return health points from the watchable object
	 */
	public int getHydroHealth() 
	{
		return this.dataWatcher.getWatchableObjectInt(18);
	}
	
//	public boolean on;
	
//	public boolean interact(EntityPlayer par1EntityPlayer)
//	{      
//		ItemStack itemstack = par1EntityPlayer.inventory.getCurrentItem();
//
//		if(tamedNum == 0)
//		{
//			tamedNum = rand.nextInt(10) + 1;
//		}
//
//
//		if (!isTamed())
//		{
//			//Taming
//			if (itemstack != null && itemstack.itemID == Item.fishRaw.itemID && par1EntityPlayer.getDistanceSqToEntity(this) < 9D)
//			{
//				itemstack.stackSize--;
//				foodNum++;
//				if (itemstack.stackSize <= 0)
//				{
//					par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, null);
//				}
//
//				if (!worldObj.isRemote && foodNum >= tamedNum)
//				{
//					setTamed(true);
//					setOwner(par1EntityPlayer.username);
//					aiSit.setSitting(true);
//					worldObj.setEntityState(this, (byte)7);
//					//ModLoader.getMinecraftInstance().thePlayer.addChatMessage("Yes, Sir what do you wont me to do?");
//				}
//				
//				if (par1EntityPlayer.username.equalsIgnoreCase(this.getOwnerName()) && !this.worldObj.isRemote && !this.isBreedingItem(itemstack))
//	            {
//	                this.aiSit.setSitting(!this.isSitting());
//	                this.isJumping = false;
//	                this.setPathToEntity((PathEntity)null);
//	            }
//			}
//
//			return true;
//		}
//		else
//		{
//			if (this.rand.nextInt(3) == 0)
//            {
//                this.setTamed(true);
//                this.setPathToEntity((PathEntity)null);
//                this.setAttackTarget((EntityLiving)null);
//                this.aiSit.setSitting(true);
//                this.setEntityHealth(20);
//                this.setOwner(par1EntityPlayer.username);
//                this.playTameEffect(true);
//                this.worldObj.setEntityState(this, (byte)7);
//            }
//            else
//            {
//                this.playTameEffect(false);
//                this.worldObj.setEntityState(this, (byte)6);
//            }
//		}
//
//		return super.interact(par1EntityPlayer);  
//	}

	public boolean interact(EntityPlayer par1EntityPlayer)
    {
        ItemStack itemstack = par1EntityPlayer.inventory.getCurrentItem();

        if (this.isTamed())
        {
            if (itemstack != null)
            {
                if (Item.itemsList[itemstack.itemID] instanceof ItemFood)
                {
                    ItemFood itemfood = (ItemFood)Item.itemsList[itemstack.itemID];

                    if (itemfood.isWolfsFavoriteMeat() && this.dataWatcher.getWatchableObjectInt(18) < 20)
                    {
                        if (!par1EntityPlayer.capabilities.isCreativeMode)
                        {
                            --itemstack.stackSize;
                        }

                        this.heal(itemfood.getHealAmount());

                        if (itemstack.stackSize <= 0)
                        {
                            par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
                        }

                        return true;
                    }
                }
           }

            if (par1EntityPlayer.username.equalsIgnoreCase(this.getOwnerName()) && !this.worldObj.isRemote && !this.isBreedingItem(itemstack))
            {
                this.aiSit.setSitting(!this.isSitting());
                this.isJumping = false;
                this.setPathToEntity((PathEntity)null);
            }
        }
        else if (itemstack != null && itemstack.itemID == Item.fishRaw.itemID)
        {
            if (!par1EntityPlayer.capabilities.isCreativeMode)
            {
                --itemstack.stackSize;
            }

            if (itemstack.stackSize <= 0)
            {
                par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
            }

            if (!this.worldObj.isRemote)
            {
                if (this.rand.nextInt(3) == 0)
                {
                    this.setTamed(true);
                    this.setPathToEntity((PathEntity)null);
                    this.setAttackTarget((EntityLiving)null);
                    this.aiSit.setSitting(true);
                    this.setEntityHealth(20);
                    this.setOwner(par1EntityPlayer.username);
                    this.playTameEffect(true);
                    this.worldObj.setEntityState(this, (byte)7);
                }
                else
                {
                    this.playTameEffect(false);
                    this.worldObj.setEntityState(this, (byte)6);
                }
            }

            return true;
        }

        return super.interact(par1EntityPlayer);
    }
	
	
	/**
	 * Checks if the parameter is an wheat item.
	 */
	public boolean isWheat(ItemStack par1ItemStack)
	{
		return par1ItemStack != null && par1ItemStack.itemID == Item.fishRaw.itemID;
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	protected String getLivingSound()
	{
		//if(this.isSitting())
		//{
		//	return "";
		//}
		return "";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	protected String getHurtSound()
	{
		return "cryo_hurt";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	protected String getDeathSound()
	{
		return "cryo_death";
	}

	/**
	 * Returns the volume for the sounds this mob makes.
	 */
	protected float getSoundVolume()
	{
		return 0.4F;
	}   

	/**
	 * Returns the item ID for the item the mob drops on death.
	 */
	protected int getDropItemId()
	{
		return Item.fishRaw.itemID;
	}

	/**
	 * Drop items of this living's type
	 */
	protected void dropFewItems(boolean par1, int par2)
	{
		int var3 = 0;
		//Untamed don't drop extra
		if(this.isTamed()){
			//Drop a few fish
			var3 = this.rand.nextInt(5);
			var3 += 2;
			for(int var4 = 0; var4 < var3; ++var4)
			{
				this.dropItem(Item.fishRaw.itemID, 1);
			}
		}      
	}
	
	/**
     * Checks if the parameter is an item which this animal can be fed to breed it (wheat, carrots or seeds depending on
     * the animal type)
     */
    public boolean isBreedingItem(ItemStack par1ItemStack)
    {
        return par1ItemStack != null && par1ItemStack.itemID == Item.fishRaw.itemID;
    }
	
    /**
     * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
     */
    public EntityHydrolisc spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
    	EntityHydrolisc entitywolf = new EntityHydrolisc(this.worldObj);
        String s = this.getOwnerName();

        if (s != null && s.trim().length() > 0)
        {
            entitywolf.setOwner(s);
            entitywolf.setTamed(true);
        }

        return entitywolf;
    }

    public void func_70918_i(boolean par1)
    {
        byte b0 = this.dataWatcher.getWatchableObjectByte(19);

        if (par1)
        {
            this.dataWatcher.updateObject(19, Byte.valueOf((byte)1));
        }
        else
        {
            this.dataWatcher.updateObject(19, Byte.valueOf((byte)0));
        }
    }

    /**
     * Returns true if the mob is currently able to mate with the specified mob.
     */
    public boolean canMateWith(EntityAnimal par1EntityAnimal)
    {
        if (par1EntityAnimal == this)
        {
            return false;
        }
        else if (!this.isTamed())
        {
            return false;
        }
        else if (!(par1EntityAnimal instanceof EntityHydrolisc))
        {
            return false;
        }
        else
        {
        	EntityHydrolisc entitywolf = (EntityHydrolisc)par1EntityAnimal;
            return !entitywolf.isTamed() ? false : (entitywolf.isSitting() ? false : this.isInLove() && entitywolf.isInLove());
        }
    }

    public boolean func_70922_bv()
    {
        return this.dataWatcher.getWatchableObjectByte(19) == 1;
    }
    
    @Override
    public EntityAgeable createChild(EntityAgeable par1EntityAgeable)
    {
        return this.spawnBabyAnimal(par1EntityAgeable);
    }
}