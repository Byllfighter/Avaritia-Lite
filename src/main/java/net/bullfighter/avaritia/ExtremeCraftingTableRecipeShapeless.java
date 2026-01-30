package net.bullfighter.avaritia;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.*;
import java.util.function.Supplier;

public class ExtremeCraftingTableRecipeShapeless {
    public static void execute(Entity entity, List<ItemStack> ingredients, ItemStack result) {
        if (entity == null) return;

        // Server-side only is recommended — container changes must be done server-side
        if (entity.level().isClientSide) return;

        // Determine which slots (and how many from each) will satisfy the ingredients
        Set<Integer> usedCounts = markSlots(entity, ingredients);

        // If markSlots returned empty map then recipe not satisfied
        if (usedCounts.isEmpty()) return;

        // If there are extra items present that are not part of the recipe, bail out
        if (hasExtraItems(entity, usedCounts)) return;

        Slot out = getSlot(entity, 81);
        if (out == null) return;

        ItemStack outStack = out.getItem();

        int existing = outStack.isEmpty() ? 0 : outStack.getCount();
        int max = outStack.isEmpty()
                ? result.getMaxStackSize()
                : outStack.getMaxStackSize();

        if (existing + result.getCount() > max) return;

        // Remove items according to usedCounts
        removeItems(entity, usedCounts);

        // Add result to output slot
        addItemToSlot(entity, result, 81);
    }

    /**
     * Build a map slotIndex -> count taken from that slot. Returns empty map if recipe can't be fulfilled.
     * NOTE: keys are real slot.index values (Slot.index).
     */
    private static Set<Integer> markSlots(Entity entity, List<ItemStack> ingredients) {
        Set<Integer> usedSlots = new HashSet<>();
        if (!(entity instanceof Player player)) return Set.of();

        for (ItemStack ingredient : ingredients) {
            boolean matched = false;

            for (int i = 0; i < 81; i++) { // crafting grid only
                if (usedSlots.contains(i)) continue;

                Slot slot = player.containerMenu.slots.get(i);
                if (!slot.hasItem()) continue;

                ItemStack stack = slot.getItem();
                if (stack.getItem() == ingredient.getItem()) {
                    usedSlots.add(i);
                    matched = true;
                    break; // IMPORTANT: one ingredient = one slot
                }
            }

            if (!matched) {
                return Set.of(); // recipe fails
            }
        }

        return usedSlots;
    }


    // True if any non-output slot has items that we did not mark as used (extra items)
    private static boolean hasExtraItems(Entity entity, Set<Integer> usedSlots) {
        if (!(entity instanceof Player player)) return true;

        for (int i = 0; i < 81; i++) {
            Slot slot = player.containerMenu.slots.get(i);
            if (slot.hasItem() && !usedSlots.contains(i))
                return true;
        }
        return false;
    }



    // Remove amount specified in usedCounts from slots with those slot.index values
    private static void removeItems(Entity entity, Set<Integer> usedSlots) {
        if (!(entity instanceof Player player)) return;

        for (int slotIndex : usedSlots) {
            player.containerMenu.slots.get(slotIndex).remove(1);
        }
        player.containerMenu.broadcastChanges();
    }


    private static void addItemToSlot(Entity entity, ItemStack item, int slotIndex) {
        if (!(entity instanceof Player player)) return;
        List<Slot> slots = getSlotsList(player);
        if (slots == null) return;
        Slot slot = findSlotByIndex(slots, slotIndex);
        if (slot == null) return;
        ItemStack existing = slot.getItem();
        if (existing.isEmpty()) {
            ItemStack copy = item.copy();
            slot.set(copy);
        } else {
            // grow modifies the stack instance already present in the slot
            existing.grow(item.getCount());
            slot.set(existing); // ensure the slot's content is set (some containers expect set())
        }
        player.containerMenu.broadcastChanges();
    }

    private static Slot getSlot(Entity entity, int slotIndex) {
        if (!(entity instanceof Player player)) return null;
        List<Slot> slots = getSlotsList(player);
        if (slots == null) return null;
        return findSlotByIndex(slots, slotIndex);
    }

    // Helper to find a slot by Slot.index
    private static Slot findSlotByIndex(List<Slot> slots, int index) {
        for (Slot s : slots) {
            if (s.index == index) return s;
        }
        return null;
    }

    private static List<Slot> getSlotsList(Player player) {
        return player.containerMenu.slots;
    }
}
