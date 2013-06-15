package Reactioncraft.plants.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import Reactioncraft.basemod.RCB;
 
public class BlockHayBale extends Block
{
        public BlockHayBale(int i, int j)
        {
                super(i, Material.wood);
                this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 1.0F, 0.9375F);
                this.setCreativeTab(RCB.Reactioncraft);
        }
       
        /**
         * Disable statistics for the block, the block will no count for mined or placed.
         */
        public Block disableStats()
        {
            this.enableStats = false;
            return this;
        }
        
        public String getTextureFile()
        {
                return "/Reactioncraft/images/Blocks.png";
        }
       
        public int idDropped(int i, Random random)
        {
                return blockID;
        }
       
        public int quantityDropped(Random random)
        {
                return 1;
        }
        
        /**
         * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
         */
        public boolean renderAsNormalBlock()
        {
            return false;
        }

        /**
         * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
         * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
         */
        public boolean isOpaqueCube()
        {
            return false;
        }
}