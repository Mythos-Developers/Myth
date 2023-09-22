package net.mythos.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

/**
 * Made for easy creation of armor materials, because the current method is awful and slow. Enjoy!
 * <p>
 * To use, make a new instance with your preferred durability values, noting that they
 * will be multiplied by 40 when applied to the armor itself, and protection values,
 * which will be taken at face value with no multiplication applied to them. This armor
 * material may then be implemented that quickly, plugging the instance directly into the
 * creation of an {@link net.minecraft.item.ArmorItem}.
 */

public class MythArmorMaterial implements ArmorMaterial {

	private int[] DURABILITY;
	private int[] PROTECTION;

	public MythArmorMaterial(int[] durability, int[] protection) {
		DURABILITY = durability;
		PROTECTION = protection;
	}

	@Override
	public int getDurability(ArmorItem.ArmorSlot slot) {
		return DURABILITY[slot.getEquipmentSlot().getEntitySlotId()] * 40;
	}

	@Override
	public int getProtection(ArmorItem.ArmorSlot slot) {
		return 0;
	}

	@Override
	public int getEnchantability() {
		return 0;
	}

	@Override
	public SoundEvent getEquipSound() {
		return null;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public float getToughness() {
		return 0;
	}

	@Override
	public float getKnockbackResistance() {
		return 0;
	}

}
