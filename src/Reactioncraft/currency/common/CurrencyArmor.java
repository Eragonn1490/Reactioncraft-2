package Reactioncraft.currency.common;

import Reactioncraft.integration.*;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;

public class CurrencyArmor extends ItemArmor
{
	protected int enchantability;

	/** The EnumArmorMaterial used for this ItemArmor */
	private final EnumArmorMaterial material;

	public CurrencyArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) 
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		enchantability = 30;
	}

	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
	{
		if ((itemstack.itemID == IntegratedItems.Crown.itemID || (itemstack.itemID == IntegratedItems.KinglyChest.itemID || itemstack.itemID == IntegratedItems.KinglyBoots.itemID)))
			return "rccm:textures/models/Emerald_1.png";
		if (itemstack.itemID == IntegratedItems.KinglyLegs.itemID){
			return "rccm:textures/models/Emerald_2.png";
		}
		else return null;
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		if(itemID == IntegratedItems.Crown.itemID)
			this.itemIcon = par1IconRegister.registerIcon("rccm:crown");
		this.canRepair = true;
		this.setMaxStackSize(1);
		this.isRepairable();
		RenderingRegistry.addNewArmourRendererPrefix("Emerald");
		if(itemID == IntegratedItems.KinglyChest.itemID)
			this.itemIcon = par1IconRegister.registerIcon("rccm:kingchest");
		this.canRepair = true;
		this.setMaxStackSize(1);
		this.isRepairable();
		RenderingRegistry.addNewArmourRendererPrefix("Emerald");
		if(itemID == IntegratedItems.KinglyLegs.itemID)
			this.itemIcon = par1IconRegister.registerIcon("rccm:kingpants");
		this.canRepair = true;
		this.setMaxStackSize(1);
		this.isRepairable();
		RenderingRegistry.addNewArmourRendererPrefix("Emerald");
		if(itemID == IntegratedItems.KinglyBoots.itemID)
			this.itemIcon = par1IconRegister.registerIcon("rccm:kingboots");
		this.canRepair = true;
		this.setMaxStackSize(1);
		this.isRepairable();
		RenderingRegistry.addNewArmourRendererPrefix("Emerald");
	}

	/**
	 * Return the enchantability factor of the item, most of the time is based on material.
	 */
	@Override
	public int getItemEnchantability()
	{
		return enchantability;
	}
}