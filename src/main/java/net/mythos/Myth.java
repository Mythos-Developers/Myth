package net.mythos;

import net.minecraft.text.Text;
import net.mythos.text.MythicalStyle;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.command.api.CommandRegistrationCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.server.command.CommandManager.literal;

public class Myth implements ModInitializer {

	public static final String ID = "myth";
	public static final String NAME = "Myth";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Successfully loaded and initialized Myth.");

		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("foo")
				.executes(context -> {

					LOGGER.debug("The command started running");
					context.getSource().sendSystemMessage(Text.literal("Hello World").setStyle(new MythicalStyle().color(0x825683).bold(true).build()));
					LOGGER.debug("The command ran successfully");
					return 1;

				})));

	}

}
