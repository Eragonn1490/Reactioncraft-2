package Reactioncraft.integration;

import cpw.mods.fml.common.registry.GameRegistry;
import Reactioncraft.integration.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class IntegratedOreDictionaryFile 
{
	public static void loadAll() 
	{
		/** RCC **/
		OreDictionary.registerOre("darkclay", 				new ItemStack(IntegratedItems.SandStonePaste));
		//Teir 1 hammer
		OreDictionary.registerOre("hammer",                 new ItemStack(IntegratedItems.Hammer, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("hammer",                 new ItemStack(IntegratedItems.bloodstoneHammer, 1, OreDictionary.WILDCARD_VALUE));
		//Teir 2 hammer
		OreDictionary.registerOre("hammer1",                 new ItemStack(IntegratedItems.bloodstoneHammer, 1, OreDictionary.WILDCARD_VALUE));
		
		/** RCCM **/
		OreDictionary.registerOre("ingotRefinedgold", 		new ItemStack(IntegratedItems.ingotRefinedgold,1,0));
		OreDictionary.registerOre("ingotBronze", 			new ItemStack(IntegratedItems.ingotBronze, 1, 0));
		OreDictionary.registerOre("ingotSilver", 			new ItemStack(IntegratedItems.ingotSilver, 1, 0));
		OreDictionary.registerOre("ingotCopper", 			new ItemStack(IntegratedItems.ingotCopper, 1, 0));
		OreDictionary.registerOre("gemRuby",                new ItemStack(IntegratedItems.ruby, 1, 0));
		
		/** RCBDM **/
		OreDictionary.registerOre("DarkCobble",             new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 1));
		OreDictionary.registerOre("DarkStone",              new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 2));
		OreDictionary.registerOre("oreDesertGold",          new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 10));
		OreDictionary.registerOre("BloodstoneBrick", 		new ItemStack(IntegratedBlocks.BloodstoneBrick));
		OreDictionary.registerOre("carveddarkstone", 		new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0));
		OreDictionary.registerOre("darkstonebrick", 		new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 3));
		OreDictionary.registerOre("plankWood", 				new ItemStack(IntegratedBlocks.CherryPlanks));
		OreDictionary.registerOre("CherryWood", 			new ItemStack(IntegratedBlocks.Cherrywood));
		OreDictionary.registerOre("scroll",					new ItemStack(IntegratedItems.scroll));
		//Teir 1 Chisels
		OreDictionary.registerOre("chisel", 				new ItemStack(IntegratedItems.FlintChisel,      1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("chisel", 				new ItemStack(IntegratedItems.CopperChisel,     1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("chisel", 				new ItemStack(IntegratedItems.GoldChisel,       1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("chisel", 				new ItemStack(IntegratedItems.DiamondChisel,    1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("chisel",					new ItemStack(IntegratedItems.BloodstoneChisel, 1, OreDictionary.WILDCARD_VALUE));
		//Teir 2 Chisels
		OreDictionary.registerOre("chisel1", 				new ItemStack(IntegratedItems.GoldChisel,       1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("chisel1", 				new ItemStack(IntegratedItems.DiamondChisel,    1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("chisel1",				new ItemStack(IntegratedItems.BloodstoneChisel, 1, OreDictionary.WILDCARD_VALUE));
		//Teir 3 Chisels
		OreDictionary.registerOre("chisel2", 				new ItemStack(IntegratedItems.DiamondChisel,    1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("chisel2",				new ItemStack(IntegratedItems.BloodstoneChisel, 1, OreDictionary.WILDCARD_VALUE));
		
		/** RCF **/
		OreDictionary.registerOre("rawCorn",		    	new ItemStack(IntegratedItems.rawcorn));
		OreDictionary.registerOre("cheese", 				new ItemStack(IntegratedItems.cheese));
		
		/** RCORES **/
		OreDictionary.registerOre("goldRod", 				new ItemStack(IntegratedItems.goldrod));
		OreDictionary.registerOre("ingotObsidian", 			new ItemStack(IntegratedItems.obsidianingot));
		OreDictionary.registerOre("diamondBlack", 			new ItemStack(IntegratedItems.blackdiamond));
		OreDictionary.registerOre("ingotBloodstone", 		new ItemStack(IntegratedItems.ingotbloodstone));
		OreDictionary.registerOre("ingotSilver", 			new ItemStack(IntegratedItems.ingotsilver));
		OreDictionary.registerOre("ingotSuperheatediron", 	new ItemStack(IntegratedItems.superheatedironingot));
		//OreDictionary.registerOre("gemWizimite", 			new ItemStack(OreItems,1, 5));
		OreDictionary.registerOre("ironDust", 				new ItemStack(IntegratedItems.irondust));
		OreDictionary.registerOre("shardDragonstone",		new ItemStack(IntegratedItems.dragonstoneshard));
		OreDictionary.registerOre("gemDragonstone", 		new ItemStack(IntegratedItems.gemdragonstone));
		//For Dyes
		OreDictionary.registerOre("dyePurple", 				new ItemStack(IntegratedItems.dragonstoneshard));
		//Blocks
		OreDictionary.registerOre("oreSilver",              new ItemStack(IntegratedBlocks.surfaceOres,1, 0));
		OreDictionary.registerOre("oreBloodstone", 			new ItemStack(IntegratedBlocks.netherOres, 1, 0));
		OreDictionary.registerOre("oreNetherBlackDiamond",  new ItemStack(IntegratedBlocks.netherOres, 1, 1));
		OreDictionary.registerOre("oreNetherDragonstone", 	new ItemStack(IntegratedBlocks.netherOres, 1, 2));
		OreDictionary.registerOre("oreNetherDiamondOre", 	new ItemStack(IntegratedBlocks.netherOres, 1, 3));
		OreDictionary.registerOre("oreNetherGoldOre", 		new ItemStack(IntegratedBlocks.netherOres, 1, 4));
		
		/** RCMOBS **/
		OreDictionary.registerOre("bones", 					new ItemStack(IntegratedItems.bones));
		
		/** RCPM **/
		OreDictionary.registerOre("wrappedCorn", 			new ItemStack(IntegratedItems.Wrappedcorn));
	}
}