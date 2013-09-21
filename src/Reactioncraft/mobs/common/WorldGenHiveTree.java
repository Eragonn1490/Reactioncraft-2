package Reactioncraft.mobs.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenHiveTree implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		if(world.provider.dimensionId == 0)
		{
			this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateSurface(World world, Random random, int chunkX, int chunkZ)
	{
		BiomeGenBase biomegenbase = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);
		
		if(biomegenbase instanceof BiomeGenForest)
			for(int i = 0; i < 5; i++)//50 how often to generate ?
			{
				int xCoord = chunkX + random.nextInt(16);
				int yCoord = random.nextInt(128);// Generation height ?
				int zCoord = chunkZ + random.nextInt(16);

				(new beehive()).generate(world, random, xCoord, yCoord, zCoord);
			}
	}
}