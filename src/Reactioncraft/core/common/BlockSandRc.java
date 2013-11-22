package Reactioncraft.core.common;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityFallingSand;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import Reactioncraft.basemod.RCB;
import Reactioncraft.integration.*;

public class BlockSandRc extends BlockSand
{
    /** Do blocks fall instantly to where they stop or do they fall over time */
    public static boolean fallInstantly = false;

    public BlockSandRc(int par1)
    {
        super(par1, Material.sand);
        this.setCreativeTab(RCB.Reactioncraft);
        this.setTickRandomly(true);
    }
    
    /**
     * How many world ticks before ticking
     */
    @Override
    public int tickRate(World par1World)
    {
        return 30;
    }
    
    @Override
    public boolean getBlocksMovement(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        return !this.blockMaterial.blocksMovement();
    }


    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    @Override
    public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, this.tickRate(par1World));
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    @Override
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, this.tickRate(par1World));
    }

    /**
     * Ticks the block if it's been scheduled
     */
    @Override
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            this.tryToFall(par1World, par2, par3, par4);
        }
    }

    /**
     * If there is space to fall below will start this block falling
     */
    private void tryToFall(World par1World, int par2, int par3, int par4)
    {
        if (canFallBelow(par1World, par2, par3 - 1, par4) && par3 >= 0)
        {
            byte b0 = 32;

            if (!fallInstantly && par1World.checkChunksExist(par2 - b0, par3 - b0, par4 - b0, par2 + b0, par3 + b0, par4 + b0))
            {
                if (!par1World.isRemote)
                {
                    EntityFallingSand entityfallingsand = new EntityFallingSand(par1World, (double)((float)par2 + 0.5F), (double)((float)par3 + 0.5F), (double)((float)par4 + 0.5F), this.blockID, par1World.getBlockMetadata(par2, par3, par4));
                    this.onStartFalling(entityfallingsand);
                    par1World.spawnEntityInWorld(entityfallingsand);
                }
            }
            else
            {
                par1World.setBlockToAir(par2, par3, par4);

                while (canFallBelow(par1World, par2, par3 - 1, par4) && par3 > 0)
                {
                    --par3;
                }

                if (par3 > 0)
                {
                    par1World.setBlock(par2, par3, par4, this.blockID);
                }
            }
        }
    }

    /**
     * Called when the falling block entity for this block is created
     */
    @Override
    public void onStartFalling(EntityFallingSand par1EntityFallingSand) {}

    /**
     * Checks to see if the sand can fall into the block below it
     */
    public static boolean canFallBelow(World par0World, int par1, int par2, int par3)
    {
        int l = par0World.getBlockId(par1, par2, par3);

        if (l == 0)
        {
            return true;
        }
        else if (l == Block.fire.blockID)
        {
            return true;
        }
        else
        {
            Material material = Block.blocksList[l].blockMaterial;
            return material == Material.water ? true : material == Material.lava;
        }
    }
    
    /**
     * Determines if the current block is replaceable by Ore veins during world generation.
     *
     * @param world The current world
     * @param x X Position
     * @param y Y Position
     * @param z Z Position
     * @param target The generic target block the gen is looking for, Standards define stone
     *      for overworld generation, and neatherack for the nether.
     * @return True to allow this block to be replaced by a ore
     */
    public boolean isGenMineableReplaceable(World world, int x, int y, int z, int target)
    {
        return IntegratedBlocks.DarkSand.blockID == target;
    }

    /**
     * Called when the falling block entity for this block hits the ground and turns back into a block
     */
    public void onFinishFalling(World par1World, int par2, int par3, int par4, int par5) {}
}
