package Reactioncraft.core.common;

import net.minecraft.world.biome.BiomeGenBase;
import Reactioncraft.core.RCC;

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
