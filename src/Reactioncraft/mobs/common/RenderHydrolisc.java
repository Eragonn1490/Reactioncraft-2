package Reactioncraft.mobs.common;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class RenderHydrolisc extends RenderLiving {

	public ModelHydrolisc model;
	private float scale = 1.0F;
	
	public RenderHydrolisc(ModelHydrolisc par1ModelBase, float par2, float par3) {
		super(par1ModelBase, par2 * par3);
		model = ((ModelHydrolisc)mainModel);
		this.scale = par3;
	}
	
    public void renderHydrolisc(EntityHydrolisc par1EntityHydrolisc, double par2, double par4, double par6, float par8, float par9)
    {
    	//System.out.printf("Rendering Hydrolisc\n");
        super.doRenderLiving(par1EntityHydrolisc, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderHydrolisc((EntityHydrolisc)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderHydrolisc((EntityHydrolisc)par1Entity, par2, par4, par6, par8, par9);
    }
    
    /**
     * Applies the scale to the transform matrix
     */
    public void preRenderScale(EntityHydrolisc par1Entity, float par2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    public void preRenderCallback(EntityLiving par1EntityLiving, float par2)
    {
        this.preRenderScale((EntityHydrolisc)par1EntityLiving, par2);
    }

}
