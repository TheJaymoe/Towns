package com.thejaymoe.towns.town;

import net.minecraft.entity.player.EntityPlayer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Johnny on 2017-03-11.
 */
public final class TownHandler {
    private  static List<Town> towns = new ArrayList<Town>();

    private TownHandler(){}

    public static void createTown(EntityPlayer player, String townName){
        Town town = new Town(new Mayor(player.getUniqueID(), player.getName()), townName);

        towns.add(town);
        addToTown(player, town);
    }

    public static void addToTown(EntityPlayer player, Town town){
        String playerName = player.getName();

    }

}
