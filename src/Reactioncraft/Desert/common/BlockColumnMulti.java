package Reactioncraft.desert.common;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import Reactioncraft.basemod.RCB;
import Reactioncraft.desert.RCBDM;

public class BlockColumnMulti extends Block
{
	private Icon[][] iconBuffer;

	public BlockColumnMulti(int i, Material material)
	{
		super(i, material);
		float f = 0.375F;
		this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
		this.setCreativeTab(RCB.Reactioncraft);
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	 */
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	/**
	 * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
	 * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
	 */
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public float getBlockHardness(World par1World, int par2, int par3, int par4)
	{
		par1World.getBlockMetadata(par2, par3, par4);

		if(par1World.getBlockMetadata(par2, par3, par4) == 1)
		{
			return 3.0F;
		}

		if(par1World.getBlockMetadata(par2, par3, par4) == 2)
		{
			return 120.0F;
		}

		if(par1World.getBlockMetadata(par2, par3, par4) == 3)
		{
			return 1.5F;
		}

		if(par1World.getBlockMetadata(par2, par3, par4) == 4)
		{
			return 2.0F;
		}

		if(par1World.getBlockMetadata(par2, par3, par4) == 5)
		{
			return 3.0F;
		}

		if(par1World.getBlockMetadata(par2, par3, par4) == 6)
		{
			return 0.8F;
		}

		else
		{
			return 3.0F;
		}
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	 @Override
	 public int idDropped(int i, Random random, int j)
	{
		switch (i)
		{
		default:
			return RCBDM.ColumnMulti.blockID;

		case 1:
			return RCBDM.ColumnMulti.blockID;

		case 2:
			return RCBDM.ColumnMulti.blockID;

		case 3:
			return RCBDM.ColumnMulti.blockID;

		case 4:
			return RCBDM.ColumnMulti.blockID;

		case 5:
			return RCBDM.ColumnMulti.blockID;

		case 6:
			return RCBDM.ColumnMulti.blockID;
		}
	}

	 public int quantityDropped(int i, int j, Random random)
	 {
		 switch (i)
		 {
		 default:
			 return 1;

		 case 1:
			 return 1;

		 case 2:
			 return 1;

		 case 3:
			 return 1;

		 case 4:
			 return 1;

		 case 5:
			 return 1;

		 case 6:
			 return 1;
		 }
	 }

	 /**
	  * Determines the damage on the item the block drops. Used in cloth and wood.
	  */
	  public int damageDropped(int i)
	 {
		 switch (i)
		 {
		 default:return 0;
		 case 1:return 1;
		 case 2:return 2;
		 case 3:return 4;
		 case 4:return 4;
		 case 5:return 5;
		 case 6:return 6;
		 case 7:return 7;
		 case 8:return 8;
		 }
	 }

	  @Override
	  public void registerIcons(IconRegister par1IconRegister)
	  {
		  iconBuffer = new Icon[16][12]; // 3 machines, 6 sides each, in ON and OFF states

		  // meta 0, Carved Dark Stone Column
		  iconBuffer[0][0] = par1IconRegister.registerIcon("rcbdm:css"); // bottom
		  iconBuffer[0][1] = par1IconRegister.registerIcon("rcbdm:css"); // top
		  iconBuffer[0][2] = par1IconRegister.registerIcon("rcbdm:css"); // north
		  iconBuffer[0][3] = par1IconRegister.registerIcon("rcbdm:css"); // east
		  iconBuffer[0][4] = par1IconRegister.registerIcon("rcbdm:css"); // south
		  iconBuffer[0][5] = par1IconRegister.registerIcon("rcbdm:css"); // west

		  // meta 1, Marble Column
		  iconBuffer[1][0] = par1IconRegister.registerIcon("rcbdm:Chiseled1"); // bottom
		  iconBuffer[1][1] = par1IconRegister.registerIcon("rcbdm:Chiseled1"); // top
		  iconBuffer[1][2] = par1IconRegister.registerIcon("rcbdm:Chiseled1"); // north
		  iconBuffer[1][3] = par1IconRegister.registerIcon("rcbdm:Chiseled1"); // east
		  iconBuffer[1][4] = par1IconRegister.registerIcon("rcbdm:Chiseled1"); // south
		  iconBuffer[1][5] = par1IconRegister.registerIcon("rcbdm:Chiseled1"); // west

		  // meta 2, Bloodstone Brick Column
		  iconBuffer[2][0] = par1IconRegister.registerIcon("rcbdm:BloodStoneBrick"); // bottom
		  iconBuffer[2][1] = par1IconRegister.registerIcon("rcbdm:BloodStoneBrick"); // top
		  iconBuffer[2][2] = par1IconRegister.registerIcon("rcbdm:BloodStoneBrick"); // north
		  iconBuffer[2][3] = par1IconRegister.registerIcon("rcbdm:BloodStoneBrick"); // east
		  iconBuffer[2][4] = par1IconRegister.registerIcon("rcbdm:BloodStoneBrick"); // south
		  iconBuffer[2][5] = par1IconRegister.registerIcon("rcbdm:BloodStoneBrick"); // west

		  // meta 3, Stone Column
		  iconBuffer[3][0] = par1IconRegister.registerIcon("rcbdm:Stone"); // bottom
		  iconBuffer[3][1] = par1IconRegister.registerIcon("rcbdm:Stone"); // top
		  iconBuffer[3][2] = par1IconRegister.registerIcon("rcbdm:Stone"); // north
		  iconBuffer[3][3] = par1IconRegister.registerIcon("rcbdm:Stone"); // east
		  iconBuffer[3][4] = par1IconRegister.registerIcon("rcbdm:Stone"); // south
		  iconBuffer[3][5] = par1IconRegister.registerIcon("rcbdm:Stone"); // west

		  // meta 4, Cobblestone Column
		  iconBuffer[4][0] = par1IconRegister.registerIcon("rcbdm:CobbleStone"); // bottom
		  iconBuffer[4][1] = par1IconRegister.registerIcon("rcbdm:CobbleStone"); // top
		  iconBuffer[4][2] = par1IconRegister.registerIcon("rcbdm:CobbleStone"); // north
		  iconBuffer[4][3] = par1IconRegister.registerIcon("rcbdm:CobbleStone"); // east
		  iconBuffer[4][4] = par1IconRegister.registerIcon("rcbdm:CobbleStone"); // south
		  iconBuffer[4][5] = par1IconRegister.registerIcon("rcbdm:CobbleStone"); // west

		  // meta 5, Gold Column
		  iconBuffer[5][0] = par1IconRegister.registerIcon("rcbdm:gold"); // bottom
		  iconBuffer[5][1] = par1IconRegister.registerIcon("rcbdm:gold"); // top
		  iconBuffer[5][2] = par1IconRegister.registerIcon("rcbdm:gold"); // north
		  iconBuffer[5][3] = par1IconRegister.registerIcon("rcbdm:gold"); // east
		  iconBuffer[5][4] = par1IconRegister.registerIcon("rcbdm:gold"); // south
		  iconBuffer[5][5] = par1IconRegister.registerIcon("rcbdm:gold"); // west

		  // meta 6, Diamond Column
		  iconBuffer[6][0] = par1IconRegister.registerIcon("rcbdm:diamond"); // bottom
		  iconBuffer[6][1] = par1IconRegister.registerIcon("rcbdm:diamond"); // top
		  iconBuffer[6][2] = par1IconRegister.registerIcon("rcbdm:diamond"); // north
		  iconBuffer[6][3] = par1IconRegister.registerIcon("rcbdm:diamond"); // east
		  iconBuffer[6][4] = par1IconRegister.registerIcon("rcbdm:diamond"); // south
		  iconBuffer[6][5] = par1IconRegister.registerIcon("rcbdm:diamond"); // west

		  // meta 7, Stone Brick Column
		  iconBuffer[7][0] = par1IconRegister.registerIcon("rcbdm:stonebricksmooth"); // bottom
		  iconBuffer[7][1] = par1IconRegister.registerIcon("rcbdm:stonebricksmooth"); // top
		  iconBuffer[7][2] = par1IconRegister.registerIcon("rcbdm:stonebricksmooth"); // north
		  iconBuffer[7][3] = par1IconRegister.registerIcon("rcbdm:stonebricksmooth"); // east
		  iconBuffer[7][4] = par1IconRegister.registerIcon("rcbdm:stonebricksmooth"); // south
		  iconBuffer[7][5] = par1IconRegister.registerIcon("rcbdm:stonebricksmooth"); // west

		  // meta 7, Limestone Brick Column
		  iconBuffer[8][0] = par1IconRegister.registerIcon("rcbdm:Quartz"); // bottom
		  iconBuffer[8][1] = par1IconRegister.registerIcon("rcbdm:Quartz"); // top
		  iconBuffer[8][2] = par1IconRegister.registerIcon("rcbdm:Quartz"); // north
		  iconBuffer[8][3] = par1IconRegister.registerIcon("rcbdm:Quartz"); // east
		  iconBuffer[8][4] = par1IconRegister.registerIcon("rcbdm:Quartz"); // south
		  iconBuffer[8][5] = par1IconRegister.registerIcon("rcbdm:Quartz"); // west
	  }

	  @Override
	  public void getSubBlocks(int i,CreativeTabs tab, List list)
	  {
		  list.add(new ItemStack(i,1,0));
		  list.add(new ItemStack(i,1,1));
		  list.add(new ItemStack(i,1,2));
		  list.add(new ItemStack(i,1,3));
		  list.add(new ItemStack(i,1,4));
		  list.add(new ItemStack(i,1,5));
		  list.add(new ItemStack(i,1,6));
		  list.add(new ItemStack(i,1,7));
		  list.add(new ItemStack(i,1,8));
		  //    	list.add(new ItemStack(i,1,9));
		  //    	list.add(new ItemStack(i,1,10));
		  //    	list.add(new ItemStack(i,1,11));
		  //    	list.add(new ItemStack(i,1,12));
		  //    	list.add(new ItemStack(i,1,13));
		  //    	list.add(new ItemStack(i,1,14));
		  //    	list.add(new ItemStack(i,1,15));
	  }

	  public Icon getBlockTexture(IBlockAccess world, int x, int y, int z, int blockMeta, int blockSide)
	  {
		  return iconBuffer[blockMeta][blockSide];
	  }

	  @Override
	  public Icon getIcon(int blockSide, int blockMeta)
	  {
		  return iconBuffer[blockMeta][blockSide];
	  }

	  /**
	   * Determines if a torch can be placed on the top surface of this block.
	   * Useful for creating your own block that torches can be on, such as fences.
	   *
	   * @param world The current world
	   * @param x X Position
	   * @param y Y Position
	   * @param z Z Position
	   * @return True to allow the torch to be placed
	   */
	  public boolean canPlaceTorchOnTop(World world, int x, int y, int z)
	  {
		  if (world.doesBlockHaveSolidTopSurface(x, y, z))
		  {
			  return true;
		  }
		  else
		  {
			  int id = world.getBlockId(x, y, z);
			  return id == Block.fence.blockID || id == Block.netherFence.blockID || id == Block.glass.blockID || id == Block.cobblestoneWall.blockID || id == RCBDM.ColumnMulti.blockID || id == RCBDM.ColumnMulti2.blockID;
		  }
	  }
}
