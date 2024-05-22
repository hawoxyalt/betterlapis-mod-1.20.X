package net.hawoxyalt.betterlapis.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hawoxyalt.betterlapis.block.ModBlocks;
import net.hawoxyalt.betterlapis.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.EXPERIENCE_BOTTLE, 64)
                .pattern(" L ")
                .pattern("LBL")
                .pattern(" L ")
                .input('B', Items.GLASS_BOTTLE)
                .input('L', ModItems.ENCHANTED_LAPIS)
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(Items.GLASS_BOTTLE))
                .criterion(hasItem(ModItems.ENCHANTED_LAPIS), conditionsFromItem(ModItems.ENCHANTED_LAPIS))
                .offerTo(exporter, new Identifier(getRecipeName(Items.EXPERIENCE_BOTTLE)));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ENCHANTED_LAPIS, RecipeCategory.DECORATIONS,
                ModBlocks.ENCHANTED_LAPIS_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.LAPIS_BLOCK, RecipeCategory.BUILDING_BLOCKS,
                ModItems.ENCHANTED_LAPIS, "lapis_block_to_enchanted_lapis", "building_blocks", "enchanted_lapis_to_lapis_block", "misc");

    }
}
