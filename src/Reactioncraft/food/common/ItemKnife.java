package Reactioncraft.food.common;

import Reactioncraft.basemod.RCB;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemKnife extends ItemSword 
{

	public ItemKnife(int par1) 
	{
		super(par1, EnumToolMaterial.WOOD);
		this.setMaxStackSize(1);
		this.setMaxDamage(25);
		this.setCreativeTab(RCB.ReactioncraftItems);
	}
	
    /**
     * Returns true if players can use this item to affect the world (e.g. placing blocks, placing ender eyes in portal)
     * when not in creative
     */
    public boolean canItemEditBlocks()
    {
        return false;
    }
}


