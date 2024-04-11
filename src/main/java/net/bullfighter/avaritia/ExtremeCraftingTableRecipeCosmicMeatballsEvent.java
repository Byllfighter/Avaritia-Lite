package net.bullfighter.avaritia;

import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.event.IModBusEvent;

import java.util.List;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class ExtremeCraftingTableRecipeCosmicMeatballsEvent extends Event implements IModBusEvent {
    private final Entity entity;
	private final List<ItemStack> requiredItems;

    public ExtremeCraftingTableRecipeCosmicMeatballsEvent(Entity entity, List<ItemStack> requiredItems) {
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
