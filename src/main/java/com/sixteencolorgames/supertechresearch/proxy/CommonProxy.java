/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sixteencolorgames.supertechresearch.proxy;

import com.sixteencolorgames.supertechresearch.EventHandler;
import com.sixteencolorgames.supertechresearch.SuperTechResearchMod;
import com.sixteencolorgames.supertechresearch.network.GUIHandler;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

/**
 *
 * @author oa10712
 */
public class CommonProxy {

    public void init(FMLInitializationEvent event) {
        NetworkRegistry.INSTANCE.registerGuiHandler(SuperTechResearchMod.instance, new GUIHandler());
        FMLCommonHandler.instance().bus().register(new EventHandler());
    }

    public void preInit(FMLPreInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

}
