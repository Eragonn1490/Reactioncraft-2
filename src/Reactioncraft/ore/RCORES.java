package Reactioncraft.ore;

import java.io.File;
import Reactioncraft.Integration.Integration;
import Reactioncraft.basefiles.common.*;
import Reactioncraft.basemod.RCB;
import Reactioncraft.ore.client.ClientProxy;
import Reactioncraft.ore.common.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
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

@Mod( modid = "RCORES", name="Reactioncraft ORES", version="[1.5.2] Reactioncraft Version 8.0")
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

	//Blocks
	public static Block surfaceOres;
	public static Block netherOres;
	public static Block endOres;

	//Config
	public static ReactioncraftConfiguration config;

	public static boolean RCBDM() throws ClassNotFoundException 
	{
		try
		{
			Class.forName("Reactioncraft.Desert.common.RCBDM");
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


	@PreInit
	public void preInit(FMLPreInitializationEvent var1)
	{
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
		ClientProxy.registerRenderInformation();

		//Blocks
		surfaceOres = new BlockSOMulti(surfaceOresID, Material.rock).setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("surfaceOres");
		netherOres = new BlockNOMulti(netherOresID, Material.rock).setHardness(80.0F).setResistance(2000.0F).setUnlocalizedName("netherOres");
		endOres = new BlockEOMulti(endOresID, Material.rock).setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("endOres");

		//Items
		goldrod = new ItemBasic(goldrodIID).setUnlocalizedName("RCORES:goldstick").setCreativeTab(RCB.ReactioncraftItems);
		obsidianingot = new ItemBasic(obsidianingotIID).setUnlocalizedName("RCORES:obsidianingot").setCreativeTab(RCB.ReactioncraftItems);
		ingotbloodstone = new ItemBasic(ingotbloodstoneIID).setUnlocalizedName("RCORES:bloodstoneingot").setCreativeTab(RCB.ReactioncraftItems);
		ingotsilver = new ItemBasic(ingotsilverIID).setUnlocalizedName("RCORES:silveringot").setCreativeTab(RCB.ReactioncraftItems);
		bloodstonedust = new ItemBasic(bloodstonedustIID).setUnlocalizedName("RCORES:bloodstonedust").setCreativeTab(RCB.ReactioncraftItems);
		blackdiamond = new ItemBasic(blackdiamondIID).setUnlocalizedName("RCORES:blackdiamond").setCreativeTab(RCB.ReactioncraftItems);
		dragonstoneshard = new ItemBasic(dragonstoneshardIID).setUnlocalizedName("RCORES:dragonstoneshard").setCreativeTab(RCB.ReactioncraftItems);
		irondust = new ItemBasic(irondustIID).setUnlocalizedName("RCORES:irondust").setCreativeTab(RCB.ReactioncraftItems);
		gemdragonstone = new ItemBasic(gemdragonstoneIID).setUnlocalizedName("RCORES:gemdragonstone").setCreativeTab(RCB.ReactioncraftItems);
		
		

		//Recipes
		GameRegistry.addRecipe(new ItemStack(goldrod, 1, 0), new Object[]{"D", "D", Character.valueOf('D'), Item.ingotGold});


		//Ore Registration
		GameRegistry.registerBlock(surfaceOres, ItemMulti.class, "surfaceOres");
		GameRegistry.registerBlock(netherOres, ItemMulti.class, "netherOres");
		GameRegistry.registerBlock(endOres, ItemMulti.class, "endOres");


		//Ore Items
		LanguageRegistry.addName(RCORES.goldrod, "Golden Rod"); 
		LanguageRegistry.addName(RCORES.obsidianingot, "Obsidian Ingot"); 
		LanguageRegistry.addName(RCORES.blackdiamond, "Black Diamond"); 
		LanguageRegistry.addName(RCORES.ingotbloodstone, "Bloodstone Ingot"); 
		LanguageRegistry.addName(RCORES.ingotsilver, "Silver Ingot"); 
		//LanguageRegistry.addName(RCORES.OreItems, "End Gem");
		LanguageRegistry.addName(RCORES.bloodstonedust, "Bloodstone Dust");  
		LanguageRegistry.addName(RCORES.dragonstoneshard, "Dragonstone Shard");
		LanguageRegistry.addName(RCORES.gemdragonstone, "Carved Dragonstone");
		//LanguageRegistry.addName(RCORES.OreItems, "Superheated Iron Ingot"); 
		LanguageRegistry.addName(RCORES.irondust, "Iron Dust");


		//Surface Ores
		LanguageRegistry.addName(new ItemStack(RCORES.surfaceOres, 1, 0), "Silver");
		LanguageRegistry.addName(new ItemStack(RCORES.surfaceOres, 1, 1), "Magma");


		//Nether Ores
		LanguageRegistry.addName(new ItemStack(RCORES.netherOres, 1, 0), "Bloodstone");
		LanguageRegistry.addName(new ItemStack(RCORES.netherOres, 1, 1), "Black Diamond");
		LanguageRegistry.addName(new ItemStack(RCORES.netherOres, 1, 2), "Dragonstone");
		LanguageRegistry.addName(new ItemStack(RCORES.netherOres, 1, 3), "Nether Diamond");
		LanguageRegistry.addName(new ItemStack(RCORES.netherOres, 1, 4), "Nether Gold");

		//End Ores
		LanguageRegistry.addName(new ItemStack(RCORES.endOres, 1, 0), "Wizimite");

		MinecraftForge.setBlockHarvestLevel(RCORES.netherOres, 0,   "pickaxe", 4);

		//Ore Dictionary
		//Items
		OreDictionary.registerOre("goldRod", new ItemStack(RCORES.goldrod));
		OreDictionary.registerOre("ingotObsidian", new ItemStack(RCORES.obsidianingot));
		OreDictionary.registerOre("diamondBlack", new ItemStack(RCORES.blackdiamond));
		OreDictionary.registerOre("ingotBloodstone", new ItemStack(RCORES.ingotbloodstone));
		OreDictionary.registerOre("ingotSilver", new ItemStack(RCORES.ingotsilver));
		//OreDictionary.registerOre("ingotSuperheatediron", new ItemStack(OreItems,1, 9));
		//OreDictionary.registerOre("gemWizimite", new ItemStack(OreItems,1, 5));
		OreDictionary.registerOre("ironDust", new ItemStack(RCORES.irondust));
		OreDictionary.registerOre("shardDragonstone", new ItemStack(RCORES.dragonstoneshard));
		OreDictionary.registerOre("gemDragonstone", new ItemStack(RCORES.gemdragonstone));


		//Blocks
		OreDictionary.registerOre("oreBloodstone", new ItemStack(RCORES.netherOres, 1, 0));


		ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_CORRIDOR, new WeightedRandomChestContent(new ItemStack(RCORES.dragonstoneshard), 1, 10, 25));			
		
		
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
		//FurnaceRecipes.smelting().addSmelting(RCORES.irondust.itemID, 10, new ItemStack(RCORES.superheatediron.itemID, 1, 9), 0.5F);


		//World Gen Handlers
		GameRegistry.registerWorldGenerator(new WorldGenHandler());

		//Setting Harvest Level
		MinecraftForge.setBlockHarvestLevel(RCORES.netherOres,     "pickaxe", 4);

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

	@PostInit
	public void modsLoaded(FMLPostInitializationEvent evt)
	{
		FMLLog.info("Reactioncraft Ores Has Fully loaded...Time to Mine!");
	} 
}
