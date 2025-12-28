package com.donaldduckith.expandedflowers.registry.pollination;

import com.donaldduckith.expandedflowers.ExpandedFlowers;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.registries.datamaps.AdvancedDataMapType;
import net.neoforged.neoforge.registries.datamaps.DataMapType;
import net.neoforged.neoforge.registries.datamaps.DataMapValueRemover;
import net.neoforged.neoforge.registries.datamaps.RegisterDataMapTypesEvent;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public record PollinationInfo(List<PollinationSet> sets) {
    public static final Codec<PollinationInfo> CODEC = PollinationSet.CODEC.listOf().xmap(PollinationInfo::new, PollinationInfo::sets);

    public static final DataMapType<Block, PollinationInfo> POLLINATION_INFO = DataMapType.builder(
            ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID, "pollination_targets"),
            Registries.BLOCK,
            PollinationInfo.CODEC
    ).synced(PollinationInfo.CODEC, false).build();

    public record PollinationSet(Block pollinator, Block result) {
        public static final Codec<PollinationSet> CODEC = RecordCodecBuilder.create(instance -> instance.group(
                BuiltInRegistries.BLOCK.byNameCodec().fieldOf("pollinator").forGetter(PollinationSet::pollinator),
                BuiltInRegistries.BLOCK.byNameCodec().fieldOf("result").forGetter(PollinationSet::result)
        ).apply(instance, PollinationSet::new));

        public static PollinationSet of(Block pollinator, Block result) {
            return new PollinationSet(pollinator, result);
        }
    }

    @SubscribeEvent
    public static void registerDataMapTypes(RegisterDataMapTypesEvent event) {
        event.register(POLLINATION_INFO);
    }
}
