package com.donaldduckith.expandedflowers.datagen;

import com.donaldduckith.expandedflowers.registry.ModBlocks;
import com.donaldduckith.expandedflowers.registry.pollination.PollinationInfo;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    public ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider provider) {
        this.builder(NeoForgeDataMaps.FURNACE_FUELS)
                .add(ModBlocks.BOTTLEBRUSH_LEAVES.getId(), new FurnaceFuel(100), false)
                .add(ModBlocks.WHITE_BOTTLEBRUSH_LEAVES.getId(), new FurnaceFuel(100), false)
                .add(ModBlocks.RED_BOTTLEBRUSH_LEAVES.getId(), new FurnaceFuel(100), false)
                .add(ModBlocks.ORANGE_BOTTLEBRUSH_LEAVES.getId(), new FurnaceFuel(100), false)
                .add(ModBlocks.YELLOW_BOTTLEBRUSH_LEAVES.getId(), new FurnaceFuel(100), false)
                .add(ModBlocks.MAGENTA_BOTTLEBRUSH_LEAVES.getId(), new FurnaceFuel(100), false)
                .add(ModBlocks.PINK_BOTTLEBRUSH_LEAVES.getId(), new FurnaceFuel(100), false)
                .add(ModBlocks.BOUGAINVILLEA_LEAVES.getId(), new FurnaceFuel(100), false)
                .add(ModBlocks.WHITE_BOUGAINVILLEA.getId(), new FurnaceFuel(100), false)
                .add(ModBlocks.RED_BOUGAINVILLEA.getId(), new FurnaceFuel(100), false)
                .add(ModBlocks.ORANGE_BOUGAINVILLEA.getId(), new FurnaceFuel(100), false)
                .add(ModBlocks.YELLOW_BOUGAINVILLEA.getId(), new FurnaceFuel(100), false)
                .add(ModBlocks.PURPLE_BOUGAINVILLEA.getId(), new FurnaceFuel(100), false)
                .add(ModBlocks.MAGENTA_BOUGAINVILLEA.getId(), new FurnaceFuel(100), false)
                .add(ModBlocks.PINK_BOUGAINVILLEA.getId(), new FurnaceFuel(100), false);

        this.builder(PollinationInfo.POLLINATION_INFO)
                .replace(false)
                .add(Blocks.FLOWERING_AZALEA.builtInRegistryHolder(), new PollinationInfo(
                        List.of(PollinationInfo.PollinationSet.of(Blocks.POPPY, ModBlocks.RED_BOTTLEBRUSH_SAPLING.get()),
                                PollinationInfo.PollinationSet.of(Blocks.SPORE_BLOSSOM, ModBlocks.MAGENTA_BOUGAINVILLEA_SAPLING.get()))
                ), false)
                .add(Blocks.VINE.builtInRegistryHolder(), new PollinationInfo(
                        List.of(PollinationInfo.PollinationSet.of(ModBlocks.PURPLE_TULIP.get(), ModBlocks.PURPLE_CLEMATIS.get()))
                ), false);
    }
}
