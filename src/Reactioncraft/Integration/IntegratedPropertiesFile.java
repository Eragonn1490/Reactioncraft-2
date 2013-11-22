package Reactioncraft.integration;

import Reactioncraft.basefiles.common.ReactioncraftConfiguration;

public class IntegratedPropertiesFile 
{
	public static ReactioncraftConfiguration config;
	
	public static void loadProperties() 
	{
		/** RCC **/
		IntegratedProperties.hardcorerailcraft = config.get("Hardcore", "Hardcore Rails", false);
		IntegratedProperties.hardcorerailcraft.comment = "If this is true it adds a rail recipe that adds less rails using the vanilla recipe style that railcraft removes";
		
		IntegratedProperties.hardcoreIC2 = config.get("Hardcore", "Hardcore IC2", false);
		IntegratedProperties.hardcoreIC2.comment = "If this is true it will add Rubber Wood the the macerator, giving you 2 resin per maceratored log";
		
		IntegratedProperties.GenSponge = config.get("Generation", "Gen Sponge", true);
		IntegratedProperties.GenSponge.comment = "If this is true sponges generate in the ocean";

		IntegratedProperties.GenDarkSand = config.get("Generation", "Gen Dark Sand", true);
		IntegratedProperties.GenDarkSand.comment = "If this is true Darksand will generate in the ocean only if Better Deserts is installed";

		IntegratedProperties.vanillaOverrideCake = config.get("Vanilla Overrides", "Override Cake", true);
		IntegratedProperties.vanillaOverrideCake.comment = "If this is true item Cake is overwrote and stacks to 4";

		IntegratedProperties.vanillaOverrideBed = config.get("Vanilla Overrides", "Override Bed", true);
		IntegratedProperties.vanillaOverrideBed.comment = "If this is true item Bed is overwrote to stack to 3";

		IntegratedProperties.vanillaOverrideFishingrod = config.get("Vanilla Overrides", "Override Fishing Rod", false);
		IntegratedProperties.vanillaOverrideFishingrod.comment = "If this is true item fishing rod is overwrote to catch mutiple fish and items, to play regular vanilla servers set to false and restart your game!";
		
		IntegratedProperties.enderportalActive = config.get("Hardcore", "Ender Portal Active", true);
		IntegratedProperties.enderportalActive.comment = "If this is 'true' that means that you can craft a custom end portal block";
		
		/** RCBB **/
		IntegratedProperties.vanillaOverrideBookcase = config.get("Vanilla Overrides", "Override Enchantment Table", true);
		IntegratedProperties.vanillaOverrideBookcase.comment = "If this is true Vanilla Enchantment Table is slightly overwritten";
		
		/** RCBDM **/
		IntegratedProperties.GenCactusGreen        = config.get("Darksand Desert Generation", "Generate Green Cactus", true);
		IntegratedProperties.GenCactusRed          = config.get("Darksand Desert Generation", "Generate Red Cactus", true);
		IntegratedProperties.darkstoneGenerator    = config.get("Darksand Desert Generation", "Generate Dark Stone", true);
		IntegratedProperties.goldGenerator         = config.get("Darksand Desert Generation", "Generate Desert Gold", true);
		IntegratedProperties.lightstoneGenerator   = config.get("Darksand Desert Generation", "Generate Darkstone Gem 1", true);
		IntegratedProperties.darkgemstoneGenerator = config.get("Darksand Desert Generation", "Generate Darkstone Gem 2", true);
		IntegratedProperties.limestoneGenerator    = config.get("Darksand Desert Generation", "Generate Limestone", true);
		
		/** RCORES **/
		IntegratedProperties.genBloodstone    = config.get("Ore Generation", "Generate Bloodstone", true);
		IntegratedProperties.genBlackdiamond  = config.get("Ore Generation", "Generate Black Diamond", true);
		IntegratedProperties.genDragonstone   = config.get("Ore Generation", "Generate Dragonstone", true);
		IntegratedProperties.genNethergold    = config.get("Ore Generation", "Generate Nether Gold", true);
		IntegratedProperties.genNetherdiamond = config.get("Ore Generation", "Generate Nether Diamond", true);
		IntegratedProperties.genSilver        = config.get("Ore Generation", "Generate Silver", true);
		IntegratedProperties.genVentinite     = config.get("Ore Generation", "Generate Ventinite", true);
		
		IntegratedProperties.genBloodstone.comment    = "If this is true Bloodstone will appear in the nether, if false no other ores can generate :<";
		IntegratedProperties.genBlackdiamond.comment  = "If this is true Black diamond will appear in the nether (required for black diamond borehead)";
		IntegratedProperties.genDragonstone.comment   = "If this is true Dragonstone will appear in the nether (required for bloodstone sword)";
		IntegratedProperties.genNethergold.comment    = "If this is true Nether gold will appear in the nether";
		IntegratedProperties.genNetherdiamond.comment = "If this is true Nether Diamond will appear in the nether";
		IntegratedProperties.genSilver.comment        = "If this is true Silver Ore will appear on the surface";
		IntegratedProperties.genVentinite.comment     = "If this is true Ventinite will appear on the surface";
	}
}
