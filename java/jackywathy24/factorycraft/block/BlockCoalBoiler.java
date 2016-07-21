package jackywathy24.factorycraft.block;

import jackywathy24.factorycraft.FactorycraftCore;
import jackywathy24.factorycraft.tile.TileCoalBoiler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCoalBoiler extends BlockContainer {
	public static final String unlocalizedname = "CoalBoiler";
	public BlockCoalBoiler() {
		super(Material.IRON);
		setUnlocalizedName(unlocalizedname);
		setHardness(2.0f);
		isBlockContainer = true;
		setCreativeTab(FactorycraftCore.FactoryCraftBlocksTab);
		
	}
	@Override 
	public TileEntity createNewTileEntity(World worldIn, int meta){
		return new TileCoalBoiler();
	}
	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState blockstate) {
	    TileCoalBoiler tileEnt = (TileCoalBoiler) world.getTileEntity(pos);
	    InventoryHelper.dropInventoryItems(world, pos, tileEnt);
	    super.breakBlock(world, pos, blockstate);
	}

}
