package com.github.aphelionpowered.mcnavigator.commands;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.github.aphelionpowered.mcnavigator.utilities.Speaker;
import com.github.aphelionpowered.mcnavigator.utilities.Matcher;
import org.bukkit.entity.Player;
public class MCN {
  public static void Execute(CommandSender sender, String[] args){

    if (!sender.hasPermission("mcnavigator.mcn")){
      Speaker.noPermission(sender);
      return;
    }


  }


}
