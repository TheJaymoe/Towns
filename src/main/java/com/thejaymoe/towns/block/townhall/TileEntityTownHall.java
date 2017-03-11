package com.thejaymoe.towns.block.townhall;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityTownHall extends TileEntity {
    private String name = "Unnamed Town";

    public void createTown(String name){
        this.name = name + " Town";
        System.out.println("Townname set to: " + name + " @(TileEntityTownHall.java Line: 11)");
        markDirty();
    }

    public String getName(){
        return this.name;
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setString("name", this.name);
        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.name = compound.getString("name");
    }
}