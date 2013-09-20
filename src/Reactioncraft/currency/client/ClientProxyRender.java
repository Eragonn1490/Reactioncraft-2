package Reactioncraft.currency.client;

import Reactioncraft.basefiles.common.ReactioncraftResource;
import Reactioncraft.currency.common.ProxyRender;
import cpw.mods.fml.common.registry.VillagerRegistry;

public class ClientProxyRender extends ProxyRender
{
	public void registerVillagerSkin(int villagerId, String texturePath)
	{
	    VillagerRegistry.instance().registerVillagerSkin(villagerId, new ReactioncraftResource(texturePath));
	}
}
