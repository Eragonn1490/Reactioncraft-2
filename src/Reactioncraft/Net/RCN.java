package Reactioncraft.Net;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.EnumHelper;
import Reactioncraft.Net.Common.EntityPlayerClone;
import Reactioncraft.Net.Common.ItemCaughtEntity;
import Reactioncraft.Net.Common.ItemCaughtPlayer;
import Reactioncraft.Net.Common.ItemNetCatcher;
import Reactioncraft.Net.Common.ItemPieceHilt;
import Reactioncraft.Net.Common.ItemPieceNet;
import Reactioncraft.Net.client.ClientProxy;
import Reactioncraft.Net.ltd.genuine.database.ExclusionList;
import Reactioncraft.basefiles.common.PacketHandler;
import Reactioncraft.basefiles.common.ReactioncraftConfiguration;
import Reactioncraft.basemod.RCB;
import cpw.mods.fml.common.ICraftingHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid = "RCN", name = "Reactioncraft Netting", version = "[1.5.2] Reactioncraft Version 8.0")
@NetworkMod(channels = { "RCN" }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)

public class RCN implements ICraftingHandler
{

	@SidedProxy(clientSide = "Reactioncraft.Net.client.ClientProxy", serverSide = "Reactioncraft.Net.client.CommonProxy")
	public static Reactioncraft.Net.client.CommonProxy proxy;

	@Instance("RCN")
	public static RCN instance;

	//tool materials
	public static EnumToolMaterial EnumToolMaterialNet = EnumHelper.addToolMaterial("Net", 3, 1, 2.0F, 2, 15);
	
	//config  
	public static int caughtID;
	
	public static int caughtplayerID;

	public static int hiltID;

	public static int netID;

	public static int completeNetID;

	// Items
	public static Item hilt;

	public static Item net;

	public static Item completeNet;

	public static Item caught;

	public static Item caughtplayer;
	
	//Config
	public static ReactioncraftConfiguration config;
	
	public static ExclusionList exclusionList;

	@PreInit
	public void preInit(FMLPreInitializationEvent evt) 
	{
		config = new ReactioncraftConfiguration(new File(evt.getModConfigurationDirectory(), "Reactioncraft/Netmod.cfg"));

		try 
		{
			config.load();	

			//10841 - 10850
			caughtID = config.getItem("Caught", 10841).getInt();
			caughtplayerID = config.getItem("Caught Player", 10845).getInt();
			hiltID = config.getItem("Hilt Item", 10842).getInt();
			netID = config.getItem("Net Item", 10843).getInt();
			completeNetID = config.getItem("Complete Item", 10844).getInt();

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
		// The meat of the mod
		ClientProxy.registerRenderInformation();
		itemCode();
		itemRegistry();
		names();
		recipes();
		craftingRegistry();
		registerEntities();
		exclusionList = new ExclusionList();
	}

	public void registerEntities()
	{
		EntityRegistry.registerGlobalEntityID(EntityPlayerClone.class, "Player", EntityRegistry.findGlobalUniqueEntityId(), 0x333333, 0x999999);
		LanguageRegistry.instance().addStringLocalization("entity.EntityPlayerClone.name", "en_US", "Player");
	}

	public void itemRegistry() 
	{
	}

	public void recipes() 
	{
		Object[] levels = new Object[] { Block.planks, Item.leather, Item.ingotIron, Item.ingotGold, Item.diamond };
		for (int i = 0; i < levels.length; i++) 
		{
			Object[] hiltRec = new Object[] { " XI", "XIX", "IX ", 'X', Item.stick, 'I', levels[i] };
			Object[] netRec = new Object[] { "IXI", "XIX", "IXI", 'X', Item.silk, 'I', levels[i] };
			ItemStack hiltIs = new ItemStack(hilt);
			ItemStack netIs = new ItemStack(net);
			hiltIs.stackTagCompound = new NBTTagCompound();
			netIs.stackTagCompound = new NBTTagCompound();
			hiltIs.stackTagCompound.setInteger("str", (i + 1));
			netIs.stackTagCompound.setInteger("str", (i + 1));
			GameRegistry.addRecipe(hiltIs, hiltRec);
			GameRegistry.addRecipe(netIs, netRec);
		}
		GameRegistry.addShapelessRecipe(new ItemStack(completeNet), hilt, net);
		
		//Wool to string recipe! (Fixed to prevent dupe glitch 4 required)
		GameRegistry.addRecipe(new ItemStack(Item.silk, 4), new Object[] {"X", 'X', Block.cloth});
		netlevels();
	}

	private void netlevels() 
	{
		
	}

	public void names() 
	{

	}

	public void itemCode()
	{
		hilt = new ItemPieceHilt(hiltID).setUnlocalizedName("RCN:hilt").setCreativeTab(RCB.ReactioncraftItems);
		net = new ItemPieceNet(netID).setUnlocalizedName("RCN:netpart").setCreativeTab(RCB.ReactioncraftItems);
		completeNet = new ItemNetCatcher(completeNetID).setUnlocalizedName("RCN:fullnet").setCreativeTab(RCB.ReactioncraftItems);
		caught = new ItemCaughtEntity(caughtID).setUnlocalizedName("RCN:caught");
		caughtplayer = new ItemCaughtPlayer(caughtplayerID).setUnlocalizedName("RCN:caught");
	}

	public void craftingRegistry() 
	{
		GameRegistry.registerCraftingHandler(this);
	}

	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) 
	{
		if (item.getItem().equals(completeNet)) 
		{
			item.stackTagCompound = new NBTTagCompound();
			ItemStack hilt = null;
			ItemStack net = null;
			boolean hasHilt;
			boolean hasNet;

			for (int i = 0; i < craftMatrix.getSizeInventory(); i++) 
			{
				ItemStack is = craftMatrix.getStackInSlot(i);
				if (is != null)
					if (is.getItem() == this.hilt)
						hilt = is;
					else
						net = is;
			}

			if (hilt != null && net != null) 
			{
				item.stackTagCompound.setInteger("hilt", hilt.stackTagCompound.getInteger("str"));
				item.stackTagCompound.setInteger("net", net.stackTagCompound.getInteger("str"));
			}

		}
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) 
	{
	}
}