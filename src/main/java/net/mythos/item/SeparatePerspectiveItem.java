package net.mythos.item;

import net.minecraft.client.util.ModelIdentifier;

public class SeparatePerspectiveItem extends MythItem {

	private ModelIdentifier guiModel;

	public SeparatePerspectiveItem(ModelIdentifier guiModel) {
		this.guiModel = guiModel;
	}

	public SeparatePerspectiveItem(String modId, String modelName) {
		this.guiModel = new ModelIdentifier(modId, modelName, "inventory");
	}

	public SeparatePerspectiveItem(String modId, String modelName, String variant) {
		this.guiModel = new ModelIdentifier(modId, modelName, variant);
	}

	public ModelIdentifier getGuiModel() {
		return guiModel;
	}

}
