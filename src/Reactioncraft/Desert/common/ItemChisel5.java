package Reactioncraft.Desert.common;

import Reactioncraft.basemod.RCB;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemChisel5 extends ItemChisel 
{

	public ItemChisel5(int par1) 
	{
		super(par1);
		this.setMaxStackSize(1);
		this.setMaxDamage(4200);
		this.setUnlocalizedName("Chisel");
		this.setCreativeTab(RCB.ReactioncraftItems);
	}
}


