package net.bullfighter.avaritia.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.bullfighter.avaritia.world.inventory.ExtremeCraftingTableGuiMenu;
import net.bullfighter.avaritia.network.ExtremeCraftingTableGuiButtonMessage;
import net.bullfighter.avaritia.init.AvaritiaModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class ExtremeCraftingTableGuiScreen extends AbstractContainerScreen<ExtremeCraftingTableGuiMenu> implements AvaritiaModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_craft;

	public ExtremeCraftingTableGuiScreen(ExtremeCraftingTableGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 200;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("avaritia:textures/screens/extreme_crafting_table_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(RenderType::guiTextured, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.avaritia.extreme_crafting_table_gui.label_extreme_crafting_table"), 154, 6, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_craft = Button.builder(Component.translatable("gui.avaritia.extreme_crafting_table_gui.button_craft"), e -> {
			int x = ExtremeCraftingTableGuiScreen.this.x;
			int y = ExtremeCraftingTableGuiScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new ExtremeCraftingTableGuiButtonMessage(0, x, y, z));
				ExtremeCraftingTableGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 244, this.topPos + 51, 50, 20).build();
		this.addRenderableWidget(button_craft);
	}
}