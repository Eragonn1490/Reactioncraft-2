package Reactioncraft.integration;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import Reactioncraft.bookcase.common.*;
import Reactioncraft.core.common.*;
import Reactioncraft.currency.common.*;
import Reactioncraft.desert.common.*;
import Reactioncraft.integration.*;
import Reactioncraft.mobs.common.*;
import Reactioncraft.net.Common.*;
import Reactioncraft.food.common.*;
import Reactioncraft.plants.common.*;
import Reactioncraft.tools.common.*;
import Reactioncraft.vanillaclasses.*;
import Reactioncraft.basefiles.common.*;
import Reactioncraft.basemod.RCB;

public class IntegratedItemCode 
{
	public static void loadRCC() 
	{
		IntegratedItems.ChainLoop = (new ItemBasic(IntegratedConfigI.ChainLoopIID)).setUnlocalizedName("reactioncraft:ChainLoop").setTextureName("reactioncraft:ChainLoop");
		IntegratedItems.Hammer = (new ItemHammer(IntegratedConfigI.HammerIID)).setMaxStackSize(1).setUnlocalizedName("reactioncraft:Hammer").setTextureName("reactioncraft:Hammer");
		IntegratedItems.Blackdiamondbore = new IBlackDiamondBH(IntegratedConfigI.BlackdiamondboreIID).setUnlocalizedName("reactioncraft:Blackdiamondbore").setTextureName("reactioncraft:Blackdiamondbore").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.Bloodstonebore = new IBloodstoneBH(IntegratedConfigI.BloodstoneboreIID).setUnlocalizedName("reactioncraft:Bloodstonebore").setTextureName("reactioncraft:Bloodstonebore").setCreativeTab(RCB.ReactioncraftItems);		
		IntegratedItems.SandStonePaste = (new ItemBasic(IntegratedConfigI.SandStonePasteIID)).setUnlocalizedName("reactioncraft:SandStonePaste").setTextureName("reactioncraft:SandStonePaste");
		IntegratedItems.SamonRaw = (new ItemBasicFood(IntegratedConfigI.SamonRawIID, 2, 0.3F, false)).setUnlocalizedName("reactioncraft:samonr").setTextureName("reactioncraft:samonr");
		IntegratedItems.Samon = (new ItemBasicFood(IntegratedConfigI.SamonIID, 5, 0.6F, false)).setUnlocalizedName("reactioncraft:samonc").setTextureName("reactioncraft:samonc");
		IntegratedItems.YellowTailRaw = (new ItemBasicFood(IntegratedConfigI.YellowTailRawIID, 2, 0.3F, false)).setUnlocalizedName("reactioncraft:yellowtailr").setTextureName("reactioncraft:yellowtailr");
		IntegratedItems.YellowTailCooked = (new ItemBasicFood(IntegratedConfigI.YellowTailCookedIID, 5, 0.6F, false)).setUnlocalizedName("reactioncraft:yellowtailc").setTextureName("reactioncraft:yellowtailc");
		IntegratedItems.Mapinabottle = new ItemBasic(IntegratedConfigI.MapinabottleIID).setUnlocalizedName("reactioncraft:mapinbottle").setTextureName("reactioncraft:mapinbottle").setContainerItem(Item.glassBottle).setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.Shipinabottle = new ItemBasic(IntegratedConfigI.ShipinabottleIID).setUnlocalizedName("reactioncraft:shipinbottle").setTextureName("reactioncraft:shipinbottle").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.rcendereye = (new RCItemEnderEye(IntegratedConfigI.rcendereyeIID)).setUnlocalizedName("eyeOfEnder").setTextureName("reactioncraft:rcender_eye").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.meltedventinite = new ItemBasic(IntegratedConfigI.meltedventiniteIID).setUnlocalizedName("reactioncraft:meltedventinite").setTextureName("reactioncraft:meltedventinite").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.meltedwizimite = new ItemBasic(IntegratedConfigI.meltedwizimiteIID).setUnlocalizedName("reactioncraft:meltedwizimite").setTextureName("reactioncraft:meltedwizimite").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.bloodstoneclump = new ItemBasic(IntegratedConfigI.bloodstoneclumpIID).setUnlocalizedName("reactioncraft:bloodstoneclump").setTextureName("reactioncraft:bloodstoneclump").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.bloodstoneHammer = new ItemHammer2(IntegratedConfigI.bloodstoneHammerIID).setUnlocalizedName("reactioncraft:bloodstonehammer").setTextureName("reactioncraft:bloodstonehammer").setCreativeTab(RCB.ReactioncraftItems);
	}

