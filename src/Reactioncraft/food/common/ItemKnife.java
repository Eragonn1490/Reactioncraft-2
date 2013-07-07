package Reactioncraft.food.common;

import Reactioncraft.basemod.RCB;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemKnife extends ItemSword 
{

	public ItemKnife(int par1) 
	{
		super(par1, EnumToolMaterial.EMERALD);
		this.setMaxStackSize(1);
		this.setMaxDamage(25);
		this.setCreativeTab(RCB.ReactioncraftItems);
	}
}


