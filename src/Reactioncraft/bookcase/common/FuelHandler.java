package Reactioncraft.bookcase.common;

import Reactioncraft.bookcase.RCBB;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler
{
	@Override
	public int getBurnTime(ItemStack var1)
	{
		return 
				var1.itemID == Item.book.itemID ? 45 : 
					(var1.itemID == Item.writableBook.itemID ? 50 : 
						(var1.itemID == Item.writtenBook.itemID ? 55 :
							(var1.itemID == Item.map.itemID ? 60 : 
								(var1.itemID == Item.paper.itemID ? 20 : 
									(var1.itemID == Item.sign.itemID ? 200 : 
										(var1.itemID == Item.doorWood.itemID ? 200 : 
											(var1.itemID == Block.bookShelf.blockID ? 300 : 
												(var1.itemID == RCBB.WoodenBookcasedoor.itemID ? 300 : 
													(var1.itemID == RCBB.Bookcasechest.blockID ? 300 : 
														(var1.itemID == RCBB.bookcasemeta.blockID ? 300 : 
															(var1.itemID == RCBB.leverbookcase.blockID ? 300 :
																(var1.itemID == Block.fence.blockID ? 300 : 
																	(var1.itemID == Block.fenceGate.blockID ? 300 : 0)))))))))))));
	}
}
