
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.neoforged.neoforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class AvaritiaModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == AvaritiaModBlocks.COMPRESSED_CRAFTING_TABLE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == AvaritiaModBlocks.DOUBLE_COMPRESSED_CRAFTING_TABLE.get().asItem())
			event.setBurnTime(300);
	}
}
