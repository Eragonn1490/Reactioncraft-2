package Reactioncraft.Desert;

import java.io.File;
import Reactioncraft.Desert.client.ClientProxy;
import Reactioncraft.Desert.common.*;
import Reactioncraft.Integration.Integration;
import Reactioncraft.basefiles.common.*;
import Reactioncraft.basemod.RCB;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
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

@Mod( modid = "RCBDM", name="Reactioncraft Better Desert Mod", version="[1.5.2] Reactioncraft Version 8.0", dependencies = "required-after:RCC")
@NetworkMod(channels = { "RCBDM" }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)

public class RCBDM
{
	@SidedProxy(clientSide = "Reactioncraft.Desert.client.ClientProxy", serverSide = "Reactioncraft.Desert.common.CommonProxy")
	public static CommonProxy proxy;

	@Instance("RCBDM")
	public static RCBDM instance;


	//Blocks / Items
	public static int HireoBlocksIID;
	public static int DesertBlocksIID;
	public static int ColumnBlockID;
	public static int ColumnBlock2ID;
	public static int DesertBlockMultiID;
	public static int Cactus2ID;
	public static int Cactus1ID;
	public static int CherryTreeLeavesID;
	public static int CherrywoodID;
	public static int CherryTreeSaplingID;
	public static int GoldChiselIID;
	public static int FlintChiselIID;
	public static int BloodstoneChiselIID;
	public static int DiamondChiselIID;
	public static int CopperChiselIID;
	public static int UncutLBGemIID; //uncut
	public static int CutLBGemIID; //cut
	public static int UncutDBGemIID; //uncut
	public static int CutDBGemIID; //cut
	public static int BloodstoneBrickID;
	public static int scrollIID;

	//Instances of Blocks and Items
	public static Block HireoMulti;
	public static Block DesertMulti;
	public static Block ColumnMulti;
	public static Block ColumnMulti2;
	public static Block DesertBlockMulti;
	public static Block Cactus1;
	public static Block Cactus2;
	public static Block CherryTreeLeaves;
	public static Block Cherrywood;
	public static Block CherryTreeSapling;
	public static Block BloodstoneBrick;

	public static Item GoldChisel;
	public static Item FlintChisel;
	public static Item DiamondChisel;
	public static Item BloodstoneChisel;
	public static Item CopperChisel;
	public static Item UncutLBGem; //uncut
	public static Item CutLBGem; //cut
	public static Item UncutDBGem; //uncut
	public static Item CutDBGem; //cut
	public static Item scroll;

	public static final int WILDCARD_VALUE = Short.MAX_VALUE;

	//Config
	public static ReactioncraftConfiguration config;

	public static boolean RCC() throws ClassNotFoundException 
	{
		try
		{
			Class.forName("Reactioncraft.core.RCC");
		}
		catch (NoClassDefFoundError ex) 
		{
			return false ;
		}
		return true ;
	}

	public static boolean RCORES() throws ClassNotFoundException 
	{
		try
		{
			Class.forName("Reactioncraft.Ore.RCORES");
		}
		catch (NoClassDefFoundError ex) 
		{
			return false ;
		}
		return true ;
	}

	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{	
		config = new ReactioncraftConfiguration(new File(evt.getModConfigurationDirectory(), "Reactioncraft/BetterDeserts.cfg"));

		try 
		{
			config.load();		
		}

		finally 
		{
			if (config.hasChanged()) 
			{
				config.save();
			}
		}


		MinecraftForge.EVENT_BUS.register(new RCCBonemealProvider());

		config.load();

		//3027 - 3040
		CherrywoodID = config.getBlock("Cherry Tree Wood", 3027).getInt();
		CherryTreeLeavesID = config.getBlock("Cherry Tree Leaves", 3028).getInt();
		CherryTreeSaplingID = config.getBlock("Cherry Tree Sapling", 3029).getInt();
		HireoBlocksIID = config.getBlock("Hireoglyphics", 3030).getInt();
		DesertBlocksIID = config.getBlock("Dark Sandstone Blocks", 3031).getInt();
		ColumnBlockID = config.getBlock("Column Blocks", 3032).getInt();
		DesertBlockMultiID = config.getBlock("Desert Blocks", 3033).getInt();
		BloodstoneBrickID = config.getBlock("Bloodstone Brick", 3034).getInt();
		Cactus1ID = config.getBlock("Cactus Block 1", 3035).getInt();
		Cactus2ID = config.getBlock("Cactus Block 2", 3036).getInt();
		ColumnBlock2ID = config.getBlock("Skinny Column Blocks", 3037).getInt();

		//Items... 10121 - 10220
		FlintChiselIID = config.getItem("Flint Chisel", 10121).getInt();
		GoldChiselIID = config.getItem("Gold Chisel", 10122).getInt();
		DiamondChiselIID = config.getItem("Diamond Chisel", 10123).getInt();
		BloodstoneChiselIID = config.getItem("Bloodstone Chisel", 10124).getInt();
		CopperChiselIID = config.getItem("Copper Chisel", 10125).getInt();
		UncutLBGemIID = config.getItem("Uncut Light Blue Gem", 10126).getInt();
		CutLBGemIID = config.getItem("Cut Light Blue Gem", 10127).getInt();
		UncutDBGemIID = config.getItem("Uncut Dark Blue Gem", 10128).getInt();
		CutDBGemIID = config.getItem("Cut Dark Blue Gem", 10129).getInt();
		scrollIID = config.getItem("Scroll", 10131).getInt();

		config.save();
	}

