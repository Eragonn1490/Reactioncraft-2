package Reactioncraft.core.common;

import net.minecraft.world.biome.BiomeGenBase;
import Reactioncraft.integration.*;

public class BiomeGenRcDesert extends BiomeGenBase
{
	public BiomeGenRcDesert(int par1)
	{
		super(par1);
		this.spawnableCreatureList.clear();
		this.topBlock = (byte)IntegratedBlocks.DarkSand.blockID;
		this.fillerBlock = (byte)IntegratedBlocks.DarkSand.blockID;
	}
}