	public static void loadRCBB()
	{
		IntegratedItems.WoodenBookcasedoor = (new ItemBookcaseDoor(IntegratedConfigI.WoodenBookcasedoorIID, Material.wood)).setUnlocalizedName("reactioncraft:WoodenBookcasedoor").setTextureName("reactioncraft:WoodenBookcasedoor");
		IntegratedItems.IronBookcasedoor = (new ItemBookcaseDoor(IntegratedConfigI.IronBookcasedoorIID, Material.iron)).setUnlocalizedName("reactioncraft:IronBookcasedoor").setTextureName("reactioncraft:IronBookcasedoor");
	}

	public static void loadRCBDM() 
	{
		IntegratedItems.FlintChisel =      (new ItemChisel(IntegratedConfigI.FlintChiselIID).setUnlocalizedName("reactioncraft:flintchisel").setTextureName("reactioncraft:flintchisel"));
		IntegratedItems.GoldChisel =       (new ItemChisel2(IntegratedConfigI.GoldChiselIID)).setUnlocalizedName("reactioncraft:goldchisel").setTextureName("reactioncraft:goldchisel");
		IntegratedItems.CopperChisel =     (new ItemChisel3(IntegratedConfigI.CopperChiselIID).setUnlocalizedName("reactioncraft:copperchisel").setTextureName("reactioncraft:copperchisel"));
		IntegratedItems.DiamondChisel =    (new ItemChisel4(IntegratedConfigI.DiamondChiselIID)).setUnlocalizedName("reactioncraft:diamondchisel").setTextureName("reactioncraft:diamondchisel");
		IntegratedItems.BloodstoneChisel = (new ItemChisel5(IntegratedConfigI.BloodstoneChiselIID)).setUnlocalizedName("reactioncraft:bloodstonechisel").setTextureName("reactioncraft:bloodstonechisel");
		IntegratedItems.UncutLBGem = (new ItemBasic(IntegratedConfigI.UncutLBGemIID)).setUnlocalizedName("reactioncraft:UncutLBGem").setTextureName("reactioncraft:UncutLBGem");
		IntegratedItems.CutLBGem = (new ItemBasic(IntegratedConfigI.CutLBGemIID)).setUnlocalizedName("reactioncraft:CutLBGem").setTextureName("reactioncraft:CutLBGem");
		IntegratedItems.UncutDBGem = (new ItemBasic(IntegratedConfigI.UncutDBGemIID)).setUnlocalizedName("reactioncraft:UncutDBGem").setTextureName("reactioncraft:UncutDBGem");
		IntegratedItems.CutDBGem = (new ItemBasic(IntegratedConfigI.CutDBGemIID)).setUnlocalizedName("reactioncraft:CutDBGem").setTextureName("reactioncraft:CutDBGem");
		IntegratedItems.scroll = (new ItemBasic(IntegratedConfigI.scrollIID)).setUnlocalizedName("reactioncraft:scroll").setTextureName("reactioncraft:scroll");
	}

