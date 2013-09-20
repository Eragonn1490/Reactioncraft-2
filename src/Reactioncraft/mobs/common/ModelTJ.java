package Reactioncraft.mobs.common;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelTJ extends ModelBase
{
    private float wingspeed = 1.0F;

    ModelRenderer Sting;
    ModelRenderer Abdomnem1;
    ModelRenderer Abdomnem2;
    ModelRenderer Abdomnem3;
    ModelRenderer Abdomnem4;
    ModelRenderer Abdomnem5;
    ModelRenderer MainBody;
    ModelRenderer Neck;
    ModelRenderer Head;
    ModelRenderer WingRight;
    ModelRenderer WingLeft;
    ModelRenderer RA1;
    ModelRenderer LA1;
    ModelRenderer LA2;
    ModelRenderer RA2;
    ModelRenderer RA3;
    ModelRenderer LA3;
    ModelRenderer LeftPom;
    ModelRenderer RightPom;
    ModelRenderer LeftPincerExtra;
    ModelRenderer LeftPincerMain;
    ModelRenderer RightPincerMain;
    ModelRenderer RightPincerExtra;
  
  public ModelTJ(float f1)
  {
    this.wingspeed = f1;
    
    textureWidth = 256;
    textureHeight = 256;
    

    Sting = new ModelRenderer(this, 68, 0);
    Sting.addBox(-1F, 0F, -1F, 2, 10, 2);
    Sting.setRotationPoint(0F, 16F, 1F);
    Sting.setTextureSize(256, 256);
    Sting.mirror = true;
    setRotation(Sting, -0.7853982F, 0F, 0F);
    Abdomnem1 = new ModelRenderer(this, 64, 12);
    Abdomnem1.addBox(-2F, 0F, 0F, 4, 8, 4);
    Abdomnem1.setRotationPoint(0F, 9F, 2F);
    Abdomnem1.setTextureSize(256, 256);
    Abdomnem1.mirror = true;
    setRotation(Abdomnem1, -0.5235988F, 0F, 0F);
    Abdomnem2 = new ModelRenderer(this, 60, 24);
    Abdomnem2.addBox(-3F, 0F, 0F, 6, 6, 6);
    Abdomnem2.setRotationPoint(0F, 5F, 0F);
    Abdomnem2.setTextureSize(256, 256);
    Abdomnem2.mirror = true;
    setRotation(Abdomnem2, 0F, 0F, 0F);
    Abdomnem3 = new ModelRenderer(this, 56, 36);
    Abdomnem3.addBox(-4F, 0F, 0F, 8, 7, 8);
    Abdomnem3.setRotationPoint(0F, 1F, -2F);
    Abdomnem3.setTextureSize(256, 256);
    Abdomnem3.mirror = true;
    setRotation(Abdomnem3, 0.2617994F, 0F, 0F);
    Abdomnem4 = new ModelRenderer(this, 53, 51);
    Abdomnem4.addBox(-5F, 0F, 0F, 10, 12, 10);
    Abdomnem4.setRotationPoint(0F, -6F, -8F);
    Abdomnem4.setTextureSize(256, 256);
    Abdomnem4.mirror = true;
    setRotation(Abdomnem4, 0.5934119F, 0F, 0F);
    Abdomnem5 = new ModelRenderer(this, 48, 73);
    Abdomnem5.addBox(-6F, 0F, 0F, 12, 12, 12);
    Abdomnem5.setRotationPoint(0F, -6F, -15F);
    Abdomnem5.setTextureSize(256, 256);
    Abdomnem5.mirror = true;
    setRotation(Abdomnem5, 1.099557F, 0F, 0F);
      MainBody = new ModelRenderer(this, 48, 97);
      MainBody.addBox(-6F, 0F, -6F, 12, 14, 12);
      MainBody.setRotationPoint(0F, -12F, -24F);
      MainBody.setTextureSize(256, 256);
      MainBody.mirror = true;
      setRotation(MainBody, 1.48353F, 0F, 0F);
      Neck = new ModelRenderer(this, 55, 123);
      Neck.addBox(-4F, -4F, -8F, 8, 8, 8);
      Neck.setRotationPoint(0F, -12F, -23F);
      Neck.setTextureSize(256, 256);
      Neck.mirror = true;
      setRotation(Neck, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 51, 139);
      Head.addBox(-5F, -5F, -10F, 10, 10, 10);
      Head.setRotationPoint(0F, -13F, -28F);
      Head.setTextureSize(256, 256);
      Head.mirror = true;
      setRotation(Head, 0.2617994F, 0F, 0F);
      WingRight = new ModelRenderer(this, 0, 91);
      WingRight.addBox(0F, 0F, 0F, 0, 8, 24);
      WingRight.setRotationPoint(-4F, -14F, -15F);
      WingRight.setTextureSize(256, 256);
      WingRight.mirror = true;
      setRotation(WingRight, -0.7853982F, -0.5235988F, 2.617994F);
      WingLeft = new ModelRenderer(this, 96, 91);
      WingLeft.addBox(0F, 0F, 0F, 0, 8, 24);
      WingLeft.setRotationPoint(3F, -14F, -15F);
      WingLeft.setTextureSize(256, 256);
      WingLeft.mirror = true;
      setRotation(WingLeft, -0.7853982F, 0.5235988F, -2.617994F);
      RA1 = new ModelRenderer(this, 47, 152);
      RA1.addBox(0F, -6F, -1F, 1, 6, 1);
      RA1.setRotationPoint(-3F, -17F, -31F);
      RA1.setTextureSize(256, 256);
      RA1.mirror = true;
      setRotation(RA1, 0.2617994F, 0.5235988F, 0F);
      LA1 = new ModelRenderer(this, 91, 152);
      LA1.addBox(0F, -6F, -1F, 1, 6, 1);
      LA1.setRotationPoint(2F, -17F, -32F);
      LA1.setTextureSize(256, 256);
      LA1.mirror = true;
      setRotation(LA1, 0.2617994F, -0.5235988F, 0F);
      LA2 = new ModelRenderer(this, 91, 145);
      LA2.addBox(0F, -11F, 0F, 1, 6, 1);
      LA2.setRotationPoint(2F, -17F, -32F);
      LA2.setTextureSize(256, 256);
      LA2.mirror = true;
      setRotation(LA2, 0.4363323F, -0.6108652F, 0F);
      RA2 = new ModelRenderer(this, 47, 145);
      RA2.addBox(0F, -11F, 0F, 1, 6, 1);
      RA2.setRotationPoint(-3F, -17F, -31F);
      RA2.setTextureSize(256, 256);
      RA2.mirror = true;
      setRotation(RA2, 0.4363323F, 0.6108652F, 0F);
      RA3 = new ModelRenderer(this, 47, 138);
      RA3.addBox(0F, -16F, 2F, 1, 6, 1);
      RA3.setRotationPoint(-3F, -17F, -31F);
      RA3.setTextureSize(256, 256);
      RA3.mirror = true;
      setRotation(RA3, 0.6108652F, 0.6981317F, 0F);
      LA3 = new ModelRenderer(this, 91, 138);
      LA3.addBox(0F, -16F, 2F, 1, 6, 1);
      LA3.setRotationPoint(2F, -17F, -32F);
      LA3.setTextureSize(256, 256);
      LA3.mirror = true;
      setRotation(LA3, 0.6108652F, -0.6981317F, 0F);
      LeftPom = new ModelRenderer(this, 89, 134);
      LeftPom.addBox(4F, -16F, -6F, 2, 2, 2);
      LeftPom.setRotationPoint(2F, -17F, -32F);
      LeftPom.setTextureSize(256, 256);
      LeftPom.mirror = true;
      setRotation(LeftPom, 0F, 0F, 0F);
      RightPom = new ModelRenderer(this, 45, 134);
      RightPom.addBox(-5F, -16F, -7F, 2, 2, 2);
      RightPom.setRotationPoint(-3F, -17F, -31F);
      RightPom.setTextureSize(256, 256);
      RightPom.mirror = true;
      setRotation(RightPom, 0F, 0F, 0F);
      LeftPincerExtra = new ModelRenderer(this, 71, 166);
      LeftPincerExtra.addBox(-2F, 0F, -6F, 2, 1, 2);
      LeftPincerExtra.setRotationPoint(2F, -8F, -36F);
      LeftPincerExtra.setTextureSize(256, 256);
      LeftPincerExtra.mirror = true;
      setRotation(LeftPincerExtra, 0.1745329F, -0.1745329F, 0F);
      LeftPincerMain = new ModelRenderer(this, 71, 159);
      LeftPincerMain.addBox(0F, 0F, -6F, 2, 1, 6);
      LeftPincerMain.setRotationPoint(2F, -8F, -36F);
      LeftPincerMain.setTextureSize(256, 256);
      LeftPincerMain.mirror = true;
      setRotation(LeftPincerMain, 0.1745329F, -0.1745329F, 0F);
      RightPincerMain = new ModelRenderer(this, 55, 159);
      RightPincerMain.addBox(0F, 0F, -6F, 2, 1, 6);
      RightPincerMain.setRotationPoint(-4F, -8F, -36F);
      RightPincerMain.setTextureSize(256, 256);
      RightPincerMain.mirror = true;
      setRotation(RightPincerMain, 0.1745329F, 0.1745329F, 0F);
      RightPincerExtra = new ModelRenderer(this, 63, 166);
      RightPincerExtra.addBox(2F, 0F, -6F, 2, 1, 2);
      RightPincerExtra.setRotationPoint(-4F, -8F, -36F);
      RightPincerExtra.setTextureSize(256, 256);
      RightPincerExtra.mirror = true;
      setRotation(RightPincerExtra, 0.1745329F, 0.1745329F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
	  float newangle = 0.0F;
	  EntityTJ b = (EntityTJ)entity;
	  
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
    
    //wings
    newangle = MathHelper.cos(f2 * 1.1F * this.wingspeed) * (float)Math.PI * 0.30F;
    this.WingLeft.rotateAngleZ = -1.745f - newangle;
    this.WingRight.rotateAngleZ = 1.754f + newangle;

    //pincers
    newangle = MathHelper.cos(f2 * 0.3F * this.wingspeed) * (float)Math.PI * 0.1F;
    this.LeftPincerMain.rotateAngleY = -0.274f + newangle;
    this.LeftPincerExtra.rotateAngleY = -0.274f + newangle;
    this.RightPincerMain.rotateAngleY = 0.274f - newangle;
    this.RightPincerExtra.rotateAngleY = 0.274f - newangle;
    
    //wiggly stupid antenna
    newangle = MathHelper.cos(f2 * 0.21F * this.wingspeed ) * (float)Math.PI * 0.06F;
    LA1.rotateAngleX = 0.261f + newangle;
    LA2.rotateAngleX = 0.436f + newangle;
    LA3.rotateAngleX = 0.611f + newangle;
    LeftPom.rotateAngleX = newangle;
    newangle = MathHelper.cos(f2 * 0.27F * this.wingspeed ) * (float)Math.PI * 0.06F;
    RA1.rotateAngleX = 0.261f + newangle;
    RA2.rotateAngleX = 0.436f + newangle;
    RA3.rotateAngleX = 0.611f +newangle;
    RightPom.rotateAngleX = newangle;
    
    newangle = MathHelper.cos(f2 * 0.31F * this.wingspeed ) * (float)Math.PI * 0.06F;
    LA1.rotateAngleZ = newangle;
    LA2.rotateAngleZ = newangle;
    LA3.rotateAngleZ = newangle;
    LeftPom.rotateAngleZ = newangle;
    newangle = MathHelper.cos(f2 * 0.37F * this.wingspeed ) * (float)Math.PI * 0.06F;
    RA1.rotateAngleZ = newangle;
    RA2.rotateAngleZ = newangle;
    RA3.rotateAngleZ = newangle;
    RightPom.rotateAngleZ = newangle;
    
    
    //ABDOMEN and stinger
    if(b.getAttacking() == 0){
    	newangle = MathHelper.cos(f2 * 0.021F * this.wingspeed ) * (float)Math.PI * 0.023F;
    }else{
    	newangle = MathHelper.cos(f2 * 0.11F * this.wingspeed ) * (float)Math.PI * 0.055F;
    }
	//First, the easy one...
    Abdomnem5.rotateAngleX = 1.099F + (newangle);
	  
	//Now for the hard ones. Ugh.
    Abdomnem4.rotateAngleX = Abdomnem5.rotateAngleX + (newangle) - 0.35f;
    Abdomnem4.rotationPointY = (float) (Abdomnem5.rotationPointY + Math.cos(Abdomnem5.rotateAngleX) * 10.0F);
    Abdomnem4.rotationPointZ = (float) (Abdomnem5.rotationPointZ + Math.sin(Abdomnem5.rotateAngleX) * 10.0F);
	  
    Abdomnem3.rotateAngleX = Abdomnem4.rotateAngleX + (newangle) - 0.35f;
    Abdomnem3.rotationPointY = (float) (Abdomnem4.rotationPointY + Math.cos(Abdomnem4.rotateAngleX) * 10.0F);
    Abdomnem3.rotationPointZ = (float) (Abdomnem4.rotationPointZ + Math.sin(Abdomnem4.rotateAngleX) * 10.0F);  
    
    Abdomnem2.rotateAngleX = Abdomnem3.rotateAngleX + (newangle) - 0.35f;
    Abdomnem2.rotationPointY = (float) (Abdomnem3.rotationPointY + Math.cos(Abdomnem3.rotateAngleX) * 6.0F);
    Abdomnem2.rotationPointZ = (float) (Abdomnem3.rotationPointZ + Math.sin(Abdomnem3.rotateAngleX) * 6.0F);
	  
    Abdomnem1.rotateAngleX = Abdomnem2.rotateAngleX + (newangle) - 0.35f;
    Abdomnem1.rotationPointY = (float) (Abdomnem2.rotationPointY + Math.cos(Abdomnem2.rotateAngleX) * 5.0F);
    Abdomnem1.rotationPointZ = (float) (Abdomnem2.rotationPointZ + Math.sin(Abdomnem2.rotateAngleX) * 5.0F);
	  
    Sting.rotateAngleX = Abdomnem1.rotateAngleX + (newangle) - 0.35f;
    Sting.rotationPointY = (float) (Abdomnem1.rotationPointY + Math.cos(Abdomnem1.rotateAngleX) * 7.0F);
    Sting.rotationPointZ = 1.0f + (float) (Abdomnem1.rotationPointZ + Math.sin(Abdomnem1.rotateAngleX) * 7.0F);
    
    
    
    Sting.render(f5);
    Abdomnem1.render(f5);
    Abdomnem2.render(f5);
    Abdomnem3.render(f5);
    Abdomnem4.render(f5);
    Abdomnem5.render(f5);
    MainBody.render(f5);
    Neck.render(f5);
    Head.render(f5);
    WingRight.render(f5);
    WingLeft.render(f5);
    RA1.render(f5);
    LA1.render(f5);
    LA2.render(f5);
    RA2.render(f5);
    RA3.render(f5);
    LA3.render(f5);
    LeftPom.render(f5);
    RightPom.render(f5);
    LeftPincerExtra.render(f5);
    LeftPincerMain.render(f5);
    RightPincerMain.render(f5);
    RightPincerExtra.render(f5);

    
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
