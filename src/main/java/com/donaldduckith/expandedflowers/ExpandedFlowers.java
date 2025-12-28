package com.donaldduckith.expandedflowers;

import com.donaldduckith.expandedflowers.registry.ModBlocks;
import com.donaldduckith.expandedflowers.registry.ModDataComponents;
import com.donaldduckith.expandedflowers.registry.ModItems;
import com.donaldduckith.expandedflowers.registry.pollination.PollinationInfo;
import com.donaldduckith.expandedflowers.worldgen.ModTreeDecoratorType;
import com.donaldduckith.expandedflowers.worldgen.ModVineDecorator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.datamaps.RegisterDataMapTypesEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(ExpandedFlowers.MODID)
public class ExpandedFlowers {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "expandedflowers";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public ExpandedFlowers(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModDataComponents.register(modEventBus);

        ModTreeDecoratorType.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            insertAfter(event, Items.POPPY.getDefaultInstance(), ModBlocks.WHITE_POPPY.asItem().getDefaultInstance(), ModBlocks.ORANGE_POPPY.asItem().getDefaultInstance(),
                    ModBlocks.YELLOW_POPPY.asItem().getDefaultInstance());
            insertAfter(event, Items.PEONY.getDefaultInstance(), ModBlocks.WHITE_PEONY.asItem().getDefaultInstance(), ModBlocks.MAGENTA_PEONY.asItem().getDefaultInstance());
            insertAfter(event, Items.ROSE_BUSH.getDefaultInstance(), ModBlocks.WHITE_ROSE_BUSH.asItem().getDefaultInstance(), ModBlocks.LIGHT_GRAY_ROSE_BUSH.asItem().getDefaultInstance(),
                    ModBlocks.BLACK_ROSE_BUSH.asItem().getDefaultInstance(), ModBlocks.ORANGE_ROSE_BUSH.asItem().getDefaultInstance(), ModBlocks.YELLOW_ROSE_BUSH.asItem().getDefaultInstance(),
                    ModBlocks.LIME_ROSE_BUSH.asItem().getDefaultInstance(), ModBlocks.BLUE_ROSE_BUSH.asItem().getDefaultInstance(), ModBlocks.PURPLE_ROSE_BUSH.asItem().getDefaultInstance(),
                    ModBlocks.MAGENTA_ROSE_BUSH.asItem().getDefaultInstance(), ModBlocks.PINK_ROSE_BUSH.asItem().getDefaultInstance());
            insertAfter(event, Items.OXEYE_DAISY.getDefaultInstance(), ModBlocks.CYAN_OXEYE_DAISY.asItem().getDefaultInstance());
            insertAfter(event, Items.WHITE_TULIP.getDefaultInstance(), ModBlocks.BLACK_TULIP.asItem().getDefaultInstance());
            insertAfter(event, Items.ORANGE_TULIP.getDefaultInstance(), ModBlocks.YELLOW_TULIP.asItem().getDefaultInstance());
            insertBefore(event, Items.PINK_TULIP.getDefaultInstance(), ModBlocks.MAGENTA_TULIP.asItem().getDefaultInstance(), ModBlocks.PURPLE_TULIP.asItem().getDefaultInstance());
            insertAfter(event, Items.BLUE_ORCHID.getDefaultInstance(), ModBlocks.WHITE_ORCHID.asItem().getDefaultInstance(), ModBlocks.ORANGE_ORCHID.asItem().getDefaultInstance(),
                    ModBlocks.YELLOW_ORCHID.asItem().getDefaultInstance(), ModBlocks.CYAN_ORCHID.asItem().getDefaultInstance(), ModBlocks.PURPLE_ORCHID.asItem().getDefaultInstance(),
                    ModBlocks.MAGENTA_ORCHID.asItem().getDefaultInstance(), ModBlocks.PINK_ORCHID.asItem().getDefaultInstance());
            insertAfter(event, Items.LILAC.getDefaultInstance(), ModBlocks.WHITE_LILAC.asItem().getDefaultInstance(), ModBlocks.PURPLE_LILAC.asItem().getDefaultInstance(),
                    ModBlocks.PINK_LILAC.asItem().getDefaultInstance());
            insertAfter(event, Items.AZURE_BLUET.getDefaultInstance(), ModBlocks.LIGHT_BLUE_AZURE_BLUET.asItem().getDefaultInstance());
        }
    }

    private static void insertAfter(BuildCreativeModeTabContentsEvent event, ItemStack startItem, ItemStack... itemsToAdd) {
        ItemStack previousItem = startItem;
        for (ItemStack stack : itemsToAdd) {
            event.insertAfter(previousItem, stack, CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            previousItem = stack;
        }
    }
    private static void insertBefore(BuildCreativeModeTabContentsEvent event, ItemStack endItem, ItemStack... itemsToAdd) {
        ItemStack nextItem = endItem;
        for (ItemStack stack : itemsToAdd) {
            event.insertBefore(nextItem, stack, CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            nextItem = stack;
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    public static String savedDataName(String suffix) {
        return MODID + "_" + suffix;
    }
}
