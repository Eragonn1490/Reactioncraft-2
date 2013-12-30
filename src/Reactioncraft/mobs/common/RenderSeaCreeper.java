package Reactioncraft.mobs.common;

import java.util.Random;

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
public class RenderSeaCreeper extends RenderLiving
{
	private static final ResourceLocation villagerTextures             = new ResourceLocation("reactioncraft:textures/entity/seacreeper1.png");
    private static final ResourceLocation farmerVillagerTextures       = new ResourceLocation("reactioncraft:textures/entity/seacreeper2.png");
    private static final ResourceLocation librarianVillagerTextures    = new ResourceLocation("reactioncraft:textures/entity/seacreeper3.png");
    private static final ResourceLocation priestVillagerTextures       = new ResourceLocation("reactioncraft:textures/entity/seacreeper4.png");
    private static final ResourceLocation smithVillagerTextures        = new ResourceLocation("reactioncraft:textures/entity/seacreeper5.png");
    private static final ResourceLocation butcherVillagerTextures      = new ResourceLocation("reactioncraft:textures/entity/seacreeper6.png");
    private static final ResourceLocation smithVillagerTextures1       = new ResourceLocation("reactioncraft:textures/entity/seacreeper7.png");
    private static final ResourceLocation butcherVillagerTextures1     = new ResourceLocation("reactioncraft:textures/entity/seacreeper8.png");
    
	public RenderSeaCreeper(ModelBase modelbase, float f)
	{
		super(modelbase, f);
	}

	public void renderSkeletonCrawling(EntitySeaCreeper EntitySeaCreeper, double d, double d1, double d2, float f, float f1)
	{
		super.doRenderLiving(EntitySeaCreeper, d, d1, d2, f, f1);
	}

	public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, float f, float f1)
	{
		renderSkeletonCrawling((EntitySeaCreeper)entityliving, d, d1, d2, f, f1);
	}

	/**
	 * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
	 * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
	 * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
	 * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
	 */
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
	{
		renderSkeletonCrawling((EntitySeaCreeper)entity, d, d1, d2, f, f1);
	}

	public void preRenderScale(EntitySeaCreeper EntitySeaCreeper, float f)
	{
		GL11.glScalef(1.0F, 1.0F, 1.0F);
	}

	/**
	 * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
	 * entityLiving, partialTickTime
	 */
	public void preRenderCallback(EntityLiving entityliving, float f)
	{
		preRenderScale((EntitySeaCreeper)entityliving, f);
	}

	public void rotateAnimal(EntityLiving entityliving)
	{
		GL11.glRotatef(90F, -1F, 0.0F, 0.0F);
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	@Override
	/**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.func_110902_a((EntitySeaCreeper)par1Entity);
    }
	
	protected ResourceLocation func_110902_a(EntitySeaCreeper par1EntityVillager)
    {
        switch (par1EntityVillager.getProfession())
        {
            case 0:
                return farmerVillagerTextures;
            case 1:
                return librarianVillagerTextures;
            case 2:
                return priestVillagerTextures;
            case 3:
                return smithVillagerTextures;
            case 4:
                return butcherVillagerTextures;
            case 5:
                return smithVillagerTextures1;
            case 6:
                return butcherVillagerTextures1;
            default:
                return VillagerRegistry.getVillagerSkin(par1EntityVillager.getProfession(), villagerTextures);
        }
    }
}
