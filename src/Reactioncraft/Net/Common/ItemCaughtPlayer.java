package Reactioncraft.net.Common;

import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.*;
import net.minecraft.world.World;

public class ItemCaughtPlayer extends Item
{
    public ItemCaughtPlayer(int i)
    {
        super(i);
        maxStackSize = 1;
      //(this dosent technically exist...if you put in creative and click you will crash!)
    }
    
    @Override
	public String getItemDisplayName(ItemStack itemStack) 
	{
		if(itemStack.stackTagCompound.getString("entity") == "player")
			return "Caught " + itemStack.stackTagCompound.getString("playerUser") + " DNA";
		else
			return "Caught " + itemStack.stackTagCompound.getString("entity");
	}

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        itemstack.stackSize--;
        EntityPlayerClone entityPlayerClone = new EntityPlayerClone(world);
        entityPlayerClone.setLocationAndAngles(ModLoader.getMinecraftInstance().thePlayer.posX, ModLoader.getMinecraftInstance().thePlayer.posY, ModLoader.getMinecraftInstance().thePlayer.posZ, ModLoader.getMinecraftInstance().thePlayer.rotationYaw, ModLoader.getMinecraftInstance().thePlayer.rotationPitch);
        world.spawnEntityInWorld(entityPlayerClone);
        return itemstack;
    }
    
    @Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4) {
		if (itemStack.stackTagCompound != null)
			list.add("Caught " + itemStack.stackTagCompound.getString("entity"));
		else
			list.add("Please craft to see results");
		super.addInformation(itemStack, player, list, par4);
	}
}
