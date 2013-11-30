package Reactioncraft.integration;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import Reactioncraft.glass.common.*;
import Reactioncraft.integration.*;
import Reactioncraft.machines.common.*;
import Reactioncraft.mobs.common.*;
import Reactioncraft.ore.common.BlockEOMulti;
import Reactioncraft.ore.common.BlockNOMulti;
import Reactioncraft.ore.common.BlockSOMulti;
import Reactioncraft.plants.common.BlockAncientPlant;
import Reactioncraft.plants.common.BlockCorn;
import Reactioncraft.plants.common.BlockCornStalk;
import Reactioncraft.plants.common.BlockReed1;
import Reactioncraft.vanillaclasses.RCBlockEndPortalBlock;
import Reactioncraft.vanillaclasses.RCBlockEndPortalFrame;
import Reactioncraft.basefiles.common.*;
import Reactioncraft.basemod.RCB;
import Reactioncraft.bookcase.common.*;
import Reactioncraft.core.common.*;
import Reactioncraft.desert.common.*;

public class IntegratedBlockCode 
{
	public static void loadRCC() 
	{
		IntegratedBlocks.newSponge = new NewSponge(IntegratedConfigB.newSpongeId, IntegratedConfigB.spongeAbsorbtion).setHardness(0.6F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("reactioncraft:sponge").setTextureName("reactioncraft:sponge");
		IntegratedBlocks.clearBlock = new ClearBlock(IntegratedConfigB.clearBlockId).setTextureName("reactioncraft:clear");
		IntegratedBlocks.DarkSand = new BlockSandRc(IntegratedConfigB.DarkSandID).setHardness(0.5F).setResistance(5.0F).setStepSound(Block.soundSandFootstep).setUnlocalizedName("reactioncraft:sand").setTextureName("reactioncraft:sand");
		IntegratedBlocks.chainladder = new BlockChainLadder(IntegratedConfigB.chainladderID).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("reactioncraft:chains").setTextureName("reactioncraft:chains");
		IntegratedBlocks.snowblock = new BlockBasic(IntegratedConfigB.snowblockBlockID).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("reactioncraft:SnowBrick").setTextureName("reactioncraft:SnowBrick");
		IntegratedBlocks.enderportal = new RCBlockEndPortalFrame(IntegratedConfigB.enderportalID).setStepSound(Block.soundGlassFootstep).setLightValue(0.125F).setHardness(80.0F).setUnlocalizedName("endPortalFrame").setResistance(6000000.0F).setCreativeTab(RCB.Reactioncraft).setTextureName("reactioncraft:endframe");
		IntegratedBlocks.enderportalp = new RCBlockEndPortalBlock(IntegratedConfigB.enderportalpID, Material.portal).setHardness(-1.0F).setResistance(6000000.0F);
	}

	public static void loadRCBB() 
	{
		IntegratedBlocks.bookcasemeta = new BlockBookcaseMulti(IntegratedConfigB.bookcasemetaID, Material.wood).setHardness(1.5F);
		IntegratedBlocks.WoodenBookcasedoorBlock = new BlockBookcasedoor(IntegratedConfigB.WoodenBookcasedoorBlockID, Material.wood).setHardness(1.5F).setUnlocalizedName("WoodenBookcasedoorBlock");
		IntegratedBlocks.IronBookcasedoorBlock = new BlockBookcasedoor(IntegratedConfigB.IronBookcasedoorBlockID, Material.iron).setHardness(1.5F).setUnlocalizedName("IronBookcasedoorBlock");
		IntegratedBlocks.Bookcasechest = (new Blockbookshelfchest(IntegratedConfigB.BookcasechestID)).setHardness(1.5F).setResistance(1.0F).setUnlocalizedName("Bookcasechest");
		IntegratedBlocks.leverbookcase = (new BlockLeverBookcase(IntegratedConfigB.leverbookcaseID)).setHardness(1.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("leverbookcase").setCreativeTab(RCB.Reactioncraft);
	}

	public static void loadRCBDM() 
	{
		IntegratedBlocks.BloodstoneBrick = new BlockBasic(IntegratedConfigB.BloodstoneBrickID).setHardness(120.0F).setResistance(2000.0F).setLightValue(0.10F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("reactioncraft:BloodStoneBrick").setTextureName("reactioncraft:BloodStoneBrick").setCreativeTab(RCB.Reactioncraft);
		IntegratedBlocks.Cherrywood = new BlockCherryTreeLog(IntegratedConfigB.CherrywoodID).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(0.5F).setUnlocalizedName("reactioncraft:woodside");
		IntegratedBlocks.CherryTreeLeaves = new BlockCherryTreeLeaves(IntegratedConfigB.CherryTreeLeavesID).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setResistance(0.5F).setUnlocalizedName("reactioncraft:CherryTreeLeaves").setTextureName("reactioncraft:CherryTreeLeaves");
		IntegratedBlocks.CherryTreeSapling = new BlockCherryTreeSapling(IntegratedConfigB.CherryTreeSaplingID, 0).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setResistance(0.5F).setUnlocalizedName("reactioncraft:CherryTreeSapling").setTextureName("reactioncraft:CherryTreeSapling");
		IntegratedBlocks.HireoMulti = new BlockHireoMulti(IntegratedConfigB.HireoBlocksID, Material.rock).setHardness(3.0F).setUnlocalizedName("HireoMulti");
		IntegratedBlocks.ColumnMulti = new BlockColumnMulti(IntegratedConfigB.ColumnBlockID, Material.rock).setUnlocalizedName("ColumnMulti");
		IntegratedBlocks.ColumnMulti2 = new BlockColumnMulti2(IntegratedConfigB.ColumnBlock2ID, Material.rock).setUnlocalizedName("ColumnMulti2");
		IntegratedBlocks.CherryPlanks = new BlockPlank(IntegratedConfigB.CherryPlanksID).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("reactioncraft:cherryplanks").setTextureName("reactioncraft:cherryplanks");
		IntegratedBlocks.DesertBlockMulti = new BlockDesertMulti(IntegratedConfigB.DesertBlockMultiID, Material.rock).setHardness(2.5F).setResistance(15.0F).setUnlocalizedName("DesertBlockMulti");
		IntegratedBlocks.Cactus1 = (new DesertFlower(IntegratedConfigB.Cactus1ID)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("reactioncraft:Cactus1").setTextureName("reactioncraft:Cactus1");
		IntegratedBlocks.Cactus2 = (new DesertFlower(IntegratedConfigB.Cactus2ID)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("reactioncraft:Cactus2").setTextureName("reactioncraft:Cactus2");	
	}

	public static void loadRCG() 
	{	
		IntegratedBlocks.GlassMulti = new BlockGlassMulti(IntegratedConfigB.glassID, Material.glass).setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		IntegratedBlocks.GlowingGlassMulti = new BlockGlowingGlassMulti(IntegratedConfigB.glass2ID, Material.glass).setLightValue(1.0F).setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
	}

	public static void loadRCMM() 
	{
		IntegratedBlocks.FreezerIdle      = (new BlockFreezer(IntegratedConfigB.FreezerActiveID, false)).setHardness(3.5F).setUnlocalizedName("FreezerIdle").setCreativeTab(RCB.Reactioncraft);
		IntegratedBlocks.FreezerActive    = (new BlockFreezer(IntegratedConfigB.FreezerIdleID, true)).setHardness(3.5F).setLightValue(0.875F).setUnlocalizedName("FreezerActive");
		IntegratedBlocks.BrickOvenIdle    = (new BlockBrickOven(IntegratedConfigB.BrickOvenActiveID, false)).setHardness(3.5F).setUnlocalizedName("BrickOvenIdle").setCreativeTab(RCB.Reactioncraft);
		IntegratedBlocks.BrickOvenActive  = (new BlockBrickOven(IntegratedConfigB.BrickOvenIdleID, true)).setHardness(3.5F).setLightValue(0.875F).setUnlocalizedName("BrickOvenActive");
		IntegratedBlocks.ClayalizerIdle   = (new BlockClayalizer(IntegratedConfigB.ClayalizerIdleID, false)).setHardness(3.5F).setUnlocalizedName("ClayalizerIdle").setCreativeTab(RCB.Reactioncraft);
		IntegratedBlocks.ClayalizerActive = (new BlockClayalizer(IntegratedConfigB.ClayalizerActiveID, true)).setHardness(3.5F).setLightValue(0.875F).setUnlocalizedName("ClayalizerActive");
	}

	public static void loadRCMOBS() 
	{
		IntegratedBlocks.rchive = new BlockHive(IntegratedConfigB.hiveID).setHardness(1.0F).setResistance(15.0F).setStepSound(Block.soundWoodFootstep).setLightValue(0.001F).setUnlocalizedName("hive");
	}

	public static void loadRCORES() 
	{
		IntegratedBlocks.surfaceOres = new BlockSOMulti(IntegratedConfigB.surfaceOresID, Material.rock).setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("surfaceOres");
		IntegratedBlocks.netherOres = new BlockNOMulti(IntegratedConfigB.netherOresID, Material.rock).setHardness(80.0F).setResistance(2000.0F).setUnlocalizedName("netherOres");
		IntegratedBlocks.endOres = new BlockEOMulti(IntegratedConfigB.endOresID, Material.rock).setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("endOres");
	}

	public static void loadRCPM() 
	{
		IntegratedBlocks.AncientPlant = new BlockAncientPlant(IntegratedConfigB.AncientPlantID).setHardness(0.0F).setResistance(1.0F);
		IntegratedBlocks.sugarcaneBlock = (new BlockReed1(IntegratedConfigB.sugarcaneBlockID, 73)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep);
		IntegratedBlocks.cornBlock = new BlockCorn(IntegratedConfigB.cornBlockID, 40).setHardness(0.0F).setStepSound(Block.soundGrassFootstep);
		IntegratedBlocks.cornStalk = new BlockCornStalk(IntegratedConfigB.cornStalkID).setHardness(0.0F).setStepSound(Block.soundGrassFootstep);
	}
}
