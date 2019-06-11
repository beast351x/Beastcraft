package beast351x.beastcraft.mod.item;

import beast351x.beastcraft.mod.Beastcraft;
import beast351x.beastcraft.mod.creativetabs.BeastcraftCreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class BCItem extends Item
{
	public BCItem() 
	{
		this.setCreativeTab(BeastcraftCreativeTabs.tabBCItems);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon(Beastcraft.MODID + ":" + this.getUnlocalizedName().substring(5));
	}
}