package beast351x.beastcraft.mod.handler;

import beast351x.beastcraft.mod.Beastcraft;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;

public class BCFuelHandler implements IFuelHandler{
	@Override
	public int getBurnTime(ItemStack fuel) 
	{
		if(fuel == null)
		{
		return 0;
		}
		else
		{
			Item item = fuel.getItem();
			
			if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air)
			{
				Block block = Block.getBlockFromItem(item);
				
				if(block == Beastcraft.blockCoalBrickNormal){return 17000;}
				if(block == Beastcraft.blockCoalBrickDecorated){return 17000;}
				if(block == Beastcraft.blockCoalBrickSmooth){return 17000;}
				if(block == Beastcraft.blockCoalBrickCracked){return 17000;}
				if(block == Beastcraft.blockCoalBrickChiseled){return 17000;}
				}
		}
		if(fuel.getItem() == Beastcraft.itemCoalIngot) return 2000;
		
		return 0;
	}
}

