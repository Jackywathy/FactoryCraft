package jackywathy24.factorycraft.gui.container;

import jackywathy24.factorycraft.tile.TileCoalBoiler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerCoalBoiler extends Container{
	// GUI CODE = 0!
	private TileCoalBoiler TE;
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return TE.isUseableByPlayer(playerIn);
	}
	public ContainerCoalBoiler(IInventory playerInv, TileCoalBoiler tileCoalBoiler){
		this.TE = tileCoalBoiler;
		// two inventory slots 0-1
		addSlotToContainer(new Slot(tileCoalBoiler, 0, 62,17));
		addSlotToContainer(new Slot(tileCoalBoiler, 1, 62,17+36));
		
		// playerInv
	    for (int y = 0; y < 3; ++y) {
	        for (int x = 0; x < 9; ++x) {// start at index 2, 2-28
	            this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 2, 8 + x * 18, 84 + y * 18));
	        }
	    }
	    for (int x = 0; x < 9; ++x) { //29-
	        this.addSlotToContainer(new Slot(playerInv, x+29, 8 + x * 18, 142));
	    }
	}
	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int fromSlot) {
	    ItemStack previous = null;
	    Slot slot = (Slot) this.inventorySlots.get(fromSlot);

	    if (slot != null && slot.getHasStack()) {
	        ItemStack current = slot.getStack();
	        previous = current.copy();

	        // [...] Custom behaviour

	        if (current.stackSize == 0)
	            slot.putStack((ItemStack) null);
	        else
	            slot.onSlotChanged();

	        if (current.stackSize == previous.stackSize)
	            return null;
	        slot.onPickupFromSlot(playerIn, current);
	    }
	    return previous;
	}
		
}

