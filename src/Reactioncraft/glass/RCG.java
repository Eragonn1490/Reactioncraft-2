package Reactioncraft.glass;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.common.Property;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import Reactioncraft.basefiles.common.*;
import Reactioncraft.basemod.RCB;
import Reactioncraft.glass.client.ClientProxy;
import Reactioncraft.glass.common.*;
import Reactioncraft.integration.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod( modid = "rcg", name="Reactioncraft Glass", version="[1.6.2] Reactioncraft 3 Version 1.1.2", dependencies = "required-after:rcc")
@NetworkMod(channels = { "RCG" }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)

public class RCG
{
	@SidedProxy(clientSide = "Reactioncraft.glass.client.ClientProxy", serverSide = "Reactioncraft.glass.common.CommonProxy")

	public static CommonProxy proxy;

	@Instance("RCG")
	public static RCG instance;

	//config
	public static int moltenglassIID;
	public static int glassID;
	public static int glass2ID;
	//public static int glasspaneID;

	//Block Initilization
	public static Block GlassMulti;
	public static Block GlowingGlassMulti;
	//public static Block glasspane;

	//Item Initilization
	public static Item moltenglass;

	public static Property VanillaDyeGlassRecipes;
	public static Property OreDictionaryGlassRecipes;

	//Config
	public static ReactioncraftConfiguration config;

	public static boolean RCORES() throws ClassNotFoundException 
	{
		try{
			Class.forName("Reactioncraft.ore.RCORES");
		}
		catch (NoClassDefFoundError ex) 
		{
			return false ;
		}
		return true ;
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent evt)
	{
		System.out.println("[RCG] Pre Initialization Loaded");

		config = new ReactioncraftConfiguration(new File(evt.getModConfigurationDirectory(), "Reactioncraft/BetterGlass.cfg"));

		try 
		{
			config.load();		

			//Block IDs 3061 - 3064
			glassID = config.getBlock("Glass Meta", 3061).getInt();
			glass2ID = config.getBlock("Glowing Glass Meta", 3062).getInt();
			//glasspaneID = config.getBlock("Glass Pane Meta", 3062).getInt();

			//Item ID 10951
			moltenglassIID = config.getItem("Molten Glass", 10951).getInt();

			//Property Stuff Below
			VanillaDyeGlassRecipes = config.get("Recipes", "Vanilla Dye Glass Recipes", true);
			VanillaDyeGlassRecipes.comment= "Leave me as True! im used to ensure you can craft colored glass!";

			OreDictionaryGlassRecipes = config.get("Recipes", "Ore Dictionary Glass Recipes", true);
			OreDictionaryGlassRecipes.comment = "Leave me as True!, incase a mod adds custom items as dyes they can be used to make colored glass!";
		}

		finally 
		{
			if (config.hasChanged()) 
			{
				config.save();
			}
		}
	}


	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		ClientProxy.registerRenderInformation();

