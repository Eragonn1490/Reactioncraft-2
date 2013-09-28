package Reactioncraft.ore;

import Reactioncraft.ore.client.ClientProxy;
import Reactioncraft.ore.common.CommonProxy;
import Reactioncraft.ore.common.*;
import ic2.api.item.Items;
import java.io.File;
import Reactioncraft.integration.*;
import Reactioncraft.basefiles.common.*;
import Reactioncraft.basemod.RCB;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Property;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.FMLLog;
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

@Mod( modid = "rcores", name="Reactioncraft ORES", version="[1.6.4] Reactioncraft 3 Version 1.1.4", dependencies="after:rcbdm")
@NetworkMod(channels = { "RCORES" }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)

public class RCORES
{
	@SidedProxy(clientSide = "Reactioncraft.ore.client.ClientProxy", serverSide = "Reactioncraft.ore.common.CommonProxy")

	public static CommonProxy proxy;

	@Instance("RCORES")
	public static RCORES instance;

	//Config
	//Blocks
	public static int surfaceOresID;
	public static int netherOresID;
	public static int endOresID;

	//Items
	public static int goldrodIID;
	public static int obsidianingotIID;
	public static int ingotbloodstoneIID;
	public static int ingotsilverIID;
	public static int bloodstonedustIID;
	public static int blackdiamondIID;
	public static int dragonstoneshardIID;
	public static int irondustIID;
	public static int gemdragonstoneIID;
	public static int superheatedironingotIID;
	public static int goldDustIID;


	//Items
	public static Item goldrod;
	public static Item obsidianingot;
	public static Item ingotbloodstone;
	public static Item ingotsilver;
	public static Item bloodstonedust;
	public static Item blackdiamond;
	public static Item dragonstoneshard;
	public static Item irondust;
	public static Item gemdragonstone;
	public static Item superheatedironingot;
	public static Item goldDust;

	//Blocks
	public static Block surfaceOres;
	public static Block netherOres;
	public static Block endOres;

	public static Property genBloodstone;
	public static Property genBlackdiamond;
	public static Property genDragonstone;
	public static Property genNethergold;
	public static Property genNetherdiamond;
	public static Property genSilver;
	public static Property genVentinite;

	//Config
	public static ReactioncraftConfiguration config;

	public static boolean RCBDM() throws ClassNotFoundException 
	{
		try
		{
			Class.forName("Reactioncraft.desert.RCBDM");
		}
		catch (NoClassDefFoundError ex) 
		{
			return false ;
		}
		return true ;
	}

	public static boolean IC2() throws ClassNotFoundException 
	{
		try{
			Class.forName("ic2.core.IC2");
		}
		catch (NoClassDefFoundError ex) {
			return false ;
		}
		return true ;
	}


