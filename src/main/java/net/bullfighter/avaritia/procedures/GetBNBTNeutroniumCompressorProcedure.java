package net.bullfighter.avaritia.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;

import net.bullfighter.avaritia.init.AvaritiaModGameRules;

public class GetBNBTNeutroniumCompressorProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z) {
		return GetBNBTNumberProcessProcedure.execute(world, x, y, z) + "/"
				+ ((world instanceof ServerLevel _serverLevelGR0 ? _serverLevelGR0.getGameRules().getInt(AvaritiaModGameRules.NEUTRONIUMCOMPRESSORAMOUNT) : 0) != 0
						? (world instanceof ServerLevel _serverLevelGR1 ? _serverLevelGR1.getGameRules().getInt(AvaritiaModGameRules.NEUTRONIUMCOMPRESSORAMOUNT) : 0)
						: 256);
	}
}