package Reactioncraft.basemod.common;

import Reactioncraft.basemod.RCAM;
import Reactioncraft.integration.IntegratedBlocks;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import cpw.mods.fml.common.IPickupNotifier;
import cpw.mods.fml.common.Loader;

public class AchievementPickupHandler implements IPickupNotifier
{
	@Override
	public void notifyPickup(EntityItem item, EntityPlayer player)
	{	
			if(item.getEntityItem().itemID == IntegratedBlocks.DarkSand.blockID)
			{
				player.addStat(RCAM.First, 1);
			}		
		
//		if(item.getEntityItem().itemID == RCC.SandStonePaste.itemID)
//		{
//			player.addStat(RCAM.Second, 1);
//		}	
	}
}
