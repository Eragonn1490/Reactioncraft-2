package Reactioncraft.integration;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
import Reactioncraft.core.*;
import Reactioncraft.integration.*;

public class IntegratedConfigItem 
{
	public static void loadRCC() 
	{
		//Reserved 10031 - 10090  (10134-10135 Given to RCC from RCBDM)
		IntegratedConfigI.ChainLoopIID = Reactioncraft.config.getItem("Chain Loop", 10031).getInt();
		IntegratedConfigI.HammerIID = Reactioncraft.config.getItem("Hammer", 10032).getInt();
		IntegratedConfigI.BlackdiamondboreIID = Reactioncraft.config.getItem("Black Diamond Bore", 10033).getInt();
		IntegratedConfigI.BloodstoneboreIID = Reactioncraft.config.getItem("Bloodstone Bore", 10034).getInt();
		IntegratedConfigI.SandStonePasteIID = Reactioncraft.config.getItem("Dark Sandstone Paste", 10035).getInt();
		IntegratedConfigI.SamonRawIID = Reactioncraft.config.getItem("Raw Samon", 10036).getInt();
		IntegratedConfigI.SamonIID = Reactioncraft.config.getItem("Cooked Samon", 10037).getInt();
		IntegratedConfigI.YellowTailRawIID = Reactioncraft.config.getItem("Raw Yellowtail", 10038).getInt();
		IntegratedConfigI.YellowTailCookedIID = Reactioncraft.config.getItem("Cooked Yellowtail", 10039).getInt();
		IntegratedConfigI.MapinabottleIID = Reactioncraft.config.getItem("Map in a bottle", 10040).getInt();
		IntegratedConfigI.ShipinabottleIID = Reactioncraft.config.getItem("Ship in a bottle", 10041).getInt();
		IntegratedConfigI.meltedventiniteIID = Reactioncraft.config.getItem("Melted Ventinite", 10088).getInt();
		IntegratedConfigI.meltedwizimiteIID = Reactioncraft.config.getItem("Melted Wizimite", 10089).getInt();
		IntegratedConfigI.rcendereyeIID = Reactioncraft.config.getItem("Ender Eye 2", 10090).getInt();
		IntegratedConfigI.bloodstoneclumpIID = Reactioncraft.config.getItem("Bloodstone Clump", 10134).getInt();
		IntegratedConfigI.bloodstoneHammerIID = Reactioncraft.config.getItem("Bloodstone Hammer", 10135).getInt();
		
		if(IntegratedProperties.vanillaOverrideCake.getBoolean(true))
		{
			int cakeId = Item.cake.itemID;
			Item.itemsList[cakeId] = null;
			Item.cake = new ItemReed(cakeId - 256, Block.cake).setUnlocalizedName("cake").setTextureName("cake").setMaxStackSize(4).setCreativeTab(CreativeTabs.tabFood);
		}

		if(IntegratedProperties.vanillaOverrideBed.getBoolean(true))
		{
			int cakeId = Item.bed.itemID;
			Item.itemsList[cakeId] = null;
			Item.bed = new ItemBed(cakeId - 256).setUnlocalizedName("bed").setTextureName("bed").setMaxStackSize(3).setCreativeTab(CreativeTabs.tabDecorations);
		}
	}

	public static void loadRCBB() 
	{
		IntegratedConfigI.WoodenBookcasedoorIID = Reactioncraft.config.getItem("Wooden Bookcase Door", 10001).getInt();
		IntegratedConfigI.IronBookcasedoorIID = Reactioncraft.config.getItem("Iron Bookcase Door", 10002).getInt();
	}

	public static void loadRCBDM() 
	{
		//Items... 10121 - 10220 (132-133 given to RCCM) (10134-10135 Given to RCC)
		IntegratedConfigI.FlintChiselIID = Reactioncraft.config.getItem("Flint Chisel", 10121).getInt();
		IntegratedConfigI.GoldChiselIID = Reactioncraft.config.getItem("Gold Chisel", 10122).getInt();
		IntegratedConfigI.DiamondChiselIID = Reactioncraft.config.getItem("Diamond Chisel", 10123).getInt();
		IntegratedConfigI.BloodstoneChiselIID = Reactioncraft.config.getItem("Bloodstone Chisel", 10124).getInt();
		IntegratedConfigI.CopperChiselIID = Reactioncraft.config.getItem("Copper Chisel", 10125).getInt();
		IntegratedConfigI.UncutLBGemIID = Reactioncraft.config.getItem("Uncut Light Blue Gem", 10126).getInt();
		IntegratedConfigI.CutLBGemIID = Reactioncraft.config.getItem("Cut Light Blue Gem", 10127).getInt();
		IntegratedConfigI.UncutDBGemIID = Reactioncraft.config.getItem("Uncut Dark Blue Gem", 10128).getInt();
		IntegratedConfigI.CutDBGemIID = Reactioncraft.config.getItem("Cut Dark Blue Gem", 10129).getInt();
		IntegratedConfigI.scrollIID = Reactioncraft.config.getItem("Scroll", 10131).getInt();
	}

