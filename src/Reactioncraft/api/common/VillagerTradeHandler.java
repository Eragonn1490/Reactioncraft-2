package Reactioncraft.api.common;

import java.util.List;
import java.util.Random;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.gen.structure.ComponentVillageStartPiece;
import net.minecraft.world.gen.structure.StructureVillagePieceWeight;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import Reactioncraft.core.RCC;
import Reactioncraft.currency.RCCM;
import Reactioncraft.currency.common.ComponentRCVillageHouse;
import Reactioncraft.food.RCF;
import Reactioncraft.glass.RCG;
import Reactioncraft.machines.RCMM;
import Reactioncraft.mobs.RCmobs;
import Reactioncraft.net.RCN;
import Reactioncraft.ore.RCORES;
import Reactioncraft.plants.RCPM;
import Reactioncraft.tools.RCW;
import Reactioncraft.bookcase.RCBB;
import Reactioncraft.desert.RCBDM;

public class VillagerTradeHandler implements IVillageTradeHandler, VillagerRegistry.IVillageCreationHandler 
{
	public static boolean RCBB() throws ClassNotFoundException 
	{
		try{
			Class.forName("Reactioncraft.bookcase.RCBB");
		}
		catch (NoClassDefFoundError ex) 
		{
			return false ;
		}
		return true ;
	}

	public static boolean RCC() throws ClassNotFoundException 
	{
		try{
			Class.forName("Reactioncraft.core.RCC");
		}
		catch (NoClassDefFoundError ex) 
		{
			return false ;
		}
		return true ;
	}

	public static boolean RCBDM() throws ClassNotFoundException 
	{
		try{
			Class.forName("Reactioncraft.desert.RCBDM");
		}
		catch (NoClassDefFoundError ex) 
		{
			return false ;
		}
		return true ;
	}

	public static boolean RCF() throws ClassNotFoundException 
	{
		try{
			Class.forName("Reactioncraft.food.RCF");
		}
		catch (NoClassDefFoundError ex) 
		{
			return false ;
		}
		return true ;
	}

	public static boolean RCG() throws ClassNotFoundException 
	{
		try{
			Class.forName("Reactioncraft.glass.RCG");
		}
		catch (NoClassDefFoundError ex) 
		{
			return false ;
		}
		return true ;
	}

	public static boolean RCMM() throws ClassNotFoundException 
	{
		try{
			Class.forName("Reactioncraft.machines.RCMM");
		}
		catch (NoClassDefFoundError ex) 
		{
			return false ;
		}
		return true ;
	}

	public static boolean RCMOBS() throws ClassNotFoundException 
	{
		try{
			Class.forName("Reactioncraft.mobs.RCmobs");
		}
		catch (NoClassDefFoundError ex) 
		{
			return false ;
		}
		return true ;
	}

	public static boolean RCN() throws ClassNotFoundException 
	{
		try{
			Class.forName("Reactioncraft.net.RCN");
		}
		catch (NoClassDefFoundError ex) 
		{
			return false ;
		}
		return true ;
	}

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

	public static boolean RCPM() throws ClassNotFoundException 
	{
		try{
			Class.forName("Reactioncraft.plants.RCPM");
		}
		catch (NoClassDefFoundError ex) 
		{
			return false ;
		}
		return true ;
	}

	public static boolean RCW() throws ClassNotFoundException 
	{
		try{
			Class.forName("Reactioncraft.tools.RCW");
		}
		catch (NoClassDefFoundError ex) 
		{
			return false ;
		}
		return true ;
	}
	
