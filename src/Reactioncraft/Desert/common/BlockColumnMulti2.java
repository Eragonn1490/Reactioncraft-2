package Reactioncraft.desert.common;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import Reactioncraft.basemod.RCB;
import Reactioncraft.integration.*;

public class BlockColumnMulti2 extends BlockColumnMulti
{
	private Icon[][] iconBuffer;

	public BlockColumnMulti2(int i, Material material)
	{
		super(i, material);
		float f = 0.2F;
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
	public boolean isOpaqueCube()
	{
		return false;
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
			return IntegratedBlocks.ColumnMulti2.blockID;

		case 1:
			return IntegratedBlocks.ColumnMulti2.blockID;

		case 2:
			return IntegratedBlocks.ColumnMulti2.blockID;

		case 3:
			return IntegratedBlocks.ColumnMulti2.blockID;

		case 4:
			return IntegratedBlocks.ColumnMulti2.blockID;

		case 5:
			return IntegratedBlocks.ColumnMulti2.blockID;

		case 6:
			return IntegratedBlocks.ColumnMulti2.blockID;
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
		case 9:return 9;
		}
	}

	 @Override
	 public void registerIcons(IconRegister par1IconRegister)
	 {
		 iconBuffer = new Icon[16][12]; // 3 machines, 6 sides each, in ON and OFF states

		 // meta 0, Carved Dark Stone Column
		 iconBuffer[0][0] = par1IconRegister.registerIcon("reactioncraft:SandBrick"); // bottom
		 iconBuffer[0][1] = par1IconRegister.registerIcon("reactioncraft:SandBrick"); // top
		 iconBuffer[0][2] = par1IconRegister.registerIcon("reactioncraft:SandBrick"); // north
		 iconBuffer[0][3] = par1IconRegister.registerIcon("reactioncraft:SandBrick"); // east
		 iconBuffer[0][4] = par1IconRegister.registerIcon("reactioncraft:SandBrick"); // south
		 iconBuffer[0][5] = par1IconRegister.registerIcon("reactioncraft:SandBrick"); // west

		 // meta 1, Marble Column
		 iconBuffer[1][0] = par1IconRegister.registerIcon("reactioncraft:Chiseled1"); // bottom
		 iconBuffer[1][1] = par1IconRegister.registerIcon("reactioncraft:Chiseled1"); // top
		 iconBuffer[1][2] = par1IconRegister.registerIcon("reactioncraft:Chiseled1"); // north
		 iconBuffer[1][3] = par1IconRegister.registerIcon("reactioncraft:Chiseled1"); // east
		 iconBuffer[1][4] = par1IconRegister.registerIcon("reactioncraft:Chiseled1"); // south
		 iconBuffer[1][5] = par1IconRegister.registerIcon("reactioncraft:Chiseled1"); // west

		 // meta 2, Bloodstone Brick Column
		 iconBuffer[2][0] = par1IconRegister.registerIcon("reactioncraft:BloodStoneBrick"); // bottom
		 iconBuffer[2][1] = par1IconRegister.registerIcon("reactioncraft:BloodStoneBrick"); // top
		 iconBuffer[2][2] = par1IconRegister.registerIcon("reactioncraft:BloodStoneBrick"); // north
		 iconBuffer[2][3] = par1IconRegister.registerIcon("reactioncraft:BloodStoneBrick"); // east
		 iconBuffer[2][4] = par1IconRegister.registerIcon("reactioncraft:BloodStoneBrick"); // south
		 iconBuffer[2][5] = par1IconRegister.registerIcon("reactioncraft:BloodStoneBrick"); // west

		 // meta 3, Stone Column
		 iconBuffer[3][0] = par1IconRegister.registerIcon("reactioncraft:Stone"); // bottom
		 iconBuffer[3][1] = par1IconRegister.registerIcon("reactioncraft:Stone"); // top
		 iconBuffer[3][2] = par1IconRegister.registerIcon("reactioncraft:Stone"); // north
		 iconBuffer[3][3] = par1IconRegister.registerIcon("reactioncraft:Stone"); // east
		 iconBuffer[3][4] = par1IconRegister.registerIcon("reactioncraft:Stone"); // south
		 iconBuffer[3][5] = par1IconRegister.registerIcon("reactioncraft:Stone"); // west

		 // meta 4, Cobblestone Column
		 iconBuffer[4][0] = par1IconRegister.registerIcon("reactioncraft:CobbleStone"); // bottom
		 iconBuffer[4][1] = par1IconRegister.registerIcon("reactioncraft:CobbleStone"); // top
		 iconBuffer[4][2] = par1IconRegister.registerIcon("reactioncraft:CobbleStone"); // north
		 iconBuffer[4][3] = par1IconRegister.registerIcon("reactioncraft:CobbleStone"); // east
		 iconBuffer[4][4] = par1IconRegister.registerIcon("reactioncraft:CobbleStone"); // south
		 iconBuffer[4][5] = par1IconRegister.registerIcon("reactioncraft:CobbleStone"); // west

		 // meta 5, Gold Column
		 iconBuffer[5][0] = par1IconRegister.registerIcon("reactioncraft:gold"); // bottom
		 iconBuffer[5][1] = par1IconRegister.registerIcon("reactioncraft:gold"); // top
		 iconBuffer[5][2] = par1IconRegister.registerIcon("reactioncraft:gold"); // north
		 iconBuffer[5][3] = par1IconRegister.registerIcon("reactioncraft:gold"); // east
		 iconBuffer[5][4] = par1IconRegister.registerIcon("reactioncraft:gold"); // south
		 iconBuffer[5][5] = par1IconRegister.registerIcon("reactioncraft:gold"); // west

		 // meta 6, Diamond Column
		 iconBuffer[6][0] = par1IconRegister.registerIcon("reactioncraft:diamond"); // bottom
		 iconBuffer[6][1] = par1IconRegister.registerIcon("reactioncraft:diamond"); // top
		 iconBuffer[6][2] = par1IconRegister.registerIcon("reactioncraft:diamond"); // north
		 iconBuffer[6][3] = par1IconRegister.registerIcon("reactioncraft:diamond"); // east
		 iconBuffer[6][4] = par1IconRegister.registerIcon("reactioncraft:diamond"); // south
		 iconBuffer[6][5] = par1IconRegister.registerIcon("reactioncraft:diamond"); // west

		 // meta 7, Stone Brick Column
		 iconBuffer[7][0] = par1IconRegister.registerIcon("reactioncraft:stonebricksmooth"); // bottom
		 iconBuffer[7][1] = par1IconRegister.registerIcon("reactioncraft:stonebricksmooth"); // top
		 iconBuffer[7][2] = par1IconRegister.registerIcon("reactioncraft:stonebricksmooth"); // north
		 iconBuffer[7][3] = par1IconRegister.registerIcon("reactioncraft:stonebricksmooth"); // east
		 iconBuffer[7][4] = par1IconRegister.registerIcon("reactioncraft:stonebricksmooth"); // south
		 iconBuffer[7][5] = par1IconRegister.registerIcon("reactioncraft:stonebricksmooth"); // west

		 // meta 7, Limestone Brick Column
		 iconBuffer[8][0] = par1IconRegister.registerIcon("reactioncraft:Quartz"); // bottom
		 iconBuffer[8][1] = par1IconRegister.registerIcon("reactioncraft:Quartz"); // top
		 iconBuffer[8][2] = par1IconRegister.registerIcon("reactioncraft:Quartz"); // north
		 iconBuffer[8][3] = par1IconRegister.registerIcon("reactioncraft:Quartz"); // east
		 iconBuffer[8][4] = par1IconRegister.registerIcon("reactioncraft:Quartz"); // south
		 iconBuffer[8][5] = par1IconRegister.registerIcon("reactioncraft:Quartz"); // west

		 // meta 9, Carved Dark Stone Column
		 iconBuffer[9][0] = par1IconRegister.registerIcon("reactioncraft:css"); // bottom
		 iconBuffer[9][1] = par1IconRegister.registerIcon("reactioncraft:css"); // top
		 iconBuffer[9][2] = par1IconRegister.registerIcon("reactioncraft:css"); // north
		 iconBuffer[9][3] = par1IconRegister.registerIcon("reactioncraft:css"); // east
		 iconBuffer[9][4] = par1IconRegister.registerIcon("reactioncraft:css"); // south
		 iconBuffer[9][5] = par1IconRegister.registerIcon("reactioncraft:css"); // west
	 }

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
		 list.add(new ItemStack(i,1,9));
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
			 return id == Block.fence.blockID || id == Block.netherFence.blockID || id == Block.glass.blockID || id == Block.cobblestoneWall.blockID || id == IntegratedBlocks.ColumnMulti.blockID || id == IntegratedBlocks.ColumnMulti2.blockID;
		 }
	 }
}
