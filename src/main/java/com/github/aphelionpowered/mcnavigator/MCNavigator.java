package com.github.aphelionpowered.mcnavigator;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginDescriptionFile;
public class MCNavigator extends JavaPlugin {

  @Override
  public void onEnable(){
    
    PluginDescriptionFile pdfFile = this.getDescription();
    System.out.println(pdfFile.getName() + " has loaded.");
  }
  @Override
  public void onDisable(){
    PluginDescriptionFile pdfFile = this.getDescription();
    System.out.println(pdfFile.getName() + " has shutdown.");
  }
  
}