	public static void loadRCCM() 
	{
		//Coins
		IntegratedItems.Metadatacoin = (new CoinMetaItem(IntegratedConfigI.MetadatacoinIID).setUnlocalizedName("coin"));

		//Coin Items (Fix Textures)
		IntegratedItems.Bag = (new ItemBasic(IntegratedConfigI.BagIID).setUnlocalizedName("reactioncraft:bag").setTextureName("reactioncraft:bag"));
		IntegratedItems.Sack = (new ItemBasic(IntegratedConfigI.SackIID).setUnlocalizedName("reactioncraft:sack").setTextureName("reactioncraft:sack"));
		IntegratedItems.Straw = (new ItemBasic(IntegratedConfigI.StrawIID).setUnlocalizedName("reactioncraft:straw").setTextureName("reactioncraft:straw"));
		IntegratedItems.CoinMould = new ItemCoinMould(IntegratedConfigI.CoinMouldIID).setMaxStackSize(1).setUnlocalizedName("reactioncraft:coinmould").setTextureName("reactioncraft:coinmould");
		IntegratedItems.moltengold   = new ItemBasic(IntegratedConfigI.moltengoldIID).setMaxStackSize(1).setUnlocalizedName("reactioncraft:moltengold")  .setTextureName("reactioncraft:moltengold")    .setContainerItem(Item.bucketEmpty);
		IntegratedItems.moltensilver = new ItemBasic(IntegratedConfigI.moltensilverIID).setMaxStackSize(1).setUnlocalizedName("reactioncraft:moltensilver").setTextureName("reactioncraft:moltensilver").setContainerItem(Item.bucketEmpty);
		IntegratedItems.moltenbronze = new ItemBasic(IntegratedConfigI.moltenbronzeIID).setMaxStackSize(1).setUnlocalizedName("reactioncraft:moltenbronze").setTextureName("reactioncraft:moltenbronze").setContainerItem(Item.bucketEmpty);
		IntegratedItems.moltencopper = new ItemBasic(IntegratedConfigI.moltencopperIID).setMaxStackSize(1).setUnlocalizedName("reactioncraft:moltencopper").setTextureName("reactioncraft:moltencopper").setContainerItem(Item.bucketEmpty);
		IntegratedItems.copperbucket = new ItemBasic(IntegratedConfigI.copperbucketIID).setMaxStackSize(1).setUnlocalizedName("reactioncraft:copperbucket").setTextureName("reactioncraft:copperbucket").setContainerItem(Item.bucketEmpty);
		IntegratedItems.bronzebucket = new ItemBasic(IntegratedConfigI.bronzebucketIID).setMaxStackSize(1).setUnlocalizedName("reactioncraft:bronzebucket").setTextureName("reactioncraft:bronzebucket").setContainerItem(Item.bucketEmpty);
		IntegratedItems.silverbucket = new ItemBasic(IntegratedConfigI.silverbucketIID).setMaxStackSize(1).setUnlocalizedName("reactioncraft:silverbucket").setTextureName("reactioncraft:silverbucket").setContainerItem(Item.bucketEmpty);
		IntegratedItems.goldbucket   = new ItemBasic(IntegratedConfigI.goldbucketIID).setMaxStackSize(1).setUnlocalizedName("reactioncraft:goldbucket")    .setTextureName("reactioncraft:goldbucket")  .setContainerItem(Item.bucketEmpty);
		IntegratedItems.ingotRefinedgold = new ItemBasic(IntegratedConfigI.ingotRefinedgoldIID).setUnlocalizedName("reactioncraft:ingotrgold") .setTextureName("reactioncraft:ingotrgold");
		IntegratedItems.ingotSilver = new ItemBasic(IntegratedConfigI.ingotSilverIID).setUnlocalizedName("reactioncraft:ingotsilver").setTextureName("reactioncraft:ingotsilver");
		IntegratedItems.ingotBronze = new ItemBasic(IntegratedConfigI.ingotBronzeIID).setUnlocalizedName("reactioncraft:ingotbronze").setTextureName("reactioncraft:ingotbronze");
		IntegratedItems.ingotCopper = new ItemBasic(IntegratedConfigI.ingotCopperIID).setUnlocalizedName("reactioncraft:ingotcopper").setTextureName("reactioncraft:ingotcopper");
		IntegratedItems.ingotmould  = new ItemIngotMould(IntegratedConfigI.ingotmouldIID).setUnlocalizedName("reactioncraft:ingotmould").setTextureName("reactioncraft:ingotmould");
		IntegratedItems.ruby        = new ItemBasic(IntegratedConfigI.rubyIID).setUnlocalizedName("reactioncraft:ruby").setTextureName("reactioncraft:ruby");
		
		//Armor Items
		IntegratedItems.Crown =       (new CurrencyArmor(IntegratedConfigI.CrownIID,       IntegratedMaterials.EmeraldArmor, 6, 0)).setUnlocalizedName("reactioncraft:crown").setTextureName("reactioncraft:crown").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.KinglyChest = (new CurrencyArmor(IntegratedConfigI.KinglyChestIID, IntegratedMaterials.EmeraldArmor, 6, 1)).setUnlocalizedName("reactioncraft:kingchest").setTextureName("reactioncraft:kingchest").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.KinglyLegs  = (new CurrencyArmor(IntegratedConfigI.KinglyLegsIID,  IntegratedMaterials.EmeraldArmor, 6, 2)).setUnlocalizedName("reactioncraft:kingpants").setTextureName("reactioncraft:kingpants").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.KinglyBoots = (new CurrencyArmor(IntegratedConfigI.KinglyBootsIID, IntegratedMaterials.EmeraldArmor, 6, 3) .setUnlocalizedName("reactioncraft:kingboots").setTextureName("reactioncraft:kingboots").setCreativeTab(RCB.ReactioncraftItems));
		//Crowns
		IntegratedItems.rubycrown =      (new CurrencyArmor2(IntegratedConfigI.rubycrownIID,  IntegratedMaterials.EmeraldArmor, 6, 0)).setUnlocalizedName("reactioncraft:rubycrown").setTextureName("reactioncraft:rubycrown").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.diamondcrown =   (new CurrencyArmor4(IntegratedConfigI.diamondcrownIID,  IntegratedMaterials.EmeraldArmor, 6, 0)).setUnlocalizedName("reactioncraft:diamondcrown").setTextureName("reactioncraft:diamondcrown").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.emeraldcrown =   (new CurrencyArmor5(IntegratedConfigI.emeraldcrownIID,  IntegratedMaterials.EmeraldArmor, 6, 0)).setUnlocalizedName("reactioncraft:emeraldcrown").setTextureName("reactioncraft:emeraldcrown").setCreativeTab(RCB.ReactioncraftItems);
		//Bloodstone
		IntegratedItems.bloodstonehelm  =   (new CurrencyArmor3(IntegratedConfigI.bloodstonehelmIID,   IntegratedMaterials.BloodstoneArmor, 6, 0)).setUnlocalizedName("reactioncraft:bloodstonehelm").setTextureName("reactioncraft:bloodstonehelm").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.bloodstonechest =   (new CurrencyArmor3(IntegratedConfigI.bloodstonechestIID,  IntegratedMaterials.BloodstoneArmor, 6, 1)).setUnlocalizedName("reactioncraft:bloodstonechest").setTextureName("reactioncraft:bloodstonechest").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.bloodstonelegs  =   (new CurrencyArmor3(IntegratedConfigI.bloodstonelegsIID,   IntegratedMaterials.BloodstoneArmor, 6, 2)).setUnlocalizedName("reactioncraft:bloodstonelegs").setTextureName("reactioncraft:bloodstonelegs").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.bloodstoneboots =   (new CurrencyArmor3(IntegratedConfigI.bloodstonebootsIID,  IntegratedMaterials.BloodstoneArmor, 6, 3)).setUnlocalizedName("reactioncraft:bloodstoneboots").setTextureName("reactioncraft:bloodstoneboots").setCreativeTab(RCB.ReactioncraftItems);
	}

