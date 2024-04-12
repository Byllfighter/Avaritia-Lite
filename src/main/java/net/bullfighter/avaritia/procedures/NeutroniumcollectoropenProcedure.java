package net.bullfighter.avaritia.procedures;

import net.minecraft.world.entity.Entity;

import net.bullfighter.avaritia.network.AvaritiaModVariables;

public class NeutroniumcollectoropenProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			AvaritiaModVariables.PlayerVariables _vars = entity.getData(AvaritiaModVariables.PLAYER_VARIABLES);
			_vars.neutroniumcollectorx = x;
			_vars.syncPlayerVariables(entity);
		}
		{
			AvaritiaModVariables.PlayerVariables _vars = entity.getData(AvaritiaModVariables.PLAYER_VARIABLES);
			_vars.neutroniumcollectory = y;
			_vars.syncPlayerVariables(entity);
		}
		{
			AvaritiaModVariables.PlayerVariables _vars = entity.getData(AvaritiaModVariables.PLAYER_VARIABLES);
			_vars.neutroniumcollectorz = z;
			_vars.syncPlayerVariables(entity);
		}
	}
}
