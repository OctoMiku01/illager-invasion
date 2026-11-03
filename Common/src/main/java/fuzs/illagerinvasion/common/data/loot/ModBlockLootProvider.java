package fuzs.illagerinvasion.common.data.loot;

import fuzs.illagerinvasion.common.init.ModRegistry;
import fuzs.puzzleslib.common.api.data.v3.loot.AbstractBlockLootSubProvider;
import net.minecraft.data.loot.LootTableSubProvider;

public class ModBlockLootProvider extends AbstractBlockLootSubProvider {

    public ModBlockLootProvider(LootTableSubProvider.Context output) {
        super(output);
    }

    @Override
    public void generate() {
        this.dropSelf(ModRegistry.IMBUING_TABLE_BLOCK.value());
        this.dropNothing(ModRegistry.MAGIC_FIRE_BLOCK.value());
    }
}
