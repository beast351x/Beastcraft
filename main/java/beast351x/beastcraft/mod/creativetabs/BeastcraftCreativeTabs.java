package beast351x.beastcraft.mod.creativetabs;


import net.minecraft.creativetab.CreativeTabs;




public class BeastcraftCreativeTabs
{
  public static CreativeTabs tabBCItems;
  public static CreativeTabs tabBCBlocks;
  
  public static void initializedTabs() 
  { 
	  tabBCItems = new CreativeTabBCItems("BCItemsTab"); 
	  tabBCBlocks = new CreativeTabBCBlocks("BCBlocksTab");
  }
}