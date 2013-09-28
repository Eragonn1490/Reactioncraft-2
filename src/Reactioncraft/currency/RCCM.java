package Reactioncraft.currency;

import java.io.File;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.util.*;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import Reactioncraft.api.common.VillagerTradeHandler;
import Reactioncraft.basefiles.common.*;
import Reactioncraft.basefiles.common.PacketHandler;
import Reactioncraft.basemod.RCB;
import Reactioncraft.currency.common.*;
import Reactioncraft.integration.IntegratedLanguageFile;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "rccm", name="Reactioncraft Currency", version="[1.6.4] Reactioncraft 3 Version 1.1.4", dependencies = "required-after:rcc;after:rcw")
@NetworkMod(channels = { "RCCM" }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)

public class RCCM
{
	@SidedProxy(clientSide = "Reactioncraft.currency.client.ClientProxy", serverSide = "Reactioncraft.currency.common.CommonProxy")

	public static CommonProxy proxy;

	@Instance("RCCM")
	public static RCCM instance;

	//Config
	public static int MetadatacoinIID;
	//public static int Metadatacoin2IID;
	public static int CrownIID;
	public static int KinglyChestIID;
	public static int KinglyLegsIID;
	public static int KinglyBootsIID;	
	public static int BagIID;
	public static int SackIID;
	public static int StrawIID;
	public static int CoinMouldIID;
	public static int moltengoldIID;
	public static int moltensilverIID;
	public static int moltenbronzeIID;
	public static int moltencopperIID;
	public static int copperbucketIID;
	public static int silverbucketIID;
	public static int bronzebucketIID;
	public static int goldbucketIID;
	public static int ingotRefinedgoldIID;
	public static int ingotSilverIID;
	public static int ingotBronzeIID;
	public static int ingotCopperIID;
	public static int ingotmouldIID;

	//Items
	public static Item Metadatacoin;
	//public static Item Metadatacoin2;
	public static Item Crown;
	public static Item KinglyChest;
	public static Item KinglyLegs;
	public static Item KinglyBoots;	
	public static Item Bag;
	public static Item Sack;
	public static Item Straw;
	public static Item CoinMould;
	public static Item moltengold;
	public static Item moltensilver;
	public static Item moltencopper;
	public static Item moltenbronze;
	public static Item copperbucket;
	public static Item silverbucket;
	public static Item bronzebucket;
	public static Item goldbucket;
	public static Item ingotRefinedgold;
	public static Item ingotSilver;
	public static Item ingotBronze;
	public static Item ingotCopper;
	public static Item ingotmould;

	//private int renderSilver;

	//Config
	public static ReactioncraftConfiguration config;


	//public static final ResourceLocation field_110409_t = new ResourceLocation("rccm", "textures/entity/rcvillager.png");

	public static final int WILDCARD_VALUE = Short.MAX_VALUE;

	public static EnumArmorMaterial EmeraldArmor = EnumHelper.addArmorMaterial("emerald", 55, new int[]{1,2, 2, 1}, 0);
	//public static EnumArmorMaterial PowerSuit = EnumHelper.addArmorMaterial("powersuit", 0, new int[]{1,2,2,1}, 0);
	//public static EnumArmorMaterial bronzeArmorMaterial = EnumHelper.addArmorMaterial("IC2_BRONZE", 15, new int[] { 3, 8, 6, 3 }, 9);

