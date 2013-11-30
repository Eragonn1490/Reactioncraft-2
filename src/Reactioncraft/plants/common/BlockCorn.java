package Reactioncraft.plants.common;

import java.util.ArrayList;
import java.util.Random;
import Reactioncraft.integration.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;

public class BlockCorn extends Block
{
	//private static final int GROWTH_TIME = 10;

	public BlockCorn(int i, int j)
	{
		super(i, Material.plants);
		float f = 0.375F;
		setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
		this.setTickRandomly(true);
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("reactioncraft:tallcorn");
	}

	public Icon getBlockblockIcon(IBlockAccess world, int x, int y, int z, int blockSide)
	{
		return this.blockIcon;
	}

	public int idDropped(int var1, int var2, Random var3)
	{
		return IntegratedItems.Wrappedcorn.itemID;
	}

	@Override
	public int quantityDropped(Random random)
	{
		return -1;
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
			dropBlockAsItem_do(world, i, j, k, new ItemStack(IntegratedItems.Wrappedcorn, 1));
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

		if ((l == Block.grass.blockID) || (l == Block.tilledField.blockID)|| (l == Block.dirt.blockID) || (l == Block.gravel.blockID) || (l == IntegratedBlocks.DarkSand.blockID) || (l == this.blockID))
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
			if (l < 5)
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
				else if ((world.getBlockLightValue(i, j + 1, k) >= 9))
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

		if ((world.getBlockId(i, j - 1, k) == this.blockID))
		{
			toReturn = true;
		}
		else if (world.getBlockMaterial(i - 1, j - 1, k) == Material.air)
		{
			toReturn = true;
		}
		else if (world.getBlockMaterial(i + 1, j - 1, k) == Material.air)
		{
			toReturn = true;
		}
		else if (world.getBlockMaterial(i, j - 1, k - 1) == Material.air)
		{
			toReturn = true;
		}
		else if (world.getBlockMaterial(i, j - 1, k + 1) == Material.air)
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
	
	@Override
	public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
	{
	         ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
	         for(int i = 0; 0 < world.rand.nextInt(3); i++)
	                 ret.add(new ItemStack(IntegratedItems.Wrappedcorn, 1, 0));
	         return ret;
	}
}