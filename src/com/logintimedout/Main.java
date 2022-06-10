package com.logintimedout;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
   @Override
   public void onEnable(){
           getCommand("rtp").setExecutor(new RandomTpCommand());
   }
   @Override
    public void onDisable(){

   }

}
