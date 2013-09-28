package Reactioncraft.machines;

import java.io.File;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import Reactioncraft.machines.client.ClientProxy;
import Reactioncraft.machines.common.*;
import Reactioncraft.integration.*;
import Reactioncraft.api.common.*;
import Reactioncraft.basefiles.common.*;
import Reactioncraft.basemod.RCB;
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
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod( modid = "rcmm", name="Reactioncraft Mobs Mod", version="[1.6.4] Reactioncraft 3 Version 1.1.4", dependencies="after:rcbdm")
@NetworkMod(channels = { "RCMM" }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)

public class RCMM
{
	@SidedProxy(clientSide = "Reactioncraft.machines.client.ClientProxy", serverSide = "Reactioncraft.machines.common.CommonProxy")

	public static CommonProxy proxy;
	@Instance("RCMM")
	public static RCMM instance;

	//Config Code
	public static int FreezerActiveID;
	public static int FreezerIdleID;
	public static int BrickOvenActiveID;
	public static int BrickOvenIdleID;
	public static int ClayalizerIdleID;
	public static int ClayalizerActiveID;
	public static int IceBucketIID;
	public static int ObsidianBucketIID;
	
	//public static int BigCraftingTableID;
	//public static int MdGuiBlockID;

	//Block code
	public static Block FreezerActive;
	public static Block FreezerIdle;
	public static Block BrickOvenActive;
	public static Block BrickOvenIdle;
	public static Block ClayalizerIdle;
	public static Block ClayalizerActive;
	
	//public static Block BigCraftingTable;
	//public static Block MdGuiBlock;


	//Item Code
	public static Item IceBucket;
	public static Item ObsidianBucket;


	public static RCMM instance()
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