	@EventHandler
	public void preInit(FMLPreInitializationEvent evt)
	{
		System.out.println("[RCCM] Pre Initialization Loaded");

		config = new ReactioncraftConfiguration(new File(evt.getModConfigurationDirectory(), "Reactioncraft/Currency.cfg"));

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

		config.load();

		//Items... 10091 - 10120
		CrownIID = config.getItem("Crown", 10091).getInt();
		KinglyChestIID = config.getItem("King Chest", 10092).getInt();
		KinglyLegsIID = config.getItem("King Legs", 10093).getInt();
		KinglyBootsIID = config.getItem("King Boots", 10094).getInt();	
		BagIID = config.getItem("Bag", 10095).getInt();
		SackIID = config.getItem("Sack", 10096).getInt();
		StrawIID = config.getItem("Straw", 10097).getInt();
		CoinMouldIID = config.getItem("Coin Mould 1", 10098).getInt();
		//CoinMould2IID = config.getItem("Coin Mould 2", 10099).getInt();
		MetadatacoinIID = config.getItem("Metadata Coin", 10100).getInt();
		//Metadatacoin2IID = config.getItem("Second Metadata Coin", 10101).getInt();
		moltengoldIID   = config.getItem("molten gold"  , 10102).getInt();
		moltensilverIID = config.getItem("molten silver", 10103).getInt();
		moltencopperIID = config.getItem("molten copper", 10104).getInt();
		moltenbronzeIID = config.getItem("molten bronze", 10105).getInt();
		copperbucketIID = config.getItem("Copper Bucket", 10106).getInt();
		bronzebucketIID = config.getItem("Bronze Bucket", 10107).getInt();
		silverbucketIID = config.getItem("Silver Bucket", 10108).getInt();
		goldbucketIID   = config.getItem("Gold Bucket", 10109).getInt();
		ingotRefinedgoldIID = config.getItem("Ingot Refined Gold", 10110).getInt();
		ingotSilverIID = config.getItem("Ingot Silver", 10111).getInt();
		ingotBronzeIID = config.getItem("Ingot Bronze", 10112).getInt();
		ingotCopperIID = config.getItem("Ingot Copper", 10113).getInt();
		ingotmouldIID = config.getItem("Ingot Mould", 10114).getInt();

		config.save();
	}	


	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderInformation();
		itemCode();
		addNames();
		oredictionary();
		furnaceRecipes();
		addRecipes();
		chestgenhooks();

		GameRegistry.registerCraftingHandler(new CraftingHandlerCurrency());
		
		HouseCreationHandler tavernCreator = new HouseCreationHandler();
		VillagerRegistry.instance().registerVillageCreationHandler(tavernCreator);
		
		VillagerTradeHandler vth = new VillagerTradeHandler();
		Proxies.render.registerVillagerSkin(VillagerTradeHandler.Reactioncraft_Trader, "textures/entity/rcvillager.png");
		VillagerRegistry.instance().registerVillageTradeHandler(VillagerTradeHandler.Reactioncraft_Trader, vth); 
		VillagerRegistry.instance().registerVillageCreationHandler(vth);
		VillagerRegistry.instance().registerVillagerId(VillagerTradeHandler.Reactioncraft_Trader);
		
