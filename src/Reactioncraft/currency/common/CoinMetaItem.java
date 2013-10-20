package Reactioncraft.currency.common;

import java.util.List;
import Reactioncraft.basemod.RCB;
import Reactioncraft.integration.IntegratedItems;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CoinMetaItem extends Item
{
	public CoinMetaItem(int id)
	{
		super(id);
		this.setHasSubtypes(true);
		this.setCreativeTab(RCB.ReactioncraftItems);
		this.setMaxDamage(0);
	}

	@SideOnly(Side.CLIENT)
	private Icon[] icons;

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		icons = new Icon[17];

		for (int i = 0; i < icons.length; i++)
		{
			icons[i] = par1IconRegister.registerIcon("rccm" + ":" + (this.getUnlocalizedName().substring(5)) + i);
		}
	}

	public static final String[] names = new String[] { "first", "second", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"};

	public String getUnlocalizedName(ItemStack par1ItemStack)
	{	
		int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 15);
		
		if(par1ItemStack.getItemDamage() == 15)
		{
			setContainerItem(IntegratedItems.Bag);
		}
		
		if(par1ItemStack.getItemDamage() == 14)
		{
			setContainerItem(IntegratedItems.Sack);
		}
		
		if(par1ItemStack.getItemDamage() == 10)
		{
			setContainerItem(IntegratedItems.Bag);
		}
		
		if(par1ItemStack.getItemDamage() == 9)
		{
			setContainerItem(IntegratedItems.Sack);
		}
		
		if(par1ItemStack.getItemDamage() == 5)
		{
			setContainerItem(IntegratedItems.Bag);
		}
		
		if(par1ItemStack.getItemDamage() == 4)
		{
			setContainerItem(IntegratedItems.Sack);
		}
		
		return super.getUnlocalizedName() + "." + names[i];
	}
	
	@Override
	public Icon getIconFromDamage(int par1)
	{
		return icons[par1];
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(int itemID, CreativeTabs tab, List itemList) //Adds the metadata items to the creative inventory
	{
		for(int i=0;i<16;i++)
		{
			itemList.add(new ItemStack(itemID,1,i)); //Adds all the metadatas
		}
	}
}