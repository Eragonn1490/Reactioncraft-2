package Reactioncraft.Desert.common;

import java.util.Random;

import Reactioncraft.Desert.RCBDM;

import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class RCCBonemealProvider 
{
 @ForgeSubscribe
    public void bonemealUsed(BonemealEvent event)
    {
        //this part here is what tells bonemeal to trigger the growing event
	 	if(event.world.getBlockId(event.X, event.Y, event.Z) == RCBDM.CherryTreeSapling.blockID)
	 	{
	 		((BlockCherryTreeSapling)RCBDM.CherryTreeSapling).growTree(event.world, event.X, event.Y, event.Z, new Random());
	 	}
	 	
	 	/* this code here is an example of adding another event. you simply make more if statements
	 	 
	 	if(event.world.getBlockId(event.X, event.Y, event.Z) == Darkmod.YourSapling.blockID)
	 	{
	 		((BlockYourSapling)Darkmod.YourSapling).growTree(event.world, event.X, event.Y, event.Z, new Random());
	 	}
	 	
	 	*/
    }
}
 
 