	public static void loadRCG() 
	{
		IntegratedItems.moltenglass = new ItemBasic(IntegratedConfigI.moltenglassIID).setUnlocalizedName("reactioncraft:MG").setTextureName("reactioncraft:MG").setCreativeTab(RCB.ReactioncraftItems);
	}

	public static void loadRCMM() 
	{
		IntegratedItems.IceBucket = (new ItemBasic(IntegratedConfigI.IceBucketIID)).setMaxStackSize(1).setUnlocalizedName("reactioncraft:IceBucket").setTextureName("reactioncraft:IceBucket").setContainerItem(Item.bucketEmpty);
		IntegratedItems.ObsidianBucket = (new ItemBasic(IntegratedConfigI.ObsidianBucketIID)).setMaxStackSize(1).setUnlocalizedName("reactioncraft:ObsidianBucket").setTextureName("reactioncraft:ObsidianBucket").setContainerItem(Item.bucketEmpty);
	}

	public static void loadRCMOBS() 
	{
		IntegratedItems.bones = new ItemBasic(IntegratedConfigI.bonesIID).setUnlocalizedName("reactioncraft:bones").setTextureName("reactioncraft:bones").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.honeycomb = new ItemBasic(IntegratedConfigI.honeycombIID).setUnlocalizedName("reactioncraft:honeycomb").setTextureName("reactioncraft:honeycomb").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.pollencomb = new ItemBasic(IntegratedConfigI.pollencombIID).setUnlocalizedName("reactioncraft:pollencomb").setTextureName("reactioncraft:pollencomb").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.scoop = new ItemScoop(IntegratedConfigI.scoopIID).setUnlocalizedName("reactioncraft:bsscoop").setTextureName("reactioncraft:bsscoop").setMaxStackSize(1);
		IntegratedItems.hiveframe = new ItemHiveFrame(IntegratedConfigI.frameBloodstoneIID, 1440, 0.1F).setUnlocalizedName("reactioncraft:bloodstoneframe").setTextureName("reactioncraft:bloodstoneframe");
	}