		blockCode();
		itemCode();
		blockRegistry();
		nameRegistry();
		recipeRegistry();
		integrationLoader();
	}


	private void integrationLoader() 
	{
		//RCORES integration
		try 
		{
			if(RCORES())
			{
				//Integration.loadReactioncraftGlass();  (not required for anything currently)
				System.out.println("Reactioncraft: Better Glass found [RCORES] loading integrated Recipes!");
			}
		}
		catch (ClassNotFoundException e)	
		{
			System.out.println("Reactioncraft: Better Glass, did not find [RCORES], integrated recipes's Disabled!");
		}	
	}

	public void itemCode() 
	{
		moltenglass = new ItemBasic(moltenglassIID).setUnlocalizedName("rcg:MG").setTextureName("rcg:MG").setCreativeTab(RCB.ReactioncraftItems);
	}


	public void recipeRegistry() 
	{
		GameRegistry.addSmelting(Block.glass.blockID, new ItemStack(RCG.moltenglass.itemID, 1, 0), 0.5F);

		if (RCG.VanillaDyeGlassRecipes.getBoolean(true))
		{
			//Stained Glass
			GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 1), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 1), RCG.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1), new Object[]     {
				new ItemStack(Item.dyePowder, 1, 11), RCG.moltenglass });
			GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 2), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 0), RCG.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 3), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 4), RCG.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 4), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 3), RCG.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 5), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 6), RCG.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 6), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 8), RCG.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 7), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 2), RCG.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 8), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 12), RCG.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 9), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 7), RCG.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 10), new Object[] {
				new ItemStack(Item.dyePowder, 1, 10), RCG.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 11), new Object[] {
				new ItemStack(Item.dyePowder, 1, 13), RCG.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 12), new Object[] {
				new ItemStack(Item.dyePowder, 1, 14), RCG.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 13), new Object[] {
				new ItemStack(Item.dyePowder, 1, 9), RCG.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 14), new Object[] {
				new ItemStack(Item.dyePowder, 1, 5), RCG.moltenglass});
			GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 15), new Object[] {
				new ItemStack(Item.dyePowder, 1, 15), RCG.moltenglass});

			//Glowing Glass
			GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 1), new Object[]  {
				RCG.moltenglass, Item.glowstone, new ItemStack(Item.dyePowder, 1, 1)});
			GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1), new Object[]     {
				RCG.moltenglass, Item.glowstone, new ItemStack(Item.dyePowder, 1, 11)});
			GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 2), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 0), RCG.moltenglass, Item.glowstone });
			GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 3), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 4), RCG.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 4), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 3), RCG.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 5), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 6), RCG.moltenglass, Item.glowstone });
			GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 6), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 8), RCG.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 7), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 2), RCG.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 8), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 12), RCG.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 9), new Object[]  {
				new ItemStack(Item.dyePowder, 1, 7), RCG.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 10), new Object[] {
				new ItemStack(Item.dyePowder, 1, 10), RCG.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 11), new Object[] {
				new ItemStack(Item.dyePowder, 1, 13), RCG.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 12), new Object[] {
				new ItemStack(Item.dyePowder, 1, 14), RCG.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 13), new Object[] {
				new ItemStack(Item.dyePowder, 1, 9), RCG.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 14), new Object[] {
				new ItemStack(Item.dyePowder, 1, 5), RCG.moltenglass, Item.glowstone});
			GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 15), new Object[] {
				new ItemStack(Item.dyePowder, 1, 15), RCG.moltenglass, Item.glowstone});
		}

		if (RCG.OreDictionaryGlassRecipes.getBoolean(true))
		{	
			//Regular Glass
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlassMulti, 1, 2), new Object[]{"dyeBlack", RCG.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlassMulti, 1, 1), new Object[]{"dyeRed", RCG.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlassMulti, 1, 7), new Object[]{"dyeGreen", RCG.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlassMulti, 1, 4), new Object[]{"dyeBrown", RCG.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlassMulti, 1, 3), new Object[]{"dyeBlue", RCG.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlassMulti, 1, 14), new Object[]{"dyePurple", RCG.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlassMulti, 1, 5), new Object[]{"dyeCyan", RCG.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlassMulti, 1, 9), new Object[]{"dyeLightGray", RCG.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlassMulti, 1, 6), new Object[]{"dyeGray", RCG.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlassMulti, 1, 13), new Object[]{"dyePink", RCG.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlassMulti, 1, 10), new Object[]{"dyeLime", RCG.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlassMulti, 1, 0), new Object[]{"dyeYellow", RCG.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlassMulti, 1, 8), new Object[]{"dyeLightBlue", RCG.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlassMulti, 1, 11), new Object[]{"dyeMagenta", RCG.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlassMulti, 1, 12), new Object[]{"dyeOrange", RCG.moltenglass}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlassMulti, 1, 15), new Object[]{"dyeWhite", RCG.moltenglass}));

			//Glowing Glass
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlowingGlassMulti, 1, 2), new Object[]{"dyeBlack", RCG.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlowingGlassMulti, 1, 1), new Object[]{"dyeRed", RCG.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlowingGlassMulti, 1, 7), new Object[]{"dyeGreen", RCG.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlowingGlassMulti, 1, 4), new Object[]{"dyeBrown", RCG.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlowingGlassMulti, 1, 3), new Object[]{"dyeBlue", RCG.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlowingGlassMulti, 1, 14), new Object[]{"dyePurple", RCG.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlowingGlassMulti, 1, 5), new Object[]{"dyeCyan", RCG.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlowingGlassMulti, 1, 9), new Object[]{"dyeLightGray", RCG.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlowingGlassMulti, 1, 6), new Object[]{"dyeGray", RCG.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlowingGlassMulti, 1, 13), new Object[]{"dyePink", RCG.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlowingGlassMulti, 1, 10), new Object[]{"dyeLime", RCG.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlowingGlassMulti, 1, 0), new Object[]{"dyeYellow", RCG.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlowingGlassMulti, 1, 8), new Object[]{"dyeLightBlue", RCG.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlowingGlassMulti, 1, 11), new Object[]{"dyeMagenta", RCG.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlowingGlassMulti, 1, 12), new Object[]{"dyeOrange", RCG.moltenglass, Item.glowstone}));
			CraftingManager.getInstance().getRecipeList().add(new ShapelessOreRecipe(new ItemStack(RCG.GlowingGlassMulti, 1, 15), new Object[]{"dyeWhite", RCG.moltenglass, Item.glowstone}));
		}
	}

	public void nameRegistry() 
	{
		IntegratedLanguageFile.loadGlassnames();
	}


	public void blockRegistry() 
	{
		GameRegistry.registerBlock(GlassMulti, ItemMulti.class, "GlassMulti");
		GameRegistry.registerBlock(GlowingGlassMulti, ItemMulti.class, "GlowingGlassMulti");
		//GameRegistry.registerBlock(glasspane, ItemMulti.class, "glasspane");
	}


	public void blockCode() 
	{
		GlassMulti = new BlockGlassMulti(glassID, Material.glass).setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		GlowingGlassMulti = new BlockGlowingGlassMulti(glass2ID, Material.glass).setLightValue(1.0F).setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
		//glasspane = new BlockGlassPaneMulti(glasspaneID, Material.glass).setHardness(0.3F).setUnlocalizedName("GlassMulti");
	}


	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent evt)
	{

	} 
}
