package net.bullfighter.avaritia.procedures;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import net.bullfighter.avaritia.network.AvaritiaModVariables;
import net.bullfighter.avaritia.init.AvaritiaModGameRules;

import javax.annotation.Nullable;

@EventBusSubscriber
public class MaxCompressorResourcesProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		AvaritiaModVariables.MapVariables.get(world).MaxCompressorResources = (world.getLevelData().getGameRules().getInt(AvaritiaModGameRules.NEUTRONIUMCOMPRESSORAMOUNT));
		AvaritiaModVariables.MapVariables.get(world).syncData(world);
	}
}
