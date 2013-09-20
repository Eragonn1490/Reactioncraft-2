package Reactioncraft.integration;

import com.mrcrayfish.furnitureapi.FreezerRecipesAPI;
import com.mrcrayfish.furnitureapi.OvenRecipesAPI;
import Reactioncraft.desert.RCBDM;
import ic2.api.*;
import ic2.api.item.Items;
import ic2.api.recipe.IMachineRecipeManager;
import ic2.api.recipe.IRecipeInput;
import ic2.api.recipe.RecipeInputOreDict;
import ic2.api.recipe.Recipes;
import Reactioncraft.api.common.BrickOvenRecipes;
import Reactioncraft.api.common.ClayalizerRecipes;
import Reactioncraft.bookcase.RCBB;
import Reactioncraft.core.RCC;
import Reactioncraft.food.RCF;
import Reactioncraft.glass.RCG;
import Reactioncraft.ore.RCORES;
import Reactioncraft.tools.RCW;
import Reactioncraft.machines.RCMM;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.registry.GameRegistry;
import mods.railcraft.api.crafting.RailcraftCraftingManager;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.liquids.LiquidContainerRegistry;
import net.minecraftforge.liquids.LiquidDictionary;
import net.minecraftforge.liquids.LiquidStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Integration 
{	
	public static final int WILDCARD_VALUE = Short.MAX_VALUE;

	public static void loadRailCraft()
	{
		if(RCC.hardcorerailcraft.getBoolean(true))
		{
			GameRegistry.addRecipe(new ItemStack(Block.rail, 6), new Object[] {"X X", "X#X", "X X", 'X', Item.ingotIron, '#', Item.stick});
		}
	}
	
	public static void loadBlastFurnace()
	{
		ItemStack LavaBucket = new ItemStack(Item.bucketLava);
		ItemStack ObsidianBucket = new ItemStack(RCMM.ObsidianBucket);

		RailcraftCraftingManager.blastFurnace.addRecipe(ObsidianBucket, true, true, 2000, LavaBucket);
	}

	public static void loadReactioncraftBookcases() 
	{
		if(Loader.isModLoaded("rcbdm"))
		{
			CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(RCBB.bookcasemeta, 1, 3), true, new Object[]{"XXX", "###", "XXX", Character.valueOf('X'), "carveddarkstone", Character.valueOf('#'), "scroll"}));
			//GameRegistry.addRecipe(new ItemStack(RCBB.bookcasemeta, 1, 3), new Object[]{"###", "BBB", "###", Character.valueOf('#'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('B'), RCBDM.scroll});
		}
	}
	public static void loadDesertMachines() 
	{
		if(Loader.isModLoaded("rcbdm"))
		{
			CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(RCMM.BrickOvenIdle, 1), true, new Object[]{"XXX", "X X", "XXX", Character.valueOf('X'), "darkstonebrick"}));
			CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(RCMM.ClayalizerIdle, 1), true, new Object[]{"XXX", "XGX", "XXX", Character.valueOf('X'), "darkstonebrick", Character.valueOf('G'), Block.glass}));			
			//GameRegistry.addRecipe(new ItemStack(RCMM.BrickOvenIdle, 1), new Object[]{"XXX","X X", "XXX", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 3)});
			//GameRegistry.addRecipe(new ItemStack(RCMM.ClayalizerIdle, 1), new Object[]{"XXX","XGX", "XXX", Character.valueOf('G'), Block.glass, Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 3)});
		}
	}

	public static void loadCoreGeneration() 
	{
		BrickOvenRecipes.smelting().addSmelting(RCC.SandStonePaste.itemID, new ItemStack(RCBDM.DesertBlockMulti, 2, 2), 0.2F);
		ClayalizerRecipes.smelting().addSmelting(RCC.DarkSand.blockID, new ItemStack(RCC.SandStonePaste, 4), 0.1F);

		//Multi Colored Sandstone Brick
		GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 4, 5), new Object[]{"XYX","YXY", "XYX", Character.valueOf('Y'), new ItemStack(RCBDM.DesertBlockMulti, 1, 3), Character.valueOf('X'), new ItemStack(RCC.SandStonePaste)});

		//SandStone Clay
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
		Recipes.macerator.addRecipe(new RecipeInputOreDict("oreBloodstone", 1), null, new ItemStack[] { new ItemStack(RCORES.bloodstonedust, 4)});

		//Black Diamond Ore to Black Diamond
		Recipes.macerator.addRecipe(new RecipeInputOreDict("oreNetherBlackDiamond", 1), null, new ItemStack[] { new ItemStack(RCORES.blackdiamond, 1)});

		//Dragonstone to Dragonstone Shard
		Recipes.macerator.addRecipe(new RecipeInputOreDict("oreNetherDragonstone", 1), null, new ItemStack[] { new ItemStack(RCORES.dragonstoneshard, 1)});

		//Nether Diamond to Diamond
		Recipes.macerator.addRecipe(new RecipeInputOreDict("oreNetherDiamondOre", 1), null, new ItemStack[] { new ItemStack(Item.diamond, 2)});

		//Nether Gold to Gold Dust
		Recipes.macerator.addRecipe(new RecipeInputOreDict("oreNetherGoldOre", 1), null, new ItemStack[] { new ItemStack(RCORES.goldDust, 2)}); 
		GameRegistry.addSmelting(RCORES.goldDust.itemID, new ItemStack(Item.ingotGold.itemID, 1, 0), 0.1F);
		
		if(Loader.isModLoaded("rcc"))
		{
			ItemStack resin1 = Items.getItem("resin");
			
			if(RCC.hardcoreIC2.getBoolean(true))
			{
				Recipes.macerator.addRecipe(new RecipeInputOreDict("woodRubber", 1), null, new ItemStack[] { new ItemStack(resin1.itemID, 2, 0)}); 
			}
		}
	}

