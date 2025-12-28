package com.donaldduckith.expandedflowers;

import com.donaldduckith.expandedflowers.datagen.*;
import com.donaldduckith.expandedflowers.registry.ModBlocks;
import com.donaldduckith.expandedflowers.registry.pollination.PollinationInfo;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = ExpandedFlowers.MODID, dist = Dist.CLIENT)
// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
@EventBusSubscriber(modid = ExpandedFlowers.MODID, value = Dist.CLIENT)
public class ExpandedFlowersClient {
    public ExpandedFlowersClient(ModContainer container) {
        // Allows NeoForge to create a config screen for this mod's configs.
        // The config screen is accessed by going to the Mods screen > clicking on your mod > clicking on config.
        // Do not forget to add translations for your config options to the en_us.json file.
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));

        BlockTagsProvider blockTagsProvider = new ModBlockTagProvider(packOutput, lookupProvider);
        ItemTagsProvider itemTagsProvider = new ModItemTagProvider(packOutput, lookupProvider);
        generator.addProvider(true, blockTagsProvider);
        generator.addProvider(true, itemTagsProvider);
        generator.addProvider(true, new ModRecipeProvider.Runner(packOutput, lookupProvider));

        generator.addProvider(true, new ModDatapackProvider(packOutput, lookupProvider));
        event.createProvider(ModDataMapProvider::new);
    }

    @SubscribeEvent
    public static void onClientSetup(RegisterColorHandlersEvent.Block event) {
        event.register((blockState, blockAndTintGetter, pos, tintIndex) -> {
            if (tintIndex != 0) {
                return blockAndTintGetter != null && pos != null ? BiomeColors.getAverageGrassColor(blockAndTintGetter, pos) : GrassColor.getDefaultColor();
            } else {
                return -1;
            }
        }, ModBlocks.WHITE_PANSY.get(), ModBlocks.BLACK_PANSY.get(), ModBlocks.BROWN_PANSY.get(), ModBlocks.RED_PANSY.get(), ModBlocks.ORANGE_PANSY.get(),
                ModBlocks.YELLOW_PANSY.get(), ModBlocks.BLUE_PANSY.get(), ModBlocks.PURPLE_PANSY.get(), ModBlocks.MAGENTA_PANSY.get(), ModBlocks.PINK_PANSY.get());
    }
}
