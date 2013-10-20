package Reactioncraft.integration;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import Reactioncraft.integration.*;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import forestry.api.core.ItemInterface;
import forestry.api.recipes.RecipeManagers;

public class IntegratedRecipes 
{
	public static final int WILDCARD_VALUE = Short.MAX_VALUE;

	public static void loadRCMOBS() 
	{
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.dyePowder, 2, 15), true, new Object[]{"Y", Character.valueOf('Y'), "bones"}));
	}

	public static void loadRCG()
	{
		GameRegistry.addSmelting(Block.glass.blockID, new ItemStack(IntegratedItems.moltenglass.itemID, 1, 0), 0.5F);

		if (IntegratedProperties.VanillaDyeGlassRecipes.getBoolean(true))
		{
			//Stained Glass
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 1), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 1), IntegratedItems.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1), new Object[]     {
				new ItemStack(Item.dyePowder, 1, 11), IntegratedItems.moltenglass });
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 2), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 0), IntegratedItems.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 3), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 4), IntegratedItems.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 4), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 3), IntegratedItems.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 5), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 6), IntegratedItems.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 6), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 8), IntegratedItems.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 7), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 2), IntegratedItems.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 8), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 12), IntegratedItems.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 9), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 7), IntegratedItems.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 10), new Object[] {
				new ItemStack(Item.dyePowder, 1, 10), IntegratedItems.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 11), new Object[] {
				new ItemStack(Item.dyePowder, 1, 13), IntegratedItems.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 12), new Object[] {
				new ItemStack(Item.dyePowder, 1, 14), IntegratedItems.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 13), new Object[] {
				new ItemStack(Item.dyePowder, 1, 9), IntegratedItems.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 14), new Object[] {
				new ItemStack(Item.dyePowder, 1, 5), IntegratedItems.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 15), new Object[] {
				new ItemStack(Item.dyePowder, 1, 15), IntegratedItems.moltenglass});

			//Glowing Glass
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 1), new Object[]  {
				IntegratedItems.moltenglass, Item.glowstone, new ItemStack(Item.dyePowder, 1, 1)});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1), new Object[]     {
				IntegratedItems.moltenglass, Item.glowstone, new ItemStack(Item.dyePowder, 1, 11)});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 2), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 0), IntegratedItems.moltenglass, Item.glowstone });
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 3), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 4), IntegratedItems.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 4), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 3), IntegratedItems.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 5), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 6), IntegratedItems.moltenglass, Item.glowstone });
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 6), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 8), IntegratedItems.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 7), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 2), IntegratedItems.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 8), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 12), IntegratedItems.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 9), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 7), IntegratedItems.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 10), new Object[] {
				new ItemStack(Item.dyePowder, 1, 10), IntegratedItems.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 11), new Object[] {
				new ItemStack(Item.dyePowder, 1, 13), IntegratedItems.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 12), new Object[] {
				new ItemStack(Item.dyePowder, 1, 14), IntegratedItems.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 13), new Object[] {
				new ItemStack(Item.dyePowder, 1, 9), IntegratedItems.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 14), new Object[] {
				new ItemStack(Item.dyePowder, 1, 5), IntegratedItems.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 15), new Object[] {
				new ItemStack(Item.dyePowder, 1, 15), IntegratedItems.moltenglass, Item.glowstone});
		}

		if (IntegratedProperties.OreDictionaryGlassRecipes.getBoolean(true))
		{	
			//Regular Glass
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 2), new Object[]{"dyeBlack", IntegratedItems.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 1), new Object[]{"dyeRed", IntegratedItems.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 7), new Object[]{"dyeGreen", IntegratedItems.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 4), new Object[]{"dyeBrown", IntegratedItems.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 3), new Object[]{"dyeBlue", IntegratedItems.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 14), new Object[]{"dyePurple", IntegratedItems.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 5), new Object[]{"dyeCyan", IntegratedItems.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 9), new Object[]{"dyeLightGray", IntegratedItems.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 6), new Object[]{"dyeGray", IntegratedItems.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 13), new Object[]{"dyePink", IntegratedItems.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 10), new Object[]{"dyeLime", IntegratedItems.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 0), new Object[]{"dyeYellow", IntegratedItems.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 8), new Object[]{"dyeLightBlue", IntegratedItems.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 11), new Object[]{"dyeMagenta", IntegratedItems.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 12), new Object[]{"dyeOrange", IntegratedItems.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlassMulti, 1, 15), new Object[]{"dyeWhite", IntegratedItems.moltenglass}));

			//Glowing Glass
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 2), new Object[]{"dyeBlack", IntegratedItems.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 1), new Object[]{"dyeRed", IntegratedItems.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 7), new Object[]{"dyeGreen", IntegratedItems.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 4), new Object[]{"dyeBrown", IntegratedItems.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 3), new Object[]{"dyeBlue", IntegratedItems.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 14), new Object[]{"dyePurple", IntegratedItems.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 5), new Object[]{"dyeCyan", IntegratedItems.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 9), new Object[]{"dyeLightGray", IntegratedItems.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 6), new Object[]{"dyeGray", IntegratedItems.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 13), new Object[]{"dyePink", IntegratedItems.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 10), new Object[]{"dyeLime", IntegratedItems.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 0), new Object[]{"dyeYellow", IntegratedItems.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 8), new Object[]{"dyeLightBlue", IntegratedItems.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 11), new Object[]{"dyeMagenta", IntegratedItems.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 12), new Object[]{"dyeOrange", IntegratedItems.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.GlowingGlassMulti, 1, 15), new Object[]{"dyeWhite", IntegratedItems.moltenglass, Item.glowstone}));
		}
	}

	public static void loadNetRecipes() 
	{
		Object[] levels = new Object[] { Block.planks, Item.leather, Item.ingotIron, Item.ingotGold, Item.diamond };
		for (int i = 0; i < levels.length; i++) 
		{
			Object[] hiltRec = new Object[] { " XI", "XIX", "IX ", 'X', Item.stick, 'I', levels[i] };
			Object[] netRec = new Object[] { "IXI", "XIX", "IXI", 'X', Item.silk, 'I', levels[i] };
			ItemStack hiltIs = new ItemStack(IntegratedItems.hilt);
			ItemStack netIs = new ItemStack(IntegratedItems.net);
			hiltIs.stackTagCompound = new NBTTagCompound();
			netIs.stackTagCompound = new NBTTagCompound();
			hiltIs.stackTagCompound.setInteger("str", (i + 1));
			netIs.stackTagCompound.setInteger("str", (i + 1));
			GameRegistry.addRecipe(hiltIs, hiltRec);
			GameRegistry.addRecipe(netIs, netRec);
		}
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.completeNet), IntegratedItems.hilt, IntegratedItems.net);
	}

	public static void loadRecipesforVanilla() 
	{
		//Wool to string recipe! (Fixed to prevent duplication 4 required)
		GameRegistry.addRecipe(new ItemStack(Item.silk, 4), new Object[] {"X", 'X', Block.cloth});

		GameRegistry.addSmelting(IntegratedItems.IceBucket.itemID, new ItemStack(Item.bucketWater, 1), 0.5F);
	}

	public static void loadRCMM() 
	{
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.BrickOvenIdle, 1), new Object[]{"XXX","X X", "XXX", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ClayalizerIdle, 1), new Object[]{"XXX","XGX", "XXX", Character.valueOf('G'), Block.glass, Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.FreezerIdle, 1), new Object[]{"RSR", "LOW", "RSR",  Character.valueOf('W'), Item.bucketWater ,Character.valueOf('L'), Block.lever ,Character.valueOf('S'), Block.blockIron ,Character.valueOf('O'), Block.furnaceIdle, Character.valueOf('R'), Item.redstone});

		GameRegistry.addShapelessRecipe(new ItemStack(Block.ice, 1), new Object[]{IntegratedItems.IceBucket,});
		GameRegistry.addShapelessRecipe(new ItemStack(Block.obsidian, 1), new Object[]{IntegratedItems.ObsidianBucket,});
	}

	public static void loadRCW() 
	{
		//Obsidian Tools
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(IntegratedItems.ObbySword, true, new Object[]{"I", "I", "X", Character.valueOf('I'), "ingotObsidian", Character.valueOf('X'), "goldRod"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(IntegratedItems.ObbyPick, true, new Object[]{"III", " X ", " X ", Character.valueOf('I'), "ingotObsidian", Character.valueOf('X'), "goldRod"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(IntegratedItems.ObbyShovel, true, new Object[]{"I", "X", "X", Character.valueOf('I'), "ingotObsidian", Character.valueOf('X'), "goldRod"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(IntegratedItems.ObbyAxe, true, new Object[]{"II ", "IX ", " X ", Character.valueOf('I'), "ingotObsidian", Character.valueOf('X'), "goldRod"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(IntegratedItems.ObbyHoe, true, new Object[]{"II ", " X ", " X ", Character.valueOf('I'), "ingotObsidian", Character.valueOf('X'), "goldRod"}));


		//Bloodstone Tools
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.UnbindedSword,1), new Object[]{"B", "F", Character.valueOf('B'), IntegratedItems.BloodstoneBlade, Character.valueOf('F'), IntegratedItems.GoldenSwordFragment});
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(IntegratedItems.BloodstoneBlade, true, new Object[]{"X", "X", "X", Character.valueOf('X'), "ingotBloodstone"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(IntegratedItems.GoldenSwordFragment, true, new Object[]{" I ", "XIX", " X ", Character.valueOf('I'), "gemDragonstone", Character.valueOf('X'), "goldRod"}));

		/** Bloodstone Tools **/
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(IntegratedItems.BloodstonePick, true, new Object[]{"III", " X ", " X ", Character.valueOf('I'), "ingotBloodstone", Character.valueOf('X'), "goldRod"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(IntegratedItems.BloodstoneShovel, true, new Object[]{" I ", " X ", " X ", Character.valueOf('I'), "ingotBloodstone", Character.valueOf('X'), "goldRod"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(IntegratedItems.BloodstoneAxe, true, new Object[]{"II ", "IX ", " X ", Character.valueOf('I'), "ingotBloodstone", Character.valueOf('X'), "goldRod"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(IntegratedItems.BloodstoneHoe, true, new Object[]{"II ", " X ", " X ", Character.valueOf('I'), "ingotBloodstone", Character.valueOf('X'), "goldRod"}));

		GameRegistry.addSmelting(IntegratedItems.UnbindedSword.itemID, new ItemStack(IntegratedItems.BloodstoneSword.itemID, 1, 1), 0.5F);
	}

	public static void loadRCPM() 
	{
		/** Reactioncraft Taller Sugarcane to Paper & sugar **/
		GameRegistry.addRecipe(new ItemStack(Item.paper, 3), new Object[] {"###", '#', IntegratedItems.sugarcaneItem});
		GameRegistry.addRecipe(new ItemStack(Item.sugar, 1), new Object[] {"#", '#', IntegratedItems.sugarcaneItem});
		//to get mutated sugarcane
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.sugarcaneItem, 2), new Object[] {IntegratedItems.AncientFlower, Item.reed});
		//Grabbing Seeds!
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.AncientSeeds, 1), new Object[] {IntegratedItems.AncientFlower});
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.AncientSeeds, 2), new Object[] {IntegratedItems.AncientFruit});
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.CornSeed, 2), new Object[] {IntegratedItems.rawcorn});
	}

	public static void loadRCF() 
	{
		//Cook the fish from the chef
		GameRegistry.addSmelting(IntegratedItems.SamonRaw.itemID, new ItemStack(IntegratedItems.Samon), 0.5F);
		GameRegistry.addSmelting(IntegratedItems.YellowTailRaw.itemID, new ItemStack(IntegratedItems.YellowTailCooked), 0.5F);
		//Cookin Da Bacon!
		GameRegistry.addSmelting(IntegratedItems.BaconRaw.itemID, new ItemStack(IntegratedItems.Bacon), 0.5F); 
		//Rotten Flesh to Edible Flesh
		GameRegistry.addSmelting(Item.rottenFlesh.itemID, new ItemStack(IntegratedItems.EdibleFlesh), 0.5F); 
		//Cooking Chicken Nuggets
		GameRegistry.addSmelting(IntegratedItems.RawNuggets.itemID, new ItemStack(IntegratedItems.ChickenNuggets), 0.5F);
		//Corn Recipes
		GameRegistry.addSmelting(IntegratedItems.bagofpopcorn.itemID, new ItemStack(IntegratedItems.poppedbagofpopcorn), 0.5F);
		GameRegistry.addSmelting(IntegratedItems.rawcorn.itemID, new ItemStack(IntegratedItems.cookedCorn), 0.5F);

		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.popcornseeds, 5), new Object[]{IntegratedItems.rawcorn});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.bagofpopcorn, 1), new Object[] {"AAA", "BBB", "AAA", 'A', Item.paper, 'B', IntegratedItems.popcornseeds});
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.RawNuggets, 5), new Object[] {Item.chickenRaw, new ItemStack(IntegratedItems.Knfie,1, WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.SlicedBread, 6), new Object[] {Item.bread, new ItemStack(IntegratedItems.Knfie,1, WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.HamSandwich, 1), new Object[] {"A", "B", "A", 'A', IntegratedItems.SlicedBread, 'B', Item.porkRaw});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.Hamburger, 1), new Object[] {"A", "B", "A", 'A', IntegratedItems.SlicedBread, 'B', Item.beefCooked});
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(IntegratedItems.Cheeseburger, true, new Object[]{" A ", " BC", " A ", Character.valueOf('C'), "cheese", Character.valueOf('A'), IntegratedItems.SlicedBread, Character.valueOf('B'), Item.beefCooked}));
		//GameRegistry.addRecipe(new ItemStack(HamSandwich, 1), new Object[] {"A", "B", "A", 'A', RCF.SlicedBread, 'B', Item.});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.Knfie, 1), new Object[] {"B", "A", 'A', Item.stick, 'B', Item.ingotIron});
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.BaconRaw, 4), new Object[] {Item.porkRaw, new ItemStack(IntegratedItems.Knfie, 1, WILDCARD_VALUE)});
	}

	public static void loadRCBDM() 
	{
		//Smelting Desert Gold
		FurnaceRecipes.smelting().addSmelting(IntegratedBlocks.DesertBlockMulti.blockID, 10, new ItemStack(Item.ingotGold.itemID, 1, 0), 0.5F);
		//Cherry Tree Planks
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.CherryPlanks, 4, 0), new Object[]{"CherryWood"}));
		GameRegistry.addSmelting(IntegratedBlocks.Cherrywood.blockID, new ItemStack(Item.coal, 1, 1), 0.5F);
		
		//Darkstone
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 2), new Object[]{"darkclay", "darkclay", "darkclay", "darkclay"}));

		//Limestone to Chiseled Limestone
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 7), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 6), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 7), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 6), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 7), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 6), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 7), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 6), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 7), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 6), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE));

		/**Bloodstone brick recipe**/
		CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(IntegratedBlocks.BloodstoneBrick,4,4), new Object[]{"oreBloodstone", "oreBloodstone", "oreBloodstone", "oreBloodstone"}));

		/**Chisels Cutting the Gems into Cut form.**/
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.CutLBGem,1,0), new Object[]{IntegratedItems.CutLBGem, new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.CutLBGem,1,0), new Object[]{IntegratedItems.CutLBGem, new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.CutLBGem,1,0), new Object[]{IntegratedItems.CutLBGem, new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.CutLBGem,1,0), new Object[]{IntegratedItems.CutLBGem, new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.CutLBGem,1,0), new Object[]{IntegratedItems.CutLBGem, new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});

		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.CutDBGem,1,0), IntegratedItems.CutDBGem, new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.CutDBGem,1,0), IntegratedItems.CutDBGem, new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.CutDBGem,1,0), IntegratedItems.CutDBGem, new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.CutDBGem,1,0), IntegratedItems.CutDBGem, new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.CutDBGem,1,0), IntegratedItems.CutDBGem, new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE));

		//Chisels Cutting Columns

		//Dark Sandstone Column
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 0), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 3), Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 0), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 3), Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 0), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 3), Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 0), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 3), Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 0), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 3), Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});

		//stone Column
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 3), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stone, Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 3), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stone, Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 3), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stone, Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 3), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stone, Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 3), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stone, Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});

		//Cobblestone Column
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 4), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.cobblestone, Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 4), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.cobblestone, Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 4), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.cobblestone, Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 4), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.cobblestone, Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 4), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.cobblestone, Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});


		//Gold Column
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 5), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.blockGold, Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 5), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.blockGold, Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 5), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.blockGold, Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});

		//Diamond Column
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 6), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.blockDiamond, Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 6), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.blockDiamond, Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		//Stone Brick Column
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 7), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stoneBrick, Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 7), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stoneBrick, Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 7), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stoneBrick, Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 7), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stoneBrick, Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 7), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stoneBrick, Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		//Limestone Column
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 8), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 7), Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 8), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 7), Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 8), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 7), Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 8), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 7), Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 8), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 7), Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		//Bloodstone Column
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 2), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), IntegratedBlocks.BloodstoneBrick, Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		/** Skinny Columns **/
		//Dark Sandstone Column
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		//stone Column
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 3), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 3), Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 3), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 3), Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 3), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 3), Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 3), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 3), Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 3), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 3), Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		//Cobblestone Column
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 4), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 4), Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 4), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 4), Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 4), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 4), Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 4), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 4), Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 4), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 4), Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		//Gold Column
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 5), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 5), Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 5), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 5), Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 5), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 5), Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		//Diamond Column
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 6), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 6), Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 6), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 6), Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		//Stone Brick Column
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 7), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 7), Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 7), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 7), Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 7), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 7), Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 7), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 7), Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 7), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 7), Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		//Limestone Column
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 8), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 8), Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 8), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 8), Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 8), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 8), Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 8), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 8), Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 8), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 8), Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		//Bloodstone Column
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.ColumnMulti2, 1, 2), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.ColumnMulti, 1, 2), Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		//Carved Dark Sandstone
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 2), Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 2), Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 2), Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 2), Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 2), Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		//Cracked Dark Sandstone to Carved Dark Sandstone
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 1), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 1), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 1), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 1), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 1), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE));
		//Dark Sandstone Brick
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 3), new Object[]{"XX","XX", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0)});

		/**
		LanguageRegistry.addName(new ItemStack(IntegratedBlocks.ColumnMulti, 1, 1), "Marble Column");
		 **/

		//Cracked Darkstone Brick to Darkstone Brick
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 4), Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 4), Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 4), Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 4), Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 4), Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});

		//Weather Hireoglyphics to Carved Dark Stone
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), new ItemStack(IntegratedBlocks.HireoMulti, 1, 11), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), new ItemStack(IntegratedBlocks.HireoMulti, 1, 11), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), new ItemStack(IntegratedBlocks.HireoMulti, 1, 11), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), new ItemStack(IntegratedBlocks.HireoMulti, 1, 11), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), new ItemStack(IntegratedBlocks.HireoMulti, 1, 11), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE));


		/** Regular Hireoglyphics **/
		//Flint Chisel
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 0), new Object[]{"YYY", " X ", "   ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 1), new Object[]{"YYY", "YX ", "   ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 2), new Object[]{"YYY", "YXY", "   ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		//Copper Chisel
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 0), new Object[]{"YYY", " X ", "   ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 1), new Object[]{"YYY", "YX ", "   ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 2), new Object[]{"YYY", "YXY", "   ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		//Gold Chisel
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 0), new Object[]{"YYY", " X ", "   ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 1), new Object[]{"YYY", "YX ", "   ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 2), new Object[]{"YYY", "YXY", "   ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		//Diamond Chisel
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 0), new Object[]{"YYY", " X ", "   ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 1), new Object[]{"YYY", "YX ", "   ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 2), new Object[]{"YYY", "YXY", "   ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		//Bloodstone Chisel
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 0), new Object[]{"YYY", " X ", "   ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 1), new Object[]{"YYY", "YX ", "   ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 2), new Object[]{"YYY", "YXY", "   ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});

		/** Lightblue Hireoglyphics **/
		//Flint
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 3), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutLBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 4), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutLBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 5), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutLBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		//Copper
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 3), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutLBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 4), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutLBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 5), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutLBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		//Gold
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 3), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutLBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 4), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutLBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 5), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutLBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		//Diamond Based Lightblue Hireoglyphics
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 3), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutLBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 4), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutLBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 5), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutLBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		//Bloodstone Based Lightblue Hireoglyphics
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 3), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutLBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 4), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutLBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 5), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutLBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});

		/** Darkblue Hireoglyphics **/
		//Flint
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 6), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutDBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 7), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutDBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 8), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutDBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		//Copper 
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 6), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutDBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 7), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutDBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 8), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutDBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		//Gold
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 6), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutDBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 7), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutDBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 8), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutDBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		//Diamond
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 6), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutDBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 7), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutDBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 8), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutDBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		//Bloodstone Based Darkblue Hireoglyphics
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 6), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutDBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 7), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutDBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 8), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), IntegratedItems.CutDBGem, Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});

		/** Gold Hireoglyphics **/
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 13), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 14), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 15), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		//Copper Based DarkBlue Hireoglyphics
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 13), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 14), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 15), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		//gold Based Darkblue Hireoglyphics
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 13), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 14), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 15), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		//Diamond Based Darkblue Hireoglyphics
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 13), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 14), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 15), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		//Bloodstone Based Darkblue Hireoglyphics
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 13), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 14), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.HireoMulti, 1, 15), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});

		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.gemdragonstone, 1,0), new Object[]{new ItemStack(IntegratedItems.dragonstoneshard,1,0),new ItemStack(IntegratedItems.FlintChisel,1,WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.gemdragonstone, 1,0), new Object[]{new ItemStack(IntegratedItems.dragonstoneshard,1,0),new ItemStack(IntegratedItems.GoldChisel,1,WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.gemdragonstone, 1,0), new Object[]{new ItemStack(IntegratedItems.dragonstoneshard,1,0),new ItemStack(IntegratedItems.CopperChisel,1,WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.gemdragonstone, 1,0), new Object[]{new ItemStack(IntegratedItems.dragonstoneshard,1,0),new ItemStack(IntegratedItems.DiamondChisel,1,WILDCARD_VALUE)});
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.gemdragonstone, 1,0), new Object[]{new ItemStack(IntegratedItems.dragonstoneshard,1,0),new ItemStack(IntegratedItems.BloodstoneChisel,1,WILDCARD_VALUE)});
	}

	public static void loadRCORES() 
	{
		//Silver to Silver Ingot
		FurnaceRecipes.smelting().addSmelting(IntegratedBlocks.surfaceOres.blockID, 0, new ItemStack(IntegratedItems.ingotsilver.itemID, 1, 0), 0.5F);
		//Bloodstone to Bloodstone Ingot
		FurnaceRecipes.smelting().addSmelting(IntegratedBlocks.netherOres.blockID, 0, new ItemStack(IntegratedItems.ingotbloodstone.itemID, 1, 0), 0.5F);
		//Gold rod to gold ingot
		GameRegistry.addSmelting(IntegratedItems.goldrod.itemID, new ItemStack(Item.ingotGold.itemID, 2, 0), 0.5F);
		//Bloodstone dust to bloodstone ingot
		GameRegistry.addSmelting(IntegratedItems.bloodstonedust.itemID, new ItemStack(IntegratedItems.ingotbloodstone.itemID, 1, 0), 0.5F);
		//Obsidian to obsidian ingot
		GameRegistry.addSmelting(Block.obsidian.blockID, new ItemStack(IntegratedItems.obsidianingot.itemID, 1, 0), 0.5F);
		//Nether Gold to Gold Ingot
		FurnaceRecipes.smelting().addSmelting(IntegratedBlocks.netherOres.blockID, 4, new ItemStack(Item.ingotGold.itemID, 1, 0), 0.5F);
		//Iron Dust to Superheated Iron
		GameRegistry.addSmelting(IntegratedItems.irondust.itemID, new ItemStack(IntegratedItems.superheatedironingot.itemID, 2, 0), 0.5F);
		//Gold Rod Recipe
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.goldrod, 1, 0), new Object[]{"D", "D", Character.valueOf('D'), Item.ingotGold});
	}

	public static void loadRCCM() 
	{
		//1.6.2 Recipes
		GameRegistry.addSmelting(Block.tallGrass.blockID, new ItemStack(IntegratedItems.Straw), 0.5F); 
		GameRegistry.addSmelting(Item.ingotGold.itemID, new ItemStack(IntegratedItems.ingotRefinedgold,1,0), 0.5F); 
		//Crown
		GameRegistry.addSmelting(IntegratedItems.Crown.itemID, new ItemStack(IntegratedItems.ingotRefinedgold,3,0), 0.5F);
		//Molten Gold
		GameRegistry.addSmelting(IntegratedItems.goldbucket.itemID,   new ItemStack(IntegratedItems.moltengold, 1, 0), 0.5F);
		//Molten Silver
		GameRegistry.addSmelting(IntegratedItems.silverbucket.itemID, new ItemStack(IntegratedItems.moltensilver, 1, 0), 0.5F);
		//Molten Bronze
		GameRegistry.addSmelting(IntegratedItems.bronzebucket.itemID, new ItemStack(IntegratedItems.moltenbronze, 1, 0), 0.5F);
		//Molten Copper
		GameRegistry.addSmelting(IntegratedItems.copperbucket.itemID, new ItemStack(IntegratedItems.moltencopper, 1, 0), 0.5F);

		GameRegistry.addRecipe(new ItemStack(IntegratedItems.Bag,1), new Object[]{
			"TTT","T T","TTT",'T', IntegratedItems.Straw
		});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.Sack,1), new Object[]{
			"TTT","TTT",'T', IntegratedItems.Straw
		});

		//Armor
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.Crown,1), new Object[]{
			"T T","TTT",'T', Item.ingotGold
		});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.KinglyChest,1), new Object[]{
			"T T","TTT","TTT",'T', Block.cloth
		});            
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.KinglyLegs,1), new Object[]{
			"TTT","T T","T T",'T', Block.cloth
		});            
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.KinglyBoots,1), new Object[]{
			"T T","T T",'T', Block.cloth
		});
		
		//Other Crowns
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.diamondcrown,1), new Object[]{
			"TDT","TTT",'T', Item.ingotGold, 'D', Item.diamond
		});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.emeraldcrown,1), new Object[]{
			"TET","TTT",'T', Item.ingotGold, 'E', Item.emerald
		});
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(IntegratedItems.rubycrown,1,0), true, new Object[] {"TYT","TTT", Character.valueOf('T'), Item.ingotGold, Character.valueOf('Y'), "gemRuby"}));
		
		//Bloodstone Armor
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.bloodstonehelm,1), new Object[]{
			"TTT","T T",'T', IntegratedItems.ingotbloodstone
		});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.bloodstonechest,1), new Object[]{
			"T T","TTT","TTT",'T', IntegratedItems.ingotbloodstone
		});            
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.bloodstonelegs,1), new Object[]{
			"TTT","T T","T T",'T', IntegratedItems.ingotbloodstone
		});            
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.bloodstoneboots,1), new Object[]{
			"T T","T T",'T', IntegratedItems.ingotbloodstone
		});
		
		//Bronze Ingot
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(IntegratedItems.ingotBronze,1,0), true, new Object[]{
			"XY", "YX", Character.valueOf('X'), "ingotCopper", Character.valueOf('Y'), "ingotTin"}));

		//Gold Bucket   / Downgrade
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(IntegratedItems.goldbucket,1,0), true, new Object[] {"Y", "X", Character.valueOf('X'), Item.bucketEmpty, Character.valueOf('Y'), "ingotRefinedgold"}));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.ingotRefinedgold, 1), IntegratedItems.goldbucket);
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.ingotRefinedgold, 1), IntegratedItems.moltengold, new ItemStack(IntegratedItems.ingotmould,1, WILDCARD_VALUE));
		//Silver Bucket / Downgrade
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(IntegratedItems.silverbucket,1,0), true, new Object[] {"Y", "X", Character.valueOf('X'), Item.bucketEmpty, Character.valueOf('Y'), "ingotSilver"}));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.ingotSilver, 1), IntegratedItems.silverbucket);
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.ingotSilver, 1), IntegratedItems.moltensilver, new ItemStack(IntegratedItems.ingotmould,1, WILDCARD_VALUE));
		//Bronze Bucket / Downgrade
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(IntegratedItems.bronzebucket,1,0), true, new Object[] {"Y", "X", Character.valueOf('X'), Item.bucketEmpty, Character.valueOf('Y'), "ingotBronze"}));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.ingotBronze, 1), IntegratedItems.bronzebucket);
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.ingotBronze, 1), IntegratedItems.moltenbronze, new ItemStack(IntegratedItems.ingotmould,1, WILDCARD_VALUE));
		//Copper Bucket / Downgrade
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(IntegratedItems.copperbucket,1,0), true, new Object[]{"Y", "X", Character.valueOf('X'), Item.bucketEmpty, Character.valueOf('Y'), "ingotCopper"}));
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.ingotCopper, 1), IntegratedItems.copperbucket);
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.ingotCopper, 1), IntegratedItems.moltencopper, new ItemStack(IntegratedItems.ingotmould,1, WILDCARD_VALUE));

		/** Coin Crafting **/
		//Copper Coin Crafting
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.Metadatacoin, 2, 0), new Object[]{new ItemStack(IntegratedItems.moltencopper), new ItemStack(IntegratedItems.CoinMould,1, WILDCARD_VALUE)});
		//Bronze Coin Crafting
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.Metadatacoin, 2, 1), new Object[]{new ItemStack(IntegratedItems.moltenbronze), new ItemStack(IntegratedItems.CoinMould,1, WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.Metadatacoin, 1, 2), new Object[]{ "###", "###", "###", Character.valueOf('#'), new ItemStack(IntegratedItems.Metadatacoin, 1, 1),});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.Metadatacoin, 1, 3), new Object[]{ "DDD", Character.valueOf('D'), new ItemStack(IntegratedItems.Metadatacoin, 1, 2),});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.Metadatacoin, 1, 4), new Object[]{ "###", "###", " D ", Character.valueOf('#'), new ItemStack(IntegratedItems.Metadatacoin, 1, 3), Character.valueOf('D'), IntegratedItems.Sack});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.Metadatacoin, 1, 5), new Object[]{ "###", " D ", Character.valueOf('#'), new ItemStack(IntegratedItems.Metadatacoin, 1, 4), Character.valueOf('D'), IntegratedItems.Bag});
		//Silver Coin Crafting
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.Metadatacoin, 2, 6), new Object[]{new ItemStack(IntegratedItems.moltensilver), new ItemStack(IntegratedItems.CoinMould,1, WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.Metadatacoin, 1, 7), new Object[]{ "###", "###", "###", Character.valueOf('#'), new ItemStack(IntegratedItems.Metadatacoin, 1, 6),});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.Metadatacoin, 1, 8), new Object[]{ "DDD", Character.valueOf('D'), new ItemStack(IntegratedItems.Metadatacoin, 1, 7)});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.Metadatacoin, 1, 9), new Object[]{ "###", "###", " D ", Character.valueOf('#'), new ItemStack(IntegratedItems.Metadatacoin, 1, 8), Character.valueOf('D'), IntegratedItems.Sack});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.Metadatacoin, 1, 10), new Object[]{ "###", " D ", Character.valueOf('#'), new ItemStack(IntegratedItems.Metadatacoin, 1, 9), Character.valueOf('D'), IntegratedItems.Bag});
		//Gold Coin Crafting
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.Metadatacoin, 2,11), new Object[]{new ItemStack(IntegratedItems.moltengold), new ItemStack(IntegratedItems.CoinMould,1, WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.Metadatacoin, 1, 12), new Object[]{ "###", "###", "###", Character.valueOf('#'), new ItemStack(IntegratedItems.Metadatacoin, 2,11),});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.Metadatacoin, 1, 13), new Object[]{ "DDD", Character.valueOf('D'), new ItemStack(IntegratedItems.Metadatacoin, 2,12),});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.Metadatacoin, 1, 14), new Object[]{ "###", "###", " D ", Character.valueOf('#'), new ItemStack(IntegratedItems.Metadatacoin, 2,13), Character.valueOf('D'), IntegratedItems.Sack});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.Metadatacoin, 1, 15), new Object[]{ "###", " D ", Character.valueOf('#'), new ItemStack(IntegratedItems.Metadatacoin, 2,14), Character.valueOf('D'), IntegratedItems.Bag});
	}

	public static void loadRCBB() 
	{
		//Empty Chest
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.bookcasemeta, 1, 0), new Object[]{"###", "XXX", "###", Character.valueOf('X'), Block.woodSingleSlab, Character.valueOf('#'), Block.planks});
		//Bookcase Chest
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.Bookcasechest, 1), new Object[]{"###", "BGB", "###", Character.valueOf('#'), Block.planks, Character.valueOf('G'), Block.chest, Character.valueOf('B'), Item.book});
		//Lever Bookcase
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.leverbookcase, 1), new Object[]{"###", "BGB", "###", Character.valueOf('#'), Block.planks, Character.valueOf('G'), Block.lever, Character.valueOf('B'), Item.book});
		//Bookcase Doors
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.WoodenBookcasedoor, 1), new Object[]{"## ", "## ", "## ", Character.valueOf('#'), Block.bookShelf});
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.IronBookcasedoor, 1), new Object[]{" # ", "III", Character.valueOf('#'), IntegratedItems.WoodenBookcasedoor, Character.valueOf('I'), Item.ingotIron});
		//Recipes that make Regular Bookcases
		GameRegistry.addRecipe(new ItemStack(Block.bookShelf, 1), new Object[]{"BBB", " # ", Character.valueOf('#'), new ItemStack(IntegratedBlocks.bookcasemeta, 1, 0), Character.valueOf('B'), Item.book});
		GameRegistry.addRecipe(new ItemStack(Block.bookShelf, 1), new Object[]{"#", Character.valueOf('#'), new ItemStack(IntegratedBlocks.bookcasemeta, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.bookcasemeta, 1, 0), new Object[]{"#", Character.valueOf('#'), new ItemStack(IntegratedBlocks.bookcasemeta, 1, 2)});
		//Scroll Shelf Recipe
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.bookcasemeta, 1, 3), new Object[]{"###", "BBB", "###", Character.valueOf('#'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 0), Character.valueOf('B'), IntegratedItems.scroll});
	}

	public static void loadRCC() 
	{
		//Other Stuff
		GameRegistry.addSmelting(Block.sponge.blockID, new ItemStack(IntegratedBlocks.newSponge), 0.1F); 
		GameRegistry.addSmelting(IntegratedBlocks.DarkSand.blockID, new ItemStack(Block.glass.blockID, 1, 0), 0.5F);
		//Stuff
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(IntegratedItems.ChainLoop,3,0), true, new Object[]{"X","Y", Character.valueOf('Y'), "ingotSuperheatediron", Character.valueOf('X'), new ItemStack(IntegratedItems.Hammer,1,WILDCARD_VALUE)}));
		GameRegistry.addRecipe(new ItemStack(IntegratedItems.Hammer, 1), new Object[]{"XXX", "XIX", " I ", Character.valueOf('I'), Item.stick, Character.valueOf('X'), Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.chainladder, 2), new Object[] {"Y", "Y", "Y", 'Y', IntegratedItems.ChainLoop});
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.ChainLoop, 2), new Object[]{IntegratedBlocks.chainladder,});
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.snowblock, 1), new Object[]{ "DD", "DD", Character.valueOf('D'), Block.ice});
		//DarkSand Clay
		GameRegistry.addShapelessRecipe(new ItemStack(IntegratedItems.SandStonePaste, 2, 0), IntegratedBlocks.DarkSand, Item.bucketWater);
		// Map/ship in a bottle recipe
		GameRegistry.addShapelessRecipe(new ItemStack(Item.map, 1), IntegratedItems.Mapinabottle);
		GameRegistry.addShapelessRecipe(new ItemStack(Item.boat, 1), IntegratedItems.Shipinabottle);
		//Multi Colored Sandstone Brick
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 4, 5), new Object[]{"XYX","YXY", "XYX", Character.valueOf('Y'), new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 3), Character.valueOf('X'), new ItemStack(IntegratedItems.SandStonePaste)});
		//SandStone Clay
		GameRegistry.addRecipe(new ItemStack(IntegratedBlocks.DesertBlockMulti, 1, 2), new Object[]  {"GG", "GG", Character.valueOf('G'), IntegratedItems.SandStonePaste});
	}
}
