package Reactioncraft.tools.common;

import Reactioncraft.basemod.RCB;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class BasicSword extends ItemSword
{
	public BasicSword(int i, EnumToolMaterial var2)
	{
		super(i, var2);
		this.setCreativeTab(RCB.ReactioncraftItems);
	}
}
