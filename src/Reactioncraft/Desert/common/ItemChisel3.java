package Reactioncraft.Desert.common;

import Reactioncraft.basemod.RCB;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemChisel3 extends ItemChisel 
{

	public ItemChisel3(int par1) 
	{
		super(par1);
		this.setMaxStackSize(1);
		this.setMaxDamage(65);
		this.setUnlocalizedName("Chisel");
		this.setCreativeTab(RCB.ReactioncraftItems);
	}
}


