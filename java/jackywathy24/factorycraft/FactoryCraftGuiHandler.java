package jackywathy24.factorycraft;

import jackywathy24.factorycraft.gui.GuiCoalBoiler;
import jackywathy24.factorycraft.gui.container.ContainerCoalBoiler;
import jackywathy24.factorycraft.tile.TileCoalBoiler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class FactoryCraftGuiHandler implements IGuiHandler{
	public static final int COALBOILER = 0;
	public FactoryCraftGuiHandler(){
		
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID==COALBOILER){
			return new ContainerCoalBoiler(player.inventory,(TileCoalBoiler) world.getTileEntity(new BlockPos(x,y,z)));
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == COALBOILER){
			return new GuiCoalBoiler(player.inventory, (TileCoalBoiler) world.getTileEntity(new BlockPos(x,y,z)));
		}
		return null;
	}
}
