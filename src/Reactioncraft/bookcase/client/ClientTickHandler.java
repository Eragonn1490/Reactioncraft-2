package Reactioncraft.bookcase.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.EnumSet;
import java.util.logging.Logger;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ClientTickHandler implements ITickHandler
{
	public static Minecraft var2 = Minecraft.getMinecraft();
	public boolean methodsAccessed = false;

    public static String MODNAME = "Reactioncraft-Better-Bookcases";
    public static String MODVERSION = "8.1";
    public static String VERSIONURL = "https://dl.dropbox.com/u/84235925/bookcases%20version.txt";
    public static String MOD_ADFLY_LINK = "http://adf.ly/NRpRR";
	
    public void tickStart(EnumSet<TickType> type, Object... tickData) {}

    public void tickEnd(EnumSet<TickType> type, Object... tickData)
    {
        if (type.equals(EnumSet.of(TickType.RENDER)))
        {
            if (var2.thePlayer != null)
            {
            	if (!methodsAccessed)
            	{
            		checkForModUpdate(VERSIONURL);
            		methodsAccessed = true;
            	}
            }
        }
        else if (type.equals(EnumSet.of(TickType.CLIENT)))
        {
            GuiScreen guiscreen = Minecraft.getMinecraft().currentScreen;
            
            if (guiscreen != null)
            {
                onTickInGUI(guiscreen);
            } 
            	else 
            {
                onTickInGame();
            }
        }
    }

    @Override
    public EnumSet<TickType> ticks()
    {
        return EnumSet.of(TickType.RENDER, TickType.CLIENT);
    }

    @Override
    public String getLabel() { return null; }

    public void onRenderTick(String s) {}

    public void onTickInGUI(GuiScreen guiscreen) {}

    public void onTickInGame() {}
	
	@SideOnly(Side.CLIENT)
	public static void checkForModUpdate(String URL)
	{
        Minecraft client = FMLClientHandler.instance().getClient();
        
        Logger AIRILogger = Logger.getLogger("AIRI");
        
		AIRILogger.setParent(FMLLog.getLogger());
		
        String URLData;
        
		try
		{
			URLData = getStringFromURL(URL);
			
	        String URLVersion = URLData.substring(6, 11);
				
	        if (URLData.contains(MODNAME))
	        {
		        if (URLData.contains(MODVERSION))
		        {
		        	AIRILogger.info("The mod " + MODNAME + " version " + MODVERSION + " is up to date.");
				}
		        	else
		        {
			       	if (client.thePlayer != null)
			       	{
				       	client.thePlayer.addChatMessage(" Update: " + MODNAME + " version " + URLVersion + " is now available. Download it at " + MOD_ADFLY_LINK);
			       	}
			       		else
			       	{
			       		AIRILogger.info("Update: " + MODNAME + " version " + URLVersion + " is now available. Download it at " + MOD_ADFLY_LINK);
			       	}
			    }
	        }
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
    
	public static String getStringFromURL(String var1) throws Exception
	{
		URL website = new URL(var1);
        URLConnection connection = website.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null)
        {
        	response.append(inputLine);
        }
        
        in.close();

        return response.toString();
	}
}