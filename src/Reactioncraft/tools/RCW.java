package Reactioncraft.tools;

import java.io.File;
import net.minecraft.item.*;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.nbt.*;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.ShapedOreRecipe;
import Reactioncraft.tools.common.*;
import Reactioncraft.integration.*;
import Reactioncraft.basefiles.common.*;
import Reactioncraft.tools.common.CommonProxy;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod( modid = "rcw", name="Reactioncraft Weapons", version="[1.6.4] Reactioncraft 3 Version 1.1.4", dependencies="after:rcores")
@NetworkMod(channels = { "RCW" }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)

public class RCW
{
	@SidedProxy(clientSide = "Reactioncraft.tools.client.ClientProxy", serverSide = "Reactioncraft.tools.common.CommonProxy")

	public static CommonProxy proxy;

	@Instance("RCW")
	public static RCW instance;

	static EnumToolMaterial EnumToolMaterialObby = EnumHelper.addToolMaterial("Obby", 3, 2024, 7.0F, 2, 15);
	static EnumToolMaterial EnumToolMaterialBloodstone = EnumHelper.addToolMaterial("Bloodstone", 3, 4200, 7.0F, 2, 15);

	public int ObbyPickID;
	public int ObbySwordID;
	public int ObbyShovelID;
	public int ObbyAxeID;
	public int ObbyHoeID;
	public int BloodstonePickID;
	public int BloodstoneSwordID;
	public int BloodstoneShovelID;
	public int BloodstoneAxeID;
	public int BloodstoneHoeID;
	public int BloodstoneBladeIID;
	public int GoldenSwordFragmentIID;
	public int UnbindedSwordIID;

	public static Item ObbySword;
	public static Item ObbyPick;
	public static Item ObbyShovel;
	public static Item ObbyAxe;
	public static Item ObbyHoe;
	public static Item BloodstoneSword;
	public static Item BloodstonePick;
	public static Item BloodstoneShovel;
	public static Item BloodstoneAxe;
	public static Item BloodstoneHoe;
	public static Item BloodstoneBlade;
	public static Item GoldenSwordFragment;
	public static Item UnbindedSword;
	
//	public static boolean TreeCapitator() throws ClassNotFoundException 
//	{
//		try{
//			Class.forName("bspkrs.treecapitator.TreeCapitator");
//		}
//		catch (NoClassDefFoundError ex) 
//		{
//			return false ;
//		}
//		return true ;
//	}

	//Config
	public static ReactioncraftConfiguration config;

