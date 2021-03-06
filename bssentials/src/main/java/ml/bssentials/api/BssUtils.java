package ml.bssentials.api;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import ml.bssentials.main.Bssentials;

public class BssUtils {

	/**
	 * Checks if the player has permission for the command!
	 * 
	 * @author Bssentials
	 * */
	public static boolean hasPermForCommand(Player p, String command) {
		return (p.isOp() | p.hasPermission("bssentials.command"+command) | p.hasPermission("essentials."+command) | p.hasPermission("accentials.command"+command) | p.hasPermission("dssentials.command"+command) | p.hasPermission("bssentials.command.*") | p.hasPermission("se."+command));
	}
	
	/**
	 * Send the no permission message to the player!
	 * 
	 * @author Bssentials
	 * */
	public static void noPermMsg(Player p) {
		p.sendMessage(Bssentials.prefix + "No Permisson!");
	}
    
    /**
	 * Send the no permission message to the player!
	 * 
	 * @author Bssentials
	 */
	public static void noPermMsg(Player p, Command c) {
		p.sendMessage(Bssentials.prefix + "You don't have permission: bssentials.command." + c.getName().toLowerCase());
	}
    
	
	/**
	 * Broadcast an message to the server
	 **/
	public static void broadcastMessage(Object message) {
		Bukkit.broadcastMessage(message.toString());
	}
	
	
	/**
	 *  Save config files
	 */
	public static void saveConf(FileConfiguration config, File file) {
        try {
            config.save(file); 
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("[Bssentials] Could not save file " + file.getName());
        }
    }

}
