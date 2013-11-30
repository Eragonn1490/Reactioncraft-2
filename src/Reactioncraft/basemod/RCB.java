package Reactioncraft.basemod;

import java.io.File;
import Reactioncraft.integration.*;
import Reactioncraft.basemod.client.ClientProxy;
import Reactioncraft.basemod.common.CommonProxy;
import Reactioncraft.basefiles.common.PacketHandler;
import Reactioncraft.basefiles.common.*;
import Reactioncraft.basemod.common.*;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.MinecraftForge;
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

@Mod( modid = "rcb", name="Reactioncraft Base Mod", version="[1.6.4] Reactioncraft 3 Version 1.2.4")
@NetworkMod(channels = { "RCB" }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class, connectionHandler = ConnectionHandler.class)

public class RCB
{
	@SidedProxy(clientSide = "Reactioncraft.basemod.client.ClientProxy", serverSide = "Reactioncraft.basemod.common.CommonProxy")

	public static CommonProxy proxy;

	@Instance("RCB")
	public static RCB instance;


	public static CreativeTabs ReactioncraftItems = new CreativeTabs("ReactioncraftItems") 
	{
		@Override
		public CreativeTabs setBackgroundImageName(String par1Str)
		{
			return ReactioncraftItems.setBackgroundImageName("item_search.png");
		}

		@Override
		public ItemStack getIconItemStack() 
		{
			return new ItemStack(RCB.Mask, 1, 0);
		}

		@Override
		public boolean hasSearchBar()
		{
			return true;
		}
	};


	public static CreativeTabs Reactioncraft = new CreativeTabs("Reactioncraft") 
	{		
		public ItemStack getIconItemStack() 
		{
			return new ItemStack(RCB.Mask, 1, 0);
		}

		public boolean hasSearchBar()
		{
			return true;
		}
	};


	public static CreativeTabs Reactioncraftfood = new CreativeTabs("Reactioncraftfood") 
	{	
		public ItemStack getIconItemStack() 
		{
			return new ItemStack(RCB.Mask, 1, 0);
		}

		public boolean hasSearchBar()
		{
			return true;
		}
	};

	// Config Starts Here
	public static int MaskIID;

	//Block code

	//Item Code
	public static Item Mask;

	//Manual
	public static boolean manualEnabled;


	public static RCB instance()
	{
		return instance;
	}


	public static boolean Railcraft() throws ClassNotFoundException 
	{
		try{
			Class.forName("mods.railcraft.common.core.Railcraft");
		}
		catch (NoClassDefFoundError ex) 
		{
			return false ;
		}
		return true ;
	}


	//Config
	public static ReactioncraftConfiguration config;