	@EventHandler
	public void preInit(FMLPreInitializationEvent var1)
	{
		System.out.println("[RCW] Pre Initialization Loaded");

		config = new ReactioncraftConfiguration(new File(var1.getModConfigurationDirectory(), "Reactioncraft/Weapons.cfg"));

		try 
		{
			config.load();

			//Claimed Item IDS 10931 - 10949 (10950 given to RCORES but not reoraginzed) (10951 is molten glass in RCG)
			this.ObbyPickID = config.getItem("Obsidian Pick", 10931).getInt();
			this.ObbySwordID = config.getItem("Obsidian Sword", 10932).getInt();
			this.ObbyShovelID = config.getItem("Obsidian Shovel", 10933).getInt();
			this.ObbyAxeID = config.getItem("Obsidian Axe", 10934).getInt();
			this.ObbyHoeID = config.getItem("Obsidian Hoe", 10935).getInt();

			this.BloodstonePickID = config.getItem("Bloodstone Pick", 10936).getInt();
			this.BloodstoneSwordID = config.getItem("Bloodstone Sword", 10937).getInt();
			this.BloodstoneShovelID = config.getItem("Bloodstone Shovel", 10938).getInt();
			this.BloodstoneAxeID = config.getItem("Bloodstone Axe", 10939).getInt();
			this.BloodstoneHoeID = config.getItem("Bloodstone Hoe", 10940).getInt();

			this.BloodstoneBladeIID = config.getItem("Bloodstone Blade", 10941).getInt();
			this.GoldenSwordFragmentIID = config.getItem("Golden Sword Fragment", 10942).getInt();
			this.UnbindedSwordIID = config.getItem("Unbinded Sword", 10943).getInt();

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
	public void init(FMLInitializationEvent var1)
	{
		proxy.registerRenderInformation();
		ItemCode();
		LanguageRegistry();
		forgestuff();
		//Integration();
	}

//	private void Integration() 
//	{
//				//Reactioncraft integration
//				try
//				{
//					if(TreeCapitator())
//					{
//						Integration.treecapitator();
//						System.out.println("Reactioncraft TreeCapitator integration loaded !");
//					}
//				}
//				catch (ClassNotFoundException e)
//				{
//					System.out.println("Reactioncraft Weapons did not find TreeCapitator Mod, Cherry Tree TreeCapitation Support disabled!");
//				}
//	}

	private void forgestuff() 
	{
		MinecraftForge.setToolClass(RCW.ObbyPick,    "pickaxe", 4); 
		MinecraftForge.setToolClass(RCW.ObbyShovel,  "shovel", 4);
		MinecraftForge.setToolClass(RCW.ObbyAxe,     "axe", 4);

		MinecraftForge.setToolClass(RCW.BloodstonePick,    "pickaxe", 5);
		MinecraftForge.setToolClass(RCW.BloodstoneShovel,  "shovel", 5);
		MinecraftForge.setToolClass(RCW.BloodstoneAxe,     "axe", 5);
	}

	private void LanguageRegistry() 
	{
		IntegratedLanguageFile.loadWeaponnames();
	}

	private void ItemCode() 
	{
		//Tool Parts
		BloodstoneBlade = (new ItemBasic(BloodstoneBladeIID)).setUnlocalizedName("rcw:BloodstoneBlade").setTextureName("rcw:BloodstoneBlade");
		GoldenSwordFragment = (new ItemBasic(GoldenSwordFragmentIID)).setUnlocalizedName("rcw:GoldenSwordFragment").setTextureName("rcw:GoldenSwordFragment");
		UnbindedSword = (new ItemBasic(UnbindedSwordIID)).setUnlocalizedName("rcw:BloodstoneSword").setTextureName("rcw:BloodstoneSword");

		//Obsidian
		ObbySword = (new BasicSword(this.ObbyPickID, EnumToolMaterialObby)).setUnlocalizedName("rcw:ObbySword").setTextureName("rcw:ObbySword");
		ObbyPick = (new BasicPick(this.ObbySwordID, EnumToolMaterialObby)).setUnlocalizedName("rcw:ObbyPick").setTextureName("rcw:ObbyPick");
		ObbyShovel = (new BasicShovel(this.ObbyShovelID, EnumToolMaterialObby)).setUnlocalizedName("rcw:ObbyShovel").setTextureName("rcw:ObbyShovel");
		ObbyAxe = (new BasicAxe(this.ObbyAxeID, EnumToolMaterialObby)).setUnlocalizedName("rcw:ObbyAxe").setTextureName("rcw:ObbyAxe");
		ObbyHoe = (new BasicHoe(this.ObbyHoeID, EnumToolMaterialObby)).setUnlocalizedName("rcw:ObbyHoe").setTextureName("rcw:ObbyHoe");

		//Bloodstone
		BloodstoneSword = (new BasicSword(this.BloodstonePickID, EnumToolMaterialBloodstone)).setUnlocalizedName("rcw:BloodstoneSword").setTextureName("rcw:BloodstoneSword");
		BloodstonePick = (new BasicPick(this.BloodstoneSwordID, EnumToolMaterialBloodstone)).setUnlocalizedName("rcw:BloodstonePick").setTextureName("rcw:BloodstonePick");
		BloodstoneShovel = (new BasicShovel(this.BloodstoneShovelID, EnumToolMaterialBloodstone)).setUnlocalizedName("rcw:BloodstoneShovel").setTextureName("rcw:BloodstoneShovel");
		BloodstoneAxe = (new BasicAxe(this.BloodstoneAxeID, EnumToolMaterialBloodstone)).setUnlocalizedName("rcw:BloodstoneAxe").setTextureName("rcw:BloodstoneAxe");
		BloodstoneHoe = (new BasicHoe(this.BloodstoneHoeID, EnumToolMaterialBloodstone)).setUnlocalizedName("rcw:BloodstoneHoe").setTextureName("rcw:BloodstoneHoe");
	}


	@EventHandler
	public static void postInit(FMLPostInitializationEvent var0) 
	{
		//Obsidian Tools
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ObbySword, true, new Object[]{"I", "I", "X", Character.valueOf('I'), "ingotObsidian", Character.valueOf('X'), "goldRod"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ObbyPick, true, new Object[]{"III", " X ", " X ", Character.valueOf('I'), "ingotObsidian", Character.valueOf('X'), "goldRod"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ObbyShovel, true, new Object[]{"I", "X", "X", Character.valueOf('I'), "ingotObsidian", Character.valueOf('X'), "goldRod"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ObbyAxe, true, new Object[]{"II ", "IX ", " X ", Character.valueOf('I'), "ingotObsidian", Character.valueOf('X'), "goldRod"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ObbyHoe, true, new Object[]{"II ", " X ", " X ", Character.valueOf('I'), "ingotObsidian", Character.valueOf('X'), "goldRod"}));


		//Bloodstone Tools
		GameRegistry.addRecipe(new ItemStack(UnbindedSword,1), new Object[]{"B", "F", Character.valueOf('B'), BloodstoneBlade, Character.valueOf('F'), GoldenSwordFragment});
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(BloodstoneBlade, true, new Object[]{"X", "X", "X", Character.valueOf('X'), "ingotBloodstone"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(GoldenSwordFragment, true, new Object[]{" I ", "XIX", " X ", Character.valueOf('I'), "gemDragonstone", Character.valueOf('X'), "goldRod"}));

		//Bloodstone Tools
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(BloodstonePick, true, new Object[]{"III", " X ", " X ", Character.valueOf('I'), "ingotBloodstone", Character.valueOf('X'), "goldRod"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(BloodstoneShovel, true, new Object[]{" I ", " X ", " X ", Character.valueOf('I'), "ingotBloodstone", Character.valueOf('X'), "goldRod"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(BloodstoneAxe, true, new Object[]{"II ", "IX ", " X ", Character.valueOf('I'), "ingotBloodstone", Character.valueOf('X'), "goldRod"}));
		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(BloodstoneHoe, true, new Object[]{"II ", " X ", " X ", Character.valueOf('I'), "ingotBloodstone", Character.valueOf('X'), "goldRod"}));

		GameRegistry.addSmelting(UnbindedSword.itemID, new ItemStack(BloodstoneSword.itemID, 1, 1), 0.5F);
		
		FMLLog.info("The Weapons are Epic!"); 
	}
}
