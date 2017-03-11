package com.thejaymoe.towns.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

public class TownGui extends GuiScreen {

    private int closebutton, actionbutton;

    public TownGui() {

    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();

        this.fontRenderer.drawString("Towns", width / 2 - 27, 50, 0xFF80000);

        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    @Override
    public void initGui() {
        closebutton = 0;
        actionbutton = 1;

        this.buttonList.add(new GuiButton(closebutton, this.width - 20, 0, "x"));
        this.buttonList.add(new GuiButton(actionbutton, this.width / 2 - 100, this.height / 2 - 24, "A BUTTON TO PRESS"));
        //this.buttonList.add(this.a = new GuiButton(0, this.width / 2 - 100, this.height / 2 - 24, "this is button a"));
        //this.buttonList.add(this.b = new GuiButton(1, this.width / 2 - 100, this.height / 2 + 4, "This is button b"));

        super.initGui();
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode) throws IOException {
        super.keyTyped(typedChar, keyCode);
    }

    @Override
    public void actionPerformed(GuiButton button) throws IOException {
        switch(button.id) {
            case 0:
                this.mc.player.closeScreen();
                break;
            default:
                break;
        }
        super.actionPerformed(button);
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
    }

}
