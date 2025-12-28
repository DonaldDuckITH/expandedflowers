package com.donaldduckith.expandedflowers.worldgen;

import com.donaldduckith.expandedflowers.registry.ModTags;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;

import java.util.List;
import java.util.function.Function;

import static com.mojang.serialization.DataResult.error;

public class ModHangingVineDecorator extends TreeDecorator {
    public static final MapCodec<ModHangingVineDecorator> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                            BuiltInRegistries.BLOCK.byNameCodec().comapFlatMap(block1 -> {
                                if (block1 instanceof GrowingPlantHeadBlock hangingVineBlock) {
                                    return DataResult.success(hangingVineBlock);
                                }
                                return error(() -> "Provided block is not of type GrowingPlantHeadBlock");
                            }, Function.identity()).fieldOf("block").forGetter(block -> block.block))
                    .apply(instance, ModHangingVineDecorator::new));

    private GrowingPlantHeadBlock block;

    public ModHangingVineDecorator(GrowingPlantHeadBlock block) {
        this.block = block;
    }

    @Override
    protected TreeDecoratorType<?> type() {
        return ModTreeDecoratorType.MOD_HANGING_VINE.get();
    }

    @Override
    public void place(Context context) {
        RandomSource randomSource = context.random();
        List<BlockPos> list = Util.shuffledCopy(context.leaves(), randomSource);
        if (!list.isEmpty()) {
            Mutable<BlockPos> mutable = new MutableObject<>(list.getFirst());
            list.forEach(leaves -> {
                if (leaves.getY() < mutable.getValue().getY()) {
                    mutable.setValue(leaves);
                }
            });
            context.leaves().forEach(pos -> {
                if (context.checkBlock(pos, state -> state.is(ModTags.Blocks.FLOWERING_LEAVES))) {
                    BlockPos blockpos1 = pos.below();
                    if (context.isAir(blockpos1)) {
                        addHangingVine(blockpos1, context);
                    }
                }
            });
        }
    }

    private void addHangingVine(BlockPos pos, TreeDecorator.Context context) {
            context.setBlock(pos, block.defaultBlockState());
    }
}
