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

@Mod( modid = "rcb", name="Reactioncraft Base Mod", version="[1.6.2] Reactioncraft 3 Version 1.1.2")
@NetworkMod(channels = { "RCB" }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class, connectionHandler = ConnectionHandler.class)

public class RCB
{
	@SidedProxy(clientSide = "Reactioncraft.basemod.client.ClientProxy", serverSide = "Reactioncraft.basemod.common.CommonProxy")

	public static CommonProxy proxy;

	@Instance("RCB")
	public static RCB instance;

	
	public static CreativeTabs ReactioncraftItems = new CreativeTabs("ReactioncraftItems") 
	{
		public CreativeTabs setBackgroundImageName(String par1Str)
	    {
	        return this.setBackgroundImageName("item_search.png");
	    }
		
		public ItemStack getIconItemStack() 
        {
                return new ItemStack(RCB.Mask, 1, 0);
        }
        
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
				Integration.loadRailCraft();
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
		Mask = new ItemBasic(MaskIID).setUnlocalizedName("rcb:Mask").setTextureName("rcb:Mask").setCreativeTab(RCB.ReactioncraftItems);
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
