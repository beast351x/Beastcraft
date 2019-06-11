package beast351x.beastcraft.mod;

import beast351x.beastcraft.mod.block.CoalBricks;
import beast351x.beastcraft.mod.block.GlowstoneColored;
import beast351x.beastcraft.mod.creativetabs.BeastcraftCreativeTabs;
import beast351x.beastcraft.mod.handler.BCFuelHandler;
import beast351x.beastcraft.mod.item.BCItem;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = Beastcraft.MODID, name = Beastcraft.NAME, version = Beastcraft.VERSION)
public class Beastcraft
{
  public static final String MODID = "beastcraft";
  public static final String NAME = "Beast Craft";
  public static final String VERSION = "1.0";
  
  //CreativeTabs
  public static CreativeTabs beastcraftblockstab;
  public static CreativeTabs beastcraftitemstab;
  
  //Items
  	public static Item itemCoalIngot;
  	public static Item itemPolisher;
  //Blocks
  	//Coal Bricks
  	public static Block blockCoalBrickNormal;
  	public static Block blockCoalBrickDecorated;
  	public static Block blockCoalBrickSmooth;
  	public static Block blockCoalBrickCracked;
  	public static Block blockCoalBrickChiseled;
  	
  	//Glowstone Colored
  	public static Block GlowstoneColoredBlack;
  	public static Block GlowstoneColoredBlue;
  	public static Block GlowstoneColoredBrown;
  	public static Block GlowstoneColoredCyan;
  	public static Block GlowstoneColoredDarkgrey;
  	public static Block GlowstoneColoredGreen;
  	public static Block GlowstoneColoredLightblue;
  	public static Block GlowstoneColoredLightgrey;
  	public static Block GlowstoneColoredLime;
  	public static Block GlowstoneColoredMagenta;
  	public static Block GlowstoneColoredOrange;
  	public static Block GlowstoneColoredPink;
  	public static Block GlowstoneColoredPurple;
  	public static Block GlowstoneColoredRed;
  	public static Block GlowstoneColoredWhite;
  	public static Block GlowstoneColoredYellow;
  	
  @EventHandler
  public void preinit(FMLPreInitializationEvent event) 
  { 
	BeastcraftCreativeTabs.initializedTabs();
	//Items initialize
	itemCoalIngot = new BCItem().setUnlocalizedName("coalIngot");
	itemPolisher = new BCItem().setUnlocalizedName("Polisher");
	
	//Items registered
	GameRegistry.registerItem(itemCoalIngot, "coalIngot");
	GameRegistry.registerItem(itemPolisher, "Polisher");
	
	//Blocks initialize
		//Coal Bricks
		blockCoalBrickNormal = new CoalBricks().setBlockName("CoalBricksNormal");
		blockCoalBrickDecorated = new CoalBricks().setBlockName("CoalBricksDecorated");
		blockCoalBrickSmooth = new CoalBricks().setBlockName("CoalBricksSmooth");
		blockCoalBrickCracked = new CoalBricks().setBlockName("CoalBricksCracked");
		blockCoalBrickChiseled = new CoalBricks().setBlockName("CoalBricksChiseled");
		
		//Glowstone Colored
		GlowstoneColoredBlack = new GlowstoneColored().setBlockName("GlowstoneColoredBlack");
	  	GlowstoneColoredBlue = new GlowstoneColored().setBlockName("GlowstoneColoredBlue");
	  	GlowstoneColoredBrown = new GlowstoneColored().setBlockName("GlowstoneColoredBrown");
	  	GlowstoneColoredCyan = new GlowstoneColored().setBlockName("GlowstoneColoredCyan");
	  	GlowstoneColoredDarkgrey = new GlowstoneColored().setBlockName("GlowstoneColoredDarkgrey");
	  	GlowstoneColoredGreen = new GlowstoneColored().setBlockName("GlowstoneColoredGreen");
	  	GlowstoneColoredLightblue = new GlowstoneColored().setBlockName("GlowstoneColoredLightblue");
	  	GlowstoneColoredLightgrey = new GlowstoneColored().setBlockName("GlowstoneColoredLightgrey");
	  	GlowstoneColoredLime = new GlowstoneColored().setBlockName("GlowstoneColoredLime");
	  	GlowstoneColoredMagenta = new GlowstoneColored().setBlockName("GlowstoneColoredMagenta");
	  	GlowstoneColoredOrange = new GlowstoneColored().setBlockName("GlowstoneColoredOrange");
	  	GlowstoneColoredPink = new GlowstoneColored().setBlockName("GlowstoneColoredPink");
	  	GlowstoneColoredPurple = new GlowstoneColored().setBlockName("GlowstoneColoredPurple");
	  	GlowstoneColoredRed = new GlowstoneColored().setBlockName("GlowstoneColoredRed");
	  	GlowstoneColoredWhite = new GlowstoneColored().setBlockName("GlowstoneColoredWhite");
	  	GlowstoneColoredYellow = new GlowstoneColored().setBlockName("GlowstoneColoredYellow");

	//Blocks registered
		//Coal Bricks
		GameRegistry.registerBlock(blockCoalBrickNormal, "CoalBricksNormal");
		GameRegistry.registerBlock(blockCoalBrickDecorated, "CoalBricksDecorated");
		GameRegistry.registerBlock(blockCoalBrickSmooth, "CoalBricksSmooth");
		GameRegistry.registerBlock(blockCoalBrickCracked, "CoalBricksCracked");
		GameRegistry.registerBlock(blockCoalBrickChiseled, "CoalBricksChiseled");
		
		//Glowstone Colored
		GameRegistry.registerBlock(GlowstoneColoredBlack, "GlowstoneColoredBlack");
		GameRegistry.registerBlock(GlowstoneColoredBlue, "GlowstoneColoredBlue");
		GameRegistry.registerBlock(GlowstoneColoredBrown, "GlowstoneColoredBrown");
		GameRegistry.registerBlock(GlowstoneColoredCyan, "GlowstoneColoredCyan");
		GameRegistry.registerBlock(GlowstoneColoredDarkgrey, "GlowstoneColoredDarkgrey");
		GameRegistry.registerBlock(GlowstoneColoredGreen, "GlowstoneColoredGreen");
		GameRegistry.registerBlock(GlowstoneColoredLightblue, "GlowstoneColoredLightblue");
		GameRegistry.registerBlock(GlowstoneColoredLightgrey, "GlowstoneColoredLightgrey");
		GameRegistry.registerBlock(GlowstoneColoredLime, "GlowstoneColoredLime");
		GameRegistry.registerBlock(GlowstoneColoredMagenta, "GlowstoneColoredMagenta");
		GameRegistry.registerBlock(GlowstoneColoredOrange, "GlowstoneColoredOrange");
		GameRegistry.registerBlock(GlowstoneColoredPink, "GlowstoneColoredPink");
		GameRegistry.registerBlock(GlowstoneColoredPurple, "GlowstoneColoredPurple");
		GameRegistry.registerBlock(GlowstoneColoredRed, "GlowstoneColoredRed");
		GameRegistry.registerBlock(GlowstoneColoredWhite, "GlowstoneColoredWhite");
		GameRegistry.registerBlock(GlowstoneColoredYellow, "GlowstoneColoredYellow");
  }
  
