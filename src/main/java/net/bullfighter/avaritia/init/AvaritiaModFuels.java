
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
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
