package Reactioncraft.basemod.common;

import net.minecraft.creativetab.CreativeTabs;
import Reactioncraft.basemod.*;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabReactioncraftItems extends CreativeTabs
{
	public CreativeTabReactioncraftItems()
	{
		super("Reactioncraft2");
	}

    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return RCB.Mask.itemID;
    }
    
    public String getTranslatedTabLabel()
    {
     return "Reactioncraft Items";
    }
}