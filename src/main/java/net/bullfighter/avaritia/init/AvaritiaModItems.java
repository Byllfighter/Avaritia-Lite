/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.client.event.RegisterRangeSelectItemModelPropertyEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;

import net.bullfighter.avaritia.item.WorldBreakerItem;
import net.bullfighter.avaritia.item.WorldBreakerHammerItem;
import net.bullfighter.avaritia.item.UltimateStewItem;
import net.bullfighter.avaritia.item.SwordoftheCosmosItem;
import net.bullfighter.avaritia.item.SkullfireSwordItem;
import net.bullfighter.avaritia.item.RedstoneSingularityItem;
import net.bullfighter.avaritia.item.RecordFragmentItem;
import net.bullfighter.avaritia.item.PlanetEaterItem;
import net.bullfighter.avaritia.item.PlanetEaterDestroyerItem;
import net.bullfighter.avaritia.item.PileofNeutronsItem;
import net.bullfighter.avaritia.item.NeutroniumNuggetItem;
import net.bullfighter.avaritia.item.NeutroniumIngotItem;
import net.bullfighter.avaritia.item.NetheriteSingularityItem;
import net.bullfighter.avaritia.item.NetherQuartzSingularityItem;
import net.bullfighter.avaritia.item.NaturesRuinItem;
import net.bullfighter.avaritia.item.LongbowoftheHeavensItem;
import net.bullfighter.avaritia.item.LapisSingularityItem;
import net.bullfighter.avaritia.item.IronSingularityItem;
import net.bullfighter.avaritia.item.InfinityIngotItem;
import net.bullfighter.avaritia.item.InfinityCatalystItem;
import net.bullfighter.avaritia.item.InfinityArmorItem;
import net.bullfighter.avaritia.item.HoeoftheGreenEarthItem;
import net.bullfighter.avaritia.item.GoldenSingularityItem;
import net.bullfighter.avaritia.item.EndestPearlItem;
import net.bullfighter.avaritia.item.EmeraldSingularityItem;
import net.bullfighter.avaritia.item.DiamondSingularityItem;
import net.bullfighter.avaritia.item.DiamondLatticeItem;
import net.bullfighter.avaritia.item.CrystalMatrixIngotItem;
import net.bullfighter.avaritia.item.CosmicMeatballsItem;
import net.bullfighter.avaritia.item.CopperSingularityItem;
import net.bullfighter.avaritia.item.BlackHoleItemItem;
import net.bullfighter.avaritia.item.AmethystSingularityItem;
import net.bullfighter.avaritia.AvaritiaMod;

import java.util.function.Function;

