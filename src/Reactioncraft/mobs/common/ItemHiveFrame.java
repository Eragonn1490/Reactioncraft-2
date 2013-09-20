package Reactioncraft.mobs.common;

import Reactioncraft.basefiles.common.ItemBasic;
import Reactioncraft.basemod.RCB;
import forestry.api.apiculture.IBee;
import forestry.api.apiculture.IBeeGenome;
import forestry.api.apiculture.IBeeHousing;
import forestry.api.apiculture.IHiveFrame;
import forestry.api.core.Tabs;
import net.minecraft.item.ItemStack;

public class ItemHiveFrame extends ItemBasic implements IHiveFrame
{
  private float geneticDecay;

  public ItemHiveFrame(int id, int maxDamage, float geneticDecay)
  {
    super(id);
    setMaxStackSize(1);
    setMaxDamage(maxDamage);
    this.geneticDecay = geneticDecay;
    setCreativeTab(RCB.ReactioncraftItems);
  }
  
  @Override
  public ItemStack frameUsed(IBeeHousing housing, ItemStack frame, IBee queen, int wear)
  {
    frame.setItemDamage(frame.getItemDamage() + wear);
    if (frame.getItemDamage() >= frame.getMaxDamage()) {
      return null;
    }
    return frame;
  }
  
  @Override
  public float getTerritoryModifier(IBeeGenome genome, float currentModifier)
  {
    return 6.0F;
  }
  
  @Override
  public float getMutationModifier(IBeeGenome genome, IBeeGenome mate, float currentModifier)
  {
    return 3.0F;
  }
  
  @Override
  public float getLifespanModifier(IBeeGenome genome, IBeeGenome mate, float currentModifier)
  {
    return 1.8F;
  }
  
  @Override
  public float getProductionModifier(IBeeGenome genome, float currentModifier)
  {
    return currentModifier < 12.0F ? 4.0F : 2.0F;
  }
  
  @Override
  public float getFloweringModifier(IBeeGenome genome, float currentModifier)
  {
    return 3.0F;
  }
  
  @Override
  public float getGeneticDecay(IBeeGenome genome, float currentModifier)
  {
    return this.geneticDecay;
  }
  
  @Override
  public boolean isSealed()
  {
    return true;
  }
  
  @Override
  public boolean isSelfLighted()
  {
    return true;
  }
  
  @Override
  public boolean isSunlightSimulated()
  {
    return true;
  }
  
  @Override
  public boolean isHellish()
  {
    return true;
  }
}