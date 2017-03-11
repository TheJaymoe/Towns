package com.thejaymoe.towns.proxy;

import com.thejaymoe.towns.block.ModBlocks;
import com.thejaymoe.towns.item.ModItems;
import com.thejaymoe.towns.utils.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Johnny on 2017-03-10.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        OBJLoader.INSTANCE.addDomain(Reference.MODID);
        register3DModel(Item.getItemFromBlock(ModBlocks.blockTownHall));
    }

    public void register3DModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    @Override
    public void init(FMLInitializationEvent event) {
        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
