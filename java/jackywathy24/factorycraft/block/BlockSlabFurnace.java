package jackywathy24.factorycraft.block;

import jackywathy24.factorycraft.FactorycraftCore;
import net.minecraft.block.BlockPurpurSlab;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;

public class BlockSlabFurnace extends BlockSlab {
	// BASED OF TINKER"s CONSTRUCT"s furnace slab, but stackable!
	public static final String unlocalizedname = "SlabFurnace";
	public static final PropertyEnum<BlockSlabFurnace.Variant> VARIANT = PropertyEnum.<BlockSlabFurnace.Variant>create("variant", BlockSlabFurnace.Variant.class);
	public int meta;
	
	public BlockSlabFurnace() {
		super(Material.ROCK);
		IBlockState iblockstate = this.blockState.getBaseState();
		
        if (!this.isDouble())
        {
            iblockstate = iblockstate.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
        }
        setCreativeTab(FactorycraftCore.FactoryCraftBlocksTab);
        setUnlocalizedName(unlocalizedname);

		
	}

	@Override
	public String getUnlocalizedName(int meta) {
		return unlocalizedname;
	}

	@Override
	public boolean isDouble() {
		if (meta > 0){
			return true;
		}
		return false;
	}

	@Override
	public IProperty<?> getVariantProperty() {
		return VARIANT;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return BlockSlabFurnace.Variant.DEFAULT;
	}
	
	public IBlockState getStateFromMeta(){
		IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, BlockSlabFurnace.Variant.DEFAULT);
        if (!this.isDouble())
        {
            iblockstate = iblockstate.withProperty(HALF, meta == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);
        }
        return iblockstate;
	}
	
    public static enum Variant implements IStringSerializable
    {
        DEFAULT;

        public String getName()
        {
            return "default";
        }
    }
    public static class Double extends BlockSlabFurnace
    {
        public boolean isDouble()
        {
            return true;
        }
    }

    public static class Half extends BlockSlabFurnace
    {
        public boolean isDouble()
        {
            return false;
        }
    }

}
