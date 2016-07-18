package jackywathy24.factorycraft;
import jackywathy24.factorycraft.item.ItemExplosivePowder;
import jackywathy24.factorycraft.block.*;


import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModRecipes {
	
	
	static final void addRecipe(){
		GameRegistry.addRecipe(new ItemStack(Blocks.OBSIDIAN),
				"A A",
				"A A",
				"A A",
				'A', Blocks.DIRT
				);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.OBSIDIAN),
				Blocks.DIRT, new ItemStack(Blocks.PLANKS,1,1));
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(Blocks.DIAMOND_BLOCK),100F);
		
	
		GameRegistry.addRecipe(new ItemStack(CommonProxy.itemExplosivePowder, 2),
				"A A",
				" A ",
				"A A",
				'A', Blocks.DIRT
				);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.TNT, 2),
				"ABA",
				"BAB",
				"ABA",
				'A', CommonProxy.itemExplosivePowder,
				'B', Blocks.SAND
				);
		
		GameRegistry.addRecipe(new ItemStack(CommonProxy.blockBetterIce,8),
				"AAA",
				"ABA",
				"AAA",
				'A', Blocks.ICE,
				'B', new ItemStack(Items.DYE, 1, 5)
				);
		
	}
	
	


}
 