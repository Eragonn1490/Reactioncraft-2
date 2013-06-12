package Reactioncraft.Net.Common;

import java.util.List;

import Reactioncraft.basemod.RCB;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemPieceHilt extends Item 
{

	public ItemPieceHilt(int par1) {
		super(par1);
		this.setUnlocalizedName("pieceHilt");
		this.setCreativeTab(RCB.Reactioncraft);
	}

	@Override
	public String getItemDisplayName(ItemStack par1ItemStack) 
	{
		return "Hilt Piece";
	}

	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4) 
	{
		if (itemStack.stackTagCompound != null)
			list.add("Level: " + itemStack.stackTagCompound.getByte("str"));
		else
			list.add("Please craft to see results");
		super.addInformation(itemStack, player, list, par4);
	}
}
