package Reactioncraft.basemod.common;

import Reactioncraft.basemod.RCB;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.NetLoginHandler;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet1Login;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.common.network.IConnectionHandler;
import cpw.mods.fml.common.network.Player;

public class ConnectionHandler implements IConnectionHandler
{

    @Override
    public void playerLoggedIn(Player player, NetHandler netHandler, INetworkManager manager)
    {
        EntityPlayer p = (EntityPlayer) player;
        if (RCB.instance().getRCManualEnabled() && !p.getEntityData().getBoolean("hasRCManual"))
        {
            ItemStack book = new ItemStack(Item.writtenBook);
            book.stackTagCompound = new NBTTagCompound();
            NBTTagList pages = new NBTTagList();
            
            pages.appendTag(new NBTTagString("", "Welcome To Reactioncraft\n" +
                                                 "If this is your first time playing that is great.\n"  +
            		                             "-this book is annoying and will spawn every time you play so go ahead and use it as fuel in a furnace its a handly feature of Better Bookcases Mod\n"));
            
            pages.appendTag(new NBTTagString("", "-to play Reactioncraft to its fullest dont cheat!\n"  +
                                                 "-Reactioncraft adds tons of blocks from colored glass to hireoglyphics with mobs and even christmas trees\n" +
                                                 "-Tip of the Day... Build in the Special Deserts\n"));
            
            pages.appendTag(new NBTTagString("", "-Reactioncraft Rules...if you choose to read them\n" +
            									 "-Rule 1 dont piss off the seacreepers they explode\n" +
            									 "-Rule 2 dont run from the crawlers.. they like it when you run..\n" +
            									 "-Rule 3 if you find a wizim library burn it... the wizim wont like it but who cares right?\n"));
            
            pages.appendTag(new NBTTagString("", "Thanks to: Eragonn1490 (Primary Coder), Wizim (Texturees, LOGO's), Ri5ux (Code Assitant), LexManos,\n" +
            									 "Trilby11 (Code), Joey (Code), Malkerian (Code), LegendaryTriforce (Code/Textures),\n"));
            									 
            pages.appendTag(new NBTTagString("",  "CPW, DV8FROMTHEWORLD, COWEDOFFACLIFF, CovertJaguar, Fred_Funny (Textures), AND OTHERS\n" + 
            									 "Risugami, Cojo (Alot of Code), Corosus (Code), GenuineSounds (Code)\n" +
            									 "for helping make Reactioncraft possible"));
           
            book.stackTagCompound.setTag("pages", pages);
            book.stackTagCompound.setString("title", "Reactioncraft Manual");
            book.stackTagCompound.setString("author", "Eragonn1490");
            
            p.getEntityData().setBoolean("hasRCManual", true);
            p.inventory.addItemStackToInventory(book);
        }
    }

    @Override
    public String connectionReceived(NetLoginHandler netHandler, INetworkManager manager)
    {
        return null;
    }

    @Override
    public void connectionOpened(NetHandler netClientHandler, String server, int port, INetworkManager manager)
    {
    }

    @Override
    public void connectionOpened(NetHandler netClientHandler, MinecraftServer server, INetworkManager manager)
    {
    }

    @Override
    public void connectionClosed(INetworkManager manager)
    {
    }

    @Override
    public void clientLoggedIn(NetHandler clientHandler, INetworkManager manager, Packet1Login login)
    {
    }

}
