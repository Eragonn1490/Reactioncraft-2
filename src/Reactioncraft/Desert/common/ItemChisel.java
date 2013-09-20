package Reactioncraft.desert.common;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;
import Reactioncraft.basemod.RCB;

public class ItemChisel extends ItemSword 
{

	public ItemChisel(int par1) 
	{
		super(par1, EnumToolMaterial.WOOD);
		this.setMaxStackSize(1);
		this.setMaxDamage(10);
		this.setUnlocalizedName("Chisel");
		this.setCreativeTab(RCB.ReactioncraftItems);
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


