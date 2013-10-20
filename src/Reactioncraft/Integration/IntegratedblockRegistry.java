package Reactioncraft.integration;

import Reactioncraft.basefiles.common.ItemMulti;
import Reactioncraft.bookcase.common.ItemBookcaseMulti;
import cpw.mods.fml.common.registry.GameRegistry;

public class IntegratedblockRegistry 
{
	public static void loadRCC() 
	{
		GameRegistry.registerBlock(IntegratedBlocks.snowblock, "snowblock");
		GameRegistry.registerBlock(IntegratedBlocks.chainladder, "chainladder");
		GameRegistry.registerBlock(IntegratedBlocks.newSponge, "newSponge");
		GameRegistry.registerBlock(IntegratedBlocks.clearBlock, "clearBlock");
		GameRegistry.registerBlock(IntegratedBlocks.DarkSand, "DarkSand");
	}

	public static void loadRCBB() 
	{
		GameRegistry.registerBlock(IntegratedBlocks.bookcasemeta, ItemBookcaseMulti.class, "bookcasemeta");
		GameRegistry.registerBlock(IntegratedBlocks.Bookcasechest, "Bookcasechest");
		GameRegistry.registerBlock(IntegratedBlocks.WoodenBookcasedoorBlock, "WoodenBookcasedoorBlock");
		GameRegistry.registerBlock(IntegratedBlocks.IronBookcasedoorBlock, "IronBookcasedoorBlock");
		GameRegistry.registerBlock(IntegratedBlocks.leverbookcase, "leverbookcase");
	}

	public static void loadRCBDM() 
	{
		GameRegistry.registerBlock(IntegratedBlocks.DesertBlockMulti, ItemMulti.class,"DesertBlockMulti");
		GameRegistry.registerBlock(IntegratedBlocks.ColumnMulti, ItemMulti.class, "ColumnMulti");
		GameRegistry.registerBlock(IntegratedBlocks.ColumnMulti2, ItemMulti.class, "ColumnMulti2");
		GameRegistry.registerBlock(IntegratedBlocks.HireoMulti, ItemMulti.class, "HireoMulti");
		GameRegistry.registerBlock(IntegratedBlocks.Cactus1, "Cactus1");
		GameRegistry.registerBlock(IntegratedBlocks.Cactus2, "Cactus2");
		GameRegistry.registerBlock(IntegratedBlocks.CherryTreeLeaves, "CherryTreeLeaves");
		GameRegistry.registerBlock(IntegratedBlocks.Cherrywood, "Cherrywood");
		GameRegistry.registerBlock(IntegratedBlocks.CherryPlanks, "CherryPlanks");
		GameRegistry.registerBlock(IntegratedBlocks.CherryTreeSapling, "CherryTreeSapling");
		GameRegistry.registerBlock(IntegratedBlocks.BloodstoneBrick, "BloodstoneBrick");
	}

	public static void loadRCG() 
	{
		GameRegistry.registerBlock(IntegratedBlocks.GlassMulti, ItemMulti.class, "GlassMulti");
		GameRegistry.registerBlock(IntegratedBlocks.GlowingGlassMulti, ItemMulti.class, "GlowingGlassMulti");
	}

	public static void loadRCMM() 
	{
		GameRegistry.registerBlock(IntegratedBlocks.FreezerActive, "FreezerActive");
		GameRegistry.registerBlock(IntegratedBlocks.FreezerIdle, "FreezerIdle");
		GameRegistry.registerBlock(IntegratedBlocks.BrickOvenActive, "BrickActive");
		GameRegistry.registerBlock(IntegratedBlocks.BrickOvenIdle, "BrickOvenIdle");
		GameRegistry.registerBlock(IntegratedBlocks.ClayalizerIdle, "ClayalizerIdle");
		GameRegistry.registerBlock(IntegratedBlocks.ClayalizerActive, "ClayalizerActive");
	}

	public static void loadRCMOBS() 
	{
		GameRegistry.registerBlock(IntegratedBlocks.rchive, "rchive");
	}

	public static void loadRCORES() 
	{
		GameRegistry.registerBlock(IntegratedBlocks.surfaceOres, ItemMulti.class, "surfaceOres");
		GameRegistry.registerBlock(IntegratedBlocks.netherOres, ItemMulti.class, "netherOres");
		GameRegistry.registerBlock(IntegratedBlocks.endOres, ItemMulti.class, "endOres");
	}

	public static void loadRCPM() 
	{
		GameRegistry.registerBlock(IntegratedBlocks.cornStalk, "cornStalk");
		GameRegistry.registerBlock(IntegratedBlocks.cornBlock, "Corn Block");
		GameRegistry.registerBlock(IntegratedBlocks.AncientPlant, "AncientPlant");
		GameRegistry.registerBlock(IntegratedBlocks.sugarcaneBlock, "SugarcaneBlock");
	}
}
