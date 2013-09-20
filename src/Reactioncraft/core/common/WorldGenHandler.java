package Reactioncraft.core.common;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraft.world.chunk.IChunkProvider;
import Reactioncraft.core.RCC;
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
		
		if(RCC.GenSponge.getBoolean(true))
		{
			//Sponge
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

			if(RCC.GenDarkSand.getBoolean(true))
			{
				biomegenbase = world.getWorldChunkManager().getBiomeGenAt(blockX, blockZ);
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
		}
		//    	//Magma
		//    	for(int i = 0; i < 7; i++)
		//    	{
		//    		int RandPosX = blockX + random.nextInt(16);
		//    		int RandPosY = random.nextInt(128);
		//    		int RandPosZ = blockZ + random.nextInt(16);
		//    		(new WorldGenMinable(RCC.MagmaLiquidFlowing.blockID, 2, 1)).generate(world, random, RandPosX, RandPosY, RandPosZ);
		//    	}
	}

	public void generateNether(World world, Random random, int blockX, int blockZ) 
	{

	}

	public void generateEnd(World world, Random random, int blockX, int blockZ) 
	{

	}

}
