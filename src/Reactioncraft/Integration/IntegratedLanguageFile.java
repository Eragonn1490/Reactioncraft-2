package Reactioncraft.integration;

import net.minecraft.item.*;
import Reactioncraft.integration.*;
import Reactioncraft.basemod.RCB;
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
		LanguageRegistry.addName(IntegratedItems.WoodenBookcasedoor, "Wooden Bookcase Door");
		LanguageRegistry.addName(IntegratedItems.IronBookcasedoor, "Iron Bookcase Door");

		LanguageRegistry.addName(IntegratedBlocks.Bookcasechest, "Chest Bookshelf");

		//Lever Bookcase
		LanguageRegistry.addName(IntegratedBlocks.leverbookcase, "Lever Bookshelf");

		//Door Blocks
		LanguageRegistry.addName(IntegratedBlocks.WoodenBookcasedoorBlock, "WoodenBookcasedoorBlock");
		LanguageRegistry.addName(IntegratedBlocks.IronBookcasedoorBlock, "IronBookcasedoorBlock");

		//Metadata Bookshelfs
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.bookcasemeta, 1, 0), "Empty Bookshelf");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.bookcasemeta, 1, 1), "Webbed Bookshelf");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.bookcasemeta, 1, 2), "Empty Webbed Bookshelf");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.bookcasemeta, 1, 3), "Scroll shelf");
	}

	public static void loadBetterDesertnames() 
	{
		//Cherry Trees
		LanguageRegistry.addName(IntegratedBlocks.Cherrywood, "Cherry Wood");
		LanguageRegistry.addName(IntegratedBlocks.CherryTreeLeaves, "Cherry Leaves");
		LanguageRegistry.addName(IntegratedBlocks.CherryPlanks, "Cherry Planks");
		LanguageRegistry.addName(IntegratedBlocks.CherryTreeSapling, "Cherry Tree Sapling");


		//Scroll
		LanguageRegistry.addName(IntegratedItems.scroll, "Scroll");

		//Bloodstone Brick
		LanguageRegistry.addName(IntegratedBlocks.BloodstoneBrick, "Bloodstone Brick");

		//Gems
		LanguageRegistry.addName(IntegratedItems.UncutLBGem, "Uncut Light Blue Gem");
		LanguageRegistry.addName(IntegratedItems.CutLBGem, "Light Blue Gem");
		LanguageRegistry.addName(IntegratedItems.UncutDBGem, "Uncut Dark Blue Gem");
		LanguageRegistry.addName(IntegratedItems.CutDBGem, "Dark Blue Gem");

		//Chisel's
		LanguageRegistry.addName(IntegratedItems.GoldChisel, "Gold Chisel");
		LanguageRegistry.addName(IntegratedItems.FlintChisel, "Flint Chisel");
		LanguageRegistry.addName(IntegratedItems.CopperChisel, "Copper Chisel");
		LanguageRegistry.addName(IntegratedItems.DiamondChisel, "Diamond Chisel");
		LanguageRegistry.addName(IntegratedItems.BloodstoneChisel, "Bloodstone Chisel");

		//Desert Blocks
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0),  "Carved Dark Stone");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 1),  "Cracked Dark Stone");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 2),  "Dark Stone");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 3),  "Dark Stone Brick");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 4),  "Cracked Dark Stone Brick");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 5),  "Dark Sandstone Bricks");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 6),  "Limestone");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 7),  "Carved Limestone");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 8),  "Desert Gemstone");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 9),  "Desert Gemstone");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 10), "Desert Gold");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 11), "Mossy Dark Stone Brick");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 12), "Desert Coal");


		//Hireoglyphics
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.HireoMulti, 1, 0),  "Hireoglyphics");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.HireoMulti, 1, 1), 	"Hireoglyphics");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.HireoMulti, 1, 2), 	"Hireoglyphics");

		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.HireoMulti, 1, 3), 	"Hireoglyphics");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.HireoMulti, 1, 4), 	"Hireoglyphics");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.HireoMulti, 1, 5), 	"Hireoglyphics");  

		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.HireoMulti, 1, 6), 	"Hireoglyphics");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.HireoMulti, 1, 7), 	"Hireoglyphics");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.HireoMulti, 1, 8), 	"Hireoglyphics");

		//LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 9),   "Column Top");
		//LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 10),  "Column Base");		       
		//LanguageRegistry.addName(new ItemStack(HireoMulti, 1, 12),  "Marble");

		//Weathered Hireoglyphic
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.HireoMulti, 1, 11),  "Weathered Hireoglyph");

		//Gold Hireoglyphics
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.HireoMulti, 1, 13),  "Hireoglyphics");  
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.HireoMulti, 1, 14),  "Hireoglyphics");  
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.HireoMulti, 1, 15),  "Hireoglyphics"); 


		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 0), "Dark Sandstone Brick Column");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 1), "Marble Column");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 2), "Bloodstone Column");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 3), "Stone Column");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 4), "Cobblestone Column");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 5), "Gold Column");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 6), "Diamond Column");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 7), "Stonebrick Column");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 8), "Limestone Column");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 9), "Dark Sandstone Column");

		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 0), "Dark Sandstone Brick Column");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 1), "Marble Column");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 2), "Bloodstone Column");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 3), "Stone Column");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 4), "Cobblestone Column");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 5), "Gold Column");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 6), "Diamond Column");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 7), "Stonebrick Column");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 8), "Limestone Column");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 9), "Dark Sandstone Column");

		//Cactus's
		LanguageRegistry.addName(IntegratedBlocks.Cactus1, "Cactus");
		LanguageRegistry.addName(IntegratedBlocks.Cactus2, "Cactus");
	}

	public static void loadCorenames() 
	{
		LanguageRegistry.addName(IntegratedBlocks.newSponge, "Dry Sponge");
		LanguageRegistry.addName(IntegratedBlocks.clearBlock, "Clear Block");
		LanguageRegistry.addName(IntegratedBlocks.snowblock, "Snow Block");
		LanguageRegistry.addName(IntegratedBlocks.chainladder, "chain ladder");
		//Dark Sand
		LanguageRegistry.addName(IntegratedBlocks.DarkSand, "Dark Sand");
		
		LanguageRegistry.addName(IntegratedItems.ChainLoop, "Chain Loop");
		LanguageRegistry.addName(IntegratedItems.Hammer, "Hammer");
		LanguageRegistry.addName(IntegratedItems.Blackdiamondbore, "Black Diamond Bore");
		LanguageRegistry.addName(IntegratedItems.Bloodstonebore, "Bloodstone Bore");
		//Sandstone Paste
		LanguageRegistry.addName(IntegratedItems.SandStonePaste, "Dark Sand Clay");
		//New Fishing Items
		LanguageRegistry.addName(IntegratedItems.SamonRaw, "Raw Samon");
		LanguageRegistry.addName(IntegratedItems.Samon, "Cooked Samon");
		LanguageRegistry.addName(IntegratedItems.YellowTailRaw, "Raw Yellow Tail");
		LanguageRegistry.addName(IntegratedItems.YellowTailCooked, "Cooked Yellowtail");
		LanguageRegistry.addName(IntegratedItems.Mapinabottle, "Map in a bottle");
		LanguageRegistry.addName(IntegratedItems.Shipinabottle, "Ship in a bottle");
		
		//Melted End Ores
		LanguageRegistry.addName(IntegratedItems.meltedventinite, "Melted Ventinite");
		LanguageRegistry.addName(IntegratedItems.meltedwizimite, "Melted Wizimite");
		
		//End Portal
		LanguageRegistry.addName(IntegratedBlocks.enderportal, "End Portal Frame");
		
		//IC2 Independent Items
		LanguageRegistry.addName(IntegratedItems.bloodstoneclump, "Bloodstone Clump");
		LanguageRegistry.addName(IntegratedItems.bloodstoneHammer, "Bloodstone Hammer");
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
		//LanguageRegistry.addName(IntegratedItems.pumpkin, "Pumpkin");
		LanguageRegistry.addName(IntegratedItems.Knfie, "Knife");
		LanguageRegistry.addName(IntegratedItems.EdibleFlesh, "Edible Flesh");
		LanguageRegistry.instance().addName(IntegratedItems.cookedCorn, "Cooked Corn");
		LanguageRegistry.addName(IntegratedItems.popcornseeds, "Popcorn Kernals");
		LanguageRegistry.addName(IntegratedItems.bagofpopcorn, "Unpopped Bag of Popcorn");
		LanguageRegistry.addName(IntegratedItems.poppedbagofpopcorn, "Bag of Popcorn");
		LanguageRegistry.addName(IntegratedItems.rawcorn, "Uncooked Corn");
		LanguageRegistry.addName(IntegratedItems.UnwrappedCorn, "Unwrapped Corn");
		LanguageRegistry.addName(IntegratedItems.ChickenNuggets, "Chicken Nuggets");
		LanguageRegistry.addName(IntegratedItems.RawNuggets, "Raw Nuggets");
		LanguageRegistry.addName(IntegratedItems.SlicedBread, "sliced bread");
		LanguageRegistry.addName(IntegratedItems.HamSandwich, "Ham Sandwich");
		LanguageRegistry.addName(IntegratedItems.Hamburger, "Hamburger");
		LanguageRegistry.addName(IntegratedItems.Cheeseburger, "Cheeseburger");
		LanguageRegistry.addName(IntegratedItems.Bacon, "Bacon");
		LanguageRegistry.addName(IntegratedItems.BaconRaw, "Raw Bacon");
		LanguageRegistry.addName(IntegratedItems.cheese, "Cheese");
		LanguageRegistry.addName(IntegratedItems.meatcleaver, "Meat Cleaver");
		LanguageRegistry.addName(IntegratedItems.churn, "Churn");
		LanguageRegistry.addName(IntegratedItems.rawHuman, "Raw Human Shoulder");
		LanguageRegistry.addName(IntegratedItems.cookedHuman, "Cooked Human Shoulder");
		LanguageRegistry.addName(IntegratedItems.rawLamb, "Raw Lamb");
		LanguageRegistry.addName(IntegratedItems.cookedLamb, "Cooked Lamb");
		//Language Registry
		LanguageRegistry.addName(IntegratedItems.rawHorse, "Raw Horse");
		LanguageRegistry.addName(IntegratedItems.cookedHorse, "Cooked Horse");
		LanguageRegistry.addName(IntegratedItems.chickenHead, "Chicken Head");
		LanguageRegistry.addName(IntegratedItems.beefChunk, "Chunk of Beef");
		LanguageRegistry.addName(IntegratedItems.porkChunk, "Chunk of Pork");
		LanguageRegistry.addName(IntegratedItems.buns, "Buns");
	}

	public static void loadGlassnames() 
	{
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlassMulti, 1), "Yellow StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlassMulti, 1, 1), "Red StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlassMulti, 1, 2), "Black StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlassMulti, 1, 3), "Blue StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlassMulti, 1, 4), "Brown StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlassMulti, 1, 5), "Cyan StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlassMulti, 1, 6), "Gray StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlassMulti, 1, 7), "Green StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlassMulti, 1, 8), "Lightblue StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlassMulti, 1, 9), "Lightgray StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlassMulti, 1, 10), "Limegreen StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlassMulti, 1, 11), "Magenta StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlassMulti, 1, 12), "Orange StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlassMulti, 1, 13), "Pink StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlassMulti, 1, 14), "Purple StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlassMulti, 1, 15), "White StainedGlass");

		//Glowing Glass Blocks
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 0),  "Glowing Yellow StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 1),  "Glowing Red StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 2),  "Glowing Black StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 3),  "Glowing Blue StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 4),  "Glowing Brown StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 5),  "Glowing Cyan StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 6),  "Glowing Gray StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 7),  "Glowing Green StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 8),  "Glowing Lightblue StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 9),  "Glowing Lightgray StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 10), "Glowing Limegreen StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 11), "Glowing Magenta StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 12), "Glowing Orange StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 13), "Glowing Pink StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 14), "Glowing Purple StainedGlass");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 15), "Glowing White StainedGlass");

		LanguageRegistry.addName(IntegratedItems.moltenglass, "Molten Glass");
	}

	public static void loadMachinesnames() 
	{
		LanguageRegistry.addName(IntegratedBlocks.FreezerIdle, "Freezer");
		LanguageRegistry.addName(IntegratedBlocks.BrickOvenIdle, "Brick Oven");
		LanguageRegistry.addName(IntegratedBlocks.ClayalizerIdle, "Clayalizer");
		LanguageRegistry.addName(IntegratedItems.ObsidianBucket, "Bucket Of Obsidian");
		LanguageRegistry.addName(IntegratedItems.IceBucket, "\u00a79Bucket Of Ice");

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
		LanguageRegistry.addName(IntegratedBlocks.rchive, "Tracker Jacker Hive");
		//LanguageRegistry.addName(Jellyfish, "Jellyfish");
		//LanguageRegistry.addName(RcBee, "Bee");
		LanguageRegistry.addName(IntegratedItems.bones, "Bones");
		LanguageRegistry.addName(IntegratedItems.hiveframe, "Bloodstone Frame");
		LanguageRegistry.addName(IntegratedItems.scoop, "Bloodstone Scoop");
		LanguageRegistry.addName(IntegratedItems.pollencomb, "Pollen Comb");
		LanguageRegistry.addName(IntegratedItems.honeycomb, "Honey Comb");
	}

	public static void loadOrenames() 
	{
		//Ore Items
		LanguageRegistry.addName(IntegratedItems.goldrod, "Golden Rod"); 
		LanguageRegistry.addName(IntegratedItems.obsidianingot, "Obsidian Ingot"); 
		LanguageRegistry.addName(IntegratedItems.blackdiamond, "Black Diamond"); 
		LanguageRegistry.addName(IntegratedItems.ingotbloodstone, "Bloodstone Ingot"); 
		LanguageRegistry.addName(IntegratedItems.ingotsilver, "Silver Ingot"); 
		//LanguageRegistry.addName(IntegratedBlocks.OreItems, "End Gem");
		LanguageRegistry.addName(IntegratedItems.bloodstonedust, "Bloodstone Dust");  
		LanguageRegistry.addName(IntegratedItems.dragonstoneshard, "Dragonstone Shard");
		LanguageRegistry.addName(IntegratedItems.gemdragonstone, "Carved Dragonstone");
		LanguageRegistry.addName(IntegratedItems.superheatedironingot, "Superheated Iron Ingot"); 
		LanguageRegistry.addName(IntegratedItems.irondust, "Iron Dust");
		LanguageRegistry.addName(IntegratedItems.goldDust, "Nether Gold Clump");


		//Surface Ores
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.surfaceOres, 1, 0), "Silver Ore");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.surfaceOres, 1, 1), "Ventinite");


		//Nether Ores
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.netherOres, 1, 0), "Bloodstone");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.netherOres, 1, 1), "Black Diamond");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.netherOres, 1, 2), "Dragonstone");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.netherOres, 1, 3), "Nether Diamond");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.netherOres, 1, 4), "Nether Gold");

		//End Ores
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.endOres, 1, 0), "Wizimite");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.endOres, 1, 1), "Ventinite");
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.endOres, 1, 2), "Infused Whitestone");
	}

	public static void loadPlantsnames() 
	{
		//Block Code
		LanguageRegistry.addName(IntegratedBlocks.cornBlock, "Corn Plant");
		LanguageRegistry.addName(IntegratedBlocks.cornStalk, "Corn Stalk");
		LanguageRegistry.addName(IntegratedBlocks.sugarcaneBlock, "Sugar Cane");

		//Item Code
		LanguageRegistry.addName(IntegratedItems.CornSeed, "Corn Seed");
		LanguageRegistry.addName(IntegratedItems.AncientSeeds, "Ancient Seeds");
		LanguageRegistry.addName(IntegratedItems.AncientFruit, "Ancient Fruit");
		//LanguageRegistry.addName(RCPM.CocoSeed, "Coco Seed");
		//LanguageRegistry.addName(RCPM.CocoBean, "Coco Bean");
		LanguageRegistry.addName(IntegratedItems.sugarcaneItem, "Sugar Canes");
		LanguageRegistry.addName(IntegratedItems.AncientFlower, "Ancient Flower");
		LanguageRegistry.addName(IntegratedItems.Wrappedcorn, "Wrapped Corn");
		LanguageRegistry.addName(IntegratedItems.stalksItem, "Corn Stalks");
	}

	public static void loadWeaponnames() 
	{
		LanguageRegistry.addName(IntegratedItems.UnbindedSword, "UnBinded Sword");
		LanguageRegistry.addName(IntegratedItems.ObbySword, "Obsidian Sword");
		LanguageRegistry.addName(IntegratedItems.ObbyPick, "Obsidian Pickaxe");
		LanguageRegistry.addName(IntegratedItems.ObbyShovel, "Obsidian Shovel");
		LanguageRegistry.addName(IntegratedItems.ObbyAxe, "Obsidian Axe");
		LanguageRegistry.addName(IntegratedItems.ObbyHoe, "Obsidian Hoe");
		LanguageRegistry.addName(IntegratedItems.BloodstoneSword, "Bloodstone Sword");
		LanguageRegistry.addName(IntegratedItems.BloodstonePick, "Bloodstone Pickaxe");
		LanguageRegistry.addName(IntegratedItems.BloodstoneShovel, "Bloodstone Shovel");
		LanguageRegistry.addName(IntegratedItems.BloodstoneAxe, "Bloodstone Axe");
		LanguageRegistry.addName(IntegratedItems.BloodstoneHoe, "Bloodstone Hoe");
		LanguageRegistry.addName(IntegratedItems.BloodstoneBlade, "Bloodstone Blade");
		LanguageRegistry.addName(IntegratedItems.GoldenSwordFragment, "Gold Sword Fragment");
		LanguageRegistry.addName(IntegratedItems.BloodstoneDiamondPick, "Black Diamond Pickaxe");
		LanguageRegistry.addName(IntegratedItems.Bat, "Bat");
	}

	public static void loadCurrencynames() 
	{
		LanguageRegistry.addName(IntegratedItems.CoinMould, "Coin Mould");
		LanguageRegistry.addName(IntegratedItems.Crown, "Crown");
		LanguageRegistry.addName(IntegratedItems.KinglyChest, "Kingly Chestplate");
		LanguageRegistry.addName(IntegratedItems.KinglyLegs, "Kingly Legplate");
		LanguageRegistry.addName(IntegratedItems.KinglyBoots, "Kingly Boots");
		LanguageRegistry.addName(IntegratedItems.Bag, "bag");
		LanguageRegistry.addName(IntegratedItems.Sack, "sack");
		LanguageRegistry.addName(IntegratedItems.Straw, "Straw");
		LanguageRegistry.addName(IntegratedItems.moltenbronze, "Molten Bronze Bucket");
		LanguageRegistry.addName(IntegratedItems.moltencopper, "Molten Copper Bucket");
		LanguageRegistry.addName(IntegratedItems.moltensilver, "Molten Silver Bucket");
		LanguageRegistry.addName(IntegratedItems.moltengold,   "Molten Gold Bucket");
		LanguageRegistry.addName(IntegratedItems.bronzebucket, "Bronze Ingot Bucket");
		LanguageRegistry.addName(IntegratedItems.copperbucket, "Copper Ingot Bucket");
		LanguageRegistry.addName(IntegratedItems.silverbucket, "Silver Ingot Bucket");
		LanguageRegistry.addName(IntegratedItems.goldbucket,   "Gold Ingot Bucket");
		LanguageRegistry.addName(IntegratedItems.ingotBronze, "Bronze Ingot");
		LanguageRegistry.addName(IntegratedItems.ingotCopper, "Copper Ingot");
		LanguageRegistry.addName(IntegratedItems.ingotSilver, "Silver Ingot");
		LanguageRegistry.addName(IntegratedItems.ingotRefinedgold, "Refined Gold Ingot");
		LanguageRegistry.addName(IntegratedItems.ingotmould, "Ingot Mould");
		LanguageRegistry.addName(IntegratedItems.ruby, "Ruby");
		
		//Crowns
		LanguageRegistry.addName(IntegratedItems.emeraldcrown, "Emerald Crown");
		LanguageRegistry.addName(IntegratedItems.rubycrown,    "Ruby Crown");
		LanguageRegistry.addName(IntegratedItems.diamondcrown, "Diamond Crown");
		//BS Armor
		LanguageRegistry.addName(IntegratedItems.bloodstonehelm,  "Bloodstone Helmet");
		LanguageRegistry.addName(IntegratedItems.bloodstonechest, "Bloodstone Chestplate");
		LanguageRegistry.addName(IntegratedItems.bloodstonelegs,  "Bloodstone Leggings");
		LanguageRegistry.addName(IntegratedItems.bloodstoneboots, "Bloodstone Boots");
		
		LanguageRegistry.addName(new ItemStack(IntegratedItems.Metadatacoin, 1, 0),  "Copper Coin");
		LanguageRegistry.addName(new ItemStack(IntegratedItems.Metadatacoin, 1, 1),  "Bronze Coin");
		LanguageRegistry.addName(new ItemStack(IntegratedItems.Metadatacoin, 1, 2),  "Bronze Coins");
		LanguageRegistry.addName(new ItemStack(IntegratedItems.Metadatacoin, 1, 3),  "Bronze Stack");
		LanguageRegistry.addName(new ItemStack(IntegratedItems.Metadatacoin, 1, 4),  "Bronze Sack");
		LanguageRegistry.addName(new ItemStack(IntegratedItems.Metadatacoin, 1, 5),  "Bronze Bag");
		LanguageRegistry.addName(new ItemStack(IntegratedItems.Metadatacoin, 1, 6),  "Silver Coin");
		LanguageRegistry.addName(new ItemStack(IntegratedItems.Metadatacoin, 1, 7),  "Silver Coins");
		LanguageRegistry.addName(new ItemStack(IntegratedItems.Metadatacoin, 1, 8),  "Silver Stack");
		LanguageRegistry.addName(new ItemStack(IntegratedItems.Metadatacoin, 1, 9),  "Silver Sack");
		LanguageRegistry.addName(new ItemStack(IntegratedItems.Metadatacoin, 1, 10), "Silver Bag");
		LanguageRegistry.addName(new ItemStack(IntegratedItems.Metadatacoin, 1, 11), "Gold Coin");
		LanguageRegistry.addName(new ItemStack(IntegratedItems.Metadatacoin, 1, 12), "Gold Coins");
		LanguageRegistry.addName(new ItemStack(IntegratedItems.Metadatacoin, 1, 13), "Gold Stack");
		LanguageRegistry.addName(new ItemStack(IntegratedItems.Metadatacoin, 1, 14), "Gold Sack");
		LanguageRegistry.addName(new ItemStack(IntegratedItems.Metadatacoin, 1, 15), "Gold Bag");
	}

	public static void loadNetNames() 
	{
		LanguageRegistry.instance().addStringLocalization("entity.EntityPlayerClone.name", "en_US", "Player");
	}
}
