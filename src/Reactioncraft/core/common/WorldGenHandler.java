package Reactioncraft.core.common;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenDesert;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import Reactioncraft.desert.common.WorldGenReactionCraftTreespawn;
import Reactioncraft.integration.*;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenHandler implements IWorldGenerator 
{
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.dimensionId)
		{
		case -1: generateNether(world, random, chunkX*16, chunkZ*16);
		case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		case 1: generateEnd(world, random, chunkX*16, chunkZ*16);
		}
	}

	public void generateSurface(World world, Random random, int blockX, int blockZ) 
	{
		BiomeGenBase biomegenbase = world.getWorldChunkManager().getBiomeGenAt(blockX, blockZ);

		if(IntegratedProperties.GenSponge.getBoolean(true))
		{
			if(biomegenbase instanceof BiomeGenOcean)
			{
				for(int k = 0; k < 10; k++)
				{
					int RandPosX = blockX + random.nextInt(5);
					int RandPosY = random.nextInt(80);
					int RandPosZ = blockZ + random.nextInt(5);
					(new WorldGenSponge(6)).generate(world, random, RandPosX, RandPosY, RandPosZ);
				}
			}
		}

		if(IntegratedProperties.GenDarkSand.getBoolean(true))
		{
			if(biomegenbase instanceof BiomeGenOcean)
			{
				for(int k = 0; k < 10; k++)
				{
					int RandPosX = blockX + random.nextInt(5);
					int RandPosY = random.nextInt(80);
					int RandPosZ = blockZ + random.nextInt(5);
					(new WorldGenDarkSand(6)).generate(world, random, RandPosX, RandPosY, RandPosZ);
				}
			}
		}


		if(IntegratedProperties.GenCactusGreen.getBoolean(true))
		{
			if(biomegenbase instanceof BiomeGenDesert || biomegenbase instanceof BiomeGenRcDesert)
				for (int l = 0; l < 1; ++l)
				{
					int randPosX = blockX + random.nextInt(16);
					int randPosY = random.nextInt(80);
					int randPosZ = blockZ + random.nextInt(16);
					(new WorldGenFlowers(IntegratedBlocks.Cactus1.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
				}
		}

		if(IntegratedProperties.GenCactusRed.getBoolean(true))
		{
			if(biomegenbase instanceof BiomeGenDesert || biomegenbase instanceof BiomeGenRcDesert)
				for (int l = 0; l < 1; ++l)
				{
					int randPosX = blockX + random.nextInt(16);
					int randPosY = random.nextInt(80);
					int randPosZ = blockZ + random.nextInt(16);
					(new WorldGenFlowers(IntegratedBlocks.Cactus2.blockID)).generate(world, random, randPosX, randPosY, randPosZ);
				}
		}

		if(biomegenbase instanceof BiomeGenRcDesert)
			for(int i = 0; i < 6; i++)
			{
				int Xcoord1 = blockX + random.nextInt(16);
				int Ycoord1 = random.nextInt(128);
				int Zcoord1 = blockZ + random.nextInt(16);
				(new WorldGenReactionCraftTreespawn()).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
			}
	}

	public void generateNether(World world, Random random, int blockX, int blockZ) 
	{}
	public void generateEnd(World world, Random random, int blockX, int blockZ) 
	{}
}