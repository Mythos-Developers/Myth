package net.mythos.text;

import com.google.common.collect.Lists;
import net.minecraft.text.*;
import net.minecraft.text.component.TextComponent;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.mythos.Myth;

import java.util.List;

/**
 * {@code MythicalText} is a utility class for text that allows
 * for custom color usage outside of Minecraft's default formatting
 * codes and colors, as well as any other text modification that default
 * Minecraft supports. It also extends {@link net.minecraft.text.MutableText},
 * meaning that it can be used in any method or constructor that takes a
 * {@link net.minecraft.text.Text} parameter, and it will work perfectly fine.
 * <br>
 * <br>
 * It's pretty simple to use; the easiest way is to call the static method
 * {@link #literal(String text)}, which returns an instance of {@code MythicalText}.
 * Methods can then be called on this instance to change its appearance. Example:
 * <br>
 * <br>
 * {@code
 * 	context.getSource().sendSystemMessage(MythicalText.literal("Hello World").color(11362652));
 * }
 * <br>
 * <br>
 * This line will print {@code "Hello World"} to the chat in the decimal color
 * {@code 11362652}, and further methods can be appended in order to change the
 * text's appearance more.
 */

public class MythicalText extends TieInText {

	private Style style;

	public MythicalText(TextComponent component, List<Text> siblings, Style style) {
		super(component, siblings, style);
		this.style = style;
	}

	public static MythicalText create(TextComponent component) {
		return new MythicalText(component, Lists.newArrayList(), Style.EMPTY);
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

	public static MythicalText literal(String text) {
		return (MythicalText) Text.literal(text);
	}

}
