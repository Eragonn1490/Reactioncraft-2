package Reactioncraft.Desert.common;

import java.util.List;
import java.util.Random;
import Reactioncraft.Desert.RCBDM;
import Reactioncraft.basemod.RCB;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

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
    public int idDropped(int i, Random random, int j)
    {
        switch (i)
        {
            default:
                return RCBDM.DesertBlockMulti.blockID;

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
                return RCBDM.UncutLBGem.itemID;
               
            case 9:
                return RCBDM.UncutDBGem.itemID;
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
                
//            case 7:
//                return 7;
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
//    	list.add(new ItemStack(i,1,11));
//    	list.add(new ItemStack(i,1,12));
//    	list.add(new ItemStack(i,1,13));
//    	list.add(new ItemStack(i,1,14));
//    	list.add(new ItemStack(i,1,15));
    }
    
    @Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		iconBuffer = new Icon[16][12]; // 3 machines, 6 sides each, in ON and OFF states

		// meta 0, Carved Dark Stone
		iconBuffer[0][0] = par1IconRegister.registerIcon("RCBDM:css"); // bottom
		iconBuffer[0][1] = par1IconRegister.registerIcon("RCBDM:css"); // top
		iconBuffer[0][2] = par1IconRegister.registerIcon("RCBDM:css"); // north
		iconBuffer[0][3] = par1IconRegister.registerIcon("RCBDM:css"); // east
		iconBuffer[0][4] = par1IconRegister.registerIcon("RCBDM:css"); // south
		iconBuffer[0][5] = par1IconRegister.registerIcon("RCBDM:css"); // west

		// meta 1, Cracked Dark Stone
		iconBuffer[1][0] = par1IconRegister.registerIcon("RCBDM:Chiseled1"); // bottom
		iconBuffer[1][1] = par1IconRegister.registerIcon("RCBDM:Chiseled1"); // top
		iconBuffer[1][2] = par1IconRegister.registerIcon("RCBDM:Chiseled1"); // north
		iconBuffer[1][3] = par1IconRegister.registerIcon("RCBDM:Chiseled1"); // east
		iconBuffer[1][4] = par1IconRegister.registerIcon("RCBDM:Chiseled1"); // south
		iconBuffer[1][5] = par1IconRegister.registerIcon("RCBDM:Chiseled1"); // west

		// meta 2, Dark Stone
		iconBuffer[2][0] = par1IconRegister.registerIcon("RCBDM:SandStone"); // bottom
		iconBuffer[2][1] = par1IconRegister.registerIcon("RCBDM:SandStone"); // top
		iconBuffer[2][2] = par1IconRegister.registerIcon("RCBDM:SandStone"); // north
		iconBuffer[2][3] = par1IconRegister.registerIcon("RCBDM:SandStone"); // east
		iconBuffer[2][4] = par1IconRegister.registerIcon("RCBDM:SandStone"); // south
		iconBuffer[2][5] = par1IconRegister.registerIcon("RCBDM:SandStone"); // west

		// meta 3, Dark Stone Bricks
		iconBuffer[3][0] = par1IconRegister.registerIcon("RCBDM:SandBrick"); // bottom
		iconBuffer[3][1] = par1IconRegister.registerIcon("RCBDM:SandBrick"); // top
		iconBuffer[3][2] = par1IconRegister.registerIcon("RCBDM:SandBrick"); // north
		iconBuffer[3][3] = par1IconRegister.registerIcon("RCBDM:SandBrick"); // east
		iconBuffer[3][4] = par1IconRegister.registerIcon("RCBDM:SandBrick"); // south
		iconBuffer[3][5] = par1IconRegister.registerIcon("RCBDM:SandBrick"); // west

		// meta 4, Cracked Bricks
		iconBuffer[4][0] = par1IconRegister.registerIcon("RCBDM:MudBrick"); // bottom
		iconBuffer[4][1] = par1IconRegister.registerIcon("RCBDM:MudBrick"); // top
		iconBuffer[4][2] = par1IconRegister.registerIcon("RCBDM:MudBrick"); // north
		iconBuffer[4][3] = par1IconRegister.registerIcon("RCBDM:MudBrick"); // east
		iconBuffer[4][4] = par1IconRegister.registerIcon("RCBDM:MudBrick"); // south
		iconBuffer[4][5] = par1IconRegister.registerIcon("RCBDM:MudBrick"); // west

		// meta 5, Desert Bricks
		iconBuffer[5][0] = par1IconRegister.registerIcon("RCBDM:MutiBrick"); // bottom
		iconBuffer[5][1] = par1IconRegister.registerIcon("RCBDM:MutiBrick"); // top
		iconBuffer[5][2] = par1IconRegister.registerIcon("RCBDM:MutiBrick"); // north
		iconBuffer[5][3] = par1IconRegister.registerIcon("RCBDM:MutiBrick"); // east
		iconBuffer[5][4] = par1IconRegister.registerIcon("RCBDM:MutiBrick"); // south
		iconBuffer[5][5] = par1IconRegister.registerIcon("RCBDM:MutiBrick"); // west

		// meta 6, Limestone
		iconBuffer[6][0] = par1IconRegister.registerIcon("RCBDM:limestone"); // bottom
		iconBuffer[6][1] = par1IconRegister.registerIcon("RCBDM:limestone"); // top
		iconBuffer[6][2] = par1IconRegister.registerIcon("RCBDM:limestone"); // north
		iconBuffer[6][3] = par1IconRegister.registerIcon("RCBDM:limestone"); // east
		iconBuffer[6][4] = par1IconRegister.registerIcon("RCBDM:limestone"); // south
		iconBuffer[6][5] = par1IconRegister.registerIcon("RCBDM:limestone"); // west

		// meta 7, Carved Limestone
		iconBuffer[7][0] = par1IconRegister.registerIcon("RCBDM:Quartz"); // bottom
		iconBuffer[7][1] = par1IconRegister.registerIcon("RCBDM:Quartz"); // top
		iconBuffer[7][2] = par1IconRegister.registerIcon("RCBDM:Quartz"); // north
		iconBuffer[7][3] = par1IconRegister.registerIcon("RCBDM:Quartz"); // east
		iconBuffer[7][4] = par1IconRegister.registerIcon("RCBDM:Quartz"); // south
		iconBuffer[7][5] = par1IconRegister.registerIcon("RCBDM:Quartz"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[8][0] = par1IconRegister.registerIcon("RCBDM:desertgemstone1"); // bottom
		iconBuffer[8][1] = par1IconRegister.registerIcon("RCBDM:desertgemstone1"); // top
		iconBuffer[8][2] = par1IconRegister.registerIcon("RCBDM:desertgemstone1"); // north
		iconBuffer[8][3] = par1IconRegister.registerIcon("RCBDM:desertgemstone1"); // east
		iconBuffer[8][4] = par1IconRegister.registerIcon("RCBDM:desertgemstone1"); // south
		iconBuffer[8][5] = par1IconRegister.registerIcon("RCBDM:desertgemstone1"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[9][0] = par1IconRegister.registerIcon("RCBDM:desertgemstone2"); // bottom
		iconBuffer[9][1] = par1IconRegister.registerIcon("RCBDM:desertgemstone2"); // top
		iconBuffer[9][2] = par1IconRegister.registerIcon("RCBDM:desertgemstone2"); // north
		iconBuffer[9][3] = par1IconRegister.registerIcon("RCBDM:desertgemstone2"); // east
		iconBuffer[9][4] = par1IconRegister.registerIcon("RCBDM:desertgemstone2"); // south
		iconBuffer[9][5] = par1IconRegister.registerIcon("RCBDM:desertgemstone2"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[10][0] = par1IconRegister.registerIcon("RCBDM:desertgold"); // bottom
		iconBuffer[10][1] = par1IconRegister.registerIcon("RCBDM:desertgold"); // top
		iconBuffer[10][2] = par1IconRegister.registerIcon("RCBDM:desertgold"); // north
		iconBuffer[10][3] = par1IconRegister.registerIcon("RCBDM:desertgold"); // east
		iconBuffer[10][4] = par1IconRegister.registerIcon("RCBDM:desertgold"); // south
		iconBuffer[10][5] = par1IconRegister.registerIcon("RCBDM:desertgold"); // west

//		// meta 0, Empty Bookshelf
//		iconBuffer[11][0] = par1IconRegister.registerIcon("RCBDM:magentaglass"); // bottom
//		iconBuffer[11][1] = par1IconRegister.registerIcon("RCBDM:magentaglass"); // top
//		iconBuffer[11][2] = par1IconRegister.registerIcon("RCBDM:magentaglass"); // north
//		iconBuffer[11][3] = par1IconRegister.registerIcon("RCBDM:magentaglass"); // east
//		iconBuffer[11][4] = par1IconRegister.registerIcon("RCBDM:magentaglass"); // south
//		iconBuffer[11][5] = par1IconRegister.registerIcon("RCBDM:magentaglass"); // west
//
//		// meta 0, Empty Bookshelf
//		iconBuffer[12][0] = par1IconRegister.registerIcon("RCBDM:OrangeGlass"); // bottom
//		iconBuffer[12][1] = par1IconRegister.registerIcon("RCBDM:OrangeGlass"); // top
//		iconBuffer[12][2] = par1IconRegister.registerIcon("RCBDM:OrangeGlass"); // north
//		iconBuffer[12][3] = par1IconRegister.registerIcon("RCBDM:OrangeGlass"); // east
//		iconBuffer[12][4] = par1IconRegister.registerIcon("RCBDM:OrangeGlass"); // south
//		iconBuffer[12][5] = par1IconRegister.registerIcon("RCBDM:OrangeGlass"); // west
//
//		// meta 0, Empty Bookshelf
//		iconBuffer[13][0] = par1IconRegister.registerIcon("RCBDM:pinkglass"); // bottom
//		iconBuffer[13][1] = par1IconRegister.registerIcon("RCBDM:pinkglass"); // top
//		iconBuffer[13][2] = par1IconRegister.registerIcon("RCBDM:pinkglass"); // north
//		iconBuffer[13][3] = par1IconRegister.registerIcon("RCBDM:pinkglass"); // east
//		iconBuffer[13][4] = par1IconRegister.registerIcon("RCBDM:pinkglass"); // south
//		iconBuffer[13][5] = par1IconRegister.registerIcon("RCBDM:pinkglass"); // west
//
//		// meta 0, Empty Bookshelf
//		iconBuffer[14][0] = par1IconRegister.registerIcon("RCBDM:purpleglass"); // bottom
//		iconBuffer[14][1] = par1IconRegister.registerIcon("RCBDM:purpleglass"); // top
//		iconBuffer[14][2] = par1IconRegister.registerIcon("RCBDM:purpleglass"); // north
//		iconBuffer[14][3] = par1IconRegister.registerIcon("RCBDM:purpleglass"); // east
//		iconBuffer[14][4] = par1IconRegister.registerIcon("RCBDM:purpleglass"); // south
//		iconBuffer[14][5] = par1IconRegister.registerIcon("RCBDM:purpleglass"); // west
//
//		// meta 0, Empty Bookshelf
//		iconBuffer[15][0] = par1IconRegister.registerIcon("RCBDM:WhiteGlass"); // bottom
//		iconBuffer[15][1] = par1IconRegister.registerIcon("RCBDM:WhiteGlass"); // top
//		iconBuffer[15][2] = par1IconRegister.registerIcon("RCBDM:WhiteGlass"); // north
//		iconBuffer[15][3] = par1IconRegister.registerIcon("RCBDM:WhiteGlass"); // east
//		iconBuffer[15][4] = par1IconRegister.registerIcon("RCBDM:WhiteGlass"); // south
//		iconBuffer[15][5] = par1IconRegister.registerIcon("RCBDM:WhiteGlass"); // west
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