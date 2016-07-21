package jackywathy24.factorycraft.item;

import jackywathy24.factorycraft.FactorycraftCore;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.event.AttachCapabilitiesEvent.Entity;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemExplosivePowder extends Item{
	
	public ItemExplosivePowder(String unlocatizedName){
		super();
		setUnlocalizedName(unlocatizedName);
		setCreativeTab(CreativeTabs.MISC);

	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand){
		playerIn.attackEntityFrom(FactorycraftCore.electrocuted, 3F);
		if (!playerIn.capabilities.isCreativeMode){
			--itemStackIn.stackSize;
		}

		return new ActionResult(EnumActionResult.SUCCESS, itemStackIn);
		
	}
	
}
