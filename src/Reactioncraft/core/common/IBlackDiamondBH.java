package Reactioncraft.core.common;

import mods.railcraft.api.carts.bore.IBoreHead;
import net.minecraft.item.Item;


public class IBlackDiamondBH extends Item implements IBoreHead
{
    public IBlackDiamondBH(int i)
    {
        super(i);
        maxStackSize = 1;
        setMaxDamage(6500);
    }

    public String getBoreTexture()
    {
        return "/Reactioncraft/images/tunnel_bore_blackdiamond.png";
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