	public static void loadNet() 
	{
		IntegratedItems.caught = new ItemCaughtEntity(IntegratedConfigI.caught2IID).setUnlocalizedName("reactioncraft:caught").setTextureName("reactioncraft:caught");
	}

	public static void loadRCORES()
	{
		IntegratedItems.goldrod = new ItemBasic(IntegratedConfigI.goldrodIID).setUnlocalizedName("reactioncraft:goldstick").setTextureName("reactioncraft:goldstick").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.obsidianingot = new ItemBasic(IntegratedConfigI.obsidianingotIID).setUnlocalizedName("reactioncraft:obsidianingot").setTextureName("reactioncraft:obsidianingot").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.ingotbloodstone = new ItemBasic(IntegratedConfigI.ingotbloodstoneIID).setUnlocalizedName("reactioncraft:bloodstoneingot").setTextureName("reactioncraft:bloodstoneingot").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.ingotsilver = new ItemBasic(IntegratedConfigI.ingotsilverIID).setUnlocalizedName("reactioncraft:silveringot").setTextureName("reactioncraft:silveringot").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.superheatedironingot = new ItemBasic(IntegratedConfigI.superheatedironingotIID).setUnlocalizedName("reactioncraft:shironingot").setTextureName("reactioncraft:shironingot").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.bloodstonedust = new ItemBasic(IntegratedConfigI.bloodstonedustIID).setUnlocalizedName("reactioncraft:bloodstonedust").setTextureName("reactioncraft:bloodstonedust").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.blackdiamond = new ItemBasic(IntegratedConfigI.blackdiamondIID).setUnlocalizedName("reactioncraft:blackdiamond").setTextureName("reactioncraft:blackdiamond").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.dragonstoneshard = new ItemBasic(IntegratedConfigI.dragonstoneshardIID).setUnlocalizedName("reactioncraft:dragonstoneshard").setTextureName("reactioncraft:dragonstoneshard").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.irondust = new ItemBasic(IntegratedConfigI.irondustIID).setUnlocalizedName("reactioncraft:irondust").setTextureName("reactioncraft:irondust").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.gemdragonstone = new ItemBasic(IntegratedConfigI.gemdragonstoneIID).setUnlocalizedName("reactioncraft:gemdragonstone").setTextureName("reactioncraft:gemdragonstone").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.goldDust = new ItemBasic(IntegratedConfigI.goldDustIID).setUnlocalizedName("reactioncraft:golddust").setTextureName("reactioncraft:golddust").setCreativeTab(RCB.ReactioncraftItems);
	}

