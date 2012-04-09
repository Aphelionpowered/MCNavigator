package com.github.aphelionpowered.mcnavigator;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import com.github.aphelionpowered.mcnavigator.commands.*;
public class MCNavigator extends JavaPlugin {

  @Override
  public void onEnable(){
    
    PluginDescriptionFile pdfFile = this.getDescription();
    System.out.println(pdfFile.getName() + " by Mentioum has loaded.");
    System.out.println(pdfFile.getName() + " Made for the Aphelion community - http://forum.aphelionpowered.com");

  }
  @Override
  public void onDisable(){
    PluginDescriptionFile pdfFile = this.getDescription();
    System.out.println(pdfFile.getName() + " has shutdown.");
  }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    
        if(label.equalsIgnoreCase("point")) Point.Execute(sender,args);
        return true;
    };
  
}
