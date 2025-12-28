package com.donaldduckith.expandedflowers.registry.services;

import com.mojang.serialization.Codec;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTab.DisplayItemsGenerator;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import org.apache.commons.lang3.function.TriFunction;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public interface CommonRegistryHelper {
    <C, T extends C> Supplier<T> register(Registry<C> registry, String name, Supplier<T> entry);

    <C, T extends C> Holder<C> registerHolder(Registry<C> registry, String name, Supplier<T> entry);

    <T extends AbstractContainerMenu, C> Supplier<MenuType<T>> registerMenu(String name, TriFunction<Integer, Inventory, C, T> factory, StreamCodec<? super RegistryFriendlyByteBuf, C> codec);

    <T extends AbstractContainerMenu> Supplier<MenuType<T>> registerMenu(String name, BiFunction<Integer, Inventory, T> factory);

    void register(ResourceLocation id, SimpleJsonResourceReloadListener loader);

    Supplier<CreativeModeTab> registerCreativeTab(String name, Supplier<ItemStack> iconSupplier, DisplayItemsGenerator itemsGenerator);

    <T> ResourceKey<Registry<T>> registerDataRegistry(ResourceKey<Registry<T>> key, Codec<T> codec);

    <T> ResourceKey<Registry<T>> registerSyncedDataRegistry(ResourceKey<Registry<T>> key, Codec<T> codec, Codec<T> networkCodec);

    void setFlammable(Block block, int igniteOdds, int burnOdds);
}
