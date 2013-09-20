package Reactioncraft.plants;

import java.io.File;
import Reactioncraft.plants.client.ClientProxy;
import Reactioncraft.plants.common.CommonProxy;
import Reactioncraft.integration.*;
import Reactioncraft.basefiles.common.PacketHandler;
import Reactioncraft.basefiles.common.*;
import Reactioncraft.basemod.RCB;
import Reactioncraft.plants.common.*;
import net.minecraft.block.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
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
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod( modid = "rcpm", name="Reactioncraft Plants", version="[1.6.2] Reactioncraft 3 Version 1.1.2")
@NetworkMod(channels = { "RCPM" }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)

public class RCPM
{
	@SidedProxy(clientSide = "Reactioncraft.plants.client.ClientProxy", serverSide = "Reactioncraft.plants.common.CommonProxy")

	public static CommonProxy proxy;

	@Instance("RCPM")
	public static RCPM instance;

	//config for blocks
	//public static int CocoCropID;
	public static int AncientPlantID;
	public static int sugarcaneBlockID;
	public static int cornStalkID;

	//config for items
	public static int AncientFruitIID;
	public static int AncientSeedsIID;
	//public static int CocoSeedIID;
	//public static int CocoBeanIID;
	//public static int VanillaSeedIID;
	//public static int VanillaBeanIID;
	public static int sugarcaneItemIID;
	public static int cornBlockID;
	public static int AncientFlowerIID;
	public static int WrappedcornIID;
	public static int CornSeedIID;
	public static int stalksItemIID;


	//Blocks
	//public static Block CocoCrop;
	public static Block AncientPlant;
	public static Block sugarcaneBlock;
	public static Block cornBlock;
	public static Block cornStalk;

	//Items
	public static Item AncientFruit;
	//public static Item CocoBean;
	//public static Item VanillaBean;
	public static Item AncientFlower;
	public static Item Wrappedcorn;

	//Seeds
	public static Item AncientSeeds;
	//public static Item CocoSeed;
	//public static Item VanillaSeed;
	public static Item sugarcaneItem;
	public static Item CornSeed;
	public static Item stalksItem;

	//Config
	public static ReactioncraftConfiguration config;

	@EventHandler
	public void preInit(FMLPreInitializationEvent evt)
	{
		System.out.println("[RCPM] Pre Initialization Loaded");

		MinecraftForge.EVENT_BUS.register(new RCPMBonemealProvider());

		config = new ReactioncraftConfiguration(new File(evt.getModConfigurationDirectory(), "Reactioncraft/Plants.cfg"));

		try 
		{
			config.load();

			//Claimed IDs 3081 - 3089 (3090 given to mobs mod for tracker jacker hive)
			//CocoCropID = config.getBlock("Coco Crop", 3081).getInt();
			AncientPlantID = config.getBlock("Ancient Plant", 3082).getInt();
			sugarcaneBlockID = config.getBlock("Sugar Cane", 3083).getInt();
			cornBlockID = config.getBlock("corn Block", 3084).getInt();
			cornStalkID = config.getBlock("corn Stalk", 3085).getInt();


			//10861 - 10880
			AncientSeedsIID = config.getItem("Ancient Seeds", 10861).getInt();
			AncientFruitIID = config.getItem("Ancient Fruit", 10862).getInt();
			//CocoSeedIID = config.getItem("Coco Seed", 10863).getInt();
			//CocoBeanIID = config.getItem("Coco Bean", 10864).getInt();
			//VanillaSeedIID = config.getItem("Vanilla Seed", 10865).getInt();
			//VanillaBeanIID = config.getItem("Vanilla Bean", 10866).getInt();
			sugarcaneItemIID = config.getItem("Sugar Cane Item", 10967).getInt();
			WrappedcornIID = config.getItem("Wrapped Corn", 10868).getInt();
			CornSeedIID = config.getItem("Corn Seed", 10869).getInt();
			stalksItemIID = config.getItem("stalksItem", 10870).getInt();
			AncientFlowerIID = config.getItem("Ancient Flower", 10871).getInt();

			//Claimed Item ids 10301 - 10400 
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
		//the meat of the mod
		//Claimed Block Ids 3081 - 3099
		proxy.registerRenderInformation();
		blocks();
		registry();
		items();
		recipes();
		lang();
		forgeevents();
		smelting();
	}


	private void smelting() 
	{
		//GameRegistry.addSmelting(CocoSeed.itemID, new ItemStack(CocoBean), 0.1F); 
	}


	private void forgeevents() 
	{
		//Ore Dict
		//OreDictionary.registerOre("cocoBean", new ItemStack(CocoBean));
		OreDictionary.registerOre("wrappedCorn", new ItemStack(Wrappedcorn));

		//To aquire ancient plant seeds
		//ChestGenHooks.addItem(ChestGenHooks.VILLAGE_BLACKSMITH, new WeightedRandomChestContent(lootStack, minStackSize, maxStackSize, chance));
		ChestGenHooks.addItem(ChestGenHooks.BONUS_CHEST, new WeightedRandomChestContent(new ItemStack(RCPM.AncientFruit), 1, 2, 5));
		ChestGenHooks.addItem(ChestGenHooks.MINESHAFT_CORRIDOR, new WeightedRandomChestContent(new ItemStack(RCPM.AncientFruit), 1, 5, 15));
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST, new WeightedRandomChestContent(new ItemStack(RCPM.AncientFruit), 1, 5, 15));

		//Ancient Flower
		ChestGenHooks.addItem(ChestGenHooks.BONUS_CHEST, new WeightedRandomChestContent(new ItemStack(RCPM.AncientFlower), 1, 2, 5));
		ChestGenHooks.addItem(ChestGenHooks.MINESHAFT_CORRIDOR, new WeightedRandomChestContent(new ItemStack(RCPM.AncientFlower), 1, 5, 15));
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST, new WeightedRandomChestContent(new ItemStack(RCPM.AncientFlower), 1, 5, 15));

