package com.donaldduckith.expandedflowers.entity.goal;

import com.donaldduckith.expandedflowers.mixin.BeeAccessor;
import com.donaldduckith.expandedflowers.mixin.MobAccessor;
import com.donaldduckith.expandedflowers.registry.pollination.PollinationInfo;
import com.donaldduckith.expandedflowers.registry.pollination.PollinationInfo.PollinationSet;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.Path;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.EnumSet;
import java.util.List;
import java.util.Optional;

public class ConvertPlantGoal extends Bee.BaseBeeGoal {
    private final Bee bee;
    @Nullable
    private BlockPos savedFlowerPos;
    @Nullable
    private Block savedPollenType;
    private static final int MIN_POLLINATION_TICKS = 400;
    private static final int MIN_FIND_FLOWER_RETRY_COOLDOWN = 20;
    private static final int MAX_FIND_FLOWER_RETRY_COOLDOWN = 60;
    private static final double ARRIVAL_THRESHOLD = 0.1D;
    private static final int POSITION_CHANGE_CHANCE = 25;
    private static final float SPEED_MODIFIER = 0.6F;
    private static final float HOVER_POS_OFFSET = 0.33333334F;
    private int successfulPollinatingTicks;
    private int lastSoundPlayedTick;
    private boolean pollinating;
    @Nullable
    private Vec3 hoverPos;
    private int pollinatingTicks;
    private static final int MAX_POLLINATING_TICKS = 600;
    private int remainingCooldownBeforeLocatingNewFlower;
    private Long2LongOpenHashMap unreachableFlowerCache = new Long2LongOpenHashMap();

    public ConvertPlantGoal(Bee bee) {
        bee.super();
        this.bee = bee;
        remainingCooldownBeforeLocatingNewFlower = Mth.nextInt(bee.getRandom(), MIN_FIND_FLOWER_RETRY_COOLDOWN, MAX_FIND_FLOWER_RETRY_COOLDOWN);
        this.setFlags(EnumSet.of(Flag.MOVE));
    }

    @Override
    public boolean canBeeUse() {
        if (this.remainingCooldownBeforeLocatingNewFlower > 0) {
            return false;
        } else if (bee.level().isRaining()) {
            return false;
        } else {
            Optional<BlockPos> optional = this.findNearbyConvertiblePlant();
            if (optional.isPresent()) {
                this.savedFlowerPos = optional.get();
                ((MobAccessor)this.bee).expandedflowers$getNavigation()
                        .moveTo(this.savedFlowerPos.getX() + 0.5, this.savedFlowerPos.getY() + 0.5, this.savedFlowerPos.getZ() + 0.5, 1.2F);
                return true;
            } else {
                this.remainingCooldownBeforeLocatingNewFlower = Mth.nextInt(bee.getRandom(), 20, 60);
                return false;
            }
        }
    }

    private boolean hasPollinatedLongEnough() {
        return this.successfulPollinatingTicks > MIN_POLLINATION_TICKS;
    }

    public boolean isPollinating() {
        return this.pollinating;
    }

    public void stopPollinating() {
        this.pollinating = false;
    }

    @Override
    public boolean canUse() {
        return false;
    }

    @Override
    public void tick() {

    }

    public void tickCooldown() {
        if (this.remainingCooldownBeforeLocatingNewFlower > 0) {
            --this.remainingCooldownBeforeLocatingNewFlower;
        }
    }

    public boolean requiresUpdateEveryTick() {
        return true;
    }

    public void start() {
        this.successfulPollinatingTicks = 0;
        this.pollinatingTicks = 0;
        this.lastSoundPlayedTick = 0;
        this.pollinating = true;
        bee.resetTicksWithoutNectarSinceExitingHive();
    }

    public void stop() {
        if (this.hasPollinatedLongEnough()) {
            ((BeeAccessor)bee).expandedflowers$invokeSetHasNectar(true);
            this.setSavedFlowerPos(this.bee.getX() - 0.5, this.bee.getY() - 0.5, this.bee.getZ() - 0.5);
            this.setSavedPollenType(this.bee.level().getBlockState(this.getSavedFlowerPos()).getBlock());
        }
    }

    public Optional<BlockPos> findNearbyConvertiblePlant() {
        Iterable<BlockPos> iterable = BlockPos.withinManhattan(this.bee.blockPosition(), 5, 5, 5);
        Long2LongOpenHashMap long2longopenhashmap = new Long2LongOpenHashMap();

        for (BlockPos blockpos : iterable) {
            long i = this.unreachableFlowerCache.getOrDefault(blockpos.asLong(), Long.MIN_VALUE);
            if (this.bee.level().getGameTime() < i) {
                long2longopenhashmap.put(blockpos.asLong(), i);
            } else if (this.isValidPlantForConversion(this.bee.level().getBlockState(blockpos))) {
                Path path = ((MobAccessor)this.bee).expandedflowers$getNavigation().createPath(blockpos, 1);
                if (path != null && path.canReach()) {
                    return Optional.of(blockpos);
                }
                long2longopenhashmap.put(blockpos.asLong(), this.bee.level().getGameTime() + 600L);
            }
        }
        this.unreachableFlowerCache = long2longopenhashmap;
        return Optional.empty();
    }

    public void convertPlant(BlockPos blockpos, Block block) {
        this.bee.level().setBlock(blockpos, block.defaultBlockState(), 3);
    }

    public boolean isValidPlantForConversion(BlockState state) {
        Holder<Block> holder = state.getBlockHolder();
        PollinationInfo data = holder.getData(PollinationInfo.POLLINATION_INFO);
        List<PollinationSet> sets = data.sets();
        for (PollinationSet set : sets) {
            if (set.pollinator().equals(this.getSavedPollenType())) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public Block getSavedPollenType() {
        return this.savedPollenType;
    }

    public boolean hasSavedPollenType() {
        return this.savedPollenType != null;
    }

    public void setSavedPollenType(@Nullable Block savedPollenType) {
        this.savedPollenType = savedPollenType;
    }

    public @Nullable BlockPos getSavedFlowerPos() {
        return this.savedFlowerPos;
    }

    public void setSavedFlowerPos(double x, double y, double z) {
        this.savedFlowerPos = BlockPos.containing(x, y, z);
    }

    @Override
    public boolean canBeeContinueToUse() {
        return false;
    }
}
