package com.donaldduckith.expandedflowers.datagen;

import com.donaldduckith.expandedflowers.ExpandedFlowers;
import com.donaldduckith.expandedflowers.block.TripleBlockSegment;
import com.donaldduckith.expandedflowers.block.TriplePlantBlock;
import com.donaldduckith.expandedflowers.registry.ModBlocks;
import com.donaldduckith.expandedflowers.registry.ModItems;
import net.minecraft.client.data.models.*;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.renderer.block.model.Variant;
import net.minecraft.core.BlockPos;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProviderType;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, ExpandedFlowers.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        /*blockModels.createDoublePlantWithDefaultItem(ModBlocks.WHITE_AGAPANTHUS.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.GRAY_AGAPANTHUS.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.ORANGE_AGAPANTHUS.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.BLUE_AGAPANTHUS.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.PURPLE_AGAPANTHUS.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.MAGENTA_AGAPANTHUS.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.PINK_AGAPANTHUS.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.DEAD_AGAPANTHUS.get(), BlockModelGenerators.PlantType.NOT_TINTED);

        blockModels.createDoublePlantWithDefaultItem(ModBlocks.WHITE_FOXGLOVE.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.YELLOW_FOXGLOVE.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.BLUE_FOXGLOVE.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.PURPLE_FOXGLOVE.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.MAGENTA_FOXGLOVE.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.PINK_FOXGLOVE.get(), BlockModelGenerators.PlantType.NOT_TINTED);

        blockModels.createDoublePlantWithDefaultItem(ModBlocks.WHITE_ROSE_BUSH.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.LIGHT_GRAY_ROSE_BUSH.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.BLACK_ROSE_BUSH.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.ORANGE_ROSE_BUSH.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.YELLOW_ROSE_BUSH.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.LIME_ROSE_BUSH.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.BLUE_ROSE_BUSH.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.PURPLE_ROSE_BUSH.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.MAGENTA_ROSE_BUSH.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.PINK_ROSE_BUSH.get(), BlockModelGenerators.PlantType.NOT_TINTED);

        blockModels.createDoublePlantWithDefaultItem(ModBlocks.WHITE_LILAC.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.PURPLE_LILAC.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.PINK_LILAC.get(), BlockModelGenerators.PlantType.NOT_TINTED);

        blockModels.createDoublePlantWithDefaultItem(ModBlocks.WHITE_PEONY.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        blockModels.createDoublePlantWithDefaultItem(ModBlocks.MAGENTA_PEONY.get(), BlockModelGenerators.PlantType.NOT_TINTED);

        ModBlockModelGenerators.createTriplePlantWithDefaultItem(ModBlocks.HOLLYHOCK_BUSH.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        ModBlockModelGenerators.createTriplePlantWithDefaultItem(ModBlocks.WHITE_HOLLYHOCK.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        ModBlockModelGenerators.createTriplePlantWithDefaultItem(ModBlocks.BLACK_HOLLYHOCK.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        ModBlockModelGenerators.createTriplePlantWithDefaultItem(ModBlocks.RED_HOLLYHOCK.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        ModBlockModelGenerators.createTriplePlantWithDefaultItem(ModBlocks.YELLOW_HOLLYHOCK.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        ModBlockModelGenerators.createTriplePlantWithDefaultItem(ModBlocks.MAGENTA_HOLLYHOCK.get(), BlockModelGenerators.PlantType.NOT_TINTED);
        ModBlockModelGenerators.createTriplePlantWithDefaultItem(ModBlocks.PINK_HOLLYHOCK.get(), BlockModelGenerators.PlantType.NOT_TINTED);

        BlockModelGenerators.createSimpleBlock(ModBlocks.BOUGAINVILLEA_LEAVES.get(), BlockModelGenerators.plainVariant(ModBlocks.BOUGAINVILLEA_LEAVES.getId()));
        BlockModelGenerators.createSimpleBlock(ModBlocks.WHITE_BOUGAINVILLEA.get(), BlockModelGenerators.plainVariant(ModBlocks.WHITE_BOUGAINVILLEA.getId()));
        BlockModelGenerators.createSimpleBlock(ModBlocks.RED_BOUGAINVILLEA.get(), BlockModelGenerators.plainVariant(ModBlocks.RED_BOUGAINVILLEA.getId()));
        BlockModelGenerators.createSimpleBlock(ModBlocks.ORANGE_BOUGAINVILLEA.get(), BlockModelGenerators.plainVariant(ModBlocks.ORANGE_BOUGAINVILLEA.getId()));
        BlockModelGenerators.createSimpleBlock(ModBlocks.YELLOW_BOUGAINVILLEA.get(), BlockModelGenerators.plainVariant(ModBlocks.YELLOW_BOUGAINVILLEA.getId()));
        BlockModelGenerators.createSimpleBlock(ModBlocks.PURPLE_BOUGAINVILLEA.get(), BlockModelGenerators.plainVariant(ModBlocks.PURPLE_BOUGAINVILLEA.getId()));
        BlockModelGenerators.createSimpleBlock(ModBlocks.MAGENTA_BOUGAINVILLEA.get(), BlockModelGenerators.plainVariant(ModBlocks.MAGENTA_BOUGAINVILLEA.getId()));
        BlockModelGenerators.createSimpleBlock(ModBlocks.PINK_BOUGAINVILLEA.get(), BlockModelGenerators.plainVariant(ModBlocks.PINK_BOUGAINVILLEA.getId()));

        BlockModelGenerators.createSimpleBlock(ModBlocks.WHITE_WATTLE_LEAVES.get(), BlockModelGenerators.plainVariant(ModBlocks.WHITE_WATTLE_LEAVES.getId()));
        BlockModelGenerators.createSimpleBlock(ModBlocks.RED_WATTLE_LEAVES.get(), BlockModelGenerators.plainVariant(ModBlocks.RED_WATTLE_LEAVES.getId()));
        BlockModelGenerators.createSimpleBlock(ModBlocks.ORANGE_WATTLE_LEAVES.get(), BlockModelGenerators.plainVariant(ModBlocks.ORANGE_WATTLE_LEAVES.getId()));
        BlockModelGenerators.createSimpleBlock(ModBlocks.YELLOW_WATTLE_LEAVES.get(), BlockModelGenerators.plainVariant(ModBlocks.YELLOW_WATTLE_LEAVES.getId()));*/

        super.registerModels(blockModels, itemModels);
    }

}
