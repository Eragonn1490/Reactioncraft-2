package Reactioncraft.desert.common;

import net.minecraft.item.ItemStack;
import Reactioncraft.desert.RCBDM;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler 
{		
	@Override
    public int getBurnTime(ItemStack fuel)
    {
            if(fuel.itemID == RCBDM.Cherrywood.blockID) return 200;
            if(fuel.itemID == RCBDM.CherryTreeSapling.blockID) return 120;
            if(fuel.itemID == RCBDM.Cactus1.blockID) return 120;           
            if(fuel.itemID == RCBDM.Cactus2.blockID) return 120;
            if(fuel.itemID == RCBDM.CherryPlanks.blockID) return 150; 
            else return 0;
    }
}
