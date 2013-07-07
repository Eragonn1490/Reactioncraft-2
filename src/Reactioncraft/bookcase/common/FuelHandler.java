package Reactioncraft.bookcase.common;

import Reactioncraft.bookcase.RCBB;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler
{
	ItemStack EmptyBookshelf = new ItemStack(RCBB.bookcasemeta, 1, 0);
	
	ItemStack WebbedBookshelf1 = new ItemStack(RCBB.bookcasemeta, 1, 1);
			
	ItemStack WebbedBookshelf2 = new ItemStack(RCBB.bookcasemeta, 1, 2);
					
	ItemStack ScrollShelf = new ItemStack(RCBB.bookcasemeta, 1, 3);
	
	@Override
    public int getBurnTime(ItemStack fuel)
	{
		if(fuel.itemID == Item.book.itemID)
    		return 45;
		
		if(fuel.itemID == Item.writableBook.itemID)
    		return 50;
		
		if(fuel.itemID == Item.writtenBook.itemID)
    		return 55;
		
		if(fuel.itemID == Item.map.itemID)
    		return 60;
		
		if(fuel.itemID == Item.paper.itemID)
    		return 20;
				
		if(fuel.itemID == Item.sign.itemID)
    		return 200;
		
		if(fuel.itemID == Item.doorWood.itemID)
    		return 200;
		
		if(fuel.itemID == Block.bookShelf.blockID)
    		return 300;
		
		if(fuel.itemID == Block.fenceGate.blockID)
    		return 300;
		
		if(fuel.itemID == Block.fence.blockID)
    		return 300;

		if(fuel.itemID == RCBB.WoodenBookcasedoor.itemID)
    		return 300;
		
		if(fuel.itemID == RCBB.Bookcasechest.blockID)
    		return 300;
		
		if(fuel.itemID == RCBB.leverbookcase.blockID)
    		return 300;
		
		if(fuel.itemID == EmptyBookshelf.itemID)
    		return 290;
		
		if(fuel.itemID == WebbedBookshelf1.itemID)
    		return 295;
		
		if(fuel.itemID == WebbedBookshelf2.itemID)
    		return 310;
		
		if(fuel.itemID == ScrollShelf.itemID)
    		return 200;
		
		else return 0;		
	}
}
