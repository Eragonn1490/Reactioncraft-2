package Reactioncraft.desert;

import java.io.File;
import Reactioncraft.desert.client.ClientProxy;
import Reactioncraft.desert.common.CommonProxy;
import Reactioncraft.basefiles.common.PacketHandler;
import Reactioncraft.desert.common.*;
import Reactioncraft.basemod.RCB;
import Reactioncraft.basefiles.common.*;
import Reactioncraft.integration.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Property;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod( modid = "rcbdm", name="Reactioncraft Better Desert Mod", version="[1.6.4] Reactioncraft 3 Version 1.1.4", dependencies = "after:rcc")
@NetworkMod(channels = { "RCBDM" }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)

public class RCBDM
{
	@SidedProxy(clientSide = "Reactioncraft.desert.client.ClientProxy", serverSide = "Reactioncraft.desert.common.CommonProxy")
	
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
	public static int CherryPlanksID;
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
	public static Block ColumnMulti;
	public static Block ColumnMulti2;
	public static Block DesertBlockMulti;
	public static Block Cactus1;
	public static Block Cactus2;
	public static Block CherryTreeLeaves;
	public static Block Cherrywood;
	public static Block CherryTreeSapling;
	public static Block BloodstoneBrick;
	public static Block CherryPlanks;
	
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

