package Reactioncraft.mobs.common;

import Reactioncraft.basemod.RCB;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;

import forestry.api.core.ItemInterface;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityFallingSand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.*;

public class BlockHive extends BlockDragonEgg
{
	private Icon[][] iconBuffer;
	
    public BlockHive(int par1)
    {
        super(par1);
        this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 1.0F, 0.9375F);
        this.setCreativeTab(RCB.Reactioncraft);
    }
    
    /**
     * Ticks the block if it's been scheduled
     */
    @Override
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
    	
    }
    
    /**
     * Called when the block is clicked by a player. Args: x, y, z, entityPlayer
     */
    @Override
    public void onBlockClicked(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer)
    {
        
    }
    
    public static boolean canFallBelow(World par0World, int par1, int par2, int par3)
    {
      return false;
    }

    /**
     * Called right before the block is destroyed by a player.  Args: world, x, y, z, metaData
     */
    @Override
    public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5)
    {
        if (!par1World.isRemote)
        {
            EntityTJ entitysilverfish  = new EntityTJ(par1World);
            EntityTJ entitysilverfish1 = new EntityTJ(par1World);
            EntityTJ entitysilverfish2 = new EntityTJ(par1World);
            EntityTJ entitysilverfish3 = new EntityTJ(par1World);
            entitysilverfish.setLocationAndAngles((double)par2 + 0.5D, (double)par3, (double)par4 + 0.5D, 0.0F, 0.0F);
            entitysilverfish1.setLocationAndAngles((double)par2 + 0.5D, (double)par3, (double)par4 + 0.5D, 0.0F, 0.0F);
            entitysilverfish2.setLocationAndAngles((double)par2 + 0.5D, (double)par3, (double)par4 + 0.5D, 0.0F, 0.0F);
            entitysilverfish3.setLocationAndAngles((double)par2 + 0.5D, (double)par3, (double)par4 + 0.5D, 0.0F, 0.0F);
            par1World.spawnEntityInWorld(entitysilverfish);
            par1World.spawnEntityInWorld(entitysilverfish1);
            par1World.spawnEntityInWorld(entitysilverfish2);
            par1World.spawnEntityInWorld(entitysilverfish3);
        }

        super.onBlockDestroyedByPlayer(par1World, par2, par3, par4, par5);
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

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    @Override
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return true;
    }

    /**
     * The type of render function that is called for this block
     */
    @SideOnly(Side.CLIENT)
    @Override
    public int getRenderType()
    {
    	 return 27;
    }

    @SideOnly(Side.CLIENT)

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    @Override
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return 0;
    }
    
	 @Override
	 public void registerIcons(IconRegister par1IconRegister)
	 {
		 iconBuffer = new Icon[16][12]; // 3 machines, 6 sides each, in ON and OFF states

		 // meta 0, Ender Ore
		 iconBuffer[0][0] = par1IconRegister.registerIcon("rcmobs:hive"); // bottom
		 iconBuffer[0][1] = par1IconRegister.registerIcon("rcmobs:hive"); // top
		 iconBuffer[0][2] = par1IconRegister.registerIcon("rcmobs:hivefront"); // north
		 iconBuffer[0][3] = par1IconRegister.registerIcon("rcmobs:hive"); // east
		 iconBuffer[0][4] = par1IconRegister.registerIcon("rcmobs:hive"); // south
		 iconBuffer[0][5] = par1IconRegister.registerIcon("rcmobs:hive"); // west

		 //below here not used yet!
//
//		 // meta 1, Black Diamond
//		 iconBuffer[1][0] = par1IconRegister.registerIcon("RCORES:NetherBlackDiamond"); // bottom
//		 iconBuffer[1][1] = par1IconRegister.registerIcon("RCORES:NetherBlackDiamond"); // top
//		 iconBuffer[1][2] = par1IconRegister.registerIcon("RCORES:NetherBlackDiamond"); // north
//		 iconBuffer[1][3] = par1IconRegister.registerIcon("RCORES:NetherBlackDiamond"); // east
//		 iconBuffer[1][4] = par1IconRegister.registerIcon("RCORES:NetherBlackDiamond"); // south
//		 iconBuffer[1][5] = par1IconRegister.registerIcon("RCORES:NetherBlackDiamond"); // west
//
//		 // meta 2, Dragonstone
//		 iconBuffer[2][0] = par1IconRegister.registerIcon("RCORES:NetherDragonstone"); // bottom
//		 iconBuffer[2][1] = par1IconRegister.registerIcon("RCORES:NetherDragonstone"); // top
//		 iconBuffer[2][2] = par1IconRegister.registerIcon("RCORES:NetherDragonstone"); // north
//		 iconBuffer[2][3] = par1IconRegister.registerIcon("RCORES:NetherDragonstone"); // east
//		 iconBuffer[2][4] = par1IconRegister.registerIcon("RCORES:NetherDragonstone"); // south
//		 iconBuffer[2][5] = par1IconRegister.registerIcon("RCORES:NetherDragonstone"); // west
//
//		 // meta 3, Diamond
//		 iconBuffer[3][0] = par1IconRegister.registerIcon("RCORES:NetherDimeOre"); // bottom
//		 iconBuffer[3][1] = par1IconRegister.registerIcon("RCORES:NetherDimeOre"); // top
//		 iconBuffer[3][2] = par1IconRegister.registerIcon("RCORES:NetherDimeOre"); // north
//		 iconBuffer[3][3] = par1IconRegister.registerIcon("RCORES:NetherDimeOre"); // east
//		 iconBuffer[3][4] = par1IconRegister.registerIcon("RCORES:NetherDimeOre"); // south
//		 iconBuffer[3][5] = par1IconRegister.registerIcon("RCORES:NetherDimeOre"); // west
//
//		 // meta 4, Gold
//		 iconBuffer[4][0] = par1IconRegister.registerIcon("RCORES:NetherGoldOre1"); // bottom
//		 iconBuffer[4][1] = par1IconRegister.registerIcon("RCORES:NetherGoldOre1"); // top
//		 iconBuffer[4][2] = par1IconRegister.registerIcon("RCORES:NetherGoldOre1"); // north
//		 iconBuffer[4][3] = par1IconRegister.registerIcon("RCORES:NetherGoldOre1"); // east
//		 iconBuffer[4][4] = par1IconRegister.registerIcon("RCORES:NetherGoldOre1"); // south
//		 iconBuffer[4][5] = par1IconRegister.registerIcon("RCORES:NetherGoldOre1"); // west
//
//		 // meta 0, Empty Bookshelf
//		 iconBuffer[5][0] = par1IconRegister.registerIcon("RCORES:cyanglass"); // bottom
//		 iconBuffer[5][1] = par1IconRegister.registerIcon("RCORES:cyanglass"); // top
//		 iconBuffer[5][2] = par1IconRegister.registerIcon("RCORES:cyanglass"); // north
//		 iconBuffer[5][3] = par1IconRegister.registerIcon("RCORES:cyanglass"); // east
//		 iconBuffer[5][4] = par1IconRegister.registerIcon("RCORES:cyanglass"); // south
//		 iconBuffer[5][5] = par1IconRegister.registerIcon("RCORES:cyanglass"); // west
//
//		 // meta 0, Empty Bookshelf
//		 iconBuffer[6][0] = par1IconRegister.registerIcon("RCORES:GreyGlass"); // bottom
//		 iconBuffer[6][1] = par1IconRegister.registerIcon("RCORES:GreyGlass"); // top
//		 iconBuffer[6][2] = par1IconRegister.registerIcon("RCORES:GreyGlass"); // north
//		 iconBuffer[6][3] = par1IconRegister.registerIcon("RCORES:GreyGlass"); // east
//		 iconBuffer[6][4] = par1IconRegister.registerIcon("RCORES:GreyGlass"); // south
//		 iconBuffer[6][5] = par1IconRegister.registerIcon("RCORES:GreyGlass"); // west
//
//		 // meta 0, Empty Bookshelf
//		 iconBuffer[7][0] = par1IconRegister.registerIcon("RCORES:GreenGlass"); // bottom
//		 iconBuffer[7][1] = par1IconRegister.registerIcon("RCORES:GreenGlass"); // top
//		 iconBuffer[7][2] = par1IconRegister.registerIcon("RCORES:GreenGlass"); // north
//		 iconBuffer[7][3] = par1IconRegister.registerIcon("RCORES:GreenGlass"); // east
//		 iconBuffer[7][4] = par1IconRegister.registerIcon("RCORES:GreenGlass"); // south
//		 iconBuffer[7][5] = par1IconRegister.registerIcon("RCORES:GreenGlass"); // west
//
//		 // meta 0, Empty Bookshelf
//		 iconBuffer[8][0] = par1IconRegister.registerIcon("RCORES:NetherGoldOre1"); // bottom
//		 iconBuffer[8][1] = par1IconRegister.registerIcon("RCORES:NetherGoldOre1"); // top
//		 iconBuffer[8][2] = par1IconRegister.registerIcon("RCORES:NetherGoldOre1"); // north
//		 iconBuffer[8][3] = par1IconRegister.registerIcon("RCORES:NetherGoldOre1"); // east
//		 iconBuffer[8][4] = par1IconRegister.registerIcon("RCORES:NetherGoldOre1"); // south
//		 iconBuffer[8][5] = par1IconRegister.registerIcon("RCORES:NetherGoldOre1"); // west
//
//		 // meta 0, Empty Bookshelf
//		 iconBuffer[9][0] = par1IconRegister.registerIcon("RCORES:LightGreyGlass"); // bottom
//		 iconBuffer[9][1] = par1IconRegister.registerIcon("RCORES:LightGreyGlass"); // top
//		 iconBuffer[9][2] = par1IconRegister.registerIcon("RCORES:LightGreyGlass"); // north
//		 iconBuffer[9][3] = par1IconRegister.registerIcon("RCORES:LightGreyGlass"); // east
//		 iconBuffer[9][4] = par1IconRegister.registerIcon("RCORES:LightGreyGlass"); // south
//		 iconBuffer[9][5] = par1IconRegister.registerIcon("RCORES:LightGreyGlass"); // west
//
//		 // meta 0, Empty Bookshelf
//		 iconBuffer[10][0] = par1IconRegister.registerIcon("RCORES:limegreenglass"); // bottom
//		 iconBuffer[10][1] = par1IconRegister.registerIcon("RCORES:limegreenglass"); // top
//		 iconBuffer[10][2] = par1IconRegister.registerIcon("RCORES:limegreenglass"); // north
//		 iconBuffer[10][3] = par1IconRegister.registerIcon("RCORES:limegreenglass"); // east
//		 iconBuffer[10][4] = par1IconRegister.registerIcon("RCORES:limegreenglass"); // south
//		 iconBuffer[10][5] = par1IconRegister.registerIcon("RCORES:limegreenglass"); // west
//
//		 // meta 0, Empty Bookshelf
//		 iconBuffer[11][0] = par1IconRegister.registerIcon("RCORES:magentaglass"); // bottom
//		 iconBuffer[11][1] = par1IconRegister.registerIcon("RCORES:magentaglass"); // top
//		 iconBuffer[11][2] = par1IconRegister.registerIcon("RCORES:magentaglass"); // north
//		 iconBuffer[11][3] = par1IconRegister.registerIcon("RCORES:magentaglass"); // east
//		 iconBuffer[11][4] = par1IconRegister.registerIcon("RCORES:magentaglass"); // south
//		 iconBuffer[11][5] = par1IconRegister.registerIcon("RCORES:magentaglass"); // west
//
//		 // meta 0, Empty Bookshelf
//		 iconBuffer[12][0] = par1IconRegister.registerIcon("RCORES:OrangeGlass"); // bottom
//		 iconBuffer[12][1] = par1IconRegister.registerIcon("RCORES:OrangeGlass"); // top
//		 iconBuffer[12][2] = par1IconRegister.registerIcon("RCORES:OrangeGlass"); // north
//		 iconBuffer[12][3] = par1IconRegister.registerIcon("RCORES:OrangeGlass"); // east
//		 iconBuffer[12][4] = par1IconRegister.registerIcon("RCORES:OrangeGlass"); // south
//		 iconBuffer[12][5] = par1IconRegister.registerIcon("RCORES:OrangeGlass"); // west
//
//		 // meta 0, Empty Bookshelf
//		 iconBuffer[13][0] = par1IconRegister.registerIcon("RCORES:pinkglass"); // bottom
//		 iconBuffer[13][1] = par1IconRegister.registerIcon("RCORES:pinkglass"); // top
//		 iconBuffer[13][2] = par1IconRegister.registerIcon("RCORES:pinkglass"); // north
//		 iconBuffer[13][3] = par1IconRegister.registerIcon("RCORES:pinkglass"); // east
//		 iconBuffer[13][4] = par1IconRegister.registerIcon("RCORES:pinkglass"); // south
//		 iconBuffer[13][5] = par1IconRegister.registerIcon("RCORES:pinkglass"); // west
//
//		 // meta 0, Empty Bookshelf
//		 iconBuffer[14][0] = par1IconRegister.registerIcon("RCORES:purpleglass"); // bottom
//		 iconBuffer[14][1] = par1IconRegister.registerIcon("RCORES:purpleglass"); // top
//		 iconBuffer[14][2] = par1IconRegister.registerIcon("RCORES:purpleglass"); // north
//		 iconBuffer[14][3] = par1IconRegister.registerIcon("RCORES:purpleglass"); // east
//		 iconBuffer[14][4] = par1IconRegister.registerIcon("RCORES:purpleglass"); // south
//		 iconBuffer[14][5] = par1IconRegister.registerIcon("RCORES:purpleglass"); // west
//
//		 // meta 0, Empty Bookshelf
//		 iconBuffer[15][0] = par1IconRegister.registerIcon("RCORES:WhiteGlass"); // bottom
//		 iconBuffer[15][1] = par1IconRegister.registerIcon("RCORES:WhiteGlass"); // top
//		 iconBuffer[15][2] = par1IconRegister.registerIcon("RCORES:WhiteGlass"); // north
//		 iconBuffer[15][3] = par1IconRegister.registerIcon("RCORES:WhiteGlass"); // east
//		 iconBuffer[15][4] = par1IconRegister.registerIcon("RCORES:WhiteGlass"); // south
//		 iconBuffer[15][5] = par1IconRegister.registerIcon("RCORES:WhiteGlass"); // west
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
	 
	 @Override
	 public void getSubBlocks(int i,CreativeTabs tab, List list)
	 {
		 list.add(new ItemStack(i,1,0));
		 //    	list.add(new ItemStack(i,1,1));
		 //    	list.add(new ItemStack(i,1,2));
		 //    	list.add(new ItemStack(i,1,3));
		 //    	list.add(new ItemStack(i,1,4));
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
	 
	 public int idDropped(int i, Random random)
     {
		//return .itemID;
		 if (Loader.isModLoaded("Forestry"))
		 {
			 ItemStack pollen = ItemInterface.getItem("beeComb");
			 System.out.println("[Foresty] mod loaded"); 
			 return pollen.itemID;
		 }
		 
		 else return -1;
     }
    
	 @Override
     public int quantityDropped(Random random)
     {
		 if (Loader.isModLoaded("Forestry"))
		 {
			 return 2;
		 }
		 
		 else return 0;
     }
}
