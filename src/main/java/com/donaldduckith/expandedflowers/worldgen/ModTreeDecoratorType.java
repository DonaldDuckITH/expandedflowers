package com.donaldduckith.expandedflowers.worldgen;

import com.donaldduckith.expandedflowers.ExpandedFlowers;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModTreeDecoratorType<T extends ModVineDecorator> {
    public static final DeferredRegister<TreeDecoratorType<?>> MOD_TREE_DECORATOR_TYPE = DeferredRegister.create(Registries.TREE_DECORATOR_TYPE, ExpandedFlowers.MODID);

    public static final Supplier<TreeDecoratorType<?>> MOD_VINE = MOD_TREE_DECORATOR_TYPE.register("mod_vine", () -> new TreeDecoratorType<>(ModVineDecorator.CODEC));
    public static final Supplier<TreeDecoratorType<?>> MOD_HANGING_VINE = MOD_TREE_DECORATOR_TYPE.register("mod_hanging_vine", () -> new TreeDecoratorType<>(ModHangingVineDecorator.CODEC));

    public static void register(IEventBus eventBus) {MOD_TREE_DECORATOR_TYPE.register(eventBus);}
}
