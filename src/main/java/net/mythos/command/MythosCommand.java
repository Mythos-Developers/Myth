package net.mythos.command;

import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import net.minecraft.text.Text;
import net.mythos.text.MythicalStyle;
import org.quiltmc.qsl.command.api.CommandRegistrationCallback;

import static net.minecraft.server.command.CommandManager.argument;
import static net.minecraft.server.command.CommandManager.literal;

public class MythosCommand {

	public static void register() {
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("myth")
			/*.then(
				literal("config")
			) */
			.then(
				literal("version")
					.executes(context -> {

						context.getSource().sendSystemMessage(Text.literal("Myth v0.0.2").setStyle(MythicalStyle.create().color(0xb94fd9).build()));

						return 1;
					})
			)
			.then(
				literal("about")
					.executes(context -> {

						context.getSource().sendSystemMessage(Text.literal("A library with common code for Mythos projects.").setStyle(MythicalStyle.create().color(0xb94fd9).build()));

						return 1;
					})
			)
		));
	}

}
