package Reactioncraft.core.client;

import Reactioncraft.core.common.CommonProxy;
import Reactioncraft.mobs.common.EntityBee;
import Reactioncraft.mobs.common.EntityHydrolisc;
import Reactioncraft.mobs.common.EntityJellyfish;
import Reactioncraft.mobs.common.EntitySeaCreeper;
import Reactioncraft.mobs.common.EntitySkeletonCrawling;
import Reactioncraft.mobs.common.EntityStalker;
import Reactioncraft.mobs.common.EntityTJ;
import Reactioncraft.mobs.common.EntityZombieCrawling;
import Reactioncraft.mobs.common.ModelBee;
import Reactioncraft.mobs.common.ModelHydrolisc;
import Reactioncraft.mobs.common.ModelJellyfish;
import Reactioncraft.mobs.common.ModelSeaCreeper;
import Reactioncraft.mobs.common.ModelTJ;
import Reactioncraft.mobs.common.ModelZombieCrawling;
import Reactioncraft.mobs.common.RenderBee;
import Reactioncraft.mobs.common.RenderHydrolisc;
import Reactioncraft.mobs.common.RenderJellyfish;
import Reactioncraft.mobs.common.RenderSeaCreeper;
import Reactioncraft.mobs.common.RenderSkeletonCrawling;
import Reactioncraft.mobs.common.RenderStalker;
import Reactioncraft.mobs.common.RenderTJ;
import Reactioncraft.mobs.common.RenderZombieCrawling;
import Reactioncraft.net.Common.EntityPlayerClone;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy
{
	public static String BORE_TEXTURE ="/mods/reactioncraft/textures/railcraft/";

	@SideOnly(Side.CLIENT)
	public static void registerRenderInformation()
	{
		//Mobs Below
		RenderingRegistry.registerEntityRenderingHandler(EntityBee.class, new RenderBee(new ModelBee(0.20F), 0.20F, 0.20F));
		RenderingRegistry.registerEntityRenderingHandler(EntityJellyfish.class, new RenderJellyfish(new ModelJellyfish(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySeaCreeper.class, new RenderSeaCreeper(new ModelSeaCreeper(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityStalker.class, new RenderStalker(new ModelCreeper(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityZombieCrawling.class, new RenderZombieCrawling(new ModelZombieCrawling(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySkeletonCrawling.class, new RenderSkeletonCrawling(new ModelZombieCrawling(), 0.5F));

		//Special Mobs
		RenderingRegistry.registerEntityRenderingHandler(EntityHydrolisc.class, new RenderHydrolisc(new ModelHydrolisc(0.65F), 0.65F, 0.65F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTJ.class, new RenderTJ(new ModelTJ(0.20F), 0.20F, 0.20F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPlayerClone.class, new RenderBiped(new ModelBiped(), 0.5F));
	}

	@Override
	public int addArmor(String armorName)
	{
		return RenderingRegistry.addNewArmourRendererPrefix("Emerald");
	}
}