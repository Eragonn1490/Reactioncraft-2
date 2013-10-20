package Reactioncraft.basemod;

import Reactioncraft.basefiles.common.PacketHandler;
import Reactioncraft.basemod.common.*;
import Reactioncraft.basemod.common.CommonProxy;
import Reactioncraft.integration.*;
import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod( modid = "rcam", name="Reactioncraft Achievements Mod", version="[1.6.4] Reactioncraft 3 Version 1.1.4", dependencies = "required-after:reactioncraft")
@NetworkMod(channels = { "RCAM" }, clientSideRequired = false, serverSideRequired = false, packetHandler = PacketHandler.class, connectionHandler = ConnectionHandler.class)

public class RCAM
{
	@SidedProxy(clientSide = "Reactioncraft.basemod.client.ClientProxy", serverSide = "Reactioncraft.basemod.common.CommonProxy")

	public static CommonProxy proxy;

	@Instance("RCAM")
	public static RCAM instance;

	@EventHandler
	public void config(FMLPreInitializationEvent event)
	{

	}

	//Achievements

	public static Achievement First;
	public static Achievement Second;

	public static AchievementPage Reactioncraft3Page;

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		First   = new Achievement(700, "First",  0, 0, IntegratedBlocks.DarkSand, null).registerAchievement();
		Second = new Achievement(701, "Second", 2, 0, IntegratedItems.SandStonePaste, RCAM.First).registerAchievement().setSpecial();

		this.addAchievementName("First", "Dark Sand?");
		this.addAchievementDesc("First", "What Does it Do?");

		this.addAchievementName("Second", "Sandstone Paste?");
		this.addAchievementDesc("Second", "why are we making this?");

		Reactioncraft3Page = new AchievementPage("Reactioncraft 3", First, Second);
		AchievementPage.registerAchievementPage(Reactioncraft3Page);

		GameRegistry.registerCraftingHandler(new AchievementCraftingHandler());
		GameRegistry.registerPickupHandler(new AchievementPickupHandler());
	}

	private void addAchievementName(String ach, String name)
	{
		LanguageRegistry.instance().addStringLocalization("achievement." + ach, "en_US", name);
	}

	private void addAchievementDesc(String ach, String desc)
	{
		LanguageRegistry.instance().addStringLocalization("achievement." + ach + ".desc", "en_US", desc);
	}

	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent event)
	{
	}
}