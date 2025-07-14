package com.donaldduckith.expandedflowers.registry;

import com.donaldduckith.flowerbreeding.ExpandedFlowers;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExpandedFlowers.MODID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExpandedFlowers.MODID);

    public static final Supplier<CreativeModeTab> EXPANDED_FLOWERS_TAB = CREATIVE_MODE_TAB.register("expandedflowers_tab",
            () -> new CreativeModeTab.Builder(CreativeModeTab.Row.TOP, 1)
                    .icon(() -> new ItemStack(ModBlocks.MAGENTA_BOUGAINVILLEA))
                    .title(Component.translatable("creative_tab.expandedflowers.items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.BOTTLEBRUSH_LEAVES);
                        output.accept(ModBlocks.WHITE_BOTTLEBRUSH_LEAVES);
                        output.accept(ModBlocks.RED_BOTTLEBRUSH_LEAVES);
                        output.accept(ModBlocks.ORANGE_BOTTLEBRUSH_LEAVES);
                        output.accept(ModBlocks.YELLOW_BOTTLEBRUSH_LEAVES);
                        output.accept(ModBlocks.MAGENTA_BOTTLEBRUSH_LEAVES);
                        output.accept(ModBlocks.PINK_BOTTLEBRUSH_LEAVES);
                        output.accept(ModBlocks.WHITE_BOTTLEBRUSH_END);
                        output.accept(ModBlocks.RED_BOTTLEBRUSH_END);
                        output.accept(ModBlocks.ORANGE_BOTTLEBRUSH_END);
                        output.accept(ModBlocks.YELLOW_BOTTLEBRUSH_END);
                        output.accept(ModBlocks.MAGENTA_BOTTLEBRUSH_END);
                        output.accept(ModBlocks.PINK_BOTTLEBRUSH_END);

                        output.accept(ModBlocks.BOUGAINVILLEA_LEAVES);
                        output.accept(ModBlocks.RED_BOUGAINVILLEA);
                        output.accept(ModBlocks.ORANGE_BOUGAINVILLEA);
                        output.accept(ModBlocks.YELLOW_BOUGAINVILLEA);
                        output.accept(ModBlocks.PURPLE_BOUGAINVILLEA);
                        output.accept(ModBlocks.MAGENTA_BOUGAINVILLEA);
                        output.accept(ModBlocks.PINK_BOUGAINVILLEA);

                        output.accept(ModBlocks.CLEMATIS_VINE);
                        output.accept(ModBlocks.WHITE_CLEMATIS);
                        output.accept(ModBlocks.RED_CLEMATIS);
                        output.accept(ModBlocks.YELLOW_CLEMATIS);
                        output.accept(ModBlocks.BLUE_CLEMATIS);
                        output.accept(ModBlocks.PURPLE_CLEMATIS);
                        output.accept(ModBlocks.MAGENTA_CLEMATIS);
                        output.accept(ModBlocks.PINK_CLEMATIS);

                        output.accept(ModBlocks.WHITE_WATTLE);
                        output.accept(ModBlocks.RED_WATTLE);
                        output.accept(ModBlocks.ORANGE_WATTLE);
                        output.accept(ModBlocks.YELLOW_WATTLE);
                        output.accept(ModBlocks.WHITE_WATTLE_LEAVES);
                        output.accept(ModBlocks.RED_WATTLE_LEAVES);
                        output.accept(ModBlocks.ORANGE_WATTLE_LEAVES);
                        output.accept(ModBlocks.YELLOW_WATTLE_LEAVES);
                    }).build());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
