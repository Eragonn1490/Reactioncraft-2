package Reactioncraft.Desert.common;

import java.util.List;
import java.util.Random;
import Reactioncraft.Desert.RCBDM;
import Reactioncraft.basemod.RCB;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockHireoMulti extends Block
{
	private Icon[][] iconBuffer;
	
    public BlockHireoMulti(int i, Material material)
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
            case 0:
                return RCBDM.HireoMulti.blockID;

            case 1:
                return RCBDM.HireoMulti.blockID;

            case 2:
                return RCBDM.HireoMulti.blockID;

            case 3:
                return RCBDM.HireoMulti.blockID;

            case 4:
                return RCBDM.HireoMulti.blockID;

            case 5:
                return RCBDM.HireoMulti.blockID;

            case 6:
                return RCBDM.HireoMulti.blockID;

            case 7:
                return RCBDM.HireoMulti.blockID;

            case 8:
                return RCBDM.HireoMulti.blockID;

            case 9:
                return RCBDM.HireoMulti.blockID;

            case 10:
                return RCBDM.HireoMulti.blockID;

            case 11:
                return RCBDM.HireoMulti.blockID;

            case 12:
                return RCBDM.HireoMulti.blockID;

            case 13:
                return RCBDM.HireoMulti.blockID;
                
            case 14:
                return RCBDM.HireoMulti.blockID;
                
            case 15:
                return RCBDM.HireoMulti.blockID;
        }

        return RCBDM.HireoMulti.blockID;
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
                return 11;

            case 1:
                return 11;

            case 2:
                return 11;

            case 3:
                return 11;

            case 4:
                return 11;

            case 5:
                return 11;

            case 6:
                return 11;

            case 7:
                return 11;

            case 8:
                return 11;

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
    	//list.add(new ItemStack(i,1,9));
    	//list.add(new ItemStack(i,1,10));
    	list.add(new ItemStack(i,1,11));
    	//list.add(new ItemStack(i,1,12));
    	list.add(new ItemStack(i,1,13));
    	list.add(new ItemStack(i,1,14));
    	list.add(new ItemStack(i,1,15));
    }
    
    @Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		iconBuffer = new Icon[16][12]; // 3 machines, 6 sides each, in ON and OFF states

		// meta 0-2, Regular Hireoglyphics
		iconBuffer[0][0] = par1IconRegister.registerIcon("RCBDM:css"); // bottom
		iconBuffer[0][1] = par1IconRegister.registerIcon("RCBDM:css"); // top
		iconBuffer[0][2] = par1IconRegister.registerIcon("RCBDM:BrownSymbol1"); // north
		iconBuffer[0][3] = par1IconRegister.registerIcon("RCBDM:BrownSymbol1"); // east
		iconBuffer[0][4] = par1IconRegister.registerIcon("RCBDM:BrownSymbol1"); // south
		iconBuffer[0][5] = par1IconRegister.registerIcon("RCBDM:BrownSymbol1"); // west

		// meta 1, 
		iconBuffer[1][0] = par1IconRegister.registerIcon("RCBDM:css"); // bottom
		iconBuffer[1][1] = par1IconRegister.registerIcon("RCBDM:css"); // top
		iconBuffer[1][2] = par1IconRegister.registerIcon("RCBDM:BrownSymbol2"); // north
		iconBuffer[1][3] = par1IconRegister.registerIcon("RCBDM:BrownSymbol2"); // east
		iconBuffer[1][4] = par1IconRegister.registerIcon("RCBDM:BrownSymbol2"); // south
		iconBuffer[1][5] = par1IconRegister.registerIcon("RCBDM:BrownSymbol2"); // west

		// meta 2, 
		iconBuffer[2][0] = par1IconRegister.registerIcon("RCBDM:css"); // bottom
		iconBuffer[2][1] = par1IconRegister.registerIcon("RCBDM:css"); // top
		iconBuffer[2][2] = par1IconRegister.registerIcon("RCBDM:BrownSymbol3"); // north
		iconBuffer[2][3] = par1IconRegister.registerIcon("RCBDM:BrownSymbol3"); // east
		iconBuffer[2][4] = par1IconRegister.registerIcon("RCBDM:BrownSymbol3"); // south
		iconBuffer[2][5] = par1IconRegister.registerIcon("RCBDM:BrownSymbol3"); // west

		// meta 3-5, Light blue Hireoglyphics
		iconBuffer[3][0] = par1IconRegister.registerIcon("RCBDM:css"); // bottom
		iconBuffer[3][1] = par1IconRegister.registerIcon("RCBDM:css"); // top
		iconBuffer[3][2] = par1IconRegister.registerIcon("RCBDM:lightbluesymbol1"); // north
		iconBuffer[3][3] = par1IconRegister.registerIcon("RCBDM:lightbluesymbol1"); // east
		iconBuffer[3][4] = par1IconRegister.registerIcon("RCBDM:lightbluesymbol1"); // south
		iconBuffer[3][5] = par1IconRegister.registerIcon("RCBDM:lightbluesymbol1"); // west

		// meta 4, 
		iconBuffer[4][0] = par1IconRegister.registerIcon("RCBDM:css"); // bottom
		iconBuffer[4][1] = par1IconRegister.registerIcon("RCBDM:css"); // top
		iconBuffer[4][2] = par1IconRegister.registerIcon("RCBDM:lightbluesymbol2"); // north
		iconBuffer[4][3] = par1IconRegister.registerIcon("RCBDM:lightbluesymbol2"); // east
		iconBuffer[4][4] = par1IconRegister.registerIcon("RCBDM:lightbluesymbol2"); // south
		iconBuffer[4][5] = par1IconRegister.registerIcon("RCBDM:lightbluesymbol2"); // west

		// meta 5, 
		iconBuffer[5][0] = par1IconRegister.registerIcon("RCBDM:css"); // bottom
		iconBuffer[5][1] = par1IconRegister.registerIcon("RCBDM:css"); // top
		iconBuffer[5][2] = par1IconRegister.registerIcon("RCBDM:lightbluesymbol3"); // north
		iconBuffer[5][3] = par1IconRegister.registerIcon("RCBDM:lightbluesymbol3"); // east
		iconBuffer[5][4] = par1IconRegister.registerIcon("RCBDM:lightbluesymbol3"); // south
		iconBuffer[5][5] = par1IconRegister.registerIcon("RCBDM:lightbluesymbol3"); // west

		// meta 6-8, Darkblue Hireoglyphics
		iconBuffer[6][0] = par1IconRegister.registerIcon("RCBDM:css"); // bottom
		iconBuffer[6][1] = par1IconRegister.registerIcon("RCBDM:css"); // top
		iconBuffer[6][2] = par1IconRegister.registerIcon("RCBDM:darkbluesymbol1"); // north
		iconBuffer[6][3] = par1IconRegister.registerIcon("RCBDM:darkbluesymbol1"); // east
		iconBuffer[6][4] = par1IconRegister.registerIcon("RCBDM:darkbluesymbol1"); // south
		iconBuffer[6][5] = par1IconRegister.registerIcon("RCBDM:darkbluesymbol1"); // west

		// meta 7, 
		iconBuffer[7][0] = par1IconRegister.registerIcon("RCBDM:css"); // bottom
		iconBuffer[7][1] = par1IconRegister.registerIcon("RCBDM:css"); // top
		iconBuffer[7][2] = par1IconRegister.registerIcon("RCBDM:darkbluesymbol2"); // north
		iconBuffer[7][3] = par1IconRegister.registerIcon("RCBDM:darkbluesymbol2"); // east
		iconBuffer[7][4] = par1IconRegister.registerIcon("RCBDM:darkbluesymbol2"); // south
		iconBuffer[7][5] = par1IconRegister.registerIcon("RCBDM:darkbluesymbol2"); // west
		
		// meta 8, 
		iconBuffer[8][0] = par1IconRegister.registerIcon("RCBDM:css"); // bottom
		iconBuffer[8][1] = par1IconRegister.registerIcon("RCBDM:css"); // top
		iconBuffer[8][2] = par1IconRegister.registerIcon("RCBDM:darkbluesymbol3"); // north
		iconBuffer[8][3] = par1IconRegister.registerIcon("RCBDM:darkbluesymbol3"); // east
		iconBuffer[8][4] = par1IconRegister.registerIcon("RCBDM:darkbluesymbol3"); // south
		iconBuffer[8][5] = par1IconRegister.registerIcon("RCBDM:darkbluesymbol3"); // west

