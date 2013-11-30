package Reactioncraft.plants.common;

import java.util.Random;
import Reactioncraft.integration.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;

public class BlockReed1 extends Block
{
	private static final int GROWTH_TIME = 10;

	public BlockReed1(int i, int j)
	{
		super(i, Material.plants);
		float f = 0.375F;
		this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
		this.setTickRandomly(true);
	}
	
	/**
     * How many world ticks before ticking
     */
    @Override
    public int tickRate(World par1World)
    {
        return 15;
    }
	
	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("reactioncraft:sugarcane");
	}

	public Icon getBlockblockIcon(IBlockAccess world, int x, int y, int z, int blockSide)
	{
		return this.blockIcon;
	}

	@Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
       
            int w = par2Random.nextInt(60);
            if (w == 0)
            {
                return Item.reed.itemID;
            }
            if (w == 15)
            {
                return Item.reed.itemID;
            }
            if (w == 20)
            {
                return Item.reed.itemID;
            }
            if (w == 35)
            {
                return Item.reed.itemID;
            }
            if (w == 40)
            {
                return  IntegratedItems.sugarcaneItem.itemID;
            }
            if (w == 55)
            {
                return  IntegratedItems.sugarcaneItem.itemID;
            }
            if (w == 60)
            {
                return  IntegratedItems.sugarcaneItem.itemID;
            }
            else
            {
                return Item.reed.itemID;
            }         
    }
	
	@Override
	public int quantityDropped(Random random)
	{
		return 1;
	}
	
	@Override
	public void onNeighborBlockChange(World world, int i, int j, int k, int l)
	{
		checkBlockCoordValid(world, i, j, k);
	}
	
	protected final void checkBlockCoordValid(World world, int i, int j, int k)
	{
		if (!canBlockStay(world, i, j, k))
		{
			dropBlockAsItem_do(world, i, j, k, new ItemStack(Item.reed, 1));
			world.setBlock(i, j, k, 0, 0, 2);
		}
	}
	
	@Override
	public boolean canBlockStay(World world, int i, int j, int k)
	{
		return canPlaceBlockAt(world, i, j, k);
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
	{
		return null;
	}
	
	@Override
	public boolean canPlaceBlockAt(World world, int i, int j, int k)
	{
		boolean toReturn = false;
		int l = world.getBlockId(i, j - 1, k);

		if ((l == Block.grass.blockID) || (l == Block.dirt.blockID) || (l == Block.gravel.blockID) || (l == Block.sand.blockID) || (l == IntegratedBlocks.DarkSand.blockID) || (l == this.blockID))
		{
			toReturn = true;
		}

		return toReturn;
	}
	
	@Override
	public void updateTick(World world, int i, int j, int k, Random random)
	{
		int l = world.getBlockId(i, j - 1, k);
		
		if (world.isAirBlock(i, j + 1, k))
		{
			for (l = 1; world.getBlockId(i, j - l, k) == this.blockID; l++);
			if (l < 13)
			{
				int i1 = world.getBlockMetadata(i, j, k);
				if (i1 == 15)
				{
					world.setBlock(i, j + 1, k, this.blockID, 0, 2);
					world.setBlockMetadataWithNotify(i, j, k, 0, 2);
				}
				else if ((world.getBlockLightValue(i, j + 1, k) >= 9) && (nearWater(world, i, j, k)))
				{
					world.setBlockMetadataWithNotify(i, j, k, i1 + 1, 2);
				}
			}
		}
	}

	public boolean nearWater(World world, int i, int j, int k)
	{
		boolean toReturn = false;

		if ((world.getBlockId(i, j - 1, k) == this.blockID) && (nearWater(world, i, j - 1, k)))
		{
			toReturn = true;
		}
		else if (world.getBlockMaterial(i - 1, j - 1, k) == Material.water)
		{
			toReturn = true;
		}
		else if (world.getBlockMaterial(i + 1, j - 1, k) == Material.water)
		{
			toReturn = true;
		}
		else if (world.getBlockMaterial(i, j - 1, k - 1) == Material.water)
		{
			toReturn = true;
		}
		else if (world.getBlockMaterial(i, j - 1, k + 1) == Material.water)
		{
			toReturn = true;
		}

		return toReturn;
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	
	@Override
	public int getRenderType()
	{
		return 1;
	}
}