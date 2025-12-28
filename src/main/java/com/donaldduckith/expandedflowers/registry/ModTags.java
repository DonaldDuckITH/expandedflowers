package com.donaldduckith.expandedflowers.registry;

import com.donaldduckith.expandedflowers.ExpandedFlowers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> FLOWERING_LEAVES = createTag("flowering_leaves");
        public static final TagKey<Block> AZURE_BLUETS = createTag("azure_bluets");
        public static final TagKey<Block> LILACS = createTag("lilacs");
        public static final TagKey<Block> ORCHIDS = createTag("orchids");
        public static final TagKey<Block> OXEYE_DAISIES = createTag("oxeye_daisies");
        public static final TagKey<Block> PEONIES = createTag("peonies");
        public static final TagKey<Block> POPPIES = createTag("poppies");
        public static final TagKey<Block> ROSE_BUSHES = createTag("rose_bushes");
        public static final TagKey<Block> TULIPS = createTag("tulips");
        public static final TagKey<Block> CONVERTIBLE_PLANTS = createTag("convertible_flowers");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> SHORT_WHITE_FLOWERS = createItemTag("short_white_flowers");
        public static final TagKey<Item> SHORT_LIGHT_GRAY_FLOWERS = createItemTag("short_light_gray_flowers");
        public static final TagKey<Item> SHORT_GRAY_FLOWERS = createItemTag("short_gray_flowers");
        public static final TagKey<Item> SHORT_BLACK_FLOWERS = createItemTag("short_black_flowers");
        public static final TagKey<Item> SHORT_BROWN_FLOWERS = createItemTag("short_brown_flowers");
        public static final TagKey<Item> SHORT_RED_FLOWERS = createItemTag("short_red_flowers");
        public static final TagKey<Item> SHORT_ORANGE_FLOWERS = createItemTag("short_orange_flowers");
        public static final TagKey<Item> SHORT_YELLOW_FLOWERS = createItemTag("short_yellow_flowers");
        public static final TagKey<Item> SHORT_LIME_FLOWERS = createItemTag("short_lime_flowers");
        public static final TagKey<Item> SHORT_GREEN_FLOWERS = createItemTag("short_green_flowers");
        public static final TagKey<Item> SHORT_CYAN_FLOWERS = createItemTag("short_cyan_flowers");
        public static final TagKey<Item> SHORT_LIGHT_BLUE_FLOWERS = createItemTag("short_light_blue_flowers");
        public static final TagKey<Item> SHORT_BLUE_FLOWERS = createItemTag("short_blue_flowers");
        public static final TagKey<Item> SHORT_PURPLE_FLOWERS = createItemTag("short_purple_flowers");
        public static final TagKey<Item> SHORT_MAGENTA_FLOWERS = createItemTag("short_magenta_flowers");
        public static final TagKey<Item> SHORT_PINK_FLOWERS = createItemTag("short_pink_flowers");

        public static final TagKey<Item> TALL_WHITE_FLOWERS = createItemTag("tall_white_flowers");
        public static final TagKey<Item> TALL_LIGHT_GRAY_FLOWERS = createItemTag("tall_light_gray_flowers");
        public static final TagKey<Item> TALL_GRAY_FLOWERS = createItemTag("tall_gray_flowers");
        public static final TagKey<Item> TALL_BLACK_FLOWERS = createItemTag("tall_black_flowers");
        public static final TagKey<Item> TALL_BROWN_FLOWERS = createItemTag("tall_brown_flowers");
        public static final TagKey<Item> TALL_RED_FLOWERS = createItemTag("tall_red_flowers");
        public static final TagKey<Item> TALL_ORANGE_FLOWERS = createItemTag("tall_orange_flowers");
        public static final TagKey<Item> TALL_YELLOW_FLOWERS = createItemTag("tall_yellow_flowers");
        public static final TagKey<Item> TALL_LIME_FLOWERS = createItemTag("tall_lime_flowers");
        public static final TagKey<Item> TALL_GREEN_FLOWERS = createItemTag("tall_green_flowers");
        public static final TagKey<Item> TALL_CYAN_FLOWERS = createItemTag("tall_cyan_flowers");
        public static final TagKey<Item> TALL_LIGHT_BLUE_FLOWERS = createItemTag("tall_light_blue_flowers");
        public static final TagKey<Item> TALL_BLUE_FLOWERS = createItemTag("tall_blue_flowers");
        public static final TagKey<Item> TALL_PURPLE_FLOWERS = createItemTag("tall_purple_flowers");
        public static final TagKey<Item> TALL_MAGENTA_FLOWERS = createItemTag("tall_magenta_flowers");
        public static final TagKey<Item> TALL_PINK_FLOWERS = createItemTag("tall_pink_flowers");

        private static TagKey<Item> createItemTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, name));
        }
    }
}
