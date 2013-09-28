package Reactioncraft.mobs.common;

import Reactioncraft.mobs.common.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class EventHookContainerClass 
{
	@ForgeSubscribe
	public void onEntityJoinWorld(EntityJoinWorldEvent event) 
	{
		if (event.entity instanceof EntityVillager) 
		{
			EntityVillager fleetj = (EntityVillager) event.entity;
			fleetj.tasks.addTask(1, new EntityAIAvoidEntity(fleetj, EntityTJ.class, 2.0F, 0.8D, 1.33D));
		}
	}
}
