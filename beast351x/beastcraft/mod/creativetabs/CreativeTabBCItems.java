package beast351x.beastcraft.mod.creativetabs;

import beast351x.beastcraft.mod.Beastcraft;
import beast351x.beastcraft.mod.item.BCItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBCItems extends CreativeTabs {

	public CreativeTabBCItems(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Beastcraft.itemCoalIngot;
	}

}