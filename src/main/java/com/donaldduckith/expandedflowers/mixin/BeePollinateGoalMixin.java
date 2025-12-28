package com.donaldduckith.expandedflowers.mixin;

import com.donaldduckith.expandedflowers.access.BeeGoalAccess;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.world.entity.animal.Bee;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "net.minecraft.world.entity.animal.Bee$BeePollinateGoal")
public abstract class BeePollinateGoalMixin {
    @Final
    @Shadow(aliases = {"this$0", "field_20377"})
    Bee bee;

    @ModifyReturnValue(method = "isPollinating", at = @At(value = "RETURN"))
    private boolean expandedflowers$isPollinatingConvertibleFlower(boolean value) {
        return value || ((BeeGoalAccess)bee).expandedflowers$getConvertPlantGoal().isPollinating();
    }

    @Inject(method = "stopPollinating", at = @At(value = "TAIL"))
    private void expandedflowers$stopFlowerPollinating(CallbackInfo ci) {
        ((BeeGoalAccess)bee).expandedflowers$getConvertPlantGoal().stopPollinating();
    }
}
