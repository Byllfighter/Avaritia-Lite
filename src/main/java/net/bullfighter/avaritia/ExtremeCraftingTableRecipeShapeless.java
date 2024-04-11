/**
 * The code of this mod element is always locked.
 *
 * You can register new events in this class too.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser -> New... and make sure to make the class
 * outside net.bullfighter.avaritia as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
 *
 * This class will be added in the mod root package.
*/
package net.bullfighter.avaritia;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class ExtremeCraftingTableRecipeShapeless {
    public static void execute(Entity entity, List<ItemStack> ingredients, ItemStack result) {
        if (entity == null) return;

        // Mark slots that contain items for the recipe
        Set<Integer> markedSlots = markSlots(entity, ingredients);

        // Check if there are any extra items in the crafting grid
        boolean hasExtraItems = hasExtraItems(entity, markedSlots);

        // If there are no extra items and all required items are present
        if (!hasExtraItems && markedSlots.size() == ingredients.size()) {
            if (getSlot(entity, 81).getItem().getCount() < (getSlot(entity, 81).getItem().getMaxStackSize() - result.getCount()) + 1) {
                // Remove items from inventory
                removeItems(entity, markedSlots);

                addItemToSlot(entity, result, 81);
            }
        }
    }

	// Mark slots that contain items for the recipe
	private static Set<Integer> markSlots(Entity entity, List<ItemStack> items) {
		Set<Integer> markedSlots = new HashSet<>();
        if (entity instanceof Player player &&
        player.containerMenu instanceof Supplier current &&
        current.get() instanceof Map slots) {
            for (ItemStack item : items) {
                int remainingAmount = item.getCount();
                for (Object slotObj : slots.values()) {
                    Slot slot = (Slot) slotObj;
                    if (slot.hasItem() && ItemStack.isSameItem(slot.getItem(), item)) {
                        int amountInSlot = slot.getItem().getCount();
                        markedSlots.add(slot.index);
                        if (remainingAmount == 0)
                            break;
                    }
                }
            }
        }
        return markedSlots;
    }

	// Check if there are any extra items in the crafting grid
	private static boolean hasExtraItems(Entity entity, Set<Integer> markedSlots) {
		if (entity instanceof Player player &&
			player.containerMenu instanceof Supplier current &&
			current.get() instanceof Map slots) {
			for (Object slotObj : slots.values()) {
				Slot slot = (Slot) slotObj;
				if (!markedSlots.contains(slot.index) && slot.hasItem())
					if (slot.index != 81)
						return true; // Extra item found
			}
		}
		return false; // No extra items
	}


    // Remove items from the inventory
    private static void removeItems(Entity entity, Set<Integer> markedSlots) {
        if (entity instanceof Player player &&
            player.containerMenu instanceof Supplier current &&
            current.get() instanceof Map slots) {
            for (int slotIndex : markedSlots) {
                ((Slot) slots.get(slotIndex)).remove(1);
            }
            player.containerMenu.broadcastChanges();
        }
    }

    // Add an item to the specified slot
    private static void addItemToSlot(Entity entity, ItemStack item, int slotIndex) {
        if (entity instanceof Player player &&
            player.containerMenu instanceof Supplier current &&
            current.get() instanceof Map slots) {
            ItemStack existingStack = ((Slot) slots.get(slotIndex)).getItem();
            if (existingStack.isEmpty()) {
                ((Slot) slots.get(slotIndex)).set(item.copy());
            } else {
                existingStack.grow(item.getCount());
            }
            player.containerMenu.broadcastChanges();
        }
    }

    private static Slot getSlot(Entity entity, int slotIndex) {
        if (entity instanceof Player player &&
            player.containerMenu instanceof Supplier current &&
            current.get() instanceof Map slots) {
                return ((Slot) slots.get(slotIndex));
        }
        return null;
    }
}