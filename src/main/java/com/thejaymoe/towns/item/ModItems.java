package com.thejaymoe.towns.item;

import com.thejaymoe.towns.utils.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Johnny on 2017-03-10.
 */
public class ModItems {

    public static Item itemTownHall;

    public static void preInit(){
        //itemTownHall = new ItemTownHall("itemTownHall");

        registerItems();
    }

    public static void registerItems(){
        //GameRegistry.register(itemTownHall, new ResourceLocation(Reference.MODID, "itemTownHall"));
    }

    public static void registerRenders(){}

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
