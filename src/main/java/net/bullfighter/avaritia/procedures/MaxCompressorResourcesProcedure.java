package net.bullfighter.avaritia.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.bullfighter.avaritia.network.AvaritiaModVariables;
import net.bullfighter.avaritia.init.AvaritiaModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MaxCompressorResourcesProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		AvaritiaModVariables.MapVariables.get(world).MaxCompressorResources = (world.getLevelData().getGameRules().getInt(AvaritiaModGameRules.NEUTRONIUMCOMPRESSORAMOUNT));
		AvaritiaModVariables.MapVariables.get(world).syncData(world);
	}
}
