/*
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

import net.neoforged.neoforge.event.entity.living.LivingHurtEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.bullfighter.avaritia.init.AvaritiaModItems;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;

@EventBusSubscriber()
public class PreventDamage {

	@SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        LivingEntity entity = event.getEntity();
        DamageSource source = event.getSource();

        // Your custom logic to prevent death, e.g. checking for a specific condition
        if (
            entity.getItemBySlot(EquipmentSlot.FEET).getItem() == AvaritiaModItems.INFINITY_ARMOR_BOOTS.get() && 
            entity.getItemBySlot(EquipmentSlot.LEGS).getItem() == AvaritiaModItems.INFINITY_ARMOR_LEGGINGS.get() && 
            entity.getItemBySlot(EquipmentSlot.CHEST).getItem() == AvaritiaModItems.INFINITY_ARMOR_CHESTPLATE.get() && 
            entity.getItemBySlot(EquipmentSlot.HEAD).getItem() == AvaritiaModItems.INFINITY_ARMOR_HELMET.get()
        ) {
            AvaritiaMod.LOGGER.info("armor");
            if (source.getEntity() instanceof LivingEntity) {
                if (((LivingEntity)source.getEntity()).getMainHandItem().getItem() == AvaritiaModItems.SWORDOFTHE_COSMOS.get()) {
                    entity.setHealth(entity.getHealth()-4);
                }
            }

            event.setCanceled(true);
        }
    }
    
}
