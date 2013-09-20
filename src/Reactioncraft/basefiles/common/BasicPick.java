package Reactioncraft.basefiles.common;

import Reactioncraft.basemod.RCB;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class BasicPick extends ItemPickaxe
{
    public BasicPick(int var1, EnumToolMaterial var2)
    {
        super(var1, var2);
        this.setCreativeTab(RCB.ReactioncraftItems);
	}
}
