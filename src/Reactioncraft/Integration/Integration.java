package Reactioncraft.Integration;

import Reactioncraft.Desert.RCBDM;
import ic2.api.recipe.Recipes;
import Reactioncraft.Desert.RCBDM;
import Reactioncraft.api.common.BrickOvenRecipes;
import Reactioncraft.api.common.ClayalizerRecipes;
import Reactioncraft.bookcase.RCBB;
import Reactioncraft.core.RCC;
import Reactioncraft.core.common.WorldGenHandler2;
import Reactioncraft.ore.RCORES;
import Reactioncraft.machines.RCMM;
import cpw.mods.fml.common.registry.GameRegistry;
import mods.railcraft.api.crafting.RailcraftCraftingManager;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.liquids.LiquidContainerRegistry;
import net.minecraftforge.liquids.LiquidDictionary;
import net.minecraftforge.liquids.LiquidStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Integration 
{	
	public static final int WILDCARD_VALUE = Short.MAX_VALUE;
	
	public static void loadRailCraft()
	{
		GameRegistry.addRecipe(new ItemStack(Block.rail, 8), new Object[] {"X X", "X#X", "X X", 'X', Item.ingotIron, '#', Item.stick});
	}
	
	public static void loadBlastFurnace()
	{
		ItemStack LavaBucket = new ItemStack(Item.bucketLava);
		ItemStack ObsidianBucket = new ItemStack(RCMM.ObsidianBucket);
		
		RailcraftCraftingManager.blastFurnace.addRecipe(ObsidianBucket, true, true, 2000, LavaBucket);
	}
	
	public static void loadReactioncraftBookcases() 
	{
		GameRegistry.addRecipe(new ItemStack(RCBB.bookcasemeta, 1, 3), new Object[]{"###", "BBB", "###", Character.valueOf('#'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('B'), RCBDM.scroll});
	}
	
	public static void loadDesertMachines() 
	{
		GameRegistry.addRecipe(new ItemStack(RCMM.BrickOvenIdle, 1), new Object[]{"XXX","X X", "XXX", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(RCMM.ClayalizerIdle, 1), new Object[]{"XXX","XGX", "XXX", Character.valueOf('X'), Block.glass, Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 3)});
	}
	
	public static void loadCoreGeneration() 
	{
		GameRegistry.registerWorldGenerator(new WorldGenHandler2());
		ClayalizerRecipes.smelting().addSmelting(RCC.DarkSand.blockID, new ItemStack(RCC.SandStonePaste, 4), 0.1F);
		//Multi Colored Sandstone Brick
		GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 2, 5), new Object[]{"XYX","YXY", "XYX", Character.valueOf('Y'), new ItemStack(RCBDM.DesertBlockMulti, 1, 3), Character.valueOf('X'), new ItemStack(RCC.SandStonePaste)});
		GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 2), new Object[]  {"GG", "GG", Character.valueOf('G'), RCC.SandStonePaste});
	}

	public static void loadBoreheads() 
	{
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(RCC.Bloodstonebore, true, new Object[]{
				"XXX", "X#X", "XXX", Character.valueOf('X'), "ingotSteel", Character.valueOf('#'), "ingotBloodstone"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(RCC.Blackdiamondbore, true, new Object[]{
				"XXX", "X#X", "XXX", Character.valueOf('X'), "ingotSteel", Character.valueOf('#'), "diamondBlack"}));
	}
	
	public static void loadIndustrialCraft()
	{
		//Bloodstone block to bloodstone dust
		Recipes.macerator.addRecipe(new ItemStack(RCORES.netherOres, 1, 0), new ItemStack(RCORES.bloodstonedust, 4));
		
		//Black Diamond Ore to Black Diamond
		Recipes.macerator.addRecipe(new ItemStack(RCORES.netherOres, 1, 1), new ItemStack(RCORES.blackdiamond));

		//Dragonstone to Dragonstone Shard
		Recipes.macerator.addRecipe(new ItemStack(RCORES.netherOres, 1, 2), new ItemStack(RCORES.dragonstoneshard));
		
		//Diamond to Diamond
		Recipes.macerator.addRecipe(new ItemStack(RCORES.netherOres, 1, 3), new ItemStack(Item.diamond, 4));
		
		//Gold to Gold Ingot
		FurnaceRecipes.smelting().addSmelting(RCORES.netherOres.blockID, 4, new ItemStack(Item.ingotGold.itemID, 1, 0), 0.5F);

		//Iron Ingot to IronDust
		Recipes.macerator.addRecipe(new ItemStack(Item.ingotIron), new ItemStack(RCORES.irondust));
	}
	
	public static void loadReactioncraftBDM() 
	{
		GameRegistry.addShapelessRecipe(new ItemStack(RCORES.gemdragonstone, 1,0), new Object[]{new ItemStack(RCORES.dragonstoneshard,1,0),new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(RCORES.gemdragonstone, 1,0), new Object[]{new ItemStack(RCORES.dragonstoneshard,1,0),new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(RCORES.gemdragonstone, 1,0), new Object[]{new ItemStack(RCORES.dragonstoneshard,1,0),new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(RCORES.gemdragonstone, 1,0), new Object[]{new ItemStack(RCORES.dragonstoneshard,1,0),new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(RCORES.gemdragonstone, 1,0), new Object[]{new ItemStack(RCORES.dragonstoneshard,1,0),new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
	}
}
