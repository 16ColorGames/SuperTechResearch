package com.sixteencolorgames.supertechresearch;

import com.sixteencolorgames.supertechresearch.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SuperTechResearchMod.MODID, name = SuperTechResearchMod.MODNAME, version = SuperTechResearchMod.VERSION, acceptedMinecraftVersions = "[1.10.2]")
public class SuperTechResearchMod {

    public static final String MODID = "supertechresearch";
    public static final String MODNAME = "Super Tech Research";
    public static final String VERSION = "1.0.0";
    @Mod.Instance(MODID)
    public static SuperTechResearchMod instance;

    /**
     * The proxy to be used. Holds various functions and objects that may need
     * to be different based on side.
     */
    @SidedProxy(clientSide = "com.sixteencolorgames.supertechresearch.proxy.ClientProxy", serverSide = "com.sixteencolorgames.supertechresearch.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(MODNAME + " is loading!");
        SuperTechResearchMod.proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        SuperTechResearchMod.proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        SuperTechResearchMod.proxy.postInit(event);
    }

}
