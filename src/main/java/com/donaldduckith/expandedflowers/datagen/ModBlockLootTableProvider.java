package com.donaldduckith.expandedflowers.datagen;

import com.donaldduckith.expandedflowers.block.TripleBlockSegment;
import com.donaldduckith.expandedflowers.block.TriplePlantBlock;
import com.donaldduckith.expandedflowers.registry.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.BOUGAINVILLEA_SAPLING.get());

        this.add(ModBlocks.WHITE_AGAPANTHUS.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.WHITE_ARCTOTIS.get());
        dropSelf(ModBlocks.WHITE_BABIANA.get());
        dropSelf(ModBlocks.WHITE_BIRD_OF_PARADISE.get());
        dropOther(ModBlocks.WHITE_BOTTLEBRUSH.get(), ModBlocks.WHITE_BOTTLEBRUSH_END.get());
        dropSelf(ModBlocks.WHITE_BOTTLEBRUSH_END.get());
        dropSelf(ModBlocks.WHITE_BOTTLEBRUSH_SAPLING.get());
        dropSelf(ModBlocks.WHITE_BOUGAINVILLEA_SAPLING.get());
        dropSelf(ModBlocks.WHITE_CHRYSANTHEMUM.get());
        dropSelf(ModBlocks.WHITE_CLEMATIS.get());
        this.add(ModBlocks.WHITE_FOXGLOVE.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.WHITE_GREVILLEA.get());
        dropSelf(ModBlocks.WHITE_HELLEBORE.get());
        this.add(ModBlocks.WHITE_HOLLYHOCK.get(), property -> this.createSinglePropConditionTable(property, TriplePlantBlock.SEGMENT, TripleBlockSegment.LOWER));
        dropSelf(ModBlocks.WHITE_HYDRANGEA.get());
        this.add(ModBlocks.WHITE_LILAC.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.WHITE_ORCHID.get());
        dropSelf(ModBlocks.WHITE_PANSY.get());
        this.add(ModBlocks.WHITE_PEONY.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.WHITE_POPPY.get());
        this.add(ModBlocks.WHITE_ROSE_BUSH.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.WHITE_ROSEMARY.get());
        dropSelf(ModBlocks.WHITE_WARATAH.get());
        dropSelf(ModBlocks.WHITE_WATTLE_VINE.get());
        dropSelf(ModBlocks.WHITE_WATTLE_SAPLING.get());

        dropSelf(ModBlocks.LIGHT_GRAY_GREVILLEA.get());
        this.add(ModBlocks.LIGHT_GRAY_ROSE_BUSH.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));

        this.add(ModBlocks.GRAY_AGAPANTHUS.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.GRAY_GREVILLEA.get());

        dropSelf(ModBlocks.BLACK_PANSY.get());
        this.add(ModBlocks.BLACK_HOLLYHOCK.get(), property -> this.createSinglePropConditionTable(property, TriplePlantBlock.SEGMENT, TripleBlockSegment.LOWER));
        dropSelf(ModBlocks.BLACK_CHRYSANTHEMUM.get());
        dropSelf(ModBlocks.BLACK_GREVILLEA.get());
        dropSelf(ModBlocks.BLACK_HELLEBORE.get());
        dropSelf(ModBlocks.BLACK_TULIP.get());
        this.add(ModBlocks.BLACK_ROSE_BUSH.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));

        dropSelf(ModBlocks.BROWN_PANSY.get());

        dropSelf(ModBlocks.RED_ARCTOTIS.get());
        dropOther(ModBlocks.RED_BOTTLEBRUSH.get(), ModBlocks.RED_BOTTLEBRUSH_END.get());
        dropSelf(ModBlocks.RED_BOTTLEBRUSH_END.get());
        dropSelf(ModBlocks.RED_BOTTLEBRUSH_SAPLING.get());
        dropSelf(ModBlocks.RED_BOUGAINVILLEA_SAPLING.get());
        dropSelf(ModBlocks.RED_CHRYSANTHEMUM.get());
        dropSelf(ModBlocks.RED_CLEMATIS.get());
        dropSelf(ModBlocks.RED_GREVILLEA.get());
        dropSelf(ModBlocks.RED_HELLEBORE.get());
        this.add(ModBlocks.RED_HOLLYHOCK.get(), property -> this.createSinglePropConditionTable(property, TriplePlantBlock.SEGMENT, TripleBlockSegment.LOWER));
        dropSelf(ModBlocks.RED_HYDRANGEA.get());
        dropSelf(ModBlocks.RED_PANSY.get());
        dropSelf(ModBlocks.RED_WARATAH.get());
        dropSelf(ModBlocks.RED_WATTLE_VINE.get());
        dropSelf(ModBlocks.RED_WATTLE_SAPLING.get());

        this.add(ModBlocks.ORANGE_AGAPANTHUS.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.ORANGE_ARCTOTIS.get());
        dropSelf(ModBlocks.ORANGE_BIRD_OF_PARADISE.get());
        dropOther(ModBlocks.ORANGE_BOTTLEBRUSH.get(), ModBlocks.ORANGE_BOTTLEBRUSH_END.get());
        dropSelf(ModBlocks.ORANGE_BOTTLEBRUSH_END.get());
        dropSelf(ModBlocks.ORANGE_BOTTLEBRUSH_SAPLING.get());
        dropSelf(ModBlocks.ORANGE_BOUGAINVILLEA_SAPLING.get());
        dropSelf(ModBlocks.ORANGE_CHRYSANTHEMUM.get());
        dropSelf(ModBlocks.ORANGE_GREVILLEA.get());
        dropSelf(ModBlocks.ORANGE_ORCHID.get());
        dropSelf(ModBlocks.ORANGE_PANSY.get());
        dropSelf(ModBlocks.ORANGE_POPPY.get());
        this.add(ModBlocks.ORANGE_ROSE_BUSH.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.ORANGE_WATTLE_VINE.get());
        dropSelf(ModBlocks.ORANGE_WATTLE_SAPLING.get());

        dropSelf(ModBlocks.YELLOW_ARCTOTIS.get());
        dropSelf(ModBlocks.YELLOW_BIRD_OF_PARADISE.get());
        dropOther(ModBlocks.YELLOW_BOTTLEBRUSH.get(), ModBlocks.YELLOW_BOTTLEBRUSH_END.get());
        dropSelf(ModBlocks.YELLOW_BOTTLEBRUSH_END.get());
        dropSelf(ModBlocks.YELLOW_BOTTLEBRUSH_SAPLING.get());
        dropSelf(ModBlocks.YELLOW_BOUGAINVILLEA_SAPLING.get());
        dropSelf(ModBlocks.YELLOW_CLEMATIS.get());
        dropSelf(ModBlocks.YELLOW_CHRYSANTHEMUM.get());
        this.add(ModBlocks.YELLOW_FOXGLOVE.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.YELLOW_GREVILLEA.get());
        dropSelf(ModBlocks.YELLOW_HELLEBORE.get());
        this.add(ModBlocks.YELLOW_HOLLYHOCK.get(), property -> this.createSinglePropConditionTable(property, TriplePlantBlock.SEGMENT, TripleBlockSegment.LOWER));
        dropSelf(ModBlocks.YELLOW_HYDRANGEA.get());
        dropSelf(ModBlocks.YELLOW_ORCHID.get());
        dropSelf(ModBlocks.YELLOW_PANSY.get());
        dropSelf(ModBlocks.YELLOW_POPPY.get());
        this.add(ModBlocks.YELLOW_ROSE_BUSH.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.YELLOW_TULIP.get());
        dropSelf(ModBlocks.YELLOW_WARATAH.get());
        dropSelf(ModBlocks.YELLOW_WATTLE_VINE.get());
        dropSelf(ModBlocks.YELLOW_WATTLE_SAPLING.get());

        dropSelf(ModBlocks.LIME_CHRYSANTHEMUM.get());
        dropSelf(ModBlocks.LIME_HELLEBORE.get());
        dropSelf(ModBlocks.LIME_HYDRANGEA.get());
        this.add(ModBlocks.LIME_ROSE_BUSH.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));

        dropSelf(ModBlocks.GREEN_CHRYSANTHEMUM.get());

        dropSelf(ModBlocks.CYAN_ORCHID.get());
        dropSelf(ModBlocks.CYAN_OXEYE_DAISY.get());

        dropSelf(ModBlocks.LIGHT_BLUE_AZURE_BLUET.get());
        dropSelf(ModBlocks.LIGHT_BLUE_CHRYSANTHEMUM.get());
        dropSelf(ModBlocks.LIGHT_BLUE_HYDRANGEA.get());

        this.add(ModBlocks.BLUE_AGAPANTHUS.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.BLUE_CHRYSANTHEMUM.get());
        dropSelf(ModBlocks.BLUE_CLEMATIS.get());
        this.add(ModBlocks.BLUE_FOXGLOVE.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.BLUE_HYDRANGEA.get());
        dropSelf(ModBlocks.BLUE_PANSY.get());
        this.add(ModBlocks.BLUE_ROSE_BUSH.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));

        this.add(ModBlocks.PURPLE_AGAPANTHUS.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.PURPLE_BABIANA.get());
        dropSelf(ModBlocks.PURPLE_BOUGAINVILLEA_SAPLING.get());
        dropSelf(ModBlocks.PURPLE_CHRYSANTHEMUM.get());
        dropSelf(ModBlocks.PURPLE_CLEMATIS.get());
        this.add(ModBlocks.PURPLE_FOXGLOVE.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.PURPLE_HELLEBORE.get());
        dropSelf(ModBlocks.PURPLE_HYDRANGEA.get());
        this.add(ModBlocks.PURPLE_LILAC.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.PURPLE_ORCHID.get());
        dropSelf(ModBlocks.PURPLE_PANSY.get());
        this.add(ModBlocks.PURPLE_ROSE_BUSH.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.PURPLE_ROSEMARY.get());
        dropSelf(ModBlocks.PURPLE_TULIP.get());

        this.add(ModBlocks.MAGENTA_AGAPANTHUS.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.MAGENTA_ARCTOTIS.get());
        dropSelf(ModBlocks.MAGENTA_BABIANA.get());
        dropSelf(ModBlocks.MAGENTA_BIRD_OF_PARADISE.get());
        dropOther(ModBlocks.MAGENTA_BOTTLEBRUSH.get(), ModBlocks.MAGENTA_BOTTLEBRUSH_END.get());
        dropSelf(ModBlocks.MAGENTA_BOTTLEBRUSH_END.get());
        dropSelf(ModBlocks.MAGENTA_BOTTLEBRUSH_SAPLING.get());
        dropSelf(ModBlocks.MAGENTA_BOUGAINVILLEA_SAPLING.get());
        dropSelf(ModBlocks.MAGENTA_CHRYSANTHEMUM.get());
        dropSelf(ModBlocks.MAGENTA_CLEMATIS.get());
        this.add(ModBlocks.MAGENTA_FOXGLOVE.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.MAGENTA_GREVILLEA.get());
        dropSelf(ModBlocks.MAGENTA_HELLEBORE.get());
        this.add(ModBlocks.MAGENTA_HOLLYHOCK.get(), property -> this.createSinglePropConditionTable(property, TriplePlantBlock.SEGMENT, TripleBlockSegment.LOWER));
        dropSelf(ModBlocks.MAGENTA_HYDRANGEA.get());
        dropSelf(ModBlocks.MAGENTA_ORCHID.get());
        dropSelf(ModBlocks.MAGENTA_PANSY.get());
        this.add(ModBlocks.MAGENTA_PEONY.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(ModBlocks.MAGENTA_ROSE_BUSH.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.MAGENTA_TULIP.get());
        dropSelf(ModBlocks.MAGENTA_WARATAH.get());

        this.add(ModBlocks.PINK_AGAPANTHUS.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.PINK_ARCTOTIS.get());
        dropSelf(ModBlocks.PINK_BABIANA.get());
        dropOther(ModBlocks.PINK_BOTTLEBRUSH.get(), ModBlocks.PINK_BOTTLEBRUSH_END.get());
        dropSelf(ModBlocks.PINK_BOTTLEBRUSH_END.get());
        dropSelf(ModBlocks.PINK_BOTTLEBRUSH_SAPLING.get());
        dropSelf(ModBlocks.PINK_BOUGAINVILLEA_SAPLING.get());
        dropSelf(ModBlocks.PINK_CHRYSANTHEMUM.get());
        dropSelf(ModBlocks.PINK_CLEMATIS.get());
        this.add(ModBlocks.PINK_FOXGLOVE.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.PINK_HELLEBORE.get());
        this.add(ModBlocks.PINK_HOLLYHOCK.get(), property -> this.createSinglePropConditionTable(property, TriplePlantBlock.SEGMENT, TripleBlockSegment.LOWER));
        dropSelf(ModBlocks.PINK_HYDRANGEA.get());
        this.add(ModBlocks.PINK_LILAC.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.PINK_ORCHID.get());
        dropSelf(ModBlocks.PINK_PANSY.get());
        this.add(ModBlocks.PINK_ROSE_BUSH.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.PINK_ROSEMARY.get());
        dropSelf(ModBlocks.PINK_WARATAH.get());

        dropSelf(ModBlocks.CLEMATIS_VINE.get());
        this.add(ModBlocks.FOXGLOVE_BUSH.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(ModBlocks.HOLLYHOCK_BUSH.get(), property -> this.createSinglePropConditionTable(property, TriplePlantBlock.SEGMENT, TripleBlockSegment.LOWER));
        dropSelf(ModBlocks.ROSEMARY_BUSH.get());
        this.add(ModBlocks.DEAD_AGAPANTHUS.get(), property -> this.createSinglePropConditionTable(property, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));

        add(ModBlocks.WHITE_WATTLE_LEAVES.get(), block -> createLeavesDrops(ModBlocks.WHITE_WATTLE_LEAVES.get(), ModBlocks.WHITE_WATTLE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(ModBlocks.RED_WATTLE_LEAVES.get(), block -> createLeavesDrops(ModBlocks.RED_WATTLE_LEAVES.get(), ModBlocks.RED_WATTLE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(ModBlocks.ORANGE_WATTLE_LEAVES.get(), block -> createLeavesDrops(ModBlocks.ORANGE_WATTLE_LEAVES.get(), ModBlocks.ORANGE_WATTLE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(ModBlocks.YELLOW_WATTLE_LEAVES.get(), block -> createLeavesDrops(ModBlocks.YELLOW_WATTLE_LEAVES.get(), ModBlocks.YELLOW_WATTLE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        add(ModBlocks.BOTTLEBRUSH_LEAVES.get(), block -> createShearsOrSilkTouchOnlyDrop(ModBlocks.BOTTLEBRUSH_LEAVES.get()));
        add(ModBlocks.WHITE_BOTTLEBRUSH_LEAVES.get(), block -> createLeavesDrops(ModBlocks.WHITE_BOTTLEBRUSH_LEAVES.get(), ModBlocks.WHITE_BOTTLEBRUSH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(ModBlocks.RED_BOTTLEBRUSH_LEAVES.get(), block -> createLeavesDrops(ModBlocks.RED_BOTTLEBRUSH_LEAVES.get(), ModBlocks.RED_BOTTLEBRUSH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(ModBlocks.ORANGE_BOTTLEBRUSH_LEAVES.get(), block -> createLeavesDrops(ModBlocks.ORANGE_BOTTLEBRUSH_LEAVES.get(), ModBlocks.ORANGE_BOTTLEBRUSH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(ModBlocks.YELLOW_BOTTLEBRUSH_LEAVES.get(), block -> createLeavesDrops(ModBlocks.YELLOW_BOTTLEBRUSH_LEAVES.get(), ModBlocks.YELLOW_BOTTLEBRUSH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(ModBlocks.MAGENTA_BOTTLEBRUSH_LEAVES.get(), block -> createLeavesDrops(ModBlocks.MAGENTA_BOTTLEBRUSH_LEAVES.get(), ModBlocks.MAGENTA_BOTTLEBRUSH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(ModBlocks.PINK_BOTTLEBRUSH_LEAVES.get(), block -> createLeavesDrops(ModBlocks.PINK_BOTTLEBRUSH_LEAVES.get(), ModBlocks.PINK_BOTTLEBRUSH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        add(ModBlocks.BOUGAINVILLEA_LEAVES.get(), block -> createLeavesDrops(ModBlocks.BOUGAINVILLEA_LEAVES.get(), ModBlocks.BOUGAINVILLEA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(ModBlocks.WHITE_BOUGAINVILLEA.get(), block -> createLeavesDrops(ModBlocks.WHITE_BOUGAINVILLEA.get(), ModBlocks.WHITE_BOUGAINVILLEA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(ModBlocks.RED_BOUGAINVILLEA.get(), block -> createLeavesDrops(ModBlocks.RED_BOUGAINVILLEA.get(), ModBlocks.RED_BOUGAINVILLEA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(ModBlocks.ORANGE_BOUGAINVILLEA.get(), block -> createLeavesDrops(ModBlocks.ORANGE_BOUGAINVILLEA.get(), ModBlocks.ORANGE_BOUGAINVILLEA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(ModBlocks.YELLOW_BOUGAINVILLEA.get(), block -> createLeavesDrops(ModBlocks.YELLOW_BOUGAINVILLEA.get(), ModBlocks.YELLOW_BOUGAINVILLEA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(ModBlocks.PURPLE_BOUGAINVILLEA.get(), block -> createLeavesDrops(ModBlocks.PURPLE_BOUGAINVILLEA.get(), ModBlocks.PURPLE_BOUGAINVILLEA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(ModBlocks.MAGENTA_BOUGAINVILLEA.get(), block -> createLeavesDrops(ModBlocks.MAGENTA_BOUGAINVILLEA.get(), ModBlocks.MAGENTA_BOUGAINVILLEA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        add(ModBlocks.PINK_BOUGAINVILLEA.get(), block -> createLeavesDrops(ModBlocks.PINK_BOUGAINVILLEA.get(), ModBlocks.PINK_BOUGAINVILLEA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