	public static void loadRCPM()
	{
		IntegratedItems.AncientFlower = new ItemBasic(IntegratedConfigI.AncientFlowerIID).setUnlocalizedName("reactioncraft:AncientFlower").setTextureName("reactioncraft:AncientFlower").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.CornSeed = new ItemBasicSeed(IntegratedConfigI.CornSeedIID, IntegratedBlocks.cornStalk.blockID, Block.tilledField.blockID).setUnlocalizedName("reactioncraft:CornSeed").setTextureName("reactioncraft:CornSeed").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.AncientSeeds = new ItemBasicSeed(IntegratedConfigI.AncientSeedsIID, IntegratedBlocks.AncientPlant.blockID, Block.tilledField.blockID).setUnlocalizedName("reactioncraft:AncientSeeds").setTextureName("reactioncraft:AncientSeeds").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.AncientFruit = new ItemBasicFood(IntegratedConfigI.AncientFruitIID, 8, true).setUnlocalizedName("reactioncraft:AncientFruit").setTextureName("reactioncraft:AncientFruit").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.sugarcaneItem = (new Itemsugarcane(IntegratedConfigI.sugarcaneItemIID, IntegratedBlocks.sugarcaneBlock)).setUnlocalizedName("reactioncraft:sugarcaneItem").setTextureName("reactioncraft:sugarcaneItem").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.stalksItem = (new ItemStalks(IntegratedConfigI.stalksItemIID, IntegratedBlocks.cornBlock)).setUnlocalizedName("reactioncraft:Stalks").setTextureName("reactioncraft:Stalks").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.Wrappedcorn = new ItemBasic(IntegratedConfigI.WrappedcornIID).setUnlocalizedName("reactioncraft:Wrappedcorn").setTextureName("reactioncraft:Wrappedcorn").setCreativeTab(RCB.Reactioncraftfood);
	}

	public static void loadRCW() 
	{
		//Tool Parts
		IntegratedItems.BloodstoneBlade = (new ItemBasic(IntegratedConfigI.BloodstoneBladeIID)).setUnlocalizedName("reactioncraft:BloodstoneBlade").setTextureName("reactioncraft:BloodstoneBlade");
		IntegratedItems.GoldenSwordFragment = (new ItemBasic(IntegratedConfigI.GoldenSwordFragmentIID)).setUnlocalizedName("reactioncraft:GoldenSwordFragment").setTextureName("reactioncraft:GoldenSwordFragment");
		IntegratedItems.UnbindedSword = (new ItemBasic(IntegratedConfigI.UnbindedSwordIID)).setUnlocalizedName("reactioncraft:BloodstoneSword").setTextureName("reactioncraft:BloodstoneSword");
		//Obsidian
		IntegratedItems.ObbySword = (new ItemObsidanSword(IntegratedConfigI.ObbyPickID, IntegratedMaterials.EnumToolMaterialObby)).setUnlocalizedName("reactioncraft:ObbySword").setTextureName("reactioncraft:ObbySword");
		IntegratedItems.ObbyPick = (new ItemObsidanPick(IntegratedConfigI.ObbySwordID, IntegratedMaterials.EnumToolMaterialObby)).setUnlocalizedName("reactioncraft:ObbyPick").setTextureName("reactioncraft:ObbyPick");
		IntegratedItems.ObbyShovel = (new ItemObsidianShovel(IntegratedConfigI.ObbyShovelID, IntegratedMaterials.EnumToolMaterialObby)).setUnlocalizedName("reactioncraft:ObbyShovel").setTextureName("reactioncraft:ObbyShovel");
		IntegratedItems.ObbyAxe = (new ItemObsidianAxe(IntegratedConfigI.ObbyAxeID, IntegratedMaterials.EnumToolMaterialObby)).setUnlocalizedName("reactioncraft:ObbyAxe").setTextureName("reactioncraft:ObbyAxe");
		IntegratedItems.ObbyHoe = (new ItemObsidianHoe(IntegratedConfigI.ObbyHoeID, IntegratedMaterials.EnumToolMaterialObby)).setUnlocalizedName("reactioncraft:ObbyHoe").setTextureName("reactioncraft:ObbyHoe");
		//Bloodstone
		IntegratedItems.BloodstoneSword = (new ItemBloodstoneSword(IntegratedConfigI.BloodstonePickID, IntegratedMaterials.EnumToolMaterialBloodstone)).setUnlocalizedName("reactioncraft:BloodstoneSword").setTextureName("reactioncraft:BloodstoneSword");
		IntegratedItems.BloodstonePick = (new ItemBloodstonePick(IntegratedConfigI.BloodstoneSwordID, IntegratedMaterials.EnumToolMaterialBloodstone)).setUnlocalizedName("reactioncraft:BloodstonePick").setTextureName("reactioncraft:BloodstonePick");
		IntegratedItems.BloodstoneShovel = (new ItemBloodstoneShovel(IntegratedConfigI.BloodstoneShovelID, IntegratedMaterials.EnumToolMaterialBloodstone)).setUnlocalizedName("reactioncraft:BloodstoneShovel").setTextureName("reactioncraft:BloodstoneShovel");
		IntegratedItems.BloodstoneAxe = (new ItemBloodstoneAxe(IntegratedConfigI.BloodstoneAxeID, IntegratedMaterials.EnumToolMaterialBloodstone)).setUnlocalizedName("reactioncraft:BloodstoneAxe").setTextureName("reactioncraft:BloodstoneAxe");
		IntegratedItems.BloodstoneHoe = (new ItemBloodstoneHoe(IntegratedConfigI.BloodstoneHoeID, IntegratedMaterials.EnumToolMaterialBloodstone)).setUnlocalizedName("reactioncraft:BloodstoneHoe").setTextureName("reactioncraft:BloodstoneHoe");
		//Teir 3 Black Diamond
		IntegratedItems.BloodstoneDiamondPick = (new ItemBlackdiamondPick(IntegratedConfigI.BloodstoneDiamondPickIID, IntegratedMaterials.EnumToolMaterialBloodstone2)).setUnlocalizedName("reactioncraft:BloodstonePick2").setTextureName("reactioncraft:BloodstonePick2");
		//Bat
		IntegratedItems.Bat = (new ItemSword(IntegratedConfigI.batIID, IntegratedMaterials.EnumToolMaterialBat)).setUnlocalizedName("reactioncraft:bat").setTextureName("reactioncraft:bat").setCreativeTab(RCB.ReactioncraftItems);
	}

