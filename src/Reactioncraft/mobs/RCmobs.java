package Reactioncraft.mobs;


import java.io.File;

import Reactioncraft.basefiles.common.*;
import Reactioncraft.basefiles.common.PacketHandler;
import Reactioncraft.mobs.client.ClientProxy;
import Reactioncraft.mobs.common.*;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = "RCmobs", name="Reactioncraft Mobs Mod", version="[1.5.2] Reactioncraft Version 8.0", dependencies="required-after:FML@[4.2.18,)")

@NetworkMod(channels = { "RCmobs" }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)

public class RCmobs 
{
	@SidedProxy(clientSide = "Reactioncraft.mobs.client.ClientProxy", serverSide = "Reactioncraft.mobs.common.CommonProxy")
	
	public static Reactioncraft.mobs.common.CommonProxy proxy;

	@Instance("RCmobs")
	public static RCmobs instance;

	//public static int JellyfishIID;
	//public static int RcBeeIID;

	//public static Item Jellyfish;
	//public static Item RcBee;

	//Config
	public static ReactioncraftConfiguration config;

	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		System.out.println("Pre Initialization Loaded");
		
		config = new ReactioncraftConfiguration(new File(evt.getModConfigurationDirectory(), "Reactioncraft/Mobs.cfg"));

		try 
		{
			config.load();

			//10820 - 10840
			//JellyfishIID = config.getItem("Jellyfish", 10820).getInt();
			//RcBeeIID = config.getItem("Reactioncraft Bee", 10821).getInt();

		}

		finally 
		{
			if (config.hasChanged()) 
			{
				config.save();
			}
		}
	}

	@Init
	public void load(FMLInitializationEvent event)
	{
		//MinecraftForge.EVENT_BUS.register(new LivingDropsEvent());
		ClientProxy.registerRenderInformation();
		
		registerGlobal();
		registerEntities();
		addSpawn();
		items();
		langRegistry();
	}

	private void langRegistry() 
	{
		//LanguageRegistry.addName(Jellyfish, "Jellyfish");
		//LanguageRegistry.addName(RcBee, "Bee");
	}

	public void items() 
	{
		//Jellyfish  = (new ItemBasic(JellyfishIID)).setUnlocalizedName("Jellyfish");
		//RcBee  = (new ItemBee(RcBeeIID)).setUnlocalizedName("RcBee");
		//OreDictionary.registerOre("jellyfish", new ItemStack(Jellyfish));
	}

	public void registerEntities()
	{
		EntityRegistry.registerGlobalEntityID(EntityBee.class, "Bee", EntityRegistry.findGlobalUniqueEntityId(), 0x333333, 0x999999);
		EntityRegistry.registerGlobalEntityID(EntityJellyfish.class, "Jellyfish", EntityRegistry.findGlobalUniqueEntityId(), 0x333333, 0x999999);
		EntityRegistry.registerGlobalEntityID(EntitySeaCreeper.class, "Sea Creeper", EntityRegistry.findGlobalUniqueEntityId(), 0x333333, 0x999999);
		EntityRegistry.registerGlobalEntityID(EntityStalker.class, "Stalker", EntityRegistry.findGlobalUniqueEntityId(), 0x333333, 0x999999);
		EntityRegistry.registerGlobalEntityID(EntityZombieCrawling.class, "Crawling Zombie", EntityRegistry.findGlobalUniqueEntityId(), 0x333333, 0x999999);
		EntityRegistry.registerGlobalEntityID(EntityCrawlingSkeleton.class, "Crawling Skeleton", EntityRegistry.findGlobalUniqueEntityId(), 0x333333, 0x999999);
		EntityRegistry.registerGlobalEntityID(EntityHydrolisc.class, "Hydrolisc", EntityRegistry.findGlobalUniqueEntityId(), 0x333333, 0x999999);
	}

	public void registerGlobal()
	{
		LanguageRegistry.instance().addStringLocalization("entity.Bee.name", "en_US", "Bee");
		LanguageRegistry.instance().addStringLocalization("entity.Jellyfish.name", "en_US", "Jellyfish");
		LanguageRegistry.instance().addStringLocalization("entity.Sea Creeper.name", "en_US", "Seacreeper");
		LanguageRegistry.instance().addStringLocalization("entity.Stalker.name", "en_US", "Stalker");
		LanguageRegistry.instance().addStringLocalization("entity.Crawling Zombie.name", "en_US", "Crawling Zombie");
		LanguageRegistry.instance().addStringLocalization("entity.Crawling Skeleton.name", "en_US", "Crawling Skeleton");
		LanguageRegistry.instance().addStringLocalization("entity.Hydrolisc.name", "en_US", "Hydrolisc");
	}

	public void addSpawn()
	{
		EntityRegistry.addSpawn(EntityBee.class, 5, 1, 2, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.desert});
		EntityRegistry.addSpawn(EntityHydrolisc.class, 5, 1, 3, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.beach});
		EntityRegistry.addSpawn(EntityJellyfish.class, 5, 1, 2, EnumCreatureType.waterCreature, new BiomeGenBase[]{BiomeGenBase.ocean});
		EntityRegistry.addSpawn(EntityStalker.class, 5, 1, 2, EnumCreatureType.monster, new BiomeGenBase[]{BiomeGenBase.plains, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga});
		EntityRegistry.addSpawn(EntityZombieCrawling.class, 5, 1, 2, EnumCreatureType.monster, new BiomeGenBase[]{BiomeGenBase.plains, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga});
		EntityRegistry.addSpawn(EntityCrawlingSkeleton.class, 5, 1, 2, EnumCreatureType.monster, new BiomeGenBase[]{BiomeGenBase.plains, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga});
		EntityRegistry.addSpawn(EntitySeaCreeper.class, 5, 1, 2, EnumCreatureType.waterCreature, new BiomeGenBase[]{BiomeGenBase.ocean});
	}
}