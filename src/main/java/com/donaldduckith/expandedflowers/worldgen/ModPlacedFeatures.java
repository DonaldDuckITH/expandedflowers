package com.donaldduckith.expandedflowers.worldgen;

import com.donaldduckith.expandedflowers.ExpandedFlowers;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ClampedInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> FOREST_FLOWERS_PLACED_KEY = registerKey("forest_flowers_placed");
    public static final ResourceKey<PlacedFeature> DARK_FOREST_FLOWERS_PLACED_KEY = registerKey("dark_forest_flowers_placed");
    public static final ResourceKey<PlacedFeature> PLAIN_FLOWERS_PLACED_KEY = registerKey("plain_flowers_placed");
    public static final ResourceKey<PlacedFeature> JUNGLE_FLOWERS_PLACED_KEY = registerKey("jungle_flowers_placed");
    public static final ResourceKey<PlacedFeature> SAVANNA_FLOWERS_PLACED_KEY = registerKey("savanna_flowers_placed");
    public static final ResourceKey<PlacedFeature> MEADOW_FLOWERS_PLACED_KEY = registerKey("meadow_flowers_placed");
    public static final ResourceKey<PlacedFeature> TULIPS_PLACED_KEY = registerKey("tulips_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, FOREST_FLOWERS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FOREST_FLOWERS_KEY),
                List.of(
                        RarityFilter.onAverageOnceEvery(7),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        CountPlacement.of(ClampedInt.of(UniformInt.of(-3, 1), 0, 1)),
                        BiomeFilter.biome()
                )
        );

        register(context, DARK_FOREST_FLOWERS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DARK_FOREST_FLOWERS_KEY),
                List.of(
                        RarityFilter.onAverageOnceEvery(7),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        CountPlacement.of(ClampedInt.of(UniformInt.of(-3, 1), 0, 1)),
                        BiomeFilter.biome()
                )
        );

        register(context, PLAIN_FLOWERS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PLAIN_FLOWERS_KEY),
                List.of(
                        NoiseThresholdCountPlacement.of(-0.8, 15, 4),
                        RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()
                )
        );

        register(context, SAVANNA_FLOWERS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SAVANNA_FLOWERS_KEY),
                List.of(
                        NoiseThresholdCountPlacement.of(-0.8, 15, 4),
                        RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()
                )
        );

        register(context, JUNGLE_FLOWERS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.JUNGLE_FLOWERS_KEY),
                List.of(
                        RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()
                )
        );

        register(context, MEADOW_FLOWERS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MEADOW_FLOWERS_KEY),
                List.of(
                        NoiseThresholdCountPlacement.of(-0.8, 15, 4),
                        RarityFilter.onAverageOnceEvery(32),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        BiomeFilter.biome()
                )
        );

        register(context, TULIPS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TULIPS_KEY),
                List.of(
                        RarityFilter.onAverageOnceEvery(7),
                        InSquarePlacement.spread(),
                        PlacementUtils.HEIGHTMAP,
                        CountPlacement.of(ClampedInt.of(UniformInt.of(-1, 3), 0, 3)),
                        BiomeFilter.biome()
                )
        );
    }

    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                 Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
