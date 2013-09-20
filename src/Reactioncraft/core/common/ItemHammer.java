package Reactioncraft.core.common;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;
import Reactioncraft.basemod.RCB;

public class ItemHammer extends ItemSword 
{
	public ItemHammer(int par1) 
	{
		super(par1, EnumToolMaterial.WOOD);
		this.setMaxStackSize(1);
		this.setMaxDamage(30);
		this.setCreativeTab(RCB.ReactioncraftItems);
	}
}


