package Reactioncraft.basemod.common;

import Reactioncraft.basemod.*;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabReactioncraftfood extends CreativeTabs
{
	public CreativeTabReactioncraftfood()
	{
		super("Reactioncraft1");
	}

    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return RCB.Mask.itemID;
    }
    
    public String getTranslatedTabLabel()
    {
     return "Reactioncraft Food";
    }
}