package beast351x.beastcraft.mod.block;


import beast351x.beastcraft.mod.Beastcraft;
import beast351x.beastcraft.mod.creativetabs.BeastcraftCreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class CoalBricks extends Block
{

	public CoalBricks() 
	{
		super(Material.rock);
		
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(3.5F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(BeastcraftCreativeTabs.tabBCBlocks);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon(Beastcraft.MODID + ":" + this.getUnlocalizedName().substring(5));
	}

	
	
}
