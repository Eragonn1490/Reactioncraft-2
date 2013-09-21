package Reactioncraft.integration;

import net.minecraft.item.ItemStack;
import Reactioncraft.desert.RCBDM;
import Reactioncraft.basemod.RCB;
import Reactioncraft.bookcase.RCBB;
import Reactioncraft.core.RCC;
import Reactioncraft.currency.RCCM;
import Reactioncraft.food.RCF;
import Reactioncraft.glass.RCG;
import Reactioncraft.machines.RCMM;
import Reactioncraft.mobs.RCmobs;
import Reactioncraft.ore.RCORES;
import Reactioncraft.plants.RCPM;
import Reactioncraft.tools.RCW;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class IntegratedLanguageFile 
{
	public static void loadBasenames() 
	{
		LanguageRegistry.addName(RCB.Mask, "Mask");
		LanguageRegistry.instance().addStringLocalization("itemGroup.ReactioncraftItems", "en_US", "RC Items");
		LanguageRegistry.instance().addStringLocalization("itemGroup.Reactioncraftfood",  "en_US", "RC Foodstuff");
		LanguageRegistry.instance().addStringLocalization("itemGroup.Reactioncraft",      "en_US", "RC Blocks");
	}

	public static void loadBookcasenames() 
	{
		LanguageRegistry.addName(RCBB.WoodenBookcasedoor, "Wooden Bookcase Door");
		LanguageRegistry.addName(RCBB.IronBookcasedoor, "Iron Bookcase Door");

		LanguageRegistry.addName(RCBB.Bookcasechest, "Chest Bookshelf");

		//Lever Bookcase
		LanguageRegistry.addName(RCBB.leverbookcase, "Lever Bookshelf");

		//Door Blocks
		LanguageRegistry.addName(RCBB.WoodenBookcasedoorBlock, "WoodenBookcasedoorBlock");
		LanguageRegistry.addName(RCBB.IronBookcasedoorBlock, "IronBookcasedoorBlock");

		//Metadata Bookshelfs
		LanguageRegistry.addName(new ItemStack(RCBB.bookcasemeta, 1, 0), "Empty Bookshelf");
		LanguageRegistry.addName(new ItemStack(RCBB.bookcasemeta, 1, 1), "Webbed Bookshelf");
		LanguageRegistry.addName(new ItemStack(RCBB.bookcasemeta, 1, 2), "Empty Webbed Bookshelf");
		LanguageRegistry.addName(new ItemStack(RCBB.bookcasemeta, 1, 3), "Scroll shelf");
	}

	public static void loadBetterDesertnames() 
	{
		//Cherry Trees
		LanguageRegistry.addName(RCBDM.Cherrywood, "Cherry Log");
		LanguageRegistry.addName(RCBDM.CherryTreeLeaves, "Cherry Leaves");
		LanguageRegistry.addName(RCBDM.CherryPlanks, "Cherry Planks");
		LanguageRegistry.addName(RCBDM.CherryTreeSapling, "Cherry Tree Sapling");


		//Scroll
		LanguageRegistry.addName(RCBDM.scroll, "Scroll");

		//Bloodstone Brick
		LanguageRegistry.addName(RCBDM.BloodstoneBrick, "Bloodstone Brick");

		//Gems
		LanguageRegistry.addName(RCBDM.UncutLBGem, "Uncut Light Blue Gem");
		LanguageRegistry.addName(RCBDM.CutLBGem, "Light Blue Gem");
		LanguageRegistry.addName(RCBDM.UncutDBGem, "Uncut Dark Blue Gem");
		LanguageRegistry.addName(RCBDM.CutDBGem, "Dark Blue Gem");

		//Chisel's
		LanguageRegistry.addName(RCBDM.GoldChisel, "Gold Chisel");
		LanguageRegistry.addName(RCBDM.FlintChisel, "Flint Chisel");
		LanguageRegistry.addName(RCBDM.CopperChisel, "Copper Chisel");
		LanguageRegistry.addName(RCBDM.DiamondChisel, "Diamond Chisel");
		LanguageRegistry.addName(RCBDM.BloodstoneChisel, "Bloodstone Chisel");

		//Desert Blocks
		LanguageRegistry.addName(new ItemStack(RCBDM.DesertBlockMulti, 1, 0),  "Carved Dark Stone");
		LanguageRegistry.addName(new ItemStack(RCBDM.DesertBlockMulti, 1, 1),  "Cracked Dark Stone");
		LanguageRegistry.addName(new ItemStack(RCBDM.DesertBlockMulti, 1, 2),  "Dark Stone");
		LanguageRegistry.addName(new ItemStack(RCBDM.DesertBlockMulti, 1, 3),  "Dark Stone Brick");
		LanguageRegistry.addName(new ItemStack(RCBDM.DesertBlockMulti, 1, 4),  "Cracked Dark Stone Brick");
		LanguageRegistry.addName(new ItemStack(RCBDM.DesertBlockMulti, 1, 5),  "Dark Sandstone Bricks");
		LanguageRegistry.addName(new ItemStack(RCBDM.DesertBlockMulti, 1, 6),  "Limestone");
		LanguageRegistry.addName(new ItemStack(RCBDM.DesertBlockMulti, 1, 7),  "Carved Limestone");
		LanguageRegistry.addName(new ItemStack(RCBDM.DesertBlockMulti, 1, 8),  "Desert Gemstone");
		LanguageRegistry.addName(new ItemStack(RCBDM.DesertBlockMulti, 1, 9),  "Desert Gemstone");
		LanguageRegistry.addName(new ItemStack(RCBDM.DesertBlockMulti, 1, 10), "Desert Gold");
		LanguageRegistry.addName(new ItemStack(RCBDM.DesertBlockMulti, 1, 11), "Mossy Dark Stone Brick");


		//Hireoglyphics
		LanguageRegistry.addName(new ItemStack(RCBDM.HireoMulti, 1, 0),     "Hireoglyphics");
		LanguageRegistry.addName(new ItemStack(RCBDM.HireoMulti, 1, 1), 	"Hireoglyphics");
		LanguageRegistry.addName(new ItemStack(RCBDM.HireoMulti, 1, 2), 	"Hireoglyphics");

		LanguageRegistry.addName(new ItemStack(RCBDM.HireoMulti, 1, 3), 	"Hireoglyphics");
		LanguageRegistry.addName(new ItemStack(RCBDM.HireoMulti, 1, 4), 	"Hireoglyphics");
		LanguageRegistry.addName(new ItemStack(RCBDM.HireoMulti, 1, 5), 	"Hireoglyphics");  

		LanguageRegistry.addName(new ItemStack(RCBDM.HireoMulti, 1, 6), 	"Hireoglyphics");
		LanguageRegistry.addName(new ItemStack(RCBDM.HireoMulti, 1, 7), 	"Hireoglyphics");
		LanguageRegistry.addName(new ItemStack(RCBDM.HireoMulti, 1, 8), 	"Hireoglyphics");

		//LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 9),   "Column Top");
		//LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 10),  "Column Base");		       
		//LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 12),  "Marble");

		//Weathered Hireoglyphic
		LanguageRegistry.addName(new ItemStack(RCBDM.HireoMulti, 1, 11),  "Weathered Hireoglyph");

		//Gold Hireoglyphics
		LanguageRegistry.addName(new ItemStack(RCBDM.HireoMulti, 1, 13),  "Hireoglyphics");  
		LanguageRegistry.addName(new ItemStack(RCBDM.HireoMulti, 1, 14),  "Hireoglyphics");  
		LanguageRegistry.addName(new ItemStack(RCBDM.HireoMulti, 1, 15),  "Hireoglyphics"); 


		LanguageRegistry.addName(new ItemStack(RCBDM.ColumnMulti, 1, 0), "Dark Sandstone Column");
		LanguageRegistry.addName(new ItemStack(RCBDM.ColumnMulti, 1, 1), "Marble Column");
		LanguageRegistry.addName(new ItemStack(RCBDM.ColumnMulti, 1, 2), "Bloodstone Column");
		LanguageRegistry.addName(new ItemStack(RCBDM.ColumnMulti, 1, 3), "Stone Column");
		LanguageRegistry.addName(new ItemStack(RCBDM.ColumnMulti, 1, 4), "Cobblestone Column");
		LanguageRegistry.addName(new ItemStack(RCBDM.ColumnMulti, 1, 5), "Gold Column");
		LanguageRegistry.addName(new ItemStack(RCBDM.ColumnMulti, 1, 6), "Diamond Column");
		LanguageRegistry.addName(new ItemStack(RCBDM.ColumnMulti, 1, 7), "Stonebrick Column");
		LanguageRegistry.addName(new ItemStack(RCBDM.ColumnMulti, 1, 8), "Limestone Column");

		LanguageRegistry.addName(new ItemStack(RCBDM.ColumnMulti2, 1, 0), "Dark Sandstone Column");
		LanguageRegistry.addName(new ItemStack(RCBDM.ColumnMulti2, 1, 1), "Marble Column");
		LanguageRegistry.addName(new ItemStack(RCBDM.ColumnMulti2, 1, 2), "Bloodstone Column");
		LanguageRegistry.addName(new ItemStack(RCBDM.ColumnMulti2, 1, 3), "Stone Column");
		LanguageRegistry.addName(new ItemStack(RCBDM.ColumnMulti2, 1, 4), "Cobblestone Column");
		LanguageRegistry.addName(new ItemStack(RCBDM.ColumnMulti2, 1, 5), "Gold Column");
		LanguageRegistry.addName(new ItemStack(RCBDM.ColumnMulti2, 1, 6), "Diamond Column");
		LanguageRegistry.addName(new ItemStack(RCBDM.ColumnMulti2, 1, 7), "Stonebrick Column");
		LanguageRegistry.addName(new ItemStack(RCBDM.ColumnMulti2, 1, 8), "Limestone Column");

		//Cactus's
		LanguageRegistry.addName(RCBDM.Cactus1, "Cactus");
		LanguageRegistry.addName(RCBDM.Cactus2, "Cactus");
	}

	public static void loadCorenames() 
	{
		LanguageRegistry.addName(RCC.newSponge, "Dry Sponge");
		LanguageRegistry.addName(RCC.clearBlock, "Clear Block");
		LanguageRegistry.addName(RCC.snowblock, "Snow Block");
		LanguageRegistry.addName(RCC.chainladder, "chain ladder");
		LanguageRegistry.addName(RCC.ChainLoop, "Chain Loop");
		LanguageRegistry.addName(RCC.Hammer, "Hammer");
		LanguageRegistry.addName(RCC.Blackdiamondbore, "Black Diamond Bore");
		LanguageRegistry.addName(RCC.Bloodstonebore, "Bloodstone Bore");

		//Dark Sand
		LanguageRegistry.addName(RCC.DarkSand, "Dark Sand");

		//Sandstone Paste
		LanguageRegistry.addName(RCC.SandStonePaste, "Dark Sand Clay");

		//New Fish
		LanguageRegistry.addName(RCC.SamonRaw, "Raw Samon");
		LanguageRegistry.addName(RCC.Samon, "Cooked Samon");

		LanguageRegistry.addName(RCC.YellowTailRaw, "Raw Yellow Tail");
		LanguageRegistry.addName(RCC.YellowTailCooked, "Cooked Yellowtail");
		LanguageRegistry.addName(RCC.Mapinabottle, "Map in a bottle");
		LanguageRegistry.addName(RCC.Shipinabottle, "Ship in a bottle");
	}

	public static void loadFoodnames() 
	{
		//LanguageRegistry.addName(carrotcake, "Carrot Cake");
		//LanguageRegistry.addName(ccItem, "Carrot Cake");
		//LanguageRegistry.addName(uncookedcc, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(Jellyfishonstick, "Jellyfish on stick");
		//LanguageRegistry.addName(bowlofeggs, "bowl of eggs");
		//LanguageRegistry.addName(whitechoclatebar, "white chocolate bar");
		//LanguageRegistry.addName(choclatebar, "chocolate bar");
		//LanguageRegistry.addName(darkchoclatebar, "dark chocolate bar");
		//LanguageRegistry.addName(choclatebarmould, "chocolate bar mould");
		//LanguageRegistry.addName(Coconutcake, "Coconut cake");
		//LanguageRegistry.addName(SteakSandwich, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(FishSandwich, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(Ham, "Carrot Cake");
		//LanguageRegistry.addName(SlicedCheese, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(HamandCheeseSandwich, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(Honeybun, "honeybun");
		//LanguageRegistry.addName(twinkie, "twinkie");
		//LanguageRegistry.addName(ChoclateCakeItem, "Chocolate Cake");
		//LanguageRegistry.addName(ccItem, "Carrot Cake");
		//LanguageRegistry.addName(uncookedcc, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(uncookedcc, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(uncookedcc, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(uncookedcc, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(uncookedcc, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(ccItem, "Carrot Cake");
		//LanguageRegistry.addName(uncookedcc, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(uncookedcc, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(uncookedcc, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(uncookedcc, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(uncookedcc, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(ccItem, "Carrot Cake");
		//LanguageRegistry.addName(uncookedcc, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(uncookedcc, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(uncookedcc, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(uncookedcc, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(uncookedcc, "Uncooked Carrot Cake");
		//LanguageRegistry.addName(ccItem, "Carrot Cake");
		//LanguageRegistry.addName(RCF.pumpkin, "Pumpkin");
		LanguageRegistry.addName(RCF.Knfie, "Knife");
		LanguageRegistry.addName(RCF.EdibleFlesh, "Edible Flesh");
		LanguageRegistry.instance().addName(RCF.cookedCorn, "Cooked Corn");
		LanguageRegistry.addName(RCF.popcornseeds, "Popcorn Kernals");
		LanguageRegistry.addName(RCF.bagofpopcorn, "Unpopped Bag of Popcorn");
		LanguageRegistry.addName(RCF.poppedbagofpopcorn, "Bag of Popcorn");
		LanguageRegistry.addName(RCF.rawcorn, "Uncooked Corn");
		LanguageRegistry.addName(RCF.UnwrappedCorn, "Unwrapped Corn");
		LanguageRegistry.addName(RCF.ChickenNuggets, "Chicken Nuggets");
		LanguageRegistry.addName(RCF.RawNuggets, "Raw Nuggets");
		LanguageRegistry.addName(RCF.SlicedBread, "sliced bread");
		LanguageRegistry.addName(RCF.HamSandwich, "Ham Sandwich");
		LanguageRegistry.addName(RCF.Hamburger, "Hamburger");
		LanguageRegistry.addName(RCF.Cheeseburger, "Cheeseburger");
		LanguageRegistry.addName(RCF.Bacon, "Bacon");
		LanguageRegistry.addName(RCF.BaconRaw, "Raw Bacon");
		LanguageRegistry.addName(RCF.cheese, "Cheese");
	}

	public static void loadGlassnames() 
	{
		LanguageRegistry.addName(new ItemStack(RCG.GlassMulti, 1), "Yellow StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlassMulti, 1, 1), "Red StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlassMulti, 1, 2), "Black StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlassMulti, 1, 3), "Blue StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlassMulti, 1, 4), "Brown StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlassMulti, 1, 5), "Cyan StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlassMulti, 1, 6), "Gray StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlassMulti, 1, 7), "Green StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlassMulti, 1, 8), "Lightblue StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlassMulti, 1, 9), "Lightgray StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlassMulti, 1, 10), "Limegreen StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlassMulti, 1, 11), "Magenta StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlassMulti, 1, 12), "Orange StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlassMulti, 1, 13), "Pink StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlassMulti, 1, 14), "Purple StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlassMulti, 1, 15), "White StainedGlass");

		//Glowing Glass Blocks
		LanguageRegistry.addName(new ItemStack(RCG.GlowingGlassMulti, 1, 0),  "Glowing Yellow StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlowingGlassMulti, 1, 1),  "Glowing Red StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlowingGlassMulti, 1, 2),  "Glowing Black StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlowingGlassMulti, 1, 3),  "Glowing Blue StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlowingGlassMulti, 1, 4),  "Glowing Brown StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlowingGlassMulti, 1, 5),  "Glowing Cyan StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlowingGlassMulti, 1, 6),  "Glowing Gray StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlowingGlassMulti, 1, 7),  "Glowing Green StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlowingGlassMulti, 1, 8),  "Glowing Lightblue StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlowingGlassMulti, 1, 9),  "Glowing Lightgray StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlowingGlassMulti, 1, 10), "Glowing Limegreen StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlowingGlassMulti, 1, 11), "Glowing Magenta StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlowingGlassMulti, 1, 12), "Glowing Orange StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlowingGlassMulti, 1, 13), "Glowing Pink StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlowingGlassMulti, 1, 14), "Glowing Purple StainedGlass");
		LanguageRegistry.addName(new ItemStack(RCG.GlowingGlassMulti, 1, 15), "Glowing White StainedGlass");

		LanguageRegistry.addName(RCG.moltenglass, "Molten Glass");
	}

	public static void loadMachinesnames() 
	{
		LanguageRegistry.addName(RCMM.FreezerIdle, "Freezer");
		LanguageRegistry.addName(RCMM.BrickOvenIdle, "Brick Oven");
		LanguageRegistry.addName(RCMM.ClayalizerIdle, "Clayalizer");
		LanguageRegistry.addName(RCMM.ObsidianBucket, "Bucket Of Obsidian");
		LanguageRegistry.addName(RCMM.IceBucket, "\u00a79Bucket Of Ice");

		//LanguageRegistry.addName(BigCraftingTable, "Large Crafting Table");

		//LanguageRegistry.addName(new ItemStack(MdGuiBlock, 1, 0), "Clayalizer");
		//LanguageRegistry.addName(new ItemStack(MdGuiBlock, 1, 1), "Brick Oven");
		//LanguageRegistry.addName(new ItemStack(MdGuiBlock, 1, 2), "Freezer");
	}

	public static void loadMobeggNames() 
	{
		LanguageRegistry.instance().addStringLocalization("entity.Bee.name", "en_US", "Bee");
		LanguageRegistry.instance().addStringLocalization("entity.Jellyfish.name", "en_US", "Jellyfish");
		LanguageRegistry.instance().addStringLocalization("entity.Sea Creeper.name", "en_US", "Seacreeper");
		LanguageRegistry.instance().addStringLocalization("entity.Stalker.name", "en_US", "Stalker");
		LanguageRegistry.instance().addStringLocalization("entity.Crawling Zombie.name", "en_US", "Crawling Zombie");
		LanguageRegistry.instance().addStringLocalization("entity.Crawling Skeleton.name", "en_US", "Crawling Skeleton");
		LanguageRegistry.instance().addStringLocalization("entity.Hydrolisc.name", "en_US", "Hydrolisc");
		LanguageRegistry.instance().addStringLocalization("entity.Tracker Jacker.name", "en_US", "Tracker Jacker");
	}

	public static void loadMobitemnames() 
	{
		LanguageRegistry.addName(RCmobs.hive, "Tracker Jacker Hive");
		//LanguageRegistry.addName(Jellyfish, "Jellyfish");
		//LanguageRegistry.addName(RcBee, "Bee");
		LanguageRegistry.addName(RCmobs.bones, "Bones");
		LanguageRegistry.addName(RCmobs.hiveframe, "Bloodstone Frame");
		LanguageRegistry.addName(RCmobs.scoop, "Bloodstone Scoop");
	}

	public static void loadOrenames() 
	{
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
		LanguageRegistry.addName(RCORES.superheatedironingot, "Superheated Iron Ingot"); 
		LanguageRegistry.addName(RCORES.irondust, "Iron Dust");
		LanguageRegistry.addName(RCORES.goldDust, "Gold Dust");


		//Surface Ores
		LanguageRegistry.addName(new ItemStack(RCORES.surfaceOres, 1, 0), "Silver Ore");
		LanguageRegistry.addName(new ItemStack(RCORES.surfaceOres, 1, 1), "Ventinite");


		//Nether Ores
		LanguageRegistry.addName(new ItemStack(RCORES.netherOres, 1, 0), "Bloodstone");
		LanguageRegistry.addName(new ItemStack(RCORES.netherOres, 1, 1), "Black Diamond");
		LanguageRegistry.addName(new ItemStack(RCORES.netherOres, 1, 2), "Dragonstone");
		LanguageRegistry.addName(new ItemStack(RCORES.netherOres, 1, 3), "Nether Diamond");
		LanguageRegistry.addName(new ItemStack(RCORES.netherOres, 1, 4), "Nether Gold");

		//End Ores
		LanguageRegistry.addName(new ItemStack(RCORES.endOres, 1, 0), "Wizimite");
	}

	public static void loadPlantsnames() 
	{
		//Block Code
		LanguageRegistry.addName(RCPM.cornBlock, "Corn Plant");
		LanguageRegistry.addName(RCPM.cornStalk, "Corn Stalk");

		//Item Code
		LanguageRegistry.addName(RCPM.CornSeed, "Corn Seed");
		LanguageRegistry.addName(RCPM.AncientSeeds, "Ancient Seeds");
		LanguageRegistry.addName(RCPM.AncientFruit, "Ancient Fruit");
		//LanguageRegistry.addName(RCPM.CocoSeed, "Coco Seed");
		//LanguageRegistry.addName(RCPM.CocoBean, "Coco Bean");
		LanguageRegistry.addName(RCPM.sugarcaneItem, "Sugar Canes");
		LanguageRegistry.addName(RCPM.AncientFlower, "Ancient Flower");
		LanguageRegistry.addName(RCPM.Wrappedcorn, "Wrapped Corn");
		LanguageRegistry.addName(RCPM.stalksItem, "Corn Stalks");
	}

	public static void loadWeaponnames() 
	{
		LanguageRegistry.addName(RCW.UnbindedSword, "UnBinded Sword");
		LanguageRegistry.addName(RCW.ObbySword, "Obsidian Sword");
		LanguageRegistry.addName(RCW.ObbyPick, "Obsidian Pickaxe");
		LanguageRegistry.addName(RCW.ObbyShovel, "Obsidian Shovel");
		LanguageRegistry.addName(RCW.ObbyAxe, "Obsidian Axe");
		LanguageRegistry.addName(RCW.ObbyHoe, "Obsidian Hoe");
		LanguageRegistry.addName(RCW.BloodstoneSword, "Bloodstone Sword");
		LanguageRegistry.addName(RCW.BloodstonePick, "Bloodstone Pickaxe");
		LanguageRegistry.addName(RCW.BloodstoneShovel, "Bloodstone Shovel");
		LanguageRegistry.addName(RCW.BloodstoneAxe, "Bloodstone Axe");
		LanguageRegistry.addName(RCW.BloodstoneHoe, "Bloodstone Hoe");
		LanguageRegistry.addName(RCW.BloodstoneBlade, "Bloodstone Blade");
		LanguageRegistry.addName(RCW.GoldenSwordFragment, "Gold Sword Fragment");
	}

	public static void loadCurrencynames() 
	{
		LanguageRegistry.addName(RCCM.CoinMould, "Coin Mould");
		LanguageRegistry.addName(RCCM.Crown, "Crown");
		LanguageRegistry.addName(RCCM.KinglyChest, "Kingly Chestplate");
		LanguageRegistry.addName(RCCM.KinglyLegs, "Kingly Legplate");
		LanguageRegistry.addName(RCCM.KinglyBoots, "Kingly Boots");
		LanguageRegistry.addName(RCCM.Bag, "bag");
		LanguageRegistry.addName(RCCM.Sack, "sack");
		LanguageRegistry.addName(RCCM.Straw, "Straw");
		LanguageRegistry.addName(RCCM.moltenbronze, "Molten Bronze Bucket");
		LanguageRegistry.addName(RCCM.moltencopper, "Molten Copper Bucket");
		LanguageRegistry.addName(RCCM.moltensilver, "Molten Silver Bucket");
		LanguageRegistry.addName(RCCM.moltengold,   "Molten Gold Bucket");
		LanguageRegistry.addName(RCCM.bronzebucket, "Bronze Ingot Bucket");
		LanguageRegistry.addName(RCCM.copperbucket, "Copper Ingot Bucket");
		LanguageRegistry.addName(RCCM.silverbucket, "Silver Ingot Bucket");
		LanguageRegistry.addName(RCCM.goldbucket,   "Gold Ingot Bucket");
		LanguageRegistry.addName(RCCM.ingotBronze, "Bronze Ingot");
		LanguageRegistry.addName(RCCM.ingotCopper, "Copper Ingot");
		LanguageRegistry.addName(RCCM.ingotSilver, "Silver Ingot");
		LanguageRegistry.addName(RCCM.ingotRefinedgold, "Refined Gold Ingot");
		LanguageRegistry.addName(RCCM.ingotmould, "Ingot Mould");

		LanguageRegistry.addName(new ItemStack(RCCM.Metadatacoin, 1, 0),  "Copper Coin");
		LanguageRegistry.addName(new ItemStack(RCCM.Metadatacoin, 1, 1),  "Bronze Coin");
		LanguageRegistry.addName(new ItemStack(RCCM.Metadatacoin, 1, 2),  "Bronze Coins");
		LanguageRegistry.addName(new ItemStack(RCCM.Metadatacoin, 1, 3),  "Bronze Stack");
		LanguageRegistry.addName(new ItemStack(RCCM.Metadatacoin, 1, 4),  "Bronze Sack");
		LanguageRegistry.addName(new ItemStack(RCCM.Metadatacoin, 1, 5),  "Bronze Bag");
		LanguageRegistry.addName(new ItemStack(RCCM.Metadatacoin, 1, 6),  "Silver Coin");
		LanguageRegistry.addName(new ItemStack(RCCM.Metadatacoin, 1, 7),  "Silver Coins");
		LanguageRegistry.addName(new ItemStack(RCCM.Metadatacoin, 1, 8),  "Silver Stack");
		LanguageRegistry.addName(new ItemStack(RCCM.Metadatacoin, 1, 9),  "Silver Sack");
		LanguageRegistry.addName(new ItemStack(RCCM.Metadatacoin, 1, 10), "Silver Bag");
		LanguageRegistry.addName(new ItemStack(RCCM.Metadatacoin, 1, 11), "Gold Coin");
		LanguageRegistry.addName(new ItemStack(RCCM.Metadatacoin, 1, 12), "Gold Coins");
		LanguageRegistry.addName(new ItemStack(RCCM.Metadatacoin, 1, 13), "Gold Stack");
		LanguageRegistry.addName(new ItemStack(RCCM.Metadatacoin, 1, 14), "Gold Sack");
		LanguageRegistry.addName(new ItemStack(RCCM.Metadatacoin, 1, 15), "Gold Bag");
	}
}
