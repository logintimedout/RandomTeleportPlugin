package com.logintimedout;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;

import java.util.Random;


public class RandomTpCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
            Player p = (Player) commandSender;


            p.teleport(teleportutils.generateLocation(p));
            p.sendMessage(ChatColor.DARK_BLUE+"You Have Been teleported to a Random Location");


        }









        return true;
    }
}
