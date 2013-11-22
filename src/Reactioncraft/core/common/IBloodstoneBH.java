package Reactioncraft.core.common;

import mods.railcraft.api.carts.bore.IBoreHead;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class IBloodstoneBH extends Item implements IBoreHead
{
    public IBloodstoneBH(int i)
    {
        super(i);
        maxStackSize = 1;
        setMaxDamage(7500);
    }

    public ResourceLocation getBoreTexture()
    {
        return new ResourceLocation("rcc", "textures/railcraft/tunnel_bore_bloodstone.png");
    }

    public int getHarvestLevel()
    {
        return 3;
    }

    public float getDigModifier()
    {
        return 1.8F;
    }
}
