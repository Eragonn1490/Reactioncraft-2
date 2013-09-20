package Reactioncraft.basefiles.common;

import Reactioncraft.currency.common.ProxyRender;
import cpw.mods.fml.common.SidedProxy;

public class Proxies 
{
	  @SidedProxy(clientSide="Reactioncraft.currency.client.ClientProxyRender", serverSide="Reactioncraft.currency.common.ProxyRender")
	  public static ProxyRender render;
}
