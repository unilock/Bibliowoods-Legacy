package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.thevortex.allthemodium.registry.ModRegistry;
import net.minecraft.data.BlockFamily;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;

public class AllthemodiumMod {
    public AllthemodiumMod(IEventBus bus) {
        bus.addListener(RegisterBibliocraftWoodTypesEvent.class, this::registerWoodTypes);
    }

    private void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        event.register(
                ResourceLocation.fromNamespaceAndPath("allthemodium", "ancient"),
                new WoodType("allthemodium_ancient", new BlockSetType("allthemodium_ancient")),
                () -> BlockBehaviour.Properties.of().strength(0.8F).randomTicks().sound(SoundType.WOOD),
                ResourceLocation.fromNamespaceAndPath("allthemodium", "block/ancient_planks"),
                () -> new BlockFamily.Builder(ModRegistry.ANCIENT_PLANKS.get()).slab(ModRegistry.ANCIENT_WOODEN_SLABS.get()).stairs(ModRegistry.ANCIENT_WOODEN_STAIRS.get()).getFamily());
        event.register(
                ResourceLocation.fromNamespaceAndPath("allthemodium", "demonic"),
                new WoodType("allthemodium_demonic", new BlockSetType("allthemodium_demonic")),
                () -> BlockBehaviour.Properties.of().strength(0.8F).randomTicks().sound(SoundType.WOOD),
                ResourceLocation.fromNamespaceAndPath("allthemodium", "block/demonic_planks"),
                () -> new BlockFamily.Builder(ModRegistry.DEMONIC_PLANKS.get()).slab(ModRegistry.DEMONIC_WOODEN_SLABS.get()).stairs(ModRegistry.DEMONIC_WOODEN_STAIRS.get()).getFamily());
        event.register(
                ResourceLocation.fromNamespaceAndPath("allthemodium", "soul"),
                new WoodType("allthemodium_soul", new BlockSetType("allthemodium_soul")),
                () -> BlockBehaviour.Properties.of().strength(0.8F).randomTicks().sound(SoundType.WOOD),
                ResourceLocation.fromNamespaceAndPath("allthemodium", "block/soul_planks"),
                () -> new BlockFamily.Builder(ModRegistry.SOUL_PLANKS.get()).slab(ModRegistry.SOUL_WOODEN_SLABS.get()).stairs(ModRegistry.SOUL_WOODEN_STAIRS.get()).getFamily());
    }
}
