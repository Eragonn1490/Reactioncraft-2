package Reactioncraft.desert.common;

import java.util.Random;

import Reactioncraft.basemod.RCB;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
 
public class BlockPlank extends Block
{
        public BlockPlank(int i)
        {
                super(i, Material.wood);
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