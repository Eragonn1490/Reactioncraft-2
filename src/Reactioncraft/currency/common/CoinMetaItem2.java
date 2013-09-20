package Reactioncraft.currency.common;

import java.util.List;

import Reactioncraft.basemod.RCB;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CoinMetaItem2 extends Item
{
	public CoinMetaItem2(int id)
	{
		super(id);
		this.setHasSubtypes(true);
		this.setCreativeTab(RCB.ReactioncraftItems);
	}

	@SideOnly(Side.CLIENT)
	private Icon[] icons;

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		icons = new Icon[15];

		for (int i = 0; i < icons.length; i++)
		{
			icons[i] = par1IconRegister.registerIcon("rccm" + ":" + (names) + i);
		}
	}

	public static final String[] names = new String[] 
	{ 
		"silvercoin","silvercoins","silverstack","silversack","silverbag","bronzecoin","bronzecoins","bronzestack","bronzesack","bronzebag","coppercoin",//"tutMeta11",//"tutMeta12",//"tutMeta13",//"tutMeta14",//"tutMeta15",
	};

	public Icon getIconFromDamage(int par1)
	{
		return icons[par1];
	}

	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
	{
		for (int x = 0; x < 15; x++)
		{
			par3List.add(new ItemStack(this, 1, x));
		}
	}
}