package net.mythos.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import org.jetbrains.annotations.Nullable;

/**
 * Made for easy creation of armor materials, because the current method is awful, slow,
 * and requires the creation of an entire new class to be used. This is a much simpler
 * method designed for repeated use with multiple different armor materials.
 * <br>
 * <br>
 * To use, make a new instance with your preferred durability values, noting that they
 * will be multiplied by 40 when applied to the armor itself, and protection values,
 * which will be taken at face value with no multiplication applied to them. This armor
 * material may then be implemented simply and quickly, plugging the instance directly into
 * the material parameter of an {@link net.minecraft.item.ArmorItem}.
 * <br>
 * <br>
 * It's important to note the order of numbers in the durability and protection values. They
 * are ordered as {@code boots, leggings, chestplate, helmet} for reference. Ensure you input
 * them correctly, or the incorrect values will be assigned to the armor.
 */

public class MythArmorMaterial implements ArmorMaterial {

	private int[] durabilityValues;
	private int[] protectionValues;
	private int enchantability;
	private SoundEvent equipSound;
	private Ingredient repairIngredient;
	private String name;
	private float toughness;
	private float knockbackResistance;

	public MythArmorMaterial(int[] durability, int[] protection, int enchantability, SoundEvent equipSound, @Nullable Ingredient repairWith, String name, float toughness, float knockbackResistance) {
		durabilityValues = durability;
		protectionValues = protection;
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.repairIngredient = repairWith;
		this.name = name;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
	}

	@Override
	public int getDurability(ArmorItem.ArmorSlot slot) {
		return durabilityValues[slot.getEquipmentSlot().getEntitySlotId()] * 40;
	}

	@Override
	public int getProtection(ArmorItem.ArmorSlot slot) {
		return protectionValues[slot.getEquipmentSlot().getEntitySlotId()];
	}

	@Override
	public int getEnchantability() {
		return enchantability;
	}

	@Override
	public SoundEvent getEquipSound() {
		return equipSound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return repairIngredient;
	}

	@Override
	public String getName() {
		return name.toLowerCase();
	}

	@Override
	public float getToughness() {
		return toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return knockbackResistance;
	}

}
