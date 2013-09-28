package Reactioncraft.desert.common;

import Reactioncraft.basefiles.common.*;
import Reactioncraft.core.common.BiomeGenRcDesert;
import Reactioncraft.desert.RCBDM;
import cpw.mods.fml.common.IWorldGenerator;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenDesert;
import net.minecraft.world.chunk.IChunkProvider;

public class CustomBiomeGenerator implements IWorldGenerator
{
	private WorldGenMinableMeta apatiteGenerator;
	private WorldGenMinableMeta darkstoneGenerator;
	private WorldGenMinableMeta goldGenerator;
	private WorldGenMinableMeta lightstoneGenerator;
	private WorldGenMinableMeta darkgemstoneGenerator;
	private WorldGenMinableMeta limestoneGenerator;

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		if (this.apatiteGenerator == null) 
		{
			this.darkstoneGenerator     = new WorldGenMinableMeta(RCBDM.DesertBlockMulti.blockID, 2, 36);
			this.goldGenerator          = new WorldGenMinableMeta(RCBDM.DesertBlockMulti.blockID, 10, 4);
			this.lightstoneGenerator    = new WorldGenMinableMeta(RCBDM.DesertBlockMulti.blockID, 8, 5);
			this.darkgemstoneGenerator  = new WorldGenMinableMeta(RCBDM.DesertBlockMulti.blockID, 9, 5);
			this.limestoneGenerator     = new WorldGenMinableMeta(RCBDM.DesertBlockMulti.blockID, 6, 15);
		}

		chunkX <<= 4;
		chunkZ <<= 4;

		BiomeGenBase biomegenbase = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);

		if (RCBDM.darkstoneGenerator.getBoolean(true)) 
		{
			if(biomegenbase instanceof BiomeGenRcDesert)
			{
				for (int i = 0; i < 18; i++) {
					int randPosX = chunkX + random.nextInt(16);
					int randPosY = random.nextInt(59);
					int randPosZ = chunkZ + random.nextInt(16);
					//System.out.println("[RCBDM] Darkstone generated");
					this.darkstoneGenerator.generate(world, random, randPosX, randPosY, randPosZ);
				}
			}
		}

		if (RCBDM.goldGenerator.getBoolean(true)) 
		{
			if(biomegenbase instanceof BiomeGenRcDesert)
			{
				for (int i = 0; i < 50; i++) {
					int randPosX = chunkX + random.nextInt(16);
					int randPosY = random.nextInt(59);
					int randPosZ = chunkZ + random.nextInt(16);
					//System.out.println("[RCBDM] Desert Gold generated");
					this.goldGenerator.generate(world, random, randPosX, randPosY, randPosZ);
				}
			}
		}

		if (RCBDM.lightstoneGenerator.getBoolean(true)) 
		{
			if(biomegenbase instanceof BiomeGenRcDesert)
			{
				for (int i = 0; i < 18; i++) {
					int randPosX = chunkX + random.nextInt(16);
					int randPosY = random.nextInt(59);
					int randPosZ = chunkZ + random.nextInt(16);
					//System.out.println("[RCBDM] Gem 1 generated");
					this.lightstoneGenerator.generate(world, random, randPosX, randPosY, randPosZ);
				}
			}
		}

		if (RCBDM.darkgemstoneGenerator.getBoolean(true)) 
		{
			if(biomegenbase instanceof BiomeGenRcDesert)
			{
				for (int i = 0; i < 18; i++) {
					int randPosX = chunkX + random.nextInt(16);
					int randPosY = random.nextInt(59);
					int randPosZ = chunkZ + random.nextInt(16);
					//System.out.println("[RCBDM] Gem 2 generated");
					this.darkgemstoneGenerator.generate(world, random, randPosX, randPosY, randPosZ);
				}
			}
		}

		if (RCBDM.limestoneGenerator.getBoolean(true)) 
		{
			if(biomegenbase instanceof BiomeGenRcDesert)
			{
				for (int i = 0; i < 16; i++) {
					int randPosX = chunkX + random.nextInt(16);
					int randPosY = random.nextInt(59) + 30;
					int randPosZ = chunkZ + random.nextInt(16);
					//System.out.println("[RCBDM] Limestone generated");
					this.limestoneGenerator.generate(world, random, randPosX, randPosY, randPosZ);
				}
			}
		}
	}
}