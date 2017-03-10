package com.thejaymoe.towns.block.townhall;

import com.thejaymoe.towns.Towns;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Johnny on 2017-03-10.
 */
public class BlockTownHall extends Block{

    public BlockTownHall(){
        super(Material.ANVIL);
        this.setUnlocalizedName("blockTownHall");
        this.setCreativeTab(Towns.tabTowns);
        this.setHardness(10F);
        this.setResistance(1000F);
    }

}
