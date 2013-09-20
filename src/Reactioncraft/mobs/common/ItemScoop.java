package Reactioncraft.mobs.common;

import Reactioncraft.basefiles.common.ItemBasic;
import Reactioncraft.basemod.RCB;
import forestry.api.core.IToolScoop;
import forestry.api.core.Tabs;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;

public class ItemScoop extends ItemBasic implements IToolScoop
{
  private float efficiencyOnProperMaterial;

  public ItemScoop(int i)
  {
    super(i);
    this.maxStackSize = 1;
    this.efficiencyOnProperMaterial = 4.0F;
    setMaxDamage(20);
    setCreativeTab(RCB.ReactioncraftItems);
  }

  public float getStrVsBlock(ItemStack itemstack, Block block)
  {
    return 1.0F;
  }

  public float getStrVsBlock(ItemStack itemstack, Block block, int md)
  {
    if (ForgeHooks.isToolEffective(itemstack, block, md)) {
      return this.efficiencyOnProperMaterial;
    }
    return getStrVsBlock(itemstack, block);
  }

  public boolean onBlockDestroyed(ItemStack itemstack, World world, int i, int j, int k, int l, EntityLivingBase entityliving)
  {
    itemstack.damageItem(1, entityliving);
    return true;
  }

  public float getDamageVsEntity(Entity entity, ItemStack itemstack)
  {
    return 1.0F;
  }

  public boolean isFull3D() {
    return true;
  }
}