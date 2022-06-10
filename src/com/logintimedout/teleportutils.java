package com.logintimedout;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.Random;

public class teleportutils {

    public static Location generateLocation(Player player) {

        Random random = new Random();


        int x = random.nextInt(1000);
        int y = 75;
        int z = random.nextInt(1000);


        Location randomLocation = new Location(player.getWorld(), x, y, z);


        y = randomLocation.getWorld().getHighestBlockYAt(randomLocation);
        randomLocation.setY(y);


        return randomLocation;
    }

    public static boolean isLocationsSafe(Location location) {
        int x = location.getBlockX();
        int y = location.getBlockY();
        int z = location.getBlockZ();


        Block block = location.getWorld().getBlockAt(x, y, z);
        Block below = location.getWorld().getBlockAt(x, y, z);
        return true;
    }





}