	@EventHandler
	public void preInit(FMLPreInitializationEvent evt)
	{
		System.out.println("[RCB] Pre Initialization Loaded");

		config = new ReactioncraftConfiguration(new File(evt.getModConfigurationDirectory(), "Reactioncraft/Basemod.wizim"));

		try 
		{
			config.load();		

			manualEnabled = config.get(config.CATEGORY_GENERAL, "manualEnabled", true).getBoolean(true);
			MaskIID = config.getItem("MASK", 10000).getInt();
			MinecraftForge.EVENT_BUS.register(this);
			
			/** RCC **/
			IntegratedProperties.hardcorerailcraft = config.get("Hardcore", "Hardcore Rails", false);
			IntegratedProperties.hardcorerailcraft.comment = "If this is true it adds a rail recipe that adds less rails using the vanilla recipe style that railcraft removes";

			IntegratedProperties.hardcoreIC2 = config.get("Hardcore", "Hardcore IC2", false);
			IntegratedProperties.hardcoreIC2.comment = "If this is true it will add Rubber Wood the the macerator, giving you 2 resin per maceratored log";

			IntegratedProperties.GenSponge = config.get("Generation", "Gen Sponge", true);
			IntegratedProperties.GenSponge.comment = "If this is true sponges generate in the ocean";

			IntegratedProperties.GenDarkSand = config.get("Generation", "Gen Dark Sand", true);
			IntegratedProperties.GenDarkSand.comment = "If this is true Darksand will generate in the ocean only if Better Deserts is installed";

			IntegratedProperties.vanillaOverrideCake = config.get("Vanilla Overrides", "Override Cake", true);
			IntegratedProperties.vanillaOverrideCake.comment = "If this is true item Cake is overwrote and stacks to 4";

			IntegratedProperties.vanillaOverrideBed = config.get("Vanilla Overrides", "Override Bed", true);
			IntegratedProperties.vanillaOverrideBed.comment = "If this is true item Bed is overwrote to stack to 3";

			IntegratedProperties.vanillaOverrideFishingrod = config.get("Vanilla Overrides", "Override Fishing Rod", false);
			IntegratedProperties.vanillaOverrideFishingrod.comment = "If this is true item fishing rod is overwrote to catch mutiple fish and items, to play regular vanilla servers set to false and restart your game!";

			/** RCBB **/
			IntegratedProperties.vanillaOverrideBookcase = config.get("Vanilla Overrides", "Override Enchantment Table", true);
			IntegratedProperties.vanillaOverrideBookcase.comment = "If this is true Vanilla Enchantment Table is slightly overwritten";

			/** RCBDM **/
			IntegratedProperties.GenCactusGreen        = config.get("Darksand Desert Generation", "Generate Green Cactus", true);
			IntegratedProperties.GenCactusRed          = config.get("Darksand Desert Generation", "Generate Red Cactus", true);
			IntegratedProperties.darkstoneGenerator    = config.get("Darksand Desert Generation", "Generate Dark Stone", true);
			IntegratedProperties.goldGenerator         = config.get("Darksand Desert Generation", "Generate Desert Gold", true);
			IntegratedProperties.lightstoneGenerator   = config.get("Darksand Desert Generation", "Generate Darkstone Gem 1", true);
			IntegratedProperties.darkgemstoneGenerator = config.get("Darksand Desert Generation", "Generate Darkstone Gem 2", true);
			IntegratedProperties.limestoneGenerator    = config.get("Darksand Desert Generation", "Generate Limestone", true);

			/** RCORES **/
			IntegratedProperties.genBloodstone    = config.get("Ore Generation", "Generate Bloodstone", true);
			IntegratedProperties.genBlackdiamond  = config.get("Ore Generation", "Generate Black Diamond", true);
			IntegratedProperties.genDragonstone   = config.get("Ore Generation", "Generate Dragonstone", true);
			IntegratedProperties.genNethergold    = config.get("Ore Generation", "Generate Nether Gold", true);
			IntegratedProperties.genNetherdiamond = config.get("Ore Generation", "Generate Nether Diamond", true);
			IntegratedProperties.genSilver        = config.get("Ore Generation", "Generate Silver", true);
			IntegratedProperties.genVentinite     = config.get("Ore Generation", "Generate Ventinite", true);

			IntegratedProperties.genBloodstone.comment    = "If this is true Bloodstone will appear in the nether, if false no other ores can generate :<";
			IntegratedProperties.genBlackdiamond.comment  = "If this is true Black diamond will appear in the nether (required for black diamond borehead)";
			IntegratedProperties.genDragonstone.comment   = "If this is true Dragonstone will appear in the nether (required for bloodstone sword)";
			IntegratedProperties.genNethergold.comment    = "If this is true Nether gold will appear in the nether";
			IntegratedProperties.genNetherdiamond.comment = "If this is true Nether Diamond will appear in the nether";
			IntegratedProperties.genSilver.comment        = "If this is true Silver Ore will appear on the surface";
			IntegratedProperties.genVentinite.comment     = "If this is true Ventinite will appear on the surface";
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
		itemCode();
		chestgenHooks();
		handlers();
		languageRegistry();

		//railcraft integration
		try
		{
			if(Railcraft())
			{
				//Integration.loadRailCraft();
				System.out.println("Railcraft integration loaded !");
			}
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Reactioncraft Base did not find railcraft, Re-added rail recipe disabled");
		}
	}


	public void handlers() 
	{
		GameRegistry.registerFuelHandler(new FuelHandler());
	}


	public void chestgenHooks() 
	{
		//after 1.4.6 ChestGenHooks
		//ChestGenHooks.addItem(ChestGenHooks.VILLAGE_BLACKSMITH, new WeightedRandomChestContent(lootStack, minStackSize, maxStackSize, chance));
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, new WeightedRandomChestContent(new ItemStack(RCB.Mask), 1, 1, 1));			
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST, new WeightedRandomChestContent(new ItemStack(RCB.Mask), 1, 1, 1));
	}


	public void languageRegistry() 
	{
		IntegratedLanguageFile.loadBasenames();
	}


	public void itemCode() 
	{
		Mask = new ItemBasic(MaskIID).setUnlocalizedName("reactioncraft:Mask").setTextureName("reactioncraft:Mask").setCreativeTab(RCB.ReactioncraftItems);
	}


	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent evt)
	{
		FMLLog.info("[RCB] basemod fully initialized!"); 
	}


	public static boolean getRCManualEnabled()
	{
		return manualEnabled;
	}
}