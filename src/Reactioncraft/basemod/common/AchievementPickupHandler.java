package Reactioncraft.basemod.common;

import Reactioncraft.basemod.RCAM;
import Reactioncraft.core.RCC;
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
		if(Loader.isModLoaded("rcc"))
		{
			if(item.getEntityItem().itemID == RCC.DarkSand.blockID)
			{
				player.addStat(RCAM.First, 1);
			}		
		}
		
		if(item.getEntityItem().itemID == Item.appleRed.itemID)
		{
			player.addStat(RCAM.Second, 1);
		}	
	}
}
