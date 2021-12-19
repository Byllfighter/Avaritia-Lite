
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

@Mod.EventBusSubscriber
public class AvaritiaModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == AvaritiaModBlocks.COMPRESSED_CRAFTING_TABLE.asItem())
			event.setBurnTime(300);
		else if (event.getItemStack().getItem() == AvaritiaModBlocks.DOUBLE_COMPRESSED_CRAFTING_TABLE.asItem())
			event.setBurnTime(300);
	}
}
