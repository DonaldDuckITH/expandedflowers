package com.donaldduckith.expandedflowers.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ModSaplingBlock extends VegetationBlock implements BonemealableBlock {
    private static final VoxelShape SHAPE = Shapes.or(Block.column(16.0, 8.0, 16.0), Block.column(4.0, 0.0, 8.0));
    TreeGrower treeGrower;

    @Override
    public MapCodec<ModSaplingBlock> codec() {
        return null;
    }

    public ModSaplingBlock(TreeGrower treeGrower, BlockBehaviour.Properties properties) {
        super(properties);
        this.treeGrower = treeGrower;
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos blockPos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter blockGetter, BlockPos blockPos) {
        return state.is(Blocks.CLAY) || super.mayPlaceOn(state, blockGetter, blockPos);
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos blockPos, BlockState state) {
        return level.getFluidState(blockPos.above()).isEmpty();
    }

    @Override
    public boolean isBonemealSuccess(Level level, RandomSource randomSource, BlockPos blockPos, BlockState state) {
        return level.random.nextFloat() < 0.45;
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource randomSource, BlockPos blockPos, BlockState state) {
        this.treeGrower.growTree(level, level.getChunkSource().getGenerator(), blockPos, state, randomSource);
    }

    @Override
    protected boolean isPathfindable(BlockState state, PathComputationType pathComputationType) {
        return false;
    }
}
