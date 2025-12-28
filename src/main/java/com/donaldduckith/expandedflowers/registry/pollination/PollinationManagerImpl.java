package com.donaldduckith.expandedflowers.registry.pollination;

import com.donaldduckith.expandedflowers.registry.ModData;
import com.donaldduckith.expandedflowers.registry.pollination.PollinationInfo;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

import java.util.List;
import java.util.Map;

public class PollinationManagerImpl implements PollinationManager {
    public static final PollinationManagerImpl INSTANCE = new PollinationManagerImpl();

    private PollinationManagerImpl() {}

    @Override
    public boolean tryConversion(ServerLevel level, BlockPos blockPos) {
        return false;
    }

    @Override
    public boolean canConvert(ServerLevel level, Block block) {
        return level.registryAccess().lookupOrThrow(ModData.POLLINATION_REGISTRY).containsKey(BuiltInRegistries.BLOCK.getKey(block));
    }

    public void convert(ServerLevel level, BlockPos blockPos, Block newBlock) {
        BlockState state = level.getBlockState(blockPos);
        BlockState newState = newBlock.defaultBlockState();

        for (Property<?> property : state.getProperties()) {
            if (newState.hasProperty(property))
                newState = copyProperty(property, state, newState);
        }

        level.setBlockAndUpdate(blockPos, newState);
        level.playSound(null, blockPos, SoundEvents.GRASS_PLACE, SoundSource.BLOCKS);
        level.sendParticles(ParticleTypes.HAPPY_VILLAGER, blockPos.getX(), blockPos.getY(), blockPos.getZ(), 8, 0.0D, 0.5D, 0.0D, 0);
    }

    private <T extends Comparable<T>> BlockState copyProperty(Property<T> property, BlockState old, BlockState state) {
        return state.setValue(property, old.getValue(property));
    }
}
