package com.github.aphelionpowered.mcnavigator;

import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;
public class MCNavigator extends JavaPlugin {

  Logger log;

  public void onEnable(){
    log = this.getLogger();
    log.info("MCNavigator Enabled");
  }
  public void onDisable(){
    log = this.getLogger();
    log.info("MCNavigator Disabled");
  }
  
}
