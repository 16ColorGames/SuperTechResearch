/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sixteencolorgames.supertechresearch.gui;

import com.github.lunatrius.core.client.gui.GuiHelper;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 *
 * @author oa10712
 */
public class GuiTutorial extends GuiScreen {

    GuiButton a;
    GuiButton b;
    int xoff = 0, yoff = 0;
    int mx = -1, my = -1;

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        GuiHelper.drawItemStackWithSlot(Minecraft.getMinecraft().renderEngine, new ItemStack(Item.getByNameOrId("minecraft:apple")), xoff, yoff);
    }

    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        super.mouseClicked(mouseX, mouseY, mouseButton);
        mx = mouseX;
        my = mouseY;
    }

    /**
     * this method is used to calculate "drag" on the display
     *
     * @param mouseX
     * @param mouseY
     * @param clickedMouseButton
     * @param timeSinceLastClick
     */
    @Override
    protected void mouseClickMove(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick) {
        xoff += (mouseX - mx);
        yoff += (mouseY - my);
        mx = mouseX;
        my = mouseY;
        if (xoff < 0) {
            xoff = 0;
        }
        if (yoff < 0) {
            yoff = 0;
        }
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    @Override
    public void initGui() {
        //  this.buttonList.add(this.a = new GuiButton(0, this.width / 2 - 100, this.height / 2 - 24, "This is button a"));
        //  this.buttonList.add(this.b = new GuiButton(1, this.width / 2 - 100, this.height / 2 + 4, "This is button b"));
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        if (button == this.a) {
            //Main.packetHandler.sendToServer(...);
            this.mc.displayGuiScreen(null);
            if (this.mc.currentScreen == null) {
                this.mc.setIngameFocus();
            }
        }
        if (button == this.b) {
            //Main.packetHandler.sendToServer(...);
            this.mc.displayGuiScreen(null);
            if (this.mc.currentScreen == null) {
                this.mc.setIngameFocus();
            }
        }
    }
}
