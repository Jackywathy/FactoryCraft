package jackywathy24.factorycraft.block;

import javax.annotation.Nullable;

import jackywathy24.factorycraft.FactoryCraftGuiHandler;
import jackywathy24.factorycraft.FactorycraftCore;
import jackywathy24.factorycraft.tile.TileCoalBoiler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
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
	@Override
	public boolean onBlockActivated(World worldIn,
			BlockPos pos,
            IBlockState state,
            EntityPlayer playerIn,
            EnumHand hand,
            @Nullable ItemStack heldItem,
            EnumFacing side,
            float hitX,
            float hitY,
            float hitZ){
		if (!worldIn.isRemote){
			playerIn.openGui(FactorycraftCore.instance, FactoryCraftGuiHandler.COALBOILER, worldIn, pos.getX(), pos.getY(), pos.getZ());
		}
		return true;
	}




}
