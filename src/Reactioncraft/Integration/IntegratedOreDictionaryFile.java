package Reactioncraft.integration;

import Reactioncraft.integration.*;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class IntegratedOreDictionaryFile 
{
	public static void loadAll() 
	{
		/** RCC **/
		OreDictionary.registerOre("darkclay", 				new ItemStack(IntegratedItems.SandStonePaste));
		
		/** RCCM **/
		OreDictionary.registerOre("ingotRefinedgold", 		new ItemStack(IntegratedItems.ingotRefinedgold,1,0));
		OreDictionary.registerOre("ingotBronze", 			new ItemStack(IntegratedItems.ingotBronze, 1, 0));
		OreDictionary.registerOre("ingotSilver", 			new ItemStack(IntegratedItems.ingotSilver, 1, 0));
		OreDictionary.registerOre("ingotCopper", 			new ItemStack(IntegratedItems.ingotCopper, 1, 0));
		OreDictionary.registerOre("gemRuby",                new ItemStack(IntegratedItems.ruby, 1, 0));
		
		/** RCBDM **/
		OreDictionary.registerOre("BloodstoneBrick", 		new ItemStack(IntegratedBlocks.BloodstoneBrick));
		OreDictionary.registerOre("carveddarkstone", 		new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0));
		OreDictionary.registerOre("darkstonebrick", 		new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 3));
		OreDictionary.registerOre("plankWood", 				new ItemStack(IntegratedBlocks.CherryPlanks));
		OreDictionary.registerOre("CherryWood", 			new ItemStack(IntegratedBlocks.Cherrywood));
		OreDictionary.registerOre("scroll",					new ItemStack(IntegratedItems.scroll));
		OreDictionary.registerOre("chisel", 				new ItemStack(IntegratedItems.FlintChisel,      1, 0));
		OreDictionary.registerOre("chisel", 				new ItemStack(IntegratedItems.CopperChisel,     1, 0));
		OreDictionary.registerOre("chisel", 				new ItemStack(IntegratedItems.GoldChisel,       1, 0));
		OreDictionary.registerOre("chisel", 				new ItemStack(IntegratedItems.DiamondChisel,    1, 0));
		OreDictionary.registerOre("chisel",					new ItemStack(IntegratedItems.BloodstoneChisel, 1, 0));
		
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
		OreDictionary.registerOre("dustGold", 				new ItemStack(IntegratedItems.goldDust));
		//For Dyes
		OreDictionary.registerOre("dyePurple", 				new ItemStack(IntegratedItems.dragonstoneshard));
		//Blocks
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
