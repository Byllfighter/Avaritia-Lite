package net.bullfighter.avaritia.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.bullfighter.avaritia.network.AvaritiaModVariables;

public class GetBNBTNeutroniumCompressorProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z) {
		return GetBNBTNumberProcessProcedure.execute(world, x, y, z) + "/" + AvaritiaModVariables.MapVariables.get(world).MaxCompressorResources;
	}
}
