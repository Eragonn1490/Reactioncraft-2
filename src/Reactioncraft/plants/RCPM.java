package Reactioncraft.plants;

import Reactioncraft.plants.client.ClientProxy;
import Reactioncraft.plants.common.CommonProxy;
import Reactioncraft.basefiles.common.PacketHandler;
import Reactioncraft.basefiles.common.*;
import Reactioncraft.basemod.RCB;
import Reactioncraft.plants.common.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockReed;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemReed;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
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

@Mod( modid = "RCPM", name="Reactioncraft Plants", version="[1.5.2] Reactioncraft Version 8.0")
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
    
    
    @PreInit
	 public void preInit(FMLPreInitializationEvent evt)
	 {
		 System.out.println("Pre Initialization Loaded");
		 
		 MinecraftForge.EVENT_BUS.register(new RCPMBonemealProvider());
		 
		 Configuration config = new Configuration(evt.getSuggestedConfigurationFile());

        config.load();
        
        //Claimed IDs 3081 - 3090
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
        
        config.save();
	 }
    

	 @Init
	 public void load(FMLInitializationEvent event)
	 {
	 	//the meat of the mod
		//Claimed Block Ids 3081 - 3099
		proxy.registerRenderInformation();
		
		//Blocks
		//CocoCrop = new BlockCocoPlant(CocoCropID).setHardness(0.0F).setResistance(1.0F).setUnlocalizedName("CocoCrop");
		AncientPlant = new BlockAncientPlant(AncientPlantID).setHardness(0.0F).setResistance(1.0F);
		sugarcaneBlock = (new BlockReed1(sugarcaneBlockID, 73)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep);
		cornBlock = new BlockCorn(cornBlockID, 40).setHardness(0.0F).setStepSound(Block.soundGrassFootstep);
		cornStalk = new BlockCornStalk(cornStalkID).setHardness(0.0F).setStepSound(Block.soundGrassFootstep);
		
		
		//Items
		AncientFlower = new ItemBasic(AncientFlowerIID).setUnlocalizedName("RCPM:AncientFlower").setCreativeTab(RCB.Reactioncraft).setCreativeTab(RCB.ReactioncraftItems);
		CornSeed = new ItemBasicSeed(CornSeedIID, RCPM.cornStalk.blockID, Block.tilledField.blockID).setUnlocalizedName("RCPM:CornSeed").setCreativeTab(RCB.ReactioncraftItems);
		AncientSeeds = new ItemBasicSeed(AncientSeedsIID, RCPM.AncientPlant.blockID, Block.tilledField.blockID).setUnlocalizedName("RCPM:AncientSeeds").setCreativeTab(RCB.ReactioncraftItems);
		AncientFruit = new ItemBasicFood(AncientFruitIID, 8, true).setUnlocalizedName("RCPM:AncientFruit").setCreativeTab(RCB.Reactioncraftfood);
		//CocoSeed = new ItemBasicSeed(CocoSeedIID, RCPM.CocoCrop.blockID, Block.tilledField.blockID).setUnlocalizedName("CocoSeed");
		//CocoBean = new ItemBasic(CocoBeanIID).setUnlocalizedName("CocoBean");
		//VanillaSeed= new ItemBasic(VanillaSeedIID).setUnlocalizedName("VanillaSeed");
		//VanillaBean= new ItemBasic(VanillaBeanIID).setUnlocalizedName("VanillaBean");
		sugarcaneItem = (new Itemsugarcane(sugarcaneItemIID, RCPM.sugarcaneBlock)).setUnlocalizedName("RCPM:sugarcaneItem").setCreativeTab(RCB.ReactioncraftItems);
		stalksItem = (new ItemStalks(stalksItemIID, RCPM.cornBlock)).setUnlocalizedName("RCPM:Stalks").setCreativeTab(RCB.ReactioncraftItems);
		Wrappedcorn = new ItemBasic(WrappedcornIID).setUnlocalizedName("RPCM:Wrappedcorn").setCreativeTab(RCB.Reactioncraftfood);
		
	
		//Registry Code
		GameRegistry.registerBlock(cornStalk, "cornStalk");
		GameRegistry.registerBlock(cornBlock, "Corn Block");
		//GameRegistry.registerBlock(CocoCrop, "CocoCrop");
		GameRegistry.registerBlock(AncientPlant, "AncientPlant");
		GameRegistry.registerBlock(sugarcaneBlock, "SugarcaneBlock");
		GameRegistry.registerItem(sugarcaneItem, "sugarcaneItem");
		
		
		//GameRegistry.addSmelting(CocoSeed.itemID, new ItemStack(CocoBean), 0.1F); 
		
		//Block Code
		LanguageRegistry.addName(cornBlock, "Corn Plant");
		LanguageRegistry.addName(cornStalk, "Corn Stalk");
		
		
		//Item Code
		LanguageRegistry.addName(CornSeed, "Corn Seed");
		LanguageRegistry.addName(AncientSeeds, "Ancient Seeds");
		LanguageRegistry.addName(AncientFruit, "Ancient Fruit");
		//LanguageRegistry.addName(CocoSeed, "Coco Seed");
		//LanguageRegistry.addName(CocoBean, "Coco Bean");
		LanguageRegistry.addName(sugarcaneItem, "Sugar Cane");
		LanguageRegistry.addName(AncientFlower, "Ancient Flower");
		LanguageRegistry.addName(Wrappedcorn, "Corn");
		LanguageRegistry.addName(stalksItem, "Corn Stalks");
		
		//MY Taller Sugarcane to Paper & sugar
		GameRegistry.addRecipe(new ItemStack(Item.paper, 3), new Object[] {"###", '#', RCPM.sugarcaneItem});
		GameRegistry.addRecipe(new ItemStack(Item.sugar, 1), new Object[] {"#", '#', RCPM.sugarcaneItem});
		
		//How to get mutated sugarcane
		GameRegistry.addShapelessRecipe(new ItemStack(sugarcaneItem, 2), new Object[] {AncientFlower, Item.reed});
		
		
		//Mojang coco bean to ours... Cooked one to ours (Rewriting this)
		GameRegistry.addShapelessRecipe(new ItemStack(AncientSeeds, 1), new Object[] {AncientFlower});
		GameRegistry.addShapelessRecipe(new ItemStack(AncientSeeds, 2), new Object[] {AncientFruit});
		//GameRegistry.addRecipe(new ItemStack(CocoSeed, 1), new Object[]{"#", Character.valueOf('#'), CocoBean});
		//GameRegistry.addRecipe(new ItemStack(CocoSeed, 1), new Object[]{"#", Character.valueOf('#'), new ItemStack(Item.dyePowder, 1, 3)});
		//GameRegistry.addRecipe(new ItemStack(Item.cookie, 12), new Object[]{"D#D", Character.valueOf('#'), CocoBean, Character.valueOf('D'), Item.wheat});
		
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
		MinecraftForge.addGrassSeed(new ItemStack(RCPM.CornSeed), 50);
		ChestGenHooks.addItem(ChestGenHooks.BONUS_CHEST, new WeightedRandomChestContent(new ItemStack(RCPM.CornSeed), 1, 2, 5));
		ChestGenHooks.addItem(ChestGenHooks.MINESHAFT_CORRIDOR, new WeightedRandomChestContent(new ItemStack(RCPM.CornSeed), 1, 5, 15));
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST, new WeightedRandomChestContent(new ItemStack(RCPM.CornSeed), 1, 5, 15));
	 
		//Sugarcane
		ChestGenHooks.addItem(ChestGenHooks.BONUS_CHEST, new WeightedRandomChestContent(new ItemStack(RCPM.sugarcaneItem), 1, 2, 5));
		ChestGenHooks.addItem(ChestGenHooks.MINESHAFT_CORRIDOR, new WeightedRandomChestContent(new ItemStack(RCPM.sugarcaneItem), 1, 5, 15));
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST, new WeightedRandomChestContent(new ItemStack(RCPM.sugarcaneItem), 1, 5, 15));
	 }
	 

	 @PostInit
	 public void modsLoaded(FMLPostInitializationEvent evt)
	 {
		 //new as well! How about that stuff after the mods are loaded/initialized?
	 }
}
