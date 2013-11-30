package Reactioncraft.food.common;

import Reactioncraft.basemod.RCB;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemChurn extends ItemSword 
{
	/** Damage versus entities. */
    public float damageVsEntity;
	
	public ItemChurn(int par1) 
	{
		super(par1, EnumToolMaterial.WOOD);
		this.setMaxStackSize(1);
		this.setMaxDamage(30);
		this.setCreativeTab(RCB.ReactioncraftItems);
		this.setNoRepair();
		this.damageVsEntity = 0;
	}
	
    /**
     * Returns true if players can use this item to affect the world (e.g. placing blocks, placing ender eyes in portal)
     * when not in creative
     */
    public boolean canItemEditBlocks()
    {
        return false;
    }
}