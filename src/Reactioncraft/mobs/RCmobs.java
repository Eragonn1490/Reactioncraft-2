package Reactioncraft.mobs;

import java.io.File;
import Reactioncraft.integration.*;
import Reactioncraft.basefiles.common.*;
import Reactioncraft.basefiles.common.PacketHandler;
import Reactioncraft.basemod.RCB;
import Reactioncraft.mobs.client.ClientProxy;
import Reactioncraft.mobs.common.*;
import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import forestry.api.core.ItemInterface;
import forestry.api.recipes.RecipeManagers;

@Mod(modid = "rcmobs", name="Reactioncraft Mobs Mod", version="[1.6.4] Reactioncraft 3 Version 1.1.4", dependencies="required-after:FML@[4.2.18,);after:Forestry")

@NetworkMod(channels = { "RCmobs" }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)

public class RCmobs 
{
	@SidedProxy(clientSide = "Reactioncraft.mobs.client.ClientProxy", serverSide = "Reactioncraft.mobs.common.CommonProxy")
	
	public static Reactioncraft.mobs.common.CommonProxy proxy;

	@Instance("RCmobs")
	public static RCmobs instance;

	//Config Start
	//public static int JellyfishIID;
	//public static int RcBeeIID;
	public static int hiveID;
	public static int bonesIID;
	public static int scoopIID;
	public static int frameBloodstoneIID;
	public static int honeycombIID;
	public static int pollencombIID;
	
	//Block start
	public static Block rchive;
	
	//Item Start
	//public static Item Jellyfish;
	//public static Item RcBee;
	public static Item bones;
	public static Item scoop;
	public static Item hiveframe;
	public static Item honeycomb;
	public static Item pollencomb;
	
	//Config
	public static ReactioncraftConfiguration config;

	@EventHandler
	public void preInit(FMLPreInitializationEvent evt)
	{
		System.out.println("[RCMOBS] Pre Initialization Loaded");
		
		config = new ReactioncraftConfiguration(new File(evt.getModConfigurationDirectory(), "Reactioncraft/Mobs.cfg"));

		try 
		{
			config.load();
			
			//Blocks 3090 (Tracker Jacker Hive)
			hiveID = config.getBlock("Hive Block", 3090).getInt();
			
			//10820 - 10840
			//JellyfishIID = config.getItem("Jellyfish", 10820).getInt();
			//RcBeeIID = config.getItem("Reactioncraft Bee", 10821).getInt();
			bonesIID = config.getItem("Bones", 10822).getInt();
			scoopIID = config.getItem("Scoop", 10823).getInt();
			frameBloodstoneIID = config.getItem("Bloodstone Frame", 10824).getInt();
			honeycombIID = config.getItem("Honey Comb", 10825).getInt();
			pollencombIID = config.getItem("Pollen Comb", 10826).getInt();
		}

		finally 
		{
			if (config.hasChanged()) 
			{
				config.save();
			}
		}
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		ClientProxy.registerRenderInformation();
		blocks();
		registerGlobal();
		registerEntities();
		addSpawn();
		items();
		langRegistry();
		recipes();
		chestGenHooks();
		MinecraftForge.EVENT_BUS.register(new Event_LivingBoneDrops());
		GameRegistry.registerWorldGenerator(new WorldGenHiveTree());
		MinecraftForge.EVENT_BUS.register(new EventHookContainerClass());
	}

	private void blocks() 
	{
		rchive = new BlockHive(hiveID).setHardness(1.0F).setResistance(15.0F).setStepSound(Block.soundWoodFootstep).setLightValue(0.001F).setUnlocalizedName("hive");
		GameRegistry.registerBlock(rchive, "rchive");
		MinecraftForge.setBlockHarvestLevel(RCmobs.rchive, 0, "scoop", 0);
	}

