package jackywathy24.factorycraft;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import jackywathy24.factorycraft.block.*;
import jackywathy24.factorycraft.item.*;
import jackywathy24.factorycraft.tile.*;
import jackywathy24.factorycraft.ModRecipes;





public class CommonProxy {
	// All items used!
	public static final Item itemExplosivePowder = new ItemExplosivePowder("ExplosivePowder");
	
	// ALL blocks used!
	public static final Block blockBetterIce = new BlockBetterIce();
	public static final Block blockEvenBetterIce = new BlockEvenBetterIce();
	public static final Block blockCoalBoiler = new BlockCoalBoiler();
	//public static final Block blockSlabFurnace = new BlockSlabFurnace();
	
	
	
	public void preInit(FMLPreInitializationEvent e){
		// Register Items
		GameRegistry.register(itemExplosivePowder.setRegistryName(FactorycraftCore.MODID, "ExplosivePowder"));
		
		// Register Blocks
		FactorycraftCore.registerBlock(
				BlockBetterIce.unlocalizedname,
				blockBetterIce);
		
		FactorycraftCore.registerBlock(
				BlockEvenBetterIce.unlocalizedname,
				blockEvenBetterIce);
		FactorycraftCore.registerBlock(
				BlockCoalBoiler.unlocalizedname,
				blockCoalBoiler
				);
		/*
		FactorycraftCore.registerBlock(
				BlockSlabFurnace.unlocalizedname,
				blockSlabFurnace
				);
	*/
		TileCoalBoiler.register();
		
		
		
		
		
		
		
		
	}
	public void init(FMLInitializationEvent e){
		FactorycraftCore.registerTextureSimple(itemExplosivePowder);
		FactorycraftCore.registerTextureSimple(blockBetterIce);
		FactorycraftCore.registerTextureSimple(blockEvenBetterIce);
		NetworkRegistry.INSTANCE.registerGuiHandler(FactorycraftCore.instance, new FactoryCraftGuiHandler());
		
	}
	public void postInit(FMLPostInitializationEvent e){
		ModRecipes.addRecipe();
		
	}
	
}



