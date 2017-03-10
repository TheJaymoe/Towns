package com.thejaymoe.towns;

import com.thejaymoe.towns.block.ModBlocks;
import com.thejaymoe.towns.proxy.CommonProxy;
import com.thejaymoe.towns.tab.CreativeTabTowns;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Johnny on 2017-03-10.
 */

@Mod(modid = Towns.MODID, version = Towns.VERSION, name = Towns.NAME)
public class Towns {
    public static final String MODID = "towns";
    public static final String VERSION = "1.0.0";
    public static final String NAME = "Towns";

    @SidedProxy(clientSide = "com.thejaymoe.towns.proxy.ClientProxy", serverSide = "com.thejaymoe.towns.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Towns instance;

    public static CreativeTabTowns tabTowns;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        tabTowns = new CreativeTabTowns(CreativeTabs.getNextID(), "tabTowns");
        ModBlocks.init();
        proxy.preInit(event);
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

}
