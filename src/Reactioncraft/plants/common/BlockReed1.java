package Reactioncraft.plants.common;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Reactioncraft.core.RCC;
import Reactioncraft.plants.RCPM;
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
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;

public class BlockReed1 extends Block
{
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
		return RCPM.sugarcaneItem.itemID;
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
	
	/**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (par1World.isAirBlock(par2, par3 + 1, par4))
        {
            int l;

            for (l = 1; par1World.getBlockId(par2, par3 - l, par4) == this.blockID; ++l)
            {
                ;
            }

            if (l < 3)
            {
                int i1 = par1World.getBlockMetadata(par2, par3, par4);

                if (i1 == 15)
                {
                    par1World.setBlock(par2, par3 + 1, par4, this.blockID);
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, 0, 4);
                }
                else
                {
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, i1 + 1, 4);
                }
            }
        }
    }
    
    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
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

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        this.checkBlockCoordValid(par1World, par2, par3, par4);
    }

    /**
     * Checks if current block pos is valid, if not, breaks the block as dropable item. Used for reed and cactus.
     */
    protected final void checkBlockCoordValid(World par1World, int par2, int par3, int par4)
    {
        if (!this.canBlockStay(par1World, par2, par3, par4))
        {
            this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
            par1World.setBlockToAir(par2, par3, par4);
        }
    }

    /**
     * Can this block stay at this position.  Similar to canPlaceBlockAt except gets checked often with plants.
     */
    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        return this.canPlaceBlockAt(par1World, par2, par3, par4);
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }

    @SideOnly(Side.CLIENT)

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return Item.reed.itemID;
    }

    public EnumPlantType getPlantType(World world, int x, int y, int z)
    {
        return EnumPlantType.Beach;
    }

    public int getPlantID(World world, int x, int y, int z)
    {
        return blockID;
    }

    public int getPlantMetadata(World world, int x, int y, int z)
    {
        return world.getBlockMetadata(x, y, z);
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