//		// meta 9, Unused
//		iconBuffer[9][0] = par1IconRegister.registerIcon("RCBDM:css"); // bottom
//		iconBuffer[9][1] = par1IconRegister.registerIcon("RCBDM:css"); // top
//		iconBuffer[9][2] = par1IconRegister.registerIcon("RCBDM:LightGreyGlass"); // north
//		iconBuffer[9][3] = par1IconRegister.registerIcon("RCBDM:LightGreyGlass"); // east
//		iconBuffer[9][4] = par1IconRegister.registerIcon("RCBDM:LightGreyGlass"); // south
//		iconBuffer[9][5] = par1IconRegister.registerIcon("RCBDM:LightGreyGlass"); // west
//
//		// meta 10, Unused
//		iconBuffer[10][0] = par1IconRegister.registerIcon("RCBDM:css"); // bottom
//		iconBuffer[10][1] = par1IconRegister.registerIcon("RCBDM:css"); // top
//		iconBuffer[10][2] = par1IconRegister.registerIcon("RCBDM:limegreenglass"); // north
//		iconBuffer[10][3] = par1IconRegister.registerIcon("RCBDM:limegreenglass"); // east
//		iconBuffer[10][4] = par1IconRegister.registerIcon("RCBDM:limegreenglass"); // south
//		iconBuffer[10][5] = par1IconRegister.registerIcon("RCBDM:limegreenglass"); // west
//
		// meta 11, Weathered Hireoglyph
		iconBuffer[11][0] = par1IconRegister.registerIcon("RCBDM:css"); // bottom
		iconBuffer[11][1] = par1IconRegister.registerIcon("RCBDM:css"); // top
		iconBuffer[11][2] = par1IconRegister.registerIcon("RCBDM:weathered"); // north
		iconBuffer[11][3] = par1IconRegister.registerIcon("RCBDM:weathered"); // east
		iconBuffer[11][4] = par1IconRegister.registerIcon("RCBDM:weathered"); // south
		iconBuffer[11][5] = par1IconRegister.registerIcon("RCBDM:weathered"); // west