	public static boolean RCBDM() throws ClassNotFoundException 
	{
		try{
			Class.forName("Reactioncraft.desert.RCBDM");
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
		instance = this;
		
		System.out.println("[RCMM] Pre Initialization Loaded");

		config = new ReactioncraftConfiguration(new File(evt.getModConfigurationDirectory(), "Reactioncraft/Machines.cfg"));

		try 
		{
			config.load();

			MinecraftForge.EVENT_BUS.register(this);

			//3066- 3073
			FreezerActiveID = config.getBlock("Freezer Active", 3066).getInt();
			FreezerIdleID   = config.getBlock("Freezer Idle", 3067).getInt();
			BrickOvenActiveID = config.getBlock("Brick Oven Active", 3068).getInt();
			BrickOvenIdleID   = config.getBlock("Brick Oven Idle", 3069).getInt();
			ClayalizerActiveID = config.getBlock("Clayalizer Active", 3070).getInt();
			ClayalizerIdleID   = config.getBlock("Clayalizer Idle", 3071).getInt();
			
			//BigCraftingTableID = config.getBlock("BigCraftingTable", 3073).getInt();
			//MdGuiBlockID = config.getBlock("Machines", 3072).getInt();

			//10801 - 10820
			IceBucketIID = config.getItem("Ice Bucket", 10801).getInt();
			ObsidianBucketIID = config.getItem("Obsidian Bucket", 10802).getInt();

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
		BlockCode();
		ItemCode();
		
		instance = this;
		NetworkRegistry.instance().registerGuiHandler(instance, proxy);
		
		GameRegistry();
		LanguageRegistry();
		FreezerRecipes();
		BrickOvenRecipes();
		OreDictionary();

		//railcraft integration
		try
		{
			if(Railcraft())
			{
				Integration.loadBlastFurnace();
				System.out.println("Railcraft integration loaded !");
			}
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Reactioncraft Machines did not find railcraft, all integration disabled");
		}

		//railcraft integration
		try
		{
			if(RCBDM())
			{
				Integration.loadDesertMachines();
				System.out.println("Reactioncraft integration loaded !");
			}
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Reactioncraft: Machines, did not find Better Desert Mod, Brick Oven disabled");
		}
	}

	private void ItemCode() 
	{
		IceBucket = (new ItemBasic(IceBucketIID)).setMaxStackSize(1).setUnlocalizedName("rcmm:IceBucket").setTextureName("rcmm:IceBucket").setContainerItem(Item.bucketEmpty);
		ObsidianBucket = (new ItemBasic(ObsidianBucketIID)).setMaxStackSize(1).setUnlocalizedName("rcmm:ObsidianBucket").setTextureName("rcmm:ObsidianBucket").setContainerItem(Item.bucketEmpty);
	}

	private void BlockCode() 
	{
		FreezerIdle      = (new BlockFreezer(FreezerActiveID, false)).setHardness(3.5F).setUnlocalizedName("FreezerIdle").setCreativeTab(RCB.Reactioncraft);
		FreezerActive    = (new BlockFreezer(FreezerIdleID, true)).setHardness(3.5F).setLightValue(0.875F).setUnlocalizedName("FreezerActive");
		BrickOvenIdle    = (new BlockBrickOven(BrickOvenActiveID, false)).setHardness(3.5F).setUnlocalizedName("BrickOvenIdle").setCreativeTab(RCB.Reactioncraft);
		BrickOvenActive  = (new BlockBrickOven(BrickOvenIdleID, true)).setHardness(3.5F).setLightValue(0.875F).setUnlocalizedName("BrickOvenActive");
		ClayalizerIdle   = (new BlockClayalizer(ClayalizerIdleID, false)).setHardness(3.5F).setUnlocalizedName("ClayalizerIdle").setCreativeTab(RCB.Reactioncraft);
		ClayalizerActive = (new BlockClayalizer(ClayalizerActiveID, true)).setHardness(3.5F).setLightValue(0.875F).setUnlocalizedName("ClayalizerActive");
		
		//BigCraftingTable = (new Block6X6(BigCraftingTableID)).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("workbench");
		//MdGuiBlock       = (new Block6X6(MdGuiBlockID, Material.rock).setHardness(3.5F).setUnlocalizedName("MdGuiBlock")).setCreativeTab(RCB.Reactioncraft);
	}

	public void LanguageRegistry() 
	{
		IntegratedLanguageFile.loadMachinesnames();
	}

	private void GameRegistry() 
	{
		GameRegistry.registerBlock(FreezerActive, "FreezerActive");
		GameRegistry.registerBlock(FreezerIdle, "FreezerIdle");
		GameRegistry.registerBlock(BrickOvenActive, "BrickActive");
		GameRegistry.registerBlock(BrickOvenIdle, "BrickOvenIdle");
		GameRegistry.registerBlock(ClayalizerIdle, "ClayalizerIdle");
		GameRegistry.registerBlock(ClayalizerActive, "ClayalizerActive");
		//GameRegistry.registerBlock(BigCraftingTable, "BigCraftingTable");
		//GameRegistry.registerBlock(MdGuiBlock, ItemMulti.class, "MdGuiBlock");

		GameRegistry.addSmelting(RCMM.IceBucket.itemID, new ItemStack(Item.bucketWater, 1), 0.5F);

		GameRegistry.registerTileEntity(TileEntityFreezer.class, "Reactioncraft-Freezer");
		GameRegistry.registerTileEntity(TileEntityBrickOven.class, "Reactioncraft-BrickOven");
		GameRegistry.registerTileEntity(TileEntityClayalizer.class, "Reactioncraft-Clayalizer");
		//GameRegistry.registerTileEntity(TileEntity6X6.class, "6X6 CT");

		GameRegistry.addRecipe(new ItemStack(FreezerIdle, 1), new Object[]{"RSR", "LOW", "RSR",  Character.valueOf('W'), Item.bucketWater ,Character.valueOf('L'), Block.lever ,Character.valueOf('S'), Block.blockIron ,Character.valueOf('O'), Block.furnaceIdle, Character.valueOf('R'), Item.redstone});
		
		//GameRegistry.addRecipe(new ItemStack(BigCraftingTable, 1), new Object[]{"xx","xx",Character.valueOf('x'),Block.workbench});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Block.ice, 1), new Object[]{IceBucket,});
		GameRegistry.addShapelessRecipe(new ItemStack(Block.obsidian, 1), new Object[]{ObsidianBucket,});
	}

	public void FreezerRecipes() 
	{
		FreezerRecipes.smelting().addSmelting(Item.bucketLava.itemID , new ItemStack(ObsidianBucket, 1, 0), 0.5F);
		FreezerRecipes.smelting().addSmelting(Item.bucketWater.itemID, new ItemStack(IceBucket), 0.5F);
	}

	public void BrickOvenRecipes() 
	{
		BrickOvenRecipes.smelting().addSmelting(Item.clay.itemID, new ItemStack(Block.brick, 2, 0), 0.5F);
	}

	public void OreDictionary() 
	{
	}

	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent evt)
	{
	}
}
