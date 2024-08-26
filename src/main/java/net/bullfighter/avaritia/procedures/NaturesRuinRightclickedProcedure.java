package net.bullfighter.avaritia.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

public class NaturesRuinRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double startx = 0;
		double starty = 0;
		double startz = 0;
		if (entity.isShiftKeyDown()) {
			startx = x - 8;
			starty = y - 8;
			startz = z - 8;
			for (int index0 = 0; index0 < 17; index0++) {
				for (int index1 = 0; index1 < 17; index1++) {
					for (int index2 = 0; index2 < 17; index2++) {
						if ((world.getBlockState(BlockPos.containing(startx, starty, startz))).getBlock() == Blocks.GRASS_BLOCK) {
							{
								BlockPos _bp = BlockPos.containing(startx, starty, startz);
								BlockState _bs = Blocks.DIRT.defaultBlockState();
								BlockState _bso = world.getBlockState(_bp);
								for (Property<?> _propertyOld : _bso.getProperties()) {
									Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
									if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
										try {
											_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
										} catch (Exception e) {
										}
								}
								BlockEntity _be = world.getBlockEntity(_bp);
								CompoundTag _bnbt = null;
								if (_be != null) {
									_bnbt = _be.saveWithFullMetadata(world.registryAccess());
									_be.setRemoved();
								}
								world.setBlock(_bp, _bs, 3);
								if (_bnbt != null) {
									_be = world.getBlockEntity(_bp);
									if (_be != null) {
										try {
											_be.loadWithComponents(_bnbt, world.registryAccess());
										} catch (Exception ignored) {
										}
									}
								}
							}
						}
						if ((world.getBlockState(BlockPos.containing(startx, starty, startz))).is(BlockTags.create(new ResourceLocation("avaritia:netures_ruin_destroys")))) {
							{
								BlockPos _pos = BlockPos.containing(startx, starty, startz);
								Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(startx, starty, startz), null);
								world.destroyBlock(_pos, false);
							}
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
