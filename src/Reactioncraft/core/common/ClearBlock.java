package Reactioncraft.core.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class ClearBlock extends Block 
{

	static Material clear = new Material(MapColor.airColor);
	
	public ClearBlock(int id) 
	{
		super(id, clear.setReplaceable());
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
		this.setTickRandomly(true);
		this.setCreativeTab((CreativeTabs)null);
	}
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
	
	@Override
	public boolean isAirBlock(World world, int x, int y, int z){
		return true;
	}
	
	@Override
	public boolean canHarvestBlock(EntityPlayer player, int meta)
    {
        return false;
    }
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return 0;
    }
	
	@Override
	public boolean isOpaqueCube()
    {
        return false;
    }
	
	@Override
	public boolean renderAsNormalBlock()
    {
        return false;
    }
	
	@Override
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return true;
    }
}
