package net.mythos;

import net.fabricmc.fabric.impl.client.model.loading.ModelLoadingPluginManager;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.mythos.item.SeparatePerspectiveItem;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.minecraft.ClientOnly;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

@ClientOnly
public class MythClient implements ClientModInitializer {

	@Override
	public void onInitializeClient(ModContainer mod) {

		ModelLoadingPluginManager.registerPlugin((resources) -> {

			for(Item item : Registries.ITEM.stream().toList()) {
				if(item instanceof SeparatePerspectiveItem) {
					resources.addModels(((SeparatePerspectiveItem) item).getGuiModel());
				}
			}

		});

	}

}