	public static void loadRCCM() 
	{
		//Items... 10091 - 10120
		IntegratedConfigI.CrownIID = Reactioncraft.config.getItem("Crown", 10091).getInt();
		IntegratedConfigI.KinglyChestIID = Reactioncraft.config.getItem("King Chest", 10092).getInt();
		IntegratedConfigI.KinglyLegsIID = Reactioncraft.config.getItem("King Legs", 10093).getInt();
		IntegratedConfigI.KinglyBootsIID = Reactioncraft.config.getItem("King Boots", 10094).getInt();	
		IntegratedConfigI.BagIID = Reactioncraft.config.getItem("Bag", 10095).getInt();
		IntegratedConfigI.SackIID = Reactioncraft.config.getItem("Sack", 10096).getInt();
		IntegratedConfigI.StrawIID = Reactioncraft.config.getItem("Straw", 10097).getInt();
		IntegratedConfigI.CoinMouldIID = Reactioncraft.config.getItem("Coin Mould 1", 10098).getInt();
		IntegratedConfigI.MetadatacoinIID = Reactioncraft.config.getItem("Metadata Coin", 10100).getInt();
		IntegratedConfigI.moltengoldIID   = Reactioncraft.config.getItem("molten gold"  , 10102).getInt();
		IntegratedConfigI.moltensilverIID = Reactioncraft.config.getItem("molten silver", 10103).getInt();
		IntegratedConfigI.moltencopperIID = Reactioncraft.config.getItem("molten copper", 10104).getInt();
		IntegratedConfigI.moltenbronzeIID = Reactioncraft.config.getItem("molten bronze", 10105).getInt();
		IntegratedConfigI.copperbucketIID = Reactioncraft.config.getItem("Copper Bucket", 10106).getInt();
		IntegratedConfigI.bronzebucketIID = Reactioncraft.config.getItem("Bronze Bucket", 10107).getInt();
		IntegratedConfigI.silverbucketIID = Reactioncraft.config.getItem("Silver Bucket", 10108).getInt();
		IntegratedConfigI.goldbucketIID   = Reactioncraft.config.getItem("Gold Bucket", 10109).getInt();
		IntegratedConfigI.ingotRefinedgoldIID = Reactioncraft.config.getItem("Ingot Refined Gold", 10110).getInt();
		IntegratedConfigI.ingotSilverIID = Reactioncraft.config.getItem("Ingot Silver", 10111).getInt();
		IntegratedConfigI.ingotBronzeIID = Reactioncraft.config.getItem("Ingot Bronze", 10112).getInt();
		IntegratedConfigI.ingotCopperIID = Reactioncraft.config.getItem("Ingot Copper", 10113).getInt();
		IntegratedConfigI.ingotmouldIID = Reactioncraft.config.getItem("Ingot Mould", 10114).getInt();
		IntegratedConfigI.rubyIID = Reactioncraft.config.getItem("Ruby Gem", 10133).getInt();
		
		IntegratedConfigI.rubycrownIID = 	Reactioncraft.config.getItem("Ruby Crown", 10115).getInt();
		IntegratedConfigI.diamondcrownIID = Reactioncraft.config.getItem("Diamond Crown", 10116).getInt();
		IntegratedConfigI.emeraldcrownIID = Reactioncraft.config.getItem("Emerald Crown", 10117).getInt();
		
		IntegratedConfigI.bloodstonehelmIID =  Reactioncraft.config.getItem("Bloodstone Helm", 10118).getInt();
		IntegratedConfigI.bloodstonechestIID = Reactioncraft.config.getItem("Bloodstone Chest", 10119).getInt();
		IntegratedConfigI.bloodstonelegsIID =  Reactioncraft.config.getItem("Bloodstone Legs", 10120).getInt();
		IntegratedConfigI.bloodstonebootsIID = Reactioncraft.config.getItem("Bloodstone Boots", 10132).getInt();
	}