public class AvaritiaModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AvaritiaMod.MODID);
	public static final DeferredItem<Item> DIAMOND_LATTICE = register("diamond_lattice", DiamondLatticeItem::new);
	public static final DeferredItem<Item> INFINITY_CATALYST = register("infinity_catalyst", InfinityCatalystItem::new);
	public static final DeferredItem<Item> CRYSTAL_MATRIX_INGOT = register("crystal_matrix_ingot", CrystalMatrixIngotItem::new);
	public static final DeferredItem<Item> PILEOF_NEUTRONS = register("pileof_neutrons", PileofNeutronsItem::new);
	public static final DeferredItem<Item> NEUTRON_COLLECTOR = block(AvaritiaModBlocks.NEUTRON_COLLECTOR);
	public static final DeferredItem<Item> NEUTRONIUM_NUGGET = register("neutronium_nugget", NeutroniumNuggetItem::new);
	public static final DeferredItem<Item> NEUTRONIUM_INGOT = register("neutronium_ingot", NeutroniumIngotItem::new);
	public static final DeferredItem<Item> INFINITY_INGOT = register("infinity_ingot", InfinityIngotItem::new);
	public static final DeferredItem<Item> RECORD_FRAGMENT = register("record_fragment", RecordFragmentItem::new);
	public static final DeferredItem<Item> IRON_SINGULARITY = register("iron_singularity", IronSingularityItem::new);
	public static final DeferredItem<Item> GOLDEN_SINGULARITY = register("golden_singularity", GoldenSingularityItem::new);
	public static final DeferredItem<Item> LAPIS_SINGULARITY = register("lapis_singularity", LapisSingularityItem::new);
	public static final DeferredItem<Item> REDSTONE_SINGULARITY = register("redstone_singularity", RedstoneSingularityItem::new);
	public static final DeferredItem<Item> NETHER_QUARTZ_SINGULARITY = register("nether_quartz_singularity", NetherQuartzSingularityItem::new);
	public static final DeferredItem<Item> DIAMOND_SINGULARITY = register("diamond_singularity", DiamondSingularityItem::new);
	public static final DeferredItem<Item> EMERALD_SINGULARITY = register("emerald_singularity", EmeraldSingularityItem::new);
	public static final DeferredItem<Item> NEUTRONIUM_COMPRESSOR = block(AvaritiaModBlocks.NEUTRONIUM_COMPRESSOR);
	public static final DeferredItem<Item> SWORDOFTHE_COSMOS = register("swordofthe_cosmos", SwordoftheCosmosItem::new);
	public static final DeferredItem<Item> PLANET_EATER = register("planet_eater", PlanetEaterItem::new);
	public static final DeferredItem<Item> NATURES_RUIN = register("natures_ruin", NaturesRuinItem::new);
	public static final DeferredItem<Item> HOEOFTHE_GREEN_EARTH = register("hoeofthe_green_earth", HoeoftheGreenEarthItem::new);
	public static final DeferredItem<Item> WORLD_BREAKER = register("world_breaker", WorldBreakerItem::new);
	public static final DeferredItem<Item> INFINITY_ARMOR_HELMET = register("infinity_armor_helmet", InfinityArmorItem.Helmet::new);
	public static final DeferredItem<Item> INFINITY_ARMOR_CHESTPLATE = register("infinity_armor_chestplate", InfinityArmorItem.Chestplate::new);
	public static final DeferredItem<Item> INFINITY_ARMOR_LEGGINGS = register("infinity_armor_leggings", InfinityArmorItem.Leggings::new);
	public static final DeferredItem<Item> INFINITY_ARMOR_BOOTS = register("infinity_armor_boots", InfinityArmorItem.Boots::new);
	public static final DeferredItem<Item> SKULLFIRE_SWORD = register("skullfire_sword", SkullfireSwordItem::new);
	public static final DeferredItem<Item> COMPRESSED_CRAFTING_TABLE = block(AvaritiaModBlocks.COMPRESSED_CRAFTING_TABLE);
	public static final DeferredItem<Item> DOUBLE_COMPRESSED_CRAFTING_TABLE = block(AvaritiaModBlocks.DOUBLE_COMPRESSED_CRAFTING_TABLE);
	public static final DeferredItem<Item> EXTREME_CRAFTING_TABLE = block(AvaritiaModBlocks.EXTREME_CRAFTING_TABLE);
	public static final DeferredItem<Item> NEUTRONIUM_BLOCK = block(AvaritiaModBlocks.NEUTRONIUM_BLOCK);
	public static final DeferredItem<Item> INFINITY_BLOCK = block(AvaritiaModBlocks.INFINITY_BLOCK);
	public static final DeferredItem<Item> CRYSTAL_MATRIX = block(AvaritiaModBlocks.CRYSTAL_MATRIX);
	public static final DeferredItem<Item> ULTIMATE_STEW = register("ultimate_stew", UltimateStewItem::new);
	public static final DeferredItem<Item> COSMIC_MEATBALLS = register("cosmic_meatballs", CosmicMeatballsItem::new);
	public static final DeferredItem<Item> BLACK_HOLE_ITEM = register("black_hole_item", BlackHoleItemItem::new);
	public static final DeferredItem<Item> LONGBOWOFTHE_HEAVENS = register("longbowofthe_heavens", LongbowoftheHeavensItem::new);
	public static final DeferredItem<Item> ENDEST_PEARL = register("endest_pearl", EndestPearlItem::new);
	public static final DeferredItem<Item> COPPER_SINGULARITY = register("copper_singularity", CopperSingularityItem::new);
	public static final DeferredItem<Item> AMETHYST_SINGULARITY = register("amethyst_singularity", AmethystSingularityItem::new);
	public static final DeferredItem<Item> NETHERITE_SINGULARITY = register("netherite_singularity", NetheriteSingularityItem::new);
	public static final DeferredItem<Item> WORLD_BREAKER_HAMMER = register("world_breaker_hammer", WorldBreakerHammerItem::new);
	public static final DeferredItem<Item> PLANET_EATER_DESTROYER = register("planet_eater_destroyer", PlanetEaterDestroyerItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ItemsClientSideHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void registerItemModelProperties(RegisterRangeSelectItemModelPropertyEvent event) {
			event.register(ResourceLocation.parse("avaritia:longbowofthe_heavens/pulling"), LongbowoftheHeavensItem.PullingProperty.MAP_CODEC);
			event.register(ResourceLocation.parse("avaritia:longbowofthe_heavens/pull"), LongbowoftheHeavensItem.PullProperty.MAP_CODEC);
		}
	}
}