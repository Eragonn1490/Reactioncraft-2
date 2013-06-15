package Reactioncraft.mobs.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CommonProxy implements IGuiHandler
{		
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
	  return null;
	}
	
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
	  return null;
	}
	
	public static void registerRenderInformation() {}
	
    public void registerTileEntitySpecialRenderer() {}
}
