package net.hawoxyalt.betterlapis.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.hawoxyalt.betterlapis.block.ModBlocks;
import net.hawoxyalt.betterlapis.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool rubyPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENCHANTED_LAPIS_BLOCK);

        rubyPool.stairs(ModBlocks.ENCHANTED_LAPIS_STAIRS);
        rubyPool.slab(ModBlocks.ENCHANTED_LAPIS_SLAB);
        rubyPool.button(ModBlocks.ENCHANTED_LAPIS_BUTTON);
        rubyPool.pressurePlate(ModBlocks.ENCHANTED_LAPIS_PRESSURE_PLATE);
        rubyPool.fence(ModBlocks.ENCHANTED_LAPIS_FENCE);
        rubyPool.fenceGate(ModBlocks.ENCHANTED_LAPIS_FENCE_GATE);
        rubyPool.wall(ModBlocks.ENCHANTED_LAPIS_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.ENCHANTED_LAPIS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ENCHANTED_LAPIS_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ENCHANTED_LAPIS, Models.GENERATED);
    }
}
