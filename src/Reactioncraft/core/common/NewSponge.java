package Reactioncraft.core.common;

import java.util.Random;

import Reactioncraft.basemod.RCB;
import Reactioncraft.core.RCC;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.src.ModLoader;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class NewSponge extends Block
{
	
	private int absorbtion = 3;

	public NewSponge(int id, int absorbtionSetting) 
	{
		super(id, Material.sponge);
		//this.absorbtion = absorbtionSetting;
		this.setCreativeTab(RCB.Reactioncraft);
		this.setTickRandomly(true);
	}
	
	
	
	public int tickRate(World par1World)
    {
        return 1;
    }
	
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
		for(int xCount = -absorbtion; xCount<absorbtion+1; xCount++){
			for(int yCount = -absorbtion; yCount<absorbtion+1; yCount++){
				for(int zCount = -absorbtion; zCount<absorbtion+1; zCount++){
					if(world.getBlockId(xCount+x, yCount+y, zCount+z) == RCC.clearBlock.blockID)
					{
						world.setBlock(xCount+x, yCount+y, zCount+z, Block.waterStill.blockID);
					}
				}
			}
		}
	}
	
	public void onBlockDestroyedByExplosion(World world, int x, int y, int z, Explosion par5Explosion) {
		onBlockDestroyedByPlayer(world, x, y, z, 0);
	}
	
	public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        if (!par1World.isRemote)
        {
            suckUpWater(par1World, par2, par3, par4);
        }
    }
	
	private void suckUpWater(World world, int x, int y, int z){
		for(int xCount = -absorbtion; xCount<absorbtion+1; xCount++){
			for(int yCount = -absorbtion; yCount<absorbtion+1; yCount++){
				for(int zCount = -absorbtion; zCount<absorbtion+1; zCount++){
					if(world.getBlockId(xCount+x, yCount+y, zCount+z) == Block.waterMoving.blockID
							|| world.getBlockId(xCount+x, yCount+y, zCount+z) == Block.waterStill.blockID){
						world.setBlock(xCount+x, yCount+y, zCount+z, RCC.clearBlock.blockID);
					}
				}
			}
		}
	}
	
	public void onNeighborBlockChange(World world, int x, int y, int z, int neighborId) {
		suckUpWater(world,x,y,z);
	}

	public void updateTick(World world, int x, int y, int z, Random random){
		suckUpWater(world,x,y,z);
		//ModLoader.getMinecraftInstance().thePlayer.addChatMessage("Ticking block");
		super.updateTick(world, x, y, z, random);
    }
	
	
	 /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }
    
    public int idDropped(int i, Random random)
    {
            return Block.sponge.blockID;
    }
}