	@EventHandler
	public void preInit(FMLPreInitializationEvent var1)
	{
		System.out.println("[RCORES] Pre Initialization Loaded");

		config = new ReactioncraftConfiguration(new File(var1.getModConfigurationDirectory(), "Reactioncraft/Ores.cfg"));

		try 
		{
			config.load();

			//Claimed Block IDs 3074 - 3080
			surfaceOresID = config.getBlock("Surface Ores", 3074).getInt();
			netherOresID = config.getBlock("Nether Ores", 3075).getInt();
			endOresID = config.getBlock("End Ores", 3076).getInt();


			//Item Ids 10851 - 10860
			goldrodIID = config.getItem("Golden Stick", 10851).getInt();
			obsidianingotIID = config.getItem("Obsidian Ingot", 10852).getInt();
			ingotbloodstoneIID = config.getItem("Bloodstone Ingot", 10853).getInt();
			ingotsilverIID = config.getItem("Silver Ingot", 10854).getInt();
			bloodstonedustIID = config.getItem("Bloodstone Dust", 10855).getInt();
			blackdiamondIID = config.getItem("Black Diamond", 10856).getInt();
			dragonstoneshardIID = config.getItem("Dragonstone Shard", 10857).getInt();
			irondustIID = config.getItem("Iron Dust", 10858).getInt();
			gemdragonstoneIID = config.getItem("Gem Dragonstone", 10859).getInt();
			superheatedironingotIID = config.getItem("Superheated Iron", 10860).getInt();
			goldDustIID = config.getItem("Gold Dust", 10950).getInt();
			
			genBloodstone    = config.get("Ore Generation", "Generate Bloodstone", true);
			genBlackdiamond  = config.get("Ore Generation", "Generate Black Diamond", true);
			genDragonstone   = config.get("Ore Generation", "Generate Dragonstone", true);
			genNethergold    = config.get("Ore Generation", "Generate Nether Gold", true);
			genNetherdiamond = config.get("Ore Generation", "Generate Nether Diamond", true);
			genSilver        = config.get("Ore Generation", "Generate Silver", true);
			genVentinite     = config.get("Ore Generation", "Generate Ventinite", true);
			
			genBloodstone.comment    = "If this is true Bloodstone will appear in the nether, if false no other ores can generate :<";
			genBlackdiamond.comment  = "If this is true Black diamond will appear in the nether (required for black diamond borehead)";
			genDragonstone.comment   = "If this is true Dragonstone will appear in the nether (required for bloodstone sword)";
			genNethergold.comment    = "If this is true Nether gold will appear in the nether";
			genNetherdiamond.comment = "If this is true Nether Diamond will appear in the nether";
			genSilver.comment        = "If this is true Silver Ore will appear on the surface";
			genVentinite.comment     = "If this is true Ventinite will appear on the surface";
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
		registry();
		items();
		recipes();
		language();
		oreDictionary();
		furnaceRecipes();
		forgeevents();
		
		//IC2 integration
		try 
		{
			if(IC2())
			{
				Integration.loadIndustrialCraft();
				System.out.println("IC2 macerator recipe enabled");
			}
		}
		catch (ClassNotFoundException e)	
		{
			System.out.println(" Reactioncraft Ores did not find IC2, macerator recipe disabled");
		}

		//Reactioncraft integration
		try 
		{
			if(RCBDM())
			{
				Integration.loadReactioncraftBDM();
				System.out.println("Reactioncraft Chisel Mod enabled");
			}
		}
		catch (ClassNotFoundException e)	
		{
			System.out.println(" Reactioncraft Ores did not find Reactioncraft Better Desert Mod, Chisel recipes disabled");
		}
	}

	private void forgeevents() 
	{
		MinecraftForge.setBlockHarvestLevel(RCORES.netherOres,  0,   "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(RCORES.surfaceOres, 1,   "pickaxe", 4);

		ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CORRIDOR, new WeightedRandomChestContent(new ItemStack(RCORES.dragonstoneshard), 1, 10, 25));			

		//World Gen Handlers
		GameRegistry.registerWorldGenerator(new WorldGenHandler());
		GameRegistry.registerWorldGenerator(new WorldGenerator());

		//Setting Harvest Level
		MinecraftForge.setBlockHarvestLevel(RCORES.netherOres,     "pickaxe", 4);
	}

	private void furnaceRecipes() 
	{		
		//Furnace stuff 

		//Silver to Silver Ingot
		FurnaceRecipes.smelting().addSmelting(RCORES.surfaceOres.blockID, 0, new ItemStack(RCORES.ingotsilver.itemID, 1, 0), 0.5F);

		//Bloodstone to Bloodstone Ingot
		FurnaceRecipes.smelting().addSmelting(RCORES.netherOres.blockID, 0, new ItemStack(RCORES.ingotbloodstone.itemID, 1, 0), 0.5F);

		//Gold rod to gold ingot
		GameRegistry.addSmelting(RCORES.goldrod.itemID, new ItemStack(Item.ingotGold.itemID, 2, 0), 0.5F);

		//Bloodstone dust to bloodstone ingot
		GameRegistry.addSmelting(RCORES.bloodstonedust.itemID, new ItemStack(RCORES.ingotbloodstone.itemID, 1, 0), 0.5F);

		//Obsidian to obsidian ingot
		GameRegistry.addSmelting(Block.obsidian.blockID, new ItemStack(RCORES.obsidianingot.itemID, 1, 0), 0.5F);

		//Nether Gold to Gold Ingot
		FurnaceRecipes.smelting().addSmelting(RCORES.netherOres.blockID, 4, new ItemStack(Item.ingotGold.itemID, 1, 1), 0.5F);

		//Iron Dust to Superheated Iron
		GameRegistry.addSmelting(RCORES.irondust.itemID, new ItemStack(RCORES.superheatedironingot.itemID, 2, 0), 0.5F);
	}

	private void oreDictionary() 
	{
		//Ore Dictionary
		//Items
		OreDictionary.registerOre("goldRod", new ItemStack(RCORES.goldrod));
		OreDictionary.registerOre("ingotObsidian", new ItemStack(RCORES.obsidianingot));
		OreDictionary.registerOre("diamondBlack", new ItemStack(RCORES.blackdiamond));
		OreDictionary.registerOre("ingotBloodstone", new ItemStack(RCORES.ingotbloodstone));
		OreDictionary.registerOre("ingotSilver", new ItemStack(RCORES.ingotsilver));
		OreDictionary.registerOre("ingotSuperheatediron", new ItemStack(superheatedironingot));
		//OreDictionary.registerOre("gemWizimite", new ItemStack(OreItems,1, 5));
		OreDictionary.registerOre("ironDust", new ItemStack(RCORES.irondust));
		OreDictionary.registerOre("shardDragonstone", new ItemStack(RCORES.dragonstoneshard));
		OreDictionary.registerOre("gemDragonstone", new ItemStack(RCORES.gemdragonstone));
		OreDictionary.registerOre("dustGold", new ItemStack(RCORES.goldDust));

		//For Dyes
		OreDictionary.registerOre("dyePurple", new ItemStack(RCORES.dragonstoneshard));
		
		//Blocks
		OreDictionary.registerOre("oreBloodstone", new ItemStack(RCORES.netherOres, 1, 0));
		OreDictionary.registerOre("oreNetherBlackDiamond", new ItemStack(RCORES.netherOres, 1, 1));
		OreDictionary.registerOre("oreNetherDragonstone", new ItemStack(RCORES.netherOres, 1, 2));
		OreDictionary.registerOre("oreNetherDiamondOre", new ItemStack(RCORES.netherOres, 1, 3));
		OreDictionary.registerOre("oreNetherGoldOre", new ItemStack(RCORES.netherOres, 1, 4));
	}

	private void registry() 
	{
		//Ore Registration
		GameRegistry.registerBlock(surfaceOres, ItemMulti.class, "surfaceOres");
		GameRegistry.registerBlock(netherOres, ItemMulti.class, "netherOres");
		GameRegistry.registerBlock(endOres, ItemMulti.class, "endOres");
	}

	private void language() 
	{
		IntegratedLanguageFile.loadOrenames();
	}

	private void recipes() 
	{	
		//Recipes
		GameRegistry.addRecipe(new ItemStack(goldrod, 1, 0), new Object[]{"D", "D", Character.valueOf('D'), Item.ingotGold});
	}

	private void blocks() 
	{
		//Blocks
		surfaceOres = new BlockSOMulti(surfaceOresID, Material.rock).setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("surfaceOres");
		netherOres = new BlockNOMulti(netherOresID, Material.rock).setHardness(80.0F).setResistance(2000.0F).setUnlocalizedName("netherOres");
		endOres = new BlockEOMulti(endOresID, Material.rock).setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("endOres");
	}

	private void items() 
	{
		//Items
		goldrod = new ItemBasic(goldrodIID).setUnlocalizedName("rcores:goldstick").setTextureName("rcores:goldstick").setCreativeTab(RCB.ReactioncraftItems);
		obsidianingot = new ItemBasic(obsidianingotIID).setUnlocalizedName("rcores:obsidianingot").setTextureName("rcores:obsidianingot").setCreativeTab(RCB.ReactioncraftItems);
		ingotbloodstone = new ItemBasic(ingotbloodstoneIID).setUnlocalizedName("rcores:bloodstoneingot").setTextureName("rcores:bloodstoneingot").setCreativeTab(RCB.ReactioncraftItems);
		ingotsilver = new ItemBasic(ingotsilverIID).setUnlocalizedName("rcores:silveringot").setTextureName("rcores:silveringot").setCreativeTab(RCB.ReactioncraftItems);
		superheatedironingot = new ItemBasic(superheatedironingotIID).setUnlocalizedName("rcores:shironingot").setTextureName("rcores:shironingot").setCreativeTab(RCB.ReactioncraftItems);
		bloodstonedust = new ItemBasic(bloodstonedustIID).setUnlocalizedName("rcores:bloodstonedust").setTextureName("rcores:bloodstonedust").setCreativeTab(RCB.ReactioncraftItems);
		blackdiamond = new ItemBasic(blackdiamondIID).setUnlocalizedName("rcores:blackdiamond").setTextureName("rcores:blackdiamond").setCreativeTab(RCB.ReactioncraftItems);
		dragonstoneshard = new ItemBasic(dragonstoneshardIID).setUnlocalizedName("rcores:dragonstoneshard").setTextureName("rcores:dragonstoneshard").setCreativeTab(RCB.ReactioncraftItems);
		irondust = new ItemBasic(irondustIID).setUnlocalizedName("rcores:irondust").setTextureName("rcores:irondust").setCreativeTab(RCB.ReactioncraftItems);
		gemdragonstone = new ItemBasic(gemdragonstoneIID).setUnlocalizedName("rcores:gemdragonstone").setTextureName("rcores:gemdragonstone").setCreativeTab(RCB.ReactioncraftItems);
		goldDust = new ItemBasic(goldDustIID).setUnlocalizedName("rcores:golddust").setTextureName("rcores:golddust").setCreativeTab(RCB.ReactioncraftItems);
	}

	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent evt)
	{
		FMLLog.info("Reactioncraft Ores Has Fully loaded...Time to Mine!");
	} 
}
