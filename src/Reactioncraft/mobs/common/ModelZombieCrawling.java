package Reactioncraft.mobs.common;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelZombieCrawling extends ModelBase
{
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;

    public ModelZombieCrawling()
    {
        textureWidth = 64;
        textureHeight = 32;
        head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0.0F, 12F, -11F);
        head.setTextureSize(64, 32);
        head.mirror = true;
        setRotation(head, 0.0F, 0.0F, 0.0F);
        body = new ModelRenderer(this, 16, 16);
        body.addBox(-4F, 0.0F, -2F, 8, 12, 4);
        body.setRotationPoint(0.0F, 11F, -7F);
        body.setTextureSize(64, 32);
        body.mirror = true;
        setRotation(body, ((float)Math.PI / 2F), 0.0F, 0.0F);
        rightarm = new ModelRenderer(this, 40, 16);
        rightarm.addBox(-3F, -2F, -7F, 4, 12, 4);
        rightarm.setRotationPoint(-4F, 14F, 0.0F);
        rightarm.setTextureSize(64, 32);
        rightarm.mirror = true;
        setRotation(rightarm, 0.0F, 0.0F, 0.0F);
        leftarm = new ModelRenderer(this, 40, 16);
        leftarm.addBox(-2F, 10F, -7F, 4, 12, 4);
        leftarm.setRotationPoint(5F, 2.0F, 0.0F);
        leftarm.setTextureSize(64, 32);
        leftarm.mirror = true;
        setRotation(leftarm, 0.0F, 0.0F, 0.0F);
        rightleg = new ModelRenderer(this, 0, 16);
        rightleg.addBox(-2F, 0.0F, 3F, 4, 12, 4);
        rightleg.setRotationPoint(-4F, 12F, 0.0F);
        rightleg.setTextureSize(64, 32);
        rightleg.mirror = true;
        setRotation(rightleg, 0.0F, 0.0F, 0.0F);
        leftleg = new ModelRenderer(this, 0, 16);
        leftleg.addBox(-2F, 0.0F, 3F, 4, 12, 4);
        leftleg.setRotationPoint(4F, 12F, 0.0F);
        leftleg.setTextureSize(64, 32);
        leftleg.mirror = true;
        setRotation(leftleg, 0.0F, 0.0F, 0.0F);
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
        rightarm.render(f5);
        leftarm.render(f5);
        rightleg.render(f5);
        leftleg.render(f5);
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
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    }
}
