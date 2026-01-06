package com.donaldduckith.expandedflowers.datagen;

import com.donaldduckith.expandedflowers.registry.ModBlocks;
import com.donaldduckith.expandedflowers.registry.pollination.PollinationInfo;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.fml.common.Mod;
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
                .add(ModBlocks.PURPLE_AGAPANTHUS.getId(), new PollinationInfo(
                        List.of(PollinationInfo.PollinationSet.of(Blocks.OXEYE_DAISY, ModBlocks.WHITE_AGAPANTHUS.get()),
                                PollinationInfo.PollinationSet.of(Blocks.CLOSED_EYEBLOSSOM, ModBlocks.GRAY_AGAPANTHUS.get()),
                                PollinationInfo.PollinationSet.of(Blocks.OPEN_EYEBLOSSOM, ModBlocks.GRAY_AGAPANTHUS.get()),
                                PollinationInfo.PollinationSet.of(Blocks.ORANGE_TULIP, ModBlocks.ORANGE_AGAPANTHUS.get()),
                                PollinationInfo.PollinationSet.of(Blocks.CORNFLOWER, ModBlocks.BLUE_AGAPANTHUS.get()),
                                PollinationInfo.PollinationSet.of(Blocks.LILAC, ModBlocks.MAGENTA_AGAPANTHUS.get()),
                                PollinationInfo.PollinationSet.of(Blocks.PINK_TULIP, ModBlocks.PINK_AGAPANTHUS.get()))
                ), false)
                .add(ModBlocks.YELLOW_ARCTOTIS.getId(), new PollinationInfo(
                        List.of(PollinationInfo.PollinationSet.of(ModBlocks.WHITE_ORCHID.get(), ModBlocks.WHITE_ARCTOTIS.get()),
                                PollinationInfo.PollinationSet.of(Blocks.POPPY, ModBlocks.RED_ARCTOTIS.get()),
                                PollinationInfo.PollinationSet.of(Blocks.ORANGE_TULIP, ModBlocks.ORANGE_ARCTOTIS.get()),
                                PollinationInfo.PollinationSet.of(Blocks.ALLIUM, ModBlocks.MAGENTA_ARCTOTIS.get()),
                                PollinationInfo.PollinationSet.of(Blocks.PINK_PETALS, ModBlocks.PINK_ARCTOTIS.get()))
                ), false)
                .add(Blocks.FLOWERING_AZALEA.defaultBlockState().getBlockHolder(), new PollinationInfo(
                        List.of(PollinationInfo.PollinationSet.of(Blocks.POPPY, ModBlocks.RED_BOTTLEBRUSH_SAPLING.get()),
                                PollinationInfo.PollinationSet.of(Blocks.SPORE_BLOSSOM, ModBlocks.MAGENTA_BOUGAINVILLEA_SAPLING.get()))
                ), false)
                .add(ModBlocks.PINK_BABIANA.getId(), new PollinationInfo(
                        List.of(PollinationInfo.PollinationSet.of(Blocks.OXEYE_DAISY, ModBlocks.WHITE_BABIANA.get()),
                                PollinationInfo.PollinationSet.of(ModBlocks.PURPLE_TULIP.get(), ModBlocks.PURPLE_BABIANA.get()),
                                PollinationInfo.PollinationSet.of(Blocks.ALLIUM, ModBlocks.MAGENTA_BABIANA.get()))
                ), false)
                .add(Blocks.AZURE_BLUET.defaultBlockState().getBlockHolder(), new PollinationInfo(
                        List.of(PollinationInfo.PollinationSet.of(Blocks.DANDELION, ModBlocks.YELLOW_ARCTOTIS.get()))
                ), false)
                .add(ModBlocks.LIGHT_BLUE_AZURE_BLUET.getId(), new PollinationInfo(
                        List.of(PollinationInfo.PollinationSet.of(Blocks.BLUE_ORCHID, ModBlocks.LIGHT_BLUE_CHRYSANTHEMUM.get()))
                ), false)
                .add(ModBlocks.RED_BOTTLEBRUSH.getId(), new PollinationInfo(
                        List.of(PollinationInfo.PollinationSet.of(Blocks.AZURE_BLUET, ModBlocks.WHITE_BOTTLEBRUSH.get()),
                                PollinationInfo.PollinationSet.of(ModBlocks.ORANGE_ORCHID.get(), ModBlocks.ORANGE_BOTTLEBRUSH.get()),
                                PollinationInfo.PollinationSet.of(Blocks.DANDELION, ModBlocks.YELLOW_BOTTLEBRUSH.get()),
                                PollinationInfo.PollinationSet.of(Blocks.SPORE_BLOSSOM, ModBlocks.MAGENTA_BOTTLEBRUSH.get()),
                                PollinationInfo.PollinationSet.of(ModBlocks.PINK_ORCHID.get(), ModBlocks.PINK_BOTTLEBRUSH.get()))
                ), false)
                .add(ModBlocks.MAGENTA_BOUGAINVILLEA_SAPLING.getId(), new PollinationInfo(
                        List.of(PollinationInfo.PollinationSet.of(ModBlocks.WHITE_ORCHID.get(), ModBlocks.WHITE_BOUGAINVILLEA_SAPLING.get()),
                                PollinationInfo.PollinationSet.of(Blocks.POPPY, ModBlocks.RED_BOUGAINVILLEA_SAPLING.get()),
                                PollinationInfo.PollinationSet.of(ModBlocks.ORANGE_POPPY.get(), ModBlocks.ORANGE_BOUGAINVILLEA_SAPLING.get()),
                                PollinationInfo.PollinationSet.of(Blocks.WILDFLOWERS, ModBlocks.YELLOW_BOUGAINVILLEA_SAPLING.get()),
                                PollinationInfo.PollinationSet.of(ModBlocks.PURPLE_TULIP.get(), ModBlocks.PURPLE_BOUGAINVILLEA_SAPLING.get()),
                                PollinationInfo.PollinationSet.of(Blocks.PINK_PETALS, ModBlocks.PINK_BOUGAINVILLEA_SAPLING.get()))
                ), false)
                .add(ModBlocks.LIGHT_BLUE_CHRYSANTHEMUM.getId(), new PollinationInfo(
                        List.of(PollinationInfo.PollinationSet.of(Blocks.WHITE_TULIP, ModBlocks.WHITE_CHRYSANTHEMUM.get()),
                                PollinationInfo.PollinationSet.of(ModBlocks.BLACK_TULIP.get(), ModBlocks.BLACK_CHRYSANTHEMUM.get()),
                                PollinationInfo.PollinationSet.of(Blocks.RED_TULIP, ModBlocks.RED_CHRYSANTHEMUM.get()),
                                PollinationInfo.PollinationSet.of(Blocks.ORANGE_TULIP, ModBlocks.ORANGE_CHRYSANTHEMUM.get()),
                                PollinationInfo.PollinationSet.of(ModBlocks.YELLOW_TULIP.get(), ModBlocks.YELLOW_CHRYSANTHEMUM.get()),
                                PollinationInfo.PollinationSet.of(ModBlocks.LIME_ROSE_BUSH.get(), ModBlocks.LIME_CHRYSANTHEMUM.get()),
                                PollinationInfo.PollinationSet.of(ModBlocks.CYAN_OXEYE_DAISY.get(), ModBlocks.GREEN_CHRYSANTHEMUM.get()),
                                PollinationInfo.PollinationSet.of(Blocks.CORNFLOWER, ModBlocks.BLUE_CHRYSANTHEMUM.get()),
                                PollinationInfo.PollinationSet.of(ModBlocks.PURPLE_TULIP.get(), ModBlocks.PURPLE_CHRYSANTHEMUM.get()),
                                PollinationInfo.PollinationSet.of(ModBlocks.MAGENTA_TULIP.get(), ModBlocks.MAGENTA_CHRYSANTHEMUM.get()),
                                PollinationInfo.PollinationSet.of(Blocks.PINK_TULIP, ModBlocks.PINK_CHRYSANTHEMUM.get()))
                ), false)
                .add(ModBlocks.PURPLE_CLEMATIS.getId(), new PollinationInfo(
                        List.of(PollinationInfo.PollinationSet.of(Blocks.LILY_OF_THE_VALLEY, ModBlocks.WHITE_CLEMATIS.get()),
                                PollinationInfo.PollinationSet.of(Blocks.POPPY, ModBlocks.RED_CLEMATIS.get()),
                                PollinationInfo.PollinationSet.of(Blocks.WILDFLOWERS, ModBlocks.YELLOW_CLEMATIS.get()),
                                PollinationInfo.PollinationSet.of(Blocks.CORNFLOWER, ModBlocks.BLUE_CLEMATIS.get()),
                                PollinationInfo.PollinationSet.of(Blocks.ALLIUM, ModBlocks.MAGENTA_CLEMATIS.get()),
                                PollinationInfo.PollinationSet.of(Blocks.PINK_PETALS, ModBlocks.PINK_CLEMATIS.get()))
                ), false)
                .add(ModBlocks.RED_FIRE_LILY.getId(), new PollinationInfo(
                        List.of(PollinationInfo.PollinationSet.of(Blocks.OXEYE_DAISY, ModBlocks.WHITE_FIRE_LILY.get()),
                                PollinationInfo.PollinationSet.of(Blocks.ORANGE_TULIP, ModBlocks.ORANGE_FIRE_LILY.get()),
                                PollinationInfo.PollinationSet.of(Blocks.DANDELION, ModBlocks.YELLOW_FIRE_LILY.get()),
                                PollinationInfo.PollinationSet.of(ModBlocks.PURPLE_TULIP.get(), ModBlocks.PURPLE_FIRE_LILY.get()),
                                PollinationInfo.PollinationSet.of(Blocks.LILAC, ModBlocks.MAGENTA_FIRE_LILY.get()),
                                PollinationInfo.PollinationSet.of(Blocks.PINK_TULIP, ModBlocks.PINK_FIRE_LILY.get()))
                ), false)
                .add(ModBlocks.PINK_FOXGLOVE.getId(), new PollinationInfo(
                        List.of(PollinationInfo.PollinationSet.of(Blocks.LILY_OF_THE_VALLEY, ModBlocks.WHITE_FOXGLOVE.get()),
                                PollinationInfo.PollinationSet.of(Blocks.WILDFLOWERS, ModBlocks.YELLOW_FOXGLOVE.get()),
                                PollinationInfo.PollinationSet.of(Blocks.CORNFLOWER, ModBlocks.BLUE_FOXGLOVE.get()),
                                PollinationInfo.PollinationSet.of(ModBlocks.PURPLE_TULIP.get(), ModBlocks.PURPLE_FOXGLOVE.get()),
                                PollinationInfo.PollinationSet.of(Blocks.LILAC, ModBlocks.MAGENTA_FOXGLOVE.get()))
                ), false)
                .add(ModBlocks.PINK_HOLLYHOCK.getId(), new PollinationInfo(
                        List.of(PollinationInfo.PollinationSet.of(ModBlocks.WHITE_PEONY.get(), ModBlocks.WHITE_HOLLYHOCK.get()),
                                PollinationInfo.PollinationSet.of(ModBlocks.BLACK_TULIP.get(), ModBlocks.BLACK_HOLLYHOCK.get()),
                                PollinationInfo.PollinationSet.of(Blocks.RED_TULIP, ModBlocks.RED_HOLLYHOCK.get()),
                                PollinationInfo.PollinationSet.of(ModBlocks.YELLOW_ROSE_BUSH.get(), ModBlocks.YELLOW_HOLLYHOCK.get()),
                                PollinationInfo.PollinationSet.of(ModBlocks.MAGENTA_PEONY.get(), ModBlocks.MAGENTA_HOLLYHOCK.get()))
                ), false)
                .add(ModBlocks.PINK_LILAC.getId(), new PollinationInfo(
                        List.of(PollinationInfo.PollinationSet.of(Blocks.PINK_TULIP, ModBlocks.PINK_FOXGLOVE.get()))
                ), false)
                .add(Blocks.LILY_OF_THE_VALLEY.defaultBlockState().getBlockHolder(), new PollinationInfo(
                        List.of(PollinationInfo.PollinationSet.of(Blocks.ALLIUM, ModBlocks.PURPLE_AGAPANTHUS.get()),
                                PollinationInfo.PollinationSet.of(Blocks.POPPY, ModBlocks.RED_FIRE_LILY.get()))
                ), false)
                .add(Blocks.PEONY.defaultBlockState().getBlockHolder(), new PollinationInfo(
                        List.of(PollinationInfo.PollinationSet.of(ModBlocks.PINK_ROSE_BUSH.get(), ModBlocks.PINK_HOLLYHOCK.get()))
                ), false)
                .add(Blocks.PINK_PETALS.defaultBlockState().getBlockHolder(), new PollinationInfo(
                        List.of(PollinationInfo.PollinationSet.of(ModBlocks.WHITE_LILAC.get(), ModBlocks.PINK_BABIANA.get()))
                ), false);
    }
}
