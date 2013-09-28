package Reactioncraft.mobs.common;

import Reactioncraft.mobs.RCmobs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class Event_LivingBoneDrops 
{
	public static double rand;

	@ForgeSubscribe
	public void onEntityDrop(LivingDropsEvent event) 
	{
		//Passive Mobs Drop Bones
		if (event.source.getDamageType().equals("player")) 
		{ 
			rand = Math.random();

			if (event.entityLiving instanceof EntityPig) 
			{ 
				if (rand < 1D) 
				{ 
					event.entityLiving.dropItem(RCmobs.bones.itemID, 1);
				}
			}
			
			if (event.entityLiving instanceof EntityChicken) 
			{ 
				if (rand < 1D) 
				{ 
					event.entityLiving.dropItem(RCmobs.bones.itemID, 1);
				}
			}
			if (event.entityLiving instanceof EntityBat) 
			{ 
				if (rand < 1D) 
				{ 
					event.entityLiving.dropItem(RCmobs.bones.itemID, 1);
				}
			}
			if (event.entityLiving instanceof EntityCow) 
			{ 
				if (rand < 1D) 
				{ 
					event.entityLiving.dropItem(RCmobs.bones.itemID, 1);
				}
			}
			if (event.entityLiving instanceof EntityHorse) 
			{ 
				if (rand < 1D) 
				{ 
					event.entityLiving.dropItem(RCmobs.bones.itemID, 1);
				}
			}
			if (event.entityLiving instanceof EntityMooshroom) 
			{ 
				if (rand < 1D) 
				{ 
					event.entityLiving.dropItem(RCmobs.bones.itemID, 1);
				}
			}
			if (event.entityLiving instanceof EntityOcelot) 
			{ 
				if (rand < 1D) 
				{ 
					event.entityLiving.dropItem(RCmobs.bones.itemID, 1);
				}
			}
			if (event.entityLiving instanceof EntitySheep) 
			{ 
				if (rand < 1D) 
				{ 
					event.entityLiving.dropItem(RCmobs.bones.itemID, 1);
				}
			}
			if (event.entityLiving instanceof EntitySquid) 
			{ 
				if (rand < 1D) 
				{ 
					event.entityLiving.dropItem(RCmobs.bones.itemID, 1);
				}
			}
			if (event.entityLiving instanceof EntityVillager) 
			{ 
				if (rand < 1D) 
				{ 
					event.entityLiving.dropItem(RCmobs.bones.itemID, 1);
				}
			}
			if (event.entityLiving instanceof EntityWolf) 
			{ 
				if (rand < 1D) 
				{ 
					event.entityLiving.dropItem(RCmobs.bones.itemID, 1);
				}
			}
			
			//Players Drop Bones!
			if (event.entityLiving instanceof EntityPlayer) 
			{ 
				if (rand < 1D) 
				{ 
					event.entityLiving.dropItem(RCmobs.bones.itemID, 1);
				}
			}
			
			//Agro Mobs Drop Bones
			if (event.entityLiving instanceof EntityCreeper) 
			{ 
				if (rand < 1D) 
				{ 
					event.entityLiving.dropItem(RCmobs.bones.itemID, 1);
				}
			}
			if (event.entityLiving instanceof EntityPigZombie) 
			{ 
				if (rand < 1D) 
				{ 
					event.entityLiving.dropItem(RCmobs.bones.itemID, 1);
				}
			}
			if (event.entityLiving instanceof EntityWitch) 
			{ 
				if (rand < 1D) 
				{ 
					event.entityLiving.dropItem(RCmobs.bones.itemID, 1);
				}
			}
			if (event.entityLiving instanceof EntityZombie) 
			{ 
				if (rand < 1D) 
				{ 
					event.entityLiving.dropItem(RCmobs.bones.itemID, 1);
				}
			}
		}
	}
}