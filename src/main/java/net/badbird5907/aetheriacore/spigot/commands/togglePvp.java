package net.badbird5907.aetheriacore.spigot.commands;

import net.badbird5907.aetheriacore.spigot.AetheriaCore;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class togglePvp implements CommandExecutor {
    AetheriaCore plugin;
    public togglePvp(AetheriaCore plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender player, Command command, String label, String[] args) {
        if(player.hasPermission("aetheriacore.togglepvp")){
        }
        return true;
    }
}