		ComponentRCVillageHouse.registerTavernChest();
	}

	private void chestgenhooks() 
	{
		ChestGenHooks.addItem(ChestGenHooks.BONUS_CHEST, new WeightedRandomChestContent(new ItemStack(RCCM.ingotmould), 1, 2, 5));
		ChestGenHooks.addItem(ChestGenHooks.MINESHAFT_CORRIDOR, new WeightedRandomChestContent(new ItemStack(RCCM.ingotmould), 1, 2, 5));
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, new WeightedRandomChestContent(new ItemStack(RCCM.ingotmould), 1, 2, 5));
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST, new WeightedRandomChestContent(new ItemStack(RCCM.ingotmould), 1, 2, 5));
		ChestGenHooks.addItem(ChestGenHooks.VILLAGE_BLACKSMITH, new WeightedRandomChestContent(new ItemStack(RCCM.ingotmould), 1, 2, 5));

		ChestGenHooks.addItem(ChestGenHooks.BONUS_CHEST, new WeightedRandomChestContent(new ItemStack(RCCM.CoinMould), 1, 2, 5));
		ChestGenHooks.addItem(ChestGenHooks.MINESHAFT_CORRIDOR, new WeightedRandomChestContent(new ItemStack(RCCM.CoinMould), 1, 2, 5));
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, new WeightedRandomChestContent(new ItemStack(RCCM.CoinMould), 1, 2, 5));
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST, new WeightedRandomChestContent(new ItemStack(RCCM.CoinMould), 1, 2, 5));
		ChestGenHooks.addItem(ChestGenHooks.VILLAGE_BLACKSMITH, new WeightedRandomChestContent(new ItemStack(RCCM.CoinMould), 1, 2, 5));
	}


	private void oredictionary() 
	{
		//To Share
		OreDictionary.registerOre("ingotRefinedgold", new ItemStack(RCCM.ingotRefinedgold,1,0));
		OreDictionary.registerOre("ingotBronze", new ItemStack(RCCM.ingotBronze, 1, 0));
		OreDictionary.registerOre("ingotSilver", new ItemStack(RCCM.ingotSilver, 1, 0));
		OreDictionary.registerOre("ingotCopper", new ItemStack(RCCM.ingotCopper, 1, 0));
	}


	public void itemCode() 
	{
		//Coins
		Metadatacoin = (new CoinMetaItem(MetadatacoinIID).setUnlocalizedName("coin"));

		//Coin Items (Fix Textures)
		Bag = (new ItemBasic(BagIID).setUnlocalizedName("rccm:bag").setTextureName("rccm:bag"));
		Sack = (new ItemBasic(SackIID).setUnlocalizedName("rccm:sack").setTextureName("rccm:sack"));
		Straw = (new ItemBasic(StrawIID).setUnlocalizedName("rccm:straw").setTextureName("rccm:straw"));
		CoinMould = new ItemCoinMould(CoinMouldIID).setMaxStackSize(1).setUnlocalizedName("rccm:coinmould").setTextureName("rccm:coinmould");
		moltengold   = new ItemBasic(moltengoldIID).setMaxStackSize(1).setUnlocalizedName("rccm:moltengold")  .setTextureName("rccm:moltengold")    .setContainerItem(Item.bucketEmpty);
		moltensilver = new ItemBasic(moltensilverIID).setMaxStackSize(1).setUnlocalizedName("rccm:moltensilver").setTextureName("rccm:moltensilver").setContainerItem(Item.bucketEmpty);
		moltenbronze = new ItemBasic(moltenbronzeIID).setMaxStackSize(1).setUnlocalizedName("rccm:moltenbronze").setTextureName("rccm:moltenbronze").setContainerItem(Item.bucketEmpty);
		moltencopper = new ItemBasic(moltencopperIID).setMaxStackSize(1).setUnlocalizedName("rccm:moltencopper").setTextureName("rccm:moltencopper").setContainerItem(Item.bucketEmpty);
		copperbucket = new ItemBasic(copperbucketIID).setMaxStackSize(1).setUnlocalizedName("rccm:copperbucket").setTextureName("rccm:copperbucket").setContainerItem(Item.bucketEmpty);
		bronzebucket = new ItemBasic(bronzebucketIID).setMaxStackSize(1).setUnlocalizedName("rccm:bronzebucket").setTextureName("rccm:bronzebucket").setContainerItem(Item.bucketEmpty);
		silverbucket = new ItemBasic(silverbucketIID).setMaxStackSize(1).setUnlocalizedName("rccm:silverbucket").setTextureName("rccm:silverbucket").setContainerItem(Item.bucketEmpty);
		goldbucket   = new ItemBasic(goldbucketIID).setMaxStackSize(1).setUnlocalizedName("rccm:goldbucket")    .setTextureName("rccm:goldbucket")  .setContainerItem(Item.bucketEmpty);
		ingotRefinedgold = new ItemBasic(ingotRefinedgoldIID).setUnlocalizedName("rccm:ingotrgold") .setTextureName("rccm:ingotrgold");
		ingotSilver = new ItemBasic(ingotSilverIID).setUnlocalizedName("rccm:ingotsilver").setTextureName("rccm:ingotsilver");
		ingotBronze = new ItemBasic(ingotBronzeIID).setUnlocalizedName("rccm:ingotbronze").setTextureName("rccm:ingotbronze");
		ingotCopper = new ItemBasic(ingotCopperIID).setUnlocalizedName("rccm:ingotcopper").setTextureName("rccm:ingotcopper");
		ingotmould  = new ItemIngotMould(ingotmouldIID).setUnlocalizedName("rccm:ingotmould").setTextureName("rccm:ingotmould");

		//Armor Items (need to set textures)
		Crown = (new CurrencyArmor(CrownIID,             EmeraldArmor, 6, 0)).setUnlocalizedName("rccm:crown").setTextureName("rccm:crown").setCreativeTab(RCB.ReactioncraftItems);
		KinglyChest = (new CurrencyArmor(KinglyChestIID, EmeraldArmor, 6, 1)).setUnlocalizedName("rccm:kingchest").setTextureName("rccm:kingchest").setCreativeTab(RCB.ReactioncraftItems);
		KinglyLegs = (new CurrencyArmor(KinglyLegsIID,   EmeraldArmor, 6, 2)).setUnlocalizedName("rccm:kingpants").setTextureName("rccm:kingpants").setCreativeTab(RCB.ReactioncraftItems);
		KinglyBoots = (new CurrencyArmor(KinglyBootsIID, EmeraldArmor, 6, 3) .setUnlocalizedName("rccm:kingboots").setTextureName("rccm:kingboots").setCreativeTab(RCB.ReactioncraftItems));		
	}


	public void addNames()
	{
		IntegratedLanguageFile.loadCurrencynames();
	}

	public void furnaceRecipes() 
	{
		//1.6.2 Recipes
		GameRegistry.addSmelting(Block.tallGrass.blockID, new ItemStack(Straw), 0.5F); 
		GameRegistry.addSmelting(Item.ingotGold.itemID, new ItemStack(RCCM.ingotRefinedgold,1,0), 0.5F); 

		GameRegistry.addSmelting(RCCM.Crown.itemID, new ItemStack(RCCM.ingotRefinedgold,3,0), 0.5F);

		//Molten Gold
		GameRegistry.addSmelting(RCCM.goldbucket.itemID,   new ItemStack(RCCM.moltengold, 1, 0), 0.5F);
		//Molten Silver
		GameRegistry.addSmelting(RCCM.silverbucket.itemID, new ItemStack(RCCM.moltensilver, 1, 0), 0.5F);
		//Molten Bronze
		GameRegistry.addSmelting(RCCM.bronzebucket.itemID, new ItemStack(RCCM.moltenbronze, 1, 0), 0.5F);
		//Molten Copper
		GameRegistry.addSmelting(RCCM.copperbucket.itemID, new ItemStack(RCCM.moltencopper, 1, 0), 0.5F);
	}

	public void addRecipes()
	{
		//1.6.2 Recipes

		//Basics
		GameRegistry.addRecipe(new ItemStack(RCCM.Bag,1), new Object[]{
			"TTT","T T","TTT",'T', Straw
		});
		GameRegistry.addRecipe(new ItemStack(RCCM.Sack,1), new Object[]{
			"TTT","TTT",'T', Straw
		});

		//Armor
		GameRegistry.addRecipe(new ItemStack(RCCM.Crown,1), new Object[]{
			"T T","TTT",'T', Item.ingotGold
		});
		GameRegistry.addRecipe(new ItemStack(RCCM.KinglyChest,1), new Object[]{
			"T T","TTT","TTT",'T', Block.cloth
		});            
		GameRegistry.addRecipe(new ItemStack(RCCM.KinglyLegs,1), new Object[]{
			"TTT","T T","T T",'T', Block.cloth
		});            
		GameRegistry.addRecipe(new ItemStack(RCCM.KinglyBoots,1), new Object[]{
			"T T","T T",'T', Block.cloth
		});

		//Bronze Ingot
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(RCCM.ingotBronze,1,0), true, new Object[]{
			"XY", "YX", Character.valueOf('X'), "ingotCopper", Character.valueOf('Y'), "ingotTin"}));

		//Gold Bucket   / Downgrade
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(RCCM.goldbucket,1,0), true, new Object[] {"Y", "X", Character.valueOf('X'), Item.bucketEmpty, Character.valueOf('Y'), "ingotRefinedgold"}));
		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.ingotRefinedgold, 1), RCCM.goldbucket);
		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.ingotRefinedgold, 1), RCCM.moltengold, new ItemStack(RCCM.ingotmould,1, WILDCARD_VALUE));
		//Silver Bucket / Downgrade
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(RCCM.silverbucket,1,0), true, new Object[] {"Y", "X", Character.valueOf('X'), Item.bucketEmpty, Character.valueOf('Y'), "ingotSilver"}));
		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.ingotSilver, 1), RCCM.silverbucket);
		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.ingotSilver, 1), RCCM.moltensilver, new ItemStack(RCCM.ingotmould,1, WILDCARD_VALUE));
		//Bronze Bucket / Downgrade
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(RCCM.bronzebucket,1,0), true, new Object[] {"Y", "X", Character.valueOf('X'), Item.bucketEmpty, Character.valueOf('Y'), "ingotBronze"}));
		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.ingotBronze, 1), RCCM.bronzebucket);
		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.ingotBronze, 1), RCCM.moltenbronze, new ItemStack(RCCM.ingotmould,1, WILDCARD_VALUE));
		//Copper Bucket / Downgrade
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(RCCM.copperbucket,1,0), true, new Object[]{"Y", "X", Character.valueOf('X'), Item.bucketEmpty, Character.valueOf('Y'), "ingotCopper"}));
		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.ingotCopper, 1), RCCM.copperbucket);
		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.ingotCopper, 1), RCCM.moltencopper, new ItemStack(RCCM.ingotmould,1, WILDCARD_VALUE));

		/** Coin Crafting **/
		//Copper Coin Crafting
		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.Metadatacoin, 2, 0), new Object[]{new ItemStack(RCCM.moltencopper), new ItemStack(RCCM.CoinMould,1, WILDCARD_VALUE)});
		//Bronze Coin Crafting
		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.Metadatacoin, 2, 1), new Object[]{new ItemStack(RCCM.moltenbronze), new ItemStack(RCCM.CoinMould,1, WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(RCCM.Metadatacoin, 1, 2), new Object[]{ "###", "###", "###", Character.valueOf('#'), new ItemStack(RCCM.Metadatacoin, 1, 1),});
		GameRegistry.addRecipe(new ItemStack(RCCM.Metadatacoin, 1, 3), new Object[]{ "DDD", Character.valueOf('D'), new ItemStack(RCCM.Metadatacoin, 1, 2),});
		GameRegistry.addRecipe(new ItemStack(RCCM.Metadatacoin, 1, 4), new Object[]{ "###", "###", " D ", Character.valueOf('#'), new ItemStack(RCCM.Metadatacoin, 1, 3), Character.valueOf('D'), RCCM.Sack});
		GameRegistry.addRecipe(new ItemStack(RCCM.Metadatacoin, 1, 5), new Object[]{ "###", " D ", Character.valueOf('#'), new ItemStack(RCCM.Metadatacoin, 1, 4), Character.valueOf('D'), RCCM.Bag});
		//Silver Coin Crafting
		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.Metadatacoin, 2, 6), new Object[]{new ItemStack(RCCM.moltensilver), new ItemStack(RCCM.CoinMould,1, WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(RCCM.Metadatacoin, 1, 7), new Object[]{ "###", "###", "###", Character.valueOf('#'), new ItemStack(RCCM.Metadatacoin, 1, 6),});
		GameRegistry.addRecipe(new ItemStack(RCCM.Metadatacoin, 1, 8), new Object[]{ "DDD", Character.valueOf('D'), new ItemStack(RCCM.Metadatacoin, 1, 7)});
		GameRegistry.addRecipe(new ItemStack(RCCM.Metadatacoin, 1, 9), new Object[]{ "###", "###", " D ", Character.valueOf('#'), new ItemStack(RCCM.Metadatacoin, 1, 8), Character.valueOf('D'), RCCM.Sack});
		GameRegistry.addRecipe(new ItemStack(RCCM.Metadatacoin, 1, 10), new Object[]{ "###", " D ", Character.valueOf('#'), new ItemStack(RCCM.Metadatacoin, 1, 9), Character.valueOf('D'), RCCM.Bag});
		//Gold Coin Crafting
		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.Metadatacoin, 2,11), new Object[]{new ItemStack(RCCM.moltengold), new ItemStack(RCCM.CoinMould,1, WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(RCCM.Metadatacoin, 1, 12), new Object[]{ "###", "###", "###", Character.valueOf('#'), new ItemStack(RCCM.Metadatacoin, 2,11),});
		GameRegistry.addRecipe(new ItemStack(RCCM.Metadatacoin, 1, 13), new Object[]{ "DDD", Character.valueOf('D'), new ItemStack(RCCM.Metadatacoin, 2,12),});
		GameRegistry.addRecipe(new ItemStack(RCCM.Metadatacoin, 1, 14), new Object[]{ "###", "###", " D ", Character.valueOf('#'), new ItemStack(RCCM.Metadatacoin, 2,13), Character.valueOf('D'), RCCM.Sack});
		GameRegistry.addRecipe(new ItemStack(RCCM.Metadatacoin, 1, 15), new Object[]{ "###", " D ", Character.valueOf('#'), new ItemStack(RCCM.Metadatacoin, 2,14), Character.valueOf('D'), RCCM.Bag});

		//Old Downgrade System (Fix)
		//		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.Metadatacoin, , 11), new Object[]{new ItemStack(RCCM.Metadatacoin, 1, 12),});
		//		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.Metadatacoin, , 11), new Object[]{new ItemStack(RCCM.Metadatacoin,1,13),});
		//		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.Metadatacoin, , 13), new Object[]{new ItemStack(RCCM.Metadatacoin, 1, 14),});
		//		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.Metadatacoin, , 13), new Object[]{new ItemStack(RCCM.Metadatacoin, 1, 15),});
		//
		//		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.Metadatacoin2, 6, 0), new Object[]{new ItemStack(RCCM.Metadatacoin2, 1, 1),});
		//		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.Metadatacoin2, 18, 0), new Object[]{new ItemStack(RCCM.Metadatacoin2, 1, 2),});
		//		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.Metadatacoin2, 6, 2), new Object[]{new ItemStack(RCCM.Metadatacoin2,1,3),});
		//		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.Metadatacoin2, 54, 2), new Object[]{new ItemStack(RCCM.Metadatacoin2,1,4),});
		//
		//		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.Metadatacoin2, 6,6), new Object[]{new ItemStack(RCCM.Metadatacoin2,1,5),});
		//		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.Metadatacoin2, 18,6), new Object[]{new ItemStack(RCCM.Metadatacoin2,1,7),});
		//		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.Metadatacoin2, 6,7), new Object[]{new ItemStack(RCCM.Metadatacoin2,1,8),});
		//		GameRegistry.addShapelessRecipe(new ItemStack(RCCM.Metadatacoin2, 54,7), new Object[]{new ItemStack(RCCM.Metadatacoin2,1,9),});
	}
}
