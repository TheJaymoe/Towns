package com.thejaymoe.towns.block;

import com.thejaymoe.towns.block.townhall.BlockTownHall;
import com.thejaymoe.towns.utils.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Johnny on 2017-03-10.
 */
public class ModBlocks {

    public static BlockTownHall blockTownHall;

    public static void preInit(){
        blockTownHall = new BlockTownHall();

        registerBlocks();
    }

    public static void registerBlocks(){
        registerBlock(blockTownHall, "blockTownHall");
    }

    public static void registerBlock(Block block, String name){
        GameRegistry.register(block, new ResourceLocation(Reference.MODID, name));
        GameRegistry.register(new ItemBlock(block), new ResourceLocation(Reference.MODID, name));
    }

    public static void registerRenders() {
        //registerRender(blockTownHall);
    }

    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
