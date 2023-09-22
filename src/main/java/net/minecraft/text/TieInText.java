package net.minecraft.text;

import net.minecraft.text.component.TextComponent;
import net.mythos.text.MythicalText;

import java.util.List;

public class TieInText extends MutableText {

	private Style style;
	private List<Text> siblings;
	private TextComponent component;

	public TieInText(TextComponent component, List<Text> siblings, Style style) {
		super(component, siblings, style);
		this.style = style;
		this.component = component;
		this.siblings = siblings;
	}

	public TextComponent asComponent() {
		return this.component;
	}

	public List<Text> getSiblings() {
		return this.siblings;
	}

	// To-Do: This throws an error for *no* reason whatsoever. FIX IT PLEASE I'M BEGGING YOU
	public TieInText setStyle(Style style) {
		this.style = style;
		return this;
	}

}
