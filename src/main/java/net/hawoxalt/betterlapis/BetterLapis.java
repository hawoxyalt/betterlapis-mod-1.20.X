package net.hawoxalt.betterlapis;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterLapis implements ModInitializer {
	public static final String MOD_ID = "betterlapis";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		LOGGER.info("Hello, world!");
	}
}