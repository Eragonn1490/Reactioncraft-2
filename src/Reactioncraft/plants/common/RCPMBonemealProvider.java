package Reactioncraft.plants.common;

import Reactioncraft.plants.RCPM;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class RCPMBonemealProvider
{
	@ForgeSubscribe
	public void onUseBonemeal(BonemealEvent event)
	{
		EntityPlayer player = event.entityPlayer;
		World world = event.world;
		
		if (event.ID == RCPM.AncientPlant.blockID)
		{
			if (!event.world.isRemote)
			{
				((BlockAncientPlant)RCPM.AncientPlant).fertilize(event.world, event.X, event.Y, event.Z);
				event.setResult(Event.Result.ALLOW);
			}
		}
		
		if (event.ID == RCPM.cornStalk.blockID)
		{
			if (!event.world.isRemote)
			{
				((BlockCornStalk)RCPM.cornStalk).fertilize(event.world, event.X, event.Y, event.Z);
				event.setResult(Event.Result.ALLOW);
			}
		}
		
		//if (event.ID == RCPM..blockID)
		//{
		//	if (!event.world.isRemote)
		//	{
		//		((BlockPamPear)PamHCPear.pamPear).fertilize(event.world, event.X, event.Y, event.Z);
		//		event.setResult(Event.Result.ALLOW);
		//	}
		//}
		
	}
}
