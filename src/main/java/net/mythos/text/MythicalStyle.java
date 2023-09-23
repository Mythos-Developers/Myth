package net.mythos.text;

import net.minecraft.text.*;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.mythos.util.Convert;
import org.jetbrains.annotations.Nullable;

/**
 * An easier to use version of a class I made a while back.
 * <br>
 * <br>
 * Implementation is very simple, and it works like this.
 * <br>
 * {@code Text.literal("Hello World").setStyle(new MythicalStyle().color(<some color>))}
 * <br>
 * <br>
 * Essentially, the class extends {@link net.minecraft.text.Style}, which allows it to
 * be plugged into the {@link net.minecraft.text.MutableText#setStyle(Style)} method. Then,
 * you can just run any of the methods here on the {@code MythicalStyle} in any order, and
 * they'll work just fine. This specifically fills a gap for custom text coloration in regular
 * modded Minecraft, and is super useful when implementing, say, rarity systems and the like.
 */

public class MythicalStyle extends TIStyle {

	public MythicalStyle() {
		super(TextColor.fromFormatting(Formatting.RESET), false, false, false, false, false, null, null, null, null);
	}

	public MythicalStyle(int color, boolean bold, boolean italic, boolean underline, boolean strikethrough, boolean obfuscate, @Nullable ClickEvent clickEvent, @Nullable HoverEvent hoverEvent, @Nullable String insertion, @Nullable Identifier font) {
		super(TextColor.fromRgb(color), bold, italic, underline, strikethrough, obfuscate, clickEvent, hoverEvent, insertion, font);
	}

	public static MythicalStyle create() {
		return new MythicalStyle();
	}

	/**
	 * A method that takes in a decimal color value and returns
	 * a Style with that text color.
	 * <br>
	 * @param color The decimal value of a text color.
	 * @return Style
	 * @see #color(String) 
	 */

	public Style color(int color) {
		return this.withColor(color);
	}

	/**
	 * Another version of the {@link #color(int)} method, this method
	 * supports hexadecimal color values instead of decimal color values.
	 * <br>
	 * @param color The hexadecimal value of a text color.
	 * @return Style
	 * @see #color(int) 
	 */
	
	public Style color(String color) {
		return this.withColor(Convert.hexToDec(color));
	}

	public Style bold(boolean bold) {
		return this.withBold(bold);
	}

	public Style italic(boolean italic) {
		return this.withItalic(italic);
	}

	public Style underline(boolean underline) {
		return this.withUnderline(underline);
	}

	public Style strikethrough(boolean strikethrough) {
		return this.withStrikethrough(strikethrough);
	}

	public Style obfuscate(boolean obfuscate) {
		return this.withObfuscated(obfuscate);
	}

	public Style click(@Nullable ClickEvent click) {
		return this.withClickEvent(click);
	}

	public Style hover(@Nullable HoverEvent hover) {
		return this.withHoverEvent(hover);
	}

	public Style insertion(@Nullable String insert) {
		return this.withInsertion(insert);
	}

	public Style font(@Nullable Identifier font) {
		return this.withFont(font);
	}

}
