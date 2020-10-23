package net.badbird5907.aetheriacore.spigot.api;

import net.badbird5907.aetheriacore.spigot.commands.utils.hush;
import net.badbird5907.aetheriacore.spigot.manager.permissionManager;
import net.badbird5907.aetheriacore.spigot.manager.pluginManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/**
 * The type Staff chat message.
 */
public class StaffChatMessage{
    /**
     * Sendmessage.
     *
     * @param sender  Shows the sender of the message
     * @param message The message
     */
    public static void sendmessage(String sender, String message){
        for (Player player : Bukkit.getOnlinePlayers()) {
            if(player.hasPermission(permissionManager.staffchat)){
                if(hush.hush.contains(player.getUniqueId())){
                    break;
                }
                else{
                    player.sendMessage(ChatColor.GOLD + "StaffChat" + ChatColor.DARK_GRAY + " » " + ChatColor.RESET + sender +": " + message);
                    pluginManager.log("StaffChat » " + sender + ": " + message);
                }
            }
            else {
                break;
            }
        }
    }
}
