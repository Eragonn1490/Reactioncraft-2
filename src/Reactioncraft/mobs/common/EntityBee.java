package Reactioncraft.mobs.common;

import Reactioncraft.mobs.RCmobs;
import Reactioncraft.mobs.client.ClientProxy;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityBee extends EntityAnimal
{
    public EntityBee(World world)
    {
        super(world);
        this.texture = (ClientProxy.MODEL_TEXTURE + "Bee.png");
        this.setSize(0.4F, 0.4F);
        float f = 0.25F;
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAIPanic(this, 0.38F));
        tasks.addTask(1, new EntityAISwimming(this));
        tasks.addTask(2, new EntityAIPanic(this, 0.38F));
        tasks.addTask(3, new EntityAITempt(this, 0.25F, Item.wheat.itemID, false));
        tasks.addTask(4, new EntityAIFollowParent(this, 0.28F));
        tasks.addTask(5, new EntityAIWander(this, f));
        tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6F));
        tasks.addTask(7, new EntityAILookIdle(this));
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    public int getMaxHealth()
    {
        return 5;
    }

    public void entityInit()
    {
        super.entityInit();
        dataWatcher.addObject(16, Byte.valueOf((byte)0));
    }
    
    /**
     * Returns the item ID for the item the mob drops on death.
     */
    public int getDropItemId()
    {
    	return Item.appleRed.itemID;
    }

    /**
     * Called when a lightning bolt hits the entity.
     */
    public void onStruckByLightning(EntityLightningBolt entitylightningbolt)
    {
        if (!worldObj.isRemote)
        {
            EntityBee entitybee = new EntityBee(worldObj);
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

	public EntityAgeable func_90011_a(EntityAgeable var1) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityAgeable createChild(EntityAgeable var1) {
		// TODO Auto-generated method stub
		return null;
	}
}
