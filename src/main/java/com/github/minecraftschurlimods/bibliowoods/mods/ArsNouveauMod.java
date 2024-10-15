package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.hollingsworth.arsnouveau.setup.registry.BlockRegistry;
import com.thevortex.allthemodium.registry.ModRegistry;
import net.minecraft.data.BlockFamily;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;

public class ArsNouveauMod {
    public ArsNouveauMod(IEventBus bus) {
        bus.addListener(RegisterBibliocraftWoodTypesEvent.class, this::registerWoodTypes);
    }

    private void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        event.register(
                ResourceLocation.fromNamespaceAndPath("ars_nouveau", "archwood"),
                WoodType.OAK,
                () -> BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD),
                ResourceLocation.fromNamespaceAndPath("ars_nouveau", "block/archwood_planks"),
                () -> new BlockFamily.Builder(BlockRegistry.ARCHWOOD_PLANK.get()).slab(BlockRegistry.ARCHWOOD_SLABS.get()).stairs(BlockRegistry.ARCHWOOD_STAIRS.get()).getFamily());
    }
}
