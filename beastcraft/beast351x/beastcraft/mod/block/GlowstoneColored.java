package beast351x.beastcraft.mod.block;

import beast351x.beastcraft.mod.Beastcraft;
import beast351x.beastcraft.mod.creativetabs.BeastcraftCreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class GlowstoneColored extends Block {

	public GlowstoneColored() {
		super(Material.glass);
		
		this.setLightLevel(1.0F);
		this.setHardness(1.0F);
		this.setResistance(1.0F);
		this.setStepSound(soundTypeGlass);
		this.setCreativeTab(BeastcraftCreativeTabs.tabBCBlocks);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon(Beastcraft.MODID + ":" + this.getUnlocalizedName().substring(5));
	}

}
