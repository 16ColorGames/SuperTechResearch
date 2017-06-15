/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sixteencolorgames.supertechresearch.network;

import com.sixteencolorgames.supertechresearch.gui.GuiTutorial;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 *
 * @author oa10712
 */
public class GUIHandler implements IGuiHandler {

    public static final int RESEARCH_GUI = 0;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == RESEARCH_GUI) {
            return new GuiTutorial();
        }
        return null;
    }
}
