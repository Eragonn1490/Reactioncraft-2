package Reactioncraft.ore.common;

import Reactioncraft.ore.RCORES;
import cpw.mods.fml.common.IWorldGenerator;
import forestry.api.core.IPlugin;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldGenerator
  implements IWorldGenerator
{
  private WorldGenMinableMeta apatiteGenerator;
  private WorldGenMinableMeta copperGenerator;
  private WorldGenMinableMeta tinGenerator;
  private WorldGenMinableMeta ventiniteGenerator;

  public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
  {
    if (this.apatiteGenerator == null) 
    {
      //this.apatiteGenerator = new WorldGenMinableMeta(ForestryBlock.resources.blockID, 0, 36);
      //this.copperGenerator  = new WorldGenMinableMeta(ForestryBlock.resources.blockID, 1, 6);
      this.tinGenerator       = new WorldGenMinableMeta(RCORES.surfaceOres.blockID, 0, 6);
      this.ventiniteGenerator = new WorldGenMinableMeta(RCORES.surfaceOres.blockID, 1, 1);
    }

    chunkX <<= 4;
    chunkZ <<= 4;

//    if ((Config.generateApatiteOre) && 
//      (random.nextFloat() < 0.8F)) {
//      int randPosX = chunkX + random.nextInt(16);
//      int randPosY = random.nextInt(world.getActualHeight() - 72) + 56;
//      int randPosZ = chunkZ + random.nextInt(16);
//      if (this.apatiteGenerator.generate(world, random, randPosX, randPosY, randPosZ)) 
//      {
//        //Proxies.log.finest("Generated apatite vein around %s/%s/%s", new Object[] { Integer.valueOf(randPosX), Integer.valueOf(randPosY), Integer.valueOf(randPosZ) });
//      }
//    }
//
//    if (Config.generateCopperOre) 
//    {
//      for (int i = 0; i < 20; i++) 
//      {
//        int randPosX = chunkX + random.nextInt(16);
//        int randPosY = random.nextInt(76) + 32;
//        int randPosZ = chunkZ + random.nextInt(16);
//        this.copperGenerator.generate(world, random, randPosX, randPosY, randPosZ);
//      }
//    }
    
    if (RCORES.genVentinite.getBoolean(true)) {
        for (int i = 0; i < 18; i++) {
          int randPosX = chunkX + random.nextInt(16);
          int randPosY = random.nextInt(76) + 13;
          int randPosZ = chunkZ + random.nextInt(16);
          //System.out.println("[RCORES] silver generated");
          this.ventiniteGenerator.generate(world, random, randPosX, randPosY, randPosZ);
        }
      }

    if (RCORES.genSilver.getBoolean(true)) {
      for (int i = 0; i < 16; i++) {
        int randPosX = chunkX + random.nextInt(16);
        int randPosY = random.nextInt(76) + 30;
        int randPosZ = chunkZ + random.nextInt(16);
        //System.out.println("[RCORES] silver generated");
        this.tinGenerator.generate(world, random, randPosX, randPosY, randPosZ);
      }
    }
   }
}