package com.donaldduckith.expandedflowers.datagen;

import com.donaldduckith.expandedflowers.ExpandedFlowers;
import com.donaldduckith.expandedflowers.registry.ModBlocks;
import com.donaldduckith.expandedflowers.registry.ModTags;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider{
    public ModRecipeProvider(HolderLookup.Provider provider, RecipeOutput output) {
        super(provider, output);
    }

    @Override
    protected void buildRecipes() {
        List<ItemLike> AGAPANTHUS = List.of(ModBlocks.WHITE_AGAPANTHUS, ModBlocks.GRAY_AGAPANTHUS, ModBlocks.ORANGE_AGAPANTHUS,
                ModBlocks.BLUE_AGAPANTHUS, ModBlocks.PURPLE_AGAPANTHUS, ModBlocks.MAGENTA_AGAPANTHUS, ModBlocks.PINK_AGAPANTHUS);
        List<ItemLike> CLEMATIS = List.of(ModBlocks.WHITE_CLEMATIS, ModBlocks.RED_CLEMATIS, ModBlocks.YELLOW_CLEMATIS,
                ModBlocks.BLUE_CLEMATIS, ModBlocks.PURPLE_CLEMATIS, ModBlocks.MAGENTA_CLEMATIS, ModBlocks.PINK_CLEMATIS);
        List<ItemLike> FOXGLOVE = List.of(ModBlocks.WHITE_FOXGLOVE, ModBlocks.YELLOW_FOXGLOVE, ModBlocks.BLUE_FOXGLOVE,
                ModBlocks.PURPLE_FOXGLOVE, ModBlocks.MAGENTA_FOXGLOVE, ModBlocks.PINK_FOXGLOVE);
        List<ItemLike> HOLLYHOCK = List.of(ModBlocks.WHITE_HOLLYHOCK, ModBlocks.BLACK_HOLLYHOCK, ModBlocks.RED_HOLLYHOCK,
                ModBlocks.YELLOW_HOLLYHOCK, ModBlocks.MAGENTA_HOLLYHOCK, ModBlocks.PINK_HOLLYHOCK);
        List<ItemLike> ROSEMARY = List.of(ModBlocks.WHITE_ROSEMARY, ModBlocks.PURPLE_ROSEMARY, ModBlocks.PINK_ROSEMARY);

        shapeless(RecipeCategory.MISC, Items.WHITE_DYE, 1)
                .requires(ModTags.Items.SHORT_WHITE_FLOWERS)
                .unlockedBy("has_short_white_flower", has(ModTags.Items.SHORT_WHITE_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.WHITE_DYE))));
        shapeless(RecipeCategory.MISC, Items.LIGHT_GRAY_DYE, 1)
                .requires(ModTags.Items.SHORT_LIGHT_GRAY_FLOWERS)
                .unlockedBy("has_short_light_gray_flower", has(ModTags.Items.SHORT_LIGHT_GRAY_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.LIGHT_GRAY_DYE))));
        shapeless(RecipeCategory.MISC, Items.GRAY_DYE, 1)
                .requires(ModTags.Items.SHORT_GRAY_FLOWERS)
                .unlockedBy("has_short_gray_flower", has(ModTags.Items.SHORT_GRAY_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.GRAY_DYE))));
        shapeless(RecipeCategory.MISC, Items.BLACK_DYE, 1)
                .requires(ModTags.Items.SHORT_BLACK_FLOWERS)
                .unlockedBy("has_short_black_flower", has(ModTags.Items.SHORT_BLACK_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.BLACK_DYE))));
        shapeless(RecipeCategory.MISC, Items.BROWN_DYE, 1)
                .requires(ModTags.Items.SHORT_BROWN_FLOWERS)
                .unlockedBy("has_short_brown_flower", has(ModTags.Items.SHORT_BROWN_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.BROWN_DYE))));
        shapeless(RecipeCategory.MISC, Items.RED_DYE, 1)
                .requires(ModTags.Items.SHORT_RED_FLOWERS)
                .unlockedBy("has_short_red_flower", has(ModTags.Items.SHORT_RED_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.RED_DYE))));
        shapeless(RecipeCategory.MISC, Items.ORANGE_DYE, 1)
                .requires(ModTags.Items.SHORT_ORANGE_FLOWERS)
                .unlockedBy("has_short_orange_flower", has(ModTags.Items.SHORT_ORANGE_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.ORANGE_DYE))));
        shapeless(RecipeCategory.MISC, Items.YELLOW_DYE, 1)
                .requires(ModTags.Items.SHORT_YELLOW_FLOWERS)
                .unlockedBy("has_short_yellow_flower", has(ModTags.Items.SHORT_YELLOW_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.YELLOW_DYE))));
        shapeless(RecipeCategory.MISC, Items.LIME_DYE, 1)
                .requires(ModTags.Items.SHORT_LIME_FLOWERS)
                .unlockedBy("has_short_lime_flower", has(ModTags.Items.SHORT_LIME_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.LIME_DYE))));
        shapeless(RecipeCategory.MISC, Items.GREEN_DYE, 1)
                .requires(ModTags.Items.SHORT_GREEN_FLOWERS)
                .unlockedBy("has_short_green_flower", has(ModTags.Items.SHORT_GREEN_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.GREEN_DYE))));
        shapeless(RecipeCategory.MISC, Items.CYAN_DYE, 1)
                .requires(ModTags.Items.SHORT_CYAN_FLOWERS)
                .unlockedBy("has_short_cyan_flower", has(ModTags.Items.SHORT_CYAN_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.CYAN_DYE))));
        shapeless(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE, 1)
                .requires(ModTags.Items.SHORT_LIGHT_BLUE_FLOWERS)
                .unlockedBy("has_short_light_blue_flower", has(ModTags.Items.SHORT_LIGHT_BLUE_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.LIGHT_BLUE_DYE))));
        shapeless(RecipeCategory.MISC, Items.BLUE_DYE, 1)
                .requires(ModTags.Items.SHORT_BLUE_FLOWERS)
                .unlockedBy("has_short_blue_flower", has(ModTags.Items.SHORT_BLUE_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.BLUE_DYE))));
        shapeless(RecipeCategory.MISC, Items.PURPLE_DYE, 1)
                .requires(ModTags.Items.SHORT_PURPLE_FLOWERS)
                .unlockedBy("has_short_purple_flower", has(ModTags.Items.SHORT_PURPLE_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.PURPLE_DYE))));
        shapeless(RecipeCategory.MISC, Items.MAGENTA_DYE, 1)
                .requires(ModTags.Items.SHORT_MAGENTA_FLOWERS)
                .unlockedBy("has_short_magenta_flower", has(ModTags.Items.SHORT_MAGENTA_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.MAGENTA_DYE))));
        shapeless(RecipeCategory.MISC, Items.PINK_DYE, 1)
                .requires(ModTags.Items.SHORT_PINK_FLOWERS)
                .unlockedBy("has_short_pink_flower", has(ModTags.Items.SHORT_PINK_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.PINK_DYE))));

        shapeless(RecipeCategory.MISC, Items.WHITE_DYE, 2)
                .requires(ModTags.Items.TALL_WHITE_FLOWERS)
                .unlockedBy("has_tall_white_flower", has(ModTags.Items.TALL_WHITE_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.WHITE_DYE) + "_double")));
        shapeless(RecipeCategory.MISC, Items.LIGHT_GRAY_DYE, 2)
                .requires(ModTags.Items.TALL_LIGHT_GRAY_FLOWERS)
                .unlockedBy("has_tall_light_gray_flower", has(ModTags.Items.TALL_LIGHT_GRAY_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.LIGHT_GRAY_DYE) + "_double")));
        shapeless(RecipeCategory.MISC, Items.GRAY_DYE, 2)
                .requires(ModTags.Items.TALL_GRAY_FLOWERS)
                .unlockedBy("has_tall_gray_flower", has(ModTags.Items.TALL_GRAY_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.GRAY_DYE) + "_double")));
        shapeless(RecipeCategory.MISC, Items.BLACK_DYE, 2)
                .requires(ModTags.Items.TALL_BLACK_FLOWERS)
                .unlockedBy("has_tall_black_flower", has(ModTags.Items.TALL_BLACK_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.BLACK_DYE) + "_double")));
        shapeless(RecipeCategory.MISC, Items.BROWN_DYE, 2)
                .requires(ModTags.Items.TALL_BROWN_FLOWERS)
                .unlockedBy("has_tall_brown_flower", has(ModTags.Items.TALL_BROWN_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.BROWN_DYE) + "_double")));
        shapeless(RecipeCategory.MISC, Items.RED_DYE, 2)
                .requires(ModTags.Items.TALL_RED_FLOWERS)
                .unlockedBy("has_tall_red_flower", has(ModTags.Items.TALL_RED_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.RED_DYE) + "_double")));
        shapeless(RecipeCategory.MISC, Items.ORANGE_DYE, 2)
                .requires(ModTags.Items.TALL_ORANGE_FLOWERS)
                .unlockedBy("has_tall_orange_flower", has(ModTags.Items.TALL_ORANGE_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.ORANGE_DYE) + "_double")));
        shapeless(RecipeCategory.MISC, Items.YELLOW_DYE, 2)
                .requires(ModTags.Items.TALL_YELLOW_FLOWERS)
                .unlockedBy("has_tall_yellow_flower", has(ModTags.Items.TALL_YELLOW_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.YELLOW_DYE) + "_double")));
        shapeless(RecipeCategory.MISC, Items.LIME_DYE, 2)
                .requires(ModTags.Items.TALL_LIME_FLOWERS)
                .unlockedBy("has_tall_lime_flower", has(ModTags.Items.TALL_LIME_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.LIME_DYE) + "_double")));
        shapeless(RecipeCategory.MISC, Items.GREEN_DYE, 2)
                .requires(ModTags.Items.TALL_GREEN_FLOWERS)
                .unlockedBy("has_tall_green_flower", has(ModTags.Items.TALL_GREEN_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.GREEN_DYE) + "_double")));
        shapeless(RecipeCategory.MISC, Items.CYAN_DYE, 2)
                .requires(ModTags.Items.TALL_CYAN_FLOWERS)
                .unlockedBy("has_tall_cyan_flower", has(ModTags.Items.TALL_CYAN_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.CYAN_DYE) + "_double")));
        shapeless(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE, 2)
                .requires(ModTags.Items.TALL_LIGHT_BLUE_FLOWERS)
                .unlockedBy("has_tall_light_blue_flower", has(ModTags.Items.TALL_LIGHT_BLUE_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.LIGHT_BLUE_DYE) + "_double")));
        shapeless(RecipeCategory.MISC, Items.BLUE_DYE, 2)
                .requires(ModTags.Items.TALL_BLUE_FLOWERS)
                .unlockedBy("has_tall_blue_flower", has(ModTags.Items.TALL_BLUE_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.BLUE_DYE) + "_double")));
        shapeless(RecipeCategory.MISC, Items.PURPLE_DYE, 2)
                .requires(ModTags.Items.TALL_PURPLE_FLOWERS)
                .unlockedBy("has_tall_purple_flower", has(ModTags.Items.TALL_PURPLE_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.PURPLE_DYE) + "_double")));
        shapeless(RecipeCategory.MISC, Items.MAGENTA_DYE, 2)
                .requires(ModTags.Items.TALL_MAGENTA_FLOWERS)
                .unlockedBy("has_tall_magenta_flower", has(ModTags.Items.TALL_MAGENTA_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.MAGENTA_DYE) + "_double")));
        shapeless(RecipeCategory.MISC, Items.PINK_DYE, 2)
                .requires(ModTags.Items.TALL_PINK_FLOWERS)
                .unlockedBy("has_tall_pink_flower", has(ModTags.Items.TALL_PINK_FLOWERS))
                .save(output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(Items.PINK_DYE) + "_double")));

        oreSmelting(AGAPANTHUS, RecipeCategory.DECORATIONS, ModBlocks.DEAD_AGAPANTHUS.asItem(), 0.2F, 200, "dead_agapanthus");
        oreSmelting(CLEMATIS, RecipeCategory.DECORATIONS, ModBlocks.CLEMATIS_VINE.asItem(), 0.2F, 200, "clematis_vine");
        oreSmelting(FOXGLOVE, RecipeCategory.DECORATIONS, ModBlocks.FOXGLOVE_BUSH.asItem(), 0.2F, 200, "foxglove_bush");
        oreSmelting(HOLLYHOCK, RecipeCategory.DECORATIONS, ModBlocks.HOLLYHOCK_BUSH.asItem(), 0.2F, 200, "hollyhock_bush");
        oreSmelting(ROSEMARY, RecipeCategory.DECORATIONS, ModBlocks.ROSEMARY_BUSH.asItem(), 0.2F, 200, "rosemary_bush");
    }

    public static class Runner extends RecipeProvider.Runner {

        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> provider) {
            super(packOutput, provider);
        }

        @Override
        public RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider, recipeOutput);
        }

        public String getName() {
            return "Expanded Flowers Recipes";
        }
    }


    protected void oreSmelting(List<ItemLike> ingredients, RecipeCategory category, ItemLike result, float experience, int cookingTime, String group) {
        this.oreCooking(
                RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, ingredients, category, result, experience, cookingTime, group, "_from_smelting"
        );
    }

    protected <T extends AbstractCookingRecipe> void oreCooking(
            RecipeSerializer<T> serializer,
            AbstractCookingRecipe.Factory<T> recipeFactory,
            List<ItemLike> ingredients,
            RecipeCategory category,
            ItemLike result,
            float experience,
            int cookingTime,
            String group,
            String suffix
    ) {
        for (ItemLike itemlike : ingredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), category, result, experience, cookingTime, serializer, recipeFactory)
                    .group(group)
                    .unlockedBy(getHasName(itemlike), this.has(itemlike))
                    .save(this.output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, getItemName(result) + suffix + "_" + getItemName(itemlike))));
        }
    }
}
