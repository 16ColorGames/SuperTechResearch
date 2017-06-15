package com.sixteencolorgames.supertechresearch.proxy;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.lwjgl.input.Keyboard;

/**
 * Clientside only functions
 *
 * @author oa10712
 *
 */
public class ClientProxy extends CommonProxy {

    public static KeyBinding[] keyBindings;

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
// declare an array of key bindings
        keyBindings = new KeyBinding[1];

// instantiate the key bindings
        keyBindings[0] = new KeyBinding("key.research.desc", Keyboard.KEY_Y, "key.str.category");

// register all the key bindings
        for (KeyBinding bind : keyBindings) {
            ClientRegistry.registerKeyBinding(bind);
        }
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}