	public static final int Reactioncraft_Trader = 22;

	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random)
	{
		recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotGold, 4, 0), null, new ItemStack(RCCM.CoinMould, 1, 0)));
		recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotGold, 4, 0), null, new ItemStack(RCCM.ingotmould, 1, 0)));
		
		//Bookcases
		try 
		{
			if(RCBB())
			{
				recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 15), null, new ItemStack(RCBB.WoodenBookcasedoor, 1, 0)));
				//recipeList.add(new MerchantRecipe(new ItemStack(RCCM. , 1), null, new ItemStack(Block.planks, 72, 0)));

				System.out.println("Reactioncraft: Better Bookcase, Trading Recipes Loaded!");
			}
		}
		catch (ClassNotFoundException e)	
		{
			System.out.println("Reactioncraft: Currency, did not find Better Bookcases, Trading Recipe's Disabled!");
		}

		//Core
		try 
		{
			if(RCC())
			{
				recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 3), null, new ItemStack(RCC.SandStonePaste, 32, 0)));
				recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 0), null, new ItemStack(RCC.SamonRaw, 2, 0)));
				recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 0), null, new ItemStack(RCC.YellowTailRaw, 2, 0)));

				System.out.println("Reactioncraft: Core, Trading Recipes Loaded!");
			}
		}
		catch (ClassNotFoundException e)	
		{
			System.out.println("Reactioncraft: Currency, did not find Reactioncraft Core, Trading Recipe's Disabled!");
		}

		//Desert
		try 
		{
			if(RCBDM())
			{
				recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 7), null, new ItemStack(RCBDM.DesertBlockMulti, 5, 6)));
				recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 7), null, new ItemStack(RCBDM.CherryTreeSapling, 2, 0)));
				//recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 15), null, new ItemStack(RCBDM., 2, 0)));

				System.out.println("Reactioncraft: Better Deserts, Trading Recipes Loaded!");
			}
		}
		catch (ClassNotFoundException e)	
		{
			System.out.println("Reactioncraft: Currency, did not find Better Deserts, Trading Recipe's Disabled!");
		}

		//Food
		try 
		{
			if(RCF())
			{
				recipeList.add(new MerchantRecipe(new ItemStack(Item.bucketMilk, 1), null, new ItemStack(RCF.cheese, 2, 0)));
				recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 3), null, new ItemStack(RCF.Knfie, 1, 0)));
				//				recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 15), null, new ItemStack(RCBDM., 2, 0)));

				System.out.println("Reactioncraft: Interesting Foods, Trading Recipes Loaded!");
			}
		}
		catch (ClassNotFoundException e)	
		{
			System.out.println(" Reactioncraft: Currency, did not find Interesting Foods, Trading Recipe's Disabled!");
		}

		//Glass
		try 
		{
			if(RCG())
			{
				recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 7), null, new ItemStack(RCG.moltenglass, 5, 0)));
				//recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 15), null, new ItemStack(RCG., 1, 0)));
				//recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 15), null, new ItemStack(RCBDM., 2, 0)));

				System.out.println("Reactioncraft: Better Glass, Trading Recipes Loaded!");
			}
		}
		catch (ClassNotFoundException e)	
		{
			System.out.println(" Reactioncraft: Currency, did not find Better Glass, Trading Recipe's Disabled!");
		}

		//Machines
		try 
		{
			if(RCMM())
			{
				recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 6), null, new ItemStack(RCMM.IceBucket, 1, 0)));
				recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 13), null, new ItemStack(RCMM.ObsidianBucket, 1, 0)));
				//						recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 15), null, new ItemStack(RCBDM., 2, 0)));

				System.out.println("Reactioncraft: Machines, Trading Recipes Loaded!");
			}
		}
		catch (ClassNotFoundException e)	
		{
			System.out.println(" Reactioncraft: Currency, did not find Machines, Trading Recipe's Disabled!");
		}

		//Mobs
		try 
		{
			if(RCMOBS())
			{
				recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 15), null, new ItemStack(RCmobs.bones, 8, 0)));
				//recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 15), null, new ItemStack(RCF.Knfie, 1, 0)));
				//recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 15), null, new ItemStack(RCBDM., 2, 0)));

				System.out.println("Reactioncraft: Mobs, Trading Recipes Loaded!");
			}
		}
		catch (ClassNotFoundException e)	
		{
			System.out.println(" Reactioncraft: Currency, did not find Mobs, Trading Recipe's Disabled!");
		}

		//Net
		try  
		{
			if(RCN())
			{
				//recipeList.add(new MerchantRecipe(new ItemStack(RCN.caughtbee, 1), null, new ItemStack(RCCM.Bag, 5, 0)));
				//recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 15), null, new ItemStack(RCF.Knfie, 1, 0)));
				//recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 15), null, new ItemStack(RCBDM., 2, 0)));

				System.out.println("Reactioncraft: Net, Trading Recipes Loaded!");
			}
		}
		catch (ClassNotFoundException e)	
		{
			System.out.println("Reactioncraft: Currency, did not find Netting Mod, Trading Recipe's Disabled!");
		}

		//Ore
		try  
		{
			if(RCORES())
			{
				recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), null, new ItemStack(RCORES.irondust, 3, 0)));
				recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotGold, 2), null, new ItemStack(RCORES.goldrod, 2, 0)));
				//recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 15), null, new ItemStack(RCBDM., 2, 0)));

				System.out.println("Reactioncraft: Ores, Trading Recipes Loaded!");
			}
		}
		catch (ClassNotFoundException e)	
		{
			System.out.println("Reactioncraft: Currency, did not find Ores Mod, Trading Recipe's Disabled!");
		}

		//Plants
		try  
		{
			if(RCPM())
			{
				//recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), null, new ItemStack(RCPM., 3, 0)));
				//recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotGold, 2), null, new ItemStack(RCORES.goldrod, 1, 0)));
				//recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 15), null, new ItemStack(RCBDM., 2, 0)));

				System.out.println("Reactioncraft: Plants, Trading Recipes Loaded!");
			}
		}
		catch (ClassNotFoundException e)	
		{
			System.out.println("Reactioncraft: Currency, did not find Plants Mod, Trading Recipe's Disabled!");
		}

		//Weapons
		try  
		{
			if(RCW())
			{
				//recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotIron, 1), null, new ItemStack(RCPM., 3, 0)));
				//recipeList.add(new MerchantRecipe(new ItemStack(Item.ingotGold, 2), null, new ItemStack(RCORES.goldrod, 1, 0)));
				//recipeList.add(new MerchantRecipe(new ItemStack(RCCM.Metadatacoin, 1, 15), null, new ItemStack(RCBDM., 2, 0)));

				System.out.println("Reactioncraft: Weapon, Trading Recipes Loaded!");
			}
		}
		catch (ClassNotFoundException e)	
		{
			System.out.println("Reactioncraft: Currency, did not find Weapon Mod, Trading Recipe's Disabled!");
		}
	}
	
	
	
	//Village Parts
	@Override
	public StructureVillagePieceWeight getVillagePieceWeight(Random random, int i) 
	{
        return new StructureVillagePieceWeight(ComponentRCVillageHouse.class, 3, MathHelper.getRandomIntegerInRange(random, 1 + i, 1 + i));
        		//, 3, MathHelper.getRandomIntegerInRange(random, 0, 1));   
	}

	@Override
	public Class<?> getComponentClass() {
		return ComponentRCVillageHouse.class;
	}


	@Override
	public Object buildComponent(StructureVillagePieceWeight villagePiece,
			ComponentVillageStartPiece startPiece, List pieces, Random random,
			int p1, int p2, int p3, int p4, int p5) {
	       return ComponentRCVillageHouse.buildComponent(startPiece, pieces, random, p1, p2, p3, p4, p5);
	}
}