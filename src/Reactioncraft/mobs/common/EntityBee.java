package Reactioncraft.mobs.common;

import cpw.mods.fml.common.Loader;
import ic2.api.item.Items;
import forestry.api.core.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityBee extends EntityAnimal
{
	public EntityBee(World world)
	{
		super(world);
		this.setSize(0.4F, 0.4F);
		float f = 0.25F;
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(0, new EntityAIPanic(this, 1.5F));
		tasks.addTask(1, new EntityAIAvoidEntity(this, EntityPlayer.class, 1.0F, 0.8D, 1.33D));
		tasks.addTask(1, new EntityAIAvoidEntity(this, EntityTJ.class, 2.0F, 0.8D, 1.33D));
		tasks.addTask(2, new EntityAISwimming(this));
		tasks.addTask(3, new EntityAIPanic(this, 1.5F));
		tasks.addTask(4, new EntityAITempt(this, 0.25F, Item.wheat.itemID, false));
		tasks.addTask(5, new EntityAIFollowParent(this, 0.28F));
		tasks.addTask(6, new EntityAIWander(this, f));
		tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6F));
		tasks.addTask(8, new EntityAILookIdle(this));
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
		 this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(6.0D);
		 this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.30000000298023224D);
	 }

	 public void entityInit()
	 {
		 super.entityInit();
		 dataWatcher.addObject(16, Byte.valueOf((byte)0));
	 }

	 /**
	  * Returns the item ID for the item the mob drops on death.
	  */
	 @Override
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

	 /**
	  * Called when a lightning bolt hits the entity.
	  */
	 public void onStruckByLightning(EntityLightningBolt entitylightningbolt)
	 {
		 if (!worldObj.isRemote)
		 {
			 EntityTJ entitybee = new EntityTJ(worldObj);
			 entitybee.setLocationAndAngles(posX, posY, posZ, rotationYaw, rotationPitch);
			 worldObj.spawnEntityInWorld(entitybee);
			 setDead();
		 }
	 }

	 /**
	  * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
	  */
	 public EntityAnimal spawnBabyAnimal(EntityAnimal entityanimal)
	 {
		 return new EntityBee(worldObj);
	 }

	 @Override
	 public EntityAgeable createChild(EntityAgeable entityageable) 
	 {
		 return null;
	 }

	 public int isCollided() 
	 {
		 return 0;
	 }
}
