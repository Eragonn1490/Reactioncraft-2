package Reactioncraft.machines.common;

import Reactioncraft.machines.RCMM;
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

	//returns an instance of the Container you made earlier
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
            //else if (id == ....)// its easy.
                     
            
           // if(tileEntity instanceof TileEntity6X6)
           // {
           // 	 return world.getBlockId(x, y, z) == RCMM.BigCraftingTable.blockID ? new Container6X6(player.inventory, world, x, y, z) : null;
            	//return new Container6X6(player.inventory, (TileEntity6X6) tileEntity);
           // }
            
            
            
            return null;
    }

    //returns an instance of the Gui you made earlier
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
            
           // if(tileEntity instanceof TileEntity6X6)
           // {
           //         return world.getBlockId(x, y, z) == RCMM.BigCraftingTable.blockID ? new Gui6X6(player.inventory, world, x, y, z) : null;                   
           //   		//new Gui6X6(player.inventory, (TileEntity6X6) tileEntity);
           // }           
            
            
            return null;
    }
    
   
	public int addArmor(String armorName)
	{
		return 0;
	}
}