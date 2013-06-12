package Reactioncraft.Desert.common;

import Reactioncraft.basemod.RCB;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemChisel extends ItemSword 
{

	public ItemChisel(int par1) 
	{
		super(par1, EnumToolMaterial.EMERALD);
		this.setMaxStackSize(1);
		this.setMaxDamage(10);
		this.setUnlocalizedName("Chisel");
		this.setCreativeTab(RCB.ReactioncraftItems);
	}
}


