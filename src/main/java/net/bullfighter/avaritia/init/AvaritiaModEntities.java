
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.bullfighter.avaritia.entity.LongbowoftheHeavensProjectileEntity;
import net.bullfighter.avaritia.entity.EndestPearlProjectileEntity;
import net.bullfighter.avaritia.entity.BlackHoleEntity;
import net.bullfighter.avaritia.AvaritiaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AvaritiaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AvaritiaMod.MODID);
	public static final RegistryObject<EntityType<BlackHoleEntity>> BLACK_HOLE = register("black_hole", EntityType.Builder.<BlackHoleEntity>of(BlackHoleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(BlackHoleEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LongbowoftheHeavensProjectileEntity>> LONGBOWOFTHE_HEAVENS_PROJECTILE = register("projectile_longbowofthe_heavens_projectile",
			EntityType.Builder.<LongbowoftheHeavensProjectileEntity>of(LongbowoftheHeavensProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(LongbowoftheHeavensProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EndestPearlProjectileEntity>> ENDEST_PEARL_PROJECTILE = register("projectile_endest_pearl_projectile",
			EntityType.Builder.<EndestPearlProjectileEntity>of(EndestPearlProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(EndestPearlProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BlackHoleEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BLACK_HOLE.get(), BlackHoleEntity.createAttributes().build());
	}
}
