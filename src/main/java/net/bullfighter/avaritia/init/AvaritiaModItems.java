
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

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

public class AvaritiaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, AvaritiaMod.MODID);
	public static final DeferredHolder<Item, Item> DIAMOND_LATTICE = REGISTRY.register("diamond_lattice", () -> new DiamondLatticeItem());
	public static final DeferredHolder<Item, Item> INFINITY_CATALYST = REGISTRY.register("infinity_catalyst", () -> new InfinityCatalystItem());
	public static final DeferredHolder<Item, Item> CRYSTAL_MATRIX_INGOT = REGISTRY.register("crystal_matrix_ingot", () -> new CrystalMatrixIngotItem());
	public static final DeferredHolder<Item, Item> PILEOF_NEUTRONS = REGISTRY.register("pileof_neutrons", () -> new PileofNeutronsItem());
	public static final DeferredHolder<Item, Item> NEUTRON_COLLECTOR = block(AvaritiaModBlocks.NEUTRON_COLLECTOR);
	public static final DeferredHolder<Item, Item> NEUTRONIUM_NUGGET = REGISTRY.register("neutronium_nugget", () -> new NeutroniumNuggetItem());
	public static final DeferredHolder<Item, Item> NEUTRONIUM_INGOT = REGISTRY.register("neutronium_ingot", () -> new NeutroniumIngotItem());
	public static final DeferredHolder<Item, Item> INFINITY_INGOT = REGISTRY.register("infinity_ingot", () -> new InfinityIngotItem());
	public static final DeferredHolder<Item, Item> RECORD_FRAGMENT = REGISTRY.register("record_fragment", () -> new RecordFragmentItem());
	public static final DeferredHolder<Item, Item> IRON_SINGULARITY = REGISTRY.register("iron_singularity", () -> new IronSingularityItem());
	public static final DeferredHolder<Item, Item> GOLDEN_SINGULARITY = REGISTRY.register("golden_singularity", () -> new GoldenSingularityItem());
	public static final DeferredHolder<Item, Item> LAPIS_SINGULARITY = REGISTRY.register("lapis_singularity", () -> new LapisSingularityItem());
	public static final DeferredHolder<Item, Item> REDSTONE_SINGULARITY = REGISTRY.register("redstone_singularity", () -> new RedstoneSingularityItem());
	public static final DeferredHolder<Item, Item> NETHER_QUARTZ_SINGULARITY = REGISTRY.register("nether_quartz_singularity", () -> new NetherQuartzSingularityItem());
	public static final DeferredHolder<Item, Item> DIAMOND_SINGULARITY = REGISTRY.register("diamond_singularity", () -> new DiamondSingularityItem());
	public static final DeferredHolder<Item, Item> EMERALD_SINGULARITY = REGISTRY.register("emerald_singularity", () -> new EmeraldSingularityItem());
	public static final DeferredHolder<Item, Item> NEUTRONIUM_COMPRESSOR = block(AvaritiaModBlocks.NEUTRONIUM_COMPRESSOR);
	public static final DeferredHolder<Item, Item> SWORDOFTHE_COSMOS = REGISTRY.register("swordofthe_cosmos", () -> new SwordoftheCosmosItem());
	public static final DeferredHolder<Item, Item> PLANET_EATER = REGISTRY.register("planet_eater", () -> new PlanetEaterItem());
	public static final DeferredHolder<Item, Item> NATURES_RUIN = REGISTRY.register("natures_ruin", () -> new NaturesRuinItem());
	public static final DeferredHolder<Item, Item> HOEOFTHE_GREEN_EARTH = REGISTRY.register("hoeofthe_green_earth", () -> new HoeoftheGreenEarthItem());
	public static final DeferredHolder<Item, Item> WORLD_BREAKER = REGISTRY.register("world_breaker", () -> new WorldBreakerItem());
	public static final DeferredHolder<Item, Item> INFINITY_ARMOR_HELMET = REGISTRY.register("infinity_armor_helmet", () -> new InfinityArmorItem.Helmet());
	public static final DeferredHolder<Item, Item> INFINITY_ARMOR_CHESTPLATE = REGISTRY.register("infinity_armor_chestplate", () -> new InfinityArmorItem.Chestplate());
	public static final DeferredHolder<Item, Item> INFINITY_ARMOR_LEGGINGS = REGISTRY.register("infinity_armor_leggings", () -> new InfinityArmorItem.Leggings());
	public static final DeferredHolder<Item, Item> INFINITY_ARMOR_BOOTS = REGISTRY.register("infinity_armor_boots", () -> new InfinityArmorItem.Boots());
	public static final DeferredHolder<Item, Item> SKULLFIRE_SWORD = REGISTRY.register("skullfire_sword", () -> new SkullfireSwordItem());
	public static final DeferredHolder<Item, Item> COMPRESSED_CRAFTING_TABLE = block(AvaritiaModBlocks.COMPRESSED_CRAFTING_TABLE);
	public static final DeferredHolder<Item, Item> DOUBLE_COMPRESSED_CRAFTING_TABLE = block(AvaritiaModBlocks.DOUBLE_COMPRESSED_CRAFTING_TABLE);
	public static final DeferredHolder<Item, Item> EXTREME_CRAFTING_TABLE = block(AvaritiaModBlocks.EXTREME_CRAFTING_TABLE);
	public static final DeferredHolder<Item, Item> NEUTRONIUM_BLOCK = block(AvaritiaModBlocks.NEUTRONIUM_BLOCK);
	public static final DeferredHolder<Item, Item> INFINITY_BLOCK = block(AvaritiaModBlocks.INFINITY_BLOCK);
	public static final DeferredHolder<Item, Item> CRYSTAL_MATRIX = block(AvaritiaModBlocks.CRYSTAL_MATRIX);
	public static final DeferredHolder<Item, Item> ULTIMATE_STEW = REGISTRY.register("ultimate_stew", () -> new UltimateStewItem());
	public static final DeferredHolder<Item, Item> COSMIC_MEATBALLS = REGISTRY.register("cosmic_meatballs", () -> new CosmicMeatballsItem());
	public static final DeferredHolder<Item, Item> BLACK_HOLE_ITEM = REGISTRY.register("black_hole_item", () -> new BlackHoleItemItem());
	public static final DeferredHolder<Item, Item> LONGBOWOFTHE_HEAVENS = REGISTRY.register("longbowofthe_heavens", () -> new LongbowoftheHeavensItem());
	public static final DeferredHolder<Item, Item> ENDEST_PEARL = REGISTRY.register("endest_pearl", () -> new EndestPearlItem());
	public static final DeferredHolder<Item, Item> COPPER_SINGULARITY = REGISTRY.register("copper_singularity", () -> new CopperSingularityItem());
	public static final DeferredHolder<Item, Item> AMETHYST_SINGULARITY = REGISTRY.register("amethyst_singularity", () -> new AmethystSingularityItem());
	public static final DeferredHolder<Item, Item> NETHERITE_SINGULARITY = REGISTRY.register("netherite_singularity", () -> new NetheriteSingularityItem());
	public static final DeferredHolder<Item, Item> WORLD_BREAKER_HAMMER = REGISTRY.register("world_breaker_hammer", () -> new WorldBreakerHammerItem());
	public static final DeferredHolder<Item, Item> PLANET_EATER_DESTROYER = REGISTRY.register("planet_eater_destroyer", () -> new PlanetEaterDestroyerItem());

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
