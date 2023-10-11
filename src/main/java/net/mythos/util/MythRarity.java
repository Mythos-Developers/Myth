package net.mythos.util;

public enum MythRarity {

	COMMON(16777215),
	UNCOMMON(3700253),
	RARE(1136076),
	EPIC(6770343),
	LEGENDARY(15110456),
	MYTHIC(4555150),
	DIVINE(15374745);

	private int color;

	private MythRarity(int color) {
		this.color = color;
	}

	public int getColor() {
		return color;
	}

}
