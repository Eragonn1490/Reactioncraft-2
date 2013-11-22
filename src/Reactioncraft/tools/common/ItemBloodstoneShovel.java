package Reactioncraft.tools.common;

import cpw.mods.fml.common.registry.GameRegistry;
import Reactioncraft.basefiles.common.*;
import Reactioncraft.basemod.RCB;
import Reactioncraft.integration.IntegratedItems;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.*;

public class ItemBloodstoneShovel extends BasicShovel
{
    public ItemBloodstoneShovel(int var1, EnumToolMaterial var2)
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
        return IntegratedItems.ingotbloodstone.itemID ==  par2ItemStack.itemID? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
}
