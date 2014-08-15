package co.uk.silvania.cities.research;

import co.uk.silvania.cities.research.blocks.BlockBreakEventHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=FlenixCities_Research.modid, dependencies="required-after:flenixcities", name="FlenixCities Research", version="0.4.0")
public class FlenixCities_Research {
	
	public static final String modid = "fc_research";
	public static String configPath;
	
	@Instance(FlenixCities_Research.modid)
	public static FlenixCities_Research instance;
	//GuiHandler
	
	@SidedProxy(clientSide="co.uk.silvania.cities.research.client.ClientProxy", serverSide="co.uk.silvania.cities.research.CommonProxy")
	public static CommonProxy proxy;
	
	public static CreativeTabs tabCitiesResearch = new CreativeTabs("tabCityResearch") {

		@Override
		public Item getTabIconItem() {
			return new ItemStack(FCR_Blocks.grillBlockMulti, 1, 1).getItem();
		}
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		configPath = event.getModConfigurationDirectory() + "/FlenixCities/";
		FCR_Config.init(configPath);
		
		proxy.registerRenderThings();
		proxy.registerRenderers();
		FCR_Blocks.init();
		FCR_Items.init();
		
		proxy.registerBlocks();
		proxy.addNames();
		proxy.registerTileEntities();
		
		MinecraftForge.EVENT_BUS.register(new EventListener());
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new BlockBreakEventHandler());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
