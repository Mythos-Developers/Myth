package net.mythos.text;

import net.minecraft.text.*;
import net.minecraft.text.component.TextComponent;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

public class MythicalText extends TieInText {

	private Style style;

	public MythicalText(TextComponent component, List<Text> siblings, Style style) {
		super(component, siblings, style);
		this.style = style;
	}

	public MythicalText color(int color) {
		this.style = style.withColor(color);
		return this;
	}

	public MythicalText bold(boolean bold) {
		this.style = style.withBold(bold);
		return this;
	}

	public MythicalText italic(boolean italic) {
		this.style = style.withItalic(italic);
		return this;
	}

	public MythicalText underline(boolean underline) {
		this.style = style.withUnderline(underline);
		return this;
	}

	public MythicalText obfuscate(boolean obfuscated) {
		this.style = style.withObfuscated(obfuscated);
		return this;
	}

	public MythicalText strikethrough(boolean strikethrough) {
		this.style = style.withStrikethrough(strikethrough);
		return this;
	}

	public MythicalText format(Formatting formatting) {
		this.style = style.withFormatting(formatting);
		return this;
	}

	public MythicalText format(Formatting... formattings) {
		this.style = style.withFormatting(formattings);
		return this;
	}

	public MythicalText click(ClickEvent click) {
		this.style = style.withClickEvent(click);
		return this;
	}

	public MythicalText hover(HoverEvent hover) {
		this.style = style.withHoverEvent(hover);
		return this;
	}

	public MythicalText font(Identifier font) {
		this.style = style.withFont(font);
		return this;
	}

}
