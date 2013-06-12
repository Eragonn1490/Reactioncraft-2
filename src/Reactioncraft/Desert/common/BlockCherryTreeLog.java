package Reactioncraft.Desert.common;

import java.util.List;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Reactioncraft.basemod.RCB;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockCherryTreeLog extends Block
{
	Icon textureTop;
	Icon textureFront;
	Icon textureSide;

	public BlockCherryTreeLog(int par1, Material par2) 
	{
		super(par1, par2);
		this.setCreativeTab(RCB.Reactioncraft);
		this.setUnlocalizedName("RCBDM:woodside");
	}
	
    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
    }
    
    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int par1)
    {
        return blockID;
    }
    
    
    @Override
    //sustains leaves
    public boolean canSustainLeaves(World world, int x, int y, int z)
    {
        return true;
    }

    @Override
    //tells minecraft that this block is wood. 
    public boolean isWood(World world, int x, int y, int z)
    {
        return true;
    }
    
    @Override
	public Icon getIcon(int i, int j) 
    {
		// If no metadata is set, then this is an icon.
		if (j == 0 && i == 3)
			return textureFront;

		if (i == j)
			return textureFront;

		switch (i) 
		{
		case 0:return textureTop;
		case 1:return textureTop;
		case 2:return textureSide;
		case 3:return textureSide;
		case 4:return textureSide;
		case 5:return textureSide;
			
		default:return textureFront;
		}
	}
    
    @Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	    textureSide = par1IconRegister.registerIcon("RCBDM:woodside");
        textureTop = par1IconRegister.registerIcon("RCBDM:woodtop");
        textureFront = par1IconRegister.registerIcon("RCBDM:woodside");
	}
}
