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
<<<<<<< HEAD
                        output.accept(ModBlocks.DEAD_AGAPANTHUS);
                        output.accept(ModBlocks.WHITE_AGAPANTHUS);
                        output.accept(ModBlocks.GRAY_AGAPANTHUS);
                        output.accept(ModBlocks.ORANGE_AGAPANTHUS);
                        output.accept(ModBlocks.BLUE_AGAPANTHUS);
                        output.accept(ModBlocks.PURPLE_AGAPANTHUS);
                        output.accept(ModBlocks.MAGENTA_AGAPANTHUS);
                        output.accept(ModBlocks.PINK_AGAPANTHUS);

=======
>>>>>>> origin/master
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

<<<<<<< HEAD
                        output.accept(ModBlocks.HOLLYHOCK_BUSH);

                        output.accept(ModBlocks.WHITE_HYDRANGEA);
                        output.accept(ModBlocks.RED_HYDRANGEA);
                        output.accept(ModBlocks.YELLOW_HYDRANGEA);
                        output.accept(ModBlocks.LIME_HYDRANGEA);
                        output.accept(ModBlocks.LIGHT_BLUE_HYDRANGEA);
                        output.accept(ModBlocks.BLUE_HYDRANGEA);
                        output.accept(ModBlocks.PURPLE_HYDRANGEA);
                        output.accept(ModBlocks.MAGENTA_HYDRANGEA);
                        output.accept(ModBlocks.PINK_HYDRANGEA);

                        output.accept(ModBlocks.WHITE_LILAC);
                        output.accept(ModBlocks.PURPLE_LILAC);
                        output.accept(ModBlocks.PINK_LILAC);

                        output.accept(ModBlocks.WHITE_PEONY);
                        output.accept(ModBlocks.MAGENTA_PEONY);

                        output.accept(ModBlocks.ORANGE_POPPY);
                        output.accept(ModBlocks.YELLOW_POPPY);

                        output.accept(ModBlocks.WHITE_ROSE_BUSH);
                        output.accept(ModBlocks.LIGHT_GRAY_ROSE_BUSH);
                        output.accept(ModBlocks.BLACK_ROSE_BUSH);
                        output.accept(ModBlocks.ORANGE_ROSE_BUSH);
                        output.accept(ModBlocks.YELLOW_ROSE_BUSH);
                        output.accept(ModBlocks.LIME_ROSE_BUSH);
                        output.accept(ModBlocks.BLUE_ROSE_BUSH);
                        output.accept(ModBlocks.PURPLE_ROSE_BUSH);
                        output.accept(ModBlocks.MAGENTA_ROSE_BUSH);
                        output.accept(ModBlocks.PINK_ROSE_BUSH);

=======
>>>>>>> origin/master
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
