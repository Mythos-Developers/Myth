package net.mythos.config;

import java.util.HashMap;

public class MythosConfig {

	private final HashMap<String, ConfigParam> registry = new HashMap<>();

	public MythosConfig() {
	}

	public static MythosConfig create() {
		return new MythosConfig();
	}

	public void createFile() {

	}

	public Object getValue(String key) {
		return registry.get(key).read();
	}

	public MythosConfig addBoolean(String key, boolean defaultValue) {
		registry.put(
			key,
			new ConfigParam<Boolean>(defaultValue)
		);
		return this;
	}

	public MythosConfig addInt(String key, int defaultValue) {
		registry.put(
			key,
			new ConfigParam<Integer>(defaultValue)
		);
		return this;
	}

}
