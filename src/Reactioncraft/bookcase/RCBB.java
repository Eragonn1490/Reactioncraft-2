package Reactioncraft.bookcase;

import Reactioncraft.bookcase.client.ClientProxy;
import Reactioncraft.bookcase.common.CommonProxy;
import java.io.File;
import Reactioncraft.Integration.Integration;
import Reactioncraft.basefiles.common.ItemMulti;
import Reactioncraft.basefiles.common.ReactioncraftConfiguration;
import Reactioncraft.basemod.RCB;
import Reactioncraft.bookcase.common.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEnchantmentTable;
import net.minecraft.block.BlockLever;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Property;
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


@Mod( modid = "RCBB", name="Reactioncraft Better Bookcases Mod", version="[1.5.2] Reactioncraft Version 8.1", dependencies="after:RCBDM")
@NetworkMod(channels = { "RCBB" }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)

public class RCBB
{
	@SidedProxy(clientSide = "Reactioncraft.bookcase.client.ClientProxy", serverSide = "Reactioncraft.bookcase.common.CommonProxy")

	public static CommonProxy proxy;

	@Instance("RCBB")
	public static RCBB instance;

	//Config Code
	public static int bookcasemetaID;
	public static int BookcasechestID;
	public static int leverbookcaseID;
	public static int WoodenBookcasedoorBlockID;
	public static int IronBookcasedoorBlockID;
	public static int WoodenBookcasedoorIID;
	public static int IronBookcasedoorIID;

	//Block Code
	public static Block bookcasemeta;
	public static Block Bookcasechest;
	public static Block WoodenBookcasedoorBlock;
	public static Block IronBookcasedoorBlock;
	public static Block leverbookcase;

	//Item Code
	public static Item WoodenBookcasedoor;
	public static Item IronBookcasedoor;
	
	public static Property vanillaOverrideBookcase;

	public static RCBB instance()
	{
		return instance;
	}

	public static boolean RCBDM() throws ClassNotFoundException 
	{
		try{
			Class.forName("Reactioncraft.Desert.RCBDM");
		}
		catch (NoClassDefFoundError ex) 
		{
			return false ;
		}
		return true ;
	}
	
