package net.minecraft.text;

import net.minecraft.text.component.TextComponent;

import java.util.List;

public class TieInText extends MutableText {

	private Style style;

	public TieInText(TextComponent component, List<Text> siblings, Style style) {
		super(component, siblings, style);
		this.style = style;
	}

	// Please don't use this, it's just here to stop the code from erroring.
	public TieInText setStyle(Style style) {
		this.style = style;
		return this;
	}

}
