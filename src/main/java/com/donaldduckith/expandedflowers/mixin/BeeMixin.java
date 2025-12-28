package com.donaldduckith.expandedflowers.mixin;

import com.donaldduckith.expandedflowers.access.BeeGoalAccess;
import com.donaldduckith.expandedflowers.entity.goal.ConvertPlantGoal;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.goal.GoalSelector;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Bee.class)
public abstract class BeeMixin extends Animal implements BeeGoalAccess {
    @Nullable @Unique private ConvertPlantGoal expandedflowers$convertPlantGoal;

    @Shadow
    public abstract GoalSelector getGoalSelector();

    protected BeeMixin(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    @Inject(method = "registerGoals", at = @At(value = "TAIL"))
    private void expandedflowers$addConvertPlantGoals(CallbackInfo ci) {
        ConvertPlantGoal convertGoal = new ConvertPlantGoal((Bee)(Object)this);
        this.getGoalSelector().addGoal(4, convertGoal);
        ((BeeGoalAccess)this).expandedflowers$setConvertPlantGoal(convertGoal);
    }

    public ConvertPlantGoal expandedflowers$getConvertPlantGoal () {
        return this.expandedflowers$convertPlantGoal;
    }

    @Override
    public void expandedflowers$setConvertPlantGoal(ConvertPlantGoal goal) {
        this.expandedflowers$convertPlantGoal = goal;
    }
}
