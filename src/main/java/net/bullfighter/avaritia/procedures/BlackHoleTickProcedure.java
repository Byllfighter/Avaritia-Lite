package net.bullfighter.avaritia.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.bullfighter.avaritia.init.AvaritiaModItems;

public class BlackHoleTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.DRAGON_BREATH, (x - 2.5), (y - 2.5), (z - 2.5), 10, 2.5, 2.5, 2.5, 1);
		entity.getPersistentData().putDouble("time", (entity.getPersistentData().getDouble("time") + 0.05));
		if (entity.getPersistentData().getDouble("time") >= 10) {
			{
				Entity _ent = entity;
				_ent.teleportTo(x, (-1000), z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, (-1000), z, _ent.getYRot(), _ent.getXRot());
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 30, Level.ExplosionInteraction.TNT);
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(3, new ItemStack(AvaritiaModItems.BLACK_HOLE_ITEM.get()));
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(AvaritiaModItems.BLACK_HOLE_ITEM.get()));
			}
		}
	}
}
