package net.badbird5907.aetheriacore.spigot.commands.trolls;

import net.badbird5907.aetheriacore.spigot.manager.permissionManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static de.myzelyam.api.vanish.VanishAPI.isInvisible;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;
import static org.bukkit.Bukkit.getOnlinePlayers;

public class MassSay implements CommandExecutor {
	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
		if (sender.hasPermission(permissionManager.MassSay)) for (Player player : getOnlinePlayers()) {
			if (isInvisible(player)) break;
			player.chat(stream(args).map(arg -> arg + " ").collect(joining()).trim());
		}
		return true;
	}
}