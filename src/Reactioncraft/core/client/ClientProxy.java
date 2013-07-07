package Reactioncraft.core.client;

import Reactioncraft.core.common.CommonProxy;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy
{
	public static String BORE_TEXTURE ="/mods/RCC/textures/railcraft/";
	
	@SideOnly(Side.CLIENT)
	public static void registerRenderInformation()
	{

	}
	
	@Override
	public int addArmor(String armorName)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(armorName);
	}
}