package net.bullfighter.avaritia.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.bullfighter.avaritia.init.AvaritiaModItems;

import java.util.function.Supplier;
import java.util.Map;

public class ExtremeCraftingTableRecipeUltimateStewProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double removeslots = 0;
		double currentslot = 0;
		double recipepileofneutrons = 0;
		double recipewheat = 0;
		double recipecarrot = 0;
		double recipepotato = 0;
		double recipebeetroot = 0;
		double recipeapple = 0;
		double recipemelon = 0;
		double recipepumpkin = 0;
		double recipecactus = 0;
		double reciperedmushroom = 0;
		double recipebrownmushroom = 0;
		currentslot = -1;
		for (int index0 = 0; index0 < 81; index0++) {
			currentslot = currentslot + 1;
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.PILEOF_NEUTRONS.get()) {
				recipepileofneutrons = recipepileofneutrons + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY).getItem() == Items.WHEAT) {
				recipewheat = recipewheat + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY).getItem() == Items.CARROT) {
				recipecarrot = recipecarrot + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY).getItem() == Items.POTATO) {
				recipepotato = recipepotato + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY).getItem() == Items.BEETROOT) {
				recipebeetroot = recipebeetroot + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY).getItem() == Items.APPLE) {
				recipeapple = recipeapple + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY).getItem() == Blocks.MELON
					.asItem()) {
				recipemelon = recipemelon + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY).getItem() == Blocks.PUMPKIN
					.asItem()) {
				recipepumpkin = recipepumpkin + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY).getItem() == Blocks.CACTUS
					.asItem()) {
				recipecactus = recipecactus + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY).getItem() == Blocks.RED_MUSHROOM
					.asItem()) {
				reciperedmushroom = reciperedmushroom + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY).getItem() == Blocks.BROWN_MUSHROOM
					.asItem()) {
				recipebrownmushroom = recipebrownmushroom + 1;
			}
		}
		if (recipepileofneutrons == 1 && recipewheat == 2 && recipecarrot == 2 && recipepotato == 2 && recipebeetroot == 2 && recipeapple == 2 && recipemelon == 2 && recipepumpkin == 2 && recipecactus == 2 && reciperedmushroom == 2
				&& recipebrownmushroom == 2) {
			if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(81)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
					|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(81)).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.ULTIMATE_STEW
							.get())
					&& new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(81) < 61) {
				removeslots = -1;
				for (int index1 = 0; index1 < 81; index1++) {
					removeslots = removeslots + 1;
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get((int) removeslots)).remove(1);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.ULTIMATE_STEW.get());
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(81) + 4));
					((Slot) _slots.get(81)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}