	@Init
	public void load(FMLInitializationEvent event)
	{
		itemCode();
		blockCode();
		registerBlocks();
		registerHandlers();
		addNames();
		oreDictionary();
		addSmelting();
		addRecipes();
		setHarvestinglevel();
		chestgenhooks();

		//RCORES integration
		try 
		{
			if(RCORES())
			{
				Integration.loadReactioncraftBDM();
				System.out.println("Redpower World enabled");
			}
		}
		catch (ClassNotFoundException e)	
		{
			System.out.println(" Reactioncraft: Better Deserts did not find Redpower, Marble Column's Disabled!");
		}

		//RCC integration
		try 
		{
			if(RCC())
			{
				Integration.loadCoreGeneration();
				System.out.println("Reactioncraft Better Desert Mod enabled");
			}
		}
		catch (ClassNotFoundException e)	
		{
			System.out.println(" Reactioncraft Better Deserts did not find Reactioncraft Core, No Special Sand Generation Allowed");
		}
	}



	private void chestgenhooks() 
	{
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, new WeightedRandomChestContent(new ItemStack(RCBDM.UncutLBGem), 1, 5, 20));
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, new WeightedRandomChestContent(new ItemStack(RCBDM.UncutDBGem), 1, 10, 25));			
	}

	public void setHarvestinglevel() 
	{
		MinecraftForge.setBlockHarvestLevel(RCBDM.DesertBlockMulti, 0,   "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(RCBDM.DesertBlockMulti, 1,   "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(RCBDM.DesertBlockMulti, 2,   "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(RCBDM.DesertBlockMulti, 3,   "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(RCBDM.DesertBlockMulti, 4,   "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(RCBDM.DesertBlockMulti, 5,   "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(RCBDM.DesertBlockMulti, 6,   "pickaxe", 0);
	}

	public void addSmelting() 
	{
		FurnaceRecipes.smelting().addSmelting(RCBDM.DesertBlockMulti.blockID, 10, new ItemStack(Item.ingotGold.itemID, 1, 1), 0.5F);
	}

	public void oreDictionary() 
	{
		OreDictionary.registerOre("BloodstoneBrick", new ItemStack(RCBDM.BloodstoneBrick));
	}

	public void addRecipes() 
	{

		/**chisel Recipes**/
		//Flint
		GameRegistry.addRecipe(new ItemStack(FlintChisel, 1), new Object[]  {"G", "I", Character.valueOf('G'), Item.flint, Character.valueOf('I'), Item.stick});
		//Copper
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(CopperChisel, true, new Object[]{"I", "X", Character.valueOf('I'), "ingotCopper", Character.valueOf('X'), Item.stick}));
		//Gold
		GameRegistry.addRecipe(new ItemStack(GoldChisel, 1), new Object[]   {"G", "I", Character.valueOf('G'), Item.ingotGold, Character.valueOf('I'), Item.stick});
		//Diamond
		GameRegistry.addRecipe(new ItemStack(DiamondChisel, 1), new Object[]{"G", "I", Character.valueOf('G'), Item.diamond, Character.valueOf('I'), Item.stick});
		//Bloodstone
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(BloodstoneChisel, true, new Object[]{"I", "X", Character.valueOf('I'), "ingotBloodstone", Character.valueOf('X'), Item.stick}));

		//Limestone to Chiseled Limestone
		GameRegistry.addShapelessRecipe(new ItemStack(DesertBlockMulti, 1, 7), new ItemStack(DesertBlockMulti, 1, 6), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(DesertBlockMulti, 1, 7), new ItemStack(DesertBlockMulti, 1, 6), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(DesertBlockMulti, 1, 7), new ItemStack(DesertBlockMulti, 1, 6), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(DesertBlockMulti, 1, 7), new ItemStack(DesertBlockMulti, 1, 6), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(DesertBlockMulti, 1, 7), new ItemStack(DesertBlockMulti, 1, 6), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE));

		/**Bloodstone brick recipe**/
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCBDM.BloodstoneBrick,4,4), new Object[]{"oreBloodstone", "oreBloodstone", "oreBloodstone", "oreBloodstone"}));

		/**Chisels Cutting the Gems into Cut form.**/
		GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutLBGem,1,1), new Object[]{RCBDM.UncutLBGem, new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutLBGem,1,1), new Object[]{RCBDM.UncutLBGem, new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutLBGem,1,1), new Object[]{RCBDM.UncutLBGem, new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutLBGem,1,1), new Object[]{RCBDM.UncutLBGem, new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutLBGem,1,1), new Object[]{RCBDM.UncutLBGem, new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

		GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutDBGem,1,1), RCBDM.UncutDBGem, new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutDBGem,1,1), RCBDM.UncutDBGem, new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutDBGem,1,1), RCBDM.UncutDBGem, new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutDBGem,1,1), RCBDM.UncutDBGem, new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutDBGem,1,1), RCBDM.UncutDBGem, new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE));

		//Chisels Cutting Columns

		//Dark Sandstone Column
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 0), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 0), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 0), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 0), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 0), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

		//stone Column
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 3), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stone, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 3), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stone, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 3), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stone, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 3), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stone, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 3), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stone, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

		//Cobblestone Column
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 4), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.cobblestone, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 4), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.cobblestone, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 4), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.cobblestone, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 4), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.cobblestone, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 4), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.cobblestone, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});


		//Gold Column
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 5), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.blockGold, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 5), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.blockGold, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 5), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.blockGold, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

		//Diamond Column
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 6), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.blockDiamond, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 6), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.blockDiamond, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

		//Stone Brick Column
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 7), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stoneBrick, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 7), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stoneBrick, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 7), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stoneBrick, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 7), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stoneBrick, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 7), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stoneBrick, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

		//Limestone Column
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 8), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 8), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 8), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 8), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 8), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

		//Bloodstone Column
		GameRegistry.addRecipe(new ItemStack(ColumnMulti, 1, 2), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), RCBDM.BloodstoneBrick, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

		//Skinny Columns
		//Dark Sandstone Column
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

		//stone Column
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 3), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 3), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 3), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 3), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 3), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

		//Cobblestone Column
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 4), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 4), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 4), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 4), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 4), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});


		//Gold Column
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 5), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 5), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 5), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 5), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 5), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 5), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

		//Diamond Column
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 6), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 6), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 6), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 6), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

		//Stone Brick Column
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 7), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 7), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 7), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 7), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 7), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

		//Limestone Column
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 8), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 8), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 8), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 8), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 8), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 8), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 8), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 8), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 8), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 8), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

		//Bloodstone Column
		GameRegistry.addRecipe(new ItemStack(ColumnMulti2, 1, 2), new Object[]{"XY", Character.valueOf('X'), new ItemStack(ColumnMulti, 1, 2), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});


		//Carved Dark Sandstone
		GameRegistry.addRecipe(new ItemStack(DesertBlockMulti, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 2), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(DesertBlockMulti, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 2), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(DesertBlockMulti, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 2), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(DesertBlockMulti, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 2), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(DesertBlockMulti, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 2), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

		//Cracked Dark Sandstone to Carved Dark Sandstone
		GameRegistry.addShapelessRecipe(new ItemStack(DesertBlockMulti, 1, 0), new ItemStack(DesertBlockMulti, 1, 1), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(DesertBlockMulti, 1, 0), new ItemStack(DesertBlockMulti, 1, 1), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(DesertBlockMulti, 1, 0), new ItemStack(DesertBlockMulti, 1, 1), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(DesertBlockMulti, 1, 0), new ItemStack(DesertBlockMulti, 1, 1), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(DesertBlockMulti, 1, 0), new ItemStack(DesertBlockMulti, 1, 1), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE));

		//Dark Sandstone Brick
		GameRegistry.addRecipe(new ItemStack(DesertBlockMulti, 1, 3), new Object[]{"XX","XX", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0)});

		/**
        LanguageRegistry.addName(new ItemStack(ColumnMulti, 1, 1), "Marble Column");
		 **/


		//Cracked Darkstone Brick to Darkstone Brick
		GameRegistry.addRecipe(new ItemStack(DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});


		//Weather Hireoglyphics to Carved Dark Stone
		GameRegistry.addShapelessRecipe(new ItemStack(DesertBlockMulti, 1, 0), new ItemStack(HireoMulti, 1, 11), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(DesertBlockMulti, 1, 0), new ItemStack(HireoMulti, 1, 11), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(DesertBlockMulti, 1, 0), new ItemStack(HireoMulti, 1, 11), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(DesertBlockMulti, 1, 0), new ItemStack(HireoMulti, 1, 11), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(DesertBlockMulti, 1, 0), new ItemStack(HireoMulti, 1, 11), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE));


		/** Regular Hireoglyphics **/
		//Flint Chisel
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 0), new Object[]{"YYY", " X ", "   ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 1), new Object[]{"YYY", "YX ", "   ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 2), new Object[]{"YYY", "YXY", "   ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		//Copper Chisel
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 0), new Object[]{"YYY", " X ", "   ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 1), new Object[]{"YYY", "YX ", "   ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 2), new Object[]{"YYY", "YXY", "   ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		//Gold Chisel
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 0), new Object[]{"YYY", " X ", "   ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 1), new Object[]{"YYY", "YX ", "   ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 2), new Object[]{"YYY", "YXY", "   ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		//Diamond Chisel
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 0), new Object[]{"YYY", " X ", "   ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 1), new Object[]{"YYY", "YX ", "   ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 2), new Object[]{"YYY", "YXY", "   ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		//Bloodstone Chisel
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 0), new Object[]{"YYY", " X ", "   ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 1), new Object[]{"YYY", "YX ", "   ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 2), new Object[]{"YYY", "YXY", "   ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

		/** Lightblue Hireoglyphics **/
		//Flint
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 3), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 4), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 5), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		//Copper
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 3), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 4), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 5), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		//Gold
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 3), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 4), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 5), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		//Diamond Based Lightblue Hireoglyphics
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 3), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 4), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 5), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		//Bloodstone Based Lightblue Hireoglyphics
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 3), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 4), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 5), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

		/** Darkblue Hireoglyphics **/
		//Flint
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 6), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 7), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 8), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		//Copper 
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 6), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 7), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 8), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		//Gold
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 6), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 7), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 8), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		//Diamond
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 6), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 7), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 8), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		//Bloodstone Based Darkblue Hireoglyphics
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 6), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 7), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 8), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

		/** Gold Hireoglyphics **/
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 13), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 14), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 15), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		//Copper Based DarkBlue Hireoglyphics
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 13), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 14), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 15), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		//gold Based Darkblue Hireoglyphics
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 13), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 14), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 15), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		//Diamond Based Darkblue Hireoglyphics
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 13), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 14), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 15), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		//Bloodstone Based Darkblue Hireoglyphics
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 13), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 14), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(HireoMulti, 1, 15), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
	}

	public void itemCode() 
	{
		FlintChisel =      (new ItemChisel(FlintChiselIID).setUnlocalizedName("RCBDM:flintchisel"));
		GoldChisel =       (new ItemChisel2(GoldChiselIID)).setUnlocalizedName("RCBDM:goldchisel");
		CopperChisel =     (new ItemChisel3(CopperChiselIID).setUnlocalizedName("RCBDM:copperchisel"));
		DiamondChisel =    (new ItemChisel4(DiamondChiselIID)).setUnlocalizedName("RCBDM:diamondchisel");
		BloodstoneChisel = (new ItemChisel5(BloodstoneChiselIID)).setUnlocalizedName("RCBDM:bloodstonechisel");
		UncutLBGem = (new ItemBasic(UncutLBGemIID)).setUnlocalizedName("RCBDM:UncutLBGem");
		CutLBGem = (new ItemBasic(CutLBGemIID)).setUnlocalizedName("RCBDM:CutLBGem");
		UncutDBGem = (new ItemBasic(UncutDBGemIID)).setUnlocalizedName("RCBDM:UncutDBGem");
		CutDBGem = (new ItemBasic(CutDBGemIID)).setUnlocalizedName("RCBDM:CutDBGem");
		scroll = (new ItemBasic(scrollIID)).setUnlocalizedName("RCBDM:scroll");
	}

	public void blockCode() 
	{
		BloodstoneBrick = new BlockBasic(BloodstoneBrickID).setHardness(120.0F).setResistance(2000.0F).setLightValue(0.10F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("RCBDM:BloodStoneBrick").setCreativeTab(RCB.Reactioncraft);
		Cherrywood = new BlockCherryTreeLog(CherrywoodID, Material.wood).setHardness(0.2F).setResistance(0.5F).setUnlocalizedName("RCBDM:woodside");
		CherryTreeLeaves = new BlockCherryTreeLeaves(CherryTreeLeavesID).setHardness(0.2F).setResistance(0.5F).setUnlocalizedName("RCBDM:CherryTreeLeaves");
		CherryTreeSapling = new BlockCherryTreeSapling(CherryTreeSaplingID).setHardness(0.2F).setResistance(0.5F).setUnlocalizedName("RCBDM:CherryTreeSapling");
		HireoMulti = new BlockHireoMulti(HireoBlocksIID, Material.rock).setHardness(3.0F).setUnlocalizedName("HireoMulti");
		ColumnMulti = new BlockColumnMulti(ColumnBlockID, Material.rock).setHardness(3.0F).setUnlocalizedName("ColumnMulti");
		ColumnMulti2 = new BlockColumnMulti2(ColumnBlock2ID, Material.rock).setHardness(3.0F).setUnlocalizedName("ColumnMulti2");
		DesertBlockMulti = new BlockDesertMulti(DesertBlockMultiID, Material.rock).setHardness(3.0F).setUnlocalizedName("DesertBlockMulti");
		Cactus1 = (new DesertFlower(Cactus1ID)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("RCBDM:Cactus1");
		Cactus2 = (new DesertFlower(Cactus2ID)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("RCBDM:Cactus2");
	}

	public void addNames() 
	{	
		//Cherry Trees
		LanguageRegistry.addName(Cherrywood, "Cherry Log");
		LanguageRegistry.addName(CherryTreeLeaves, "Cherry Leaves");
		LanguageRegistry.addName(CherryTreeSapling, "Cherry Tree Sapling");


		//Scroll
		LanguageRegistry.addName(scroll, "Scroll");

		//Bloodstone Brick
		LanguageRegistry.addName(BloodstoneBrick, "Bloodstone Brick");

		//Gems
		LanguageRegistry.addName(UncutLBGem, "Uncut Light Blue Gem");
		LanguageRegistry.addName(CutLBGem, "Light Blue Gem");
		LanguageRegistry.addName(UncutDBGem, "Uncut Dark Blue Gem");
		LanguageRegistry.addName(CutDBGem, "Dark Blue Gem");

		//Chisel's
		LanguageRegistry.addName(GoldChisel, "Gold Chisel");
		LanguageRegistry.addName(FlintChisel, "Flint Chisel");
		LanguageRegistry.addName(CopperChisel, "Copper Chisel");
		LanguageRegistry.addName(DiamondChisel, "Diamond Chisel");
		LanguageRegistry.addName(BloodstoneChisel, "Bloodstone Chisel");

		//Desert Blocks
		LanguageRegistry.addName(new ItemStack(DesertBlockMulti, 1),    "Carved Dark Stone");
		LanguageRegistry.addName(new ItemStack(DesertBlockMulti, 1, 1), "Cracked Dark Stone");
		LanguageRegistry.addName(new ItemStack(DesertBlockMulti, 1, 2), "Dark Stone");
		LanguageRegistry.addName(new ItemStack(DesertBlockMulti, 1, 3), "Dark Stone Brick");
		LanguageRegistry.addName(new ItemStack(DesertBlockMulti, 1, 4), "Cracked Dark Stone Brick");
		LanguageRegistry.addName(new ItemStack(DesertBlockMulti, 1, 5), "Dark Sandstone Bricks");
		LanguageRegistry.addName(new ItemStack(DesertBlockMulti, 1, 6), "Limestone");
		LanguageRegistry.addName(new ItemStack(DesertBlockMulti, 1, 7), "Carved Limestone");
		LanguageRegistry.addName(new ItemStack(DesertBlockMulti, 1, 8), "Desert Gemstone");
		LanguageRegistry.addName(new ItemStack(DesertBlockMulti, 1, 9), "Desert Gemstone");
		LanguageRegistry.addName(new ItemStack(DesertBlockMulti, 1, 10), "Desert Gold");


		//Hireoglyphics
		LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 0),   "Hireoglyphics");
		LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 1), 	"Hireoglyphics");
		LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 2), 	"Hireoglyphics");

		LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 3), 	"Hireoglyphics");
		LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 4), 	"Hireoglyphics");
		LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 5), 	"Hireoglyphics");  

		LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 6), 	"Hireoglyphics");
		LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 7), 	"Hireoglyphics");
		LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 8), 	"Hireoglyphics");

		//LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 9),   "Column Top");
		//LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 10),  "Column Base");		       
		//LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 12),  "Marble");

		//Weathered Hireoglyphic
		LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 11),  "Weathered Hireoglyph");

		//Gold Hireoglyphics
		LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 13),  "Hireoglyphics");  
		LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 14),  "Hireoglyphics");  
		LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 15),  "Hireoglyphics"); 


		LanguageRegistry.addName(new ItemStack(ColumnMulti, 1, 0), "Dark Sandstone Column");
		LanguageRegistry.addName(new ItemStack(ColumnMulti, 1, 1), "Marble Column");
		LanguageRegistry.addName(new ItemStack(ColumnMulti, 1, 2), "Bloodstone Column");
		LanguageRegistry.addName(new ItemStack(ColumnMulti, 1, 3), "Stone Column");
		LanguageRegistry.addName(new ItemStack(ColumnMulti, 1, 4), "Cobblestone Column");
		LanguageRegistry.addName(new ItemStack(ColumnMulti, 1, 5), "Gold Column");
		LanguageRegistry.addName(new ItemStack(ColumnMulti, 1, 6), "Diamond Column");
		LanguageRegistry.addName(new ItemStack(ColumnMulti, 1, 7), "Stonebrick Column");
		LanguageRegistry.addName(new ItemStack(ColumnMulti, 1, 8), "Limestone Column");

		LanguageRegistry.addName(new ItemStack(ColumnMulti2, 1, 0), "Dark Sandstone Column");
		LanguageRegistry.addName(new ItemStack(ColumnMulti2, 1, 1), "Marble Column");
		LanguageRegistry.addName(new ItemStack(ColumnMulti2, 1, 2), "Bloodstone Column");
		LanguageRegistry.addName(new ItemStack(ColumnMulti2, 1, 3), "Stone Column");
		LanguageRegistry.addName(new ItemStack(ColumnMulti2, 1, 4), "Cobblestone Column");
		LanguageRegistry.addName(new ItemStack(ColumnMulti2, 1, 5), "Gold Column");
		LanguageRegistry.addName(new ItemStack(ColumnMulti2, 1, 6), "Diamond Column");
		LanguageRegistry.addName(new ItemStack(ColumnMulti2, 1, 7), "Stonebrick Column");
		LanguageRegistry.addName(new ItemStack(ColumnMulti2, 1, 8), "Limestone Column");

		//Cactus's
		LanguageRegistry.addName(Cactus1, "Cactus");
		LanguageRegistry.addName(Cactus2, "Cactus");
	}

	public void registerBlocks() 
	{
		GameRegistry.registerBlock(DesertBlockMulti, ItemMulti.class,"DesertBlockMulti");
		GameRegistry.registerBlock(ColumnMulti, ItemMulti.class, "ColumnMulti");
		GameRegistry.registerBlock(ColumnMulti2, ItemMulti.class, "ColumnMulti2");
		GameRegistry.registerBlock(HireoMulti, ItemMulti.class, "HireoMulti");
		GameRegistry.registerBlock(Cactus1, "Cactus1");
		GameRegistry.registerBlock(Cactus2, "Cactus2");
		GameRegistry.registerBlock(CherryTreeLeaves, "CherryTreeLeaves");
		GameRegistry.registerBlock(Cherrywood, "Cherrywood");
		GameRegistry.registerBlock(CherryTreeSapling, "CherryTreeSapling");
		GameRegistry.registerBlock(BloodstoneBrick, "BloodstoneBrick");
	}

	public void registerHandlers() 
	{
		GameRegistry.registerCraftingHandler(new CraftingHandler());
		GameRegistry.registerWorldGenerator(new WorldGenHandler());	
	}

	@PostInit
	public void modsLoaded(FMLPostInitializationEvent evt)
	{
		FMLLog.info("The Deserts are Epic!"); 
	}
}