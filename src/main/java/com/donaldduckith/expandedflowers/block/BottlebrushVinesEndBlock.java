package com.donaldduckith.expandedflowers.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BottlebrushVinesEndBlock extends GrowingPlantHeadBlock {
    public BottlebrushVinesEndBlock(Properties properties, Direction growthDirection, VoxelShape shape, boolean scheduleFluidTicks, double growPerTickProbability) {
        super(properties, growthDirection, shape, scheduleFluidTicks, growPerTickProbability);
    }

    @Override
    protected MapCodec<? extends GrowingPlantHeadBlock> codec() {
        return null;
    }

    protected Block getBodyBlock() {
        return null;
    }

    @Override
    protected int getBlocksToGrowWhenBonemealed(RandomSource random) {
        return 1;
    }

    @Override
    protected boolean canGrowInto(BlockState state) {
        return state.isAir();
    }

    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos blockpos = pos.relative(this.growthDirection.getOpposite());
        BlockState blockstate = level.getBlockState(blockpos);
        return !this.canAttachTo(blockstate)
                ? false
                : blockstate.is(this.getHeadBlock()) || blockstate.is(this.getBodyBlock()) || blockstate.isCollisionShapeFullBlock(level, blockpos);
    }
}
