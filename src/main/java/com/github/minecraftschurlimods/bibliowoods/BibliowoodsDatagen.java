package com.github.minecraftschurlimods.bibliowoods;

import com.github.minecraftschurlimods.bibliocraft.api.BibliocraftApi;
import com.github.minecraftschurlimods.bibliocraft.api.datagen.BibliocraftDatagenHelper;
import com.github.minecraftschurlimods.bibliocraft.api.datagen.NonClearingBlockTagsProvider;
import com.github.minecraftschurlimods.bibliocraft.api.datagen.NonClearingItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = Bibliowoods.MOD_ID)
public final class BibliowoodsDatagen {
    @SubscribeEvent
    private static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        LanguageProvider language = generator.addProvider(event.includeClient(), new LanguageProvider(generator.getPackOutput(), Bibliowoods.MOD_ID, "en_us") {
            @Override
            protected void addTranslations() {}
        });
        NonClearingBlockTagsProvider blockTags = generator.addProvider(event.includeServer(), new NonClearingBlockTagsProvider(output, lookupProvider, Bibliowoods.MOD_ID, existingFileHelper) {
            @Override
            protected void addTags(HolderLookup.Provider provider) {}
        });
        NonClearingItemTagsProvider itemTags = generator.addProvider(event.includeServer(), new NonClearingItemTagsProvider(output, lookupProvider, blockTags.contentsGetter(), Bibliowoods.MOD_ID, existingFileHelper) {
            @Override
            protected void addTags(HolderLookup.Provider provider) {}
        });
        BibliocraftDatagenHelper helper = BibliocraftApi.getDatagenHelper();
        helper.addWoodTypesToGenerateByModid("aether");
        helper.addWoodTypesToGenerateByModid("allthemodium");
        helper.addWoodTypesToGenerateByModid("ars_nouveau");
        helper.addWoodTypesToGenerateByModid("butchercraft");
        helper.addWoodTypesToGenerateByModid("cobblemon");
        helper.addWoodTypesToGenerateByModid("deep_aether");
        helper.addWoodTypesToGenerateByModid("deeperdarker");
        helper.addWoodTypesToGenerateByModid("eternal_starlight");
        helper.addWoodTypesToGenerateByModid("expandeddelight");
        helper.addWoodTypesToGenerateByModid("extradelight");
        helper.addWoodTypesToGenerateByModid("forbidden_arcanus");
        helper.addWoodTypesToGenerateByModid("garnished");
        helper.addWoodTypesToGenerateByModid("gtceu");
        helper.addWoodTypesToGenerateByModid("hexerei");
        helper.addWoodTypesToGenerateByModid("integrateddynamics");
        helper.addWoodTypesToGenerateByModid("mirthdew_encore");
        helper.addWoodTypesToGenerateByModid("mynethersdelight");
        helper.addWoodTypesToGenerateByModid("occultism");
        helper.addWoodTypesToGenerateByModid("roots");
        helper.addWoodTypesToGenerateByModid("silentgear");
        helper.addWoodTypesToGenerateByModid("thaumon");
        helper.addWoodTypesToGenerateByModid("tropicraft");
        helper.addWoodTypesToGenerateByModid("twilightforest");
        helper.addWoodTypesToGenerateByModid("undergarden");
        helper.addWoodTypesToGenerateByModid("vampirism");
        helper.addWoodTypesToGenerateByModid("werewolves");
        helper.addWoodTypesToGenerateByModid("witchery");
        helper.addWoodTypesToGenerateByModid("wwizardry");
        helper.generateAll(Bibliowoods.MOD_ID, event, language, blockTags, itemTags);
    }
}
