package com.thejaymoe.towns.item;

import com.thejaymoe.towns.Towns;
import net.minecraft.item.Item;

/**
 * Created by Johnny on 2017-03-10.
 */
public class ItemTownHall extends Item{

    public ItemTownHall(String name) {
        setUnlocalizedName(name);
        setCreativeTab(Towns.tabTowns);
    }
}
