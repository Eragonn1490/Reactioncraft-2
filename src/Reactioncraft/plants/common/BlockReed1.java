package Reactioncraft.plants.common;

import java.util.Random;
import Reactioncraft.core.RCC;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockReed1 extends Block
{
	private static final int GROWTH_TIME = 15;

	public BlockReed1(int i, int j)
	{
		super(i, Material.plants);
		float f = 0.375F;
		setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
		setTickRandomly(true);
	}

	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("RCPM:sugarcane");
	}

	public Icon getBlockblockIcon(IBlockAccess world, int x, int y, int z, int blockSide)
	{
		return this.blockIcon;
	}

	public int idDropped(int i, int j, Random random)
	{
		return Item.reed.itemID;
	}

	public int idDropped(int i, Random random)
	{
		return Item.reed.itemID;
	}

	public int idDropped(int i, Random random, int j)
	{
		return Item.reed.itemID;
	}

	public int quantityDropped(Random random)
	{
		return 1;
	}

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

	public boolean canBlockStay(World world, int i, int j, int k)
	{
		return canPlaceBlockAt(world, i, j, k);
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
	{
		return null;
	}

	public boolean canPlaceBlockAt(World world, int i, int j, int k)
	{
		boolean toReturn = false;
		int l = world.getBlockId(i, j - 1, k);

		if ((l == Block.grass.blockID) || (l == Block.dirt.blockID) || (l == Block.gravel.blockID) || (l == Block.sand.blockID) || (l == RCC.DarkSand.blockID) || (l == this.blockID))
		{
			toReturn = true;
		}

		return toReturn;
	}

	public void updateTick(World world, int i, int j, int k, Random random)
	{
		if (world.isAirBlock(i, j + 1, k))
		{
			int l;
			for (l = 1; world.getBlockId(i, j - l, k) == this.blockID; l++);
			if (l < 12)
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

	public boolean isOpaqueCube()
	{
		return false;
	}

	public boolean renderAsNormalBlock()
	{
		return false;
	}

	public int getRenderType()
	{
		return 1;
	}
}