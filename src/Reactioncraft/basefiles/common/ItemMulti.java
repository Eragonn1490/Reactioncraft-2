package Reactioncraft.basefiles.common;

import java.util.List;
import net.minecraft.item.*;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.*;

public class ItemMulti extends ItemBlock
{
	public ItemMulti(int par1)
	{
		super(par1);
		this.setMaxDamage(0);
		this.setHasSubtypes(true); 
	}	
	
	@Override
	public int getMetadata(int par1) 
	{
		return par1;
	}
	
	/**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
	@Override
    public String getUnlocalizedName(ItemStack par1ItemStack)
    {
    	String[] types = {"Block Name", "Block Name 1", "Block Name 2", "Block Name 3", "Block Name 4", "Block Name 5", "Block Name 6", "Block Name 7", "Block Name 8", "Block Name 9", "Block Name 10", "Block Name 11", "Block Name 12", "Block Name 13", "Block Name 14", "Block Name 15"};
    	
        return super.getUnlocalizedName() + "." + types[par1ItemStack.getItemDamage()];
    }
}