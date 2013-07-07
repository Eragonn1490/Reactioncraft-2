package Reactioncraft.glass.common;

import java.util.List;
import java.util.Random;
import Reactioncraft.basemod.RCB;
import Reactioncraft.glass.RCG;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockGlowingGlassMulti extends BlockGlassMulti
{
	private Icon[][] iconBuffer;

	public BlockGlowingGlassMulti(int i, Material material)
	{
		super(i, material);
		this.setCreativeTab(RCB.Reactioncraft);
		this.setUnlocalizedName("GlowingGlassMulti");
		this.getLocalizedName();
	}

	public boolean func_50074_q()
	{
		return true;
	}

	/**
	 * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
	 */
	public int getRenderBlockPass()
	{
		return 1;
	}

	public boolean canSilkHarvest()
	{
		return true;
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
	public int idDropped(int i, Random random, int j)
	{
		switch (i)
		{
		case 0:
			return RCG.GlowingGlassMulti.blockID;

		case 1:
			return RCG.GlowingGlassMulti.blockID;

		case 2:
			return RCG.GlowingGlassMulti.blockID;

		case 3:
			return RCG.GlowingGlassMulti.blockID;

		case 4:
			return RCG.GlowingGlassMulti.blockID;

		case 5:
			return RCG.GlowingGlassMulti.blockID;

		case 6:
			return RCG.GlowingGlassMulti.blockID;

		case 7:
			return RCG.GlowingGlassMulti.blockID;

		case 8:
			return RCG.GlowingGlassMulti.blockID;

		case 9:
			return RCG.GlowingGlassMulti.blockID;

		case 10:
			return RCG.GlowingGlassMulti.blockID;

		case 11:
			return RCG.GlowingGlassMulti.blockID;

		case 12:
			return RCG.GlowingGlassMulti.blockID;

		case 13:
			return RCG.GlowingGlassMulti.blockID;

		case 14:
			return RCG.GlowingGlassMulti.blockID;

		case 15:
			return RCG.GlowingGlassMulti.blockID;
		}

		return RCG.GlowingGlassMulti.blockID;
	}

	public int quantityDropped(int i, int j, Random random)
	{
		switch (i)
		{
		case 0:
			return 0;

		case 1:
			return 0;

		case 2:
			return 0;

		case 3:
			return 0;

		case 4:
			return 0;

		case 5:
			return 0;

		case 6:
			return 0;

		case 7:
			return 0;

		case 8:
			return 0;

		case 9:
			return 0;

		case 10:
			return 0;

		case 11:
			return 0;

		case 12:
			return 0;

		case 13:
			return 0;

		case 14:
			return 0;

		case 15:
			return 0;
		}

		return 0;
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
		list.add(new ItemStack(i,1,13));
		list.add(new ItemStack(i,1,14));
		list.add(new ItemStack(i,1,15));
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		iconBuffer = new Icon[16][12]; // 3 machines, 6 sides each, in ON and OFF states

		// meta 0, Empty Bookshelf
		iconBuffer[0][0] = par1IconRegister.registerIcon("RCG:YellowGlass"); // bottom
		iconBuffer[0][1] = par1IconRegister.registerIcon("RCG:YellowGlass"); // top
		iconBuffer[0][2] = par1IconRegister.registerIcon("RCG:YellowGlass"); // north
		iconBuffer[0][3] = par1IconRegister.registerIcon("RCG:YellowGlass"); // east
		iconBuffer[0][4] = par1IconRegister.registerIcon("RCG:YellowGlass"); // south
		iconBuffer[0][5] = par1IconRegister.registerIcon("RCG:YellowGlass"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[1][0] = par1IconRegister.registerIcon("RCG:redglass"); // bottom
		iconBuffer[1][1] = par1IconRegister.registerIcon("RCG:redglass"); // top
		iconBuffer[1][2] = par1IconRegister.registerIcon("RCG:redglass"); // north
		iconBuffer[1][3] = par1IconRegister.registerIcon("RCG:redglass"); // east
		iconBuffer[1][4] = par1IconRegister.registerIcon("RCG:redglass"); // south
		iconBuffer[1][5] = par1IconRegister.registerIcon("RCG:redglass"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[2][0] = par1IconRegister.registerIcon("RCG:BlackGlass"); // bottom
		iconBuffer[2][1] = par1IconRegister.registerIcon("RCG:BlackGlass"); // top
		iconBuffer[2][2] = par1IconRegister.registerIcon("RCG:BlackGlass"); // north
		iconBuffer[2][3] = par1IconRegister.registerIcon("RCG:BlackGlass"); // east
		iconBuffer[2][4] = par1IconRegister.registerIcon("RCG:BlackGlass"); // south
		iconBuffer[2][5] = par1IconRegister.registerIcon("RCG:BlackGlass"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[3][0] = par1IconRegister.registerIcon("RCG:BlueGlass"); // bottom
		iconBuffer[3][1] = par1IconRegister.registerIcon("RCG:BlueGlass"); // top
		iconBuffer[3][2] = par1IconRegister.registerIcon("RCG:BlueGlass"); // north
		iconBuffer[3][3] = par1IconRegister.registerIcon("RCG:BlueGlass"); // east
		iconBuffer[3][4] = par1IconRegister.registerIcon("RCG:BlueGlass"); // south
		iconBuffer[3][5] = par1IconRegister.registerIcon("RCG:BlueGlass"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[4][0] = par1IconRegister.registerIcon("RCG:BrownGlass"); // bottom
		iconBuffer[4][1] = par1IconRegister.registerIcon("RCG:BrownGlass"); // top
		iconBuffer[4][2] = par1IconRegister.registerIcon("RCG:BrownGlass"); // north
		iconBuffer[4][3] = par1IconRegister.registerIcon("RCG:BrownGlass"); // east
		iconBuffer[4][4] = par1IconRegister.registerIcon("RCG:BrownGlass"); // south
		iconBuffer[4][5] = par1IconRegister.registerIcon("RCG:BrownGlass"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[5][0] = par1IconRegister.registerIcon("RCG:cyanglass"); // bottom
		iconBuffer[5][1] = par1IconRegister.registerIcon("RCG:cyanglass"); // top
		iconBuffer[5][2] = par1IconRegister.registerIcon("RCG:cyanglass"); // north
		iconBuffer[5][3] = par1IconRegister.registerIcon("RCG:cyanglass"); // east
		iconBuffer[5][4] = par1IconRegister.registerIcon("RCG:cyanglass"); // south
		iconBuffer[5][5] = par1IconRegister.registerIcon("RCG:cyanglass"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[6][0] = par1IconRegister.registerIcon("RCG:GreyGlass"); // bottom
		iconBuffer[6][1] = par1IconRegister.registerIcon("RCG:GreyGlass"); // top
		iconBuffer[6][2] = par1IconRegister.registerIcon("RCG:GreyGlass"); // north
		iconBuffer[6][3] = par1IconRegister.registerIcon("RCG:GreyGlass"); // east
		iconBuffer[6][4] = par1IconRegister.registerIcon("RCG:GreyGlass"); // south
		iconBuffer[6][5] = par1IconRegister.registerIcon("RCG:GreyGlass"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[7][0] = par1IconRegister.registerIcon("RCG:GreenGlass"); // bottom
		iconBuffer[7][1] = par1IconRegister.registerIcon("RCG:GreenGlass"); // top
		iconBuffer[7][2] = par1IconRegister.registerIcon("RCG:GreenGlass"); // north
		iconBuffer[7][3] = par1IconRegister.registerIcon("RCG:GreenGlass"); // east
		iconBuffer[7][4] = par1IconRegister.registerIcon("RCG:GreenGlass"); // south
		iconBuffer[7][5] = par1IconRegister.registerIcon("RCG:GreenGlass"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[8][0] = par1IconRegister.registerIcon("RCG:lightblueglass"); // bottom
		iconBuffer[8][1] = par1IconRegister.registerIcon("RCG:lightblueglass"); // top
		iconBuffer[8][2] = par1IconRegister.registerIcon("RCG:lightblueglass"); // north
		iconBuffer[8][3] = par1IconRegister.registerIcon("RCG:lightblueglass"); // east
		iconBuffer[8][4] = par1IconRegister.registerIcon("RCG:lightblueglass"); // south
		iconBuffer[8][5] = par1IconRegister.registerIcon("RCG:lightblueglass"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[9][0] = par1IconRegister.registerIcon("RCG:LightGreyGlass"); // bottom
		iconBuffer[9][1] = par1IconRegister.registerIcon("RCG:LightGreyGlass"); // top
		iconBuffer[9][2] = par1IconRegister.registerIcon("RCG:LightGreyGlass"); // north
		iconBuffer[9][3] = par1IconRegister.registerIcon("RCG:LightGreyGlass"); // east
		iconBuffer[9][4] = par1IconRegister.registerIcon("RCG:LightGreyGlass"); // south
		iconBuffer[9][5] = par1IconRegister.registerIcon("RCG:LightGreyGlass"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[10][0] = par1IconRegister.registerIcon("RCG:limegreenglass"); // bottom
		iconBuffer[10][1] = par1IconRegister.registerIcon("RCG:limegreenglass"); // top
		iconBuffer[10][2] = par1IconRegister.registerIcon("RCG:limegreenglass"); // north
		iconBuffer[10][3] = par1IconRegister.registerIcon("RCG:limegreenglass"); // east
		iconBuffer[10][4] = par1IconRegister.registerIcon("RCG:limegreenglass"); // south
		iconBuffer[10][5] = par1IconRegister.registerIcon("RCG:limegreenglass"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[11][0] = par1IconRegister.registerIcon("RCG:magentaglass"); // bottom
		iconBuffer[11][1] = par1IconRegister.registerIcon("RCG:magentaglass"); // top
		iconBuffer[11][2] = par1IconRegister.registerIcon("RCG:magentaglass"); // north
		iconBuffer[11][3] = par1IconRegister.registerIcon("RCG:magentaglass"); // east
		iconBuffer[11][4] = par1IconRegister.registerIcon("RCG:magentaglass"); // south
		iconBuffer[11][5] = par1IconRegister.registerIcon("RCG:magentaglass"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[12][0] = par1IconRegister.registerIcon("RCG:OrangeGlass"); // bottom
		iconBuffer[12][1] = par1IconRegister.registerIcon("RCG:OrangeGlass"); // top
		iconBuffer[12][2] = par1IconRegister.registerIcon("RCG:OrangeGlass"); // north
		iconBuffer[12][3] = par1IconRegister.registerIcon("RCG:OrangeGlass"); // east
		iconBuffer[12][4] = par1IconRegister.registerIcon("RCG:OrangeGlass"); // south
		iconBuffer[12][5] = par1IconRegister.registerIcon("RCG:OrangeGlass"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[13][0] = par1IconRegister.registerIcon("RCG:pinkglass"); // bottom
		iconBuffer[13][1] = par1IconRegister.registerIcon("RCG:pinkglass"); // top
		iconBuffer[13][2] = par1IconRegister.registerIcon("RCG:pinkglass"); // north
		iconBuffer[13][3] = par1IconRegister.registerIcon("RCG:pinkglass"); // east
		iconBuffer[13][4] = par1IconRegister.registerIcon("RCG:pinkglass"); // south
		iconBuffer[13][5] = par1IconRegister.registerIcon("RCG:pinkglass"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[14][0] = par1IconRegister.registerIcon("RCG:purpleglass"); // bottom
		iconBuffer[14][1] = par1IconRegister.registerIcon("RCG:purpleglass"); // top
		iconBuffer[14][2] = par1IconRegister.registerIcon("RCG:purpleglass"); // north
		iconBuffer[14][3] = par1IconRegister.registerIcon("RCG:purpleglass"); // east
		iconBuffer[14][4] = par1IconRegister.registerIcon("RCG:purpleglass"); // south
		iconBuffer[14][5] = par1IconRegister.registerIcon("RCG:purpleglass"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[15][0] = par1IconRegister.registerIcon("RCG:WhiteGlass"); // bottom
		iconBuffer[15][1] = par1IconRegister.registerIcon("RCG:WhiteGlass"); // top
		iconBuffer[15][2] = par1IconRegister.registerIcon("RCG:WhiteGlass"); // north
		iconBuffer[15][3] = par1IconRegister.registerIcon("RCG:WhiteGlass"); // east
		iconBuffer[15][4] = par1IconRegister.registerIcon("RCG:WhiteGlass"); // south
		iconBuffer[15][5] = par1IconRegister.registerIcon("RCG:WhiteGlass"); // west
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
            return id == Block.fence.blockID || id == Block.netherFence.blockID || id == Block.glass.blockID || id == Block.cobblestoneWall.blockID || id == RCG.GlassMulti.blockID || id == RCG.GlowingGlassMulti.blockID;
        }
    }
}
