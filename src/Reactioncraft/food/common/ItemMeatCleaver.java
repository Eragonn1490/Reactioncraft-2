package Reactioncraft.food.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
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
    
    /**
	 * Returns True is the item is renderer in full 3D when hold.
	 */
	@SideOnly(Side.CLIENT)
	public boolean isFull3D()
	{
		return true;
	}

	/**
	 * Returns true if this item should be rotated by 180 degrees around the Y axis when being held in an entities
	 * hands.
	 */
	@SideOnly(Side.CLIENT)
	public boolean shouldRotateAroundWhenRendering()
	{
		return true;
	}
}
