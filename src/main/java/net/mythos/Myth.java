package net.mythos;

import net.mythos.command.MythosCommand;
import net.mythos.config.CfgFileEditor;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.QuiltLoader;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Myth implements ModInitializer {

	public static final String ID = "myth";
	public static final String NAME = "Myth";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize(ModContainer mod) {

		try {

			File configDir = new File(QuiltLoader.getConfigDir().toString());
			File mythDir = new File(QuiltLoader.getConfigDir().toString() + "/myth");
			File configFile = new File(QuiltLoader.getConfigDir().toString() + "/myth/myth.cfg");

			if(!mythDir.exists()) {
				CfgFileEditor.create();
				CfgFileEditor.write();
			}

			LOGGER.info(String.valueOf(configFile.getTotalSpace()));

		} catch(IOException error) {
			LOGGER.error("Could not load config file for Myth");
		}

		LOGGER.info("Successfully loaded and initialized Myth.");
		LOGGER.info(QuiltLoader.getConfigDir().toString());
		MythosCommand.register();

	}

	public void registerCommands() {

	}

}
