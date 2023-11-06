package net.bullfighter.avaritia.procedures;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

public class ExtremeCraftingTableRemoveAllSlotsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double removeslots = 0;
		removeslots = -1;
		for (int index0 = 0; index0 < 81; index0++) {
			removeslots = removeslots + 1;
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get((int) removeslots)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
