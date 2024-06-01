package net.bullfighter.avaritia;

import net.neoforged.bus.api.Event;

import java.util.List;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class ExtremeCraftingTableRecipeUltimateStewEvent extends Event {
    private final Entity entity;
	private final List<ItemStack> requiredItems;

    public ExtremeCraftingTableRecipeUltimateStewEvent(Entity entity, List<ItemStack> requiredItems) {
        this.entity = entity;
		this.requiredItems = requiredItems;
    }

    public Entity getEntity() {
        return entity;
    }

	public List<ItemStack> getRequiredItems() {
        return requiredItems;
    }
}
