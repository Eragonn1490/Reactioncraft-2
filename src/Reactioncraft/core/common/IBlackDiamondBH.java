package Reactioncraft.core.common;

import mods.railcraft.api.carts.bore.IBoreHead;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;


public class IBlackDiamondBH extends Item implements IBoreHead
{
    public IBlackDiamondBH(int i)
    {
        super(i);
        maxStackSize = 1;
        setMaxDamage(9000);
    }

    public ResourceLocation getBoreTexture()
    {
        return new ResourceLocation("rcc", "textures/railcraft/tunnel_bore_blackdiamond.png");
    }

    public int getHarvestLevel()
    {
        return 3;
    }

    public float getDigModifier()
    {
        return 2.0F;
    }
}
