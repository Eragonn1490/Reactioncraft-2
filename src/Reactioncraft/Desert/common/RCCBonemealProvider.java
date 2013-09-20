package Reactioncraft.desert.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;
import Reactioncraft.desert.RCBDM;


public class RCCBonemealProvider
{
	@ForgeSubscribe
	public void onUseBonemeal(BonemealEvent event)
	{
		EntityPlayer player = event.entityPlayer;
		World world = event.world;

		if (event.ID == RCBDM.CherryTreeSapling.blockID)
		{
			if (!event.world.isRemote)
			{
				((BlockCherryTreeSapling)RCBDM.CherryTreeSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
				event.setResult(Event.Result.ALLOW);
			}

		}
	}
}