	public static void loadRCF() 
	{
		IntegratedConfigI.knifeIID = Reactioncraft.config.getItem("Knife", 10269).getInt();
		IntegratedConfigI.EdibleFleshIID = Reactioncraft.config.getItem("Edible Flesh", 10270).getInt();
		IntegratedConfigI.cookedCornIID = Reactioncraft.config.getItem("Cooked Corn", 10271).getInt();
		IntegratedConfigI.popcornseedsIID = Reactioncraft.config.getItem("Popcorn Seeds", 10272).getInt();
		IntegratedConfigI.bagofpopcornIID = Reactioncraft.config.getItem("Bag of Popcorn", 10273).getInt();
		IntegratedConfigI.poppedbagofpopcornIID = Reactioncraft.config.getItem("Popped bag of Popcorn", 10274).getInt();
		IntegratedConfigI.rawcornIID = Reactioncraft.config.getItem("Raw Corn", 10275).getInt();
		IntegratedConfigI.UnwrappedCornIID = Reactioncraft.config.getItem("Unwrapped Corn", 10276).getInt();
		IntegratedConfigI.RawNuggetsIID = Reactioncraft.config.getItem("Raw Nuggets", 10278).getInt();
		IntegratedConfigI.ChickenNuggetsIID = Reactioncraft.config.getItem("Chicken Nuggets", 10279).getInt();
		IntegratedConfigI.SlicedBreadIID = Reactioncraft.config.getItem("Sliced Bread", 10280).getInt();
		IntegratedConfigI.HamSandwichIID = Reactioncraft.config.getItem("Ham Sandwich", 10281).getInt();
		IntegratedConfigI.HamburgerIID = Reactioncraft.config.getItem("Hamburger", 10282).getInt();
		IntegratedConfigI.CheeseburgerIID = Reactioncraft.config.getItem("Cheeseburger", 10283).getInt();
		IntegratedConfigI.BaconIID = Reactioncraft.config.getItem("Bacon", 10284).getInt();
		IntegratedConfigI.BaconRawIID = Reactioncraft.config.getItem("Raw Bacon", 10285).getInt();
		IntegratedConfigI.cheeseIID = Reactioncraft.config.getItem("cheese", 10286).getInt();
		//ButcheryCraft
		IntegratedConfigI.meatcleaverIID = Reactioncraft.config.getItem("Meat Cleaver", 10287).getInt();
		IntegratedConfigI.churnIID = Reactioncraft.config.getItem("Chrun", 10288).getInt();
		IntegratedConfigI.rawhumanIID = Reactioncraft.config.getItem("Raw Human", 10289).getInt();
		IntegratedConfigI.cookedhumanIID = Reactioncraft.config.getItem("Cooked Human", 10290).getInt();
		IntegratedConfigI.rawlambIID = Reactioncraft.config.getItem("Raw Lamb", 10291).getInt();
		IntegratedConfigI.cookedlambIID = Reactioncraft.config.getItem("Cooked Lamb", 10292).getInt();
		IntegratedConfigI.rawhorseIID = Reactioncraft.config.getItem("Raw Horse", 10293).getInt();
		IntegratedConfigI.cookedhorseIID = Reactioncraft.config.getItem("Cooked Horse", 10294).getInt();
		IntegratedConfigI.chickenHeadIID = Reactioncraft.config.getItem("Chicken Head", 10295).getInt();
		IntegratedConfigI.beefChunkIID = Reactioncraft.config.getItem("Beef Chunk", 10296).getInt();
		IntegratedConfigI.porkChunkIID = Reactioncraft.config.getItem("Pork Chunk", 10297).getInt();
		IntegratedConfigI.bunsIID = Reactioncraft.config.getItem("Buns", 10298).getInt();
	}

	public static void loadRCG() 
	{
		//Item ID 10951
		IntegratedConfigI.moltenglassIID = Reactioncraft.config.getItem("Molten Glass", 10951).getInt();
	}

	public static void loadRCMOBS() 
	{
		//10820 - 10840
		IntegratedConfigI.bonesIID = Reactioncraft.config.getItem("Bones", 10822).getInt();
		IntegratedConfigI.scoopIID = Reactioncraft.config.getItem("Scoop", 10823).getInt();
		IntegratedConfigI.frameBloodstoneIID = Reactioncraft.config.getItem("Bloodstone Frame", 10824).getInt();
		IntegratedConfigI.honeycombIID = Reactioncraft.config.getItem("Honey Comb", 10825).getInt();
		IntegratedConfigI.pollencombIID = Reactioncraft.config.getItem("Pollen Comb", 10826).getInt();
	}

	public static void loadRCMM() 
	{
		//10801 - 10820
		IntegratedConfigI.IceBucketIID = Reactioncraft.config.getItem("Ice Bucket", 10801).getInt();
		IntegratedConfigI.ObsidianBucketIID = Reactioncraft.config.getItem("Obsidian Bucket", 10802).getInt();
	}

