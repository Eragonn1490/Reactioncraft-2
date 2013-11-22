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

public class CurrencyArmor3 extends ItemArmor
{
	protected int enchantability;

	/** The EnumArmorMaterial used for this ItemArmor */
	private final EnumArmorMaterial material;

	public CurrencyArmor3(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) 
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		enchantability = 30;
	}

	/**
     * Return whether this item is repairable in an anvil.
     */
    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return IntegratedItems.ingotbloodstone.itemID ==  par2ItemStack.itemID? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
	
	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
	{
		if ((itemstack.itemID == IntegratedItems.bloodstonehelm.itemID || (itemstack.itemID == IntegratedItems.bloodstonechest.itemID || itemstack.itemID == IntegratedItems.bloodstoneboots.itemID)))
			return "rccm:textures/models/hell_1.png";
		if (itemstack.itemID == IntegratedItems.bloodstonelegs.itemID){
			return "rccm:textures/models/hell_2.png";
		}
		else return null;
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		if(itemID == IntegratedItems.bloodstonehelm.itemID)
			this.itemIcon = par1IconRegister.registerIcon("rccm:bloodstonehelm");
		this.canRepair = true;
		this.setMaxStackSize(1);
		this.isRepairable();
		RenderingRegistry.addNewArmourRendererPrefix("Emerald");
		if(itemID == IntegratedItems.bloodstonechest.itemID)
			this.itemIcon = par1IconRegister.registerIcon("rccm:bloodstonechest");
		this.canRepair = true;
		this.setMaxStackSize(1);
		this.isRepairable();
		RenderingRegistry.addNewArmourRendererPrefix("Emerald");
		if(itemID == IntegratedItems.bloodstonelegs.itemID)
			this.itemIcon = par1IconRegister.registerIcon("rccm:bloodstonelegs");
		this.canRepair = true;
		this.setMaxStackSize(1);
		this.isRepairable();
		RenderingRegistry.addNewArmourRendererPrefix("Emerald");
		if(itemID == IntegratedItems.bloodstoneboots.itemID)
			this.itemIcon = par1IconRegister.registerIcon("rccm:bloodstoneboots");
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