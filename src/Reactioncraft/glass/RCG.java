package Reactioncraft.glass;

import java.io.File;
import Reactioncraft.glass.client.ClientProxy;
import Reactioncraft.glass.common.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import Reactioncraft.basefiles.common.*;
import Reactioncraft.basemod.RCB;

@Mod( modid = "RCG", name="Reactioncraft Glass", version="[1.5.2] Reactioncraft Version 8.0")
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

	//Config
	public static ReactioncraftConfiguration config;

	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		System.out.println("Pre Initialization Loaded");
		
		config = new ReactioncraftConfiguration(new File(evt.getModConfigurationDirectory(), "Reactioncraft/BetterGlass.cfg"));

		try 
		{
			config.load();		

			//Block IDs 3061 - 3065
			glassID = config.getBlock("Glass Meta", 3061).getInt();
			glass2ID = config.getBlock("Glowing Glass Meta", 3062).getInt();
			//glasspaneID = config.getBlock("Glass Pane Meta", 3062).getInt();

			//Item ID 10951
			moltenglassIID = config.getItem("Molten Glass", 10951).getInt();
		}

		finally 
		{
			if (config.hasChanged()) 
			{
				config.save();
			}
		}
	}


	@Init
	public void load(FMLInitializationEvent event)
	{
		ClientProxy.registerRenderInformation();

		blockCode();
		itemCode();
		blockRegistry();
		nameRegistry();
		recipeRegistry();
	}


	public void itemCode() 
	{
		moltenglass = new ItemBasic(moltenglassIID).setUnlocalizedName("RCG:MG").setCreativeTab(RCB.ReactioncraftItems);
	}


	public void recipeRegistry() 
	{
		GameRegistry.addSmelting(Block.glass.blockID, new ItemStack(RCG.moltenglass.itemID, 1, 1), 0.5F);

		//Stained Glass
		GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 1), new Object[]  {
			RCG.moltenglass, new ItemStack(Item.dyePowder, 1, 1)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1), new Object[]     {
			RCG.moltenglass, new ItemStack(Item.dyePowder, 1, 11)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 2), new Object[]  {
			new ItemStack(Item.dyePowder, 1, 0), RCG.moltenglass
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 3), new Object[]  {
			new ItemStack(Item.dyePowder, 1, 4), RCG.moltenglass
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 4), new Object[]  {
			new ItemStack(Item.dyePowder, 1, 3), RCG.moltenglass
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 5), new Object[]  {
			new ItemStack(Item.dyePowder, 1, 6), RCG.moltenglass
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 6), new Object[]  {
			new ItemStack(Item.dyePowder, 1, 8), RCG.moltenglass
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 7), new Object[]  {
			new ItemStack(Item.dyePowder, 1, 2), RCG.moltenglass
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 8), new Object[]  {
			new ItemStack(Item.dyePowder, 1, 12), RCG.moltenglass
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 9), new Object[]  {
			new ItemStack(Item.dyePowder, 1, 7), RCG.moltenglass
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 10), new Object[] {
			new ItemStack(Item.dyePowder, 1, 10), RCG.moltenglass
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 11), new Object[] {
			new ItemStack(Item.dyePowder, 1, 13), RCG.moltenglass
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 12), new Object[] {
			new ItemStack(Item.dyePowder, 1, 14), RCG.moltenglass
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 13), new Object[] {
			new ItemStack(Item.dyePowder, 1, 9), RCG.moltenglass
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 14), new Object[] {
			new ItemStack(Item.dyePowder, 1, 5), RCG.moltenglass
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlassMulti, 1, 15), new Object[] {
			new ItemStack(Item.dyePowder, 1, 15), RCG.moltenglass
		});

		//Glowing Glass
		GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 1), new Object[]  {
			RCG.moltenglass, Item.lightStoneDust, new ItemStack(Item.dyePowder, 1, 1)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1), new Object[]     {
			RCG.moltenglass, Item.lightStoneDust, new ItemStack(Item.dyePowder, 1, 11)
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 2), new Object[]  {
			new ItemStack(Item.dyePowder, 1, 0), RCG.moltenglass, Item.lightStoneDust 
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 3), new Object[]  {
			new ItemStack(Item.dyePowder, 1, 4), RCG.moltenglass, Item.lightStoneDust
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 4), new Object[]  {
			new ItemStack(Item.dyePowder, 1, 3), RCG.moltenglass, Item.lightStoneDust
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 5), new Object[]  {
			new ItemStack(Item.dyePowder, 1, 6), RCG.moltenglass, Item.lightStoneDust 
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 6), new Object[]  {
			new ItemStack(Item.dyePowder, 1, 8), RCG.moltenglass, Item.lightStoneDust
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 7), new Object[]  {
			new ItemStack(Item.dyePowder, 1, 2), RCG.moltenglass, Item.lightStoneDust
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 8), new Object[]  {
			new ItemStack(Item.dyePowder, 1, 12), RCG.moltenglass, Item.lightStoneDust
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 9), new Object[]  {
			new ItemStack(Item.dyePowder, 1, 7), RCG.moltenglass, Item.lightStoneDust
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 10), new Object[] {
			new ItemStack(Item.dyePowder, 1, 10), RCG.moltenglass, Item.lightStoneDust
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 11), new Object[] {
			new ItemStack(Item.dyePowder, 1, 13), RCG.moltenglass, Item.lightStoneDust
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 12), new Object[] {
			new ItemStack(Item.dyePowder, 1, 14), RCG.moltenglass, Item.lightStoneDust
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 13), new Object[] {
			new ItemStack(Item.dyePowder, 1, 9), RCG.moltenglass, Item.lightStoneDust
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 14), new Object[] {
			new ItemStack(Item.dyePowder, 1, 5), RCG.moltenglass, Item.lightStoneDust
		});
		GameRegistry.addShapelessRecipe(new ItemStack(GlowingGlassMulti, 1, 15), new Object[] {
			new ItemStack(Item.dyePowder, 1, 15), RCG.moltenglass, Item.lightStoneDust
		});

	}


	public void nameRegistry() 
	{
		LanguageRegistry.addName(new ItemStack(GlassMulti, 1), "Yellow StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlassMulti, 1, 1), "Red StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlassMulti, 1, 2), "Black StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlassMulti, 1, 3), "Blue StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlassMulti, 1, 4), "Brown StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlassMulti, 1, 5), "Cyan StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlassMulti, 1, 6), "Gray StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlassMulti, 1, 7), "Green StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlassMulti, 1, 8), "Lightblue StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlassMulti, 1, 9), "Lightgray StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlassMulti, 1, 10), "Limegreen StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlassMulti, 1, 11), "Magenta StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlassMulti, 1, 12), "Orange StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlassMulti, 1, 13), "Pink StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlassMulti, 1, 14), "Purple StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlassMulti, 1, 15), "White StainedGlass");

		//Glowing Glass Blocks
		LanguageRegistry.addName(new ItemStack(GlowingGlassMulti, 1, 0),  "Glowing Yellow StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlowingGlassMulti, 1, 1),  "Glowing Red StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlowingGlassMulti, 1, 2),  "Glowing Black StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlowingGlassMulti, 1, 3),  "Glowing Blue StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlowingGlassMulti, 1, 4),  "Glowing Brown StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlowingGlassMulti, 1, 5),  "Glowing Cyan StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlowingGlassMulti, 1, 6),  "Glowing Gray StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlowingGlassMulti, 1, 7),  "Glowing Green StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlowingGlassMulti, 1, 8),  "Glowing Lightblue StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlowingGlassMulti, 1, 9),  "Glowing Lightgray StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlowingGlassMulti, 1, 10), "Glowing Limegreen StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlowingGlassMulti, 1, 11), "Glowing Magenta StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlowingGlassMulti, 1, 12), "Glowing Orange StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlowingGlassMulti, 1, 13), "Glowing Pink StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlowingGlassMulti, 1, 14), "Glowing Purple StainedGlass");
		LanguageRegistry.addName(new ItemStack(GlowingGlassMulti, 1, 15), "Glowing White StainedGlass");

		LanguageRegistry.addName(moltenglass, "Molten Glass");
	}


	public void blockRegistry() 
	{
		GameRegistry.registerBlock(GlassMulti, ItemMulti.class);
		GameRegistry.registerBlock(GlowingGlassMulti, ItemMulti.class);
		//GameRegistry.registerBlock(glasspane, ItemMulti.class);
	}


	public void blockCode() 
	{
		GlassMulti = new BlockGlassMulti(glassID, Material.glass).setHardness(0.3F);
		GlowingGlassMulti = new BlockGlowingGlassMulti(glass2ID, Material.glass).setLightValue(1.0F).setHardness(0.3F);
		//glasspane = new BlockGlassPaneMulti(glasspaneID, Material.glass).setHardness(0.3F).setUnlocalizedName("GlassMulti");
	}


	@PostInit
	public void modsLoaded(FMLPostInitializationEvent evt)
	{

	} 
}
