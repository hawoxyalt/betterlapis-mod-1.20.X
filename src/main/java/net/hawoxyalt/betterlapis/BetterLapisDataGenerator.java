package net.hawoxyalt.betterlapis;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.hawoxyalt.betterlapis.datagen.ModBlockTagProvider;
import net.hawoxyalt.betterlapis.datagen.ModModelProvider;
import net.hawoxyalt.betterlapis.datagen.ModRecipeProvider;

public class BetterLapisDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
	}
}
