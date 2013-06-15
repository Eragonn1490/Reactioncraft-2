package Reactioncraft.mobs.common;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelSeaCreeper extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer top_fin_second_peice;
    ModelRenderer top_fin_first_peice;

    public ModelSeaCreeper()
    {
        textureWidth = 64;
        textureHeight = 32;
        head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0.0F, 11F, -11F);
        head.setTextureSize(64, 32);
        head.mirror = true;
        setRotation(head, 0.0F, 0.0F, 0.0F);
        body = new ModelRenderer(this, 16, 16);
        body.addBox(-4F, 0.0F, -2F, 8, 12, 4);
        body.setRotationPoint(0.0F, 7F, -7F);
        body.setTextureSize(64, 32);
        body.mirror = true;
        setRotation(body, 1.588146F, 0.0F, 0.0F);
        leg3 = new ModelRenderer(this, 0, 16);
        leg3.addBox(-2F, 0.0F, -1F, 4, 6, 4);
        leg3.setRotationPoint(-2F, 8F, 5F);
        leg3.setTextureSize(64, 32);
        leg3.mirror = true;
        setRotation(leg3, 1.561502F, -0.2230717F, 0.0F);
        leg4 = new ModelRenderer(this, 0, 16);
        leg4.addBox(-2F, 0.0F, 1.0F, 4, 6, 4);
        leg4.setRotationPoint(2.0F, 10F, 5F);
        leg4.setTextureSize(64, 32);
        leg4.mirror = true;
        setRotation(leg4, 1.561502F, 0.2974289F, 0.0F);
        leg1 = new ModelRenderer(this, 0, 16);
        leg1.addBox(0.0F, 0.0F, -2F, 4, 6, 4);
        leg1.setRotationPoint(-7F, 7F, 3F);
        leg1.setTextureSize(64, 32);
        leg1.mirror = true;
        setRotation(leg1, 1.59868F, -0.4089647F, 0.0F);
        leg2 = new ModelRenderer(this, 0, 16);
        leg2.addBox(-2F, 0.0F, -2F, 4, 6, 4);
        leg2.setRotationPoint(5F, 7F, 4F);
        leg2.setTextureSize(64, 32);
        leg2.mirror = true;
        setRotation(leg2, 1.59868F, 0.5205006F, 0.0F);
        top_fin_second_peice = new ModelRenderer(this, 8, 5);
        top_fin_second_peice.addBox(0.0F, 2.0F, 0.0F, 2, 1, 3);
        top_fin_second_peice.setRotationPoint(-1F, 0.0F, -2F);
        top_fin_second_peice.setTextureSize(64, 32);
        top_fin_second_peice.mirror = true;
        setRotation(top_fin_second_peice, 0.0F, 0.0F, 0.0F);
        top_fin_first_peice = new ModelRenderer(this, 5, 3);
        top_fin_first_peice.addBox(0.0F, 0.0F, 0.0F, 2, 2, 7);
        top_fin_first_peice.setRotationPoint(-1F, 3F, -4F);
        top_fin_first_peice.setTextureSize(64, 32);
        top_fin_first_peice.mirror = true;
        setRotation(top_fin_first_peice, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        head.render(f5);
        body.render(f5);
        leg3.render(f5);
        leg4.render(f5);
        leg1.render(f5);
        leg2.render(f5);
        top_fin_second_peice.render(f5);
        top_fin_first_peice.render(f5);
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
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, EntityLiving entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        leg1.rotateAngleY = (float)Math.sin(f2 * 0.25F) * 0.25F;
        leg2.rotateAngleY = (float)Math.sin(f2 * 0.25F) * 0.25F;
        leg3.rotateAngleY = (float)Math.sin(f2 * 0.25F) * 0.25F;
        leg4.rotateAngleY = (float)Math.sin(f2 * 0.25F) * 0.25F;
    }
}
