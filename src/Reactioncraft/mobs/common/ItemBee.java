package Reactioncraft.mobs.common;

import Reactioncraft.basemod.RCB;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBee extends Item //implements IBeeInterface
{
	public ItemBee(int i)
	{
		super(i);
		this.setCreativeTab(RCB.ReactioncraftItems);
	}
}
