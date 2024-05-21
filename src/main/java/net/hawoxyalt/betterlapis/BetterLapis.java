package net.hawoxyalt.betterlapis;

import net.fabricmc.api.ModInitializer;

import net.hawoxyalt.betterlapis.block.ModBlocks;
import net.hawoxyalt.betterlapis.item.ModItemGroups;
import net.hawoxyalt.betterlapis.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterLapis implements ModInitializer {
	public static final String MOD_ID = "betterlapis";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		LOGGER.info("Hello, world!");
	}
}