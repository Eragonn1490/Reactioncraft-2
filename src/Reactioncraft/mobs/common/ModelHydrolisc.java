package Reactioncraft.mobs.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

@SideOnly(Side.CLIENT)
public class ModelHydrolisc extends ModelBase
{
    private float wingspeed = 1.0F;

    ModelRenderer tail2;
    ModelRenderer tail3;
    ModelRenderer body2;
    ModelRenderer lb2;
    ModelRenderer lb1;
    ModelRenderer spine3;
    ModelRenderer spine4;
    ModelRenderer rb1;
    ModelRenderer rb2;
    ModelRenderer spine1;
    ModelRenderer spine2;
    ModelRenderer lb3;
    ModelRenderer rb3;
    ModelRenderer body1;
    ModelRenderer body0;
    ModelRenderer lf1;
    ModelRenderer rf1;
    ModelRenderer rb6;
    ModelRenderer rb4;
    ModelRenderer rb5;
    ModelRenderer lb6;
    ModelRenderer lb5;
    ModelRenderer lb4;
    ModelRenderer head3;
    ModelRenderer feather3;
    ModelRenderer feather1;
    ModelRenderer feather2;
    ModelRenderer head1;
    ModelRenderer rf2;
    ModelRenderer rf3;
    ModelRenderer rf4;
    ModelRenderer rf5;
    ModelRenderer rf6;
    ModelRenderer lf2;
    ModelRenderer lf3;
    ModelRenderer lf4;
    ModelRenderer lf5;
    ModelRenderer lf6;
    ModelRenderer head2;
    ModelRenderer tail1;

    
  public ModelHydrolisc(float f1)
  {
    this.wingspeed = f1;
    
      textureWidth = 64;
      textureHeight = 128;
    
      tail2 = new ModelRenderer(this, 29, 3);
      tail2.addBox(-1F, 0F, -0.8F, 2, 8, 2);
      tail2.setRotationPoint(1F, 20F, 13.53333F);
      tail2.setTextureSize(64, 128);
      tail2.mirror = true;
      setRotation(tail2, 1.392442F, 0F, 0F);
      tail3 = new ModelRenderer(this, 39, 0);
      tail3.addBox(-1F, -1F, -2F, 2, 8, 2);
      tail3.setRotationPoint(1F, 20F, 21F);
      tail3.setTextureSize(64, 128);
      tail3.mirror = true;
      setRotation(tail3, 1.72705F, 0F, 0F);
      body2 = new ModelRenderer(this, 0, 99);
      body2.addBox(-2F, 14F, 0F, 6, 4, 10);
      body2.setRotationPoint(0F, 0F, 0F);
      body2.setTextureSize(64, 128);
      body2.mirror = true;
      setRotation(body2, -0.0523599F, 0F, 0F);
      lb2 = new ModelRenderer(this, 45, 13);
      lb2.addBox(0F, 0F, 3F, 3, 2, 5);
      lb2.setRotationPoint(5F, 15F, 0F);
      lb2.setTextureSize(64, 128);
      lb2.mirror = true;
      setRotation(lb2, -0.4886922F, 0F, 0F);
      lb1 = new ModelRenderer(this, 46, 22);
      lb1.addBox(-1F, 0F, 0F, 4, 3, 3);
      lb1.setRotationPoint(5F, 15F, 0F);
      lb1.setTextureSize(64, 128);
      lb1.mirror = true;
      setRotation(lb1, 0F, 0F, 0F);
      spine3 = new ModelRenderer(this, 11, 31);
      spine3.addBox(-1F, -5F, 0F, 2, 6, 2);
      spine3.setRotationPoint(1F, 14F, 6F);
      spine3.setTextureSize(64, 128);
      spine3.mirror = true;
      setRotation(spine3, -1.117011F, 0F, 0F);
      spine4 = new ModelRenderer(this, 0, 30);
      spine4.addBox(-1F, -10.5F, -1F, 2, 6, 2);
      spine4.setRotationPoint(1F, 14F, 6F);
      spine4.setTextureSize(64, 128);
      spine4.mirror = true;
      setRotation(spine4, -1.343904F, 0F, 0F);
      rb1 = new ModelRenderer(this, 46, 22);
      rb1.addBox(-4F, 0F, 0F, 4, 3, 3);
      rb1.setRotationPoint(-2F, 15F, 0F);
      rb1.setTextureSize(64, 128);
      rb1.mirror = true;
      setRotation(rb1, 0F, 0F, 0F);
      rb2 = new ModelRenderer(this, 45, 13);
      rb2.addBox(-4F, 0F, 2F, 3, 2, 5);
      rb2.setRotationPoint(-2F, 15F, 0F);
      rb2.setTextureSize(64, 128);
      rb2.mirror = true;
      setRotation(rb2, -0.4886922F, 0F, 0F);
      spine1 = new ModelRenderer(this, 33, 19);
      spine1.addBox(-1F, -5F, 0F, 2, 6, 2);
      spine1.setRotationPoint(1F, 14F, 0F);
      spine1.setTextureSize(64, 128);
      spine1.mirror = true;
      setRotation(spine1, -0.8552113F, 0F, 0F);
      spine2 = new ModelRenderer(this, 21, 19);
      spine2.addBox(-1F, -10.5F, -1.5F, 2, 6, 2);
      spine2.setRotationPoint(1F, 14F, 0F);
      spine2.setTextureSize(64, 128);
      spine2.mirror = true;
      setRotation(spine2, -1.169371F, 0F, 0F);
      lb3 = new ModelRenderer(this, 0, 58);
      lb3.addBox(0F, -8F, -2F, 3, 2, 6);
      lb3.setRotationPoint(5F, 15F, 0F);
      lb3.setTextureSize(64, 128);
      lb3.mirror = true;
      setRotation(lb3, -2.347623F, 0F, 0F);
      rb3 = new ModelRenderer(this, 0, 58);
      rb3.addBox(-4F, -8F, -2F, 3, 2, 6);
      rb3.setRotationPoint(-2F, 15F, 0F);
      rb3.setTextureSize(64, 128);
      rb3.mirror = true;
      setRotation(rb3, -2.347623F, 0F, 0F);
      body1 = new ModelRenderer(this, 0, 79);
      body1.addBox(-2F, 16F, -7F, 4, 2, 5);
      body1.setRotationPoint(1F, -1F, 2F);
      body1.setTextureSize(64, 128);
      body1.mirror = true;
      setRotation(body1, 0F, 0F, 0F);
      body0 = new ModelRenderer(this, 0, 0);
      body0.addBox(-1F, 14F, -13F, 4, 3, 10);
      body0.setRotationPoint(0F, 0F, 0F);
      body0.setTextureSize(64, 128);
      body0.mirror = true;
      setRotation(body0, 0.0523599F, 0F, 0F);
      lf1 = new ModelRenderer(this, 45, 32);
      lf1.addBox(-1F, 0F, -2F, 4, 3, 3);
      lf1.setRotationPoint(4F, 14F, -7F);
      lf1.setTextureSize(64, 128);
      lf1.mirror = true;
      setRotation(lf1, 0F, 0F, 0F);
      rf1 = new ModelRenderer(this, 45, 32);
      rf1.addBox(-3F, 0F, -2F, 4, 3, 3);
      rf1.setRotationPoint(-2F, 14F, -7F);
      rf1.setTextureSize(64, 128);
      rf1.mirror = true;
      setRotation(rf1, 0F, 0F, 0F);
      rb6 = new ModelRenderer(this, 30, 39);
      rb6.addBox(-3.5F, 7F, 2F, 2, 3, 1);
      rb6.setRotationPoint(-2F, 15F, 0F);
      rb6.setTextureSize(64, 128);
      rb6.mirror = true;
      setRotation(rb6, 0.1745329F, 0F, 0F);
      rb4 = new ModelRenderer(this, 20, 39);
      rb4.addBox(-2F, 3F, 6F, 1, 4, 1);
      rb4.setRotationPoint(-2F, 15F, 0F);
      rb4.setTextureSize(64, 128);
      rb4.mirror = true;
      setRotation(rb4, -0.6283185F, 0F, 0F);
      rb5 = new ModelRenderer(this, 20, 39);
      rb5.addBox(-4F, 3F, 6F, 1, 4, 1);
      rb5.setRotationPoint(-2F, 15F, 0F);
      rb5.setTextureSize(64, 128);
      rb5.mirror = true;
      setRotation(rb5, -0.6283185F, 0F, 0F);
      lb6 = new ModelRenderer(this, 30, 39);
      lb6.addBox(0.5F, 7F, 2F, 2, 3, 1);
      lb6.setRotationPoint(5F, 15F, 0F);
      lb6.setTextureSize(64, 128);
      lb6.mirror = true;
      setRotation(lb6, 0.1745329F, 0F, 0F);
      lb5 = new ModelRenderer(this, 20, 39);
      lb5.addBox(2F, 3F, 6F, 1, 4, 1);
      lb5.setRotationPoint(5F, 15F, 0F);
      lb5.setTextureSize(64, 128);
      lb5.mirror = true;
      setRotation(lb5, -0.6283185F, 0F, 0F);
      lb4 = new ModelRenderer(this, 20, 39);
      lb4.addBox(0F, 3F, 6F, 1, 4, 1);
      lb4.setRotationPoint(5F, 15F, 0F);
      lb4.setTextureSize(64, 128);
      lb4.mirror = true;
      setRotation(lb4, -0.6283185F, 0F, 0F);
      head3 = new ModelRenderer(this, 38, 50);
      head3.addBox(0F, 0F, 0F, 4, 2, 8);
      head3.setRotationPoint(-1F, 15F, -13F);
      head3.setTextureSize(64, 128);
      head3.mirror = true;
      setRotation(head3, 0.5235988F, 0F, 0F);
      feather3 = new ModelRenderer(this, 25, 117);
      feather3.addBox(0F, 0F, 1F, 1, 2, 9);
      feather3.setRotationPoint(1F, 12F, -8F);
      feather3.setTextureSize(64, 128);
      feather3.mirror = true;
      setRotation(feather3, 0.3490659F, 0.2617994F, 0F);
      feather1 = new ModelRenderer(this, 34, 100);
      feather1.addBox(0F, 0F, 1F, 1, 2, 9);
      feather1.setRotationPoint(0F, 12F, -8F);
      feather1.setTextureSize(64, 128);
      feather1.mirror = true;
      setRotation(feather1, 0.3490659F, -0.2617994F, 0F);
      feather2 = new ModelRenderer(this, 0, 116);
      feather2.addBox(0F, 0F, 0F, 1, 2, 10);
      feather2.setRotationPoint(0.5F, 11F, -6F);
      feather2.setTextureSize(64, 128);
      feather2.mirror = true;
      setRotation(feather2, 0.3490659F, 0F, 0F);
      head1 = new ModelRenderer(this, 38, 41);
      head1.addBox(0F, 0F, 0F, 4, 3, 4);
      head1.setRotationPoint(-1F, 15F, -15F);
      head1.setTextureSize(64, 128);
      head1.mirror = true;
      setRotation(head1, 0.1396263F, 0F, 0F);
      rf2 = new ModelRenderer(this, 19, 58);
      rf2.addBox(-3F, 0F, 0F, 3, 3, 6);
      rf2.setRotationPoint(-2F, 14F, -7F);
      rf2.setTextureSize(64, 128);
      rf2.mirror = true;
      setRotation(rf2, -0.4886922F, 0F, 0F);
      rf3 = new ModelRenderer(this, 19, 47);
      rf3.addBox(-3F, -7F, 0F, 3, 3, 6);
      rf3.setRotationPoint(-2F, 14F, -7F);
      rf3.setTextureSize(64, 128);
      rf3.mirror = true;
      setRotation(rf3, -2.347623F, 0F, 0F);
      rf4 = new ModelRenderer(this, 20, 39);
      rf4.addBox(0F, 6F, 4F, 1, 4, 1);
      rf4.setRotationPoint(-3F, 14F, -7F);
      rf4.setTextureSize(64, 128);
      rf4.mirror = true;
      setRotation(rf4, -0.6283185F, 0F, 0F);
      rf5 = new ModelRenderer(this, 20, 39);
      rf5.addBox(-2F, 6F, 4F, 1, 4, 1);
      rf5.setRotationPoint(-3F, 14F, -7F);
      rf5.setTextureSize(64, 128);
      rf5.mirror = true;
      setRotation(rf5, -0.6283185F, 0F, 0F);
      rf6 = new ModelRenderer(this, 30, 39);
      rf6.addBox(-2.5F, 6F, 0F, 2, 5, 1);
      rf6.setRotationPoint(-2F, 14F, -7F);
      rf6.setTextureSize(64, 128);
      rf6.mirror = true;
      setRotation(rf6, 0.1745329F, 0F, 0F);
      lf2 = new ModelRenderer(this, 19, 58);
      lf2.addBox(0F, 0F, 0F, 3, 3, 6);
      lf2.setRotationPoint(4F, 14F, -7F);
      lf2.setTextureSize(64, 128);
      lf2.mirror = true;
      setRotation(lf2, -0.4886922F, 0F, 0F);
      lf3 = new ModelRenderer(this, 19, 47);
      lf3.addBox(0F, -7F, 0F, 3, 3, 6);
      lf3.setRotationPoint(4F, 14F, -7F);
      lf3.setTextureSize(64, 128);
      lf3.mirror = true;
      setRotation(lf3, -2.347623F, 0F, 0F);
      lf4 = new ModelRenderer(this, 20, 39);
      lf4.addBox(0F, 6F, 4F, 1, 4, 1);
      lf4.setRotationPoint(4F, 14F, -7F);
      lf4.setTextureSize(64, 128);
      lf4.mirror = true;
      setRotation(lf4, -0.6283185F, 0F, 0F);
      lf5 = new ModelRenderer(this, 20, 39);
      lf5.addBox(2F, 6F, 4F, 1, 4, 1);
      lf5.setRotationPoint(4F, 14F, -7F);
      lf5.setTextureSize(64, 128);
      lf5.mirror = true;
      setRotation(lf5, -0.6283185F, 0F, 0F);
      lf6 = new ModelRenderer(this, 30, 39);
      lf6.addBox(0.5F, 6F, -2F, 2, 5, 1);
      lf6.setRotationPoint(4F, 14F, -5F);
      lf6.setTextureSize(64, 128);
      lf6.mirror = true;
      setRotation(lf6, 0.1745329F, 0F, 0F);
      head2 = new ModelRenderer(this, 19, 80);
      head2.addBox(-1F, 16F, -16F, 4, 1, 5);
      head2.setRotationPoint(0F, 0F, 0F);
      head2.setTextureSize(64, 128);
      head2.mirror = true;
      setRotation(head2, 0.1047198F, 0F, 0F);
      tail1 = new ModelRenderer(this, 9, 18);
      tail1.addBox(-1F, -1F, -3F, 2, 8, 2);
      tail1.setRotationPoint(1F, 15F, 9F);
      tail1.setTextureSize(64, 128);
      tail1.mirror = true;
      setRotation(tail1, 1.095163F, 0F, 0F);

  }
  
