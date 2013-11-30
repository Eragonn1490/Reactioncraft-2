package Reactioncraft.net;

import Reactioncraft.integration.*;
import Reactioncraft.net.client.ClientProxy;
import Reactioncraft.net.Common.CommonProxy;
import java.io.File;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.*;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumHelper;
import Reactioncraft.net.Common.*;
import Reactioncraft.net.ltd.genuine.database.ExclusionList;
import Reactioncraft.api.common.CatchList;
import Reactioncraft.basefiles.common.*;
import Reactioncraft.basemod.RCB;
import cpw.mods.fml.common.ICraftingHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
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


@Mod(modid = "rcn", name = "Reactioncraft Netting", version = "[1.6.4] Reactioncraft 3 Version 1.2.4", dependencies = "required-after:reactioncraft")
@NetworkMod(channels = { "RCN" }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)

public class RCN implements ICraftingHandler
{

	@SidedProxy(clientSide = "Reactioncraft.net.client.ClientProxy", serverSide = "Reactioncraft.net.Common.CommonProxy")
	public static CommonProxy proxy;

	@Instance("RCN")
	public static RCN instance;

	// Items
	public static Item hilt;
	public static Item net;
	public static Item completeNet;
	public static Item caught;
	public static Item caughtplayer;

	//Config
	public static ReactioncraftConfiguration config;
	public static ExclusionList exclusionList;
	public static CatchList catchlist;

	@EventHandler
	public void preInit(FMLPreInitializationEvent evt) 
	{
		System.out.println("[RCN] Pre Initialization Loaded");

		config = new ReactioncraftConfiguration(new File(evt.getModConfigurationDirectory(), "Reactioncraft/Netmod.cfg"));

		try 
		{
			config.load();	

			//10841 - 10850
			IntegratedConfigI.caughtIID = config.getItem("Caught", 10841).getInt();
			IntegratedConfigI.caughtplayerIID = config.getItem("Caught Player", 10845).getInt();
			IntegratedConfigI.hiltIID = config.getItem("Hilt Item", 10842).getInt();
			IntegratedConfigI.netIID = config.getItem("Net Item", 10843).getInt();
			IntegratedConfigI.completeNetIID = config.getItem("Complete Item", 10844).getInt();

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
	{}

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
			netIs.stackTagCompound.setInteger("str1", (i + 1));
			GameRegistry.addRecipe(hiltIs, hiltRec);
			GameRegistry.addRecipe(netIs, netRec);
		}
		GameRegistry.addShapelessRecipe(new ItemStack(completeNet), hilt, net);
	}

	
	public void names() 
	{}

	public void itemCode()
	{
		hilt = new ItemPieceHilt(IntegratedConfigI.hiltIID).setUnlocalizedName("reactioncraft:hilt").setTextureName("reactioncraft:hilt").setCreativeTab(RCB.ReactioncraftItems);
		net = new ItemPieceNet(IntegratedConfigI.netIID).setUnlocalizedName("reactioncraft:netpart").setTextureName("reactioncraft:netpart").setCreativeTab(RCB.ReactioncraftItems);
		completeNet = new ItemNetCatcher(IntegratedConfigI.completeNetIID).setUnlocalizedName("reactioncraft:fullnet").setTextureName("reactioncraft:fullnet");
		caught = new ItemCaughtEntity(IntegratedConfigI.caughtIID).setUnlocalizedName("reactioncraft:caught").setTextureName("reactioncraft:caught");
		caughtplayer = new ItemCaughtPlayer(IntegratedConfigI.caughtplayerIID).setUnlocalizedName("reactioncraft:caught").setTextureName("reactioncraft:caught");
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
				item.stackTagCompound.setInteger("net", net.stackTagCompound.getInteger("str1"));
			}
		}
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) 
	{}
}