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
	public void generate(Random random, int chunkX, int chunkZ, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider){

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
		//Silver
		for(int i = 0; i < 15; i++)
		{
			int xCoord = blockX + random.nextInt(16);
			int yCoord = random.nextInt(64);
			int zCoord = blockZ + random.nextInt(16);
			(new WorldGenMinable(RCORES.surfaceOres.blockID, 5, 0, Block.stone.blockID)).generate(world, random, xCoord, yCoord, zCoord);
		}
		//		  		for(int i = 0; i < 10; i++)
		//		  		{
		//		                int randPosX2 = blockX + random.nextInt(16);
		//		                int randPosY2 = random.nextInt(128);
		//		                int randPosZ2 = blockZ + random.nextInt(16);
		//		                (new WorldGenMinable(AliensVsPredator.oreTitanium.blockID, 5)).generate(world, random, randPosX2, randPosY2, randPosZ2);
		//		  		}
	}

	public void generateNether(World world, Random random, int blockX, int blockZ) 
	{		
		//Bloodstone
		int Xcoord = blockX + random.nextInt(16);
		int Ycoord = 10 + random.nextInt(128);
		int Zcoord = blockZ + random.nextInt(16);
		(new WorldGenNetherMinable(RCORES.netherOres.blockID, 50, Block.netherrack.blockID)).generate(world, random, Xcoord, Ycoord, Zcoord);


		for(int i = 0; i < 60; i++)
		{
			int xCoord = blockX + random.nextInt(16);
			int yCoord = random.nextInt(37);
			int zCoord = blockZ + random.nextInt(16);
			(new WorldGenNetherMinable(RCORES.netherOres.blockID, 50, Block.netherrack.blockID)).generate(world, random, xCoord, yCoord, zCoord);
		}
		//Black Diamond
		for(int i = 0; i < 65; i++){
			int xCoord = blockX + random.nextInt(16);
			int yCoord = random.nextInt(37);
			int zCoord = blockZ + random.nextInt(16);
			(new WorldGenNetherMinable(RCORES.netherOres.blockID, 3, 1, Block.netherrack.blockID)).generate(world, random, xCoord, yCoord, zCoord);
		}
		//Dragonstone
		for(int i = 0; i < 65; i++){
			int xCoord = blockX + random.nextInt(16);
			int yCoord = random.nextInt(37);
			int zCoord = blockZ + random.nextInt(16);
			(new WorldGenNetherMinable(RCORES.netherOres.blockID, 3, 2, Block.netherrack.blockID)).generate(world, random, xCoord, yCoord, zCoord);
		}
		//Diamond
		for(int i = 0; i < 65; i++)
		{
			int xCoord = blockX + random.nextInt(16);
			int yCoord = random.nextInt(37);
			int zCoord = blockZ + random.nextInt(16);
			(new WorldGenNetherMinable(RCORES.netherOres.blockID, 3, 3, Block.netherrack.blockID)).generate(world, random, xCoord, yCoord, zCoord);
		}
		//Gold
		for(int i = 0; i < 65; i++)
		{
			int xCoord = blockX + random.nextInt(16);
			int yCoord = random.nextInt(37);
			int zCoord = blockZ + random.nextInt(16);
			(new WorldGenNetherMinable(RCORES.netherOres.blockID, 4, 3, Block.netherrack.blockID)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}

	public void generateEnd(World world, Random random, int blockX, int blockZ) 
	{
		for(int i = 0; i < 62; i++){
			int xCoord = blockX + random.nextInt(16);
			int yCoord = random.nextInt(64);
			int zCoord = blockZ + random.nextInt(16);
			(new WorldGenMinable(RCORES.endOres.blockID, 10, 0, Block.whiteStone.blockID)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}

}
