package com.github.minecraftschurlimods.bibliowoods;

import com.github.minecraftschurlimods.bibliowoods.mods.AetherMod;
import com.github.minecraftschurlimods.bibliowoods.mods.AllthemodiumMod;
import com.github.minecraftschurlimods.bibliowoods.mods.ArsNouveauMod;
import com.github.minecraftschurlimods.bibliowoods.mods.CobblemonMod;
import com.github.minecraftschurlimods.bibliowoods.mods.DeeperAndDarkerMod;
import com.github.minecraftschurlimods.bibliowoods.mods.ForbiddenArcanusMod;
import com.github.minecraftschurlimods.bibliowoods.mods.GregTechMod;
import com.github.minecraftschurlimods.bibliowoods.mods.IntegratedDynamicsMod;
import com.github.minecraftschurlimods.bibliowoods.mods.OccultismMod;
import com.github.minecraftschurlimods.bibliowoods.mods.SilentGearMod;
import com.github.minecraftschurlimods.bibliowoods.mods.TwilightForestMod;
import com.github.minecraftschurlimods.bibliowoods.mods.UndergardenMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;

import java.util.function.BiFunction;

@Mod(Bibliowoods.MOD_ID)
public final class Bibliowoods {
    public static final String MOD_ID = "bibliowoods";

    public Bibliowoods(IEventBus bus) {
        addIfLoaded("aether",             bus, AetherMod::new);
        addIfLoaded("allthemodium",       bus, AllthemodiumMod::new);
        addIfLoaded("ars_nouveau",        bus, ArsNouveauMod::new);
        addIfLoaded("cobblemon",          bus, CobblemonMod::new);
        addIfLoaded("deeperdarker",       bus, DeeperAndDarkerMod::new);
        addIfLoaded("forbidden_arcanus",  bus, ForbiddenArcanusMod::new);
        addIfLoaded("gtceu",              bus, GregTechMod::new);
        addIfLoaded("integrateddynamics", bus, IntegratedDynamicsMod::new);
        addIfLoaded("occultism",          bus, OccultismMod::new);
        addIfLoaded("silentgear",         bus, SilentGearMod::new);
        addIfLoaded("twilightforest",     bus, TwilightForestMod::new);
        addIfLoaded("undergarden",        bus, UndergardenMod::new);
    }

    private void addIfLoaded(String modId, IEventBus bus, BiFunction<String, IEventBus, AbstractMod> modBuilder) {
        if (ModList.get().isLoaded(modId)) {
            modBuilder.apply(modId, bus);
        }
    }
}
