package com.github.aphelionpowered.mcnavigator.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.github.aphelionpowered.mcnavigator.utilities.Speaker;
import com.github.aphelionpowered.mcnavigator.utilities.Matcher;

public class Point {
  public static void Execute(CommandSender sender, String[] args){

    if (!(sender instanceof Player)){
      Speaker.denyConsole(sender);
      return;
    } 

    if (!sender.hasPermission("mcnavigator.point")){
      Speaker.noPermission(sender);
      return;
    }

    if (args.length > 1){
      Speaker.tooManyArguments(sender); 
      return;
    }

    if (args.length == 1){
      Player matchedPlayer = Matcher.matchWithPlayer(sender, args[0]);

      return;
    }
 return; 
  }
}
