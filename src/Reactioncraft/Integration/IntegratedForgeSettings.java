package Reactioncraft.integration;

import Reactioncraft.integration.*;
import net.minecraftforge.common.MinecraftForge;

public class IntegratedForgeSettings 
{
	public static void loadAll() 
	{
		/** RCC **/
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.DarkSand, "shovel", 0);
		
		/** RCBB **/
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.Bookcasechest,     "axe", 0);
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.bookcasemeta, 0,   "axe", 0);
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.bookcasemeta, 1,   "axe", 0);
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.bookcasemeta, 2,   "axe", 0);
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.bookcasemeta, 3,   "axe", 0);
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.leverbookcase,     "axe", 0);
		
		/** RCBDM **/
		MinecraftForge.removeBlockEffectiveness(IntegratedBlocks.DesertBlockMulti, "pickaxe");
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.DesertBlockMulti, 0,   "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.DesertBlockMulti, 1,   "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.DesertBlockMulti, 2,   "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.DesertBlockMulti, 3,   "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.DesertBlockMulti, 4,   "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.DesertBlockMulti, 5,   "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.DesertBlockMulti, 6,   "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.DesertBlockMulti, 10,  "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.DesertBlockMulti, 11,  "pickaxe", 0);
		//Bloodstone Column Harvest Levels
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.ColumnMulti, 2,    "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.ColumnMulti2, 2,   "pickaxe", 4);
		
		/** RCN **/
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.rchive, 0, "scoop", 0);
		
		/** RCORES **/
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.netherOres,  0,   "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.surfaceOres, 1,   "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(IntegratedBlocks.endOres,     0,   "pickaxe", 1);
		
		/** RCW **/
		MinecraftForge.setToolClass(IntegratedItems.ObbyPick,    "pickaxe", 4); 
		MinecraftForge.setToolClass(IntegratedItems.ObbyShovel,  "shovel", 4);
		MinecraftForge.setToolClass(IntegratedItems.ObbyAxe,     "axe", 4);
		MinecraftForge.setToolClass(IntegratedItems.BloodstonePick,    "pickaxe", 5);
		MinecraftForge.setToolClass(IntegratedItems.BloodstoneShovel,  "shovel", 5);
		MinecraftForge.setToolClass(IntegratedItems.BloodstoneAxe,     "axe", 5);
	}
}
