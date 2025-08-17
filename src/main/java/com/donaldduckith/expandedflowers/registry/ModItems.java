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
                    .icon(() -> new ItemStack(ModBlocks.RED_WARATAH))
                    .title(Component.translatable("creative_tab.expandedflowers.items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.DEAD_AGAPANTHUS);
                        output.accept(ModBlocks.WHITE_AGAPANTHUS);
                        output.accept(ModBlocks.GRAY_AGAPANTHUS);
                        output.accept(ModBlocks.ORANGE_AGAPANTHUS);
                        output.accept(ModBlocks.BLUE_AGAPANTHUS);
                        output.accept(ModBlocks.PURPLE_AGAPANTHUS);
                        output.accept(ModBlocks.MAGENTA_AGAPANTHUS);
                        output.accept(ModBlocks.PINK_AGAPANTHUS);

                        output.accept(ModBlocks.WHITE_BIRD_OF_PARADISE);
                        output.accept(ModBlocks.ORANGE_BIRD_OF_PARADISE);
                        output.accept(ModBlocks.YELLOW_BIRD_OF_PARADISE);
                        output.accept(ModBlocks.MAGENTA_BIRD_OF_PARADISE);

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

                        output.accept(ModBlocks.WHITE_CHRYSANTHEMUM);
                        output.accept(ModBlocks.BLACK_CHRYSANTHEMUM);
                        output.accept(ModBlocks.RED_CHRYSANTHEMUM);
                        output.accept(ModBlocks.ORANGE_CHRYSANTHEMUM);
                        output.accept(ModBlocks.YELLOW_CHRYSANTHEMUM);
                        output.accept(ModBlocks.LIME_CHRYSANTHEMUM);
                        output.accept(ModBlocks.GREEN_CHRYSANTHEMUM);
                        output.accept(ModBlocks.LIGHT_BLUE_CHRYSANTHEMUM);
                        output.accept(ModBlocks.BLUE_CHRYSANTHEMUM);
                        output.accept(ModBlocks.PURPLE_CHRYSANTHEMUM);
                        output.accept(ModBlocks.MAGENTA_CHRYSANTHEMUM);
                        output.accept(ModBlocks.PINK_CHRYSANTHEMUM);

                        output.accept(ModBlocks.CLEMATIS_VINE);
                        output.accept(ModBlocks.WHITE_CLEMATIS);
                        output.accept(ModBlocks.RED_CLEMATIS);
                        output.accept(ModBlocks.YELLOW_CLEMATIS);
                        output.accept(ModBlocks.BLUE_CLEMATIS);
                        output.accept(ModBlocks.PURPLE_CLEMATIS);
                        output.accept(ModBlocks.MAGENTA_CLEMATIS);
                        output.accept(ModBlocks.PINK_CLEMATIS);

                        output.accept(ModBlocks.FOXGLOVE_BUSH);
                        output.accept(ModBlocks.WHITE_FOXGLOVE);
                        output.accept(ModBlocks.YELLOW_FOXGLOVE);
                        output.accept(ModBlocks.BLUE_FOXGLOVE);
                        output.accept(ModBlocks.PURPLE_FOXGLOVE);
                        output.accept(ModBlocks.MAGENTA_FOXGLOVE);
                        output.accept(ModBlocks.PINK_FOXGLOVE);

                        output.accept(ModBlocks.WHITE_GREVILLEA);
                        output.accept(ModBlocks.LIGHT_GRAY_GREVILLEA);
                        output.accept(ModBlocks.GRAY_GREVILLEA);
                        output.accept(ModBlocks.BLACK_GREVILLEA);
                        output.accept(ModBlocks.RED_GREVILLEA);
                        output.accept(ModBlocks.ORANGE_GREVILLEA);
                        output.accept(ModBlocks.YELLOW_GREVILLEA);
                        output.accept(ModBlocks.MAGENTA_GREVILLEA);

                        output.accept(ModBlocks.HOLLYHOCK_BUSH);
                        output.accept(ModBlocks.WHITE_HOLLYHOCK);

                        output.accept(ModBlocks.WHITE_HELLEBORE);
                        output.accept(ModBlocks.BLACK_HELLEBORE);
                        output.accept(ModBlocks.RED_HELLEBORE);
                        output.accept(ModBlocks.YELLOW_HELLEBORE);
                        output.accept(ModBlocks.LIME_HELLEBORE);
                        output.accept(ModBlocks.PURPLE_HELLEBORE);
                        output.accept(ModBlocks.MAGENTA_HELLEBORE);
                        output.accept(ModBlocks.PINK_HELLEBORE);

                        output.accept(ModBlocks.WHITE_HYDRANGEA);
                        output.accept(ModBlocks.RED_HYDRANGEA);
                        output.accept(ModBlocks.YELLOW_HYDRANGEA);
                        output.accept(ModBlocks.LIME_HYDRANGEA);
                        output.accept(ModBlocks.LIGHT_BLUE_HYDRANGEA);
                        output.accept(ModBlocks.BLUE_HYDRANGEA);
                        output.accept(ModBlocks.PURPLE_HYDRANGEA);
                        output.accept(ModBlocks.MAGENTA_HYDRANGEA);
                        output.accept(ModBlocks.PINK_HYDRANGEA);

                        output.accept(ModBlocks.WHITE_PANSY);
                        output.accept(ModBlocks.BLACK_PANSY);
                        output.accept(ModBlocks.BROWN_PANSY);
                        output.accept(ModBlocks.RED_PANSY);
                        output.accept(ModBlocks.ORANGE_PANSY);
                        output.accept(ModBlocks.YELLOW_PANSY);
                        output.accept(ModBlocks.BLUE_PANSY);
                        output.accept(ModBlocks.PURPLE_PANSY);
                        output.accept(ModBlocks.MAGENTA_PANSY);
                        output.accept(ModBlocks.PINK_PANSY);

                        output.accept(ModBlocks.ROSEMARY_BUSH);
                        output.accept(ModBlocks.WHITE_ROSEMARY);
                        output.accept(ModBlocks.PURPLE_ROSEMARY);
                        output.accept(ModBlocks.PINK_ROSEMARY);

                        output.accept(ModBlocks.WHITE_WARATAH);
                        output.accept(ModBlocks.RED_WARATAH);
                        output.accept(ModBlocks.YELLOW_WARATAH);
                        output.accept(ModBlocks.MAGENTA_WARATAH);
                        output.accept(ModBlocks.PINK_WARATAH);

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
