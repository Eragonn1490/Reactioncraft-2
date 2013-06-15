//package Reactioncraft.mobs.common;
//
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.entity.projectile.EntityArrow;
//import net.minecraftforge.event.ForgeSubscribe;
//import net.minecraftforge.event.entity.living.LivingDeathEvent;
//import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
//
//
///**
// * Equivalent-Exchange-3
// * 
// * EntityLivingHandler
// * 
// * @author pahimar
// * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
// * 
// * @Borrowed By Eragonn1490! (not mine at all using his)
// * 
// */
//public class LivingDropsEvent 
//{
//
//    @ForgeSubscribe
//    public void onEntityLivingUpdate(LivingUpdateEvent event) 
//    {
//
//    }
//
//    @ForgeSubscribe
//    public void onEntityLivingDeath(LivingDeathEvent event) {
//
//        if (event.source.getDamageType().equals("player")) 
//        {
//            RCmobs.((EntityPlayer) event.source.getSourceOfDamage(), event.entityLiving);
//        }
//        
//        if (event.source.getSourceOfDamage() instanceof EntityArrow) 
//        {
//            if (((EntityArrow) event.source.getSourceOfDamage()).shootingEntity != null) {
//                if (((EntityArrow) event.source.getSourceOfDamage()).shootingEntity instanceof EntityPlayer) 
//                {
//                    RCmobs.((EntityPlayer) ((EntityArrow) event.source.getSourceOfDamage()).shootingEntity, event.entityLiving);
//                }
//            }
//        }
//    }
//
//}