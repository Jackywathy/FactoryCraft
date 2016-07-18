package jackywathy24.factorycraft.block;

import jackywathy24.factorycraft.FactorycraftCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockBetterIce extends Block{
	public static final String unlocalizedname = "BetterIce";
	
	public BlockBetterIce(){
		super(Material.ICE);
		setCreativeTab(FactorycraftCore.FactoryCraftBlocksTab);
		setUnlocalizedName(unlocalizedname);
		setHardness(0.2F);
		slipperiness = 0.5F;
		
	}


	
	
}
