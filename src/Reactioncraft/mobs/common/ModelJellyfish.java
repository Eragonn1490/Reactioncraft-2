package Reactioncraft.mobs.common;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelJellyfish extends ModelBase
{
    ModelRenderer Head;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;

    public ModelJellyfish()
    {
        textureWidth = 32;
        textureHeight = 32;
        Head = new ModelRenderer(this, 0, 0);
        Head.addBox(0.0F, 0.0F, 0.0F, 5, 4, 5);
        Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        Head.setTextureSize(32, 32);
        Head.mirror = true;
        setRotation(Head, 0.0F, 0.0F, 0.0F);
        Leg1 = new ModelRenderer(this, 0, 9);
        Leg1.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1);
        Leg1.setRotationPoint(1.0F, 3F, 1.0F);
        Leg1.setTextureSize(32, 32);
        Leg1.mirror = true;
        setRotation(Leg1, 0.0F, 0.0F, 0.0F);
        Leg2 = new ModelRenderer(this, 0, 9);
        Leg2.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1);
        Leg2.setRotationPoint(4F, 3F, 1.0F);
        Leg2.setTextureSize(32, 32);
        Leg2.mirror = true;
        setRotation(Leg2, 0.0F, 0.0F, 0.0F);
        Leg3 = new ModelRenderer(this, 0, 9);
        Leg3.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1);
        Leg3.setRotationPoint(4F, 3F, 4F);
        Leg3.setTextureSize(32, 32);
        Leg3.mirror = true;
        setRotation(Leg3, 0.0F, 0.0F, 0.0F);
        Leg4 = new ModelRenderer(this, 0, 9);
        Leg4.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1);
        Leg4.setRotationPoint(1.0F, 3F, 4F);
        Leg4.setTextureSize(32, 32);
        Leg4.mirror = true;
        setRotation(Leg4, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Head.render(f5);
        Leg1.render(f5);
        Leg2.render(f5);
        Leg3.render(f5);
        Leg4.render(f5);
    }

    private void setRotation(ModelRenderer modelrenderer, float f, float f1, float f2)
    {
        modelrenderer.rotateAngleX = f;
        modelrenderer.rotateAngleY = f1;
        modelrenderer.rotateAngleZ = f2;
    }

    /**
     * Sets the models various rotation angles.
     */
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, EntityLiving entityliving)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entityliving);
        Leg1.rotateAngleY = (float)Math.sin(f2 * 0.25F) * 0.25F;
        Leg2.rotateAngleY = (float)Math.sin(f2 * 0.25F) * 0.25F;
        Leg3.rotateAngleY = (float)Math.sin(f2 * 0.25F) * 0.25F;
        Leg4.rotateAngleY = (float)Math.sin(f2 * 0.25F) * 0.25F;
    }
}
