package com.donaldduckith.expandedflowers.block;

import com.mojang.serialization.MapCodec;

import javax.annotation.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.VegetationBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.Fluids;

public class TriplePlantBlock extends VegetationBlock {
    public static final MapCodec<TriplePlantBlock> CODEC = simpleCodec(TriplePlantBlock::new);
    public static final EnumProperty<TripleBlockSegment> SEGMENT = EnumProperty.create("segment", TripleBlockSegment.class);

    @Override
    protected MapCodec<? extends TriplePlantBlock> codec() { return CODEC; }

    public TriplePlantBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(SEGMENT, TripleBlockSegment.LOWER));
    }

    @Override
    protected BlockState updateShape(
            BlockState state,
            LevelReader level,
            ScheduledTickAccess scheduledTickAccess,
            BlockPos pos,
            Direction direction,
            BlockPos neighborPos,
            BlockState neighborState,
            RandomSource random
    ) {
        TripleBlockSegment triplePlantSegment = state.getValue(SEGMENT);
        if (direction.getAxis() != Direction.Axis.Y
                || (triplePlantSegment == TripleBlockSegment.LOWER != (direction == Direction.UP))
                && (triplePlantSegment == TripleBlockSegment.UPPER != (direction == Direction.DOWN))
                || neighborState.is(this) && neighborState.getValue(SEGMENT) != triplePlantSegment) {
            return triplePlantSegment == TripleBlockSegment.LOWER && direction == Direction.DOWN && !state.canSurvive(level, pos)
                    ? Blocks.AIR.defaultBlockState()
                    : super.updateShape(state, level, scheduledTickAccess, pos, direction, neighborPos, neighborState, random);
        } else {
            return Blocks.AIR.defaultBlockState();
        }
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos blockpos = context.getClickedPos();
        BlockPos topblockpos = blockpos.above();
        Level level = context.getLevel();
        return blockpos.getY() < level.getMaxY() && level.getBlockState(blockpos.above()).canBeReplaced(context)
                && level.getBlockState(topblockpos.above()).canBeReplaced(context) ? super.getStateForPlacement(context) : null;
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
        BlockPos blockpos = pos.above();
        BlockPos topblockpos = blockpos.above();
        level.setBlock(blockpos, copyWaterloggedFrom(level, blockpos, this.defaultBlockState().setValue(SEGMENT, TripleBlockSegment.MIDDLE)), 3);
        level.setBlock(topblockpos, copyWaterloggedFrom(level, topblockpos, this.defaultBlockState().setValue(SEGMENT, TripleBlockSegment.UPPER)), 3);
    }

    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos blockpos = pos.below();
        BlockState blockstate = level.getBlockState(blockpos);
        return state.getValue(SEGMENT) == TripleBlockSegment.LOWER ? super.canSurvive(state, level, pos) : blockstate.is(this);
    }

    public static void placeAt(LevelAccessor level, BlockState state, BlockPos pos, int flags) {
        BlockPos blockpos = pos.above();
        BlockPos topblockpos = blockpos.above();
        level.setBlock(pos, copyWaterloggedFrom(level, pos, state.setValue(SEGMENT, TripleBlockSegment.LOWER)), flags);
        level.setBlock(blockpos, copyWaterloggedFrom(level, pos, state.setValue(SEGMENT, TripleBlockSegment.MIDDLE)), flags);
        level.setBlock(topblockpos, copyWaterloggedFrom(level, pos, state.setValue(SEGMENT, TripleBlockSegment.UPPER)), flags);
    }

    public static BlockState copyWaterloggedFrom(LevelReader level, BlockPos pos, BlockState state) {
        return state.hasProperty(BlockStateProperties.WATERLOGGED)
                ? state.setValue(BlockStateProperties.WATERLOGGED, level.isWaterAt(pos))
                : state;
    }

    @Override
    public BlockState playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        if (!level.isClientSide) {
            if (player.preventsBlockDrops()) {
                preventDropFromBottomPart(level, pos, state, player);
            } else {
                dropResources(state, level, pos, null, player, player.getMainHandItem());
            }
        }

        return super.playerWillDestroy(level, pos, state, player);
    }

    @Override
    public void playerDestroy(Level level, Player player, BlockPos pos, BlockState state, @Nullable BlockEntity block, ItemStack stack) {
        super.playerDestroy(level, player, pos, Blocks.AIR.defaultBlockState(), block, stack);
    }

    protected static void preventDropFromBottomPart(Level level, BlockPos pos, BlockState state, Player player) {
        TripleBlockSegment segment = state.getValue(SEGMENT);
        if (segment == TripleBlockSegment.MIDDLE) {
            BlockPos blockpos = pos.below();
            BlockState blockstate = level.getBlockState(blockpos);
            if (blockstate.is(state.getBlock()) && blockstate.getValue(SEGMENT) == TripleBlockSegment.LOWER) {
                BlockState blockstate1 = blockstate.getFluidState().is(Fluids.WATER) ? Blocks.WATER.defaultBlockState() : Blocks.AIR.defaultBlockState();
                level.setBlock(blockpos, blockstate1, 35);
                level.levelEvent(player, 2001, blockpos, Block.getId(blockstate));
            }
        } if (segment == TripleBlockSegment.UPPER) {
            BlockPos blockpos = pos.below();
            BlockState blockstate = level.getBlockState(blockpos);
            if (blockstate.is(state.getBlock()) && blockstate.getValue(SEGMENT) == TripleBlockSegment.MIDDLE) {
                BlockState blockstate1 = blockstate.getFluidState().is(Fluids.WATER) ? Blocks.WATER.defaultBlockState() : Blocks.AIR.defaultBlockState();
                level.setBlock(blockpos, blockstate1, 35);
                level.levelEvent(player, 2001, blockpos, Block.getId(blockstate));
                BlockPos blockposdown = blockpos.below();
                BlockState blockstatedown = level.getBlockState(blockposdown);
                if (blockstatedown.is(state.getBlock()) && blockstatedown.getValue(SEGMENT) == TripleBlockSegment.LOWER) {
                    BlockState blockstate2 = blockstatedown.getFluidState().is(Fluids.WATER) ? Blocks.WATER.defaultBlockState() : Blocks.AIR.defaultBlockState();
                    level.setBlock(blockposdown, blockstate2, 35);
                    level.levelEvent(player, 2001, blockposdown, Block.getId(blockstatedown));
                }
            }
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(SEGMENT);
    }

    @Override
    protected long getSeed(BlockState state, BlockPos pos) {
        return Mth.getSeed(pos.getX(), pos.below(state.getValue(SEGMENT) == TripleBlockSegment.LOWER ? 0 : 1).getY(), pos.getZ());
    }
}
