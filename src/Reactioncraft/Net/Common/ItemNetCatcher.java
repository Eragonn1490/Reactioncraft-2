package Reactioncraft.Net.Common;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import Reactioncraft.Net.RCN;
import Reactioncraft.basemod.RCB;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemNetCatcher extends ItemTool 
{

	public ItemNetCatcher(int par1) 
	{
		super(par1, 0, RCN.EnumToolMaterialNet, new Block[] {});
		this.setUnlocalizedName("completeNet");
		this.setCreativeTab(RCB.Reactioncraft);
	}

	@Override
	public String getItemDisplayName(ItemStack par1ItemStack) 
	{
		return "Catching Net";
	}
	
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
	{
		if (entity == null || RCN.exclusionList.isExcluded(entity) || !(entity instanceof EntityLiving))
			return false;
		
		else if(entity instanceof EntityPlayer)
		{
			return false;
		}
		
		//Code Below Works. on Client and Lan (Textures of players / username dont) dosent work server side!
//		else if(entity instanceof EntityPlayer)
//		{
//			NBTTagCompound nbt = new NBTTagCompound();
//			entity.writeToNBT(nbt);
//			nbt.removeTag("Pos");
//			nbt.removeTag("Motion");
//			
//			EntityPlayer entPlayer = (EntityPlayer) entity;
//			
//			ItemStack is = new ItemStack(RCN.caughtplayer);
//			
//			is.stackTagCompound = new NBTTagCompound();
//			is.stackTagCompound.setString("entity", "player");
//			is.stackTagCompound.setString("playerUser", entPlayer.username);
//			if(!(entPlayer.skinUrl == null))
//					is.stackTagCompound.setString("playerSkin", entPlayer.skinUrl);
//			if(!(entPlayer.skinUrl == null))
//				is.stackTagCompound.setString("playerCape", entPlayer.cloakUrl);
//			
//			player.dropPlayerItem(is);			
//			stack.damageItem(1, player);
//		}
		
		else
		{
			NBTTagCompound nbt = new NBTTagCompound();
			entity.writeToNBT(nbt);
			nbt.removeTag("Pos");
			nbt.removeTag("Motion");
			nbt.removeTag("Rotation");
			//nbt.removeTag("Age"); Removed to allow caught item to recognize age
			nbt.removeTag("Dimension");
			nbt.removeTag("PortalCooldown");
			nbt.removeTag("InLove");
			nbt.removeTag("HurtTime");
			nbt.removeTag("DeathTime");
			nbt.removeTag("AttackTime");
			ItemStack is = new ItemStack(RCN.caught);
			is.stackTagCompound = new NBTTagCompound();
			is.stackTagCompound.setString("entity", EntityList.getEntityString(entity));
			is.stackTagCompound.setCompoundTag("entityData", nbt);
			player.dropPlayerItem(is);
			stack.damageItem(1, player);
			entity.setDead();
		}
		//if(stack.getItemDamage() >= (stack.getMaxDamage() - 1))
		if(stack.getItemDamage() >= (stack.getMaxDamage() - 1))
		{
			--stack.stackSize;
		}
		return true;
	}

	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4) 
	{
		if (itemStack.stackTagCompound != null) 
		{
			list.add("Hilt: " + itemStack.stackTagCompound.getInteger("hilt"));
			list.add("Net: " + itemStack.stackTagCompound.getInteger("net"));
		} 
		else
			list.add("Please craft to see results");
		super.addInformation(itemStack, player, list, par4);
	}
	
	
	 @Override
	 public int getItemMaxDamageFromStack(ItemStack stack)
	 {
	  NBTTagCompound compound = stack.stackTagCompound;
	  int hiltLevel = compound.getInteger("hilt");
	  int netLevel  = compound.getInteger("net");
	  return (hiltLevel + netLevel) * 10 - 1;
	 }
	

	@SideOnly(Side.CLIENT)

	/**
	 * Returns True is the item is renderer in full 3D when hold.
	 */
	public boolean isFull3D()
	{
		return true;
	}

	@SideOnly(Side.CLIENT)

	/**
	 * Returns true if this item should be rotated by 180 degrees around the Y axis when being held in an entities
	 * hands.
	 */
	public boolean shouldRotateAroundWhenRendering()
	{
		return true;
	}
}
