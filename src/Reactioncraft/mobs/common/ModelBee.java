package Reactioncraft.mobs.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SideOnly(Side.CLIENT)
public class ModelBee extends ModelBase
{
  //fields
    ModelRenderer body;
    ModelRenderer wing;
    ModelRenderer wing2;
  
  public ModelBee()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      body = new ModelRenderer(this, 0, 0);
      body.addBox(0F, 0F, 0F, 1, 1, 3);
      body.setRotationPoint(-1F, 21F, -1F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      wing = new ModelRenderer(this, 0, 4);
      wing.addBox(0F, 0F, 0F, 1, 0, 1);
      wing.setRotationPoint(0F, 21F, 0F);
      wing.setTextureSize(64, 32);
      wing.mirror = true;
      setRotation(wing, 0F, 0F, 0F);
      wing2 = new ModelRenderer(this, 0, 4);
      wing2.addBox(0F, 0F, 0F, 1, 0, 1);
      wing2.setRotationPoint(-2F, 21F, 0F);
      wing2.setTextureSize(64, 32);
      wing2.mirror = true;
      setRotation(wing2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    body.render(f5);
    wing.render(f5);
    wing2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
