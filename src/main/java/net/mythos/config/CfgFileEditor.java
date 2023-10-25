package net.mythos.config;

import net.mythos.Myth;
import org.quiltmc.loader.api.QuiltLoader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CfgFileEditor {

	private static File configFile = new File(QuiltLoader.getConfigDir().toString() + "/myth/myth.cfg");

	public static void create() throws IOException {

		File mythDir = new File(QuiltLoader.getConfigDir().toString() + "/myth");

		mythDir.mkdir();
		configFile.createNewFile();

		write();

	}

	public static void write() throws IOException {
		if(configFile.getFreeSpace() == configFile.getTotalSpace()) {
			FileWriter writer = new FileWriter(configFile);

			writer.write("\ntest = 0;");

		}
	}

}
