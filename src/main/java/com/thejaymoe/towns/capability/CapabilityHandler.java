package com.thejaymoe.towns.capability;

/**
 * Created by Johnny on 2017-03-11.
 */

import com.thejaymoe.towns.utils.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CapabilityHandler

{

    public static final ResourceLocation MANA_CAP = new ResourceLocation(Reference.MODID, "mana");



    @SubscribeEvent
    public void attachCapability(AttachCapabilitiesEvent.Entity event)

    {
        if (!(event.getEntity() instanceof EntityPlayer)) return;

        event.addCapability(MANA_CAP, new ManaProvider());

    }

}