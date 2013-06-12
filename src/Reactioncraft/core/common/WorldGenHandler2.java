package Reactioncraft.core.common;

import java.util.Random;

import Reactioncraft.core.RCC;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenDesert;
import net.minecraft.world.biome.BiomeGenOcean;
import net.minecraft.world.biome.BiomeGenRiver;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenHandler2 implements IWorldGenerator 
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
		if(RCC.GenDarkSand.getBoolean(true))
		{
			//DarkSand
			BiomeGenBase biomegenbase = world.getWorldChunkManager().getBiomeGenAt(blockX, blockZ);
			if(biomegenbase instanceof BiomeGenOcean || biomegenbase instanceof BiomeGenRiver)
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

	public void generateNether(World world, Random random, int blockX, int blockZ) 
	{

	}

	public void generateEnd(World world, Random random, int blockX, int blockZ) 
	{

	}

}
