package jackywathy24.factorycraft;


import jackywathy24.factorycraft.block.*;
import jackywathy24.factorycraft.item.*;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
/*
 * This FILE declares all constants: e.g. modid & calls the proxy methods
 * It also has several important methods
 * 
 * ALL ITEMS/BLOCK registering and texture mapping occurs in CommonProxy
 * 
 */

@Mod(modid = FactorycraftCore.MODID, name = FactorycraftCore.NAME)
public class FactorycraftCore {
	// CONSTANTS
	public static final String MODID = "factorycraft";
	public static final String NAME = "FactoryCraft";
	
	public static final String blockFolder = "/factorycraft/textures/blocks/";
	public static final String itemFolder = "/factorycraft/textures/items/";
	
	public static final CreativeTabs FactoryCraftBlocksTab = new CreativeTabs("FactoryCraft Blocks"){
		@Override
		public Item getTabIconItem(){
			return Item.getItemFromBlock(CommonProxy.blockBetterIce);
		}
	};
	
	public static final DamageSource electrocuted = new DamageSource("electricity").setDamageAllowedInCreativeMode().setDamageBypassesArmor().setDamageIsAbsolute();
	
	

	
	
	
	@SidedProxy(clientSide="jackywathy24.factorycraft.ClientProxy", serverSide="jackywathy24.factorycraft.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e){
		this.proxy.preInit(e);
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e){
		this.proxy.init(e);
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent e){
		this.proxy.postInit(e);
	}
	
	
	
	
	
	
	public static void registerTextureSimple(Item item){
		/**
		 * Register's the item using the default location: factorycraft:(item's unlocalized name)
		 */
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(item.getRegistryName()
				,"inventory"));

	}
	
	public static void registerTextureSimple(Block block){
		/**
		 * Register's the block using the default location: factorycraft:(item's unlocalized name)
		 */
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block),0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

	
	public static void registerBlock(String unlocalizedname, Block block){
		/**
		 * Register's itself like forge's registerBlock();
		 */
		// Register the block
		GameRegistry.register(block.setRegistryName(MODID, unlocalizedname));
		// Register the itemBlock
		GameRegistry.register((new ItemBlock(block)).setRegistryName(block.getRegistryName()));
		System.out.println(block.getUnlocalizedName());
		System.out.println(block.getRegistryName());
	}

}
