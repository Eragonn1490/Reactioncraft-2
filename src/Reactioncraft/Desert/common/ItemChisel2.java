package Reactioncraft.Desert.common;

import Reactioncraft.basemod.RCB;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemChisel2 extends ItemChisel 
{

	public ItemChisel2(int par1) 
	{
		super(par1);
		this.setMaxStackSize(1);
		this.setMaxDamage(30);
		this.setUnlocalizedName("Chisel");
		this.setCreativeTab(RCB.ReactioncraftItems);
	}
}


