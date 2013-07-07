package Reactioncraft.basemod.common;

import Reactioncraft.basemod.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabReactioncraftfood extends CreativeTabs
{
	public CreativeTabReactioncraftfood()
	{
		super("Reactioncraft1");
	}

	ItemStack Maskfortab = new ItemStack(RCB.Mask);
	
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return Maskfortab.itemID;
    }
    
    public String getTranslatedTabLabel()
    {
     return "Reactioncraft Food";
    }
}