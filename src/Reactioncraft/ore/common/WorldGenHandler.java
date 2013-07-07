package Reactioncraft.ore.common;

import java.util.Random;
import Reactioncraft.ore.RCORES;
import Reactioncraft.ore.common.*;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenHandler implements IWorldGenerator 
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

	private void generateSurface(World world, Random random, int chunkX,int chunkZ)
	{
		for(int i = 0; i < 15; i++)
		{
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(64);
			int zCoord = chunkZ + random.nextInt(16);

			(new WorldGenMinable(RCORES.surfaceOres.blockID, 5, 0, Block.stone.blockID)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}

	public void generateNether(World world, Random random, int blockX, int blockZ) 
	{
		if(RCORES.genBloodstone.getBoolean(true))
		{
			//Bloodstone
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = 10 + random.nextInt(128);
			int Zcoord = blockZ + random.nextInt(16);
			(new WorldGenNetherMinable(RCORES.netherOres.blockID, 100, Block.netherrack.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}

		if(RCORES.genBlackdiamond.getBoolean(true))
		{
			//Black Diamond
			int XCoord1 = blockX + random.nextInt(16);
			int YCoord1 = random.nextInt(128);
			int ZCoord1 = blockZ + random.nextInt(16);
			(new WorldGenNetherMinable(RCORES.netherOres.blockID, 1, 6, RCORES.netherOres.blockID)).generate(world, random, XCoord1, YCoord1, ZCoord1);
		}

		if(RCORES.genDragonstone.getBoolean(true))
		{
			//Dragonstone
			int XCoord2 = blockX + random.nextInt(16);
			int YCoord2 = random.nextInt(128);
			int ZCoord2 = blockZ + random.nextInt(16);
			(new WorldGenNetherMinable(RCORES.netherOres.blockID, 2, 6, RCORES.netherOres.blockID)).generate(world, random, XCoord2, YCoord2, ZCoord2);
		}

		if(RCORES.genNetherdiamond.getBoolean(true))
		{
			//Diamond
			int XCoord3 = blockX + random.nextInt(16);
			int YCoord3 = random.nextInt(128);
			int ZCoord3 = blockZ + random.nextInt(16);
			(new WorldGenNetherMinable(RCORES.netherOres.blockID, 3, 6, RCORES.netherOres.blockID)).generate(world, random, XCoord3, YCoord3, ZCoord3);
		}

		if(RCORES.genNethergold.getBoolean(true))
		{
			//Gold
			int XCoord4 = blockX + random.nextInt(16);
			int YCoord4 = random.nextInt(128);
			int ZCoord4 = blockZ + random.nextInt(16);
			(new WorldGenNetherMinable(RCORES.netherOres.blockID, 4, 6, RCORES.netherOres.blockID)).generate(world, random, XCoord4, YCoord4, ZCoord4);
		}	
	}

	public void generateEnd(World world, Random random, int blockX, int blockZ) 
	{
		int xCoord = blockX + random.nextInt(16);
		int yCoord = random.nextInt(64);
		int zCoord = blockZ + random.nextInt(16);
		(new WorldGenMinable(RCORES.endOres.blockID, 10, 0, Block.whiteStone.blockID)).generate(world, random, xCoord, yCoord, zCoord);
	}
}
