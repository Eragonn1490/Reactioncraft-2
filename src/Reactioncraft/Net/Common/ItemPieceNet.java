package Reactioncraft.net.Common;

import java.util.List;

import Reactioncraft.basemod.RCB;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemPieceNet extends Item 
{

	public ItemPieceNet(int par1)
	{
		super(par1);
		this.setUnlocalizedName("pieceNet");
		this.setCreativeTab(RCB.Reactioncraft);
	}

	@Override
	public String getItemDisplayName(ItemStack par1ItemStack) 
	{
		return "Net Piece";
	}

	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4) 
	{
		if (itemStack.stackTagCompound != null)
			list.add("Level: " + itemStack.stackTagCompound.getInteger("str"));
		else
			list.add("Creative Net: Don't Use Me");
			list.add("i dont have an NBTT Value");
		super.addInformation(itemStack, player, list, par4);
	}
}
