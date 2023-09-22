package net.minecraft.text;

import net.minecraft.text.component.TextComponent;

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

	// TODO I don't feel like fixing this right now bc i'm lazy
	public List<Text> setStyle(Style style) {
		return null;
	}

}
