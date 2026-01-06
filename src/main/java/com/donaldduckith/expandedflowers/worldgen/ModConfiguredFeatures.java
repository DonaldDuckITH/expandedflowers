package com.donaldduckith.expandedflowers.worldgen;

import com.donaldduckith.expandedflowers.ExpandedFlowers;
import com.donaldduckith.expandedflowers.registry.ModBlocks;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.WeightedList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BushFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.NoiseProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.NoiseThresholdProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.BendingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import org.spongepowered.include.com.google.common.collect.ImmutableList;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?,?>> WHITE_WATTLE_KEY = registerKey("white_wattle");
    public static final ResourceKey<ConfiguredFeature<?,?>> RED_WATTLE_KEY = registerKey("red_wattle");
    public static final ResourceKey<ConfiguredFeature<?,?>> ORANGE_WATTLE_KEY = registerKey("orange_wattle");
    public static final ResourceKey<ConfiguredFeature<?,?>> YELLOW_WATTLE_KEY = registerKey("yellow_wattle");
    public static final ResourceKey<ConfiguredFeature<?,?>> WHITE_BOTTLEBRUSH_KEY = registerKey("white_bottlebrush");
    public static final ResourceKey<ConfiguredFeature<?,?>> RED_BOTTLEBRUSH_KEY = registerKey("red_bottlebrush");
    public static final ResourceKey<ConfiguredFeature<?,?>> ORANGE_BOTTLEBRUSH_KEY = registerKey("orange_bottlebrush");
    public static final ResourceKey<ConfiguredFeature<?,?>> YELLOW_BOTTLEBRUSH_KEY = registerKey("yellow_bottlebrush");
    public static final ResourceKey<ConfiguredFeature<?,?>> MAGENTA_BOTTLEBRUSH_KEY = registerKey("magenta_bottlebrush");
    public static final ResourceKey<ConfiguredFeature<?,?>> PINK_BOTTLEBRUSH_KEY = registerKey("pink_bottlebrush");
    public static final ResourceKey<ConfiguredFeature<?,?>> BOUGAINVILLEA_BUSH_KEY = registerKey("bougainvillea_bush");
    public static final ResourceKey<ConfiguredFeature<?,?>> WHITE_BOUGAINVILLEA_KEY = registerKey("white_bougainvillea");
    public static final ResourceKey<ConfiguredFeature<?,?>> RED_BOUGAINVILLEA_KEY = registerKey("red_bougainvillea");
    public static final ResourceKey<ConfiguredFeature<?,?>> ORANGE_BOUGAINVILLEA_KEY = registerKey("orange_bougainvillea");
    public static final ResourceKey<ConfiguredFeature<?,?>> YELLOW_BOUGAINVILLEA_KEY = registerKey("yellow_bougainvillea");
    public static final ResourceKey<ConfiguredFeature<?,?>> PURPLE_BOUGAINVILLEA_KEY = registerKey("purple_bougainvillea");
    public static final ResourceKey<ConfiguredFeature<?,?>> MAGENTA_BOUGAINVILLEA_KEY = registerKey("magenta_bougainvillea");
    public static final ResourceKey<ConfiguredFeature<?,?>> PINK_BOUGAINVILLEA_KEY = registerKey("pink_bougainvillea");

    public static final ResourceKey<ConfiguredFeature<?,?>> FOREST_FLOWERS_KEY = registerKey("forest_flowers");
    public static final ResourceKey<ConfiguredFeature<?,?>> DARK_FOREST_FLOWERS_KEY = registerKey("dark_forest_flowers");
    public static final ResourceKey<ConfiguredFeature<?,?>> PLAIN_FLOWERS_KEY = registerKey("plain_flowers");
    public static final ResourceKey<ConfiguredFeature<?,?>> JUNGLE_FLOWERS_KEY = registerKey("jungle_flowers");
    public static final ResourceKey<ConfiguredFeature<?,?>> SAVANNA_FLOWERS_KEY = registerKey("savanna_flowers");
    public static final ResourceKey<ConfiguredFeature<?,?>> MEADOW_FLOWERS_KEY = registerKey("meadow_flowers");
    public static final ResourceKey<ConfiguredFeature<?,?>> TULIPS_KEY = registerKey("tulips");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        register(context, WHITE_WATTLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.ACACIA_LOG),
                new ForkingTrunkPlacer(3, 1, 1),
                BlockStateProvider.simple(ModBlocks.WHITE_WATTLE_LEAVES.get()),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 1))
                    .decorators(ImmutableList.of(new ModVineDecorator(0.25F, ModBlocks.WHITE_WATTLE_VINE.get())))
                    .ignoreVines()
                    .build()
        );
        register(context, RED_WATTLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.ACACIA_LOG),
                new ForkingTrunkPlacer(3, 1, 1),
                BlockStateProvider.simple(ModBlocks.RED_WATTLE_LEAVES.get()),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new ModVineDecorator(0.25F, ModBlocks.RED_WATTLE_VINE.get())))
                .ignoreVines()
                .build()
        );
        register(context, ORANGE_WATTLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.ACACIA_LOG),
                new ForkingTrunkPlacer(3, 1, 1),
                BlockStateProvider.simple(ModBlocks.ORANGE_WATTLE_LEAVES.get()),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new ModVineDecorator(0.25F, ModBlocks.ORANGE_WATTLE_VINE.get())))
                .ignoreVines()
                .build()
        );
        register(context, YELLOW_WATTLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.ACACIA_LOG),
                new ForkingTrunkPlacer(3, 1, 1),
                BlockStateProvider.simple(ModBlocks.YELLOW_WATTLE_LEAVES.get()),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new ModVineDecorator(0.25F, ModBlocks.YELLOW_WATTLE_VINE.get())))
                .ignoreVines()
                .build()
        );

        register(context, WHITE_BOTTLEBRUSH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.OAK_LOG),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                new WeightedStateProvider(
                        WeightedList.<BlockState>builder()
                                .add(ModBlocks.BOTTLEBRUSH_LEAVES.get().defaultBlockState(), 1)
                                .add(ModBlocks.WHITE_BOTTLEBRUSH_LEAVES.get().defaultBlockState(), 2)),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new ModHangingVineDecorator(ModBlocks.WHITE_BOTTLEBRUSH_END.get())))
                .ignoreVines()
                .build());
        register(context, RED_BOTTLEBRUSH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.OAK_LOG),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                new WeightedStateProvider(
                        WeightedList.<BlockState>builder()
                                .add(ModBlocks.BOTTLEBRUSH_LEAVES.get().defaultBlockState(), 1)
                                .add(ModBlocks.RED_BOTTLEBRUSH_LEAVES.get().defaultBlockState(), 2)),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new ModHangingVineDecorator(ModBlocks.RED_BOTTLEBRUSH_END.get())))
                .ignoreVines()
                .build());
        register(context, ORANGE_BOTTLEBRUSH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.OAK_LOG),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                new WeightedStateProvider(
                        WeightedList.<BlockState>builder()
                                .add(ModBlocks.BOTTLEBRUSH_LEAVES.get().defaultBlockState(), 1)
                                .add(ModBlocks.ORANGE_BOTTLEBRUSH_LEAVES.get().defaultBlockState(), 2)),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new ModHangingVineDecorator(ModBlocks.ORANGE_BOTTLEBRUSH_END.get())))
                .ignoreVines()
                .build());
        register(context, YELLOW_BOTTLEBRUSH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.OAK_LOG),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                new WeightedStateProvider(
                        WeightedList.<BlockState>builder()
                                .add(ModBlocks.BOTTLEBRUSH_LEAVES.get().defaultBlockState(), 1)
                                .add(ModBlocks.YELLOW_BOTTLEBRUSH_LEAVES.get().defaultBlockState(), 2)),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new ModHangingVineDecorator(ModBlocks.YELLOW_BOTTLEBRUSH_END.get())))
                .ignoreVines()
                .build());
        register(context, MAGENTA_BOTTLEBRUSH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.OAK_LOG),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                new WeightedStateProvider(
                        WeightedList.<BlockState>builder()
                                .add(ModBlocks.BOTTLEBRUSH_LEAVES.get().defaultBlockState(), 1)
                                .add(ModBlocks.MAGENTA_BOTTLEBRUSH_LEAVES.get().defaultBlockState(), 2)),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new ModHangingVineDecorator(ModBlocks.MAGENTA_BOTTLEBRUSH_END.get())))
                .ignoreVines()
                .build());
        register(context, PINK_BOTTLEBRUSH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.OAK_LOG),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                new WeightedStateProvider(
                        WeightedList.<BlockState>builder()
                                .add(ModBlocks.BOTTLEBRUSH_LEAVES.get().defaultBlockState(), 1)
                                .add(ModBlocks.PINK_BOTTLEBRUSH_LEAVES.get().defaultBlockState(), 2)),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(ImmutableList.of(new ModHangingVineDecorator(ModBlocks.PINK_BOTTLEBRUSH_END.get())))
                .ignoreVines()
                .build());

        register(context, BOUGAINVILLEA_BUSH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.JUNGLE_LOG),
                new StraightTrunkPlacer(1, 0, 0),
                BlockStateProvider.simple(ModBlocks.BOUGAINVILLEA_LEAVES.get()),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .build());
        register(context, WHITE_BOUGAINVILLEA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.JUNGLE_LOG),
                new StraightTrunkPlacer(1, 0, 0),
                new WeightedStateProvider(WeightedList.<BlockState>builder()
                        .add(ModBlocks.BOUGAINVILLEA_LEAVES.get().defaultBlockState(), 1)
                        .add(ModBlocks.WHITE_BOUGAINVILLEA.get().defaultBlockState(), 1)),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .build());
        register(context, RED_BOUGAINVILLEA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.JUNGLE_LOG),
                new StraightTrunkPlacer(1, 0, 0),
                new WeightedStateProvider(WeightedList.<BlockState>builder()
                        .add(ModBlocks.BOUGAINVILLEA_LEAVES.get().defaultBlockState(), 1)
                        .add(ModBlocks.RED_BOUGAINVILLEA.get().defaultBlockState(), 1)),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .build());
        register(context, ORANGE_BOUGAINVILLEA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.JUNGLE_LOG),
                new StraightTrunkPlacer(1, 0, 0),
                new WeightedStateProvider(WeightedList.<BlockState>builder()
                        .add(ModBlocks.BOUGAINVILLEA_LEAVES.get().defaultBlockState(), 1)
                        .add(ModBlocks.ORANGE_BOUGAINVILLEA.get().defaultBlockState(), 1)),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .build());
        register(context, YELLOW_BOUGAINVILLEA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.JUNGLE_LOG),
                new StraightTrunkPlacer(1, 0, 0),
                new WeightedStateProvider(WeightedList.<BlockState>builder()
                        .add(ModBlocks.BOUGAINVILLEA_LEAVES.get().defaultBlockState(), 1)
                        .add(ModBlocks.YELLOW_BOUGAINVILLEA.get().defaultBlockState(), 1)),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .build());
        register(context, PURPLE_BOUGAINVILLEA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.JUNGLE_LOG),
                new StraightTrunkPlacer(1, 0, 0),
                new WeightedStateProvider(WeightedList.<BlockState>builder()
                        .add(ModBlocks.BOUGAINVILLEA_LEAVES.get().defaultBlockState(), 1)
                        .add(ModBlocks.PURPLE_BOUGAINVILLEA.get().defaultBlockState(), 1)),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .build());
        register(context, MAGENTA_BOUGAINVILLEA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.JUNGLE_LOG),
                new StraightTrunkPlacer(1, 0, 0),
                new WeightedStateProvider(WeightedList.<BlockState>builder()
                        .add(ModBlocks.BOUGAINVILLEA_LEAVES.get().defaultBlockState(), 1)
                        .add(ModBlocks.MAGENTA_BOUGAINVILLEA.get().defaultBlockState(), 1)),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .build());
        register(context, PINK_BOUGAINVILLEA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.JUNGLE_LOG),
                new StraightTrunkPlacer(1, 0, 0),
                new WeightedStateProvider(WeightedList.<BlockState>builder()
                        .add(ModBlocks.BOUGAINVILLEA_LEAVES.get().defaultBlockState(), 1)
                        .add(ModBlocks.PINK_BOUGAINVILLEA.get().defaultBlockState(), 1)),
                new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(0, 0, 0))
                .build());

        register(context, TULIPS_KEY, Feature.FLOWER, new RandomPatchConfiguration(
                96,
                6,
                2,
                PlacementUtils.onlyWhenEmpty(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(
                                new NoiseProvider(
                                        2345L,
                                        new NormalNoise.NoiseParameters(0, 1.0),
                                        0.020833334F,
                                        List.of(
                                                ModBlocks.BLACK_TULIP.get().defaultBlockState(),
                                                ModBlocks.YELLOW_TULIP.get().defaultBlockState(),
                                                ModBlocks.PURPLE_TULIP.get().defaultBlockState(),
                                                ModBlocks.MAGENTA_TULIP.get().defaultBlockState()
                                        )
                                )
                        )
                )
        ));

        register(
                context,
                FOREST_FLOWERS_KEY,
                Feature.SIMPLE_RANDOM_SELECTOR,
                new SimpleRandomFeatureConfiguration(
                        HolderSet.direct(
                                PlacementUtils.inlinePlaced(
                                        Feature.RANDOM_PATCH,
                                        FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_LILAC.get())))
                                ),
                                PlacementUtils.inlinePlaced(
                                        Feature.RANDOM_PATCH,
                                        FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PURPLE_LILAC.get())))
                                ),
                                PlacementUtils.inlinePlaced(
                                        Feature.RANDOM_PATCH,
                                        FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_LILAC.get())))
                                ),
                                PlacementUtils.inlinePlaced(
                                        Feature.RANDOM_PATCH,
                                        FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.ORANGE_ORCHID.get()))
                                        )
                                ),
                                PlacementUtils.inlinePlaced(
                                        Feature.RANDOM_PATCH,
                                        FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_PEONY.get()))
                                        )
                                ),
                                PlacementUtils.inlinePlaced(
                                        Feature.RANDOM_PATCH,
                                        FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.MAGENTA_PEONY.get()))
                                        )
                                ),
                                PlacementUtils.inlinePlaced(
                                        Feature.RANDOM_PATCH,
                                        FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_ROSE_BUSH.get()))
                                        )
                                ),
                                PlacementUtils.inlinePlaced(
                                        Feature.RANDOM_PATCH,
                                        FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_ROSE_BUSH.get()))
                                        )
                                )
                        )
                )
        );

        register(
                context,
                DARK_FOREST_FLOWERS_KEY,
                Feature.SIMPLE_RANDOM_SELECTOR,
                new SimpleRandomFeatureConfiguration(
                        HolderSet.direct(
                                PlacementUtils.inlinePlaced(
                                        Feature.RANDOM_PATCH,
                                        FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.LIME_ROSE_BUSH.get())))
                                ),
                                PlacementUtils.inlinePlaced(
                                        Feature.RANDOM_PATCH,
                                        FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_ORCHID.get())))
                                )
                        )
                )
        );

        register(
                context,
                JUNGLE_FLOWERS_KEY,
                Feature.SIMPLE_RANDOM_SELECTOR,
                new SimpleRandomFeatureConfiguration(
                        HolderSet.direct(
                                PlacementUtils.inlinePlaced(
                                        Feature.RANDOM_PATCH,
                                        FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_ORCHID.get())))
                                )
                        )
                )
        );

        register(
                context,
                SAVANNA_FLOWERS_KEY,
                Feature.SIMPLE_RANDOM_SELECTOR,
                new SimpleRandomFeatureConfiguration(
                        HolderSet.direct(
                                PlacementUtils.inlinePlaced(
                                        Feature.RANDOM_PATCH,
                                        FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.ORANGE_POPPY.get())))
                                ),
                                PlacementUtils.inlinePlaced(
                                        Feature.RANDOM_PATCH,
                                        FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.YELLOW_POPPY.get())))
                                ),
                                PlacementUtils.inlinePlaced(
                                        Feature.RANDOM_PATCH,
                                        FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.YELLOW_ROSE_BUSH.get())))
                                )
                        )
                )
        );

        register(
                context,
                MEADOW_FLOWERS_KEY,
                Feature.SIMPLE_RANDOM_SELECTOR,
                new SimpleRandomFeatureConfiguration(
                        HolderSet.direct(
                                PlacementUtils.inlinePlaced(
                                        Feature.RANDOM_PATCH,
                                        FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CYAN_OXEYE_DAISY.get())))
                                )
                        )
                )
        );

        register(
                context,
                PLAIN_FLOWERS_KEY,
                Feature.FLOWER,
                new RandomPatchConfiguration(
                        64,
                        6,
                        2,
                        PlacementUtils.onlyWhenEmpty(
                                Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(
                                        new NoiseThresholdProvider(
                                                2345L,
                                                new NormalNoise.NoiseParameters(0, 1.0),
                                                0.005F,
                                                -0.8F,
                                                0.33333334F,
                                                Blocks.DANDELION.defaultBlockState(),
                                                List.of(
                                                        Blocks.WHITE_TULIP.defaultBlockState(),
                                                        Blocks.PINK_TULIP.defaultBlockState(),
                                                        Blocks.RED_TULIP.defaultBlockState(),
                                                        Blocks.ORANGE_TULIP.defaultBlockState(),
                                                        ModBlocks.YELLOW_TULIP.get().defaultBlockState(),
                                                        ModBlocks.MAGENTA_TULIP.get().defaultBlockState()
                                                ),
                                                List.of(
                                                        Blocks.POPPY.defaultBlockState(),
                                                        Blocks.AZURE_BLUET.defaultBlockState(),
                                                        ModBlocks.LIGHT_BLUE_AZURE_BLUET.get().defaultBlockState(),
                                                        ModBlocks.ORANGE_POPPY.get().defaultBlockState(),
                                                        ModBlocks.YELLOW_POPPY.get().defaultBlockState()
                                                )
                                        )
                                )
                        )
                )
        );

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void
    register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature(feature, configuration));
    }
}