//		// meta 12, unused
//		iconBuffer[12][0] = par1IconRegister.registerIcon("RCBDM:css"); // bottom
//		iconBuffer[12][1] = par1IconRegister.registerIcon("RCBDM:css"); // top
//		iconBuffer[12][2] = par1IconRegister.registerIcon("RCBDM:OrangeGlass"); // north
//		iconBuffer[12][3] = par1IconRegister.registerIcon("RCBDM:OrangeGlass"); // east
//		iconBuffer[12][4] = par1IconRegister.registerIcon("RCBDM:OrangeGlass"); // south
//		iconBuffer[12][5] = par1IconRegister.registerIcon("RCBDM:OrangeGlass"); // west

		// meta 13-15 Gold Hireoglyphics
		iconBuffer[13][0] = par1IconRegister.registerIcon("RCBDM:css"); // bottom
		iconBuffer[13][1] = par1IconRegister.registerIcon("RCBDM:css"); // top
		iconBuffer[13][2] = par1IconRegister.registerIcon("RCBDM:GoldSymbols1"); // north
		iconBuffer[13][3] = par1IconRegister.registerIcon("RCBDM:GoldSymbols1"); // east
		iconBuffer[13][4] = par1IconRegister.registerIcon("RCBDM:GoldSymbols1"); // south
		iconBuffer[13][5] = par1IconRegister.registerIcon("RCBDM:GoldSymbols1"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[14][0] = par1IconRegister.registerIcon("RCBDM:css"); // bottom
		iconBuffer[14][1] = par1IconRegister.registerIcon("RCBDM:css"); // top
		iconBuffer[14][2] = par1IconRegister.registerIcon("RCBDM:GoldSymbols2"); // north
		iconBuffer[14][3] = par1IconRegister.registerIcon("RCBDM:GoldSymbols2"); // east
		iconBuffer[14][4] = par1IconRegister.registerIcon("RCBDM:GoldSymbols2"); // south
		iconBuffer[14][5] = par1IconRegister.registerIcon("RCBDM:GoldSymbols2"); // west

		// meta 0, Empty Bookshelf
		iconBuffer[15][0] = par1IconRegister.registerIcon("RCBDM:css"); // bottom
		iconBuffer[15][1] = par1IconRegister.registerIcon("RCBDM:css"); // top
		iconBuffer[15][2] = par1IconRegister.registerIcon("RCBDM:GoldSymbols3"); // north
		iconBuffer[15][3] = par1IconRegister.registerIcon("RCBDM:GoldSymbols3"); // east
		iconBuffer[15][4] = par1IconRegister.registerIcon("RCBDM:GoldSymbols3"); // south
		iconBuffer[15][5] = par1IconRegister.registerIcon("RCBDM:GoldSymbols3"); // west
	}
    
    public boolean canMineBlock(World world, int i, int j, int k, EntityMinecart entityminecart, ItemStack itemstack)
    {
        return true;
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
