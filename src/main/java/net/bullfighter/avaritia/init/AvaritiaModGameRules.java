
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AvaritiaModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> WORLD_BREAKER_BEDROCK_BREAK;
	public static GameRules.Key<GameRules.IntegerValue> NEUTRONIUMCOMPRESSORAMOUNT;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		WORLD_BREAKER_BEDROCK_BREAK = GameRules.register("worldBreakerBedrockBreak", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
		NEUTRONIUMCOMPRESSORAMOUNT = GameRules.register("neutroniumCompressorAmount", GameRules.Category.MISC, GameRules.IntegerValue.create(200));
	}
}
