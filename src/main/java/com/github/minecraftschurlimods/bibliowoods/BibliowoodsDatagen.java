package com.github.minecraftschurlimods.bibliowoods;

import com.github.minecraftschurlimods.bibliocraft.api.BibliocraftApi;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = Bibliowoods.MOD_ID)
public final class BibliowoodsDatagen {
    @SubscribeEvent
    private static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        BibliocraftApi.getDatagenHelper().addWoodTypesToGenerateByModid("allthemodium");
        BibliocraftApi.getDatagenHelper().addWoodTypesToGenerateByModid("ars_nouveau");
        BibliocraftApi.getDatagenHelper().generateAll(Bibliowoods.MOD_ID, event);
        generator.addProvider(event.includeClient(), new LanguageProvider(output, Bibliowoods.MOD_ID, "en_us") {
            @Override
            protected void addTranslations() {
                BibliocraftApi.getDatagenHelper().generateEnglishTranslations(this);
            }
        });
    }
}