  @EventHandler
  public void init(FMLInitializationEvent event) 
  {
		//ShapedRecipes
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.blockCoalBrickNormal, 1), new Object[] {"XX", "XX", 'X', Beastcraft.itemCoalIngot});
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.blockCoalBrickChiseled, 4), new Object[] {"XX", "XX", 'X', Beastcraft.blockCoalBrickNormal});
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.blockCoalBrickDecorated, 4), new Object[] {"XX", "XX", 'X', Beastcraft.blockCoalBrickChiseled});
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.blockCoalBrickSmooth, 8), new Object[] {"XXX", "XBX", "XXX", 'X', Beastcraft.blockCoalBrickNormal, 'B', Beastcraft.itemPolisher});
		
		//GlowstoneColored Recipes
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.GlowstoneColoredBlack, 8), new Object[] {"XXX", "XBX", "XXX", 'X', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 0)});
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.GlowstoneColoredRed, 8), new Object[] {"XXX", "XBX", "XXX", 'X', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 1)});
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.GlowstoneColoredGreen, 8), new Object[] {"XXX", "XBX", "XXX", 'X', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 2)});
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.GlowstoneColoredBrown, 8), new Object[] {"XXX", "XBX", "XXX", 'X', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 3)});
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.GlowstoneColoredBlue, 8), new Object[] {"XXX", "XBX", "XXX", 'X', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.GlowstoneColoredPurple, 8), new Object[] {"XXX", "XBX", "XXX", 'X', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 5)});
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.GlowstoneColoredCyan, 8), new Object[] {"XXX", "XBX", "XXX", 'X', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 6)});
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.GlowstoneColoredLightgrey, 8), new Object[] {"XXX", "XBX", "XXX", 'X', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 7)});
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.GlowstoneColoredDarkgrey, 8), new Object[] {"XXX", "XBX", "XXX", 'X', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 8)});
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.GlowstoneColoredPink, 8), new Object[] {"XXX", "XBX", "XXX", 'X', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 9)});
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.GlowstoneColoredLime, 8), new Object[] {"XXX", "XBX", "XXX", 'X', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 10)});
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.GlowstoneColoredYellow, 8), new Object[] {"XXX", "XBX", "XXX", 'X', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 11)});
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.GlowstoneColoredLightblue, 8), new Object[] {"XXX", "XBX", "XXX", 'X', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 12)});
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.GlowstoneColoredMagenta, 8), new Object[] {"XXX", "XBX", "XXX", 'X', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 13)});
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.GlowstoneColoredOrange, 8), new Object[] {"XXX", "XBX", "XXX", 'X', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 14)});
		GameRegistry.addShapedRecipe(new ItemStack(Beastcraft.GlowstoneColoredWhite, 8), new Object[] {"XXX", "XBX", "XXX", 'X', Blocks.glowstone, 'B', new ItemStack(Items.dye, 1, 15)});
		
		//ShapelessRecipe
		GameRegistry.addShapelessRecipe(new ItemStack(Beastcraft.itemPolisher, 2), new Object[] {new ItemStack(Items.dye, 1, 15), Items.clay_ball});
		
		//SmeltingRecipes
		GameRegistry.addSmelting(Items.coal, new ItemStack(Beastcraft.itemCoalIngot, 2), 1);
		GameRegistry.addSmelting(Beastcraft.blockCoalBrickNormal, new ItemStack(Beastcraft.blockCoalBrickCracked, 1), 2);
		
		//RegisterHandlers
		GameRegistry.registerFuelHandler(new BCFuelHandler());
	 }
  
  @EventHandler
  public void postinit(FMLPostInitializationEvent event) 
  {
	  
  }
}