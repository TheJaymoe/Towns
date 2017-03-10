package com.thejaymoe.towns;

import com.thejaymoe.towns.block.ModBlocks;
import com.thejaymoe.towns.proxy.CommonProxy;
import com.thejaymoe.towns.tab.CreativeTabTowns;
import com.thejaymoe.towns.utils.Reference;
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
