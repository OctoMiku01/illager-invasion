package fuzs.illagerinvasion.common.data;

import fuzs.illagerinvasion.common.init.ModItems;
import fuzs.puzzleslib.common.api.data.v3.recipes.AbstractRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class ModRecipeProvider extends AbstractRecipeProvider {

    private final HolderGetter<Item> itemLookup;

    public ModRecipeProvider(BootstrapContext<Recipe<?>> recipeOutput, BootstrapContext<Advancement> advancementOutput) {
        super(recipeOutput, advancementOutput);
        this.itemLookup = recipeOutput.lookup(Registries.ITEM);
    }

    @Override
    public void buildRecipes() {
        ShapedRecipeBuilder.shaped(this.itemLookup, RecipeCategory.MISC, ModItems.HALLOWED_GEM_ITEM.value())
                .define('#', Items.AMETHYST_SHARD)
                .define('B', ModItems.UNUSUAL_DUST_ITEM.value())
                .define('R', ModItems.ILLUSIONARY_DUST_ITEM.value())
                .define('D', Items.DIAMOND)
                .pattern("#B#")
                .pattern("RDR")
                .pattern("#B#")
                .unlockedBy(getHasName(ModItems.UNUSUAL_DUST_ITEM.value()),
                        this.has(ModItems.UNUSUAL_DUST_ITEM.value()))
                .unlockedBy(getHasName(ModItems.ILLUSIONARY_DUST_ITEM.value()),
                        this.has(ModItems.ILLUSIONARY_DUST_ITEM.value()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.itemLookup, RecipeCategory.DECORATIONS, ModItems.IMBUING_TABLE_ITEM.value())
                .define('#',
                        Ingredient.of(Items.COPPER_BLOCK.weathering().unaffected(),
                                Items.COPPER_BLOCK.waxed().unaffected()))
                .define('P', Items.PAPER)
                .define('O', Items.DARK_OAK_LOG)
                .define('S', ModItems.PRIMAL_ESSENCE_ITEM.value())
                .define('E', Items.EXPERIENCE_BOTTLE)
                .pattern("#P#")
                .pattern("OSO")
                .pattern("#E#")
                .unlockedBy(getHasName(ModItems.PRIMAL_ESSENCE_ITEM.value()),
                        this.has(ModItems.PRIMAL_ESSENCE_ITEM.value()))
                .save(this.output);
        ShapelessRecipeBuilder.shapeless(this.itemLookup, RecipeCategory.MISC, ModItems.PLATINUM_SHEET_ITEM.value())
                .requires(ModItems.PLATINUM_CHUNK_ITEM.value(), 4)
                .unlockedBy(getHasName(ModItems.PLATINUM_CHUNK_ITEM.value()),
                        this.has(ModItems.PLATINUM_CHUNK_ITEM.value()))
                .save(this.output);
        ShapedRecipeBuilder.shaped(this.itemLookup, RecipeCategory.TOOLS, ModItems.HORN_OF_SIGHT_ITEM.value())
                .define('#', Items.GOLD_INGOT)
                .define('H', Items.GOAT_HORN)
                .define('G', ModItems.HALLOWED_GEM_ITEM.value())
                .pattern(" G ")
                .pattern("#H#")
                .pattern(" # ")
                .unlockedBy(getHasName(ModItems.HALLOWED_GEM_ITEM.value()),
                        this.has(ModItems.HALLOWED_GEM_ITEM.value()))
                .save(this.output);
    }
}
