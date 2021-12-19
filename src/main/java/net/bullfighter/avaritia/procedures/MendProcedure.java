package net.bullfighter.avaritia.procedures;

import net.minecraft.world.item.ItemStack;

import java.util.Random;

public class MendProcedure {
	public static void execute(ItemStack itemstack) {
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(-1000, new Random(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
