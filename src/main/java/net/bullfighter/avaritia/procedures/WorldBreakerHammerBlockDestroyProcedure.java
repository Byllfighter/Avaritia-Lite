package net.bullfighter.avaritia.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.bullfighter.avaritia.init.AvaritiaModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WorldBreakerHammerBlockDestroyProcedure {
	@SubscribeEvent
	public static void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getLevel().getBlockState(event.getPos()), event.getFace(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Direction direction, Entity entity) {
		execute(null, world, x, y, z, blockstate, direction, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Direction direction, Entity entity) {
		if (direction == null || entity == null)
			return;
		double startz = 0;
		double starty = 0;
		double startx = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.WORLD_BREAKER_HAMMER.get()) {
			if (blockstate.is(BlockTags.create(new ResourceLocation("minecraft:mineable/pickaxe")))) {
				startx = x - 8;
				startz = z - 8;
				if (direction == Direction.DOWN || direction == Direction.UP) {
					starty = y - 8;
				} else {
					starty = y - 1;
				}
				for (int index0 = 0; index0 < 17; index0++) {
					for (int index1 = 0; index1 < 17; index1++) {
						for (int index2 = 0; index2 < 17; index2++) {
							{
								BlockPos _pos = BlockPos.containing(startx, starty, startz);
								Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(startx, starty, startz), null);
								world.destroyBlock(_pos, false);
							}
							startz = startz + 1;
						}
						startz = startz - 17;
						starty = starty + 1;
					}
					starty = starty - 17;
					startx = startx + 1;
				}
			}
		}
	}
}
