package fuzs.illagerinvasion.neoforge;

import fuzs.illagerinvasion.common.IllagerInvasion;
import fuzs.illagerinvasion.common.data.ModBrewingProvider;
import fuzs.illagerinvasion.common.data.ModRecipeProvider;
import fuzs.illagerinvasion.common.data.loot.ModBlockLootProvider;
import fuzs.illagerinvasion.common.data.loot.ModChestLootProvider;
import fuzs.illagerinvasion.common.data.loot.ModEntityInjectionLootProvider;
import fuzs.illagerinvasion.common.data.loot.ModEntityTypeLootProvider;
import fuzs.illagerinvasion.common.data.tags.ModBiomeTagProvider;
import fuzs.illagerinvasion.common.data.tags.ModBlockTagProvider;
import fuzs.illagerinvasion.common.data.tags.ModEntityTypeTagProvider;
import fuzs.illagerinvasion.common.data.tags.ModItemTagProvider;
import fuzs.illagerinvasion.common.init.ModRegistry;
import fuzs.illagerinvasion.common.init.ModStructureSets;
import fuzs.illagerinvasion.common.init.ModStructures;
import fuzs.illagerinvasion.common.init.ModTemplatePools;
import fuzs.illagerinvasion.neoforge.data.ModDataMapProvider;
import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v3.core.DataProviderBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.fml.common.Mod;

@Mod(IllagerInvasion.MOD_ID)
public class IllagerInvasionNeoForge {

    public IllagerInvasionNeoForge() {
        ModConstructor.construct(IllagerInvasion.MOD_ID, IllagerInvasion::new);
        DataProviderBuilder.of(IllagerInvasion.MOD_ID)
                .add(Registries.TRIM_MATERIAL, ModRegistry::boostrapTrimMaterials)
                .add(Registries.INSTRUMENT, ModRegistry::boostrapInstruments)
                .add(Registries.STRUCTURE, ModStructures::bootstrap)
                .add(Registries.STRUCTURE_SET, ModStructureSets::bootstrap)
                .add(Registries.TEMPLATE_POOL, ModTemplatePools::bootstrap)
                .add(Registries.PROCESSOR_LIST, ModRegistry::boostrapStructureProcessorLists)
                .addLootProvider(ModBlockLootProvider::new, LootContextParamSets.BLOCK)
                .addLootProvider(ModChestLootProvider::new, LootContextParamSets.CHEST)
                .addLootProvider(ModEntityInjectionLootProvider::new, LootContextParamSets.ENTITY)
                .addLootProvider(ModEntityTypeLootProvider::new, LootContextParamSets.ENTITY)
                .addProvider(ModBiomeTagProvider::new,
                        ModBlockTagProvider::new,
                        ModEntityTypeTagProvider::new,
                        ModItemTagProvider::new,
                        ModDataMapProvider::new)
                .addRecipeProvider(ModRecipeProvider::new)
                .addRecipeProvider(ModBrewingProvider::new);
    }
}
