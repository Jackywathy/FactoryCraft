package jackywathy24.factorycraft.gui;

import jackywathy24.factorycraft.FactorycraftCore;
import jackywathy24.factorycraft.gui.container.ContainerCoalBoiler;
import jackywathy24.factorycraft.tile.TileCoalBoiler;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class GuiCoalBoiler extends GuiContainer{

	private IInventory playerInv;
	private TileEntity TE;
	
	public GuiCoalBoiler (IInventory playerInv, TileCoalBoiler te) {
		super(new ContainerCoalBoiler(playerInv, te));
		this.playerInv = playerInv;
		this.TE = te;
		xSize = 176;
		ySize = 166;
		
		
		
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
	    GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
	    mc.getTextureManager().bindTexture(new ResourceLocation(FactorycraftCore.MODID, "textures/gui/container/furn.png"));
	    this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
	    String s = "Factorycraft::gui!";//TE.getDisplayName().getUnformattedText();
	    this.fontRendererObj.drawString(s, 88 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);            //#404040
	    this.fontRendererObj.drawString(this.playerInv.getDisplayName().getUnformattedText(), 8, 72, 4210752);      //#404040
	}

}
