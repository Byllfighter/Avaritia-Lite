package net.bullfighter.avaritia.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.bullfighter.avaritia.init.AvaritiaModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WorldBreakerHammerBlockDestroyProcedure {
	@SubscribeEvent
	public static void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getFace(), event.getEntity());
	}

	public static void execute(double x, double y, double z, Direction direction, Entity entity) {
		execute(null, x, y, z, direction, entity);
	}

	private static void execute(@Nullable Event event, double x, double y, double z, Direction direction, Entity entity) {
		if (direction == null || entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.WORLD_BREAKER_HAMMER.get()) {
			if (direction == Direction.DOWN || direction == Direction.UP) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								("fill " + new java.text.DecimalFormat("##").format(x - 8) + " " + new java.text.DecimalFormat("##").format(y - 8) + " " + new java.text.DecimalFormat("##").format(z - 8) + " "
										+ new java.text.DecimalFormat("##").format(x + 8) + " " + new java.text.DecimalFormat("##").format(y + 8) + " " + new java.text.DecimalFormat("##").format(z + 8) + " minecraft:air destroy"));
					}
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								("fill " + new java.text.DecimalFormat("##").format(x - 8) + " " + new java.text.DecimalFormat("##").format(y - 1) + " " + new java.text.DecimalFormat("##").format(z - 8) + " "
										+ new java.text.DecimalFormat("##").format(x + 8) + " " + new java.text.DecimalFormat("##").format(y + 15) + " " + new java.text.DecimalFormat("##").format(z + 8) + " minecraft:air destroy"));
					}
				}
			}
		}
	}
}
