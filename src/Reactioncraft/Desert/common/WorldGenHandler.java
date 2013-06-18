package Reactioncraft.Desert.common;

import java.util.Random;
import Reactioncraft.Desert.RCBDM;
import net.minecraft.world.World;
import Reactioncraft.core.common.BiomeGenRcDesert;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenDesert;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenHandler implements IWorldGenerator 
{
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.dimensionId)
		{
		case -1: generateNether(world, random, chunkX*16, chunkZ*16);
		case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		}
	}



	public void generateSurface(World world, Random random, int blockX, int blockZ) 
	{
		BiomeGenBase biomegenbase = world.getWorldChunkManager().getBiomeGenAt(blockX, blockZ);
		
		
		if(biomegenbase instanceof BiomeGenDesert || biomegenbase instanceof BiomeGenRcDesert)
			for(int i = 0; i < 4; i++)
			{
				int randPosX = blockX + random.nextInt(16);
				int randPosY = random.nextInt(128);
				int randPosZ = blockZ + random.nextInt(16);
				(new WorldGenMinable(RCBDM.Cactus1.blockID, 1)).generate(world, random, randPosX, randPosY, randPosZ);
			}

		if(biomegenbase instanceof BiomeGenDesert || biomegenbase instanceof BiomeGenRcDesert)
			for(int i = 0; i < 4; i++)
			{
				int randPosX = blockX + random.nextInt(16);
				int randPosY = random.nextInt(128);
				int randPosZ = blockZ + random.nextInt(16);
				(new WorldGenMinable(RCBDM.Cactus2.blockID, 1)).generate(world, random, randPosX, randPosY, randPosZ);
			}

		if(biomegenbase instanceof BiomeGenRcDesert)
			for(int i = 0; i < 4; i++)
			  {
				  int Xcoord1 = blockX + random.nextInt(16);
				  int Ycoord1 = random.nextInt(80);
				  int Zcoord1 = blockZ + random.nextInt(16);
				  (new WorldGenReactionCraftTreespawn()).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
			  }
	}

	public void generateNether(World world, Random random, int blockX, int blockZ) 
	{

	}

}
