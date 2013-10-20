package Reactioncraft.core.common;

import Reactioncraft.machines.common.ContainerBrickOven;
import Reactioncraft.machines.common.ContainerClayalizer;
import Reactioncraft.machines.common.ContainerFreezer;
import Reactioncraft.machines.common.GuiBrickoven;
import Reactioncraft.machines.common.GuiClayalizer;
import Reactioncraft.machines.common.GuiFreezer;
import Reactioncraft.machines.common.TileEntityBrickOven;
import Reactioncraft.machines.common.TileEntityClayalizer;
import Reactioncraft.machines.common.TileEntityFreezer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler
{
	public static void registerRenderInformation()
	{
		//No rendering for servers.
	}

	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);

		if(tileEntity == null)
			return null;

		if (id == 0)
		{
			if(tileEntity instanceof TileEntityClayalizer)
				return new ContainerClayalizer(player.inventory, (TileEntityClayalizer) tileEntity);
		}

		if (id == 1)
		{
			if(tileEntity instanceof TileEntityBrickOven)
				return new ContainerBrickOven(player.inventory, (TileEntityBrickOven) tileEntity);
		}

		if (id == 2)
		{
			if(tileEntity instanceof TileEntityFreezer)
				return new ContainerFreezer(player.inventory, (TileEntityFreezer) tileEntity);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) 
	{
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);

		if(tileEntity == null)
			return null;

		if (id == 0)
		{
			if(tileEntity instanceof TileEntityClayalizer)
				return new GuiClayalizer(player.inventory, (TileEntityClayalizer) tileEntity);
		}

		if (id == 1)
		{
			if(tileEntity instanceof TileEntityBrickOven)
				return new GuiBrickoven(player.inventory, (TileEntityBrickOven) tileEntity);
		}

		if (id == 2)
		{
			if(tileEntity instanceof TileEntityFreezer)
				return new GuiFreezer(player.inventory, (TileEntityFreezer) tileEntity);
		}
		return null;
	}

	public int addArmor(String armorName)
	{
		return 0;
	}
}