	public static void loadRCORES()
	{
		//Item Ids 10851 - 10860
		IntegratedConfigI.goldrodIID = Reactioncraft.config.getItem("Golden Stick", 10851).getInt();
		IntegratedConfigI.obsidianingotIID = Reactioncraft.config.getItem("Obsidian Ingot", 10852).getInt();
		IntegratedConfigI.ingotbloodstoneIID = Reactioncraft.config.getItem("Bloodstone Ingot", 10853).getInt();
		IntegratedConfigI.ingotsilverIID = Reactioncraft.config.getItem("Silver Ingot", 10854).getInt();
		IntegratedConfigI.bloodstonedustIID = Reactioncraft.config.getItem("Bloodstone Dust", 10855).getInt();
		IntegratedConfigI.blackdiamondIID = Reactioncraft.config.getItem("Black Diamond", 10856).getInt();
		IntegratedConfigI.dragonstoneshardIID = Reactioncraft.config.getItem("Dragonstone Shard", 10857).getInt();
		IntegratedConfigI.irondustIID = Reactioncraft.config.getItem("Iron Dust", 10858).getInt();
		IntegratedConfigI.gemdragonstoneIID = Reactioncraft.config.getItem("Gem Dragonstone", 10859).getInt();
		IntegratedConfigI.superheatedironingotIID = Reactioncraft.config.getItem("Superheated Iron", 10860).getInt();
		IntegratedConfigI.goldDustIID = Reactioncraft.config.getItem("Gold Dust", 10950).getInt();
	}

	public static void loadNet() 
	{
		//10841 - 10850 (RCN OWNS all but 10845 & 10846)
		IntegratedConfigI.creativeNetIID = Reactioncraft.config.getItem("Creative Net Item", 10845).getInt();
		IntegratedConfigI.caught2IID = Reactioncraft.config.getItem("Caught 2", 10846).getInt();
	}

	public static void loadRCPM() 
	{
		//10861 - 10880
		IntegratedConfigI.AncientSeedsIID = Reactioncraft.config.getItem("Ancient Seeds", 10861).getInt();
		IntegratedConfigI.AncientFruitIID = Reactioncraft.config.getItem("Ancient Fruit", 10862).getInt();
		IntegratedConfigI.sugarcaneItemIID = Reactioncraft.config.getItem("Sugar Cane Item", 10967).getInt();
		IntegratedConfigI.WrappedcornIID = Reactioncraft.config.getItem("Wrapped Corn", 10868).getInt();
		IntegratedConfigI.CornSeedIID = Reactioncraft.config.getItem("Corn Seed", 10869).getInt();
		IntegratedConfigI.stalksItemIID = Reactioncraft.config.getItem("stalksItem", 10870).getInt();
		IntegratedConfigI.AncientFlowerIID = Reactioncraft.config.getItem("Ancient Flower", 10871).getInt();

	}

	public static void loadRCW() 
	{
		//Claimed Item IDS 10931 - 10949 (10950 given to RCORES but not reorganized) (10951 is molten glass in RCG)
		IntegratedConfigI.ObbyPickID = Reactioncraft.config.getItem("Obsidian Pick", 10931).getInt();
		IntegratedConfigI.ObbySwordID = Reactioncraft.config.getItem("Obsidian Sword", 10932).getInt();
		IntegratedConfigI.ObbyShovelID = Reactioncraft.config.getItem("Obsidian Shovel", 10933).getInt();
		IntegratedConfigI.ObbyAxeID = Reactioncraft.config.getItem("Obsidian Axe", 10934).getInt();
		IntegratedConfigI.ObbyHoeID = Reactioncraft.config.getItem("Obsidian Hoe", 10935).getInt();
		IntegratedConfigI.BloodstonePickID = Reactioncraft.config.getItem("Bloodstone Pick", 10936).getInt();
		IntegratedConfigI.BloodstoneSwordID = Reactioncraft.config.getItem("Bloodstone Sword", 10937).getInt();
		IntegratedConfigI.BloodstoneShovelID = Reactioncraft.config.getItem("Bloodstone Shovel", 10938).getInt();
		IntegratedConfigI.BloodstoneAxeID = Reactioncraft.config.getItem("Bloodstone Axe", 10939).getInt();
		IntegratedConfigI.BloodstoneHoeID = Reactioncraft.config.getItem("Bloodstone Hoe", 10940).getInt();
		IntegratedConfigI.BloodstoneBladeIID = Reactioncraft.config.getItem("Bloodstone Blade", 10941).getInt();
		IntegratedConfigI.GoldenSwordFragmentIID = Reactioncraft.config.getItem("Golden Sword Fragment", 10942).getInt();
		IntegratedConfigI.UnbindedSwordIID = Reactioncraft.config.getItem("Unbinded Sword", 10943).getInt();
		IntegratedConfigI.BloodstoneDiamondPickIID = Reactioncraft.config.getItem("Black Diamond Pick", 10944).getInt();
		IntegratedConfigI.batIID = Reactioncraft.config.getItem("Bat", 10945).getInt();
	}
}
