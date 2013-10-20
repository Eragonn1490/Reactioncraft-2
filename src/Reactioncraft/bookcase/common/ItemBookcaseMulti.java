package Reactioncraft.bookcase.common;

import java.util.List;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.*;

public class ItemBookcaseMulti extends ItemBlock
{
	public ItemBookcaseMulti(int par1)
	{
		super(par1);
		this.setMaxDamage(0); //Stops bad things from happening
		this.setHasSubtypes(true); //Tells it that it has metadata versions
	}
	
//	@SideOnly(Side.CLIENT)
//	public Icon getIconFromDamage(int par1) //Gets the texture
//	{
//		//return Class3.asphalt.getBlockTextureFromSideAndMetadata(1, par1);
//	}
	
	@Override
	public int getMetadata(int par1) //Returns the metadata value
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
    	String[] types = {"asphalt","asphaltlineyellow","asphaltlineyellowtwo","asphaltlinewhite","asphaltlinewhitetwo","asphaltlinewhiteright","asphaltlinewhiterighttwo","asphaltlinewhiteleft","asphaltlinewhitelefttwo"};
    	
        return super.getUnlocalizedName() + "." + types[par1ItemStack.getItemDamage()];
    }
}