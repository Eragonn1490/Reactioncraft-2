package Reactioncraft.integration;

import Reactioncraft.core.Reactioncraft;

public class IntegratedConfigBlock 
{	
	public static void loadRCC() 
	{
		//Terrain Blocks
		IntegratedConfigB.DarkSandID = Reactioncraft.config.getTerrainBlock("Terrain Block", "Dark Sand", 255, "required for desert biome").getInt();
		//Block 3020-3026
		IntegratedConfigB.newSpongeId = Reactioncraft.config.getBlock("Dry Sponge", 3020).getInt();
		IntegratedConfigB.spongeAbsorbtion = Reactioncraft.config.get("Settings", "Sponge absortion (blocks)", 4).getInt();
		IntegratedConfigB.clearBlockId = Reactioncraft.config.getBlock("Clear Block", 3021).getInt();
		IntegratedConfigB.snowblockBlockID = Reactioncraft.config.getBlock("Snow Block", 3022).getInt();
		IntegratedConfigB.chainladderID = Reactioncraft.config.getBlock("chain ladder", 3023).getInt();
	}

	public static void loadRCBB() 
	{
		//Blocks 3000 - 3007
		IntegratedConfigB.bookcasemetaID = Reactioncraft.config.getBlock("Metadata BookShelfs", 3000).getInt();
		IntegratedConfigB.BookcasechestID = Reactioncraft.config.getBlock("BookShelf Chest", 3001).getInt();
		IntegratedConfigB.WoodenBookcasedoorBlockID = Reactioncraft.config.getBlock("Wooden BookShelf Door", 3002).getInt();
		IntegratedConfigB.IronBookcasedoorBlockID = Reactioncraft.config.getBlock("Iron BookShelf Door", 3003).getInt();
		IntegratedConfigB.leverbookcaseID = Reactioncraft.config.getBlock("leverbookcase", 3004).getInt();
	}

	public static void loadRCBDM() 
	{
		//3027 - 3040
		IntegratedConfigB.CherrywoodID = Reactioncraft.config.getBlock("Cherry Tree Wood", 3027).getInt();
		IntegratedConfigB.CherryTreeLeavesID = Reactioncraft.config.getBlock("Cherry Tree Leaves", 3028).getInt();
		IntegratedConfigB.CherryTreeSaplingID = Reactioncraft.config.getBlock("Cherry Tree Sapling", 3029).getInt();
		IntegratedConfigB.HireoBlocksID = Reactioncraft.config.getBlock("Hireoglyphics", 3030).getInt();
		IntegratedConfigB.DesertBlocksID = Reactioncraft.config.getBlock("Dark Sandstone Blocks", 3031).getInt();
		IntegratedConfigB.ColumnBlockID = Reactioncraft.config.getBlock("Column Blocks", 3032).getInt();
		IntegratedConfigB.DesertBlockMultiID = Reactioncraft.config.getBlock("Desert Blocks", 3033).getInt();
		IntegratedConfigB.BloodstoneBrickID = Reactioncraft.config.getBlock("Bloodstone Brick", 3034).getInt();
		IntegratedConfigB.Cactus1ID = Reactioncraft.config.getBlock("Cactus Block 1", 3035).getInt();
		IntegratedConfigB.Cactus2ID = Reactioncraft.config.getBlock("Cactus Block 2", 3036).getInt();
		IntegratedConfigB.ColumnBlock2ID = Reactioncraft.config.getBlock("Skinny Column Blocks", 3037).getInt();
		IntegratedConfigB.CherryPlanksID = Reactioncraft.config.getBlock("Cherry Planks", 3038).getInt();
	}

	public static void loadRCG()
	{
		//Block IDs 3061 - 3064
		IntegratedConfigB.glassID = Reactioncraft.config.getBlock("Glass Meta", 3061).getInt();
		IntegratedConfigB.glass2ID = Reactioncraft.config.getBlock("Glowing Glass Meta", 3062).getInt();
	}

	public static void loadRCMM() 
	{
		//3066- 3073
		IntegratedConfigB.FreezerActiveID = Reactioncraft.config.getBlock("Freezer Active", 3066).getInt();
		IntegratedConfigB.FreezerIdleID   = Reactioncraft.config.getBlock("Freezer Idle", 3067).getInt();
		IntegratedConfigB.BrickOvenActiveID = Reactioncraft.config.getBlock("Brick Oven Active", 3068).getInt();
		IntegratedConfigB.BrickOvenIdleID   = Reactioncraft.config.getBlock("Brick Oven Idle", 3069).getInt();
		IntegratedConfigB.ClayalizerActiveID = Reactioncraft.config.getBlock("Clayalizer Active", 3070).getInt();
		IntegratedConfigB.ClayalizerIdleID   = Reactioncraft.config.getBlock("Clayalizer Idle", 3071).getInt();
	}

	public static void loadRCMOBS() 
	{
		//Blocks 3090 (Tracker Jacker Hive)
		IntegratedConfigB.hiveID = Reactioncraft.config.getBlock("Hive Block", 3090).getInt();
	}

	public static void loadRCORES() 
	{
		//Claimed Block IDs 3074 - 3080
		IntegratedConfigB.surfaceOresID = Reactioncraft.config.getBlock("Surface Ores", 3074).getInt();
		IntegratedConfigB.netherOresID = Reactioncraft.config.getBlock("Nether Ores", 3075).getInt();
		IntegratedConfigB.endOresID = Reactioncraft.config.getBlock("End Ores", 3076).getInt();
	}

	public static void loadRCPM() 
	{
		//Claimed IDs 3081 - 3089 (3090 given to mobs mod for tracker jacker hive)
		//CocoCropID = Reactioncraft.config.getBlock("Coco Crop", 3081).getInt();
		IntegratedConfigB.AncientPlantID = Reactioncraft.config.getBlock("Ancient Plant", 3082).getInt();
		IntegratedConfigB.sugarcaneBlockID = Reactioncraft.config.getBlock("Sugar Cane", 3083).getInt();
		IntegratedConfigB.cornBlockID = Reactioncraft.config.getBlock("corn Block", 3084).getInt();
		IntegratedConfigB.cornStalkID = Reactioncraft.config.getBlock("corn Stalk", 3085).getInt();
	}
}
