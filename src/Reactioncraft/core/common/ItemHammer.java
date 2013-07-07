package Reactioncraft.core.common;

import Reactioncraft.basemod.RCB;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemHammer extends ItemSword 
{
	public ItemHammer(int par1) 
	{
		super(par1, EnumToolMaterial.EMERALD);
		this.setMaxStackSize(1);
		this.setMaxDamage(30);
		this.setCreativeTab(RCB.ReactioncraftItems);
	}
}


