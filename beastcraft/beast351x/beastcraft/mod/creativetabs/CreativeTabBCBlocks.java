package beast351x.beastcraft.mod.creativetabs;

import beast351x.beastcraft.mod.Beastcraft;
import beast351x.beastcraft.mod.item.BCItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBCBlocks extends CreativeTabs {

	public CreativeTabBCBlocks(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Item.getItemFromBlock(Beastcraft.blockCoalBrickNormal);
	}

}
