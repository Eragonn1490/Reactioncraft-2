package Reactioncraft.core.common;

import java.util.Random;

import cpw.mods.fml.common.Loader;
import Reactioncraft.core.RCC;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenRcDesert extends BiomeGenBase
{
	public BiomeGenRcDesert(int par1)
	{
		super(par1);
		this.spawnableCreatureList.clear();
		this.topBlock = (byte)RCC.DarkSand.blockID;
		this.fillerBlock = (byte)RCC.DarkSand.blockID;
	}
}
