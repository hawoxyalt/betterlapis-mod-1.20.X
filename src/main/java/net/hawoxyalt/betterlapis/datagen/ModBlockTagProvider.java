package net.hawoxyalt.betterlapis.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hawoxyalt.betterlapis.block.ModBlocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {


    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.ENCHANTED_LAPIS_WALL);
        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.ENCHANTED_LAPIS_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.ENCHANTED_LAPIS_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.DOORS).add(ModBlocks.ENCHANTED_LAPIS_DOOR);
        getOrCreateTagBuilder(BlockTags.TRAPDOORS).add(ModBlocks.ENCHANTED_LAPIS_TRAPDOOR);
    }
}
