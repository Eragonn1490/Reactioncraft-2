package Reactioncraft.ore.common;

import java.util.List;
import java.util.Random;
import Reactioncraft.basemod.RCB;
import Reactioncraft.integration.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockNOMulti extends Block
{
	private Icon[][] iconBuffer;

	public BlockNOMulti(int i, Material material)
	{
		super(i, material);
		this.setCreativeTab(RCB.Reactioncraft);
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	public int idDropped(int i, Random random, int j)
	{
		switch (i)
		{
		case 0:
			return IntegratedBlocks.netherOres.blockID;

		case 1:
			return IntegratedBlocks.netherOres.blockID;

		case 2:
			return IntegratedBlocks.netherOres.blockID;

		case 3:
			return IntegratedBlocks.netherOres.blockID;

		case 4:
			return IntegratedBlocks.netherOres.blockID;

		case 5:
			return IntegratedBlocks.netherOres.blockID;

		case 6:
			return IntegratedBlocks.netherOres.blockID;

		case 7:
			return IntegratedBlocks.netherOres.blockID;

		case 8:
			return IntegratedBlocks.netherOres.blockID;

		case 9:
			return IntegratedBlocks.netherOres.blockID;

		case 10:
			return IntegratedBlocks.netherOres.blockID;

		case 11:
			return IntegratedBlocks.netherOres.blockID;

		case 12:
			return IntegratedBlocks.netherOres.blockID;

		case 13:
			return IntegratedBlocks.netherOres.blockID;

		case 14:
			return IntegratedBlocks.netherOres.blockID;

		case 15:
			return IntegratedBlocks.netherOres.blockID;
		}

		return IntegratedBlocks.netherOres.blockID;
	}

	public int quantityDropped(int i, int j, Random random)
	{
		switch (i)
		{
		case 0:
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

		case 7:
			return 1;

		case 8:
			return 1;

		case 9:
			return 1;

		case 10:
			return 1;

		case 11:
			return 1;

		case 12:
			return 1;

		case 13:
			return 1;

		case 14:
			return 1;

		case 15:
			return 1;
		}

		return 1;
	}

	/**
	 * Determines the damage on the item the block drops. Used in cloth and wood.
	 */
	public int damageDropped(int i)
	{
		switch (i)
		{
		case 0:
			return 0;

		case 1:
			return 1;

		case 2:
			return 2;

		case 3:
			return 3;

		case 4:
			return 4;

		case 5:
			return 5;

		case 6:
			return 6;

		case 7:
			return 7;

		case 8:
			return 8;

		case 9:
			return 9;

		case 10:
			return 10;

		case 11:
			return 11;

		case 12:
			return 12;

		case 13:
			return 13;

		case 14:
			return 14;

		case 15:
			return 15;
		}

		return 0;
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		iconBuffer = new Icon[16][12]; // 3 machines, 6 sides each, in ON and OFF states

		// meta 0, Bloodstone
		iconBuffer[0][0] = par1IconRegister.registerIcon("RCORES:NetherStone"); // bottom
		iconBuffer[0][1] = par1IconRegister.registerIcon("RCORES:NetherStone"); // top
		iconBuffer[0][2] = par1IconRegister.registerIcon("RCORES:NetherStone"); // north
		iconBuffer[0][3] = par1IconRegister.registerIcon("RCORES:NetherStone"); // east
		iconBuffer[0][4] = par1IconRegister.registerIcon("RCORES:NetherStone"); // south
		iconBuffer[0][5] = par1IconRegister.registerIcon("RCORES:NetherStone"); // west

		// meta 1, Black Diamond
		iconBuffer[1][0] = par1IconRegister.registerIcon("RCORES:NetherBlackDiamond"); // bottom
		iconBuffer[1][1] = par1IconRegister.registerIcon("RCORES:NetherBlackDiamond"); // top
		iconBuffer[1][2] = par1IconRegister.registerIcon("RCORES:NetherBlackDiamond"); // north
		iconBuffer[1][3] = par1IconRegister.registerIcon("RCORES:NetherBlackDiamond"); // east
		iconBuffer[1][4] = par1IconRegister.registerIcon("RCORES:NetherBlackDiamond"); // south
		iconBuffer[1][5] = par1IconRegister.registerIcon("RCORES:NetherBlackDiamond"); // west

		// meta 2, Dragonstone
		iconBuffer[2][0] = par1IconRegister.registerIcon("RCORES:NetherDragonstone"); // bottom
		iconBuffer[2][1] = par1IconRegister.registerIcon("RCORES:NetherDragonstone"); // top
		iconBuffer[2][2] = par1IconRegister.registerIcon("RCORES:NetherDragonstone"); // north
		iconBuffer[2][3] = par1IconRegister.registerIcon("RCORES:NetherDragonstone"); // east
		iconBuffer[2][4] = par1IconRegister.registerIcon("RCORES:NetherDragonstone"); // south
		iconBuffer[2][5] = par1IconRegister.registerIcon("RCORES:NetherDragonstone"); // west

		// meta 3, Diamond
		iconBuffer[3][0] = par1IconRegister.registerIcon("RCORES:NetherDimeOre"); // bottom
		iconBuffer[3][1] = par1IconRegister.registerIcon("RCORES:NetherDimeOre"); // top
		iconBuffer[3][2] = par1IconRegister.registerIcon("RCORES:NetherDimeOre"); // north
		iconBuffer[3][3] = par1IconRegister.registerIcon("RCORES:NetherDimeOre"); // east
		iconBuffer[3][4] = par1IconRegister.registerIcon("RCORES:NetherDimeOre"); // south
		iconBuffer[3][5] = par1IconRegister.registerIcon("RCORES:NetherDimeOre"); // west

		// meta 4, Gold
		iconBuffer[4][0] = par1IconRegister.registerIcon("RCORES:NetherGoldOre1"); // bottom
		iconBuffer[4][1] = par1IconRegister.registerIcon("RCORES:NetherGoldOre1"); // top
		iconBuffer[4][2] = par1IconRegister.registerIcon("RCORES:NetherGoldOre1"); // north
		iconBuffer[4][3] = par1IconRegister.registerIcon("RCORES:NetherGoldOre1"); // east
		iconBuffer[4][4] = par1IconRegister.registerIcon("RCORES:NetherGoldOre1"); // south
		iconBuffer[4][5] = par1IconRegister.registerIcon("RCORES:NetherGoldOre1"); // west

		//		 //below here not used yet!
		//		 // meta 0, Empty Bookshelf
		//		 iconBuffer[5][0] = par1IconRegister.registerIcon("reactioncraft:cyanglass"); // bottom
		//		 iconBuffer[5][1] = par1IconRegister.registerIcon("reactioncraft:cyanglass"); // top
		//		 iconBuffer[5][2] = par1IconRegister.registerIcon("reactioncraft:cyanglass"); // north
		//		 iconBuffer[5][3] = par1IconRegister.registerIcon("reactioncraft:cyanglass"); // east
		//		 iconBuffer[5][4] = par1IconRegister.registerIcon("reactioncraft:cyanglass"); // south
		//		 iconBuffer[5][5] = par1IconRegister.registerIcon("reactioncraft:cyanglass"); // west
		//
		//		 // meta 0, Empty Bookshelf
		//		 iconBuffer[6][0] = par1IconRegister.registerIcon("reactioncraft:GreyGlass"); // bottom
		//		 iconBuffer[6][1] = par1IconRegister.registerIcon("reactioncraft:GreyGlass"); // top
		//		 iconBuffer[6][2] = par1IconRegister.registerIcon("reactioncraft:GreyGlass"); // north
		//		 iconBuffer[6][3] = par1IconRegister.registerIcon("reactioncraft:GreyGlass"); // east
		//		 iconBuffer[6][4] = par1IconRegister.registerIcon("reactioncraft:GreyGlass"); // south
		//		 iconBuffer[6][5] = par1IconRegister.registerIcon("reactioncraft:GreyGlass"); // west
		//
		//		 // meta 0, Empty Bookshelf
		//		 iconBuffer[7][0] = par1IconRegister.registerIcon("reactioncraft:GreenGlass"); // bottom
		//		 iconBuffer[7][1] = par1IconRegister.registerIcon("reactioncraft:GreenGlass"); // top
		//		 iconBuffer[7][2] = par1IconRegister.registerIcon("reactioncraft:GreenGlass"); // north
		//		 iconBuffer[7][3] = par1IconRegister.registerIcon("reactioncraft:GreenGlass"); // east
		//		 iconBuffer[7][4] = par1IconRegister.registerIcon("reactioncraft:GreenGlass"); // south
		//		 iconBuffer[7][5] = par1IconRegister.registerIcon("reactioncraft:GreenGlass"); // west
		//
		//		 // meta 0, Empty Bookshelf
		//		 iconBuffer[8][0] = par1IconRegister.registerIcon("reactioncraft:NetherGoldOre1"); // bottom
		//		 iconBuffer[8][1] = par1IconRegister.registerIcon("reactioncraft:NetherGoldOre1"); // top
		//		 iconBuffer[8][2] = par1IconRegister.registerIcon("reactioncraft:NetherGoldOre1"); // north
		//		 iconBuffer[8][3] = par1IconRegister.registerIcon("reactioncraft:NetherGoldOre1"); // east
		//		 iconBuffer[8][4] = par1IconRegister.registerIcon("reactioncraft:NetherGoldOre1"); // south
		//		 iconBuffer[8][5] = par1IconRegister.registerIcon("reactioncraft:NetherGoldOre1"); // west
		//
		//		 // meta 0, Empty Bookshelf
		//		 iconBuffer[9][0] = par1IconRegister.registerIcon("reactioncraft:LightGreyGlass"); // bottom
		//		 iconBuffer[9][1] = par1IconRegister.registerIcon("reactioncraft:LightGreyGlass"); // top
		//		 iconBuffer[9][2] = par1IconRegister.registerIcon("reactioncraft:LightGreyGlass"); // north
		//		 iconBuffer[9][3] = par1IconRegister.registerIcon("reactioncraft:LightGreyGlass"); // east
		//		 iconBuffer[9][4] = par1IconRegister.registerIcon("reactioncraft:LightGreyGlass"); // south
		//		 iconBuffer[9][5] = par1IconRegister.registerIcon("reactioncraft:LightGreyGlass"); // west
		//
		//		 // meta 0, Empty Bookshelf
		//		 iconBuffer[10][0] = par1IconRegister.registerIcon("reactioncraft:limegreenglass"); // bottom
		//		 iconBuffer[10][1] = par1IconRegister.registerIcon("reactioncraft:limegreenglass"); // top
		//		 iconBuffer[10][2] = par1IconRegister.registerIcon("reactioncraft:limegreenglass"); // north
		//		 iconBuffer[10][3] = par1IconRegister.registerIcon("reactioncraft:limegreenglass"); // east
		//		 iconBuffer[10][4] = par1IconRegister.registerIcon("reactioncraft:limegreenglass"); // south
		//		 iconBuffer[10][5] = par1IconRegister.registerIcon("reactioncraft:limegreenglass"); // west
		//
		//		 // meta 0, Empty Bookshelf
		//		 iconBuffer[11][0] = par1IconRegister.registerIcon("reactioncraft:magentaglass"); // bottom
		//		 iconBuffer[11][1] = par1IconRegister.registerIcon("reactioncraft:magentaglass"); // top
		//		 iconBuffer[11][2] = par1IconRegister.registerIcon("reactioncraft:magentaglass"); // north
		//		 iconBuffer[11][3] = par1IconRegister.registerIcon("reactioncraft:magentaglass"); // east
		//		 iconBuffer[11][4] = par1IconRegister.registerIcon("reactioncraft:magentaglass"); // south
		//		 iconBuffer[11][5] = par1IconRegister.registerIcon("reactioncraft:magentaglass"); // west
		//
		//		 // meta 0, Empty Bookshelf
		//		 iconBuffer[12][0] = par1IconRegister.registerIcon("reactioncraft:OrangeGlass"); // bottom
		//		 iconBuffer[12][1] = par1IconRegister.registerIcon("reactioncraft:OrangeGlass"); // top
		//		 iconBuffer[12][2] = par1IconRegister.registerIcon("reactioncraft:OrangeGlass"); // north
		//		 iconBuffer[12][3] = par1IconRegister.registerIcon("reactioncraft:OrangeGlass"); // east
		//		 iconBuffer[12][4] = par1IconRegister.registerIcon("reactioncraft:OrangeGlass"); // south
		//		 iconBuffer[12][5] = par1IconRegister.registerIcon("reactioncraft:OrangeGlass"); // west
		//
		//		 // meta 0, Empty Bookshelf
		//		 iconBuffer[13][0] = par1IconRegister.registerIcon("reactioncraft:pinkglass"); // bottom
		//		 iconBuffer[13][1] = par1IconRegister.registerIcon("reactioncraft:pinkglass"); // top
		//		 iconBuffer[13][2] = par1IconRegister.registerIcon("reactioncraft:pinkglass"); // north
		//		 iconBuffer[13][3] = par1IconRegister.registerIcon("reactioncraft:pinkglass"); // east
		//		 iconBuffer[13][4] = par1IconRegister.registerIcon("reactioncraft:pinkglass"); // south
		//		 iconBuffer[13][5] = par1IconRegister.registerIcon("reactioncraft:pinkglass"); // west
		//
		//		 // meta 0, Empty Bookshelf
		//		 iconBuffer[14][0] = par1IconRegister.registerIcon("reactioncraft:purpleglass"); // bottom
		//		 iconBuffer[14][1] = par1IconRegister.registerIcon("reactioncraft:purpleglass"); // top
		//		 iconBuffer[14][2] = par1IconRegister.registerIcon("reactioncraft:purpleglass"); // north
		//		 iconBuffer[14][3] = par1IconRegister.registerIcon("reactioncraft:purpleglass"); // east
		//		 iconBuffer[14][4] = par1IconRegister.registerIcon("reactioncraft:purpleglass"); // south
		//		 iconBuffer[14][5] = par1IconRegister.registerIcon("reactioncraft:purpleglass"); // west
		//
		//		 // meta 0, Empty Bookshelf
		//		 iconBuffer[15][0] = par1IconRegister.registerIcon("reactioncraft:WhiteGlass"); // bottom
		//		 iconBuffer[15][1] = par1IconRegister.registerIcon("reactioncraft:WhiteGlass"); // top
		//		 iconBuffer[15][2] = par1IconRegister.registerIcon("reactioncraft:WhiteGlass"); // north
		//		 iconBuffer[15][3] = par1IconRegister.registerIcon("reactioncraft:WhiteGlass"); // east
		//		 iconBuffer[15][4] = par1IconRegister.registerIcon("reactioncraft:WhiteGlass"); // south
		//		 iconBuffer[15][5] = par1IconRegister.registerIcon("reactioncraft:WhiteGlass"); // west
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

	public void getSubBlocks(int i,CreativeTabs tab, List list)
	{
		list.add(new ItemStack(i,1,0));
		list.add(new ItemStack(i,1,1));
		list.add(new ItemStack(i,1,2));
		list.add(new ItemStack(i,1,3));
		list.add(new ItemStack(i,1,4));
		//    	list.add(new ItemStack(i,1,5));
		//    	list.add(new ItemStack(i,1,6));
		//    	list.add(new ItemStack(i,1,7));
		//    	list.add(new ItemStack(i,1,8));
		//    	list.add(new ItemStack(i,1,9));
		//    	list.add(new ItemStack(i,1,10));
		//    	list.add(new ItemStack(i,1,11));
		//    	list.add(new ItemStack(i,1,12));
		//    	list.add(new ItemStack(i,1,13));
		//    	list.add(new ItemStack(i,1,14));
		//    	list.add(new ItemStack(i,1,15));
	}
}
