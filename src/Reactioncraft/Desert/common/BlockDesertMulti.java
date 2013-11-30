package Reactioncraft.desert.common;

import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import Reactioncraft.basemod.RCB;
import Reactioncraft.integration.*;

public class BlockDesertMulti extends Block
{
	private Icon[][] iconBuffer;

	public BlockDesertMulti(int i, Material material)
	{
		super(i, material);
		this.setCreativeTab(RCB.Reactioncraft);
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
			return IntegratedBlocks.DesertBlockMulti.blockID;

		case 1:
			return blockID;

		case 2:
			return blockID;

		case 3:
			return blockID;

		case 4:
			return blockID;

		case 5:
			return blockID;

		case 6:
			return blockID;

		case 7:
			return blockID;

		case 8:
			return IntegratedItems.UncutLBGem.itemID;

		case 9:
			return IntegratedItems.UncutDBGem.itemID;

		case 11:
			return blockID;

		case 12:
			return Item.coal.itemID;
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

		case 11:
			return 1;
			
		case 12:
			return 2;
		}
	}

	/**
	 * Determines the damage on the item the block drops. Used in cloth and wood.
	 */
	public int damageDropped(int i)
	{
		switch (i)
		{
		default:
			return 0;
		case 1:
			return 1;

		case 2:
			return 1;

		case 3:
			return 4;

		case 4:
			return 4;

		case 5:
			return 5;

		case 6:
			return 6;

		case 7:
			return 7;

		case 10:
			return 10;

		case 11:
			return 11;
		}
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
		list.add(new ItemStack(i,1,10));
		list.add(new ItemStack(i,1,11));
		list.add(new ItemStack(i,1,12));
		//    	list.add(new ItemStack(i,1,13));
		//    	list.add(new ItemStack(i,1,14));
		//    	list.add(new ItemStack(i,1,15));
	}
	
	
	/**
	 * called by spawner, ore, redstoneOre blocks
	 */
	@Override
	protected void dropXpOnBlockBreak(World par1World, int par2, int par3, int par4, int par5)
	{
		par1World.getBlockMetadata(par2, par3, par4);

		if(par1World.getBlockMetadata(par2, par3, par4) == 6 || par1World.getBlockMetadata(par2, par3, par4) == 8 || par1World.getBlockMetadata(par2, par3, par4) == 9 || par1World.getBlockMetadata(par2, par3, par4) == 10 || par1World.getBlockMetadata(par2, par3, par4) == 12)
		{
			if (!par1World.isRemote)
			{
				while (par5 > 0)
				{
					int i1 = EntityXPOrb.getXPSplit(par5);
					par5 -= i1;
					par1World.spawnEntityInWorld(new EntityXPOrb(par1World, (double)par2 + 0.5D, (double)par3 + 0.5D, (double)par4 + 0.5D, i1));
				}
			}
		}
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		iconBuffer = new Icon[16][12]; // 3 machines, 6 sides each, in ON and OFF states

		// meta 0, Carved Dark Stone
		iconBuffer[0][0] = par1IconRegister.registerIcon("reactioncraft:css"); // bottom
		iconBuffer[0][1] = par1IconRegister.registerIcon("reactioncraft:css"); // top
		iconBuffer[0][2] = par1IconRegister.registerIcon("reactioncraft:css"); // north
		iconBuffer[0][3] = par1IconRegister.registerIcon("reactioncraft:css"); // east
		iconBuffer[0][4] = par1IconRegister.registerIcon("reactioncraft:css"); // south
		iconBuffer[0][5] = par1IconRegister.registerIcon("reactioncraft:css"); // west

		// meta 1, Cracked Dark Stone
		iconBuffer[1][0] = par1IconRegister.registerIcon("reactioncraft:Chiseled1"); // bottom
		iconBuffer[1][1] = par1IconRegister.registerIcon("reactioncraft:Chiseled1"); // top
		iconBuffer[1][2] = par1IconRegister.registerIcon("reactioncraft:Chiseled1"); // north
		iconBuffer[1][3] = par1IconRegister.registerIcon("reactioncraft:Chiseled1"); // east
		iconBuffer[1][4] = par1IconRegister.registerIcon("reactioncraft:Chiseled1"); // south
		iconBuffer[1][5] = par1IconRegister.registerIcon("reactioncraft:Chiseled1"); // west

		// meta 2, Dark Stone
		iconBuffer[2][0] = par1IconRegister.registerIcon("reactioncraft:SandStone"); // bottom
		iconBuffer[2][1] = par1IconRegister.registerIcon("reactioncraft:SandStone"); // top
		iconBuffer[2][2] = par1IconRegister.registerIcon("reactioncraft:SandStone"); // north
		iconBuffer[2][3] = par1IconRegister.registerIcon("reactioncraft:SandStone"); // east
		iconBuffer[2][4] = par1IconRegister.registerIcon("reactioncraft:SandStone"); // south
		iconBuffer[2][5] = par1IconRegister.registerIcon("reactioncraft:SandStone"); // west

		// meta 3, Dark Stone Bricks
		iconBuffer[3][0] = par1IconRegister.registerIcon("reactioncraft:SandBrick"); // bottom
		iconBuffer[3][1] = par1IconRegister.registerIcon("reactioncraft:SandBrick"); // top
		iconBuffer[3][2] = par1IconRegister.registerIcon("reactioncraft:SandBrick"); // north
		iconBuffer[3][3] = par1IconRegister.registerIcon("reactioncraft:SandBrick"); // east
		iconBuffer[3][4] = par1IconRegister.registerIcon("reactioncraft:SandBrick"); // south
		iconBuffer[3][5] = par1IconRegister.registerIcon("reactioncraft:SandBrick"); // west

		// meta 4, Cracked Bricks
		iconBuffer[4][0] = par1IconRegister.registerIcon("reactioncraft:MudBrick"); // bottom
		iconBuffer[4][1] = par1IconRegister.registerIcon("reactioncraft:MudBrick"); // top
		iconBuffer[4][2] = par1IconRegister.registerIcon("reactioncraft:MudBrick"); // north
		iconBuffer[4][3] = par1IconRegister.registerIcon("reactioncraft:MudBrick"); // east
		iconBuffer[4][4] = par1IconRegister.registerIcon("reactioncraft:MudBrick"); // south
		iconBuffer[4][5] = par1IconRegister.registerIcon("reactioncraft:MudBrick"); // west

		// meta 5, Desert Bricks
		iconBuffer[5][0] = par1IconRegister.registerIcon("reactioncraft:MutiBrick"); // bottom
		iconBuffer[5][1] = par1IconRegister.registerIcon("reactioncraft:MutiBrick"); // top
		iconBuffer[5][2] = par1IconRegister.registerIcon("reactioncraft:MutiBrick"); // north
		iconBuffer[5][3] = par1IconRegister.registerIcon("reactioncraft:MutiBrick"); // east
		iconBuffer[5][4] = par1IconRegister.registerIcon("reactioncraft:MutiBrick"); // south
		iconBuffer[5][5] = par1IconRegister.registerIcon("reactioncraft:MutiBrick"); // west

		// meta 6, Limestone
		iconBuffer[6][0] = par1IconRegister.registerIcon("reactioncraft:limestone"); // bottom
		iconBuffer[6][1] = par1IconRegister.registerIcon("reactioncraft:limestone"); // top
		iconBuffer[6][2] = par1IconRegister.registerIcon("reactioncraft:limestone"); // north
		iconBuffer[6][3] = par1IconRegister.registerIcon("reactioncraft:limestone"); // east
		iconBuffer[6][4] = par1IconRegister.registerIcon("reactioncraft:limestone"); // south
		iconBuffer[6][5] = par1IconRegister.registerIcon("reactioncraft:limestone"); // west

		// meta 7, Carved Limestone
		iconBuffer[7][0] = par1IconRegister.registerIcon("reactioncraft:Quartz"); // bottom
		iconBuffer[7][1] = par1IconRegister.registerIcon("reactioncraft:Quartz"); // top
		iconBuffer[7][2] = par1IconRegister.registerIcon("reactioncraft:Quartz"); // north
		iconBuffer[7][3] = par1IconRegister.registerIcon("reactioncraft:Quartz"); // east
		iconBuffer[7][4] = par1IconRegister.registerIcon("reactioncraft:Quartz"); // south
		iconBuffer[7][5] = par1IconRegister.registerIcon("reactioncraft:Quartz"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[8][0] = par1IconRegister.registerIcon("reactioncraft:desertgemstone1"); // bottom
		iconBuffer[8][1] = par1IconRegister.registerIcon("reactioncraft:desertgemstone1"); // top
		iconBuffer[8][2] = par1IconRegister.registerIcon("reactioncraft:desertgemstone1"); // north
		iconBuffer[8][3] = par1IconRegister.registerIcon("reactioncraft:desertgemstone1"); // east
		iconBuffer[8][4] = par1IconRegister.registerIcon("reactioncraft:desertgemstone1"); // south
		iconBuffer[8][5] = par1IconRegister.registerIcon("reactioncraft:desertgemstone1"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[9][0] = par1IconRegister.registerIcon("reactioncraft:desertgemstone2"); // bottom
		iconBuffer[9][1] = par1IconRegister.registerIcon("reactioncraft:desertgemstone2"); // top
		iconBuffer[9][2] = par1IconRegister.registerIcon("reactioncraft:desertgemstone2"); // north
		iconBuffer[9][3] = par1IconRegister.registerIcon("reactioncraft:desertgemstone2"); // east
		iconBuffer[9][4] = par1IconRegister.registerIcon("reactioncraft:desertgemstone2"); // south
		iconBuffer[9][5] = par1IconRegister.registerIcon("reactioncraft:desertgemstone2"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[10][0] = par1IconRegister.registerIcon("reactioncraft:desertgold"); // bottom
		iconBuffer[10][1] = par1IconRegister.registerIcon("reactioncraft:desertgold"); // top
		iconBuffer[10][2] = par1IconRegister.registerIcon("reactioncraft:desertgold"); // north
		iconBuffer[10][3] = par1IconRegister.registerIcon("reactioncraft:desertgold"); // east
		iconBuffer[10][4] = par1IconRegister.registerIcon("reactioncraft:desertgold"); // south
		iconBuffer[10][5] = par1IconRegister.registerIcon("reactioncraft:desertgold"); // west

		// meta 11, Mossy Dark Stone Bricks
		iconBuffer[11][0] = par1IconRegister.registerIcon("reactioncraft:mossydsbrick"); // bottom
		iconBuffer[11][1] = par1IconRegister.registerIcon("reactioncraft:mossydsbrick"); // top
		iconBuffer[11][2] = par1IconRegister.registerIcon("reactioncraft:mossydsbrick"); // north
		iconBuffer[11][3] = par1IconRegister.registerIcon("reactioncraft:mossydsbrick"); // east
		iconBuffer[11][4] = par1IconRegister.registerIcon("reactioncraft:mossydsbrick"); // south
		iconBuffer[11][5] = par1IconRegister.registerIcon("reactioncraft:mossydsbrick"); // west

		// meta 12 Desert Coal
		iconBuffer[12][0] = par1IconRegister.registerIcon("reactioncraft:desertcoal"); // bottom
		iconBuffer[12][1] = par1IconRegister.registerIcon("reactioncraft:desertcoal"); // top
		iconBuffer[12][2] = par1IconRegister.registerIcon("reactioncraft:desertcoal"); // north
		iconBuffer[12][3] = par1IconRegister.registerIcon("reactioncraft:desertcoal"); // east
		iconBuffer[12][4] = par1IconRegister.registerIcon("reactioncraft:desertcoal"); // south
		iconBuffer[12][5] = par1IconRegister.registerIcon("reactioncraft:desertcoal"); // west

		//		// meta 0, Empty Bookshelf
		//		iconBuffer[13][0] = par1IconRegister.registerIcon("reactioncraft:pinkglass"); // bottom
		//		iconBuffer[13][1] = par1IconRegister.registerIcon("reactioncraft:pinkglass"); // top
		//		iconBuffer[13][2] = par1IconRegister.registerIcon("reactioncraft:pinkglass"); // north
		//		iconBuffer[13][3] = par1IconRegister.registerIcon("reactioncraft:pinkglass"); // east
		//		iconBuffer[13][4] = par1IconRegister.registerIcon("reactioncraft:pinkglass"); // south
		//		iconBuffer[13][5] = par1IconRegister.registerIcon("reactioncraft:pinkglass"); // west
		//
		//		// meta 0, Empty Bookshelf
		//		iconBuffer[14][0] = par1IconRegister.registerIcon("reactioncraft:purpleglass"); // bottom
		//		iconBuffer[14][1] = par1IconRegister.registerIcon("reactioncraft:purpleglass"); // top
		//		iconBuffer[14][2] = par1IconRegister.registerIcon("reactioncraft:purpleglass"); // north
		//		iconBuffer[14][3] = par1IconRegister.registerIcon("reactioncraft:purpleglass"); // east
		//		iconBuffer[14][4] = par1IconRegister.registerIcon("reactioncraft:purpleglass"); // south
		//		iconBuffer[14][5] = par1IconRegister.registerIcon("reactioncraft:purpleglass"); // west
		//
		//		// meta 0, Empty Bookshelf
		//		iconBuffer[15][0] = par1IconRegister.registerIcon("reactioncraft:WhiteGlass"); // bottom
		//		iconBuffer[15][1] = par1IconRegister.registerIcon("reactioncraft:WhiteGlass"); // top
		//		iconBuffer[15][2] = par1IconRegister.registerIcon("reactioncraft:WhiteGlass"); // north
		//		iconBuffer[15][3] = par1IconRegister.registerIcon("reactioncraft:WhiteGlass"); // east
		//		iconBuffer[15][4] = par1IconRegister.registerIcon("reactioncraft:WhiteGlass"); // south
		//		iconBuffer[15][5] = par1IconRegister.registerIcon("reactioncraft:WhiteGlass"); // west
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
}
