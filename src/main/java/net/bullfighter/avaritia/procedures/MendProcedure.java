package net.bullfighter.avaritia.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;

public class MendProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		if (world instanceof ServerLevel _level) {
			itemstack.hurtAndBreak(-1000, _level, null, _stkprov -> {
			});
		}
	}
}
