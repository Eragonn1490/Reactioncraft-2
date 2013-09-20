package Reactioncraft.integration;

import net.minecraft.src.ModLoader;
import forestry.api.core.IPlugin;

public class PluginReactioncraft implements IPlugin
{

	@Override
	public boolean isAvailable() 
	{
		return ModLoader.isModLoaded("rcc");
	}

	@Override
	public void preInit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doInit() 
	{
		//ReactioncraftFlowerHandler
	}

	@Override
	public void postInit() {
		// TODO Auto-generated method stub
		
	}

}
