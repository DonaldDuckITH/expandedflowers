package com.donaldduckith.expandedflowers.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.GrowingPlantBodyBlock;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BottlebrushVinesBlock extends GrowingPlantBodyBlock {
    public BottlebrushVinesBlock(BlockBehaviour.Properties properties, Direction growthDirection, VoxelShape shape, boolean scheduleFluidTicks) {
        super(properties, growthDirection, shape, scheduleFluidTicks);
    }

    @Override
    protected MapCodec<? extends GrowingPlantBodyBlock> codec() {
        return null;
    }

    @Override
    protected GrowingPlantHeadBlock getHeadBlock() {
        return null;
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
