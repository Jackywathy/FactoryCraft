package jackywathy24.factorycraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockEvenBetterIce extends BlockBetterIce{
	
	public static final String unlocalizedname = "EvenBetterIce";
	
	public BlockEvenBetterIce(){
		super();
		slipperiness = 0.4F;
		setUnlocalizedName(unlocalizedname);
}
}
