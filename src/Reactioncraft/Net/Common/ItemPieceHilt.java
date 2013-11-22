package Reactioncraft.net.Common;

import java.util.List;

import Reactioncraft.basemod.RCB;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPieceHilt extends Item 
{

	public ItemPieceHilt(int par1) 
	{
		super(par1);
		this.setUnlocalizedName("pieceHilt");
		//this.setCreativeTab(RCB.ReactioncraftItems);
		this.setCreativeTab(null);
	}

	@Override
	public String getItemDisplayName(ItemStack par1ItemStack) 
	{
		return "Hilt Piece";
	}

	@Override
	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) 
	{
		if(par1ItemStack.stackTagCompound != null) par1ItemStack.stackTagCompound.getInteger("str");
		{
			if(par1ItemStack.stackTagCompound.getInteger("str") == 0)
			{
				this.setMaxDamage(1);
			}
			if(par1ItemStack.stackTagCompound.getInteger("str") == 1)
			{
				this.setMaxDamage(10);
			}
			if(par1ItemStack.stackTagCompound.getInteger("str") == 2)
			{
				this.setMaxDamage(20);
			}
			if(par1ItemStack.stackTagCompound.getInteger("str") == 3)
			{
				this.setMaxDamage(30);
			}
			if(par1ItemStack.stackTagCompound.getInteger("str") == 4)
			{
				this.setMaxDamage(40);
			}
			if(par1ItemStack.stackTagCompound.getInteger("str") == 5)
			{
				this.setMaxDamage(50);
			}
		}
	}
	
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4) 
	{
		if (itemStack.stackTagCompound != null)
			list.add("Level: " + itemStack.stackTagCompound.getInteger("str"));
		else
			list.add("Please craft to see results");
		super.addInformation(itemStack, player, list, par4);
	}
}