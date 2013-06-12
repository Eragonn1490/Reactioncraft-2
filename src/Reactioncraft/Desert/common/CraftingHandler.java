package Reactioncraft.Desert.common;

import Reactioncraft.Desert.RCBDM;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingHandler implements ICraftingHandler 
{

	@Override
	public void onCrafting(EntityPlayer player, ItemStack item,
			IInventory craftMatrix) 
	{
		for(int w=0; w < craftMatrix.getSizeInventory(); w++) //Checks all the slots
		{               
			if(craftMatrix.getStackInSlot(w) != null) //If there is an item
			{
				ItemStack j = craftMatrix.getStackInSlot(w); //Gets the item
				if(j.getItem() != null && j.getItem() == RCBDM.GoldChisel) //If it's a Chisel
				{
					ItemStack k = new ItemStack(RCBDM.GoldChisel, 2, (j.getItemDamage() + 1)); //Makes a new itemstack that's been damaged and has 2 items
					if(k.getItemDamage() >= k.getMaxDamage()){ //If it is destroyed
						k.stackSize--; //Removes the added item
					}
					craftMatrix.setInventorySlotContents(w, k); //Sets the slot to the new item
				}
			}
		}

		for(int i=0; i < craftMatrix.getSizeInventory(); i++) //Checks all the slots
		{               
			if(craftMatrix.getStackInSlot(i) != null) //If there is an item
			{
				ItemStack j = craftMatrix.getStackInSlot(i); //Gets the item
				if(j.getItem() != null && j.getItem() == RCBDM.FlintChisel) //If it's a Chisel
				{
					ItemStack k = new ItemStack(RCBDM.FlintChisel, 2, (j.getItemDamage() + 1)); //Makes a new itemstack that's been damaged and has 2 items
					if(k.getItemDamage() >= k.getMaxDamage()){ //If it is destroyed
						k.stackSize--; //Removes the added item
					}
					craftMatrix.setInventorySlotContents(i, k); //Sets the slot to the new item
				}
			}
		}
		for(int z=0; z < craftMatrix.getSizeInventory(); z++) //Checks all the slots
		{               
			if(craftMatrix.getStackInSlot(z) != null) //If there is an item
			{
				ItemStack j = craftMatrix.getStackInSlot(z); //Gets the item
				if(j.getItem() != null && j.getItem() == RCBDM.DiamondChisel) //If it's a Chisel
				{
					ItemStack k = new ItemStack(RCBDM.DiamondChisel, 2, (j.getItemDamage() + 1)); //Makes a new itemstack that's been damaged and has 2 items
					if(k.getItemDamage() >= k.getMaxDamage()){ //If it is destroyed
						k.stackSize--; //Removes the added item
					}
					craftMatrix.setInventorySlotContents(z, k); //Sets the slot to the new item
				}
			}
		}
		for(int a=0; a < craftMatrix.getSizeInventory(); a++) //Checks all the slots
		{               
			if(craftMatrix.getStackInSlot(a) != null) //If there is an item
			{
				ItemStack j = craftMatrix.getStackInSlot(a); //Gets the item
				if(j.getItem() != null && j.getItem() == RCBDM.BloodstoneChisel) //If it's a Chisel
				{
					ItemStack k = new ItemStack(RCBDM.BloodstoneChisel, 2, (j.getItemDamage() + 1)); //Makes a new itemstack that's been damaged and has 2 items
					if(k.getItemDamage() >= k.getMaxDamage()){ //If it is destroyed
						k.stackSize--; //Removes the added item
					}
					craftMatrix.setInventorySlotContents(a, k); //Sets the slot to the new item
				}
			}
		}
		for(int G=0; G < craftMatrix.getSizeInventory(); G++) //Checks all the slots
		{               
			if(craftMatrix.getStackInSlot(G) != null) //If there is an item
			{
				ItemStack j = craftMatrix.getStackInSlot(G); //Gets the item
				if(j.getItem() != null && j.getItem() == RCBDM.CopperChisel) //If it's a Chisel
				{
					ItemStack k = new ItemStack(RCBDM.CopperChisel, 2, (j.getItemDamage() + 1)); //Makes a new itemstack that's been damaged and has 2 items
					if(k.getItemDamage() >= k.getMaxDamage()){ //If it is destroyed
						k.stackSize--; //Removes the added item
					}
					craftMatrix.setInventorySlotContents(G, k); //Sets the slot to the new item
				}
			}
		}	
	}
	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
		// TODO Auto-generated method stub

	}

}
