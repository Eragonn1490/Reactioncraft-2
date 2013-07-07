package Reactioncraft.Net.ltd.genuine.database;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import cpw.mods.fml.common.Mod.Instance;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;

public class ExclusionList implements Iterable 
{
	public static List<String> list = new ArrayList<String>();

	public ExclusionList() 
	{
		addExclusion("EnderDragon");
		addExclusion("dragonPartHead");
		addExclusion("dragonPartBody");
		addExclusion("dragonPartTail1");
		addExclusion("dragonPartTail2");
		addExclusion("dragonPartTail3");
		addExclusion("dragonPartWing1");
		addExclusion("dragonPartWing2");
		addExclusion("FallingSand");
		addExclusion("Fireball");
		addExclusion("PrimedTnt");
		addExclusion("MinecartTNT");
		addExclusion("WitherSkull");
		addExclusion("Hydrolisc");
	}

	public void addExclusion(String name) 
	{
		list.add(name);
	}

	public void removeExclusion(String name) 
	{
		list.remove(name);
	}

	public boolean isExcluded(String name) 
	{
		return list.contains(name);
	}

	public void addExclusion(Entity entity) 
	{
		list.add(EntityList.getEntityString(entity));
	}

	public void removeExclusion(Entity entity) 
	{
		list.remove(EntityList.getEntityString(entity));
	}

	public boolean isExcluded(Entity entity) 
	{
		return list.contains(EntityList.getEntityString(entity));
	}

	@Override
	public Iterator iterator() 
	{
		return list.iterator();
	}
}
