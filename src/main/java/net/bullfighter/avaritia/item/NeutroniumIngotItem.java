
package net.bullfighter.avaritia.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.bullfighter.avaritia.init.AvaritiaModTabs;

import java.util.List;

public class NeutroniumIngotItem extends Item {
	public NeutroniumIngotItem() {
		super(new Item.Properties().tab(AvaritiaModTabs.TAB_AVARITIATAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("neutronium_ingot");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("The dense heart of a star in convenient ingot form."));
	}
}
