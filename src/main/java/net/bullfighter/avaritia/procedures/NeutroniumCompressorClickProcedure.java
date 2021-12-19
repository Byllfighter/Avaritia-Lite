package net.bullfighter.avaritia.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.bullfighter.avaritia.network.AvaritiaModVariables;

public class NeutroniumCompressorClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		AvaritiaModVariables.MapVariables.get(world).neutroniumcollectorx = x;
		AvaritiaModVariables.MapVariables.get(world).syncData(world);
		AvaritiaModVariables.MapVariables.get(world).neutroniumcollectory = y;
		AvaritiaModVariables.MapVariables.get(world).syncData(world);
		AvaritiaModVariables.MapVariables.get(world).neutroniumcollectorz = z;
		AvaritiaModVariables.MapVariables.get(world).syncData(world);
	}
}
