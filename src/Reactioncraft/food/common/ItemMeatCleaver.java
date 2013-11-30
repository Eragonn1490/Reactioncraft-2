package Reactioncraft.food.common;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.*;
import Reactioncraft.basefiles.common.*;
import Reactioncraft.basemod.RCB;

public class ItemMeatCleaver extends BasicSword
{
    public ItemMeatCleaver(int var1, EnumToolMaterial var2)
    {
        super(var1, var2);
        this.setCreativeTab(RCB.ReactioncraftItems);
	}

    /**
     * Return whether this item is repairable in an anvil.
     */
    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return Item.ingotIron.itemID ==  par2ItemStack.itemID? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
}
