package com.github.aphelionpowered.mcnavigator.utilities;
import java.util.logging.Logger;
import org.bukkit.command.CommandSender;
import org.bukkit.ChatColor;

public class Speaker {
  
  private static String prefix = "[Compass] " + ChatColor.WHITE;
  private static String suffix;
  private static Logger logger;

  public static void LogInfo(String message){
    logger.info(message);
  }
  
  public static void SendSuccess(CommandSender sender, String message){
    sender.sendMessage(ChatColor.GREEN + prefix + message);
  }
  
  public static void SendError(CommandSender sender, String message){
    sender.sendMessage(ChatColor.RED + prefix + message);
  }

  public static void denyConsole(CommandSender sender){
    SendError(sender, "This command may not be run as console.");
  }  

}
