
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.bullfighter.avaritia.item.WorldBreakerItem;
import net.bullfighter.avaritia.item.UltimateStewItem;
import net.bullfighter.avaritia.item.SwordoftheCosmosItem;
import net.bullfighter.avaritia.item.SkullfireSwordItem;
import net.bullfighter.avaritia.item.RedstoneSingularityItem;
import net.bullfighter.avaritia.item.RecordFragmentItem;
import net.bullfighter.avaritia.item.PlanetEaterItem;
import net.bullfighter.avaritia.item.PileofNeutronsItem;
import net.bullfighter.avaritia.item.NeutroniumNuggetItem;
import net.bullfighter.avaritia.item.NeutroniumIngotItem;
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

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AvaritiaModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item DIAMOND_LATTICE = register(new DiamondLatticeItem());
	public static final Item CRYSTAL_MATRIX_INGOT = register(new CrystalMatrixIngotItem());
	public static final Item PILEOF_NEUTRONS = register(new PileofNeutronsItem());
	public static final Item NEUTRONIUM_NUGGET = register(new NeutroniumNuggetItem());
	public static final Item NEUTRONIUM_INGOT = register(new NeutroniumIngotItem());
	public static final Item INFINITY_CATALYST = register(new InfinityCatalystItem());
	public static final Item NEUTRON_COLLECTOR = register(AvaritiaModBlocks.NEUTRON_COLLECTOR, AvaritiaModTabs.TAB_AVARITIATAB);
	public static final Item INFINITY_INGOT = register(new InfinityIngotItem());
	public static final Item RECORD_FRAGMENT = register(new RecordFragmentItem());
	public static final Item IRON_SINGULARITY = register(new IronSingularityItem());
	public static final Item GOLDEN_SINGULARITY = register(new GoldenSingularityItem());
	public static final Item LAPIS_SINGULARITY = register(new LapisSingularityItem());
	public static final Item REDSTONE_SINGULARITY = register(new RedstoneSingularityItem());
	public static final Item NETHER_QUARTZ_SINGULARITY = register(new NetherQuartzSingularityItem());
	public static final Item DIAMOND_SINGULARITY = register(new DiamondSingularityItem());
	public static final Item EMERALD_SINGULARITY = register(new EmeraldSingularityItem());
	public static final Item NEUTRONIUM_COMPRESSOR = register(AvaritiaModBlocks.NEUTRONIUM_COMPRESSOR, AvaritiaModTabs.TAB_AVARITIATAB);
	public static final Item SWORDOFTHE_COSMOS = register(new SwordoftheCosmosItem());
	public static final Item PLANET_EATER = register(new PlanetEaterItem());
	public static final Item NATURES_RUIN = register(new NaturesRuinItem());
	public static final Item HOEOFTHE_GREEN_EARTH = register(new HoeoftheGreenEarthItem());
	public static final Item LONGBOWOFTHE_HEAVENS = register(new LongbowoftheHeavensItem());
	public static final Item WORLD_BREAKER = register(new WorldBreakerItem());
	public static final Item INFINITY_ARMOR_HELMET = register(new InfinityArmorItem.Helmet());
	public static final Item INFINITY_ARMOR_CHESTPLATE = register(new InfinityArmorItem.Chestplate());
	public static final Item INFINITY_ARMOR_LEGGINGS = register(new InfinityArmorItem.Leggings());
	public static final Item INFINITY_ARMOR_BOOTS = register(new InfinityArmorItem.Boots());
	public static final Item SKULLFIRE_SWORD = register(new SkullfireSwordItem());
	public static final Item ULTIMATE_STEW = register(new UltimateStewItem());
	public static final Item COSMIC_MEATBALLS = register(new CosmicMeatballsItem());
	public static final Item COMPRESSED_CRAFTING_TABLE = register(AvaritiaModBlocks.COMPRESSED_CRAFTING_TABLE, AvaritiaModTabs.TAB_AVARITIATAB);
	public static final Item DOUBLE_COMPRESSED_CRAFTING_TABLE = register(AvaritiaModBlocks.DOUBLE_COMPRESSED_CRAFTING_TABLE,
			AvaritiaModTabs.TAB_AVARITIATAB);
	public static final Item EXTREME_CRAFTING_TABLE = register(AvaritiaModBlocks.EXTREME_CRAFTING_TABLE, AvaritiaModTabs.TAB_AVARITIATAB);
	public static final Item NEUTRONIUM_BLOCK = register(AvaritiaModBlocks.NEUTRONIUM_BLOCK, AvaritiaModTabs.TAB_AVARITIATAB);
	public static final Item INFINITY_BLOCK = register(AvaritiaModBlocks.INFINITY_BLOCK, AvaritiaModTabs.TAB_AVARITIATAB);
	public static final Item CRYSTAL_MATRIX = register(AvaritiaModBlocks.CRYSTAL_MATRIX, AvaritiaModTabs.TAB_AVARITIATAB);
	public static final Item ENDEST_PEARL = register(new EndestPearlItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
