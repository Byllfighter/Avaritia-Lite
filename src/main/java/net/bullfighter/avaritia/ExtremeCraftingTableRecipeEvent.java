package net.bullfighter.avaritia;

import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.event.IModBusEvent;
import net.minecraft.world.entity.Entity;

public class ExtremeCraftingTableRecipeEvent extends Event implements IModBusEvent {
    private final Entity entity;

    public ExtremeCraftingTableRecipeEvent(Entity entity) {
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }
}
