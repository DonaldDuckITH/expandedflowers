package com.donaldduckith.expandedflowers.registry;

import com.donaldduckith.flowerbreeding.ExpandedFlowers;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    private static boolean never(BlockState state, BlockGetter blockGetter, BlockPos pos) {
        return false;
    }
    private static BlockBehaviour.Properties leavesProperties(SoundType sound) {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .strength(0.2F)
                .randomTicks()
                .sound(sound)
                .noOcclusion()
                .isValidSpawn(Blocks::ocelotOrParrot)
                .isSuffocating(ModBlocks::never)
                .isViewBlocking(ModBlocks::never)
                .ignitedByLava()
                .pushReaction(PushReaction.DESTROY)
                .isRedstoneConductor(ModBlocks::never);
    }
    private static BlockBehaviour.Properties vineProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .randomTicks()
                .noCollission()
                .instabreak()
                .sound(SoundType.CAVE_VINES)
                .pushReaction(PushReaction.DESTROY);
    }
    private static BlockBehaviour.Properties bottlebrushVineProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .randomTicks()
                .noCollission()
                .instabreak()
                .sound(SoundType.CAVE_VINES)
                .pushReaction(PushReaction.DESTROY);
    }
    private static BlockBehaviour.Properties tallFlowerProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .ignitedByLava()
                .pushReaction(PushReaction.DESTROY);
    }
    private static BlockBehaviour.Properties flowerProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(BlockBehaviour.OffsetType.XZ)
                .ignitedByLava()
                .pushReaction(PushReaction.DESTROY);
    }
    private static BlockBehaviour.Properties flowerBedProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .sound(SoundType.PINK_PETALS)
                .pushReaction(PushReaction.DESTROY);
    }

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ExpandedFlowers.MODID);

    //Bottlebrush
    public static final DeferredBlock<Block> BOTTLEBRUSH_LEAVES = registerBlock("bottlebrush_leaves",
            () -> new LeavesBlock(0F, leavesProperties(SoundType.GRASS)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "bottlebrush_leaves")))) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos blockPos, RandomSource randomSource) {}
            });
    public static final DeferredBlock<Block> RED_BOTTLEBRUSH_LEAVES = registerBlock("red_bottlebrush_leaves",
            () -> new LeavesBlock(0F, leavesProperties(SoundType.GRASS)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "red_bottlebrush_leaves")))) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos blockPos, RandomSource randomSource) {}
            });
    public static final DeferredBlock<Block> ORANGE_BOTTLEBRUSH_LEAVES = registerBlock("orange_bottlebrush_leaves",
            () -> new LeavesBlock(0F, leavesProperties(SoundType.GRASS)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "orange_bottlebrush_leaves")))) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos blockPos, RandomSource randomSource) {}
            });
    public static final DeferredBlock<Block> YELLOW_BOTTLEBRUSH_LEAVES = registerBlock("yellow_bottlebrush_leaves",
            () -> new LeavesBlock(0F, leavesProperties(SoundType.GRASS)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_bottlebrush_leaves")))) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos blockPos, RandomSource randomSource) {}
            });
    public static final DeferredBlock<Block> WHITE_BOTTLEBRUSH_LEAVES = registerBlock("white_bottlebrush_leaves",
            () -> new LeavesBlock(0F, leavesProperties(SoundType.GRASS)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_bottlebrush_leaves")))) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos blockPos, RandomSource randomSource) {}
            });
    public static final DeferredBlock<Block> MAGENTA_BOTTLEBRUSH_LEAVES = registerBlock("magenta_bottlebrush_leaves",
            () -> new LeavesBlock(0F, leavesProperties(SoundType.GRASS)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_bottlebrush_leaves")))) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos blockPos, RandomSource randomSource) {}
            });
    public static final DeferredBlock<Block> PINK_BOTTLEBRUSH_LEAVES = registerBlock("pink_bottlebrush_leaves",
            () -> new LeavesBlock(0F, leavesProperties(SoundType.GRASS)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "pink_bottlebrush_leaves")))) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos blockPos, RandomSource randomSource) {}
            });
    public static final DeferredBlock<GrowingPlantBodyBlock> WHITE_BOTTLEBRUSH = registerBlock("white_bottlebrush",
            () -> new BottlebrushVinesBlock(bottlebrushVineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_bottlebrush"))),
                    Direction.DOWN, Block.column(14,0,16), false) {
                @Override
                protected GrowingPlantHeadBlock getHeadBlock() {
                    return ModBlocks.WHITE_BOTTLEBRUSH_END.get();
                }
            });
    public static final DeferredBlock<GrowingPlantBodyBlock> RED_BOTTLEBRUSH = registerBlock("red_bottlebrush",
            () -> new BottlebrushVinesBlock(bottlebrushVineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "red_bottlebrush"))),
                    Direction.DOWN, Block.column(14,0,16), false) {
                @Override
                protected GrowingPlantHeadBlock getHeadBlock() {
                    return ModBlocks.RED_BOTTLEBRUSH_END.get();
                }
            });
    public static final DeferredBlock<GrowingPlantBodyBlock> ORANGE_BOTTLEBRUSH = registerBlock("orange_bottlebrush",
            () -> new BottlebrushVinesBlock(bottlebrushVineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "orange_bottlebrush"))),
                    Direction.DOWN, Block.column(14,0,16), false) {
                @Override
                protected GrowingPlantHeadBlock getHeadBlock() {
                    return ModBlocks.ORANGE_BOTTLEBRUSH_END.get();
                }
            });
    public static final DeferredBlock<GrowingPlantBodyBlock> YELLOW_BOTTLEBRUSH = registerBlock("yellow_bottlebrush",
            () -> new BottlebrushVinesBlock(bottlebrushVineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_bottlebrush"))),
                    Direction.DOWN, Block.column(14,0,16), false) {
                @Override
                protected GrowingPlantHeadBlock getHeadBlock() {
                    return ModBlocks.YELLOW_BOTTLEBRUSH_END.get();
                }
            });
    public static final DeferredBlock<GrowingPlantBodyBlock> MAGENTA_BOTTLEBRUSH = registerBlock("magenta_bottlebrush",
            () -> new BottlebrushVinesBlock(bottlebrushVineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_bottlebrush"))),
                    Direction.DOWN, Block.column(14,0,16), false) {
                @Override
                protected GrowingPlantHeadBlock getHeadBlock() {
                    return ModBlocks.MAGENTA_BOTTLEBRUSH_END.get();
                }
            });
    public static final DeferredBlock<GrowingPlantBodyBlock> PINK_BOTTLEBRUSH = registerBlock("pink_bottlebrush",
            () -> new BottlebrushVinesBlock(bottlebrushVineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "pink_bottlebrush"))),
                    Direction.DOWN, Block.column(14,0,16), false) {
                @Override
                protected GrowingPlantHeadBlock getHeadBlock() {
                    return ModBlocks.PINK_BOTTLEBRUSH_END.get();
                }
            });
    public static final DeferredBlock<GrowingPlantHeadBlock> WHITE_BOTTLEBRUSH_END = registerBlock("white_bottlebrush_end",
            () -> new BottlebrushVinesEndBlock(bottlebrushVineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_bottlebrush_end"))),
                    Direction.DOWN, Block.column(14, 0, 16), false, 0.1){
                @Override
                protected GrowingPlantBodyBlock getBodyBlock() {
                    return ModBlocks.WHITE_BOTTLEBRUSH.get();
                }
            });
    public static final DeferredBlock<GrowingPlantHeadBlock> RED_BOTTLEBRUSH_END = registerBlock("red_bottlebrush_end",
            () -> new BottlebrushVinesEndBlock(bottlebrushVineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "red_bottlebrush_end"))),
                    Direction.DOWN, Block.column(14, 0, 16), false, 0.1){
                @Override
                protected GrowingPlantBodyBlock getBodyBlock() {
                    return ModBlocks.RED_BOTTLEBRUSH.get();
                }
            });
    public static final DeferredBlock<GrowingPlantHeadBlock> ORANGE_BOTTLEBRUSH_END = registerBlock("orange_bottlebrush_end",
            () -> new BottlebrushVinesEndBlock(bottlebrushVineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "orange_bottlebrush_end"))),
                    Direction.DOWN, Block.column(14, 0, 16), false, 0.1){
                @Override
                protected GrowingPlantBodyBlock getBodyBlock() {
                    return ModBlocks.ORANGE_BOTTLEBRUSH.get();
                }
            });
    public static final DeferredBlock<GrowingPlantHeadBlock> YELLOW_BOTTLEBRUSH_END = registerBlock("yellow_bottlebrush_end",
            () -> new BottlebrushVinesEndBlock(bottlebrushVineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_bottlebrush_end"))),
                    Direction.DOWN, Block.column(14, 0, 16), false, 0.1){
                @Override
                protected GrowingPlantBodyBlock getBodyBlock() {
                    return ModBlocks.YELLOW_BOTTLEBRUSH.get();
                }
            });
    public static final DeferredBlock<GrowingPlantHeadBlock> MAGENTA_BOTTLEBRUSH_END = registerBlock("magenta_bottlebrush_end",
            () -> new BottlebrushVinesEndBlock(bottlebrushVineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_bottlebrush_end"))),
                    Direction.DOWN, Block.column(14, 0, 16), false, 0.1){
                @Override
                protected GrowingPlantBodyBlock getBodyBlock() {
                    return ModBlocks.MAGENTA_BOTTLEBRUSH.get();
                }
            });
    public static final DeferredBlock<GrowingPlantHeadBlock> PINK_BOTTLEBRUSH_END = registerBlock("pink_bottlebrush_end",
            () -> new BottlebrushVinesEndBlock(bottlebrushVineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "pink_bottlebrush_end"))),
                    Direction.DOWN, Block.column(14, 0, 16), false, 0.1){
                @Override
                protected GrowingPlantBodyBlock getBodyBlock() {
                    return ModBlocks.PINK_BOTTLEBRUSH.get();
                }
            });

    //Bougainvillea
    public static final DeferredBlock<Block> BOUGAINVILLEA_LEAVES = registerBlock("bougainvillea_leaves",
            () -> new LeavesBlock(0F, leavesProperties(SoundType.AZALEA_LEAVES)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "bougainvillea_leaves")))) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}
            });
    public static final DeferredBlock<Block> WHITE_BOUGAINVILLEA = registerBlock("white_bougainvillea",
            () -> new LeavesBlock(0F, leavesProperties(SoundType.AZALEA_LEAVES)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_bougainvillea")))) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}
            });
    public static final DeferredBlock<Block> RED_BOUGAINVILLEA = registerBlock("red_bougainvillea",
            () -> new LeavesBlock(0F, leavesProperties(SoundType.AZALEA_LEAVES)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "red_bougainvillea")))) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}
            });
    public static final DeferredBlock<Block> ORANGE_BOUGAINVILLEA = registerBlock("orange_bougainvillea",
            () -> new LeavesBlock(0F, leavesProperties(SoundType.AZALEA_LEAVES)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "orange_bougainvillea")))) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}
            });
    public static final DeferredBlock<Block> YELLOW_BOUGAINVILLEA = registerBlock("yellow_bougainvillea",
            () -> new LeavesBlock(0F, leavesProperties(SoundType.AZALEA_LEAVES)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_bougainvillea")))) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}
            });
    public static final DeferredBlock<Block> PURPLE_BOUGAINVILLEA = registerBlock("purple_bougainvillea",
            () -> new LeavesBlock(0F, leavesProperties(SoundType.AZALEA_LEAVES)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "purple_bougainvillea")))) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}
            });
    public static final DeferredBlock<Block> MAGENTA_BOUGAINVILLEA = registerBlock("magenta_bougainvillea",
            () -> new LeavesBlock(0F, leavesProperties(SoundType.AZALEA_LEAVES)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_bougainvillea")))) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}
            });
    public static final DeferredBlock<Block> PINK_BOUGAINVILLEA = registerBlock("pink_bougainvillea",
            () -> new LeavesBlock(0F, leavesProperties(SoundType.AZALEA_LEAVES)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "pink_bougainvillea")))) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}
            });

    //Wattle
    public static final DeferredBlock<Block> WHITE_WATTLE = registerBlock("white_wattle",
            () -> new VineBlock(vineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_wattle")))));
    public static final DeferredBlock<Block> RED_WATTLE = registerBlock("red_wattle",
            () -> new VineBlock(vineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "red_wattle")))));
    public static final DeferredBlock<Block> ORANGE_WATTLE = registerBlock("orange_wattle",
            () -> new VineBlock(vineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "orange_wattle")))));
    public static final DeferredBlock<Block> YELLOW_WATTLE = registerBlock("yellow_wattle",
            () -> new VineBlock(vineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_wattle")))));
    public static final DeferredBlock<Block> WHITE_WATTLE_LEAVES = registerBlock("white_wattle_leaves",
            () -> new LeavesBlock(0F, leavesProperties(SoundType.GRASS)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_wattle_leaves")))) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}
            });
    public static final DeferredBlock<Block> RED_WATTLE_LEAVES = registerBlock("red_wattle_leaves",
            () -> new LeavesBlock(0F, leavesProperties(SoundType.GRASS)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "red_wattle_leaves")))) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}
            });
    public static final DeferredBlock<Block> ORANGE_WATTLE_LEAVES = registerBlock("orange_wattle_leaves",
            () -> new LeavesBlock(0F, leavesProperties(SoundType.GRASS)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "orange_wattle_leaves")))) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}
            });
    public static final DeferredBlock<Block> YELLOW_WATTLE_LEAVES = registerBlock("yellow_wattle_leaves",
            () -> new LeavesBlock(0F, leavesProperties(SoundType.GRASS)
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_wattle_leaves")))) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}
            });

    //Clematis
    public static final DeferredBlock<Block> CLEMATIS_VINE = registerBlock("clematis_vine",
            () -> new VineBlock(vineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "clematis_vine")))));
    public static final DeferredBlock<Block> WHITE_CLEMATIS = registerBlock("white_clematis",
            () -> new VineBlock(vineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_clematis")))));
    public static final DeferredBlock<Block> RED_CLEMATIS = registerBlock("red_clematis",
            () -> new VineBlock(vineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "red_clematis")))));
    public static final DeferredBlock<Block> YELLOW_CLEMATIS = registerBlock("yellow_clematis",
            () -> new VineBlock(vineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_clematis")))));
    public static final DeferredBlock<Block> BLUE_CLEMATIS = registerBlock("blue_clematis",
            () -> new VineBlock(vineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "blue_clematis")))));
    public static final DeferredBlock<Block> PURPLE_CLEMATIS = registerBlock("purple_clematis",
            () -> new VineBlock(vineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "purple_clematis")))));
    public static final DeferredBlock<Block> MAGENTA_CLEMATIS = registerBlock("magenta_clematis",
            () -> new VineBlock(vineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_clematis")))));
    public static final DeferredBlock<Block> PINK_CLEMATIS = registerBlock("pink_clematis",
            () -> new VineBlock(vineProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "pink_clematis")))));

    //Rose Bush
    public static final DeferredBlock<TallFlowerBlock> BLACK_ROSE_BUSH = registerBlock("black_rose_bush",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "black_rose_bush")))));
    public static final DeferredBlock<TallFlowerBlock> LIGHT_GRAY_ROSE_BUSH = registerBlock("light_gray_rose_bush",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "light_gray_rose_bush")))));
    public static final DeferredBlock<TallFlowerBlock> WHITE_ROSE_BUSH = registerBlock("white_rose_bush",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_rose_bush")))));
    public static final DeferredBlock<TallFlowerBlock> ORANGE_ROSE_BUSH = registerBlock("orange_rose_bush",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "orange_rose_bush")))));
    public static final DeferredBlock<TallFlowerBlock> YELLOW_ROSE_BUSH = registerBlock("yellow_rose_bush",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_rose_bush")))));
    public static final DeferredBlock<TallFlowerBlock> LIME_ROSE_BUSH = registerBlock("lime_rose_bush",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "lime_rose_bush")))));
    public static final DeferredBlock<TallFlowerBlock> BLUE_ROSE_BUSH = registerBlock("blue_rose_bush",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "blue_rose_bush")))));
    public static final DeferredBlock<TallFlowerBlock> PURPLE_ROSE_BUSH = registerBlock("purple_rose_bush",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "purple_rose_bush")))));
    public static final DeferredBlock<TallFlowerBlock> MAGENTA_ROSE_BUSH = registerBlock("magenta_rose_bush",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_rose_bush")))));
    public static final DeferredBlock<TallFlowerBlock> PINK_ROSE_BUSH = registerBlock("pink_rose_bush",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "pink_rose_bush")))));

    //Lilac
    public static final DeferredBlock<TallFlowerBlock> WHITE_LILAC = registerBlock("white_lilac",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_lilac")))));
    public static final DeferredBlock<TallFlowerBlock> PURPLE_LILAC = registerBlock("purple_lilac",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "purple_lilac")))));
    public static final DeferredBlock<TallFlowerBlock> PINK_LILAC = registerBlock("pink_lilac",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "pink_lilac")))));

    //Peony
    public static final DeferredBlock<TallFlowerBlock> WHITE_PEONY = registerBlock("white_peony",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_peony")))));
    public static final DeferredBlock<TallFlowerBlock> MAGENTA_PEONY = registerBlock("magenta_peony",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_peony")))));

    //Hollyhock
    public static final DeferredBlock<TriplePlantBlock> HOLLYHOCK_BUSH = registerBlock("hollyhock_bush",
            () -> new TriplePlantBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "hollyhock_bush")))));
    public static final DeferredBlock<TripleFlowerBlock> WHITE_HOLLYHOCK = registerBlock("white_hollyhock",
            () -> new TripleFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_hollyhock")))));

    //Hydrangea
    public static final DeferredBlock<LargeFlowerBlock> WHITE_HYDRANGEA = registerBlock("white_hydrangea",
            () -> new LargeFlowerBlock(MobEffects.NAUSEA, 15.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_hydrangea")))));
    public static final DeferredBlock<LargeFlowerBlock> RED_HYDRANGEA = registerBlock("red_hydrangea",
            () -> new LargeFlowerBlock(MobEffects.NAUSEA, 15.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "red_hydrangea")))));
    public static final DeferredBlock<LargeFlowerBlock> YELLOW_HYDRANGEA = registerBlock("yellow_hydrangea",
            () -> new LargeFlowerBlock(MobEffects.NAUSEA, 15.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_hydrangea")))));
    public static final DeferredBlock<LargeFlowerBlock> LIME_HYDRANGEA = registerBlock("lime_hydrangea",
            () -> new LargeFlowerBlock(MobEffects.NAUSEA, 15.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "lime_hydrangea")))));
    public static final DeferredBlock<LargeFlowerBlock> LIGHT_BLUE_HYDRANGEA = registerBlock("light_blue_hydrangea",
            () -> new LargeFlowerBlock(MobEffects.NAUSEA, 15.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "light_blue_hydrangea")))));
    public static final DeferredBlock<LargeFlowerBlock> BLUE_HYDRANGEA = registerBlock("blue_hydrangea",
            () -> new LargeFlowerBlock(MobEffects.NAUSEA, 15.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "blue_hydrangea")))));
    public static final DeferredBlock<LargeFlowerBlock> PURPLE_HYDRANGEA = registerBlock("purple_hydrangea",
            () -> new LargeFlowerBlock(MobEffects.NAUSEA, 15.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "purple_hydrangea")))));
    public static final DeferredBlock<LargeFlowerBlock> MAGENTA_HYDRANGEA = registerBlock("magenta_hydrangea",
            () -> new LargeFlowerBlock(MobEffects.NAUSEA, 15.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_hydrangea")))));
    public static final DeferredBlock<LargeFlowerBlock> PINK_HYDRANGEA = registerBlock("pink_hydrangea",
            () -> new LargeFlowerBlock(MobEffects.NAUSEA, 15.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "pink_hydrangea")))));

    //Agapanthus
    public static final DeferredBlock<DoublePlantBlock> DEAD_AGAPANTHUS = registerBlock("dead_agapanthus",
            () -> new DoublePlantBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "dead_agapanthus")))));
    public static final DeferredBlock<TallFlowerBlock> GRAY_AGAPANTHUS = registerBlock("gray_agapanthus",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "gray_agapanthus")))));
    public static final DeferredBlock<TallFlowerBlock> WHITE_AGAPANTHUS = registerBlock("white_agapanthus",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_agapanthus")))));
    public static final DeferredBlock<TallFlowerBlock> ORANGE_AGAPANTHUS = registerBlock("orange_agapanthus",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "orange_agapanthus")))));
    public static final DeferredBlock<TallFlowerBlock> BLUE_AGAPANTHUS = registerBlock("blue_agapanthus",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "blue_agapanthus")))));
    public static final DeferredBlock<TallFlowerBlock> PURPLE_AGAPANTHUS = registerBlock("purple_agapanthus",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "purple_agapanthus")))));
    public static final DeferredBlock<TallFlowerBlock> MAGENTA_AGAPANTHUS = registerBlock("magenta_agapanthus",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_agapanthus")))));
    public static final DeferredBlock<TallFlowerBlock> PINK_AGAPANTHUS = registerBlock("pink_agapanthus",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "pink_agapanthus")))));

    //Poppy
    public static final DeferredBlock<ModFlowerBlock> WHITE_POPPY = registerBlock("white_poppy",
            () -> new ModFlowerBlock(MobEffects.NIGHT_VISION, 5.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_poppy")))));
    public static final DeferredBlock<ModFlowerBlock> ORANGE_POPPY = registerBlock("orange_poppy",
            () -> new ModFlowerBlock(MobEffects.NIGHT_VISION, 5.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "orange_poppy")))));
    public static final DeferredBlock<ModFlowerBlock> YELLOW_POPPY = registerBlock("yellow_poppy",
            () -> new ModFlowerBlock(MobEffects.NIGHT_VISION, 5.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_poppy")))));

    //Pansy
    public static final DeferredBlock<FlowerBedBlock> WHITE_PANSY = registerBlock("white_pansy",
            () -> new FlowerBedBlock(flowerBedProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_pansy")))));

    public static final DeferredBlock<FlowerBedBlock> BLACK_PANSY = registerBlock("black_pansy",
            () -> new FlowerBedBlock(flowerBedProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "black_pansy")))));

    public static final DeferredBlock<FlowerBedBlock> BROWN_PANSY = registerBlock("brown_pansy",
            () -> new FlowerBedBlock(flowerBedProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "brown_pansy")))));

    public static final DeferredBlock<FlowerBedBlock> RED_PANSY = registerBlock("red_pansy",
            () -> new FlowerBedBlock(flowerBedProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "red_pansy")))));

    public static final DeferredBlock<FlowerBedBlock> ORANGE_PANSY = registerBlock("orange_pansy",
            () -> new FlowerBedBlock(flowerBedProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "orange_pansy")))));

    public static final DeferredBlock<FlowerBedBlock> YELLOW_PANSY = registerBlock("yellow_pansy",
            () -> new FlowerBedBlock(flowerBedProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_pansy")))));

    public static final DeferredBlock<FlowerBedBlock> BLUE_PANSY = registerBlock("blue_pansy",
            () -> new FlowerBedBlock(flowerBedProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "blue_pansy")))));

    public static final DeferredBlock<FlowerBedBlock> PURPLE_PANSY = registerBlock("purple_pansy",
            () -> new FlowerBedBlock(flowerBedProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "purple_pansy")))));

    public static final DeferredBlock<FlowerBedBlock> MAGENTA_PANSY = registerBlock("magenta_pansy",
            () -> new FlowerBedBlock(flowerBedProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_pansy")))));

    public static final DeferredBlock<FlowerBedBlock> PINK_PANSY = registerBlock("pink_pansy",
            () -> new FlowerBedBlock(flowerBedProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "pink_pansy")))));

    //Tulip
    public static final DeferredBlock<ModFlowerBlock> BLACK_TULIP = registerBlock("black_tulip",
            () -> new ModFlowerBlock(MobEffects.WEAKNESS, 7.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "black_tulip")))));
    public static final DeferredBlock<ModFlowerBlock> YELLOW_TULIP = registerBlock("yellow_tulip",
            () -> new ModFlowerBlock(MobEffects.WEAKNESS, 7.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_tulip")))));
    public static final DeferredBlock<ModFlowerBlock> PURPLE_TULIP = registerBlock("purple_tulip",
            () -> new ModFlowerBlock(MobEffects.WEAKNESS, 7.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "purple_tulip")))));
    public static final DeferredBlock<ModFlowerBlock> MAGENTA_TULIP = registerBlock("magenta_tulip",
            () -> new ModFlowerBlock(MobEffects.WEAKNESS, 7.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_tulip")))));

    //Orchid
    public static final DeferredBlock<ModFlowerBlock> WHITE_ORCHID = registerBlock("white_orchid",
            () -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_orchid")))));
    public static final DeferredBlock<ModFlowerBlock> ORANGE_ORCHID = registerBlock("orange_orchid",
            () -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "orange_orchid")))));
    public static final DeferredBlock<ModFlowerBlock> YELLOW_ORCHID = registerBlock("yellow_orchid",
            () -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_orchid")))));
    public static final DeferredBlock<ModFlowerBlock> CYAN_ORCHID = registerBlock("cyan_orchid",
            () -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "cyan_orchid")))));
    public static final DeferredBlock<ModFlowerBlock> PURPLE_ORCHID = registerBlock("purple_orchid",
            () -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "purple_orchid")))));
    public static final DeferredBlock<ModFlowerBlock> MAGENTA_ORCHID = registerBlock("magenta_orchid",
            () -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_orchid")))));
    public static final DeferredBlock<ModFlowerBlock> PINK_ORCHID = registerBlock("pink_orchid",
            () -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "pink_orchid")))));

    //Azure Bluet
    public static final DeferredBlock<ModFlowerBlock> LIGHT_BLUE_AZURE_BLUET = registerBlock("light_blue_azure_bluet",
            () -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "light_blue_azure_bluet")))));

    //Daisy
    public static final DeferredBlock<ModFlowerBlock> CYAN_OXEYE_DAISY = registerBlock("cyan_oxeye_daisy",
            () -> new ModFlowerBlock(MobEffects.REGENERATION, 7.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "cyan_oxeye_daisy")))));

    //Chrysanthemum
    public static final DeferredBlock<ModFlowerBlock> WHITE_CHRYSANTHEMUM = registerBlock("white_chrysanthemum",
            () -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_chrysanthemum")))));
    public static final DeferredBlock<ModFlowerBlock> BLACK_CHRYSANTHEMUM = registerBlock("black_chrysanthemum",
            () -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "black_chrysanthemum")))));
    public static final DeferredBlock<ModFlowerBlock> RED_CHRYSANTHEMUM = registerBlock("red_chrysanthemum",
            () -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "red_chrysanthemum")))));
    public static final DeferredBlock<ModFlowerBlock> ORANGE_CHRYSANTHEMUM = registerBlock("orange_chrysanthemum",
            () -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "orange_chrysanthemum")))));
    public static final DeferredBlock<ModFlowerBlock> YELLOW_CHRYSANTHEMUM = registerBlock("yellow_chrysanthemum",
            () -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_chrysanthemum")))));
    public static final DeferredBlock<ModFlowerBlock> LIME_CHRYSANTHEMUM = registerBlock("lime_chrysanthemum",
            () -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "lime_chrysanthemum")))));
    public static final DeferredBlock<ModFlowerBlock> GREEN_CHRYSANTHEMUM = registerBlock("green_chrysanthemum",
            () -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "green_chrysanthemum")))));
    public static final DeferredBlock<ModFlowerBlock> LIGHT_BLUE_CHRYSANTHEMUM = registerBlock("light_blue_chrysanthemum",
            () -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "light_blue_chrysanthemum")))));
    public static final DeferredBlock<ModFlowerBlock> BLUE_CHRYSANTHEMUM = registerBlock("blue_chrysanthemum",
            () -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "blue_chrysanthemum")))));
    public static final DeferredBlock<ModFlowerBlock> PURPLE_CHRYSANTHEMUM = registerBlock("purple_chrysanthemum",
            () -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "purple_chrysanthemum")))));
    public static final DeferredBlock<ModFlowerBlock> MAGENTA_CHRYSANTHEMUM = registerBlock("magenta_chrysanthemum",
            () -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_chrysanthemum")))));
    public static final DeferredBlock<ModFlowerBlock> PINK_CHRYSANTHEMUM = registerBlock("pink_chrysanthemum",
            () -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "pink_chrysanthemum")))));

    //Hellebore
    public static final DeferredBlock<ModFlowerBlock> WHITE_HELLEBORE = registerBlock("white_hellebore",
            () -> new ModFlowerBlock(MobEffects.INSTANT_DAMAGE, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_hellebore")))));
    public static final DeferredBlock<ModFlowerBlock> BLACK_HELLEBORE = registerBlock("black_hellebore",
            () -> new ModFlowerBlock(MobEffects.INSTANT_DAMAGE, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "black_hellebore")))));
    public static final DeferredBlock<ModFlowerBlock> RED_HELLEBORE = registerBlock("red_hellebore",
            () -> new ModFlowerBlock(MobEffects.INSTANT_DAMAGE, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "red_hellebore")))));
    public static final DeferredBlock<ModFlowerBlock> YELLOW_HELLEBORE = registerBlock("yellow_hellebore",
            () -> new ModFlowerBlock(MobEffects.INSTANT_DAMAGE, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_hellebore")))));
    public static final DeferredBlock<ModFlowerBlock> LIME_HELLEBORE = registerBlock("lime_hellebore",
            () -> new ModFlowerBlock(MobEffects.INSTANT_DAMAGE, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "lime_hellebore")))));
    public static final DeferredBlock<ModFlowerBlock> PURPLE_HELLEBORE = registerBlock("purple_hellebore",
            () -> new ModFlowerBlock(MobEffects.INSTANT_DAMAGE, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "purple_hellebore")))));
    public static final DeferredBlock<ModFlowerBlock> MAGENTA_HELLEBORE = registerBlock("magenta_hellebore",
            () -> new ModFlowerBlock(MobEffects.INSTANT_DAMAGE, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_hellebore")))));
    public static final DeferredBlock<ModFlowerBlock> PINK_HELLEBORE = registerBlock("pink_hellebore",
            () -> new ModFlowerBlock(MobEffects.INSTANT_DAMAGE, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "pink_hellebore")))));

    //Grevillea
    public static final DeferredBlock<ModFlowerBlock> WHITE_GREVILLEA = registerBlock("white_grevillea",
            () -> new ModFlowerBlock(MobEffects.POISON, 12.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_grevillea")))));
    public static final DeferredBlock<ModFlowerBlock> LIGHT_GRAY_GREVILLEA = registerBlock("light_gray_grevillea",
            () -> new ModFlowerBlock(MobEffects.POISON, 12.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "light_gray_grevillea")))));
    public static final DeferredBlock<ModFlowerBlock> GRAY_GREVILLEA = registerBlock("gray_grevillea",
            () -> new ModFlowerBlock(MobEffects.POISON, 12.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "gray_grevillea")))));
    public static final DeferredBlock<ModFlowerBlock> BLACK_GREVILLEA = registerBlock("black_grevillea",
            () -> new ModFlowerBlock(MobEffects.POISON, 12.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "black_grevillea")))));
    public static final DeferredBlock<ModFlowerBlock> RED_GREVILLEA = registerBlock("red_grevillea",
            () -> new ModFlowerBlock(MobEffects.POISON, 12.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "red_grevillea")))));
    public static final DeferredBlock<ModFlowerBlock> ORANGE_GREVILLEA = registerBlock("orange_grevillea",
            () -> new ModFlowerBlock(MobEffects.POISON, 12.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "orange_grevillea")))));
    public static final DeferredBlock<ModFlowerBlock> YELLOW_GREVILLEA = registerBlock("yellow_grevillea",
            () -> new ModFlowerBlock(MobEffects.POISON, 12.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_grevillea")))));
    public static final DeferredBlock<ModFlowerBlock> MAGENTA_GREVILLEA = registerBlock("magenta_grevillea",
            () -> new ModFlowerBlock(MobEffects.POISON, 12.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_grevillea")))));

    //Waratah
    public static final DeferredBlock<ModFlowerBlock> WHITE_WARATAH = registerBlock("white_waratah",
            () -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_waratah")))));
    public static final DeferredBlock<ModFlowerBlock> RED_WARATAH = registerBlock("red_waratah",
            () -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "red_waratah")))));
    public static final DeferredBlock<ModFlowerBlock> YELLOW_WARATAH = registerBlock("yellow_waratah",
            () -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_waratah")))));
    public static final DeferredBlock<ModFlowerBlock> MAGENTA_WARATAH = registerBlock("magenta_waratah",
            () -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_waratah")))));
    public static final DeferredBlock<ModFlowerBlock> PINK_WARATAH = registerBlock("pink_waratah",
            () -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "pink_waratah")))));

    //Rosemary
    public static final DeferredBlock<LargeFlowerBlock> ROSEMARY_BUSH = registerBlock("rosemary_bush",
            () -> new LargeFlowerBlock(MobEffects.ABSORPTION, 20.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "rosemary_bush")))));
    public static final DeferredBlock<LargeFlowerBlock> WHITE_ROSEMARY = registerBlock("white_rosemary",
            () -> new LargeFlowerBlock(MobEffects.ABSORPTION, 20.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_rosemary")))));
    public static final DeferredBlock<LargeFlowerBlock> PURPLE_ROSEMARY = registerBlock("purple_rosemary",
            () -> new LargeFlowerBlock(MobEffects.ABSORPTION, 20.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "purple_rosemary")))));
    public static final DeferredBlock<LargeFlowerBlock> PINK_ROSEMARY = registerBlock("pink_rosemary",
            () -> new LargeFlowerBlock(MobEffects.ABSORPTION, 20.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "pink_rosemary")))));

    //Foxglove
    public static final DeferredBlock<TallFlowerBlock> FOXGLOVE_BUSH = registerBlock("foxglove_bush",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "foxglove_bush")))));
    public static final DeferredBlock<TallFlowerBlock> WHITE_FOXGLOVE = registerBlock("white_foxglove",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_foxglove")))));
    public static final DeferredBlock<TallFlowerBlock> YELLOW_FOXGLOVE = registerBlock("yellow_foxglove",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_foxglove")))));
    public static final DeferredBlock<TallFlowerBlock> BLUE_FOXGLOVE = registerBlock("blue_foxglove",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "blue_foxglove")))));
    public static final DeferredBlock<TallFlowerBlock> PURPLE_FOXGLOVE = registerBlock("purple_foxglove",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "purple_foxglove")))));
    public static final DeferredBlock<TallFlowerBlock> MAGENTA_FOXGLOVE = registerBlock("magenta_foxglove",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_foxglove")))));
    public static final DeferredBlock<TallFlowerBlock> PINK_FOXGLOVE = registerBlock("pink_foxglove",
            () -> new TallFlowerBlock(tallFlowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "pink_foxglove")))));

    //Bird of Paradise
    public static final DeferredBlock<LargeFlowerBlock> WHITE_BIRD_OF_PARADISE = registerBlock("white_bird_of_paradise",
            () -> new LargeFlowerBlock(MobEffects.HUNGER, 30.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_bird_of_paradise")))));
    public static final DeferredBlock<LargeFlowerBlock> ORANGE_BIRD_OF_PARADISE = registerBlock("orange_bird_of_paradise",
            () -> new LargeFlowerBlock(MobEffects.HUNGER, 30.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "orange_bird_of_paradise")))));
    public static final DeferredBlock<LargeFlowerBlock> YELLOW_BIRD_OF_PARADISE = registerBlock("yellow_bird_of_paradise",
            () -> new LargeFlowerBlock(MobEffects.HUNGER, 30.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_bird_of_paradise")))));
    public static final DeferredBlock<LargeFlowerBlock> MAGENTA_BIRD_OF_PARADISE = registerBlock("magenta_bird_of_paradise",
            () -> new LargeFlowerBlock(MobEffects.HUNGER, 30.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_bird_of_paradise")))));

    //Arctotis
    public static final DeferredBlock<ModFlowerBlock> WHITE_ARCTOTIS = registerBlock("white_arctotis",
            () -> new ModFlowerBlock(MobEffects.NIGHT_VISION, 7.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_arctotis")))));
    public static final DeferredBlock<ModFlowerBlock> RED_ARCTOTIS = registerBlock("red_arctotis",
            () -> new ModFlowerBlock(MobEffects.NIGHT_VISION, 7.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "red_arctotis")))));
    public static final DeferredBlock<ModFlowerBlock> ORANGE_ARCTOTIS = registerBlock("orange_arctotis",
            () -> new ModFlowerBlock(MobEffects.NIGHT_VISION, 7.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "orange_arctotis")))));
    public static final DeferredBlock<ModFlowerBlock> YELLOW_ARCTOTIS = registerBlock("yellow_arctotis",
            () -> new ModFlowerBlock(MobEffects.NIGHT_VISION, 7.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "yellow_arctotis")))));
    public static final DeferredBlock<ModFlowerBlock> MAGENTA_ARCTOTIS = registerBlock("magenta_arctotis",
            () -> new ModFlowerBlock(MobEffects.NIGHT_VISION, 7.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_arctotis")))));
    public static final DeferredBlock<ModFlowerBlock> PINK_ARCTOTIS = registerBlock("pink_arctotis",
            () -> new ModFlowerBlock(MobEffects.NIGHT_VISION, 7.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "pink_arctotis")))));

    //Babiana
    public static final DeferredBlock<ModFlowerBlock> WHITE_BABIANA = registerBlock("white_babiana",
            () -> new ModFlowerBlock(MobEffects.REGENERATION, 9.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "white_babiana")))));
    public static final DeferredBlock<ModFlowerBlock> PURPLE_BABIANA = registerBlock("purple_babiana",
            () -> new ModFlowerBlock(MobEffects.REGENERATION, 9.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "purple_babiana")))));
    public static final DeferredBlock<ModFlowerBlock> MAGENTA_BABIANA = registerBlock("magenta_babiana",
            () -> new ModFlowerBlock(MobEffects.REGENERATION, 9.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "magenta_babiana")))));
    public static final DeferredBlock<ModFlowerBlock> PINK_BABIANA = registerBlock("pink_babiana",
            () -> new ModFlowerBlock(MobEffects.REGENERATION, 9.0F, flowerProperties()
                    .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "pink_babiana")))));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, name)))));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
