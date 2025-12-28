package com.donaldduckith.expandedflowers.datagen;

import com.donaldduckith.expandedflowers.block.TripleBlockSegment;
import com.donaldduckith.expandedflowers.block.TriplePlantBlock;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelOutput;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.renderer.block.model.Variant;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public abstract class ModBlockModelGenerators extends BlockModelGenerators{

    private final Consumer<BlockModelDefinitionGenerator> blockStateOutput;
    private final ItemModelOutput itemModelOutput;
    private final BiConsumer<ResourceLocation, ModelInstance> modelOutput;

    public ModBlockModelGenerators(Consumer<BlockModelDefinitionGenerator> blockStateOutput, ItemModelOutput itemModelOutput,
                                   BiConsumer<ResourceLocation, ModelInstance> modelOutput) {
        super(blockStateOutput, itemModelOutput, modelOutput);
        this.blockStateOutput = blockStateOutput;
        this.itemModelOutput = itemModelOutput;
        this.modelOutput = modelOutput;
    }

    public void createTripleBlock(Block block, MultiVariant lower, MultiVariant middle, MultiVariant upper) {
        this.blockStateOutput
                .accept(
                        MultiVariantGenerator.dispatch(block)
                                .with(
                                        PropertyDispatch.initial(TriplePlantBlock.SEGMENT)
                                                .select(TripleBlockSegment.UPPER, upper)
                                                .select(TripleBlockSegment.MIDDLE, middle)
                                                .select(TripleBlockSegment.LOWER, lower)
                                )
                );
    }

    public void createTriplePlant(Block block, BlockModelGenerators.PlantType plantType) {
        MultiVariant multivariant = plainVariant(this.createSuffixedVariant(block, "_top", plantType.getCross(), TextureMapping::cross));
        MultiVariant multivariant1 = plainVariant(this.createSuffixedVariant(block, "_middle", plantType.getCross(), TextureMapping::cross));
        MultiVariant multivariant2 = plainVariant(this.createSuffixedVariant(block, "_bottom", plantType.getCross(), TextureMapping::cross));
        this.createTripleBlock(block, multivariant, multivariant1, multivariant2);
    }

    public void registerSimpleFlatItemModel(Block block, String suffix) {
        Item item = block.asItem();
        if (item != Items.AIR) {
            this.registerSimpleItemModel(item, createFlatItemModelWithBlockTexture(item, block, suffix));
        }
    }

    public void createTriplePlantWithDefaultItem(Block block, BlockModelGenerators.PlantType plantType) {
        this.registerSimpleFlatItemModel(block, "_top");
        this.createTriplePlant(block, plantType);
    }

    public void registerSimpleItemModel(Item item, ResourceLocation model) {
        itemModelOutput.accept(item, ItemModelUtils.plainModel(model));
    }

    public ResourceLocation createSuffixedVariant(
            Block block, String suffix, ModelTemplate modelTemplate, Function<ResourceLocation, TextureMapping> textureMappingGetter
    ) {
        return modelTemplate.createWithSuffix(block, suffix, textureMappingGetter.apply(TextureMapping.getBlockTexture(block, suffix)), this.modelOutput);
    }

    public ResourceLocation createFlatItemModel(Item item) {
        return ModelTemplates.FLAT_ITEM.create(ModelLocationUtils.getModelLocation(item), TextureMapping.layer0(item), this.modelOutput);
    }

    public ResourceLocation createFlatItemModelWithBlockTexture(Item item, Block block) {
        return ModelTemplates.FLAT_ITEM.create(ModelLocationUtils.getModelLocation(item), TextureMapping.layer0(block), this.modelOutput);
    }

    public ResourceLocation createFlatItemModelWithBlockTexture(Item item, Block block, String suffix) {
        return ModelTemplates.FLAT_ITEM
                .create(
                        ModelLocationUtils.getModelLocation(item), TextureMapping.layer0(TextureMapping.getBlockTexture(block, suffix)), this.modelOutput
                );
    }
    public static MultiVariant plainVariant(ResourceLocation id) {
        return variant(plainModel(id));
    }
    public static MultiVariant variant(Variant variant) {
        return new MultiVariant(WeightedList.of(variant));
    }
    public static Variant plainModel(ResourceLocation modelLocation) {
        return new Variant(modelLocation);
    }
}
