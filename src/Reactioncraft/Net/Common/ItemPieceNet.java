package Reactioncraft.net.Common;

import java.util.List;

import Reactioncraft.basemod.RCB;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ItemPieceNet extends Item 
{
	public ItemPieceNet(int par1)
	{
		super(par1);
		this.setUnlocalizedName("pieceNet");
		this.setCreativeTab(null);
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
			list.add("Level: " + itemStack.stackTagCompound.getInteger("str1"));
		else
			list.add("Please craft to see results");
		super.addInformation(itemStack, player, list, par4);
	}
}