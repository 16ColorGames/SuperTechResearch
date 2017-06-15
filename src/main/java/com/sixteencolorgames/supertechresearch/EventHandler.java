/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sixteencolorgames.supertechresearch;

import com.sixteencolorgames.supertechresearch.network.GUIHandler;
import com.sixteencolorgames.supertechresearch.proxy.ClientProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 *
 * @author oa10712
 */
public class EventHandler {

    private static final Minecraft mc = Minecraft.getMinecraft();

    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
    public void onEvent(KeyInputEvent event) {

        // make local copy of key binding array
        KeyBinding[] keyBindings = ClientProxy.keyBindings;

        // check each enumerated key binding type for pressed and take appropriate action
        if (keyBindings[0].isPressed()) {

            if (mc.currentScreen == null) {
                mc.thePlayer.openGui(SuperTechResearchMod.instance, GUIHandler.RESEARCH_GUI, mc.theWorld, (int) mc.thePlayer.posX, (int) mc.thePlayer.posY, (int) mc.thePlayer.posZ);
            }
            // do stuff for this key binding here
            // remember you may need to send packet to server
        }
    }
}