	private void chestGenHooks() 
	{	
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent(new ItemStack(RCmobs.hiveframe, 1, 0), 1, 2, 5));
	}

	public void recipes() 
	{
		OreDictionary.registerOre("bones", new ItemStack(RCmobs.bones));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.dyePowder, 2, 15), true, new Object[]{"Y", Character.valueOf('Y'), "bones"}));
		
		//Forestry Support
		 if (Loader.isModLoaded("Forestry"))
		 {
			 ItemStack pollen = ItemInterface.getItem("pollen");
			 ItemStack honeyDrop = ItemInterface.getItem("honeyDrop");
			 
			 System.out.println("[Foresty] has loaded, [2] centrifuge recipes loaded");
			 
			 RecipeManagers.centrifugeManager.addRecipe(20, new ItemStack(RCmobs.honeycomb, 1, 0), new ItemStack(pollen.itemID, 1, 0), new ItemStack(honeyDrop.itemID, 1, 0), 90);
			 RecipeManagers.centrifugeManager.addRecipe(20, new ItemStack(RCmobs.pollencomb, 1, 0), new ItemStack(pollen.itemID, 1, 0), new ItemStack(pollen.itemID, 1, 0), 90);
		 }
	}

	public void langRegistry() 
	{
		IntegratedLanguageFile.loadMobitemnames();
	}

	public void items() 
	{
		//Jellyfish  = (new ItemBasic(JellyfishIID)).setUnlocalizedName("Jellyfish");
		//RcBee  = (new ItemBee(RcBeeIID)).setUnlocalizedName("RcBee");
		//OreDictionary.registerOre("jellyfish", new ItemStack(Jellyfish));
		bones = new ItemBasic(bonesIID).setUnlocalizedName("rcmobs:bones").setTextureName("rcmobs:bones").setCreativeTab(RCB.ReactioncraftItems);
		honeycomb = new ItemBasic(honeycombIID).setUnlocalizedName("rcmobs:honeycomb").setTextureName("rcmobs:honeycomb").setCreativeTab(RCB.ReactioncraftItems);
		pollencomb = new ItemBasic(pollencombIID).setUnlocalizedName("rcmobs:pollencomb").setTextureName("rcmobs:pollencomb").setCreativeTab(RCB.ReactioncraftItems);
		scoop = new ItemScoop(scoopIID).setUnlocalizedName("rcmobs:bsscoop").setTextureName("rcmobs:bsscoop").setMaxStackSize(1);
		MinecraftForge.setToolClass(RCmobs.scoop, "scoop", 3);
		
		hiveframe = new ItemHiveFrame(frameBloodstoneIID, 1440, 0.1F).setUnlocalizedName("rcmobs:bloodstoneframe").setTextureName("rcmobs:bloodstoneframe");
	}

	public void registerEntities()
	{
		EntityRegistry.registerGlobalEntityID(EntityBee.class, "Bee", EntityRegistry.findGlobalUniqueEntityId(), 0x333333, 0x999999);
		EntityRegistry.registerGlobalEntityID(EntityJellyfish.class, "Jellyfish", EntityRegistry.findGlobalUniqueEntityId(), 0x333333, 0x999999);
		EntityRegistry.registerGlobalEntityID(EntitySeaCreeper.class, "Sea Creeper", EntityRegistry.findGlobalUniqueEntityId(), 0x333333, 0x999999);
		EntityRegistry.registerGlobalEntityID(EntityStalker.class, "Stalker", EntityRegistry.findGlobalUniqueEntityId(), 0x333333, 0x999999);
		//EntityRegistry.registerGlobalEntityID(EntityHydrolisc.class, "Hydrolisc", EntityRegistry.findGlobalUniqueEntityId(), 0x333333, 0x999999);
		EntityRegistry.registerGlobalEntityID(EntityZombieCrawling.class, "Crawling Zombie", EntityRegistry.findGlobalUniqueEntityId(), 0x333313, 0x998991);
		EntityRegistry.registerGlobalEntityID(EntitySkeletonCrawling.class, "Crawling Skeleton", EntityRegistry.findGlobalUniqueEntityId(), 0x333313, 0x998991);
		
		//Special Mobs
		EntityRegistry.registerGlobalEntityID(EntityTJ.class, "Tracker Jacker", EntityRegistry.findGlobalUniqueEntityId(), 0x335313, 0x998991);
	}
	

	public void registerGlobal()
	{
		IntegratedLanguageFile.loadMobeggNames();
	}

	public void addSpawn()
	{
		EntityRegistry.addSpawn(EntityBee.class, 5, 1, 2, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.desert, BiomeGenBase.taiga, BiomeGenBase.jungle});
		//EntityRegistry.addSpawn(EntityHydrolisc.class, 5, 1, 3, EnumCreatureType.creature, new BiomeGenBase[]{BiomeGenBase.beach});
		EntityRegistry.addSpawn(EntityJellyfish.class, 5, 1, 2, EnumCreatureType.waterCreature, new BiomeGenBase[]{BiomeGenBase.ocean});
		EntityRegistry.addSpawn(EntityStalker.class, 5, 1, 2, EnumCreatureType.monster, new BiomeGenBase[]{BiomeGenBase.plains, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga});
		EntityRegistry.addSpawn(EntitySeaCreeper.class, 5, 1, 2, EnumCreatureType.waterCreature, new BiomeGenBase[]{BiomeGenBase.ocean});
		EntityRegistry.addSpawn(EntityZombieCrawling.class, 5, 1, 2, EnumCreatureType.monster, new BiomeGenBase[]{BiomeGenBase.plains, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga});
		EntityRegistry.addSpawn(EntitySkeletonCrawling.class, 5, 1, 2, EnumCreatureType.monster, new BiomeGenBase[]{BiomeGenBase.plains, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga});
		
		//Special Mobs (Removed in favor of faster stracker jackers that can be spawned through messing with there hives)
		//EntityRegistry.addSpawn(EntityTJ.class, 5, 1, 2, EnumCreatureType.monster, new BiomeGenBase[]{BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga});
		
		//BiomeDictionary Spawning
		BiomeGenBase[] biomes = BiomeDictionary.getBiomesForType(Type.FOREST);
		
		SpawnListEntry zombiecrawlingSpawn = new SpawnListEntry(EntityZombieCrawling.class, 5, 1, 2);
		SpawnListEntry skeletoncrawlingSpawn = new SpawnListEntry(EntitySkeletonCrawling.class, 5, 1, 2);

		for(int i = 0; i < biomes.length; i++)
		{
		    if(BiomeDictionary.isBiomeOfType(biomes[i], Type.DESERT))
		    {
		        biomes[i].getSpawnableList(EnumCreatureType.monster).add(zombiecrawlingSpawn);
		        biomes[i].getSpawnableList(EnumCreatureType.monster).add(skeletoncrawlingSpawn);
		    }
		}
	}
	
	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent evt)
	{	
		BiomeDictionary.registerAllBiomes();
	}
}