package Reactioncraft.basemod.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import Reactioncraft.basemod.*;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabReactioncraft extends CreativeTabs
{
	public CreativeTabReactioncraft()
	{
		super("Reactioncraft");
	}

	ItemStack Maskfortab = new ItemStack(RCB.Mask);
	
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return Maskfortab.itemID;
    }
    
    public String getTranslatedTabLabel()
    {
     return "Reactioncraft Blocks";
    }
}