package Reactioncraft.desert.common;

import net.minecraft.stats.AchievementList;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import Reactioncraft.desert.RCBDM;

public class EventContainerClass 
{
	//allows get wood achievement 
	@ForgeSubscribe
	public void onItemPickupWood(EntityItemPickupEvent e)
	{
		if (e.item.getEntityItem().itemID == RCBDM.Cherrywood.blockID)
		{
			e.entityPlayer.triggerAchievement(AchievementList.mineWood);
		}
	}
}
