package beast351x.beastcraft.mod.handler;

import beast351x.beastcraft.mod.Beastcraft;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class CraftingHandler {

	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent event)
	{
		final IInventory craftMatrix = null;
		for(int i = 0; i < event.craftMatrix.getSizeInventory(); i++)
		{
			if(event.craftMatrix.getStackInSlot(i) != null)
			{
				
					ItemStack item0 = event.craftMatrix.getStackInSlot(i);
					if(item0 != null && item0.getItem() == Beastcraft.itemScissors)
					{
						ItemStack k = new ItemStack(Beastcraft.itemScissors, 2, (item0.getItemDamage() + 1));
						
						if(k.getItemDamage() >= k.getMaxDamage())
						{
							k.stackSize--;
						}
						event.craftMatrix.setInventorySlotContents(i, k);
					}
					ItemStack item1 = event.craftMatrix.getStackInSlot(i);
					if(item1 != null && item1.getItem() == Beastcraft.itemWoodConversion)
					{
						ItemStack k = new ItemStack(Beastcraft.itemWoodConversion, 2, (item1.getItemDamage() + 1));
						
						if(k.getItemDamage() >= k.getMaxDamage())
						{
							k.stackSize--;
						}
						event.craftMatrix.setInventorySlotContents(i, k);
					}
					ItemStack item2 = event.craftMatrix.getStackInSlot(i);
					if(item2 != null && item2.getItem() == Beastcraft.itemStoneConversion)
					{
						ItemStack k = new ItemStack(Beastcraft.itemStoneConversion, 2, (item2.getItemDamage() + 1));
						
						if(k.getItemDamage() >= k.getMaxDamage())
						{
							k.stackSize--;
						}
						event.craftMatrix.setInventorySlotContents(i, k);
					}
			}
		}
	}
}
	
