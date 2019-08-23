/*
package com.bubbet.projectbsr.gui.hud.modules;

import com.bubbet.projectbsr.modules.ModuleApiaristSink;
import logisticspipes.interfaces.IHUDButton;
import logisticspipes.interfaces.IHUDModuleRenderer;
import logisticspipes.utils.item.ItemIdentifierStack;
import logisticspipes.utils.item.ItemStackRenderer;
import logisticspipes.utils.item.ItemStackRenderer.DisplayAmount;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.FMLClientHandler;
import org.lwjgl.opengl.GL11;

import java.util.List;

public class HUDApiaristSink implements IHUDModuleRenderer {

	private final ModuleApiaristSink module;

	public HUDApiaristSink(ModuleApiaristSink module) {
		this.module = module;
	}

	@Override
	public void renderContent(boolean shifted) {
		Minecraft mc = FMLClientHandler.instance().getClient();
		GL11.glScalef(1.0F, 1.0F, -0.00001F);
		ItemStackRenderer.renderItemIdentifierStackListIntoGui(ItemIdentifierStack.getListFromInventory(module.getFilterInventory()), null, 0, -25, -32, 3, 9, 18, 18, 100.0F, DisplayAmount.NEVER, false, shifted);
		GL11.glScalef(1.0F, 1.0F, 1 / -0.00001F);
		mc.fontRenderer.drawString("Default:", -29, 25, 0);
		if (module.isDefaultRoute()) {
			mc.fontRenderer.drawString("Yes", 11, 25, 0);
		} else {
			mc.fontRenderer.drawString("No", 15, 25, 0);
		}
	}

	@Override
	public List<IHUDButton> getButtons() {
		return null;
	}
}
*/