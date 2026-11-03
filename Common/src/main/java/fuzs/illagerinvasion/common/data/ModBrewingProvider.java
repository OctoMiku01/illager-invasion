package fuzs.illagerinvasion.common.data;

import fuzs.illagerinvasion.common.init.ModRegistry;
import fuzs.puzzleslib.common.api.data.v3.recipes.AbstractBrewingProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Recipe;

public class ModBrewingProvider extends AbstractBrewingProvider {

    public ModBrewingProvider(BootstrapContext<Recipe<?>> recipeOutput, BootstrapContext<Advancement> advancementOutput) {
        super(recipeOutput, advancementOutput);
    }

    @Override
    protected void buildMixes() {
        this.buildMix(Potions.AWKWARD, Items.GOAT_HORN, ModRegistry.BERSERKING_POTION);
        this.buildMix(ModRegistry.BERSERKING_POTION, Items.REDSTONE, ModRegistry.LONG_BERSERKING_POTION);
        this.buildMix(ModRegistry.BERSERKING_POTION, Items.GLOWSTONE_DUST, ModRegistry.STRONG_BERSERKING_POTION);
    }
}