	//Config
	public static ReactioncraftConfiguration config;

	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{	
		System.out.println("Pre Initialization Loaded");
		
		config = new ReactioncraftConfiguration(new File(evt.getModConfigurationDirectory(), "Reactioncraft/BetterBookcases.cfg"));
		
		try 
		{
			config.load();

			//Blocks 3000 - 3007
			bookcasemetaID = config.getBlock("Metadata BookShelfs", 3000).getInt();
			BookcasechestID = config.getBlock("BookShelf Chest", 3001).getInt();
			WoodenBookcasedoorBlockID = config.getBlock("Wooden BookShelf Door", 3002).getInt();
			IronBookcasedoorBlockID = config.getBlock("Iron BookShelf Door", 3003).getInt();
			leverbookcaseID = config.getBlock("leverbookcase", 3004).getInt();

			//Items 10001 - 10040
			WoodenBookcasedoorIID = config.getItem("Wooden Bookcase Door", 10001).getInt();
			IronBookcasedoorIID = config.getItem("Iron Bookcase Door", 10002).getInt();

			MinecraftForge.EVENT_BUS.register(this);
			
			vanillaOverrideBookcase = config.get("Vanilla Overrides", "Override Enchantment Table", true);
			vanillaOverrideBookcase.comment = "If this is true Vanilla Enchantment Table is slightly overwritten";
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
		instance = this;
		Overrides();
		ClientProxy.registerRenderInformation();

		blocks();
		items();
		recipes();
		fuelHandler();
		tileentities();
		blockRegistry();
		worldgen();
		HarvestLevel();
		languageRegistry();

		//Reactioncraft integration
		try
		{
			if(RCBDM())
			{
				Integration.loadReactioncraftBookcases();
				System.out.println("Reactioncraft integration loaded !");
			}
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Reactioncraft Better Bookcases did not find Better Desert Mod, Scrollshelf recipe disabled");
		}
	}
	
	

	private void Overrides() 
	{	
		if(RCBB.vanillaOverrideBookcase.getBoolean(true))
		{
			Block.blocksList[Block.enchantmentTable.blockID] = null;
			Item.itemsList[Block.enchantmentTable.blockID] = null;
			Block enchantmentTable = new BlockReactioncraftEnchantmentTable().setUnlocalizedName("enchantmentTable");
			GameRegistry.registerBlock(Block.enchantmentTable);
			LanguageRegistry.addName(enchantmentTable, "Enchantment Table");
		}
	}

	public void HarvestLevel() 
	{
		//Setting Harvest Level
		MinecraftForge.setBlockHarvestLevel(RCBB.Bookcasechest,     "axe", 0);
		MinecraftForge.setBlockHarvestLevel(RCBB.bookcasemeta, 0,   "axe", 0);
		MinecraftForge.setBlockHarvestLevel(RCBB.bookcasemeta, 1,   "axe", 0);
		MinecraftForge.setBlockHarvestLevel(RCBB.bookcasemeta, 2,   "axe", 0);
		MinecraftForge.setBlockHarvestLevel(RCBB.bookcasemeta, 3,   "axe", 0);
		MinecraftForge.setBlockHarvestLevel(RCBB.leverbookcase,     "axe", 0);
	}

	public void fuelHandler() 
	{
		GameRegistry.registerFuelHandler(new FuelHandler());
	}

	public void recipes() 
	{
		//Empty Chest
		GameRegistry.addRecipe(new ItemStack(bookcasemeta, 1, 0), new Object[]{"###", "XXX", "###", Character.valueOf('X'), Block.woodSingleSlab, Character.valueOf('#'), Block.planks});

		//Bookcase Chest
		GameRegistry.addRecipe(new ItemStack(Bookcasechest, 1), new Object[]{"###", "BGB", "###", Character.valueOf('#'), Block.planks, Character.valueOf('G'), Block.chest, Character.valueOf('B'), Item.book});

		//Lever Bookcase
		GameRegistry.addRecipe(new ItemStack(leverbookcase, 1), new Object[]{"###", "BGB", "###", Character.valueOf('#'), Block.planks, Character.valueOf('G'), Block.lever, Character.valueOf('B'), Item.book});

		//Bookcase Doors
		GameRegistry.addRecipe(new ItemStack(WoodenBookcasedoor, 1), new Object[]{"## ", "## ", "## ", Character.valueOf('#'), Block.bookShelf});
		GameRegistry.addRecipe(new ItemStack(IronBookcasedoor, 1), new Object[]{" # ", "III", Character.valueOf('#'), WoodenBookcasedoor, Character.valueOf('I'), Item.ingotIron});


		//Recipes that make Regular Bookcases
		GameRegistry.addRecipe(new ItemStack(Block.bookShelf, 1), new Object[]{"BBB", " # ", Character.valueOf('#'), new ItemStack(bookcasemeta, 1, 0), Character.valueOf('B'), Item.book});
		GameRegistry.addRecipe(new ItemStack(Block.bookShelf, 1), new Object[]{"#", Character.valueOf('#'), new ItemStack(RCBB.bookcasemeta, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(bookcasemeta, 1, 0), new Object[]{"#", Character.valueOf('#'), new ItemStack(RCBB.bookcasemeta, 1, 2)});
	}

	public void worldgen() 
	{
		GameRegistry.registerWorldGenerator(new WorldGenHandler());
	}


	public void languageRegistry() 
	{
		LanguageRegistry.addName(WoodenBookcasedoor, "Wooden Bookcase Door");
		LanguageRegistry.addName(IronBookcasedoor, "Iron Bookcase Door");

		LanguageRegistry.addName(Bookcasechest, "Chest Bookshelf");

		//Door Blocks
		LanguageRegistry.addName(WoodenBookcasedoorBlock, "WoodenBookcasedoorBlock");
		LanguageRegistry.addName(IronBookcasedoorBlock, "IronBookcasedoorBlock");

		//Metadata Bookshelfs
		LanguageRegistry.addName(new ItemStack(bookcasemeta, 1, 0), "Empty Bookshelf");
		LanguageRegistry.addName(new ItemStack(bookcasemeta, 1, 1), "Webbed Bookshelf");
		LanguageRegistry.addName(new ItemStack(bookcasemeta, 1, 2), "Empty Webbed Bookshelf");
		LanguageRegistry.addName(new ItemStack(bookcasemeta, 1, 3), "Scroll shelf");

		//Lever Bookcase
		LanguageRegistry.addName(leverbookcase, "Lever Bookshelf");
	}

	public void blockRegistry() 
	{
		GameRegistry.registerBlock(bookcasemeta, ItemBookcaseMulti.class);
		GameRegistry.registerBlock(Bookcasechest, "Bookcasechest");
		GameRegistry.registerBlock(WoodenBookcasedoorBlock, "WoodenBookcasedoorBlock");
		GameRegistry.registerBlock(IronBookcasedoorBlock, "IronBookcasedoorBlock");
		GameRegistry.registerBlock(leverbookcase, "Lever Bookshelf");
	}

	public void blocks() 
	{
		bookcasemeta = new BlockBookcaseMulti(bookcasemetaID, Material.wood).setHardness(1.5F);
		WoodenBookcasedoorBlock = new BlockBookcasedoor(WoodenBookcasedoorBlockID, Material.wood).setHardness(1.5F).setUnlocalizedName("RCBB:WoodenBookcasedoor_lower");
		IronBookcasedoorBlock = new BlockBookcasedoor(IronBookcasedoorBlockID, Material.iron).setHardness(1.5F).setUnlocalizedName("RCBB:IronBookcasedoorBlock_lower");;
		Bookcasechest = (new Blockbookshelfchest(BookcasechestID)).setHardness(1.5F).setResistance(1.0F).setUnlocalizedName("RCBB:Bookcasechest");
		leverbookcase = (new BlockLeverBookcase(leverbookcaseID)).setHardness(1.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("RCBB:leverbookcase").setCreativeTab(RCB.Reactioncraft);
	}

	public void items() 
	{
		WoodenBookcasedoor = (new ItemBookcaseDoor(WoodenBookcasedoorIID, Material.wood)).setUnlocalizedName("RCBB:WoodenBookcasedoor");
		IronBookcasedoor = (new ItemBookcaseDoor(IronBookcasedoorIID, Material.iron)).setUnlocalizedName("RCBB:IronBookcasedoor");
	}

	public void tileentities() 
	{ 
		//Tile Entities
		GameRegistry.registerTileEntity(TileEntityBookcaseChest.class, "Bookcasechest");
	}

	public void addDungeonLoot(ItemStack item, int rarity)
	{

	}

	@PostInit
	public void modsLoaded(FMLPostInitializationEvent evt)
	{

	}
}
