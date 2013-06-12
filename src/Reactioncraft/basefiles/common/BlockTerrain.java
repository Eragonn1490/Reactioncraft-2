package Reactioncraft.basefiles.common;

import java.util.Random;

import Reactioncraft.basemod.RCB;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
 
public class BlockTerrain extends Block
{
        public BlockTerrain(int i, int j)
        {
                super(i, Material.rock);
                this.setCreativeTab(RCB.Reactioncraft);
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