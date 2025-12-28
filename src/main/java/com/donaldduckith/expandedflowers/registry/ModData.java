package com.donaldduckith.expandedflowers.registry;

import com.donaldduckith.expandedflowers.ExpandedFlowers;
import com.donaldduckith.expandedflowers.registry.pollination.PollinationInfo;
import com.mojang.serialization.Codec;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

public class ModData {
    public static final ResourceKey<Registry<PollinationInfo>> POLLINATION_REGISTRY = registerSynced(ResourceKey.createRegistryKey(ResourceLocation.fromNamespaceAndPath(ExpandedFlowers.MODID,"pollinators")), PollinationInfo.CODEC, PollinationInfo.CODEC);

    private static <T> ResourceKey<Registry<T>> registerSynced(ResourceKey<Registry<T>> key, Codec<T> codec, Codec<T> networkCodec) {
        return ModServices.REGISTRY.registerSyncedDataRegistry(key, codec, networkCodec);
    }

    public static void load() {}
}
