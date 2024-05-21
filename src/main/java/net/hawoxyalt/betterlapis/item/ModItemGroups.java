package net.hawoxyalt.betterlapis.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hawoxyalt.betterlapis.BetterLapis;
import net.hawoxyalt.betterlapis.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ENCHANTED_LAPIS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BetterLapis.MOD_ID, "enchanted_lapis"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.enchanted_lapis"))
                    .icon(() -> new ItemStack(ModItems.ENCHANTED_LAPIS)).entries((displayContext, entries) -> {


                        entries.add(ModItems.ENCHANTED_LAPIS);
                        entries.add(ModBlocks.ENCHANTED_LAPIS_BLOCK);

                        entries.add(ModBlocks.ENCHANTED_LAPIS_STAIRS);
                        entries.add(ModBlocks.ENCHANTED_LAPIS_SLAB);
                        entries.add(ModBlocks.ENCHANTED_LAPIS_PRESSURE_PLATE);
                        entries.add(ModBlocks.ENCHANTED_LAPIS_BUTTON);
                        entries.add(ModBlocks.ENCHANTED_LAPIS_WALL);
                        entries.add(ModBlocks.ENCHANTED_LAPIS_FENCE);
                        entries.add(ModBlocks.ENCHANTED_LAPIS_FENCE_GATE);
                        entries.add(ModBlocks.ENCHANTED_LAPIS_DOOR);
                        entries.add(ModBlocks.ENCHANTED_LAPIS_TRAPDOOR);


                    }).build());

    public static void registerItemGroups() {
        BetterLapis.LOGGER.info("Registering Item Groups for " + BetterLapis.MOD_ID);
    }
}
