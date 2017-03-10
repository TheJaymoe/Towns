package com.thejaymoe.towns.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/**
 * Created by Johnny on 2017-03-10.
 */
public class CreativeTabTowns extends CreativeTabs{

    public CreativeTabTowns(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Blocks.ANVIL);
    }
}
