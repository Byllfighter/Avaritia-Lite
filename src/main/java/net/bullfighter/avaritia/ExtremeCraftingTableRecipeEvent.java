package net.bullfighter.avaritia;

import net.minecraft.world.entity.Entity;

import net.neoforged.bus.api.Event;

public class ExtremeCraftingTableRecipeEvent extends Event {
    private final Entity entity;

    public ExtremeCraftingTableRecipeEvent(Entity entity) {
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }
}
