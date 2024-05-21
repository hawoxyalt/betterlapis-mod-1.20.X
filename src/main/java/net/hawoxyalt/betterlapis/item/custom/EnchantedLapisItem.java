package net.hawoxyalt.betterlapis.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnchantedLapisItem extends Item {
    public EnchantedLapisItem(Settings settings) {
        super(settings);
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

}
