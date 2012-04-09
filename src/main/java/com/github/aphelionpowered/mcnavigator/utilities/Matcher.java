package com.github.aphelionpowered.mcnavigator.utilities;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;

public class Matcher {

 public static Player matchWithPlayer(CommandSender sender, String reqPlayer){

   List<Player> matchedPlayers = Bukkit.getServer().matchPlayer(reqPlayer);

   if (matchedPlayers.size() > 1){
     Speaker.tooManyMatches(sender);
     return null;
   }

   if (matchedPlayers.isEmpty()){
     Speaker.noMatches(sender);
     return null;
   }

   if (matchedPlayers.size() == 1){
     return matchedPlayers.get(0);
   }

   return null;
 } 
  
}
