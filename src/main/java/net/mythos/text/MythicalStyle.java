package net.mythos.text;

import net.minecraft.text.*;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.mythos.util.Convert;
import org.jetbrains.annotations.Nullable;

/**
 * An easier to use version of a class I made a while back.
 *
 * <p>Implementation is very simple, and it works like this.
 * <blockquote>
 * {@code Text.literal("Hello World").setStyle(new MythicalStyle().color(<some color>))}
 * </blockquote>
 * Essentially, the class extends {@link net.minecraft.text.Style}, which allows it to
 * be plugged into the {@link net.minecraft.text.MutableText#setStyle(Style)} method. Then,
 * you can just run any of the methods here on the {@code MythicalStyle} in any order, and
 * they'll work just fine. This specifically fills a gap for custom text coloration in regular
 * modded Minecraft, and is super useful when implementing, say, rarity systems and the like.
 */

public class MythicalStyle extends TIStyle {

	Style style;

	public MythicalStyle() {
		super(TextColor.fromFormatting(Formatting.RESET), false, false, false, false, false, null, null, null, null);
		style = new TIStyle(TextColor.fromFormatting(Formatting.RESET), false, false, false, false, false, null, null, null, null);
	}

	public MythicalStyle(int color, boolean bold, boolean italic, boolean underline, boolean strikethrough, boolean obfuscate, @Nullable ClickEvent clickEvent, @Nullable HoverEvent hoverEvent, @Nullable String insertion, @Nullable Identifier font) {
		super(TextColor.fromRgb(color), bold, italic, underline, strikethrough, obfuscate, clickEvent, hoverEvent, insertion, font);
	}

	public static MythicalStyle create() {
		return new MythicalStyle();
	}

	/**
	 * A method that takes in a decimal color value and this.style =s
	 * a Style with that text color.
	 * <br>
	 * @param color The decimal value of a text color.
	 * @return MythicalStyle
	 * @see #color(String)
	 */

	public MythicalStyle color(int color) {
		this.style = style.withColor(color);
		return this;
	}

	/**
	 * Another version of the {@link #color(int)} method, this method
	 * supports hexadecimal color values instead of decimal color values.
	 * <br>
	 * @param color The hexadecimal value of a text color.
	 * @return MythicalStyle
	 * @see #color(int)
	 */

	public MythicalStyle color(String color) {
		this.style = style.withColor(Convert.hexToDec(color));
		return this;
	}

	public MythicalStyle bold(boolean bold) {
		this.style = style.withBold(bold);
		return this;
	}

	public MythicalStyle italic(boolean italic) {
		this.style = style.withItalic(italic);
		return this;
	}

	public MythicalStyle underline(boolean underline) {
		this.style = style.withUnderline(underline);
		return this;
	}

	public MythicalStyle strikethrough(boolean strikethrough) {
		this.style = style.withStrikethrough(strikethrough);
		return this;
	}

	public MythicalStyle obfuscate(boolean obfuscate) {
		this.style = style.withObfuscated(obfuscate);
		return this;
	}

	public MythicalStyle click(@Nullable ClickEvent click) {
		this.style = style.withClickEvent(click);
		return this;
	}

	public MythicalStyle hover(@Nullable HoverEvent hover) {
		this.style = style.withHoverEvent(hover);
		return this;
	}

	public MythicalStyle insertion(@Nullable String insert) {
		this.style = style.withInsertion(insert);
		return this;
	}

	public MythicalStyle font(@Nullable Identifier font) {
		this.style = style.withFont(font);
		return this;
	}

	public Style build() {
		return style;
	}

}
