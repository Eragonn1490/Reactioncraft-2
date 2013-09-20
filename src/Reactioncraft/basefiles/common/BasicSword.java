package Reactioncraft.basefiles.common;

import Reactioncraft.basemod.RCB;
import net.minecraft.block.Block;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class BasicSword extends ItemSword
{
	public BasicSword(int i, EnumToolMaterial var2)
	{
		super(i, var2);
		this.setCreativeTab(RCB.ReactioncraftItems);
	}
	
	 /**
     * returns the action that specifies what animation to play when the items is being used
     */
	@Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.block;
    }
	
	/**
     * Returns if the item (tool) can harvest results from the block type.
     */
	@Override
    public boolean canHarvestBlock(Block par1Block)
    {
        return par1Block.blockID == Block.web.blockID;
    }
    
    /**
     * Returns true if players can use this item to affect the world (e.g. placing blocks, placing ender eyes in portal)
     * when not in creative
     */
    @Override
    public boolean canItemEditBlocks()
    {
        return false;
    }
}
