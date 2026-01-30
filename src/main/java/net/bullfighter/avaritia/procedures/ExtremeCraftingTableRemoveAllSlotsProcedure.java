package net.bullfighter.avaritia.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.bullfighter.avaritia.init.AvaritiaModMenus;

public class ExtremeCraftingTableRemoveAllSlotsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double removeslots = 0;
		removeslots = -1;
		for (int index0 = 0; index0 < 81; index0++) {
			removeslots = removeslots + 1;
			if (entity instanceof Player _player && _player.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu) {
				_menu.getSlots().get((int) removeslots).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}