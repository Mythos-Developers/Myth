package net.mythos.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import net.mythos.util.MythRarity;
import org.apache.http.annotation.Contract;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class MythItem extends Item {

	MythRarity rarity;

	public MythItem() {
		super(new QuiltItemSettings());
		rarity = null;
	}

	public MythItem(Settings settings) {
		super(settings);
		rarity = null;
	}

	public MythItem(MythRarity rarity) {
		super(new QuiltItemSettings());
		this.rarity = rarity;
	}

	public MythItem(MythRarity rarity, Settings settings) {
		super(settings);
		this.rarity = rarity;
	}

	@Override
	public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
	}

}