//	public static void treecapitator()
//	{
//		//TreeCapitator
//		if (Loader.isModLoaded("TreeCapitator"))
//		{
//			NBTTagCompound tpModCfg = new NBTTagCompound();
//			tpModCfg.setString("modID", "Natura");
//			tpModCfg.setString("axeIDList", String.format("%d; %d; %d; %d; %d", RCW.BloodstoneAxe.itemID, RCW.ObbyAxe.itemID));
//			tpModCfg.setBoolean("useShiftedItemID", false);
//
//			NBTTagList treeList = new NBTTagList();
//
//			// CherryTree
//			NBTTagCompound treeDef = new NBTTagCompound();
//			treeDef.setString("treeName", "cherry tree");
//			treeDef.setString("logs", String.format("%d,2; %d,6; %d,10", RCBDM.Cherrywood.blockID));
//			treeDef.setString("leaves", String.format("%d,2; %d,10", RCBDM.CherryTreeLeaves.blockID));
//
//			tpModCfg.setTag("trees", treeList);
//
//			FMLInterModComms.sendMessage("TreeCapitator", "ThirdPartyModConfig", tpModCfg);
//		}
//	}

public static void loadReactioncraftBDM() 
{
	//CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCORES.gemdragonstone, 1), new Object[]{RCORES.dragonstoneshard, "chisel"}));
	GameRegistry.addShapelessRecipe(new ItemStack(RCORES.gemdragonstone, 1,0), new Object[]{new ItemStack(RCORES.dragonstoneshard,1,0),new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addShapelessRecipe(new ItemStack(RCORES.gemdragonstone, 1,0), new Object[]{new ItemStack(RCORES.dragonstoneshard,1,0),new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addShapelessRecipe(new ItemStack(RCORES.gemdragonstone, 1,0), new Object[]{new ItemStack(RCORES.dragonstoneshard,1,0),new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addShapelessRecipe(new ItemStack(RCORES.gemdragonstone, 1,0), new Object[]{new ItemStack(RCORES.dragonstoneshard,1,0),new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addShapelessRecipe(new ItemStack(RCORES.gemdragonstone, 1,0), new Object[]{new ItemStack(RCORES.dragonstoneshard,1,0),new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
}

public static void loadDesertRecipes() 
{
	//Cherry Tree Planks
	CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCBDM.CherryPlanks, 4, 0), new Object[]{"CherryWood"}));

	//Darkstone
	CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 2), new Object[]{"darkclay", "darkclay", "darkclay", "darkclay"}));

	//Mossy Dark Stone Brick Recipe
	//GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 11), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 4), Character.valueOf('Y'), new ItemStack(Block.vine)});
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 11), new ItemStack(RCBDM.DesertBlockMulti, 1, 4), Block.vine);

	//Limestone to Chiseled Limestone
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 7), new ItemStack(RCBDM.DesertBlockMulti, 1, 6), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE));
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 7), new ItemStack(RCBDM.DesertBlockMulti, 1, 6), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE));
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 7), new ItemStack(RCBDM.DesertBlockMulti, 1, 6), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE));
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 7), new ItemStack(RCBDM.DesertBlockMulti, 1, 6), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE));
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 7), new ItemStack(RCBDM.DesertBlockMulti, 1, 6), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE));

	/**Bloodstone brick recipe**/
	CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCBDM.BloodstoneBrick, 4, 0), new Object[]{"oreBloodstone", "oreBloodstone", "oreBloodstone", "oreBloodstone"}));

	/**Chisels Cutting the Gems into Cut form.**/
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutLBGem,1,0), new Object[]{RCBDM.CutLBGem, new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutLBGem,1,0), new Object[]{RCBDM.CutLBGem, new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutLBGem,1,0), new Object[]{RCBDM.CutLBGem, new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutLBGem,1,0), new Object[]{RCBDM.CutLBGem, new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutLBGem,1,0), new Object[]{RCBDM.CutLBGem, new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutDBGem,1,0), RCBDM.CutDBGem, new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE));
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutDBGem,1,0), RCBDM.CutDBGem, new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE));
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutDBGem,1,0), RCBDM.CutDBGem, new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE));
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutDBGem,1,0), RCBDM.CutDBGem, new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE));
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.CutDBGem,1,0), RCBDM.CutDBGem, new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE));

	//Chisels Cutting Columns

	//Dark Sandstone Column
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 0), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 0), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 0), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 0), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 0), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

	//stone Column
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 3), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stone, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 3), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stone, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 3), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stone, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 3), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stone, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 3), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stone, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

	//Cobblestone Column
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 4), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.cobblestone, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 4), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.cobblestone, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 4), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.cobblestone, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 4), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.cobblestone, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 4), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.cobblestone, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});


	//Gold Column
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 5), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.blockGold, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 5), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.blockGold, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 5), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.blockGold, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

	//Diamond Column
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 6), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.blockDiamond, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 6), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.blockDiamond, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

	//Stone Brick Column
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 7), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stoneBrick, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 7), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stoneBrick, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 7), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stoneBrick, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 7), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stoneBrick, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 7), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), Block.stoneBrick, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

	//Limestone Column
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 8), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 8), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 8), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 8), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 8), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

	//Bloodstone Column
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti, 3, 2), new Object[]{"X  ","XY ", "X  ", Character.valueOf('X'), RCBDM.BloodstoneBrick, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

	//Skinny Columns
	//Dark Sandstone Column
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

	//stone Column
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 3), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 3), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 3), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 3), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 3), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 3), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

	//Cobblestone Column
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 4), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 4), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 4), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 4), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 4), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});


	//Gold Column
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 5), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 5), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 5), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 5), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 5), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 5), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

	//Diamond Column
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 6), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 6), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 6), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 6), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

	//Stone Brick Column
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 7), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 7), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 7), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 7), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 7), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 7), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

	//Limestone Column
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 8), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 8), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 8), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 8), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 8), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 8), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 8), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 8), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 8), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 8), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

	//Bloodstone Column
	GameRegistry.addRecipe(new ItemStack(RCBDM.ColumnMulti2, 2, 2), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.ColumnMulti, 1, 2), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});


	//Carved Dark Sandstone
	GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 2), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 2), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 2), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 2), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 0), new Object[]{"XY", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 2), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

	//Cracked Dark Sandstone to Carved Dark Sandstone
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 0), new ItemStack(RCBDM.DesertBlockMulti, 1, 1), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE));
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 0), new ItemStack(RCBDM.DesertBlockMulti, 1, 1), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE));
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 0), new ItemStack(RCBDM.DesertBlockMulti, 1, 1), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE));
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 0), new ItemStack(RCBDM.DesertBlockMulti, 1, 1), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE));
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 0), new ItemStack(RCBDM.DesertBlockMulti, 1, 1), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE));

	//Dark Sandstone Brick
	GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 3), new Object[]{"XX","XX", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0)});

	/**
		        LanguageRegistry.addName(new ItemStack(RCBDM.ColumnMulti, 1, 1), "Marble Column");
	 **/


	//Cracked Darkstone Brick to Darkstone Brick
	GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 4), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

	//Mossy Darkstone Brick to Darkstone Brick
	GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 11), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 11), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 11), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 11), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 3), new Object[]{"Y","X", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 11), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});


	//Weather Hireoglyphics to Carved Dark Stone
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 0), new ItemStack(RCBDM.HireoMulti, 1, 11), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE));
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 0), new ItemStack(RCBDM.HireoMulti, 1, 11), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE));
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 0), new ItemStack(RCBDM.HireoMulti, 1, 11), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE));
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 0), new ItemStack(RCBDM.HireoMulti, 1, 11), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE));
	GameRegistry.addShapelessRecipe(new ItemStack(RCBDM.DesertBlockMulti, 1, 0), new ItemStack(RCBDM.HireoMulti, 1, 11), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE));


	/** Regular Hireoglyphics **/
	//Flint Chisel
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 0), new Object[]{"YYY", " X ", "   ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 1), new Object[]{"YYY", "YX ", "   ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 2), new Object[]{"YYY", "YXY", "   ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	//Copper Chisel
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 0), new Object[]{"YYY", " X ", "   ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 1), new Object[]{"YYY", "YX ", "   ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 2), new Object[]{"YYY", "YXY", "   ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	//Gold Chisel
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 0), new Object[]{"YYY", " X ", "   ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 1), new Object[]{"YYY", "YX ", "   ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 2), new Object[]{"YYY", "YXY", "   ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	//Diamond Chisel
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 0), new Object[]{"YYY", " X ", "   ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 1), new Object[]{"YYY", "YX ", "   ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 2), new Object[]{"YYY", "YXY", "   ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	//Bloodstone Chisel
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 0), new Object[]{"YYY", " X ", "   ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 1), new Object[]{"YYY", "YX ", "   ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 2), new Object[]{"YYY", "YXY", "   ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

	/** Lightblue Hireoglyphics **/
	//Flint
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 3), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 4), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 5), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	//Copper
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 3), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 4), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 5), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	//Gold
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 3), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 4), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 5), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	//Diamond Based Lightblue Hireoglyphics
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 3), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 4), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 5), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	//Bloodstone Based Lightblue Hireoglyphics
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 3), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 4), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 5), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutLBGem, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

	/** Darkblue Hireoglyphics **/
	//Flint
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 6), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 7), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 8), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	//Copper 
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 6), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 7), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 8), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	//Gold
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 6), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 7), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 8), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	//Diamond
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 6), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 7), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 8), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	//Bloodstone Based Darkblue Hireoglyphics
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 6), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 7), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 8), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), RCBDM.CutDBGem, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});

	/** Gold Hireoglyphics **/
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 13), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 14), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 15), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.FlintChisel,1,WILDCARD_VALUE)});
	//Copper Based DarkBlue Hireoglyphics
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 13), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 14), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 15), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.CopperChisel,1,WILDCARD_VALUE)});
	//gold Based Darkblue Hireoglyphics
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 13), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 14), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 15), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.GoldChisel,1,WILDCARD_VALUE)});
	//Diamond Based Darkblue Hireoglyphics
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 13), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 14), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 15), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.DiamondChisel,1,WILDCARD_VALUE)});
	//Bloodstone Based Darkblue Hireoglyphics
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 13), new Object[]{"YYY", " X ", " @ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 14), new Object[]{"YYY", "YX ", "Y@ ", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
	GameRegistry.addRecipe(new ItemStack(RCBDM.HireoMulti, 1, 15), new Object[]{"YYY", "YXY", "Y@Y", Character.valueOf('X'), new ItemStack(RCBDM.DesertBlockMulti, 1, 0), Character.valueOf('@'), Item.ingotGold, Character.valueOf('Y'), new ItemStack(RCBDM.BloodstoneChisel,1,WILDCARD_VALUE)});
	FMLLog.info("Better Desert Recipes Loaded");
}

public static void loadReactioncraftGlass() 
{
	//Nothing Valid Goes Here
}
}
