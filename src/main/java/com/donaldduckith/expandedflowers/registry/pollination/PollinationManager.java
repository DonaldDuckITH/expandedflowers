package com.donaldduckith.expandedflowers.registry.pollination;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;
import java.util.Map;

public interface PollinationManager {
    static PollinationManager get() {
        return PollinationManagerImpl.INSTANCE;
    }

    boolean tryConversion(ServerLevel level, BlockPos blockPos);

    boolean canConvert(ServerLevel level, Block block);
}
