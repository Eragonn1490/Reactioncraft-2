package Reactioncraft.mobs.common;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderJellyfish extends RenderLiving
{
    public RenderJellyfish(ModelBase modelbase, float f)
    {
        super(modelbase, f);
    }

    public void renderjellyfish(EntityJellyfish entityjellyfish, double d, double d1, double d2, float f, float f1)
    {
        super.doRenderLiving(entityjellyfish, d, d1, d2, f, f1);
    }

    @Override
    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, float f, float f1)
    {
        renderjellyfish((EntityJellyfish)entityliving, d, d1, d2, f, f1);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    @Override
    public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
    {
        renderjellyfish((EntityJellyfish)entity, d, d1, d2, f, f1);
    }

    public void preRenderScale(EntityJellyfish entityjellyfish, float f)
    {
        GL11.glScalef(1.25F, 1.25F, 1.25F);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    public void preRenderCallback(EntityLiving entityliving, float f)
    {
        preRenderScale((EntityJellyfish)entityliving, f);
    }

    public void rotateAnimal(EntityLiving entityliving)
    {
        GL11.glRotatef(90F, -1F, 0.0F, 0.0F);
    }
    
    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.func_110902_a((EntityJellyfish)par1Entity);
    }
    
    protected ResourceLocation func_110902_a(EntityJellyfish par1EntityVillager)
    {
        switch (par1EntityVillager.getProfession())
        {
            case 0:
                return (new ResourceLocation("reactioncraft::textures/entity/Jellyfish.png"));
            case 1:
                return (new ResourceLocation("reactioncraft::textures/entity/Jellyfish2.png"));
/*            case 2:
                return priestVillagerTextures;
            case 3:
                return smithVillagerTextures;
            case 4:
                return butcherVillagerTextures;*/
            default:
                return (new ResourceLocation("reactioncraft:textures/entity/Jellyfish.png"));
        }
    }
    
//    protected ResourceLocation getEntityTexture(Entity par1Entity)
//    {
//    	return (new ResourceLocation("reactioncraft:textures/entity/Jellyfish.png"));
//    }
}
