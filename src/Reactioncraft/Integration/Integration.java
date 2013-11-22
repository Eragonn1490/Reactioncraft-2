package Reactioncraft.integration;

import ic2.api.item.Items;
import ic2.api.recipe.RecipeInputOreDict;
import ic2.api.recipe.Recipes;

import com.mrcrayfish.furnitureapi.OvenRecipesAPI;

import Reactioncraft.api.common.*;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import forestry.api.core.ItemInterface;
import forestry.api.recipes.RecipeManagers;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;
import mods.railcraft.api.crafting.RailcraftCraftingManager;

public class Integration 
{
	public static final int WILDCARD_VALUE = Short.MAX_VALUE;

	public static void loadRailCraft() 
	{
		if(IntegratedProperties.hardcorerailcraft.getBoolean(true))
		{
			GameRegistry.addRecipe(new ItemStack(Block.rail, 8), new Object[] {"X X", "X#X", "X X", 'X', Item.ingotIron, '#', Item.stick});
		}

		/** Blast Furnace Stuff **/
		ItemStack LavaBucket = new ItemStack(Item.bucketLava);
		ItemStack ObsidianBucket = new ItemStack(IntegratedItems.ObsidianBucket);

		RailcraftCraftingManager.blastFurnace.addRecipe(ObsidianBucket, true, true, 4000, LavaBucket);

		/** Tunnel Bore Heads **/
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(IntegratedItems.Bloodstonebore, true, new Object[]{"XXX", "X#X", "XXX", Character.valueOf('X'), "ingotSteel", Character.valueOf('#'), "ingotBloodstone"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(IntegratedItems.Blackdiamondbore, true, new Object[]{"XTX", "X#X", "XTX", Character.valueOf('X'), "ingotSteel", Character.valueOf('#'), "diamondBlack", Character.valueOf('T'), "ingotBloodstone"}));
	}

	public static void loadForestryRecipes()
	{		
		if (Loader.isModLoaded("Forestry"))
		{
			ItemStack pollen = ItemInterface.getItem("pollen");
			ItemStack honeyDrop = ItemInterface.getItem("honeyDrop");

			FMLLog.info("[Reactioncraft] found Foresty, [2] centrifuge recipes successfully added!");

			RecipeManagers.centrifugeManager.addRecipe(20, new ItemStack(IntegratedItems.honeycomb, 1, 0), new ItemStack(pollen.itemID, 1, 0), new ItemStack(honeyDrop.itemID, 1, 0), 90);
			RecipeManagers.centrifugeManager.addRecipe(20, new ItemStack(IntegratedItems.pollencomb, 1, 0), new ItemStack(pollen.itemID, 1, 0), new ItemStack(pollen.itemID, 1, 0), 90);
		}
	}

	public static void loadFreezerRecipes() 
	{
		FreezerRecipes.smelting().addSmelting(Item.bucketLava.itemID , new ItemStack(IntegratedItems.ObsidianBucket, 1, 0), 0.5F);
		FreezerRecipes.smelting().addSmelting(Item.bucketWater.itemID, new ItemStack(IntegratedItems.IceBucket), 0.5F);
	}

	public static void loadBrickOvenRecipes() 
	{
		BrickOvenRecipes.smelting().addSmelting(Item.clay.itemID, new ItemStack(Block.brick, 1, 0), 0.5F);
		BrickOvenRecipes.smelting().addSmelting(IntegratedItems.SandStonePaste.itemID, new ItemStack(IntegratedBlocks.DesertBlockMulti, 2, 2), 0.2F);
	}

	public static void loadCrayfishRecipes()
	{
		OvenRecipesAPI.instance().addFoodToOvenRecipes(IntegratedItems.rawcorn.itemID, new ItemStack(IntegratedItems.cookedCorn));
		OvenRecipesAPI.instance().addFoodToOvenRecipes(IntegratedItems.bagofpopcorn.itemID, new ItemStack(IntegratedItems.poppedbagofpopcorn));
		OvenRecipesAPI.instance().addFoodToOvenRecipes(Item.rottenFlesh.itemID, new ItemStack(IntegratedItems.EdibleFlesh));
		OvenRecipesAPI.instance().addFoodToOvenRecipes(IntegratedItems.RawNuggets.itemID, new ItemStack(IntegratedItems.ChickenNuggets));
		OvenRecipesAPI.instance().addFoodToOvenRecipes(IntegratedItems.BaconRaw.itemID, new ItemStack(IntegratedItems.Bacon));
	}

	public static void loadIndustrialCraft() 
	{
		//Bloodstone block to bloodstone dust
		Recipes.macerator.addRecipe(new RecipeInputOreDict("oreBloodstone", 1), null, new ItemStack[] { new ItemStack(IntegratedItems.bloodstonedust, 3)});

		//Black Diamond Ore to Black Diamond
		Recipes.macerator.addRecipe(new RecipeInputOreDict("oreNetherBlackDiamond", 1), null, new ItemStack[] { new ItemStack(IntegratedItems.blackdiamond, 2)});

		//Dragonstone to Dragonstone Shard
		Recipes.macerator.addRecipe(new RecipeInputOreDict("oreNetherDragonstone", 1), null, new ItemStack[] { new ItemStack(IntegratedItems.dragonstoneshard, 1)});

		//Nether Diamond to Diamond
		Recipes.macerator.addRecipe(new RecipeInputOreDict("oreNetherDiamondOre", 1), null, new ItemStack[] { new ItemStack(Item.diamond, 2)});

		//Nether Gold to Gold Dust
		Recipes.macerator.addRecipe(new RecipeInputOreDict("oreNetherGoldOre", 1), null, new ItemStack[] { new ItemStack(IntegratedItems.goldDust, 2)}); 
		GameRegistry.addSmelting(IntegratedItems.goldDust.itemID, new ItemStack(Item.ingotGold.itemID, 1, 0), 0.1F);
		
		//DarkCobble /DarkStone to DarkSand
		Recipes.macerator.addRecipe(new RecipeInputOreDict("DarkCobble", 1), null, new ItemStack[] { new ItemStack(IntegratedBlocks.DarkSand, 2)});
		Recipes.macerator.addRecipe(new RecipeInputOreDict("DarkStone",  1), null, new ItemStack[] { new ItemStack(IntegratedBlocks.DarkSand, 3)});
		
		ItemStack resin1 = Items.getItem("resin");

		if(IntegratedProperties.hardcoreIC2.getBoolean(true))
		{
			Recipes.macerator.addRecipe(new RecipeInputOreDict("woodRubber", 1), null, new ItemStack[] { new ItemStack(resin1.itemID, 2, 0)}); 
		}
	}

	public static void loadClayalizerRecipes() 
	{
		ClayalizerRecipes.smelting().addSmelting(IntegratedBlocks.DarkSand.blockID, new ItemStack(IntegratedItems.SandStonePaste, 4), 0.1F);
	}
}
