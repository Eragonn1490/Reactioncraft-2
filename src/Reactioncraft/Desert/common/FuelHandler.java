package Reactioncraft.Desert.common;

import Reactioncraft.Desert.RCBDM;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler 
{	
	
	ItemStack CherryPlanks = new ItemStack(RCBDM.DesertBlockMulti, 1, 11);
	
	@Override
    public int getBurnTime(ItemStack fuel)
    {
            if(fuel.itemID == RCBDM.Cherrywood.blockID)
                    return 200;
            
            if(fuel.itemID == RCBDM.CherryTreeSapling.blockID)
            		return 120;
            
            if(fuel.itemID == CherryPlanks.itemID)
            		return 150;
            
            else return 0;
    }
}
