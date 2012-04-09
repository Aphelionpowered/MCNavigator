package com.github.aphelionpowered.mcnavigator.utilities;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandSender;

public class Matcher {

 public static Player matchWithPlayer(String reqPlayer){

   List<Player> matchedPlayers = Bukkit.getServer().matchPlayer(reqPlayer);

   if (matchedPlayers.size() > 1){

   }

   if (matchedPlayers.size() == 1){

   }

   return null;
 } 
  
}
