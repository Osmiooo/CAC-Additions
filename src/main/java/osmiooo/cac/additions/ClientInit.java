package osmiooo.cac.additions;

import net.minecraft.client.render.RenderLayer;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.ClientModInitializer;

public class ClientInit implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(CACAdditions.Icy_Stone_BLOCK, RenderLayer.getCutoutMipped());
		HudRenderCallback.EVENT.register((matrices, tickDelta) -> {
		});
		ClientTickEvents.END_CLIENT_TICK.register((client) -> {
		});
	}
}
