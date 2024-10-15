package com.github.minecraftschurlimods.bibliowoods;

import com.github.minecraftschurlimods.bibliowoods.mods.AllthemodiumMod;
import com.github.minecraftschurlimods.bibliowoods.mods.ArsNouveauMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;

import java.util.function.Consumer;

@Mod(Bibliowoods.MOD_ID)
public final class Bibliowoods {
    public static final String MOD_ID = "bibliowoods";

    public Bibliowoods(IEventBus bus) {
        addIfLoaded("allthemodium", bus, AllthemodiumMod::new);
        addIfLoaded("ars_nouveau",  bus, ArsNouveauMod::new);
    }

    private void addIfLoaded(String modId, IEventBus bus, Consumer<IEventBus> modBuilder) {
        if (ModList.get().isLoaded(modId)) {
            modBuilder.accept(bus);
        }
    }
}
