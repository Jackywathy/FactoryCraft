package jackywathy24.factorycraft;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	@Override
	public void preInit(FMLPreInitializationEvent e){
		super.preInit(e);
		

		
	}
	public void preInit(FMLInitializationEvent e){
		super.init(e);
	}
	public void postInit(FMLPostInitializationEvent e){
		super.postInit(e);
}
}
