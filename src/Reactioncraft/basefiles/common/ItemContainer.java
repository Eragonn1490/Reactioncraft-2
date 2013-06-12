package Reactioncraft.basefiles.common;

import Reactioncraft.basemod.RCB;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemContainer extends Item
{
	
	public ItemContainer(int i)
	{
		super(i);
		this.setCreativeTab(RCB.ReactioncraftItems);
		this.maxStackSize = 1;
		this.setContainerItem(this);
	}

    /**
     * If this returns true, after a recipe involving this item is crafted the container item will be added to the
     * player's inventory instead of remaining in the crafting grid.
     */
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack)
    {
        return true;
    }
}
