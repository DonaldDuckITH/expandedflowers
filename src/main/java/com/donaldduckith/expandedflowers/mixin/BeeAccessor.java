package com.donaldduckith.expandedflowers.mixin;

import net.minecraft.world.entity.animal.Bee;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Bee.class)
public interface BeeAccessor {
    @Invoker("setHasNectar")
    void expandedflowers$invokeSetHasNectar(boolean value);

    @Accessor("ticksWithoutNectarSinceExitingHive")
    int expandedflowers$getTicksWithoutNectarSinceExitingHive();
}
