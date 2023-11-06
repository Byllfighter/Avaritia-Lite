package net.bullfighter.avaritia.procedures;

import net.minecraft.world.entity.Entity;

import net.bullfighter.avaritia.network.AvaritiaModVariables;

public class NeutroniumCompressorClickProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = x;
			entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.neutroniumcollectorx = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = y;
			entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.neutroniumcollectory = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = z;
			entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.neutroniumcollectorz = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
