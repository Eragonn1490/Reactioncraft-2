package Reactioncraft.ore.common;

import java.util.Random;
import Reactioncraft.integration.*;
import Reactioncraft.basefiles.common.*;
import Reactioncraft.ore.common.*;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class NetherEndGenerator implements IWorldGenerator 
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{

		switch(world.provider.dimensionId)
		{
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}

	}
	
	public void generateSurface(World world, Random random, int blockX, int blockZ)
	{
		
	}
	
	public void generateNether(World world, Random random, int blockX, int blockZ) 
	{
		if(IntegratedProperties.genBloodstone.getBoolean(true))
		{
			//Bloodstone
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = 10 + random.nextInt(128);
			int Zcoord = blockZ + random.nextInt(16);
			(new WorldGenNetherMinable(IntegratedBlocks.netherOres.blockID, 100, Block.netherrack.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}

		if(IntegratedProperties.genBlackdiamond.getBoolean(true))
		{
			//Black Diamond
			int XCoord1 = blockX + random.nextInt(16);
			int YCoord1 = random.nextInt(128);
			int ZCoord1 = blockZ + random.nextInt(16);
			(new WorldGenNetherMinable(IntegratedBlocks.netherOres.blockID, 1, 5, Block.netherrack.blockID)).generate(world, random, XCoord1, YCoord1, ZCoord1);
		}

		if(IntegratedProperties.genDragonstone.getBoolean(true))
		{
			//Dragonstone
			int XCoord2 = blockX + random.nextInt(16);
			int YCoord2 = random.nextInt(128);
			int ZCoord2 = blockZ + random.nextInt(16);
			(new WorldGenNetherMinable(IntegratedBlocks.netherOres.blockID, 2, 5, Block.netherrack.blockID)).generate(world, random, XCoord2, YCoord2, ZCoord2);
		}

		if(IntegratedProperties.genNetherdiamond.getBoolean(true))
		{
			//Diamond
			int XCoord3 = blockX + random.nextInt(16);
			int YCoord3 = random.nextInt(128);
			int ZCoord3 = blockZ + random.nextInt(16);
			(new WorldGenNetherMinable(IntegratedBlocks.netherOres.blockID, 3, 5, Block.netherrack.blockID)).generate(world, random, XCoord3, YCoord3, ZCoord3);
		}

		if(IntegratedProperties.genNethergold.getBoolean(true))
		{
			//Gold
			int XCoord4 = blockX + random.nextInt(16);
			int YCoord4 = random.nextInt(128);
			int ZCoord4 = blockZ + random.nextInt(16);
			(new WorldGenNetherMinable(IntegratedBlocks.netherOres.blockID, 4, 5, Block.netherrack.blockID)).generate(world, random, XCoord4, YCoord4, ZCoord4);
		}	
	}

	public void generateEnd(World world, Random random, int blockX, int blockZ) 
	{
		int xCoord = blockX + random.nextInt(16);
		int yCoord = random.nextInt(64);
		int zCoord = blockZ + random.nextInt(16);
		(new WorldGenMinable(IntegratedBlocks.endOres.blockID, 0, 10, Block.whiteStone.blockID)).generate(world, random, xCoord, yCoord, zCoord);
		
		if(IntegratedProperties.genVentinite.getBoolean(true))
		{
			int xCoord1 = blockX + random.nextInt(16);
			int yCoord1 = random.nextInt(64);
			int zCoord1 = blockZ + random.nextInt(16);
			(new WorldGenMinable(IntegratedBlocks.endOres.blockID, 1, 10, Block.whiteStone.blockID)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}
}
