package Reactioncraft.currency.common;

import cpw.mods.fml.common.registry.VillagerRegistry;
import java.util.List;
import java.util.Random;
import net.minecraft.util.MathHelper;
import net.minecraft.world.gen.structure.ComponentVillageStartPiece;
import net.minecraft.world.gen.structure.StructureVillagePieceWeight;

public class HouseCreationHandler implements VillagerRegistry.IVillageCreationHandler 
{    
	public StructureVillagePieceWeight getVillagePieceWeight(Random random, int i) 
	{
        return new StructureVillagePieceWeight(ComponentRCVillageHouse.class, 3, MathHelper.getRandomIntegerInRange(random, 1 + i, 1 + i));
        		//, 3, MathHelper.getRandomIntegerInRange(random, 0, 1));   
	}
    public Class getComponentClass() {
        return ComponentRCVillageHouse.class;
    }
  
    public Object buildComponent(StructureVillagePieceWeight villagePiece, ComponentVillageStartPiece startPiece, List pieces, Random random, int p1, int p2, int p3, int p4, int p5) {
        return ComponentRCVillageHouse.buildComponent(startPiece, pieces, random, p1, p2, p3, p4, p5);
    }
}