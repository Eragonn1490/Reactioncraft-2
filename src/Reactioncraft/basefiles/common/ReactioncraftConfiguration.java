package Reactioncraft.basefiles.common;

import java.io.File;
import java.util.Locale;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class ReactioncraftConfiguration extends Configuration 
{

	public ReactioncraftConfiguration(File file) 
	{
		super(file);
	}

	@Override
	public void save() 
	{
		super.save();
	}
	
	public static final String ID = "RCCM".toLowerCase(Locale.ENGLISH);
}