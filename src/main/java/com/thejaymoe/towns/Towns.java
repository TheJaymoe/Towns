package com.thejaymoe.towns;

import com.thejaymoe.towns.block.ModBlocks;
import com.thejaymoe.towns.item.ModItems;
import com.thejaymoe.towns.proxy.CommonProxy;
import com.thejaymoe.towns.tab.CreativeTabTowns;
import com.thejaymoe.towns.utils.GuiHandler;
import com.thejaymoe.towns.utils.Reference;
import com.thejaymoe.towns.utils.TownsCommands;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

/**
 * Created by Johnny on 2017-03-10.
 */

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)
public class Towns {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.Instance
    public static Towns instance;

    public static CreativeTabTowns tabTowns;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        tabTowns = new CreativeTabTowns(CreativeTabs.getNextID(), "tabTowns");
        ModItems.preInit();
        ModBlocks.preInit();
        proxy.preInit(event);

        NetworkRegistry.INSTANCE.registerGuiHandler(Towns.instance, new GuiHandler());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        MinecraftForge.EVENT_BUS.register(new TownsEventHandler());
        proxy.postInit(event);
    }

    @Mod.EventHandler
    public void onServerStart(FMLServerStartingEvent event) {
        MinecraftServer server = event.getServer();
        ICommandManager command = server.getCommandManager();
        ServerCommandManager manager = (ServerCommandManager) command;

        manager.registerCommand(new TownsCommands());
    }

}
