package Reactioncraft.bookcase.common;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenDesert;
import net.minecraft.world.biome.BiomeGenHills;
import net.minecraft.world.biome.BiomeGenPlains;
import net.minecraft.world.biome.BiomeGenSwamp;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenHandlerNotUsed implements IWorldGenerator 
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
		//WizimLibrary
//		BiomeGenBase biomegenbase = world.getWorldChunkManager().getBiomeGenAt(blockX, blockZ);
//		if(biomegenbase instanceof BiomeGenPlains || biomegenbase instanceof BiomeGenHills || biomegenbase instanceof BiomeGenSwamp)
//			for(int i = 0; i < 4; i++)
//			{
//				int randPosX = blockX + random.nextInt(16);
//				int randPosY = random.nextInt(128);
//				int randPosZ = blockZ + random.nextInt(16);
//				(new WorldGenWizimLibary()).generate(world, random, randPosX, randPosY, randPosZ);
//			}
	}

	public void generateNether(World world, Random random, int blockX, int blockZ) 
	{

	}

	public void generateEnd(World world, Random random, int blockX, int blockZ) 
	{

	}

}
