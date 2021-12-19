
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AvaritiaModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> WORLD_BREAKER_BEDROCK_BREAK = GameRules.register("world_breaker_bedrock_break",
			GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.IntegerValue> NEUTRONIUMCOMPRESSORAMOUNT = GameRules.register("neutroniumCompressorAmount",
			GameRules.Category.MISC, GameRules.IntegerValue.create(1000));
}
