package net.hawoxyalt.betterlapis;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.hawoxyalt.betterlapis.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class BetterLapisClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENCHANTED_LAPIS_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENCHANTED_LAPIS_TRAPDOOR, RenderLayer.getCutout());
    }
}
