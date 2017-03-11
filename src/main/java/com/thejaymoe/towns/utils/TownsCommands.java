package com.thejaymoe.towns.utils;

import com.thejaymoe.towns.Towns;
import com.thejaymoe.towns.gui.TownGui;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;

public class TownsCommands extends CommandBase {

    @Override
    public String getName() {
        return "towns";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "commands.towns.usage";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if(args.length < 1) {
            throw new WrongUsageException("commands.towns.usage", new Object[0]);
        } else {
            String arg1 = args[0];
            String arg2 = args.length >= 2 ? args[1] : "";

            System.out.println("arg:"+arg1);

            EntityPlayer ep = getCommandSenderAsPlayer(sender);

            if(arg1.matches("\\bcreate")) {
                ep.sendMessage(new TextComponentString("Creating Town!"));
            } else if(arg1.matches("\\bjoin")) {
                if(arg2.length() == 0) {
                    ep.sendMessage(new TextComponentString("Usage: /towns join <town_id>"));
                } else {
                    String town_id = arg2;
                    ep.sendMessage(new TextComponentString("Joining town with ID: "+town_id));
                }
            } else if(arg1.matches("\\binvite")) {
                if(arg2.length() == 0) {
                    ep.sendMessage(new TextComponentString("Usage: /towns invite <player name>"));
                } else {
                    EntityPlayerMP player = getPlayer(server, sender, arg2);
                    ep.sendMessage(new TextComponentString("Inviting " + player.getName() + " to Town!"));
                }
            } else if(arg1.matches("\\bstatus")) {
                ep.sendMessage(new TextComponentString("Status of Town!"));
            } else if(arg1.matches("\\bopen")) {
                if(!ep.world.isRemote) {
                    //ep.openGui(Towns.instance, 1, ep.world, ep.getPosition().getX(), ep.getPosition().getY(), ep.getPosition().getZ());
                    Minecraft.getMinecraft().displayGuiScreen(new TownGui());
                }
                ep.sendMessage(new TextComponentString("Opening GUI"));
            }
        }
    }
}
