package com.donaldduckith.expandedflowers.datagen;

import com.donaldduckith.expandedflowers.ExpandedFlowers;
import com.donaldduckith.expandedflowers.registry.ModBlocks;
import com.donaldduckith.expandedflowers.registry.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, ExpandedFlowers.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.SHORT_WHITE_FLOWERS)
                .add(ModBlocks.WHITE_ARCTOTIS.asItem())
                .add(ModBlocks.WHITE_BABIANA.asItem())
                .add(ModBlocks.WHITE_BIRD_OF_PARADISE.asItem())
                .add(ModBlocks.WHITE_BOTTLEBRUSH.asItem())
                .add(ModBlocks.WHITE_BOTTLEBRUSH_END.asItem())
                .add(ModBlocks.WHITE_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.WHITE_CLEMATIS.asItem())
                .add(ModBlocks.WHITE_GREVILLEA.asItem())
                .add(ModBlocks.WHITE_HELLEBORE.asItem())
                .add(ModBlocks.WHITE_HYDRANGEA.asItem())
                .add(ModBlocks.WHITE_ORCHID.asItem())
                .add(ModBlocks.WHITE_PANSY.asItem())
                .add(ModBlocks.WHITE_POPPY.asItem())
                .add(ModBlocks.WHITE_ROSEMARY.asItem())
                .add(ModBlocks.WHITE_WARATAH.asItem())
                .add(ModBlocks.WHITE_WATTLE_VINE.asItem());

        tag(ModTags.Items.SHORT_LIGHT_GRAY_FLOWERS)
                .add(ModBlocks.LIGHT_GRAY_GREVILLEA.asItem());

        tag(ModTags.Items.SHORT_GRAY_FLOWERS)
                .add(ModBlocks.GRAY_GREVILLEA.asItem());

        tag(ModTags.Items.SHORT_BLACK_FLOWERS)
                .add(ModBlocks.BLACK_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.BLACK_GREVILLEA.asItem())
                .add(ModBlocks.BLACK_HELLEBORE.asItem())
                .add(ModBlocks.BLACK_PANSY.asItem())
                .add(ModBlocks.BLACK_TULIP.asItem());

        tag(ModTags.Items.SHORT_BROWN_FLOWERS)
                .add(ModBlocks.BROWN_PANSY.asItem());

        tag(ModTags.Items.SHORT_RED_FLOWERS)
                .add(ModBlocks.RED_ARCTOTIS.asItem())
                .add(ModBlocks.RED_BOTTLEBRUSH.asItem())
                .add(ModBlocks.RED_BOTTLEBRUSH_END.asItem())
                .add(ModBlocks.RED_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.RED_CLEMATIS.asItem())
                .add(ModBlocks.RED_GREVILLEA.asItem())
                .add(ModBlocks.RED_HELLEBORE.asItem())
                .add(ModBlocks.RED_HYDRANGEA.asItem())
                .add(ModBlocks.RED_PANSY.asItem())
                .add(ModBlocks.RED_WARATAH.asItem())
                .add(ModBlocks.RED_WATTLE_VINE.asItem());

        tag(ModTags.Items.SHORT_ORANGE_FLOWERS)
                .add(ModBlocks.ORANGE_ARCTOTIS.asItem())
                .add(ModBlocks.ORANGE_BIRD_OF_PARADISE.asItem())
                .add(ModBlocks.ORANGE_BOTTLEBRUSH.asItem())
                .add(ModBlocks.ORANGE_BOTTLEBRUSH_END.asItem())
                .add(ModBlocks.ORANGE_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.ORANGE_GREVILLEA.asItem())
                .add(ModBlocks.ORANGE_ORCHID.asItem())
                .add(ModBlocks.ORANGE_PANSY.asItem())
                .add(ModBlocks.ORANGE_POPPY.asItem())
                .add(ModBlocks.ORANGE_WATTLE_VINE.asItem());

        tag(ModTags.Items.SHORT_YELLOW_FLOWERS)
                .add(ModBlocks.YELLOW_ARCTOTIS.asItem())
                .add(ModBlocks.YELLOW_BIRD_OF_PARADISE.asItem())
                .add(ModBlocks.YELLOW_BOTTLEBRUSH.asItem())
                .add(ModBlocks.YELLOW_BOTTLEBRUSH_END.asItem())
                .add(ModBlocks.YELLOW_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.YELLOW_CLEMATIS.asItem())
                .add(ModBlocks.YELLOW_GREVILLEA.asItem())
                .add(ModBlocks.YELLOW_HELLEBORE.asItem())
                .add(ModBlocks.YELLOW_HYDRANGEA.asItem())
                .add(ModBlocks.YELLOW_ORCHID.asItem())
                .add(ModBlocks.YELLOW_PANSY.asItem())
                .add(ModBlocks.YELLOW_POPPY.asItem())
                .add(ModBlocks.YELLOW_TULIP.asItem())
                .add(ModBlocks.YELLOW_WARATAH.asItem())
                .add(ModBlocks.YELLOW_WATTLE_VINE.asItem());

        tag(ModTags.Items.SHORT_LIME_FLOWERS)
                .add(ModBlocks.LIME_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.LIME_HELLEBORE.asItem())
                .add(ModBlocks.LIME_HYDRANGEA.asItem());

        tag(ModTags.Items.SHORT_GREEN_FLOWERS)
                .add(ModBlocks.GREEN_CHRYSANTHEMUM.asItem());

        tag(ModTags.Items.SHORT_CYAN_FLOWERS)
                .add(ModBlocks.CYAN_ORCHID.asItem())
                .add(ModBlocks.CYAN_OXEYE_DAISY.asItem());

        tag(ModTags.Items.SHORT_LIGHT_BLUE_FLOWERS)
                .add(ModBlocks.LIGHT_BLUE_AZURE_BLUET.asItem())
                .add(ModBlocks.LIGHT_BLUE_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.LIGHT_BLUE_HYDRANGEA.asItem());

        tag(ModTags.Items.SHORT_BLUE_FLOWERS)
                .add(ModBlocks.BLUE_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.BLUE_CLEMATIS.asItem())
                .add(ModBlocks.BLUE_HYDRANGEA.asItem())
                .add(ModBlocks.BLUE_PANSY.asItem());

        tag(ModTags.Items.SHORT_PURPLE_FLOWERS)
                .add(ModBlocks.PURPLE_BABIANA.asItem())
                .add(ModBlocks.PURPLE_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.PURPLE_CLEMATIS.asItem())
                .add(ModBlocks.PURPLE_HELLEBORE.asItem())
                .add(ModBlocks.PURPLE_HYDRANGEA.asItem())
                .add(ModBlocks.PURPLE_ORCHID.asItem())
                .add(ModBlocks.PURPLE_PANSY.asItem())
                .add(ModBlocks.PURPLE_ROSEMARY.asItem())
                .add(ModBlocks.PURPLE_TULIP.asItem());

        tag(ModTags.Items.SHORT_MAGENTA_FLOWERS)
                .add(ModBlocks.MAGENTA_ARCTOTIS.asItem())
                .add(ModBlocks.MAGENTA_BABIANA.asItem())
                .add(ModBlocks.MAGENTA_BIRD_OF_PARADISE.asItem())
                .add(ModBlocks.MAGENTA_BOTTLEBRUSH.asItem())
                .add(ModBlocks.MAGENTA_BOTTLEBRUSH_END.asItem())
                .add(ModBlocks.MAGENTA_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.MAGENTA_CLEMATIS.asItem())
                .add(ModBlocks.MAGENTA_GREVILLEA.asItem())
                .add(ModBlocks.MAGENTA_HELLEBORE.asItem())
                .add(ModBlocks.MAGENTA_HYDRANGEA.asItem())
                .add(ModBlocks.MAGENTA_ORCHID.asItem())
                .add(ModBlocks.MAGENTA_PANSY.asItem())
                .add(ModBlocks.MAGENTA_TULIP.asItem())
                .add(ModBlocks.MAGENTA_WARATAH.asItem());

        tag(ModTags.Items.SHORT_PINK_FLOWERS)
                .add(ModBlocks.PINK_ARCTOTIS.asItem())
                .add(ModBlocks.PINK_BABIANA.asItem())
                .add(ModBlocks.PINK_BOTTLEBRUSH.asItem())
                .add(ModBlocks.PINK_BOTTLEBRUSH_END.asItem())
                .add(ModBlocks.PINK_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.PINK_CLEMATIS.asItem())
                .add(ModBlocks.PINK_HELLEBORE.asItem())
                .add(ModBlocks.PINK_HYDRANGEA.asItem())
                .add(ModBlocks.PINK_ORCHID.asItem())
                .add(ModBlocks.PINK_PANSY.asItem())
                .add(ModBlocks.PINK_ROSEMARY.asItem())
                .add(ModBlocks.PINK_WARATAH.asItem());

        tag(ModTags.Items.TALL_WHITE_FLOWERS)
                .add(ModBlocks.WHITE_AGAPANTHUS.asItem())
                .add(ModBlocks.WHITE_FOXGLOVE.asItem())
                .add(ModBlocks.WHITE_HOLLYHOCK.asItem())
                .add(ModBlocks.WHITE_LILAC.asItem())
                .add(ModBlocks.WHITE_PEONY.asItem())
                .add(ModBlocks.WHITE_ROSE_BUSH.asItem());

        tag(ModTags.Items.TALL_LIGHT_GRAY_FLOWERS)
                .add(ModBlocks.LIGHT_GRAY_ROSE_BUSH.asItem());

        tag(ModTags.Items.TALL_GRAY_FLOWERS)
                .add(ModBlocks.GRAY_AGAPANTHUS.asItem());

        tag(ModTags.Items.TALL_BLACK_FLOWERS)
                .add(ModBlocks.BLACK_HOLLYHOCK.asItem())
                .add(ModBlocks.BLACK_ROSE_BUSH.asItem());

        tag(ModTags.Items.TALL_BROWN_FLOWERS);

        tag(ModTags.Items.TALL_RED_FLOWERS)
                .add(ModBlocks.RED_HOLLYHOCK.asItem());

        tag(ModTags.Items.TALL_ORANGE_FLOWERS)
                .add(ModBlocks.ORANGE_AGAPANTHUS.asItem())
                .add(ModBlocks.ORANGE_ROSE_BUSH.asItem());

        tag(ModTags.Items.TALL_YELLOW_FLOWERS)
                .add(ModBlocks.YELLOW_FOXGLOVE.asItem())
                .add(ModBlocks.YELLOW_HOLLYHOCK.asItem())
                .add(ModBlocks.YELLOW_ROSE_BUSH.asItem());

        tag(ModTags.Items.TALL_LIME_FLOWERS)
                .add(ModBlocks.LIME_ROSE_BUSH.asItem());

        tag(ModTags.Items.TALL_GREEN_FLOWERS);

        tag(ModTags.Items.TALL_CYAN_FLOWERS);

        tag(ModTags.Items.TALL_LIGHT_BLUE_FLOWERS);

        tag(ModTags.Items.TALL_BLUE_FLOWERS)
                .add(ModBlocks.BLUE_AGAPANTHUS.asItem())
                .add(ModBlocks.BLUE_FOXGLOVE.asItem())
                .add(ModBlocks.BLUE_ROSE_BUSH.asItem());

        tag(ModTags.Items.TALL_PURPLE_FLOWERS)
                .add(ModBlocks.PURPLE_AGAPANTHUS.asItem())
                .add(ModBlocks.PURPLE_FOXGLOVE.asItem())
                .add(ModBlocks.PURPLE_LILAC.asItem())
                .add(ModBlocks.PURPLE_ROSE_BUSH.asItem());

        tag(ModTags.Items.TALL_MAGENTA_FLOWERS)
                .add(ModBlocks.MAGENTA_AGAPANTHUS.asItem())
                .add(ModBlocks.MAGENTA_FOXGLOVE.asItem())
                .add(ModBlocks.MAGENTA_HOLLYHOCK.asItem())
                .add(ModBlocks.MAGENTA_PEONY.asItem())
                .add(ModBlocks.MAGENTA_ROSE_BUSH.asItem());

        tag(ModTags.Items.TALL_PINK_FLOWERS)
                .add(ModBlocks.PINK_AGAPANTHUS.asItem())
                .add(ModBlocks.PINK_FOXGLOVE.asItem())
                .add(ModBlocks.PINK_HOLLYHOCK.asItem())
                .add(ModBlocks.PINK_LILAC.asItem())
                .add(ModBlocks.PINK_ROSE_BUSH.asItem());
    }

}
