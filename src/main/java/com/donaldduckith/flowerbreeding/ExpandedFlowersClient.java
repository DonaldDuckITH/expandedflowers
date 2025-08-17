package com.donaldduckith.flowerbreeding;

import com.donaldduckith.expandedflowers.registry.ModBlocks;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.GrassColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

import javax.annotation.processing.SupportedSourceVersion;

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
