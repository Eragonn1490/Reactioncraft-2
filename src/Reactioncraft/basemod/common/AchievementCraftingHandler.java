package Reactioncraft.basemod.common;

import Reactioncraft.basemod.RCAM;
import Reactioncraft.integration.IntegratedItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;
import cpw.mods.fml.common.Loader;

public class AchievementCraftingHandler implements ICraftingHandler
{
	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix)
	{
			ItemStack sandstonepaste = new ItemStack(IntegratedItems.SandStonePaste);
			
			if (item.itemID == sandstonepaste.itemID)
			{
				player.addStat(RCAM.Second, 1);
			}
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item)
	{
		/*
		 * if (item.itemID == Item.ingotGold.itemID)
		 * {
		 * 		player.addStat(AchievementMod.Tutorial, 1);
		 * }
		 */
	}
}