	//Cactus Properties
	public static Property GenCactusGreen;
	public static Property GenCactusRed;
	public static Property darkstoneGenerator;
	public static Property goldGenerator;
	public static Property lightstoneGenerator;
	public static Property darkgemstoneGenerator;
	public static Property limestoneGenerator;
	
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
			Class.forName("Reactioncraft.ore.RCORES");
		}
		catch (NoClassDefFoundError ex) 
		{
			return false ;
		}
		return true ;
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent evt)
	{	
		System.out.println("[RCBDM] Pre Initialization Loaded");
		
		MinecraftForge.TERRAIN_GEN_BUS.register(new RCBDM());
		MinecraftForge.EVENT_BUS.register(new RCBDM());
		
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
		CherryPlanksID = config.getBlock("Cherry Planks", 3038).getInt();

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
		
		
		GenCactusGreen        = config.get("Darksand Desert Generation", "Generate Green Cactus", true);
		GenCactusRed          = config.get("Darksand Desert Generation", "Generate Red Cactus", true);
		darkstoneGenerator    = config.get("Darksand Desert Generation", "Generate Dark Stone", true);
		goldGenerator         = config.get("Darksand Desert Generation", "Generate Desert Gold", true);
		lightstoneGenerator   = config.get("Darksand Desert Generation", "Generate Darkstone Gem 1", true);
		darkgemstoneGenerator = config.get("Darksand Desert Generation", "Generate Darkstone Gem 2", true);
		limestoneGenerator    = config.get("Darksand Desert Generation", "Generate Limestone", true);

		config.save();
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		itemCode();
		blockCode();
		registerBlocks();
		oreDictionary();
		registerHandlers();
		addNames();
		addSmelting();
		setHarvestinglevel();
		chestgenhooks();
		MinecraftForge.EVENT_BUS.register(new EventContainerClass());
		
		//RCORES integration
		try 
		{
			if(RCORES())
			{
				//Integration.loadReactioncraftBDM();
				//System.out.println("Redpower World enabled");
			}
		}
		catch (ClassNotFoundException e)	
		{
			System.out.println(" Reactioncraft: Better Deserts, did not find Redpower, Marble Column's Disabled!");
		}

		//RCC integration
		try 
		{
			if(RCC())
			{
				Integration.loadCoreGeneration();
				Integration.loadDesertRecipes();
				System.out.println("Reactioncraft Better Desert Mod enabled");
			}
		}
		catch (ClassNotFoundException e)	
		{
			System.out.println("Reactioncraft Better Deserts did not find Reactioncraft Core, No Special Sand Generation Allowed");
		}
	}

	private void chestgenhooks() 
	{
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, new WeightedRandomChestContent(new ItemStack(RCBDM.UncutLBGem), 1, 5, 20));
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, new WeightedRandomChestContent(new ItemStack(RCBDM.UncutDBGem), 1, 10, 25));
		
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, new WeightedRandomChestContent(new ItemStack(RCBDM.DesertBlockMulti, 1, 6), 1, 10, 25));
	}

	public void setHarvestinglevel() 
	{
		MinecraftForge.removeBlockEffectiveness(RCBDM.DesertBlockMulti, "pickaxe");
		MinecraftForge.setBlockHarvestLevel(RCBDM.DesertBlockMulti, 0,   "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(RCBDM.DesertBlockMulti, 1,   "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(RCBDM.DesertBlockMulti, 2,   "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(RCBDM.DesertBlockMulti, 3,   "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(RCBDM.DesertBlockMulti, 4,   "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(RCBDM.DesertBlockMulti, 5,   "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(RCBDM.DesertBlockMulti, 6,   "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(RCBDM.DesertBlockMulti, 11,  "pickaxe", 0);
		
		//Bloodstone Column Harvest Levels
		MinecraftForge.setBlockHarvestLevel(RCBDM.ColumnMulti, 2,    "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(RCBDM.ColumnMulti2, 2,   "pickaxe", 4);
	}

	public void addSmelting() 
	{
		FurnaceRecipes.smelting().addSmelting(RCBDM.DesertBlockMulti.blockID, 10, new ItemStack(Item.ingotGold.itemID, 1, 0), 0.5F);
		FurnaceRecipes.smelting().addSmelting(RCBDM.Cherrywood.blockID, 0, new ItemStack(Item.coal, 1, 1), 0.15F);
		FurnaceRecipes.smelting().addSmelting(RCBDM.Cactus1.blockID, 0, new ItemStack(Item.dyePowder, 1, 2), 0.15F);
		FurnaceRecipes.smelting().addSmelting(RCBDM.Cactus2.blockID, 0, new ItemStack(Item.dyePowder, 1, 2), 0.15F);
	}

	public void oreDictionary() 
	{		
		OreDictionary.registerOre("BloodstoneBrick", new ItemStack(RCBDM.BloodstoneBrick));
		OreDictionary.registerOre("carveddarkstone", new ItemStack(RCBDM.DesertBlockMulti, 1, 0));
		OreDictionary.registerOre("darkstonebrick", new ItemStack(RCBDM.DesertBlockMulti, 1, 3));
		OreDictionary.registerOre("plankWood", new ItemStack(RCBDM.CherryPlanks));
		OreDictionary.registerOre("CherryWood", new ItemStack(RCBDM.Cherrywood));
		OreDictionary.registerOre("scroll", new ItemStack(RCBDM.scroll));
		OreDictionary.registerOre("chisel", new ItemStack(RCBDM.FlintChisel,      1, 0));
		OreDictionary.registerOre("chisel", new ItemStack(RCBDM.CopperChisel,     1, 0));
		OreDictionary.registerOre("chisel", new ItemStack(RCBDM.GoldChisel,       1, 0));
		OreDictionary.registerOre("chisel", new ItemStack(RCBDM.DiamondChisel,    1, 0));
		OreDictionary.registerOre("chisel", new ItemStack(RCBDM.BloodstoneChisel, 1, 0));
	}

	public void itemCode() 
	{
		FlintChisel =      (new ItemChisel(FlintChiselIID).setUnlocalizedName("rcbdm:flintchisel").setTextureName("rcbdm:flintchisel"));
		GoldChisel =       (new ItemChisel2(GoldChiselIID)).setUnlocalizedName("rcbdm:goldchisel").setTextureName("rcbdm:goldchisel");
		CopperChisel =     (new ItemChisel3(CopperChiselIID).setUnlocalizedName("rcbdm:copperchisel").setTextureName("rcbdm:copperchisel"));
		DiamondChisel =    (new ItemChisel4(DiamondChiselIID)).setUnlocalizedName("rcbdm:diamondchisel").setTextureName("rcbdm:diamondchisel");
		BloodstoneChisel = (new ItemChisel5(BloodstoneChiselIID)).setUnlocalizedName("rcbdm:bloodstonechisel").setTextureName("rcbdm:bloodstonechisel");
		UncutLBGem = (new ItemBasic(UncutLBGemIID)).setUnlocalizedName("rcbdm:UncutLBGem").setTextureName("rcbdm:UncutLBGem");
		CutLBGem = (new ItemBasic(CutLBGemIID)).setUnlocalizedName("rcbdm:CutLBGem").setTextureName("rcbdm:CutLBGem");
		UncutDBGem = (new ItemBasic(UncutDBGemIID)).setUnlocalizedName("rcbdm:UncutDBGem").setTextureName("rcbdm:UncutDBGem");
		CutDBGem = (new ItemBasic(CutDBGemIID)).setUnlocalizedName("rcbdm:CutDBGem").setTextureName("rcbdm:CutDBGem");
		scroll = (new ItemBasic(scrollIID)).setUnlocalizedName("rcbdm:scroll").setTextureName("rcbdm:scroll");
	}

	public void blockCode() 
	{
		BloodstoneBrick = new BlockBasic(BloodstoneBrickID).setHardness(120.0F).setResistance(2000.0F).setLightValue(0.10F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("rcbdm:BloodStoneBrick").setTextureName("rcbdm:BloodStoneBrick").setCreativeTab(RCB.Reactioncraft);
		Cherrywood = new BlockCherryTreeLog(CherrywoodID).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(0.5F).setUnlocalizedName("rcbdm:woodside");
		CherryTreeLeaves = new BlockCherryTreeLeaves(CherryTreeLeavesID).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(0.5F).setUnlocalizedName("rcbdm:CherryTreeLeaves").setTextureName("rcbdm:CherryTreeLeaves");
		CherryTreeSapling = new BlockCherryTreeSapling(CherryTreeSaplingID, 0).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(0.5F).setUnlocalizedName("rcbdm:CherryTreeSapling").setTextureName("rcbdm:CherryTreeSapling");
		HireoMulti = new BlockHireoMulti(HireoBlocksIID, Material.rock).setHardness(3.0F).setUnlocalizedName("HireoMulti");
		ColumnMulti = new BlockColumnMulti(ColumnBlockID, Material.rock).setUnlocalizedName("ColumnMulti");
		ColumnMulti2 = new BlockColumnMulti2(ColumnBlock2ID, Material.rock).setUnlocalizedName("ColumnMulti2");
		CherryPlanks = new BlockPlank(CherryPlanksID).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("rcbdm:cherryplanks").setTextureName("rcbdm:cherryplanks");
		DesertBlockMulti = new BlockDesertMulti(DesertBlockMultiID, Material.rock).setHardness(2.5F).setResistance(15.0F).setUnlocalizedName("DesertBlockMulti");
		Cactus1 = (new DesertFlower(Cactus1ID)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("rcbdm:Cactus1").setTextureName("rcbdm:Cactus1");
		Cactus2 = (new DesertFlower(Cactus2ID)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("rcbdm:Cactus2").setTextureName("rcbdm:Cactus2");
	}

	public void addNames() 
	{	
		IntegratedLanguageFile.loadBetterDesertnames();
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
		GameRegistry.registerBlock(RCBDM.CherryPlanks, "CherryPlanks");
		GameRegistry.registerBlock(CherryTreeSapling, "CherryTreeSapling");
		GameRegistry.registerBlock(BloodstoneBrick, "BloodstoneBrick");
	}

	public void registerHandlers() 
	{
		GameRegistry.registerCraftingHandler(new CraftingHandler());
		GameRegistry.registerWorldGenerator(new WorldGenHandler());	
		GameRegistry.registerWorldGenerator(new CustomBiomeGenerator());
		GameRegistry.registerFuelHandler(new FuelHandler());
	}

	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent evt)
	{	
		/**chisel Recipes**/
		//Flint
		GameRegistry.addRecipe(new ItemStack(FlintChisel, 1), new Object[]{"G", "I", Character.valueOf('G'), Item.flint, Character.valueOf('I'), Item.stick});
		//Copper
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(CopperChisel, true, new Object[]{"I", "X", Character.valueOf('I'), "ingotCopper", Character.valueOf('X'), Item.stick}));
		//Gold
		GameRegistry.addRecipe(new ItemStack(GoldChisel, 1), new Object[]{"G", "I", Character.valueOf('G'), Item.ingotGold, Character.valueOf('I'), Item.stick});
		//Diamond
		GameRegistry.addRecipe(new ItemStack(DiamondChisel, 1), new Object[]{"G", "I", Character.valueOf('G'), Item.diamond, Character.valueOf('I'), Item.stick});
		//Bloodstone
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(BloodstoneChisel, true, new Object[]{"I", "X", Character.valueOf('I'), "ingotBloodstone", Character.valueOf('X'), Item.stick}));
		
		
		FMLLog.info("The Deserts are Epic!"); 
	}
}