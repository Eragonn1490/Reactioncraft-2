package Reactioncraft.mobs.common;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import cpw.mods.fml.common.Loader;
import forestry.api.core.ItemInterface;
import net.minecraft.block.Block;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityTJ extends EntityMob 
{
    private ChunkCoordinates currentFlightTarget = null;
    private int stuck_count = 0;
    private int lastX = 0;
    private int lastZ = 0;
    private Entity rt = null;
    
	public EntityTJ(World par1World) 
	{	
		super(par1World);			
	    this.setSize(1.0F, 2.0F);
	    this.getNavigator().setAvoidsWater(true);
	    this.tasks.addTask(0, new EntityAIWander(this, 1.0D));
	    this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityBee.class, 1.0D, true));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, 1.0D, false));
        this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, false));
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityBee.class, 0, false));
	    
	    
	    this.getNavigator().setAvoidsWater(false);
	    this.experienceValue = 25;
        this.isImmuneToFire = false; 
        this.fireResistance = 5;
	}
	
	/**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }
    
	
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(2.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(16.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.35D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(40.0D);
    }
	
    protected void entityInit(){
        super.entityInit();
        this.dataWatcher.addObject(20, Byte.valueOf((byte)0));
    }

    protected boolean canDespawn()
    {
	    return true;
    }
    
    public final int getAttacking()
    {
        return this.dataWatcher.getWatchableObjectByte(20);
    }

    public final void setAttacking(int par1)
    {
        this.dataWatcher.updateObject(20, Byte.valueOf((byte)par1));
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume(){
        return 0.25F;
    }

    /**
     * Gets the pitch of living sounds in living entities.
     */
    protected float getSoundPitch(){
        return 1.0F;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound(){
        return null;//"orespawn:Beebuzz";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound(){
        return null;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound(){
        return null;
    }

    /**
     * Returns true if this entity should push and be pushed by other entities when colliding.
     */
    public boolean canBePushed(){
        return true;
    }

    protected void collideWithEntity(Entity par1Entity) {}

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();
        
        this.motionY += 0.00238418579D; //Gravity adjustment!
    }


    public boolean attackEntityAsMob(Entity par1Entity)
    {
    	//System.out.printf("attackEntityAsMob\n");
    	//return super.attackEntityAsMob(par1Entity);
        boolean var4 = par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), 1.0f);
       	if(this.worldObj.rand.nextInt(2) == 1 && par1Entity != null){
    		((EntityLivingBase)par1Entity).addPotionEffect(new PotionEffect(Potion.poison.id, 250, 0));
    	}
        return var4;
    }
    
    /**
     * returns true if the target position can be seen
     */
    public boolean canSeeTarget(double pX, double pY, double pZ)
    {
        return this.worldObj.rayTraceBlocks_do_do(this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX, this.posY + 0.75D, this.posZ), 
        		this.worldObj.getWorldVec3Pool().getVecFromPool(pX, pY, pZ),false,false) == null;
    }

    /**
     * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
     * prevent them from trampling crops
     */
    protected boolean canTriggerWalking()
    {
        return true;
    }

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    protected void fall(float par1) {}

    /**
     * Takes in the distance the entity has fallen this tick and whether its on the ground to update the fall distance
     * and deal fall damage if landing on the ground.  Args: distanceFallenThisTick, onGround
     */
    protected void updateFallState(double par1, boolean par3) {}

    /**
     * Return whether this entity should NOT trigger a pressure plate or a tripwire.
     */
    public boolean doesEntityNotTriggerPressurePlate(){
        return true;
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
    {
    	boolean ret;
 
             ret = super.attackEntityFrom(par1DamageSource, par2);
             Entity e = par1DamageSource.getEntity();
             if(e != null && e instanceof EntityLivingBase && this.currentFlightTarget != null)
             {
            	 this.rt = e;
            	 this.currentFlightTarget.set((int)e.posX, (int)(e.posY), (int)e.posZ); 
             }
             return ret;
       
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readEntityFromNBT(par1NBTTagCompound);    
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeEntityToNBT(par1NBTTagCompound);     
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    { 

	    if(this.posY < 50)return false;
	    if(!this.worldObj.isDaytime())return false; // daytime only.
    	return true;   
    }
    
    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    public int getTotalArmorValue()
    {
        return 5;
    }

    /**
     * Initialize this creature.
     */
    public void initCreature() { 
    }
    
    /**
     * A method used to see if an entity is a suitable target through a number of checks.
     */
    private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2)
    {
    	if(this.worldObj.difficultySetting == 0)return false;

    	if (par1EntityLiving == null)
    	{
    		return false;
    	}              
    	if (par1EntityLiving == this)
    	{
    		return false;
    	}        
    	if (!par1EntityLiving.isEntityAlive())
    	{
    		//System.out.printf("Not alive!\n");
    		return false;
    	}       
    	if ( !this.getEntitySenses().canSee(par1EntityLiving))
    	{
    		//System.out.printf("can't see\n");
    		return false;
    	}
    	if (par1EntityLiving instanceof EntityPlayer)
    	{ 
    		EntityPlayer p = (EntityPlayer)par1EntityLiving;
    		if(p.capabilities.isCreativeMode == true)
    		{
    			return false;
    		}
    		if(p.capabilities.isCreativeMode == false)
    		{ 
    			return true;
    		}
    		return true;
    	} 
    	if (par1EntityLiving instanceof EntityVillager)
    	{ 
    		return true;
    	} 
    	
    	if (par1EntityLiving instanceof EntityBee)
    	{
    		return true;
    	}
    	return true;
    }
    
    
    public int getDropItemId()
    {
    		//return .itemID;
    		if (Loader.isModLoaded("Forestry"))
    		{
    			ItemStack pollen = ItemInterface.getItem("pollen");
    			System.out.println("[Foresty] mod loaded"); 
    			return pollen.itemID;
    		}
    		
    		else return -1;		
    }
}
