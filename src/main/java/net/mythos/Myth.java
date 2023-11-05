package net.mythos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.mythos.command.MythosCommand;
import net.mythos.text.MythicalStyle;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.QuiltLoader;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Myth implements ModInitializer {

	public static final String ID = "myth";
	public static final String NAME = "Myth";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize(ModContainer mod) {

		try {

			LOGGER.info("Start");
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			File dir = new File(QuiltLoader.getConfigDir() + "/mythos");
			File config = new File(QuiltLoader.getConfigDir() + "/mythos/myth.json");
			dir.mkdir();
			config.createNewFile();
			FileWriter writer = new FileWriter(config);

			LOGGER.info("Before {}", config.length());
			writer.write(gson.toJson(new MythicalStyle()));
			writer.flush();
			writer.close();
			LOGGER.info("After {}", config.length());

		} catch(IOException error) {
			LOGGER.error("Something went wrong.");
			LOGGER.error(error.getMessage());
		}

		LOGGER.info("Successfully loaded and initialized Myth.");
		MythosCommand.register();

	}

	public void registerCommands() {

	}

}
