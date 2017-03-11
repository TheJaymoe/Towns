package com.thejaymoe.towns.town;

import net.minecraft.entity.player.EntityPlayer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

/**
 * Created by Johnny on 2017-03-11.
 */
public class Town {
    private final LinkedHashMap<UUID, String> residents = new LinkedHashMap<UUID, String>();
    private final List<EntityPlayer> onlineResidents = new ArrayList<EntityPlayer>();

    private Mayor mayor;
    private String name;
    private String password;
    private boolean locked;
    private int age;

    public Town(Mayor mayor, String name){
        this.mayor = mayor;
        this.name = name;
        this.locked = true;
        this.age = 0;
    }

    public LinkedHashMap<UUID, String> getResidents() {
        return residents;
    }

    public List<EntityPlayer> getOnlineResidents() {
        return onlineResidents;
    }

    public boolean addOnlineResident(EntityPlayer player){
        return onlineResidents.add(player);
    }

    public boolean removeOnlineResident(EntityPlayer player){
        return onlineResidents.remove(player);
    }

    public String getName(){
        return name;
    }

    public Mayor getMayor(){
        return mayor;
    }

    public String getPassword(){
        return password;
    }

    public boolean isLocked(){
        return locked;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMayor(Mayor mayor){
        this.mayor = mayor;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setLocked(boolean locked){
        this.locked = locked;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean hasResident(String residentName){
        return this.getResidents().values().contains(residentName);
    }

    public boolean hasResident(UUID uuid){
        return this.getResidents().keySet().contains(uuid);
    }

}
