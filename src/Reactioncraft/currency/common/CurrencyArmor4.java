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

public class CurrencyArmor4 extends ItemArmor
{
	protected int enchantability;

	/** The EnumArmorMaterial used for this ItemArmor */
	private final EnumArmorMaterial material;

	public CurrencyArmor4(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) 
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		enchantability = 30;
	}

	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
	{
		if ((itemstack.itemID == IntegratedItems.diamondcrown.itemID || (itemstack.itemID == IntegratedItems.KinglyChest.itemID || itemstack.itemID == IntegratedItems.KinglyBoots.itemID)))
			return "reactioncraft:textures/models/diamondcrown_1.png";
		if (itemstack.itemID == IntegratedItems.KinglyLegs.itemID){
			return "reactioncraft:textures/models/Emerald_2.png";
		}
		else return null;
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		if(itemID == IntegratedItems.diamondcrown.itemID)
			this.itemIcon = par1IconRegister.registerIcon("reactioncraft:diamondcrown");
		this.canRepair = true;
		this.setMaxStackSize(1);
		this.isRepairable();
		RenderingRegistry.addNewArmourRendererPrefix("Emerald");
		if(itemID == IntegratedItems.KinglyChest.itemID)
			this.itemIcon = par1IconRegister.registerIcon("reactioncraft:kingchest");
		this.canRepair = true;
		this.setMaxStackSize(1);
		this.isRepairable();
		RenderingRegistry.addNewArmourRendererPrefix("Emerald");
		if(itemID == IntegratedItems.KinglyLegs.itemID)
			this.itemIcon = par1IconRegister.registerIcon("reactioncraft:kingpants");
		this.canRepair = true;
		this.setMaxStackSize(1);
		this.isRepairable();
		RenderingRegistry.addNewArmourRendererPrefix("Emerald");
		if(itemID == IntegratedItems.KinglyBoots.itemID)
			this.itemIcon = par1IconRegister.registerIcon("reactioncraft:kingboots");
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