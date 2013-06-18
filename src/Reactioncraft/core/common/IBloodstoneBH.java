package Reactioncraft.core.common;

import mods.railcraft.api.carts.bore.IBoreHead;
import net.minecraft.item.Item;

public class IBloodstoneBH extends Item implements IBoreHead
{
    public IBloodstoneBH(int i)
    {
        super(i);
        maxStackSize = 1;
        setMaxDamage(10000);
    }

    public String getBoreTexture()
    {
        return "/Reactioncraft/RCC/railcraft/tunnel_bore_bloodstone.png";
    }

    public int getHarvestLevel()
    {
        return 3;
    }

    public float getDigModifier()
    {
        return 1.4F;
    }
}
