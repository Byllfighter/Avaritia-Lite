
package net.bullfighter.avaritia.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.bullfighter.avaritia.init.AvaritiaModTabs;

public class EmeraldSingularityItem extends Item {
	public EmeraldSingularityItem() {
		super(new Item.Properties().tab(AvaritiaModTabs.TAB_AVARITIATAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("emerald_singularity");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
