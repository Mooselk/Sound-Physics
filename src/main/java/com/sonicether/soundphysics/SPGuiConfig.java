package com.sonicether.soundphysics;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.config.GuiConfig;

public class SPGuiConfig extends GuiConfig {

	public SPGuiConfig(final GuiScreen parent) {
		super(parent, SoundPhysics.instance.config.getConfigElements(), SoundPhysics.modid, false, false,
				"Sound Physics Configuration");
	}

}