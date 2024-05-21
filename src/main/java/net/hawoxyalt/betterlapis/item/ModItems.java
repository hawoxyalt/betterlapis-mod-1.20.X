package net.hawoxyalt.betterlapis.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hawoxyalt.betterlapis.BetterLapis;
import net.hawoxyalt.betterlapis.item.custom.EnchantedLapisItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static final Item ENCHANTED_LAPIS = registerItem("enchanted_lapis", new EnchantedLapisItem(new FabricItemSettings().rarity(Rarity.RARE)));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(ENCHANTED_LAPIS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BetterLapis.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterLapis.LOGGER.info("Registering Mod items for "+ BetterLapis.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
