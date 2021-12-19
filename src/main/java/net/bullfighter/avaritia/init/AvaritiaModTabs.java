
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AvaritiaModTabs {
	public static CreativeModeTab TAB_AVARITIATAB;

	public static void load() {
		TAB_AVARITIATAB = new CreativeModeTab("tabavaritiatab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AvaritiaModItems.INFINITY_CATALYST);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
