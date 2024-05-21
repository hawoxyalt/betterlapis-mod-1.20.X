package net.hawoxyalt.betterlapis.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hawoxyalt.betterlapis.BetterLapis;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block ENCHANTED_LAPIS_BLOCK = registerBlock("enchanted_lapis_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).sounds(BlockSoundGroup.METAL)));

    public static final Block ENCHANTED_LAPIS_STAIRS = registerBlock("enchanted_lapis_stairs",
            new StairsBlock(ModBlocks.ENCHANTED_LAPIS_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block ENCHANTED_LAPIS_SLAB = registerBlock("enchanted_lapis_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));

    public static final Block ENCHANTED_LAPIS_BUTTON = registerBlock("enchanted_lapis_button",
            new ButtonBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block ENCHANTED_LAPIS_PRESSURE_PLATE = registerBlock("enchanted_lapis_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copy(Blocks.IRON_BLOCK), BlockSetType.IRON));

    public static final Block ENCHANTED_LAPIS_FENCE = registerBlock("enchanted_lapis_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block ENCHANTED_LAPIS_FENCE_GATE = registerBlock("enchanted_lapis_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK), WoodType.ACACIA));
    public static final Block ENCHANTED_LAPIS_WALL = registerBlock("enchanted_lapis_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));


    public static final Block ENCHANTED_LAPIS_DOOR = registerBlock("enchanted_lapis_door",
            new DoorBlock(FabricBlockSettings.copy(Blocks.IRON_DOOR).nonOpaque(), BlockSetType.IRON));

    public static final Block ENCHANTED_LAPIS_TRAPDOOR = registerBlock("enchanted_lapis_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copy(Blocks.GLASS).nonOpaque(), BlockSetType.IRON));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BetterLapis.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BetterLapis.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        BetterLapis.LOGGER.info("Registering ModBlocks for " + BetterLapis.MOD_ID);
    }
}
