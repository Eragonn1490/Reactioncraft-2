package Reactioncraft.mobs.common;

import Reactioncraft.mobs.RCmobs;
import Reactioncraft.mobs.client.ClientProxy;
import net.minecraft.block.material.Material;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityJellyfish extends EntityWaterMob
{
    public float field_21089_a;
    public float field_21088_b;
    public float field_21087_c;
    public float field_21086_f;
    public float field_21085_g;
    public float field_21084_h;
    public float tentacleAngle;
    public float lastTentacleAngle;
    private float randomMotionSpeed;
    private float field_21080_l;
    private float field_21079_m;
    private float randomMotionVecX;
    private float randomMotionVecY;
    private float randomMotionVecZ;

    public EntityJellyfish(World world)
    {
        super(world);
        field_21089_a = 0.0F;
        field_21088_b = 0.0F;
        field_21087_c = 0.0F;
        field_21086_f = 0.0F;
        field_21085_g = 0.0F;
        field_21084_h = 0.0F;
        tentacleAngle = 0.0F;
        lastTentacleAngle = 0.0F;
        randomMotionSpeed = 0.0F;
        field_21080_l = 0.0F;
        field_21079_m = 0.0F;
        randomMotionVecX = 0.0F;
        randomMotionVecY = 0.0F;
        randomMotionVecZ = 0.0F;
        this.texture = (ClientProxy.MODEL_TEXTURE + "Jellyfish.png");
        setSize(0.3F, 0.3F);
        field_21080_l = (1.0F / (rand.nextFloat() + 1.0F)) * 0.2F;
    }

    public int getMaxHealth()
    {
        return 10;
    }

    /**
     * (abstract) public helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeEntityToNBT(nbttagcompound);
    }

    /**
     * (abstract) public helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readEntityFromNBT(nbttagcompound);
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    public String getLivingSound()
    {
        return null;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    public String getHurtSound()
    {
        return null;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    public String getDeathSound()
    {
        return null;
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    public float getSoundVolume()
    {
        return 0.4F;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    public int getDropItemId()
    {
		return Item.appleRed.itemID;
        //return RCmobs.Jellyfish.itemID;
    }

    /**
     * Drop 0-2 items of this living's type
     */
    public void dropFewItems(boolean flag, int i)
    {
        int j = rand.nextInt(3 + i) + 1;

        for (int k = 0; k < j; k++)
        {
        	entityDropItem(new ItemStack(Item.appleRed, 0), 0.0F);
            //entityDropItem(new ItemStack(RCmobs.Jellyfish, 1), 0.0F);
        }
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer entityplayer)
    {
        return super.interact(entityplayer);
    }

    /**
     * Checks if this entity is inside water (if inWater field is true as a result of handleWaterMovement() returning
     * true)
     */
    public boolean isInWater()
    {
        return worldObj.handleMaterialAcceleration(boundingBox.expand(0.0D, -0.60000002384185791D, 0.0D), Material.water, this);
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        field_21088_b = field_21089_a;
        field_21086_f = field_21087_c;
        field_21084_h = field_21085_g;
        lastTentacleAngle = tentacleAngle;
        field_21085_g += field_21080_l;

        if (field_21085_g > ((float)Math.PI * 2F))
        {
            field_21085_g -= ((float)Math.PI * 2F);

            if (rand.nextInt(10) == 0)
            {
                field_21080_l = (1.0F / (rand.nextFloat() + 1.0F)) * 0.2F;
            }
        }

        if (isInWater())
        {
            if (field_21085_g < (float)Math.PI)
            {
                float f = field_21085_g / (float)Math.PI;
                tentacleAngle = MathHelper.sin(f * f * (float)Math.PI) * (float)Math.PI * 0.25F;

                if ((double)f > 0.75D)
                {
                    randomMotionSpeed = 1.0F;
                    field_21079_m = 1.0F;
                }
                else
                {
                    field_21079_m *= 0.8F;
                }
            }
            else
            {
                tentacleAngle = 0.0F;
                randomMotionSpeed *= 0.9F;
                field_21079_m *= 0.99F;
            }

            if (!worldObj.isRemote)
            {
                motionX = randomMotionVecX * randomMotionSpeed;
                motionY = randomMotionVecY * randomMotionSpeed;
                motionZ = randomMotionVecZ * randomMotionSpeed;
            }

            float f1 = MathHelper.sqrt_double(motionX * motionX + motionZ * motionZ);
            renderYawOffset += ((-(float)Math.atan2(motionX, motionZ) * 180F) / (float)Math.PI - renderYawOffset) * 0.1F;
            rotationYaw = renderYawOffset;
            field_21087_c += (float)Math.PI * field_21079_m * 1.5F;
            field_21089_a += ((-(float)Math.atan2(f1, motionY) * 180F) / (float)Math.PI - field_21089_a) * 0.1F;
        }
        else
        {
            tentacleAngle = MathHelper.abs(MathHelper.sin(field_21085_g)) * (float)Math.PI * 0.25F;

            if (!worldObj.isRemote)
            {
                motionX = 0.0D;
                motionY -= 0.080000000000000002D;
                motionY *= 0.98000001907348633D;
                motionZ = 0.0D;
            }

            field_21089_a = (float)((double)field_21089_a + (double)(-90F - field_21089_a) * 0.02D);
        }
    }

    /**
     * Moves the entity based on the specified heading.  Args: strafe, forward
     */
    public void moveEntityWithHeading(float f, float f1)
    {
        moveEntity(motionX, motionY, motionZ);
    }

    public void updateEntityActionState()
    {
        entityAge++;

        if (entityAge > 100)
        {
            randomMotionVecX = randomMotionVecY = randomMotionVecZ = 0.0F;
        }
        else if (rand.nextInt(50) == 0 || !inWater || randomMotionVecX == 0.0F && randomMotionVecY == 0.0F && randomMotionVecZ == 0.0F)
        {
            float f = rand.nextFloat() * (float)Math.PI * 2.0F;
            randomMotionVecX = MathHelper.cos(f) * 0.2F;
            randomMotionVecY = -0.1F + rand.nextFloat() * 0.2F;
            randomMotionVecZ = MathHelper.sin(f) * 0.2F;
        }

        despawnEntity();
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    {
        return posY > 45D && posY < 63D && super.getCanSpawnHere();
    }
}
