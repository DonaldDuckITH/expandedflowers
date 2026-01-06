package com.donaldduckith.expandedflowers.registry;

import com.donaldduckith.expandedflowers.ExpandedFlowers;
import com.donaldduckith.expandedflowers.block.*;
import com.donaldduckith.expandedflowers.worldgen.ModTreeGrowers;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

import static net.minecraft.world.level.block.state.BlockBehaviour.OffsetType;
import static net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class ModBlocks {
    private static boolean never(BlockState state, BlockGetter blockGetter, BlockPos pos) {
        return false;
    }
    private static Properties leavesProperties(SoundType sound) {
        return Properties.of()
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
    private static Properties vineProperties() {
        return Properties.of()
                .mapColor(MapColor.PLANT)
                .randomTicks()
                .noCollission()
                .instabreak()
                .sound(SoundType.CAVE_VINES)
                .pushReaction(PushReaction.DESTROY);
    }
    private static Properties bottlebrushVineProperties() {
        return Properties.of()
                .mapColor(MapColor.PLANT)
                .randomTicks()
                .noCollission()
                .instabreak()
                .sound(SoundType.CAVE_VINES)
                .pushReaction(PushReaction.DESTROY);
    }
    private static Properties tallFlowerProperties() {
        return Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(OffsetType.XZ)
                .ignitedByLava()
                .pushReaction(PushReaction.DESTROY);
    }
    private static Properties flowerProperties() {
        return Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS)
                .offsetType(OffsetType.XZ)
                .ignitedByLava()
                .pushReaction(PushReaction.DESTROY);
    }
    private static Properties flowerBedProperties() {
        return Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .sound(SoundType.PINK_PETALS)
                .pushReaction(PushReaction.DESTROY);
    }
    private static Properties saplingProperties(SoundType sound) {
        return Properties.of()
                .mapColor(MapColor.PLANT)
                .noCollission()
                .instabreak()
                .randomTicks()
                .sound(sound)
                .noOcclusion()
                .pushReaction(PushReaction.DESTROY);
    }
    private static Properties saplingBushProperties(SoundType sound) {
        return Properties.of()
                .mapColor(MapColor.PLANT)
                .instabreak()
                .randomTicks()
                .sound(sound)
                .noOcclusion()
                .pushReaction(PushReaction.DESTROY);
    }

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ExpandedFlowers.MODID);

    //Bottlebrush
    public static final DeferredBlock<Block> BOTTLEBRUSH_LEAVES = registerBlock("bottlebrush_leaves",
            (properties) -> new LeavesBlock(0F, properties){
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;};
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}}, leavesProperties(SoundType.GRASS));
    public static final DeferredBlock<Block> WHITE_BOTTLEBRUSH_LEAVES = registerBlock("white_bottlebrush_leaves",
            (properties) -> new LeavesBlock(0F, properties){
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;};
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}}, leavesProperties(SoundType.GRASS));
    public static final DeferredBlock<Block> RED_BOTTLEBRUSH_LEAVES = registerBlock("red_bottlebrush_leaves",
            (properties) -> new LeavesBlock(0F, properties){
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;};
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}}, leavesProperties(SoundType.GRASS));
    public static final DeferredBlock<Block> ORANGE_BOTTLEBRUSH_LEAVES = registerBlock("orange_bottlebrush_leaves",
            (properties) -> new LeavesBlock(0F, properties){
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;};
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}}, leavesProperties(SoundType.GRASS));
    public static final DeferredBlock<Block> YELLOW_BOTTLEBRUSH_LEAVES = registerBlock("yellow_bottlebrush_leaves",
            (properties) -> new LeavesBlock(0F, properties){
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;};
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}}, leavesProperties(SoundType.GRASS));
    public static final DeferredBlock<Block> MAGENTA_BOTTLEBRUSH_LEAVES = registerBlock("magenta_bottlebrush_leaves",
            (properties) -> new LeavesBlock(0F, properties){
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;};
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}}, leavesProperties(SoundType.GRASS));
    public static final DeferredBlock<Block> PINK_BOTTLEBRUSH_LEAVES = registerBlock("pink_bottlebrush_leaves",
            (properties) -> new LeavesBlock(0F, properties){
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;};
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}}, leavesProperties(SoundType.GRASS));
    public static final DeferredBlock<GrowingPlantBodyBlock> WHITE_BOTTLEBRUSH = registerBlock("white_bottlebrush",
            (properties) -> new BottlebrushVinesBlock(properties, Direction.DOWN, Block.column(14,0,16), false) {
                @Override
                protected GrowingPlantHeadBlock getHeadBlock() {return ModBlocks.WHITE_BOTTLEBRUSH_END.get();}}, bottlebrushVineProperties());
    public static final DeferredBlock<GrowingPlantBodyBlock> RED_BOTTLEBRUSH = registerBlock("red_bottlebrush",
            (properties) -> new BottlebrushVinesBlock(properties, Direction.DOWN, Block.column(14,0,16), false) {
                @Override
                protected GrowingPlantHeadBlock getHeadBlock() {return ModBlocks.RED_BOTTLEBRUSH_END.get();}}, bottlebrushVineProperties());
    public static final DeferredBlock<GrowingPlantBodyBlock> ORANGE_BOTTLEBRUSH = registerBlock("orange_bottlebrush",
            (properties) -> new BottlebrushVinesBlock(properties, Direction.DOWN, Block.column(14,0,16), false) {
                @Override
                protected GrowingPlantHeadBlock getHeadBlock() {return ModBlocks.ORANGE_BOTTLEBRUSH_END.get();}}, bottlebrushVineProperties());
    public static final DeferredBlock<GrowingPlantBodyBlock> YELLOW_BOTTLEBRUSH = registerBlock("yellow_bottlebrush",
            (properties) -> new BottlebrushVinesBlock(properties, Direction.DOWN, Block.column(14,0,16), false) {
                @Override
                protected GrowingPlantHeadBlock getHeadBlock() {return ModBlocks.YELLOW_BOTTLEBRUSH_END.get();}}, bottlebrushVineProperties());
    public static final DeferredBlock<GrowingPlantBodyBlock> MAGENTA_BOTTLEBRUSH = registerBlock("magenta_bottlebrush",
            (properties) -> new BottlebrushVinesBlock(properties, Direction.DOWN, Block.column(14,0,16), false) {
                @Override
                protected GrowingPlantHeadBlock getHeadBlock() {return ModBlocks.MAGENTA_BOTTLEBRUSH_END.get();}}, bottlebrushVineProperties());
    public static final DeferredBlock<GrowingPlantBodyBlock> PINK_BOTTLEBRUSH = registerBlock("pink_bottlebrush",
            (properties) -> new BottlebrushVinesBlock(properties, Direction.DOWN, Block.column(14,0,16), false) {
                @Override
                protected GrowingPlantHeadBlock getHeadBlock() {return ModBlocks.PINK_BOTTLEBRUSH_END.get();}}, bottlebrushVineProperties());
    public static final DeferredBlock<GrowingPlantHeadBlock> WHITE_BOTTLEBRUSH_END = registerBlock("white_bottlebrush_end",
            (properties) -> new BottlebrushVinesEndBlock(properties, Direction.DOWN, Block.column(14, 0, 16), false, 0.1){
                @Override
                protected GrowingPlantBodyBlock getBodyBlock() {return ModBlocks.WHITE_BOTTLEBRUSH.get();}}, bottlebrushVineProperties());
    public static final DeferredBlock<GrowingPlantHeadBlock> RED_BOTTLEBRUSH_END = registerBlock("red_bottlebrush_end",
            (properties) -> new BottlebrushVinesEndBlock(properties, Direction.DOWN, Block.column(14, 0, 16), false, 0.1){
                @Override
                protected GrowingPlantBodyBlock getBodyBlock() {return ModBlocks.RED_BOTTLEBRUSH.get();}}, bottlebrushVineProperties());
    public static final DeferredBlock<GrowingPlantHeadBlock> ORANGE_BOTTLEBRUSH_END = registerBlock("orange_bottlebrush_end",
            (properties) -> new BottlebrushVinesEndBlock(properties, Direction.DOWN, Block.column(14, 0, 16), false, 0.1){
                @Override
                protected GrowingPlantBodyBlock getBodyBlock() {return ModBlocks.ORANGE_BOTTLEBRUSH.get();}}, bottlebrushVineProperties());
    public static final DeferredBlock<GrowingPlantHeadBlock> YELLOW_BOTTLEBRUSH_END = registerBlock("yellow_bottlebrush_end",
            (properties) -> new BottlebrushVinesEndBlock(properties, Direction.DOWN, Block.column(14, 0, 16), false, 0.1){
                @Override
                protected GrowingPlantBodyBlock getBodyBlock() {return ModBlocks.YELLOW_BOTTLEBRUSH.get();}}, bottlebrushVineProperties());
    public static final DeferredBlock<GrowingPlantHeadBlock> MAGENTA_BOTTLEBRUSH_END = registerBlock("magenta_bottlebrush_end",
            (properties) -> new BottlebrushVinesEndBlock(properties, Direction.DOWN, Block.column(14, 0, 16), false, 0.1){
                @Override
                protected GrowingPlantBodyBlock getBodyBlock() {return ModBlocks.MAGENTA_BOTTLEBRUSH.get();}}, bottlebrushVineProperties());
    public static final DeferredBlock<GrowingPlantHeadBlock> PINK_BOTTLEBRUSH_END = registerBlock("pink_bottlebrush_end",
            (properties) -> new BottlebrushVinesEndBlock(properties, Direction.DOWN, Block.column(14, 0, 16), false, 0.1){
                @Override
                protected GrowingPlantBodyBlock getBodyBlock() {return ModBlocks.PINK_BOTTLEBRUSH.get();}}, bottlebrushVineProperties());

    public static final DeferredBlock<ModSaplingBlock> WHITE_BOTTLEBRUSH_SAPLING = registerBlock("white_bottlebrush_sapling",
            (properties) -> new ModSaplingBlock(ModTreeGrowers.WHITE_BOTTLEBRUSH_TREE, properties), saplingBushProperties(SoundType.GRASS));
    public static final DeferredBlock<ModSaplingBlock> RED_BOTTLEBRUSH_SAPLING = registerBlock("red_bottlebrush_sapling",
            (properties) -> new ModSaplingBlock(ModTreeGrowers.RED_BOTTLEBRUSH_TREE, properties), saplingBushProperties(SoundType.GRASS));
    public static final DeferredBlock<ModSaplingBlock> ORANGE_BOTTLEBRUSH_SAPLING = registerBlock("orange_bottlebrush_sapling",
            (properties) -> new ModSaplingBlock(ModTreeGrowers.ORANGE_BOTTLEBRUSH_TREE, properties), saplingBushProperties(SoundType.GRASS));
    public static final DeferredBlock<ModSaplingBlock> YELLOW_BOTTLEBRUSH_SAPLING = registerBlock("yellow_bottlebrush_sapling",
            (properties) -> new ModSaplingBlock(ModTreeGrowers.YELLOW_BOTTLEBRUSH_TREE, properties), saplingBushProperties(SoundType.GRASS));
    public static final DeferredBlock<ModSaplingBlock> MAGENTA_BOTTLEBRUSH_SAPLING = registerBlock("magenta_bottlebrush_sapling",
            (properties) -> new ModSaplingBlock(ModTreeGrowers.MAGENTA_BOTTLEBRUSH_TREE, properties), saplingBushProperties(SoundType.GRASS));
    public static final DeferredBlock<ModSaplingBlock> PINK_BOTTLEBRUSH_SAPLING = registerBlock("pink_bottlebrush_sapling",
            (properties) -> new ModSaplingBlock(ModTreeGrowers.PINK_BOTTLEBRUSH_TREE, properties), saplingBushProperties(SoundType.GRASS));

    //Bougainvillea
    public static final DeferredBlock<Block> BOUGAINVILLEA_LEAVES = registerBlock("bougainvillea_leaves",
            (properties) -> new LeavesBlock(0F, properties){
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;};
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}}, leavesProperties(SoundType.AZALEA_LEAVES));
    public static final DeferredBlock<Block> WHITE_BOUGAINVILLEA = registerBlock("white_bougainvillea",
            (properties) -> new LeavesBlock(0F, properties){
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;};
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}}, leavesProperties(SoundType.AZALEA_LEAVES));
    public static final DeferredBlock<Block> RED_BOUGAINVILLEA = registerBlock("red_bougainvillea",
            (properties) -> new LeavesBlock(0F, properties){
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;};
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}}, leavesProperties(SoundType.AZALEA_LEAVES));
    public static final DeferredBlock<Block> ORANGE_BOUGAINVILLEA = registerBlock("orange_bougainvillea",
            (properties) -> new LeavesBlock(0F, properties){
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;};
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}}, leavesProperties(SoundType.AZALEA_LEAVES));
    public static final DeferredBlock<Block> YELLOW_BOUGAINVILLEA = registerBlock("yellow_bougainvillea",
            (properties) -> new LeavesBlock(0F, properties){
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;};
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}}, leavesProperties(SoundType.AZALEA_LEAVES));
    public static final DeferredBlock<Block> PURPLE_BOUGAINVILLEA = registerBlock("purple_bougainvillea",
            (properties) -> new LeavesBlock(0F, properties){
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;};
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}}, leavesProperties(SoundType.AZALEA_LEAVES));
    public static final DeferredBlock<Block> MAGENTA_BOUGAINVILLEA = registerBlock("magenta_bougainvillea",
            (properties) -> new LeavesBlock(0F, properties){
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;};
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}}, leavesProperties(SoundType.AZALEA_LEAVES));
    public static final DeferredBlock<Block> PINK_BOUGAINVILLEA = registerBlock("pink_bougainvillea",
            (properties) -> new LeavesBlock(0F, properties){
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;};
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}}, leavesProperties(SoundType.AZALEA_LEAVES));

    public static final DeferredBlock<ModSaplingBlock> BOUGAINVILLEA_SAPLING = registerBlock("bougainvillea_sapling",
            (properties) -> new ModSaplingBlock(ModTreeGrowers.BOUGAINVILLEA_BUSH, properties), saplingBushProperties(SoundType.GRASS));
    public static final DeferredBlock<ModSaplingBlock> WHITE_BOUGAINVILLEA_SAPLING = registerBlock("white_bougainvillea_sapling",
            (properties) -> new ModSaplingBlock(ModTreeGrowers.WHITE_BOUGAINVILLEA_BUSH, properties), saplingBushProperties(SoundType.GRASS));
    public static final DeferredBlock<ModSaplingBlock> RED_BOUGAINVILLEA_SAPLING = registerBlock("red_bougainvillea_sapling",
            (properties) -> new ModSaplingBlock(ModTreeGrowers.RED_BOUGAINVILLEA_BUSH, properties), saplingBushProperties(SoundType.GRASS));
    public static final DeferredBlock<ModSaplingBlock> ORANGE_BOUGAINVILLEA_SAPLING = registerBlock("orange_bougainvillea_sapling",
            (properties) -> new ModSaplingBlock(ModTreeGrowers.ORANGE_BOUGAINVILLEA_BUSH, properties), saplingBushProperties(SoundType.GRASS));
    public static final DeferredBlock<ModSaplingBlock> YELLOW_BOUGAINVILLEA_SAPLING = registerBlock("yellow_bougainvillea_sapling",
            (properties) -> new ModSaplingBlock(ModTreeGrowers.YELLOW_BOUGAINVILLEA_BUSH, properties), saplingBushProperties(SoundType.GRASS));
    public static final DeferredBlock<ModSaplingBlock> PURPLE_BOUGAINVILLEA_SAPLING = registerBlock("purple_bougainvillea_sapling",
            (properties) -> new ModSaplingBlock(ModTreeGrowers.PURPLE_BOUGAINVILLEA_BUSH, properties), saplingBushProperties(SoundType.GRASS));
    public static final DeferredBlock<ModSaplingBlock> MAGENTA_BOUGAINVILLEA_SAPLING = registerBlock("magenta_bougainvillea_sapling",
            (properties) -> new ModSaplingBlock(ModTreeGrowers.MAGENTA_BOUGAINVILLEA_BUSH, properties), saplingBushProperties(SoundType.GRASS));
    public static final DeferredBlock<ModSaplingBlock> PINK_BOUGAINVILLEA_SAPLING = registerBlock("pink_bougainvillea_sapling",
            (properties) -> new ModSaplingBlock(ModTreeGrowers.PINK_BOUGAINVILLEA_BUSH, properties), saplingBushProperties(SoundType.GRASS));

    //Wattle
    public static final DeferredBlock<VineBlock> WHITE_WATTLE_VINE = registerBlock("white_wattle_vine",
            VineBlock::new, vineProperties());
    public static final DeferredBlock<VineBlock> RED_WATTLE_VINE = registerBlock("red_wattle_vine",
            VineBlock::new, vineProperties());
    public static final DeferredBlock<VineBlock> ORANGE_WATTLE_VINE = registerBlock("orange_wattle_vine",
            VineBlock::new, vineProperties());
    public static final DeferredBlock<VineBlock> YELLOW_WATTLE_VINE = registerBlock("yellow_wattle_vine",
            VineBlock::new, vineProperties());

    public static final DeferredBlock<Block> WHITE_WATTLE_LEAVES = registerBlock("white_wattle_leaves",
            (properties) -> new LeavesBlock(0F, properties){
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}}, leavesProperties(SoundType.GRASS));
    public static final DeferredBlock<Block> RED_WATTLE_LEAVES = registerBlock("red_wattle_leaves",
            (properties) -> new LeavesBlock(0F, properties) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}}, leavesProperties(SoundType.GRASS));
    public static final DeferredBlock<Block> ORANGE_WATTLE_LEAVES = registerBlock("orange_wattle_leaves",
            (properties) -> new LeavesBlock(0F, properties) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}}, leavesProperties(SoundType.GRASS));
    public static final DeferredBlock<Block> YELLOW_WATTLE_LEAVES = registerBlock("yellow_wattle_leaves",
            (properties) -> new LeavesBlock(0F, properties) {
                @Override
                public MapCodec<? extends LeavesBlock> codec() {return null;}
                @Override
                protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {}}, leavesProperties(SoundType.GRASS));

    public static final DeferredBlock<SaplingBlock> WHITE_WATTLE_SAPLING = registerBlock("white_wattle_sapling",
            (properties) -> new SaplingBlock(ModTreeGrowers.WHITE_WATTLE_TREE, properties), saplingProperties(SoundType.GRASS));
    public static final DeferredBlock<SaplingBlock> RED_WATTLE_SAPLING = registerBlock("red_wattle_sapling",
            (properties) -> new SaplingBlock(ModTreeGrowers.RED_WATTLE_TREE, properties), saplingProperties(SoundType.GRASS));
    public static final DeferredBlock<SaplingBlock> ORANGE_WATTLE_SAPLING = registerBlock("orange_wattle_sapling",
            (properties) -> new SaplingBlock(ModTreeGrowers.ORANGE_WATTLE_TREE, properties), saplingProperties(SoundType.GRASS));
    public static final DeferredBlock<SaplingBlock> YELLOW_WATTLE_SAPLING = registerBlock("yellow_wattle_sapling",
            (properties) -> new SaplingBlock(ModTreeGrowers.YELLOW_WATTLE_TREE, properties), saplingProperties(SoundType.GRASS));

    //Clematis
    public static final DeferredBlock<VineBlock> CLEMATIS_VINE = registerBlock("clematis_vine",
            VineBlock::new, vineProperties());
    public static final DeferredBlock<VineBlock> WHITE_CLEMATIS = registerBlock("white_clematis",
            VineBlock::new, vineProperties());
    public static final DeferredBlock<VineBlock> RED_CLEMATIS = registerBlock("red_clematis",
            VineBlock::new, vineProperties());
    public static final DeferredBlock<VineBlock> YELLOW_CLEMATIS = registerBlock("yellow_clematis",
            VineBlock::new, vineProperties());
    public static final DeferredBlock<VineBlock> BLUE_CLEMATIS = registerBlock("blue_clematis",
            VineBlock::new, vineProperties());
    public static final DeferredBlock<VineBlock> PURPLE_CLEMATIS = registerBlock("purple_clematis",
            VineBlock::new, vineProperties());
    public static final DeferredBlock<VineBlock> MAGENTA_CLEMATIS = registerBlock("magenta_clematis",
            VineBlock::new, vineProperties());
    public static final DeferredBlock<VineBlock> PINK_CLEMATIS = registerBlock("pink_clematis",
            VineBlock::new, vineProperties());

    //Rose Bush
    public static final DeferredBlock<TallFlowerBlock> WHITE_ROSE_BUSH = registerBlock("white_rose_bush",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> LIGHT_GRAY_ROSE_BUSH = registerBlock("light_gray_rose_bush",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> BLACK_ROSE_BUSH = registerBlock("black_rose_bush",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> ORANGE_ROSE_BUSH = registerBlock("orange_rose_bush",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> YELLOW_ROSE_BUSH = registerBlock("yellow_rose_bush",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> LIME_ROSE_BUSH = registerBlock("lime_rose_bush",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> BLUE_ROSE_BUSH = registerBlock("blue_rose_bush",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> PURPLE_ROSE_BUSH = registerBlock("purple_rose_bush",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> MAGENTA_ROSE_BUSH = registerBlock("magenta_rose_bush",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> PINK_ROSE_BUSH = registerBlock("pink_rose_bush",
            TallFlowerBlock::new, tallFlowerProperties());

    //Lilac
    public static final DeferredBlock<TallFlowerBlock> WHITE_LILAC = registerBlock("white_lilac",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> PURPLE_LILAC = registerBlock("purple_lilac",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> PINK_LILAC = registerBlock("pink_lilac",
            TallFlowerBlock::new, tallFlowerProperties());

    //Peony
    public static final DeferredBlock<TallFlowerBlock> WHITE_PEONY = registerBlock("white_peony",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> MAGENTA_PEONY = registerBlock("magenta_peony",
            TallFlowerBlock::new, tallFlowerProperties());

    //Hollyhock
    public static final DeferredBlock<TriplePlantBlock> HOLLYHOCK_BUSH = registerBlock("hollyhock_bush",
            TriplePlantBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TripleFlowerBlock> WHITE_HOLLYHOCK = registerBlock("white_hollyhock",
            TripleFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TripleFlowerBlock> BLACK_HOLLYHOCK = registerBlock("black_hollyhock",
            TripleFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TripleFlowerBlock> RED_HOLLYHOCK = registerBlock("red_hollyhock",
            TripleFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TripleFlowerBlock> YELLOW_HOLLYHOCK = registerBlock("yellow_hollyhock",
            TripleFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TripleFlowerBlock> MAGENTA_HOLLYHOCK = registerBlock("magenta_hollyhock",
            TripleFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TripleFlowerBlock> PINK_HOLLYHOCK = registerBlock("pink_hollyhock",
            TripleFlowerBlock::new, tallFlowerProperties());

    //Hydrangea
    public static final DeferredBlock<LargeFlowerBlock> WHITE_HYDRANGEA = registerBlock("white_hydrangea",
            (properties) -> new LargeFlowerBlock(MobEffects.NAUSEA, 15.0F, properties), flowerProperties());
    public static final DeferredBlock<LargeFlowerBlock> RED_HYDRANGEA = registerBlock("red_hydrangea",
            (properties) -> new LargeFlowerBlock(MobEffects.NAUSEA, 15.0F, properties), flowerProperties());
    public static final DeferredBlock<LargeFlowerBlock> YELLOW_HYDRANGEA = registerBlock("yellow_hydrangea",
            (properties) -> new LargeFlowerBlock(MobEffects.NAUSEA, 15.0F, properties), flowerProperties());
    public static final DeferredBlock<LargeFlowerBlock> LIME_HYDRANGEA = registerBlock("lime_hydrangea",
            (properties) -> new LargeFlowerBlock(MobEffects.NAUSEA, 15.0F, properties), flowerProperties());
    public static final DeferredBlock<LargeFlowerBlock> LIGHT_BLUE_HYDRANGEA = registerBlock("light_blue_hydrangea",
            (properties) -> new LargeFlowerBlock(MobEffects.NAUSEA, 15.0F, properties), flowerProperties());
    public static final DeferredBlock<LargeFlowerBlock> BLUE_HYDRANGEA = registerBlock("blue_hydrangea",
            (properties) -> new LargeFlowerBlock(MobEffects.NAUSEA, 15.0F, properties), flowerProperties());
    public static final DeferredBlock<LargeFlowerBlock> PURPLE_HYDRANGEA = registerBlock("purple_hydrangea",
            (properties) -> new LargeFlowerBlock(MobEffects.NAUSEA, 15.0F, properties), flowerProperties());
    public static final DeferredBlock<LargeFlowerBlock> MAGENTA_HYDRANGEA = registerBlock("magenta_hydrangea",
            (properties) -> new LargeFlowerBlock(MobEffects.NAUSEA, 15.0F, properties), flowerProperties());
    public static final DeferredBlock<LargeFlowerBlock> PINK_HYDRANGEA = registerBlock("pink_hydrangea",
            (properties) -> new LargeFlowerBlock(MobEffects.NAUSEA, 15.0F, properties), flowerProperties());

    //Agapanthus
    public static final DeferredBlock<DoublePlantBlock> DEAD_AGAPANTHUS = registerBlock("dead_agapanthus",
            DoublePlantBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> GRAY_AGAPANTHUS = registerBlock("gray_agapanthus",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> WHITE_AGAPANTHUS = registerBlock("white_agapanthus",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> ORANGE_AGAPANTHUS = registerBlock("orange_agapanthus",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> BLUE_AGAPANTHUS = registerBlock("blue_agapanthus",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> PURPLE_AGAPANTHUS = registerBlock("purple_agapanthus",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> MAGENTA_AGAPANTHUS = registerBlock("magenta_agapanthus",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> PINK_AGAPANTHUS = registerBlock("pink_agapanthus",
            TallFlowerBlock::new, tallFlowerProperties());

    //Poppy
    public static final DeferredBlock<ModFlowerBlock> WHITE_POPPY = registerBlock("white_poppy",
            (properties) -> new ModFlowerBlock(MobEffects.NIGHT_VISION, 5.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> ORANGE_POPPY = registerBlock("orange_poppy",
            (properties) -> new ModFlowerBlock(MobEffects.NIGHT_VISION, 5.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> YELLOW_POPPY = registerBlock("yellow_poppy",
            (properties) -> new ModFlowerBlock(MobEffects.NIGHT_VISION, 5.0F, properties), flowerProperties());

    //Pansy
    public static final DeferredBlock<FlowerBedBlock> WHITE_PANSY = registerBlock("white_pansy",
            FlowerBedBlock::new, flowerBedProperties());
    public static final DeferredBlock<FlowerBedBlock> BLACK_PANSY = registerBlock("black_pansy",
            FlowerBedBlock::new, flowerBedProperties());
    public static final DeferredBlock<FlowerBedBlock> BROWN_PANSY = registerBlock("brown_pansy",
            FlowerBedBlock::new, flowerBedProperties());
    public static final DeferredBlock<FlowerBedBlock> RED_PANSY = registerBlock("red_pansy",
            FlowerBedBlock::new, flowerBedProperties());
    public static final DeferredBlock<FlowerBedBlock> ORANGE_PANSY = registerBlock("orange_pansy",
            FlowerBedBlock::new, flowerBedProperties());
    public static final DeferredBlock<FlowerBedBlock> YELLOW_PANSY = registerBlock("yellow_pansy",
            FlowerBedBlock::new, flowerBedProperties());
    public static final DeferredBlock<FlowerBedBlock> BLUE_PANSY = registerBlock("blue_pansy",
            FlowerBedBlock::new, flowerBedProperties());
    public static final DeferredBlock<FlowerBedBlock> PURPLE_PANSY = registerBlock("purple_pansy",
            FlowerBedBlock::new, flowerBedProperties());
    public static final DeferredBlock<FlowerBedBlock> MAGENTA_PANSY = registerBlock("magenta_pansy",
            FlowerBedBlock::new, flowerBedProperties());
    public static final DeferredBlock<FlowerBedBlock> PINK_PANSY = registerBlock("pink_pansy",
            FlowerBedBlock::new, flowerBedProperties());

    //Tulip
    public static final DeferredBlock<ModFlowerBlock> BLACK_TULIP = registerBlock("black_tulip",
            (properties) -> new ModFlowerBlock(MobEffects.WEAKNESS, 7.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> YELLOW_TULIP = registerBlock("yellow_tulip",
            (properties) -> new ModFlowerBlock(MobEffects.WEAKNESS, 7.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> PURPLE_TULIP = registerBlock("purple_tulip",
            (properties) -> new ModFlowerBlock(MobEffects.WEAKNESS, 7.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> MAGENTA_TULIP = registerBlock("magenta_tulip",
            (properties) -> new ModFlowerBlock(MobEffects.WEAKNESS, 7.0F, properties), flowerProperties());

    //Orchid
    public static final DeferredBlock<ModFlowerBlock> WHITE_ORCHID = registerBlock("white_orchid",
            (properties) -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> ORANGE_ORCHID = registerBlock("orange_orchid",
            (properties) -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> YELLOW_ORCHID = registerBlock("yellow_orchid",
            (properties) -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> CYAN_ORCHID = registerBlock("cyan_orchid",
            (properties) -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> PURPLE_ORCHID = registerBlock("purple_orchid",
            (properties) -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> MAGENTA_ORCHID = registerBlock("magenta_orchid",
            (properties) -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> PINK_ORCHID = registerBlock("pink_orchid",
            (properties) -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, properties), flowerProperties());

    //Azure Bluet
    public static final DeferredBlock<ModFlowerBlock> LIGHT_BLUE_AZURE_BLUET = registerBlock("light_blue_azure_bluet",
            (properties) -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, properties), flowerProperties());

    //Daisy
    public static final DeferredBlock<ModFlowerBlock> CYAN_OXEYE_DAISY = registerBlock("cyan_oxeye_daisy",
            (properties) -> new ModFlowerBlock(MobEffects.REGENERATION, 7.0F, properties), flowerProperties());

    //Chrysanthemum
    public static final DeferredBlock<ModFlowerBlock> WHITE_CHRYSANTHEMUM = registerBlock("white_chrysanthemum",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> BLACK_CHRYSANTHEMUM = registerBlock("black_chrysanthemum",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> RED_CHRYSANTHEMUM = registerBlock("red_chrysanthemum",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> ORANGE_CHRYSANTHEMUM = registerBlock("orange_chrysanthemum",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> YELLOW_CHRYSANTHEMUM = registerBlock("yellow_chrysanthemum",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> LIME_CHRYSANTHEMUM = registerBlock("lime_chrysanthemum",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> GREEN_CHRYSANTHEMUM = registerBlock("green_chrysanthemum",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> LIGHT_BLUE_CHRYSANTHEMUM = registerBlock("light_blue_chrysanthemum",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> BLUE_CHRYSANTHEMUM = registerBlock("blue_chrysanthemum",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> PURPLE_CHRYSANTHEMUM = registerBlock("purple_chrysanthemum",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> MAGENTA_CHRYSANTHEMUM = registerBlock("magenta_chrysanthemum",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> PINK_CHRYSANTHEMUM = registerBlock("pink_chrysanthemum",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_HEALTH, 0.05F, properties), flowerProperties());

    //Hellebore
    public static final DeferredBlock<ModFlowerBlock> WHITE_HELLEBORE = registerBlock("white_hellebore",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_DAMAGE, 0.35F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> BLACK_HELLEBORE = registerBlock("black_hellebore",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_DAMAGE, 0.35F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> RED_HELLEBORE = registerBlock("red_hellebore",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_DAMAGE, 0.35F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> YELLOW_HELLEBORE = registerBlock("yellow_hellebore",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_DAMAGE, 0.35F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> LIME_HELLEBORE = registerBlock("lime_hellebore",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_DAMAGE, 0.35F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> PURPLE_HELLEBORE = registerBlock("purple_hellebore",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_DAMAGE, 0.35F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> MAGENTA_HELLEBORE = registerBlock("magenta_hellebore",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_DAMAGE, 0.35F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> PINK_HELLEBORE = registerBlock("pink_hellebore",
            (properties) -> new ModFlowerBlock(MobEffects.INSTANT_DAMAGE, 0.35F, properties), flowerProperties());

    //Grevillea
    public static final DeferredBlock<ModFlowerBlock> WHITE_GREVILLEA = registerBlock("white_grevillea",
            (properties) -> new ModFlowerBlock(MobEffects.POISON, 12.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> LIGHT_GRAY_GREVILLEA = registerBlock("light_gray_grevillea",
            (properties) -> new ModFlowerBlock(MobEffects.POISON, 12.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> GRAY_GREVILLEA = registerBlock("gray_grevillea",
            (properties) -> new ModFlowerBlock(MobEffects.POISON, 12.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> BLACK_GREVILLEA = registerBlock("black_grevillea",
            (properties) -> new ModFlowerBlock(MobEffects.POISON, 12.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> RED_GREVILLEA = registerBlock("red_grevillea",
            (properties) -> new ModFlowerBlock(MobEffects.POISON, 12.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> ORANGE_GREVILLEA = registerBlock("orange_grevillea",
            (properties) -> new ModFlowerBlock(MobEffects.POISON, 12.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> YELLOW_GREVILLEA = registerBlock("yellow_grevillea",
            (properties) -> new ModFlowerBlock(MobEffects.POISON, 12.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> MAGENTA_GREVILLEA = registerBlock("magenta_grevillea",
            (properties) -> new ModFlowerBlock(MobEffects.POISON, 12.0F, properties), flowerProperties());

    //Waratah
    public static final DeferredBlock<ModFlowerBlock> WHITE_WARATAH = registerBlock("white_waratah",
            (properties) -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> RED_WARATAH = registerBlock("red_waratah",
            (properties) -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> YELLOW_WARATAH = registerBlock("yellow_waratah",
            (properties) -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> MAGENTA_WARATAH = registerBlock("magenta_waratah",
            (properties) -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> PINK_WARATAH = registerBlock("pink_waratah",
            (properties) -> new ModFlowerBlock(MobEffects.SATURATION, 0.35F, properties), flowerProperties());

    //Rosemary
    public static final DeferredBlock<LargeFlowerBlock> ROSEMARY_BUSH = registerBlock("rosemary_bush",
            (properties) -> new LargeFlowerBlock(MobEffects.ABSORPTION, 20.0F, properties), flowerProperties());
    public static final DeferredBlock<LargeFlowerBlock> WHITE_ROSEMARY = registerBlock("white_rosemary",
            (properties) -> new LargeFlowerBlock(MobEffects.ABSORPTION, 20.0F, properties), flowerProperties());
    public static final DeferredBlock<LargeFlowerBlock> PURPLE_ROSEMARY = registerBlock("purple_rosemary",
            (properties) -> new LargeFlowerBlock(MobEffects.ABSORPTION, 20.0F, properties), flowerProperties());
    public static final DeferredBlock<LargeFlowerBlock> PINK_ROSEMARY = registerBlock("pink_rosemary",
            (properties) -> new LargeFlowerBlock(MobEffects.ABSORPTION, 20.0F, properties), flowerProperties());

    //Foxglove
    public static final DeferredBlock<DoublePlantBlock> FOXGLOVE_BUSH = registerBlock("foxglove_bush",
            DoublePlantBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> WHITE_FOXGLOVE = registerBlock("white_foxglove",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> YELLOW_FOXGLOVE = registerBlock("yellow_foxglove",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> BLUE_FOXGLOVE = registerBlock("blue_foxglove",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> PURPLE_FOXGLOVE = registerBlock("purple_foxglove",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> MAGENTA_FOXGLOVE = registerBlock("magenta_foxglove",
            TallFlowerBlock::new, tallFlowerProperties());
    public static final DeferredBlock<TallFlowerBlock> PINK_FOXGLOVE = registerBlock("pink_foxglove",
            TallFlowerBlock::new, tallFlowerProperties());

    //Bird of Paradise
    public static final DeferredBlock<LargeFlowerBlock> WHITE_BIRD_OF_PARADISE = registerBlock("white_bird_of_paradise",
            (properties) -> new LargeFlowerBlock(MobEffects.HUNGER, 30.0F, properties), flowerProperties());
    public static final DeferredBlock<LargeFlowerBlock> ORANGE_BIRD_OF_PARADISE = registerBlock("orange_bird_of_paradise",
            (properties) -> new LargeFlowerBlock(MobEffects.HUNGER, 30.0F, properties), flowerProperties());
    public static final DeferredBlock<LargeFlowerBlock> YELLOW_BIRD_OF_PARADISE = registerBlock("yellow_bird_of_paradise",
            (properties) -> new LargeFlowerBlock(MobEffects.HUNGER, 30.0F, properties), flowerProperties());
    public static final DeferredBlock<LargeFlowerBlock> MAGENTA_BIRD_OF_PARADISE = registerBlock("magenta_bird_of_paradise",
            (properties) -> new LargeFlowerBlock(MobEffects.HUNGER, 30F, properties), flowerProperties());

    //Arctotis
    public static final DeferredBlock<ModFlowerBlock> WHITE_ARCTOTIS = registerBlock("white_arctotis",
            (properties) -> new ModFlowerBlock(MobEffects.NIGHT_VISION, 7.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> RED_ARCTOTIS = registerBlock("red_arctotis",
            (properties) -> new ModFlowerBlock(MobEffects.NIGHT_VISION, 7.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> ORANGE_ARCTOTIS = registerBlock("orange_arctotis",
            (properties) -> new ModFlowerBlock(MobEffects.NIGHT_VISION, 7.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> YELLOW_ARCTOTIS = registerBlock("yellow_arctotis",
            (properties) -> new ModFlowerBlock(MobEffects.NIGHT_VISION, 7.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> MAGENTA_ARCTOTIS = registerBlock("magenta_arctotis",
            (properties) -> new ModFlowerBlock(MobEffects.NIGHT_VISION, 7.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> PINK_ARCTOTIS = registerBlock("pink_arctotis",
            (properties) -> new ModFlowerBlock(MobEffects.NIGHT_VISION, 7.0F, properties), flowerProperties());

    //Babiana
    public static final DeferredBlock<ModFlowerBlock> WHITE_BABIANA = registerBlock("white_babiana",
            (properties) -> new ModFlowerBlock(MobEffects.REGENERATION, 9.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> PURPLE_BABIANA = registerBlock("purple_babiana",
            (properties) -> new ModFlowerBlock(MobEffects.REGENERATION, 9.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> MAGENTA_BABIANA = registerBlock("magenta_babiana",
            (properties) -> new ModFlowerBlock(MobEffects.REGENERATION, 9.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> PINK_BABIANA = registerBlock("pink_babiana",
            (properties) -> new ModFlowerBlock(MobEffects.REGENERATION, 9.0F, properties), flowerProperties());

    //Fire Lily
    public static final DeferredBlock<ModFlowerBlock> WHITE_FIRE_LILY = registerBlock("white_fire_lily",
            (properties) -> new ModFlowerBlock(MobEffects.FIRE_RESISTANCE, 7.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> RED_FIRE_LILY = registerBlock("red_fire_lily",
            (properties) -> new ModFlowerBlock(MobEffects.FIRE_RESISTANCE, 7.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> ORANGE_FIRE_LILY = registerBlock("orange_fire_lily",
            (properties) -> new ModFlowerBlock(MobEffects.FIRE_RESISTANCE, 7.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> YELLOW_FIRE_LILY = registerBlock("yellow_fire_lily",
            (properties) -> new ModFlowerBlock(MobEffects.FIRE_RESISTANCE, 7.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> PURPLE_FIRE_LILY = registerBlock("purple_fire_lily",
            (properties) -> new ModFlowerBlock(MobEffects.FIRE_RESISTANCE, 7.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> MAGENTA_FIRE_LILY = registerBlock("magenta_fire_lily",
            (properties) -> new ModFlowerBlock(MobEffects.FIRE_RESISTANCE, 7.0F, properties), flowerProperties());
    public static final DeferredBlock<ModFlowerBlock> PINK_FIRE_LILY = registerBlock("pink_fire_lily",
            (properties) -> new ModFlowerBlock(MobEffects.FIRE_RESISTANCE, 7.0F, properties), flowerProperties());

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function, BlockBehaviour.Properties properties) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function, properties);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name, (properties) -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
