package Reactioncraft.mobs.client;

import Reactioncraft.mobs.common.*;
import net.minecraft.client.model.ModelCreeper;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy
{
	public static String MODEL_TEXTURE ="/mods/RCmobs/textures/mobs/";
	
	@SideOnly(Side.CLIENT)
	public static void registerRenderInformation()
	{		
		//Mobs Below
		RenderingRegistry.registerEntityRenderingHandler(EntityBee.class, new RenderBee(new ModelBee(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityJellyfish.class, new RenderJellyfish(new ModelJellyfish(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySeaCreeper.class, new RenderSeaCreeper(new ModelSeaCreeper(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityStalker.class, new RenderStalker(new ModelCreeper(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityZombieCrawling.class, new RenderZombieCrawling(new ModelZombieCrawling(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySkeletonCrawling.class, new RenderSkeletonCrawling(new ModelZombieCrawling(), 0.5F));
		
		//Special Mob
		RenderingRegistry.registerEntityRenderingHandler(EntityHydrolisc.class, new RenderHydrolisc(new ModelHydrolisc(0.65F), 0.65F, 0.65F ));
	}
	
	public int addArmor(String armorName)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(armorName);
	}
}