		//Corn
		MinecraftForge.addGrassSeed(new ItemStack(RCPM.CornSeed), 1);
		ChestGenHooks.addItem(ChestGenHooks.BONUS_CHEST, new WeightedRandomChestContent(new ItemStack(RCPM.CornSeed), 1, 2, 5));
		ChestGenHooks.addItem(ChestGenHooks.MINESHAFT_CORRIDOR, new WeightedRandomChestContent(new ItemStack(RCPM.CornSeed), 1, 5, 15));
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST, new WeightedRandomChestContent(new ItemStack(RCPM.CornSeed), 1, 5, 15));

		//Sugarcane
		ChestGenHooks.addItem(ChestGenHooks.BONUS_CHEST, new WeightedRandomChestContent(new ItemStack(RCPM.sugarcaneItem), 1, 2, 5));
		ChestGenHooks.addItem(ChestGenHooks.MINESHAFT_CORRIDOR, new WeightedRandomChestContent(new ItemStack(RCPM.sugarcaneItem), 1, 5, 15));
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST, new WeightedRandomChestContent(new ItemStack(RCPM.sugarcaneItem), 1, 5, 15));
	}


	private void recipes() 
	{
		//MY Taller Sugarcane to Paper & sugar
		GameRegistry.addRecipe(new ItemStack(Item.paper, 3), new Object[] {"###", '#', RCPM.sugarcaneItem});
		GameRegistry.addRecipe(new ItemStack(Item.sugar, 1), new Object[] {"#", '#', RCPM.sugarcaneItem});

		//How to get mutated sugarcane
		GameRegistry.addShapelessRecipe(new ItemStack(sugarcaneItem, 2), new Object[] {AncientFlower, Item.reed});


		//Mojang coco bean to ours... Cooked one to ours (Rewriting this)
		GameRegistry.addShapelessRecipe(new ItemStack(AncientSeeds, 1), new Object[] {AncientFlower});
		GameRegistry.addShapelessRecipe(new ItemStack(AncientSeeds, 2), new Object[] {AncientFruit});

		//Raw Corn to Corn Seeds
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(RCPM.CornSeed, 3), true, new Object[]{"Y", Character.valueOf('Y'), "rawCorn"}));

		//GameRegistry.addRecipe(new ItemStack(CocoSeed, 1), new Object[]{"#", Character.valueOf('#'), CocoBean});
		//GameRegistry.addRecipe(new ItemStack(CocoSeed, 1), new Object[]{"#", Character.valueOf('#'), new ItemStack(Item.dyePowder, 1, 3)});
		//GameRegistry.addRecipe(new ItemStack(Item.cookie, 12), new Object[]{"D#D", Character.valueOf('#'), CocoBean, Character.valueOf('D'), Item.wheat});

	}


	private void registry() 
	{
		//Registry Code
		GameRegistry.registerBlock(cornStalk, "cornStalk");
		GameRegistry.registerBlock(cornBlock, "Corn Block");
		//GameRegistry.registerBlock(CocoCrop, "CocoCrop");
		GameRegistry.registerBlock(AncientPlant, "AncientPlant");
		GameRegistry.registerBlock(sugarcaneBlock, "SugarcaneBlock");
		//GameRegistry.registerItem(sugarcaneItem, "sugarcaneItem"); Never Register Items?
	}


	private void items() 
	{
		//Items
		AncientFlower = new ItemBasic(AncientFlowerIID).setUnlocalizedName("rcpm:AncientFlower").setTextureName("rcpm:AncientFlower").setCreativeTab(RCB.ReactioncraftItems);
		CornSeed = new ItemBasicSeed(CornSeedIID, RCPM.cornStalk.blockID, Block.tilledField.blockID).setUnlocalizedName("rcpm:CornSeed").setTextureName("rcpm:CornSeed").setCreativeTab(RCB.ReactioncraftItems);
		AncientSeeds = new ItemBasicSeed(AncientSeedsIID, RCPM.AncientPlant.blockID, Block.tilledField.blockID).setUnlocalizedName("rcpm:AncientSeeds").setTextureName("rcpm:AncientSeeds").setCreativeTab(RCB.ReactioncraftItems);
		AncientFruit = new ItemBasicFood(AncientFruitIID, 8, true).setUnlocalizedName("rcpm:AncientFruit").setTextureName("rcpm:AncientFruit").setCreativeTab(RCB.Reactioncraftfood);
		//CocoSeed = new ItemBasicSeed(CocoSeedIID, RCPM.CocoCrop.blockID, Block.tilledField.blockID).setUnlocalizedName("CocoSeed");
		//CocoBean = new ItemBasic(CocoBeanIID).setUnlocalizedName("CocoBean");
		//VanillaSeed= new ItemBasic(VanillaSeedIID).setUnlocalizedName("VanillaSeed");
		//VanillaBean= new ItemBasic(VanillaBeanIID).setUnlocalizedName("VanillaBean");
		sugarcaneItem = (new Itemsugarcane(sugarcaneItemIID, RCPM.sugarcaneBlock)).setUnlocalizedName("rcpm:sugarcaneItem").setTextureName("rcpm:sugarcaneItem").setCreativeTab(RCB.ReactioncraftItems);
		stalksItem = (new ItemStalks(stalksItemIID, RCPM.cornBlock)).setUnlocalizedName("rcpm:Stalks").setTextureName("rcpm:Stalks").setCreativeTab(RCB.ReactioncraftItems);
		Wrappedcorn = new ItemBasic(WrappedcornIID).setUnlocalizedName("rcpm:Wrappedcorn").setTextureName("rcpm:Wrappedcorn").setCreativeTab(RCB.Reactioncraftfood);

	}


	private void blocks() 
	{
		//Blocks
		//CocoCrop = new BlockCocoPlant(CocoCropID).setHardness(0.0F).setResistance(1.0F).setUnlocalizedName("CocoCrop");
		AncientPlant = new BlockAncientPlant(AncientPlantID).setHardness(0.0F).setResistance(1.0F);
		sugarcaneBlock = (new BlockReed1(sugarcaneBlockID, 73)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep);
		cornBlock = new BlockCorn(cornBlockID, 40).setHardness(0.0F).setStepSound(Block.soundGrassFootstep);
		cornStalk = new BlockCornStalk(cornStalkID).setHardness(0.0F).setStepSound(Block.soundGrassFootstep);
	}


	private void lang() 
	{
		IntegratedLanguageFile.loadPlantsnames();
	}


	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent evt)
	{
		//new as well! How about that stuff after the mods are loaded/initialized?
	}
}
