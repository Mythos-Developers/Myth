package net.mythos.config;

import com.ibm.icu.impl.Pair;
import net.mythos.Myth;
import org.quiltmc.loader.api.QuiltLoader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.util.ArrayList;
import java.util.HashMap;

public class MythosConfig {

	private HashMap<String, ConfigParam> registry = new HashMap<>();

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

}
