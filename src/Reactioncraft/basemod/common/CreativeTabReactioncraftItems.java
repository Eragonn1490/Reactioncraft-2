package Reactioncraft.basemod.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import Reactioncraft.basemod.*;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabReactioncraftItems extends CreativeTabs
{
	public CreativeTabReactioncraftItems()
	{
		super("Reactioncraft2");
	}
	
	ItemStack Maskfortab = new ItemStack(RCB.Mask);
	
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return Maskfortab.itemID;
    }
    
    public String getTranslatedTabLabel()
    {
     return "Reactioncraft Items";
    }
}