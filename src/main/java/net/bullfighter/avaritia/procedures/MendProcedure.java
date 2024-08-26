package net.bullfighter.avaritia.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;

public class MendProcedure {
	public static void execute(ItemStack itemstack) {
		{
			ItemStack _ist = itemstack;
			_ist.hurtAndBreak(-1000, RandomSource.create(), null, () -> {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			});
		}
	}
}
