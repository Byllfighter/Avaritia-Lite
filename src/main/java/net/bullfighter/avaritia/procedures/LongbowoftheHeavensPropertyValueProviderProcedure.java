package net.bullfighter.avaritia.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class LongbowoftheHeavensPropertyValueProviderProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if ((entity instanceof LivingEntity _entUseTicks0 ? _entUseTicks0.getTicksUsingItem() : 0) >= 10) {
			return 3;
		} else if ((entity instanceof LivingEntity _entUseTicks1 ? _entUseTicks1.getTicksUsingItem() : 0) >= 5) {
			return 2;
		} else if ((entity instanceof LivingEntity _entUseTicks2 ? _entUseTicks2.getTicksUsingItem() : 0) >= 1) {
			return 1;
		}
		return 0;
	}
}
