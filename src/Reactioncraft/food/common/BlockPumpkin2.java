package Reactioncraft.food.common;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import Reactioncraft.basemod.RCB;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
 
public class BlockPumpkin2 extends Block
{
		
		Icon textureTop;
		Icon textureFront;
		Icon textureSide;
	
        public BlockPumpkin2(int i)
        {
                super(i, Material.rock);
                this.setCreativeTab(RCB.Reactioncraft);
        }
       
        @Override
    	public Icon getIcon(int i, int j) 
        {
    		// If no metadata is set, then this is an icon.
    		if (j == 0 && i == 3)
    			return textureSide;

    		if (i == j)
    			return textureSide;

    		switch (i) 
    		{
    		case 0:return textureTop;
    		case 1:return textureTop;
    		case 2:return textureSide;
    		case 3:return textureSide;
    		case 4:return textureSide;
    		case 5:return textureSide;
    			
    		default:return textureSide;
    		}
    	}
        
        @Override
    	@SideOnly(Side.CLIENT)
    	public void registerIcons(IconRegister par1IconRegister)
    	{
    	    textureSide  = par1IconRegister.registerIcon("RCF:pumpkin_side");
            textureTop   = par1IconRegister.registerIcon("RCF:pumpkin_top");
            textureFront = par1IconRegister.registerIcon("RCF:pumpkin_side");
    	}
        
        public int idDropped(int i, Random random)
        {
                return blockID;
        }
       
        public int quantityDropped(Random random)
        {
                return 1;
        }
}