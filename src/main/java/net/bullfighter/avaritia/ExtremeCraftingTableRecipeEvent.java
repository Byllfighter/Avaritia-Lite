package net.bullfighter.avaritia;

import net.minecraft.world.entity.Entity;

import net.neoforged.fml.event.IModBusEvent;
import net.neoforged.bus.api.Event;

public class ExtremeCraftingTableRecipeEvent extends Event implements IModBusEvent {
    private final Entity entity;

    public ExtremeCraftingTableRecipeEvent(Entity entity) {
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }
}