  //f1 is scaled for movement speed! Yay!
  //f3 is head rotation to look at player, in degrees
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    EntityHydrolisc c = (EntityHydrolisc)entity;
    float hf = 0.0F; 
    float newangle = 0;
    
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
    //System.out.printf("floats: %f,  %f, %f, %f, %f, %f\n", f, f1, f2, f3, f4, f5);
    if(f1 > 0.1){
    	newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed ) * (float)Math.PI * 0.25F * f1;
    }else{
    	newangle = 0.0F;
    }
    
    //Leg motion
    this.lf1.rotateAngleX = newangle;
    this.lf2.rotateAngleX = newangle - 0.488F;
    this.lf3.rotateAngleX = newangle - 2.347F;
    this.lf4.rotateAngleX = newangle - 0.628F;
    this.lf5.rotateAngleX = newangle - 0.628F;
    this.lf6.rotateAngleX = newangle + 0.174F;

    this.rf1.rotateAngleX = -newangle;
    this.rf2.rotateAngleX = -newangle - 0.488F;
    this.rf3.rotateAngleX = -newangle - 2.347F;
    this.rf4.rotateAngleX = -newangle - 0.628F;
    this.rf5.rotateAngleX = -newangle - 0.628F;
    this.rf6.rotateAngleX = -newangle + 0.174F;
    
    this.lb1.rotateAngleX = -newangle;
    this.lb2.rotateAngleX = -newangle - 0.488F;
    this.lb3.rotateAngleX = -newangle - 2.347F;
    this.lb4.rotateAngleX = -newangle - 0.628F;
    this.lb5.rotateAngleX = -newangle - 0.628F;
    this.lb6.rotateAngleX = -newangle + 0.174F;

    this.rb1.rotateAngleX = newangle;
    this.rb2.rotateAngleX = newangle - 0.488F;
    this.rb3.rotateAngleX = newangle - 2.347F;
    this.rb4.rotateAngleX = newangle - 0.628F;
    this.rb5.rotateAngleX = newangle - 0.628F;
    this.rb6.rotateAngleX = newangle + 0.174F;

    //Tail just wags unless sitting
    newangle = MathHelper.cos(f2 * 1.0F * this.wingspeed) * (float)Math.PI * 0.15F;
    if(c.isSitting() == true){
    	newangle = 0; //Tail stops when sitting!
    }
    this.tail1.rotateAngleY = newangle * 0.25F;
    this.tail2.rotationPointZ = this.tail1.rotationPointZ + (float)Math.cos(this.tail1.rotateAngleY)*5;
    this.tail2.rotationPointX = this.tail1.rotationPointX + (float)Math.sin(this.tail1.rotateAngleY)*5;
    this.tail2.rotateAngleY = newangle * 0.5F;
    this.tail3.rotationPointZ = this.tail2.rotationPointZ + (float)Math.cos(this.tail2.rotateAngleY)*8;
    this.tail3.rotationPointX = this.tail2.rotationPointX + (float)Math.sin(this.tail2.rotateAngleY)*8;
    this.tail3.rotateAngleY = newangle * 0.75F;

    //Head feathers reflects health, both speed and amplitude    
    hf = (float)c.getHydroHealth()/(float)c.getMaxHealth();
    newangle = MathHelper.cos(f2 * 1.25F * this.wingspeed * hf) * (float)Math.PI * 0.20F * hf;
    this.feather2.rotateAngleY = newangle;
    newangle = MathHelper.cos(f2 * 0.75F * this.wingspeed * hf) * (float)Math.PI * 0.20F * hf;
    this.feather1.rotateAngleY = newangle - 0.90F;
    this.feather3.rotateAngleY = -newangle + 0.90F;


    tail2.render(f5);
    tail3.render(f5);
    body2.render(f5);
    lb2.render(f5);
    lb1.render(f5);
    spine3.render(f5);
    spine4.render(f5);
    rb1.render(f5);
    rb2.render(f5);
    spine1.render(f5);
    spine2.render(f5);
    lb3.render(f5);
    rb3.render(f5);
    body1.render(f5);
    body0.render(f5);
    lf1.render(f5);
    rf1.render(f5);
    rb6.render(f5);
    rb4.render(f5);
    rb5.render(f5);
    lb6.render(f5);
    lb5.render(f5);
    lb4.render(f5);
    head3.render(f5);
    feather3.render(f5);
    feather1.render(f5);
    feather2.render(f5);
    head1.render(f5);
    rf2.render(f5);
    rf3.render(f5);
    rf4.render(f5);
    rf5.render(f5);
    rf6.render(f5);
    lf2.render(f5);
    lf3.render(f5);
    lf4.render(f5);
    lf5.render(f5);
    lf6.render(f5);
    head2.render(f5);
    tail1.render(f5);


  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
  }
  

}