	public static void loadRCF() 
	{
		IntegratedItems.churn = (new ItemChurn(IntegratedConfigI.churnIID)).setUnlocalizedName("reactioncraft:churn").setTextureName("reactioncraft:churn").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.meatcleaver = (new ItemMeatCleaver(IntegratedConfigI.meatcleaverIID, IntegratedMaterials.EnumToolMaterialMeatcleaver)).setUnlocalizedName("reactioncraft:meatcleaver").setTextureName("reactioncraft:meatcleaver").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.Knfie = (new ItemKnife(IntegratedConfigI.knifeIID)).setUnlocalizedName("reactioncraft:knife").setTextureName("reactioncraft:knife").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.cookedCorn = new ItemFoodMod(IntegratedConfigI.cookedCornIID, 6, false).setUnlocalizedName("reactioncraft:cookedCorn").setTextureName("reactioncraft:cookedCorn").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.popcornseeds = new ItemBasic(IntegratedConfigI.popcornseedsIID).setUnlocalizedName("reactioncraft:CornSeed").setTextureName("reactioncraft:CornSeed").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.bagofpopcorn = new ItemBasic(IntegratedConfigI.bagofpopcornIID).setUnlocalizedName("reactioncraft:bagofpopcorn").setTextureName("reactioncraft:bagofpopcorn").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.poppedbagofpopcorn = new ItemFoodMod(IntegratedConfigI.poppedbagofpopcornIID, 10, true).setUnlocalizedName("reactioncraft:poppedbagofpopcorn").setTextureName("reactioncraft:poppedbagofpopcorn").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.rawcorn = new ItemFoodMod(IntegratedConfigI.rawcornIID, 2, false).setUnlocalizedName("reactioncraft:uncookedCorn").setTextureName("reactioncraft:uncookedCorn").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.UnwrappedCorn = new ItemFoodMod(IntegratedConfigI.UnwrappedCornIID, 2, false).setUnlocalizedName("reactioncraft:UnwrappedCorn").setTextureName("reactioncraft:UnwrappedCorn").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.RawNuggets = new ItemFoodMod(IntegratedConfigI.RawNuggetsIID, 2, true).setPotionEffect(Potion.hunger.id, 30, 0, 0.8F).setUnlocalizedName("reactioncraft:RawNuggets").setTextureName("reactioncraft:RawNuggets").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.ChickenNuggets = new ItemFoodMod(IntegratedConfigI.ChickenNuggetsIID, 5, true).setUnlocalizedName("reactioncraft:ChickenNuggets").setTextureName("reactioncraft:ChickenNuggets").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.SlicedBread = new ItemFoodMod(IntegratedConfigI.SlicedBreadIID, 4, false).setUnlocalizedName("reactioncraft:SlicedBread").setTextureName("reactioncraft:SlicedBread").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.HamSandwich = new ItemFoodMod(IntegratedConfigI.HamSandwichIID, 8, false).setUnlocalizedName("reactioncraft:HamSandwich").setTextureName("reactioncraft:HamSandwich").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.EdibleFlesh= new ItemBasicFood(IntegratedConfigI.EdibleFleshIID, 3, true).setUnlocalizedName("reactioncraft:edibleflesh").setTextureName("reactioncraft:edibleflesh").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.Hamburger = new ItemFoodMod(IntegratedConfigI.HamburgerIID, 8, true).setUnlocalizedName("reactioncraft:hamburger").setTextureName("reactioncraft:hamburger").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.Cheeseburger = new ItemFoodMod(IntegratedConfigI.CheeseburgerIID, 14, true).setUnlocalizedName("reactioncraft:cheeseburger").setTextureName("reactioncraft:cheeseburger").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.BaconRaw = new ItemFoodMod(IntegratedConfigI.BaconRawIID, 4, true).setPotionEffect(Potion.hunger.id, 30, 0, 0.8F).setUnlocalizedName("reactioncraft:rawbacon").setTextureName("reactioncraft:rawbacon").setUnlocalizedName("BaconRaw");
		IntegratedItems.Bacon = new ItemFoodMod(IntegratedConfigI.BaconIID, 6, true).setUnlocalizedName("reactioncraft:bacon").setTextureName("reactioncraft:bacon").setUnlocalizedName("Bacon");
		IntegratedItems.cheese = new ItemFoodMod(IntegratedConfigI.cheeseIID, 3, false).setUnlocalizedName("reactioncraft:cheese").setTextureName("reactioncraft:cheese").setUnlocalizedName("cheese");	
		//ButcheryCraft
		IntegratedItems.rawHuman    = new ItemFoodMod(IntegratedConfigI.rawhumanIID, 3, true).setUnlocalizedName("reactioncraft:rawhuman").setTextureName("reactioncraft:rawhuman").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.cookedHuman = new ItemFoodMod(IntegratedConfigI.cookedhumanIID, 9, true).setUnlocalizedName("reactioncraft:cookedhuman").setTextureName("reactioncraft:cookedhuman").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.rawLamb     = (new ItemFoodMod(IntegratedConfigI.rawlambIID, 3, 0.3F, true)).setUnlocalizedName("reactioncraft:rawlamb").setTextureName("reactioncraft:rawlamb");
		IntegratedItems.cookedLamb  = (new ItemFoodMod(IntegratedConfigI.cookedlambIID, 8, 0.8F, true)).setUnlocalizedName("reactioncraft:cookedlamb").setTextureName("reactioncraft:cookedlamb");
		IntegratedItems.rawHorse    = new ItemFoodMod(IntegratedConfigI.rawhorseIID, 3, true).setUnlocalizedName("reactioncraft:rawhorse").setTextureName("reactioncraft:rawhorse").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.cookedHorse = (new ItemFoodMod(IntegratedConfigI.cookedhorseIID, 9, 0.8F, true)).setUnlocalizedName("reactioncraft:cookedhorse").setTextureName("reactioncraft:cookedhorse");
		IntegratedItems.chickenHead = (new ItemFoodMod(IntegratedConfigI.chickenHeadIID, 6, 0.8F, true)).setUnlocalizedName("reactioncraft:chicken_head").setTextureName("reactioncraft:chicken_head");
		IntegratedItems.beefChunk = (new ItemFoodMod(IntegratedConfigI.beefChunkIID, 6, 0.3F, true)).setUnlocalizedName("reactioncraft:beef_chunk").setTextureName("reactioncraft:beef_chunk");
		IntegratedItems.porkChunk = (new ItemFoodMod(IntegratedConfigI.porkChunkIID, 6, 0.3F, true)).setUnlocalizedName("reactioncraft:pork_chunk").setTextureName("reactioncraft:pork_chunk");
		IntegratedItems.buns = new ItemFoodMod(IntegratedConfigI.bunsIID, 4, false).setUnlocalizedName("reactioncraft:buns").setTextureName("reactioncraft:buns").setCreativeTab(RCB.Reactioncraftfood);
	}
}