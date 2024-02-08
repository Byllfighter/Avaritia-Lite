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

public class ExtremeCraftingTableRecipeCosmicMeatballsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double removeslots = 0;
		double currentslot = 0;
		double recipepileofneutrons = 0;
		double reciperawbeef = 0;
		double reciperawchicken = 0;
		double reciperawporkchop = 0;
		double reciperawrabbit = 0;
		double recipecod = 0;
		double recipesalmon = 0;
		double reciperawmutton = 0;
		currentslot = -1;
		for (int index0 = 0; index0 < 81; index0++) {
			currentslot = currentslot + 1;
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.PILEOF_NEUTRONS.get()) {
				recipepileofneutrons = recipepileofneutrons + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY).getItem() == Items.BEEF) {
				reciperawbeef = reciperawbeef + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY).getItem() == Items.CHICKEN) {
				reciperawchicken = reciperawchicken + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY).getItem() == Items.PORKCHOP) {
				reciperawporkchop = reciperawporkchop + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY).getItem() == Items.RABBIT) {
				reciperawrabbit = reciperawrabbit + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY).getItem() == Items.COD) {
				recipecod = recipecod + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY).getItem() == Items.SALMON) {
				recipesalmon = recipesalmon + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY).getItem() == Items.MUTTON) {
				reciperawmutton = reciperawmutton + 1;
			}
		}
		if (recipepileofneutrons == 1 && reciperawbeef == 2 && reciperawchicken == 2 && reciperawporkchop == 2 && reciperawrabbit == 2 && recipecod == 2 && recipesalmon == 2 && reciperawmutton == 2) {
			if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(81)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
					|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(81)).getItem() : ItemStack.EMPTY)
							.getItem() == AvaritiaModItems.COSMIC_MEATBALLS.get())
					&& new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(81) < 63) {
				removeslots = -1;
				for (int index1 = 0; index1 < 81; index1++) {
					removeslots = removeslots + 1;
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get((int) removeslots)).remove(1);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.COSMIC_MEATBALLS.get());
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(81) + 2));
					((Slot) _slots.get(81)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}
