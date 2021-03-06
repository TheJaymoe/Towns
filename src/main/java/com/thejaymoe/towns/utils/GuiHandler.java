package com.thejaymoe.towns.utils;

import com.thejaymoe.towns.gui.TownGui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public class GuiHandler implements IGuiHandler {

    public static final int TUTORIAL_GUI = 1;

    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

        if(tileEntity != null) {
            //if(ID == ModBlocks.GUI_ENUM.WHATEVER.ordinal()) {
            //    return new ContainerWhatever(player.inventory, (IInventory) tileEntity);
            //}
        }

        return null;
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        //TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

        //if(tileEntity != null) {
            //if(ID == KCBlocks.GUI_ENUM.SMELTER.ordinal()) {
            //    return new GuiSmelter(player.inventory, (IInventory) tileEntity);
            //}
        //}
        if(ID == TUTORIAL_GUI) {
            return new TownGui();
        }


        return null;
    }
}
