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
		IntegratedItems.ChainLoop = (new ItemBasic(IntegratedConfigI.ChainLoopIID)).setUnlocalizedName("rcc:ChainLoop").setTextureName("rcc:ChainLoop");
		IntegratedItems.Hammer = (new ItemHammer(IntegratedConfigI.HammerIID)).setMaxStackSize(1).setUnlocalizedName("rcc:Hammer").setTextureName("rcc:Hammer");
		IntegratedItems.Blackdiamondbore = new IBlackDiamondBH(IntegratedConfigI.BlackdiamondboreIID).setUnlocalizedName("rcc:Blackdiamondbore").setTextureName("rcc:Blackdiamondbore").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.Bloodstonebore = new IBloodstoneBH(IntegratedConfigI.BloodstoneboreIID).setUnlocalizedName("rcc:Bloodstonebore").setTextureName("rcc:Bloodstonebore").setCreativeTab(RCB.ReactioncraftItems);		
		IntegratedItems.SandStonePaste = (new ItemBasic(IntegratedConfigI.SandStonePasteIID)).setUnlocalizedName("rcbdm:SandStonePaste").setTextureName("rcbdm:SandStonePaste");
		IntegratedItems.SamonRaw = (new ItemBasicFood(IntegratedConfigI.SamonRawIID, 2, 0.3F, false)).setUnlocalizedName("rcc:samonr").setTextureName("rcc:samonr");
		IntegratedItems.Samon = (new ItemBasicFood(IntegratedConfigI.SamonIID, 5, 0.6F, false)).setUnlocalizedName("rcc:samonc").setTextureName("rcc:samonc");
		IntegratedItems.YellowTailRaw = (new ItemBasicFood(IntegratedConfigI.YellowTailRawIID, 2, 0.3F, false)).setUnlocalizedName("rcc:yellowtailr").setTextureName("rcc:yellowtailr");
		IntegratedItems.YellowTailCooked = (new ItemBasicFood(IntegratedConfigI.YellowTailCookedIID, 5, 0.6F, false)).setUnlocalizedName("rcc:yellowtailc").setTextureName("rcc:yellowtailc");
		IntegratedItems.Mapinabottle = new ItemBasic(IntegratedConfigI.MapinabottleIID).setUnlocalizedName("rcc:mapinbottle").setTextureName("rcc:mapinbottle").setContainerItem(Item.glassBottle).setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.Shipinabottle = new ItemBasic(IntegratedConfigI.ShipinabottleIID).setUnlocalizedName("rcc:shipinbottle").setTextureName("rcc:shipinbottle").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.rcendereye = (new RCItemEnderEye(IntegratedConfigI.rcendereyeIID)).setUnlocalizedName("eyeOfEnder").setTextureName("rcc:rcender_eye").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.meltedventinite = new ItemBasic(IntegratedConfigI.meltedventiniteIID).setUnlocalizedName("rcc:meltedventinite").setTextureName("rcc:meltedventinite").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.meltedwizimite = new ItemBasic(IntegratedConfigI.meltedwizimiteIID).setUnlocalizedName("rcc:meltedwizimite").setTextureName("rcc:meltedwizimite").setCreativeTab(RCB.ReactioncraftItems);
	}

	public static void loadRCBB()
	{
		IntegratedItems.WoodenBookcasedoor = (new ItemBookcaseDoor(IntegratedConfigI.WoodenBookcasedoorIID, Material.wood)).setUnlocalizedName("rcbb:WoodenBookcasedoor").setTextureName("rcbb:WoodenBookcasedoor");
		IntegratedItems.IronBookcasedoor = (new ItemBookcaseDoor(IntegratedConfigI.IronBookcasedoorIID, Material.iron)).setUnlocalizedName("rcbb:IronBookcasedoor").setTextureName("rcbb:IronBookcasedoor");
	}

	public static void loadRCBDM() 
	{
		IntegratedItems.FlintChisel =      (new ItemChisel(IntegratedConfigI.FlintChiselIID).setUnlocalizedName("rcbdm:flintchisel").setTextureName("rcbdm:flintchisel"));
		IntegratedItems.GoldChisel =       (new ItemChisel2(IntegratedConfigI.GoldChiselIID)).setUnlocalizedName("rcbdm:goldchisel").setTextureName("rcbdm:goldchisel");
		IntegratedItems.CopperChisel =     (new ItemChisel3(IntegratedConfigI.CopperChiselIID).setUnlocalizedName("rcbdm:copperchisel").setTextureName("rcbdm:copperchisel"));
		IntegratedItems.DiamondChisel =    (new ItemChisel4(IntegratedConfigI.DiamondChiselIID)).setUnlocalizedName("rcbdm:diamondchisel").setTextureName("rcbdm:diamondchisel");
		IntegratedItems.BloodstoneChisel = (new ItemChisel5(IntegratedConfigI.BloodstoneChiselIID)).setUnlocalizedName("rcbdm:bloodstonechisel").setTextureName("rcbdm:bloodstonechisel");
		IntegratedItems.UncutLBGem = (new ItemBasic(IntegratedConfigI.UncutLBGemIID)).setUnlocalizedName("rcbdm:UncutLBGem").setTextureName("rcbdm:UncutLBGem");
		IntegratedItems.CutLBGem = (new ItemBasic(IntegratedConfigI.CutLBGemIID)).setUnlocalizedName("rcbdm:CutLBGem").setTextureName("rcbdm:CutLBGem");
		IntegratedItems.UncutDBGem = (new ItemBasic(IntegratedConfigI.UncutDBGemIID)).setUnlocalizedName("rcbdm:UncutDBGem").setTextureName("rcbdm:UncutDBGem");
		IntegratedItems.CutDBGem = (new ItemBasic(IntegratedConfigI.CutDBGemIID)).setUnlocalizedName("rcbdm:CutDBGem").setTextureName("rcbdm:CutDBGem");
		IntegratedItems.scroll = (new ItemBasic(IntegratedConfigI.scrollIID)).setUnlocalizedName("rcbdm:scroll").setTextureName("rcbdm:scroll");
	}

	public static void loadRCCM() 
	{
		//Coins
		IntegratedItems.Metadatacoin = (new CoinMetaItem(IntegratedConfigI.MetadatacoinIID).setUnlocalizedName("coin"));

		//Coin Items (Fix Textures)
		IntegratedItems.Bag = (new ItemBasic(IntegratedConfigI.BagIID).setUnlocalizedName("rccm:bag").setTextureName("rccm:bag"));
		IntegratedItems.Sack = (new ItemBasic(IntegratedConfigI.SackIID).setUnlocalizedName("rccm:sack").setTextureName("rccm:sack"));
		IntegratedItems.Straw = (new ItemBasic(IntegratedConfigI.StrawIID).setUnlocalizedName("rccm:straw").setTextureName("rccm:straw"));
		IntegratedItems.CoinMould = new ItemCoinMould(IntegratedConfigI.CoinMouldIID).setMaxStackSize(1).setUnlocalizedName("rccm:coinmould").setTextureName("rccm:coinmould");
		IntegratedItems.moltengold   = new ItemBasic(IntegratedConfigI.moltengoldIID).setMaxStackSize(1).setUnlocalizedName("rccm:moltengold")  .setTextureName("rccm:moltengold")    .setContainerItem(Item.bucketEmpty);
		IntegratedItems.moltensilver = new ItemBasic(IntegratedConfigI.moltensilverIID).setMaxStackSize(1).setUnlocalizedName("rccm:moltensilver").setTextureName("rccm:moltensilver").setContainerItem(Item.bucketEmpty);
		IntegratedItems.moltenbronze = new ItemBasic(IntegratedConfigI.moltenbronzeIID).setMaxStackSize(1).setUnlocalizedName("rccm:moltenbronze").setTextureName("rccm:moltenbronze").setContainerItem(Item.bucketEmpty);
		IntegratedItems.moltencopper = new ItemBasic(IntegratedConfigI.moltencopperIID).setMaxStackSize(1).setUnlocalizedName("rccm:moltencopper").setTextureName("rccm:moltencopper").setContainerItem(Item.bucketEmpty);
		IntegratedItems.copperbucket = new ItemBasic(IntegratedConfigI.copperbucketIID).setMaxStackSize(1).setUnlocalizedName("rccm:copperbucket").setTextureName("rccm:copperbucket").setContainerItem(Item.bucketEmpty);
		IntegratedItems.bronzebucket = new ItemBasic(IntegratedConfigI.bronzebucketIID).setMaxStackSize(1).setUnlocalizedName("rccm:bronzebucket").setTextureName("rccm:bronzebucket").setContainerItem(Item.bucketEmpty);
		IntegratedItems.silverbucket = new ItemBasic(IntegratedConfigI.silverbucketIID).setMaxStackSize(1).setUnlocalizedName("rccm:silverbucket").setTextureName("rccm:silverbucket").setContainerItem(Item.bucketEmpty);
		IntegratedItems.goldbucket   = new ItemBasic(IntegratedConfigI.goldbucketIID).setMaxStackSize(1).setUnlocalizedName("rccm:goldbucket")    .setTextureName("rccm:goldbucket")  .setContainerItem(Item.bucketEmpty);
		IntegratedItems.ingotRefinedgold = new ItemBasic(IntegratedConfigI.ingotRefinedgoldIID).setUnlocalizedName("rccm:ingotrgold") .setTextureName("rccm:ingotrgold");
		IntegratedItems.ingotSilver = new ItemBasic(IntegratedConfigI.ingotSilverIID).setUnlocalizedName("rccm:ingotsilver").setTextureName("rccm:ingotsilver");
		IntegratedItems.ingotBronze = new ItemBasic(IntegratedConfigI.ingotBronzeIID).setUnlocalizedName("rccm:ingotbronze").setTextureName("rccm:ingotbronze");
		IntegratedItems.ingotCopper = new ItemBasic(IntegratedConfigI.ingotCopperIID).setUnlocalizedName("rccm:ingotcopper").setTextureName("rccm:ingotcopper");
		IntegratedItems.ingotmould  = new ItemIngotMould(IntegratedConfigI.ingotmouldIID).setUnlocalizedName("rccm:ingotmould").setTextureName("rccm:ingotmould");
		IntegratedItems.ruby        = new ItemBasic(IntegratedConfigI.rubyIID).setUnlocalizedName("rccm:ruby").setTextureName("rccm:ruby");
		
		//Armor Items
		IntegratedItems.Crown =       (new CurrencyArmor(IntegratedConfigI.CrownIID,       IntegratedMaterials.EmeraldArmor, 6, 0)).setUnlocalizedName("rccm:crown").setTextureName("rccm:crown").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.KinglyChest = (new CurrencyArmor(IntegratedConfigI.KinglyChestIID, IntegratedMaterials.EmeraldArmor, 6, 1)).setUnlocalizedName("rccm:kingchest").setTextureName("rccm:kingchest").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.KinglyLegs  = (new CurrencyArmor(IntegratedConfigI.KinglyLegsIID,  IntegratedMaterials.EmeraldArmor, 6, 2)).setUnlocalizedName("rccm:kingpants").setTextureName("rccm:kingpants").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.KinglyBoots = (new CurrencyArmor(IntegratedConfigI.KinglyBootsIID, IntegratedMaterials.EmeraldArmor, 6, 3) .setUnlocalizedName("rccm:kingboots").setTextureName("rccm:kingboots").setCreativeTab(RCB.ReactioncraftItems));
		//Crowns
		IntegratedItems.rubycrown =      (new CurrencyArmor2(IntegratedConfigI.rubycrownIID,  IntegratedMaterials.EmeraldArmor, 6, 0)).setUnlocalizedName("rccm:rubycrown").setTextureName("rccm:rubycrown").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.diamondcrown =   (new CurrencyArmor4(IntegratedConfigI.diamondcrownIID,  IntegratedMaterials.EmeraldArmor, 6, 0)).setUnlocalizedName("rccm:diamondcrown").setTextureName("rccm:diamondcrown").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.emeraldcrown =   (new CurrencyArmor5(IntegratedConfigI.emeraldcrownIID,  IntegratedMaterials.EmeraldArmor, 6, 0)).setUnlocalizedName("rccm:emeraldcrown").setTextureName("rccm:emeraldcrown").setCreativeTab(RCB.ReactioncraftItems);
		//Bloodstone
		IntegratedItems.bloodstonehelm  =   (new CurrencyArmor3(IntegratedConfigI.bloodstonehelmIID,   IntegratedMaterials.BloodstoneArmor, 6, 0)).setUnlocalizedName("rccm:bloodstonehelm").setTextureName("rccm:bloodstonehelm").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.bloodstonechest =   (new CurrencyArmor3(IntegratedConfigI.bloodstonechestIID,  IntegratedMaterials.BloodstoneArmor, 6, 1)).setUnlocalizedName("rccm:bloodstonechest").setTextureName("rccm:bloodstonechest").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.bloodstonelegs  =   (new CurrencyArmor3(IntegratedConfigI.bloodstonelegsIID,   IntegratedMaterials.BloodstoneArmor, 6, 2)).setUnlocalizedName("rccm:bloodstonelegs").setTextureName("rccm:bloodstonelegs").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.bloodstoneboots =   (new CurrencyArmor3(IntegratedConfigI.bloodstonebootsIID,  IntegratedMaterials.BloodstoneArmor, 6, 3)).setUnlocalizedName("rccm:bloodstoneboots").setTextureName("rccm:bloodstoneboots").setCreativeTab(RCB.ReactioncraftItems);
	}

	public static void loadRCG() 
	{
		IntegratedItems.moltenglass = new ItemBasic(IntegratedConfigI.moltenglassIID).setUnlocalizedName("rcg:MG").setTextureName("rcg:MG").setCreativeTab(RCB.ReactioncraftItems);
	}

	public static void loadRCMM() 
	{
		IntegratedItems.IceBucket = (new ItemBasic(IntegratedConfigI.IceBucketIID)).setMaxStackSize(1).setUnlocalizedName("rcmm:IceBucket").setTextureName("rcmm:IceBucket").setContainerItem(Item.bucketEmpty);
		IntegratedItems.ObsidianBucket = (new ItemBasic(IntegratedConfigI.ObsidianBucketIID)).setMaxStackSize(1).setUnlocalizedName("rcmm:ObsidianBucket").setTextureName("rcmm:ObsidianBucket").setContainerItem(Item.bucketEmpty);
	}

	public static void loadRCMOBS() 
	{
		IntegratedItems.bones = new ItemBasic(IntegratedConfigI.bonesIID).setUnlocalizedName("rcmobs:bones").setTextureName("rcmobs:bones").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.honeycomb = new ItemBasic(IntegratedConfigI.honeycombIID).setUnlocalizedName("rcmobs:honeycomb").setTextureName("rcmobs:honeycomb").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.pollencomb = new ItemBasic(IntegratedConfigI.pollencombIID).setUnlocalizedName("rcmobs:pollencomb").setTextureName("rcmobs:pollencomb").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.scoop = new ItemScoop(IntegratedConfigI.scoopIID).setUnlocalizedName("rcmobs:bsscoop").setTextureName("rcmobs:bsscoop").setMaxStackSize(1);
		IntegratedItems.hiveframe = new ItemHiveFrame(IntegratedConfigI.frameBloodstoneIID, 1440, 0.1F).setUnlocalizedName("rcmobs:bloodstoneframe").setTextureName("rcmobs:bloodstoneframe");
	}

	public static void loadNet() 
	{
		IntegratedItems.creativeNet = new ItemCreativeNet(IntegratedConfigI.creativeNetIID).setUnlocalizedName("RCN:fullnet").setTextureName("RCN:fullnet").setCreativeTab(RCB.ReactioncraftItems);
	}

	public static void loadRCORES()
	{
		IntegratedItems.goldrod = new ItemBasic(IntegratedConfigI.goldrodIID).setUnlocalizedName("rcores:goldstick").setTextureName("rcores:goldstick").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.obsidianingot = new ItemBasic(IntegratedConfigI.obsidianingotIID).setUnlocalizedName("rcores:obsidianingot").setTextureName("rcores:obsidianingot").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.ingotbloodstone = new ItemBasic(IntegratedConfigI.ingotbloodstoneIID).setUnlocalizedName("rcores:bloodstoneingot").setTextureName("rcores:bloodstoneingot").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.ingotsilver = new ItemBasic(IntegratedConfigI.ingotsilverIID).setUnlocalizedName("rcores:silveringot").setTextureName("rcores:silveringot").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.superheatedironingot = new ItemBasic(IntegratedConfigI.superheatedironingotIID).setUnlocalizedName("rcores:shironingot").setTextureName("rcores:shironingot").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.bloodstonedust = new ItemBasic(IntegratedConfigI.bloodstonedustIID).setUnlocalizedName("rcores:bloodstonedust").setTextureName("rcores:bloodstonedust").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.blackdiamond = new ItemBasic(IntegratedConfigI.blackdiamondIID).setUnlocalizedName("rcores:blackdiamond").setTextureName("rcores:blackdiamond").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.dragonstoneshard = new ItemBasic(IntegratedConfigI.dragonstoneshardIID).setUnlocalizedName("rcores:dragonstoneshard").setTextureName("rcores:dragonstoneshard").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.irondust = new ItemBasic(IntegratedConfigI.irondustIID).setUnlocalizedName("rcores:irondust").setTextureName("rcores:irondust").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.gemdragonstone = new ItemBasic(IntegratedConfigI.gemdragonstoneIID).setUnlocalizedName("rcores:gemdragonstone").setTextureName("rcores:gemdragonstone").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.goldDust = new ItemBasic(IntegratedConfigI.goldDustIID).setUnlocalizedName("rcores:golddust").setTextureName("rcores:golddust").setCreativeTab(RCB.ReactioncraftItems);
	}

	public static void loadRCPM()
	{
		IntegratedItems.AncientFlower = new ItemBasic(IntegratedConfigI.AncientFlowerIID).setUnlocalizedName("rcpm:AncientFlower").setTextureName("rcpm:AncientFlower").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.CornSeed = new ItemBasicSeed(IntegratedConfigI.CornSeedIID, IntegratedBlocks.cornStalk.blockID, Block.tilledField.blockID).setUnlocalizedName("rcpm:CornSeed").setTextureName("rcpm:CornSeed").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.AncientSeeds = new ItemBasicSeed(IntegratedConfigI.AncientSeedsIID, IntegratedBlocks.AncientPlant.blockID, Block.tilledField.blockID).setUnlocalizedName("rcpm:AncientSeeds").setTextureName("rcpm:AncientSeeds").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.AncientFruit = new ItemBasicFood(IntegratedConfigI.AncientFruitIID, 8, true).setUnlocalizedName("rcpm:AncientFruit").setTextureName("rcpm:AncientFruit").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.sugarcaneItem = (new Itemsugarcane(IntegratedConfigI.sugarcaneItemIID, IntegratedBlocks.sugarcaneBlock)).setUnlocalizedName("rcpm:sugarcaneItem").setTextureName("rcpm:sugarcaneItem").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.stalksItem = (new ItemStalks(IntegratedConfigI.stalksItemIID, IntegratedBlocks.cornBlock)).setUnlocalizedName("rcpm:Stalks").setTextureName("rcpm:Stalks").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.Wrappedcorn = new ItemBasic(IntegratedConfigI.WrappedcornIID).setUnlocalizedName("rcpm:Wrappedcorn").setTextureName("rcpm:Wrappedcorn").setCreativeTab(RCB.Reactioncraftfood);
	}

	public static void loadRCW() 
	{
		//Tool Parts
		IntegratedItems.BloodstoneBlade = (new ItemBasic(IntegratedConfigI.BloodstoneBladeIID)).setUnlocalizedName("rcw:BloodstoneBlade").setTextureName("rcw:BloodstoneBlade");
		IntegratedItems.GoldenSwordFragment = (new ItemBasic(IntegratedConfigI.GoldenSwordFragmentIID)).setUnlocalizedName("rcw:GoldenSwordFragment").setTextureName("rcw:GoldenSwordFragment");
		IntegratedItems.UnbindedSword = (new ItemBasic(IntegratedConfigI.UnbindedSwordIID)).setUnlocalizedName("rcw:BloodstoneSword").setTextureName("rcw:BloodstoneSword");
		//Obsidian
		IntegratedItems.ObbySword = (new ItemObsidanSword(IntegratedConfigI.ObbyPickID, IntegratedMaterials.EnumToolMaterialObby)).setUnlocalizedName("rcw:ObbySword").setTextureName("rcw:ObbySword");
		IntegratedItems.ObbyPick = (new ItemObsidanPick(IntegratedConfigI.ObbySwordID, IntegratedMaterials.EnumToolMaterialObby)).setUnlocalizedName("rcw:ObbyPick").setTextureName("rcw:ObbyPick");
		IntegratedItems.ObbyShovel = (new ItemObsidianShovel(IntegratedConfigI.ObbyShovelID, IntegratedMaterials.EnumToolMaterialObby)).setUnlocalizedName("rcw:ObbyShovel").setTextureName("rcw:ObbyShovel");
		IntegratedItems.ObbyAxe = (new ItemObsidianAxe(IntegratedConfigI.ObbyAxeID, IntegratedMaterials.EnumToolMaterialObby)).setUnlocalizedName("rcw:ObbyAxe").setTextureName("rcw:ObbyAxe");
		IntegratedItems.ObbyHoe = (new ItemObsidianHoe(IntegratedConfigI.ObbyHoeID, IntegratedMaterials.EnumToolMaterialObby)).setUnlocalizedName("rcw:ObbyHoe").setTextureName("rcw:ObbyHoe");
		//Bloodstone
		IntegratedItems.BloodstoneSword = (new ItemBloodstoneSword(IntegratedConfigI.BloodstonePickID, IntegratedMaterials.EnumToolMaterialBloodstone)).setUnlocalizedName("rcw:BloodstoneSword").setTextureName("rcw:BloodstoneSword");
		IntegratedItems.BloodstonePick = (new ItemBloodstonePick(IntegratedConfigI.BloodstoneSwordID, IntegratedMaterials.EnumToolMaterialBloodstone)).setUnlocalizedName("rcw:BloodstonePick").setTextureName("rcw:BloodstonePick");
		IntegratedItems.BloodstoneShovel = (new ItemBloodstoneShovel(IntegratedConfigI.BloodstoneShovelID, IntegratedMaterials.EnumToolMaterialBloodstone)).setUnlocalizedName("rcw:BloodstoneShovel").setTextureName("rcw:BloodstoneShovel");
		IntegratedItems.BloodstoneAxe = (new ItemBloodstoneAxe(IntegratedConfigI.BloodstoneAxeID, IntegratedMaterials.EnumToolMaterialBloodstone)).setUnlocalizedName("rcw:BloodstoneAxe").setTextureName("rcw:BloodstoneAxe");
		IntegratedItems.BloodstoneHoe = (new ItemBloodstoneHoe(IntegratedConfigI.BloodstoneHoeID, IntegratedMaterials.EnumToolMaterialBloodstone)).setUnlocalizedName("rcw:BloodstoneHoe").setTextureName("rcw:BloodstoneHoe");
		//Teir 3 Black Diamond
		IntegratedItems.BloodstoneDiamondPick = (new ItemBlackdiamondPick(IntegratedConfigI.BloodstoneDiamondPickIID, IntegratedMaterials.EnumToolMaterialBloodstone2)).setUnlocalizedName("rcw:BloodstonePick2").setTextureName("rcw:BloodstonePick2");
	}

	public static void loadRCF() 
	{
		IntegratedItems.Knfie = (new ItemKnife(IntegratedConfigI.knifeIID)).setUnlocalizedName("rcf:knife").setTextureName("rcf:knife").setCreativeTab(RCB.ReactioncraftItems);
		IntegratedItems.cookedCorn = new ItemFoodMod(IntegratedConfigI.cookedCornIID, 6, false).setUnlocalizedName("rcf:cookedCorn").setTextureName("rcf:cookedCorn").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.popcornseeds = new ItemBasic(IntegratedConfigI.popcornseedsIID).setUnlocalizedName("rcpm:CornSeed").setTextureName("rcpm:CornSeed").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.bagofpopcorn = new ItemBasic(IntegratedConfigI.bagofpopcornIID).setUnlocalizedName("rcf:bagofpopcorn").setTextureName("rcf:bagofpopcorn").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.poppedbagofpopcorn = new ItemFoodMod(IntegratedConfigI.poppedbagofpopcornIID, 10, true).setUnlocalizedName("rcf:poppedbagofpopcorn").setTextureName("rcf:poppedbagofpopcorn").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.rawcorn = new ItemFoodMod(IntegratedConfigI.rawcornIID, 2, false).setUnlocalizedName("rcf:uncookedCorn").setTextureName("rcf:uncookedCorn").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.UnwrappedCorn = new ItemFoodMod(IntegratedConfigI.UnwrappedCornIID, 2, false).setUnlocalizedName("rcf:UnwrappedCorn").setTextureName("rcf:UnwrappedCorn").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.RawNuggets = new ItemFoodMod(IntegratedConfigI.RawNuggetsIID, 2, true).setPotionEffect(Potion.hunger.id, 30, 0, 0.8F).setUnlocalizedName("rcf:RawNuggets").setTextureName("rcf:RawNuggets").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.ChickenNuggets = new ItemFoodMod(IntegratedConfigI.ChickenNuggetsIID, 5, true).setUnlocalizedName("rcf:ChickenNuggets").setTextureName("rcf:ChickenNuggets").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.SlicedBread = new ItemFoodMod(IntegratedConfigI.SlicedBreadIID, 4, false).setUnlocalizedName("rcf:SlicedBread").setTextureName("rcf:SlicedBread").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.HamSandwich = new ItemFoodMod(IntegratedConfigI.HamSandwichIID, 8, false).setUnlocalizedName("rcf:HamSandwich").setTextureName("rcf:HamSandwich").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.EdibleFlesh= new ItemBasicFood(IntegratedConfigI.EdibleFleshIID, 3, true).setUnlocalizedName("rcf:edibleflesh").setTextureName("rcf:edibleflesh").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.Hamburger = new ItemFoodMod(IntegratedConfigI.HamburgerIID, 8, true).setUnlocalizedName("rcf:hamburger").setTextureName("rcf:hamburger").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.Cheeseburger = new ItemFoodMod(IntegratedConfigI.CheeseburgerIID, 14, true).setUnlocalizedName("rcf:cheeseburger").setTextureName("rcf:cheeseburger").setCreativeTab(RCB.Reactioncraftfood);
		IntegratedItems.BaconRaw = new ItemFoodMod(IntegratedConfigI.BaconRawIID, 4, true).setPotionEffect(Potion.hunger.id, 30, 0, 0.8F).setUnlocalizedName("rcf:rawbacon").setTextureName("rcf:rawbacon").setUnlocalizedName("BaconRaw");
		IntegratedItems.Bacon = new ItemFoodMod(IntegratedConfigI.BaconIID, 6, true).setUnlocalizedName("rcf:bacon").setTextureName("rcf:bacon").setUnlocalizedName("Bacon");
		IntegratedItems.cheese = new ItemFoodMod(IntegratedConfigI.cheeseIID, 3, false).setUnlocalizedName("rcf:cheese").setTextureName("rcf:cheese").setUnlocalizedName("cheese");	
	}
}
