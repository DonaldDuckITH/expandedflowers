package com.donaldduckith.expandedflowers.worldgen;

import com.donaldduckith.expandedflowers.registry.ModBlocks;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.sun.source.tree.Tree;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.VineBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;

import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static com.mojang.serialization.DataResult.error;

public class ModVineDecorator extends TreeDecorator {
    public static final MapCodec<ModVineDecorator> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(probability -> probability.probability),
                    BuiltInRegistries.BLOCK.byNameCodec().comapFlatMap(block1 -> {
                        if (block1 instanceof VineBlock vineBlock) {
                            return DataResult.success(vineBlock);
                        }
                        return error(() -> "Provided block is not of type VineBlock");
                    }, Function.identity()).fieldOf("block").forGetter(block -> block.block))
                    .apply(instance, ModVineDecorator::new));
    public float probability;
    public VineBlock block;

    public ModVineDecorator(float probability, VineBlock block) {
        this.probability = probability;
        this.block = block;
    }

    protected TreeDecoratorType<?> type() {return ModTreeDecoratorType.MOD_VINE.get();}

    public void place(TreeDecorator.Context context) {
        RandomSource randomSource = context.random();
        context.leaves().forEach(pos -> {
            if (randomSource.nextFloat() < probability) {
                BlockPos blockpos = pos.west();
                if (context.isAir(blockpos)) {
                    addHangingVine(blockpos, VineBlock.EAST, context, block);
                }
            }
            if (randomSource.nextFloat() < probability) {
                BlockPos blockpos1 = pos.east();
                if (context.isAir(blockpos1)) {
                    addHangingVine(blockpos1, VineBlock.WEST, context, block);
                }
            }
            if (randomSource.nextFloat() < probability) {
                BlockPos blockpos2 = pos.north();
                if (context.isAir(blockpos2)) {
                    addHangingVine(blockpos2, VineBlock.SOUTH, context, block);
                }
            }
            if (randomSource.nextFloat() < probability) {
                BlockPos blockpos3 = pos.south();
                if (context.isAir(blockpos3)) {
                    addHangingVine(blockpos3, VineBlock.NORTH, context, block);
                }
            }
        });
    }

    private void addHangingVine(BlockPos pos, BooleanProperty sideProperty, TreeDecorator.Context context, VineBlock block) {
        RandomSource randomSource = context.random();
        placeVine(pos, sideProperty, context, block);

        int i = 4;
        for (BlockPos blockpos = pos.below(); context.isAir(blockpos) && i > 0; i--) {
            if (randomSource.nextFloat() < i*0.15) {
                placeVine(blockpos, sideProperty, context, block);
                blockpos = blockpos.below();
            }
        }
    }
    public void placeVine(BlockPos pos, BooleanProperty sideProperty, TreeDecorator.Context context, VineBlock block) {
        context.setBlock(pos, block.defaultBlockState().setValue(sideProperty, true));
    }
}
