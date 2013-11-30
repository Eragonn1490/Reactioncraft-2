package Reactioncraft.integration;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class IntegratedMaterials 
{
	/** From RCCM **/
	public static EnumArmorMaterial EmeraldArmor =               EnumHelper.addArmorMaterial("emerald", 55, new int[]{1,2, 2, 1}, 0);
	public static EnumArmorMaterial BloodstoneArmor =            EnumHelper.addArmorMaterial("bloodstone", 33, new int[]{3, 8, 6, 3}, 10);
	
	/** From RCN **/
	public static EnumToolMaterial EnumToolMaterialNet =         EnumHelper.addToolMaterial("Net", 3, 1, 2.0F, 2, 15);
	
	/** From RCF **/
	public static EnumToolMaterial EnumToolMaterialMeatcleaver = EnumHelper.addToolMaterial("MeatCleaver", 2, 280, 6.0F, 2.0F, 14);
	
	/** From RCW **/
	public static EnumToolMaterial EnumToolMaterialBat =         EnumHelper.addToolMaterial("Bat", 1, 79, 2.0F, 1, 15);
	public static EnumToolMaterial EnumToolMaterialObby =        EnumHelper.addToolMaterial("Obby", 3, 2024, 7.0F, 2, 15);
	public static EnumToolMaterial EnumToolMaterialBloodstone =  EnumHelper.addToolMaterial("Bloodstone", 3, 4200, 7.0F, 2, 15);
	public static EnumToolMaterial EnumToolMaterialBloodstone2 = EnumHelper.addToolMaterial("Bloodstone", 3, 4800, 7.0F, 3, 15);
}
