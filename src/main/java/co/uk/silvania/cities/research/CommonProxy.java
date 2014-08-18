package co.uk.silvania.cities.research;

import net.minecraft.item.ItemStack;
import co.uk.silvania.cities.research.blocks.FCRItemBlock;
import co.uk.silvania.cities.research.blocks.advanced.TileSimplePlayerDetector;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommonProxy {
	
	@Instance
	public static FlenixCities_Research instance;
	
	public void registerRenderThings() {}
	public void registerRenderers() {}
	
	public void entityStuff() {
		
	}
	
	public void registerBlocks() {
		GameRegistry.registerBlock(FCR_Blocks.ceramicBlockMulti, FCRItemBlock.class, "FlenixCities_Research" + (FCR_Blocks.ceramicBlockMulti.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(FCR_Blocks.decorativeBlockMulti, FCRItemBlock.class, "FlenixCities_Research" + (FCR_Blocks.decorativeBlockMulti.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(FCR_Blocks.toughGlassMulti, FCRItemBlock.class, "FlenixCities_Research" + (FCR_Blocks.toughGlassMulti.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(FCR_Blocks.ceramicWallMulti, FCRItemBlock.class, "FlenixCities_Research" + (FCR_Blocks.ceramicWallMulti.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(FCR_Blocks.grillBlockMulti, FCRItemBlock.class, "FlenixCities_Research" + (FCR_Blocks.grillBlockMulti.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(FCR_Blocks.decorativeBlockMultiB, FCRItemBlock.class, "FlenixCities_Research" + (FCR_Blocks.decorativeBlockMultiB.getUnlocalizedName().substring(5)));
		
		GameRegistry.registerBlock(FCR_Blocks.simplePlayerDetector, "simplePlayerDetector");
		
		GameRegistry.registerBlock(FCR_Blocks.coolantBlock, "coolantBlock");
		GameRegistry.registerBlock(FCR_Blocks.decorativeLineBlockMulti, "decorativeLineMulti");
	}
	
	public void addNames() {
		LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicBlockMulti, 1, 0), "Ceramic Tile");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicBlockMulti, 1, 1), "Ceramic Tile, Small (Bordered)");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicBlockMulti, 1, 2), "Ceramic Tile, Small");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicBlockMulti, 1, 3), "Ceramic Plate");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicBlockMulti, 1, 4), "Ceramic Tile Framed");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicBlockMulti, 1, 5), "Ceramic Tile Framed");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicBlockMulti, 1, 6), "Ceramic Tile Framed");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicBlockMulti, 1, 7), "Ceramic Tile Framed");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicBlockMulti, 1, 8), "Ceramic Brick");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicBlockMulti, 1, 9), "Ceramic Brick");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicBlockMulti, 1, 10), "Grey Ceramic Tile");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicBlockMulti, 1, 11), "Grey Ceramic Plate");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicBlockMulti, 1, 12), "Dark Ceramic Tile");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicBlockMulti, 1, 13), "Very Dark Ceramic Tile");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicBlockMulti, 1, 14), "Very Dark Ceramic Plate");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicBlockMulti, 1, 15), "Dark Ceramic Plate");
        
		LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMulti, 1, 0), "Hazard");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMulti, 1, 1), "Hazard");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMulti, 1, 2), "Steel Checkerplate");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMulti, 1, 3), "Hashed Flooring");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMulti, 1, 4), "Hindwalker Architecture Wall");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMulti, 1, 5), "Hindwalker Architecture Wall");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMulti, 1, 6), "Hindwalker Architecture Wall");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMulti, 1, 7), "Hindwalker Architecture Wall");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMulti, 1, 8), "Hindwalker Architecture Wall");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMulti, 1, 9), "Hindwalker Architecture Wall");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMulti, 1, 10), "Hindwalker Architecture Wall");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMulti, 1, 11), "Hindwalker Architecture Wall");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMulti, 1, 12), "Hindwalker Architecture Wall");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMulti, 1, 13), "Hindwalker Architecture Wall");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMulti, 1, 14), "Hindwalker Architecture Wall");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMulti, 1, 15), "Hindwalker Architecture Wall");
        
		LanguageRegistry.addName(new ItemStack(FCR_Blocks.toughGlassMulti, 1, 0), "Tough Glass");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.toughGlassMulti, 1, 1), "Tough Glass");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.toughGlassMulti, 1, 2), "Tough Glass");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.toughGlassMulti, 1, 3), "Tough Glass");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.toughGlassMulti, 1, 4), "Tough Glass");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.toughGlassMulti, 1, 5), "Tough Glass");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.toughGlassMulti, 1, 6), "Tough Glass");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.toughGlassMulti, 1, 7), "Tough Glass");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.toughGlassMulti, 1, 8), "N/A");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.toughGlassMulti, 1, 9), "N/A");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.toughGlassMulti, 1, 10), "N/A");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.toughGlassMulti, 1, 11), "N/A");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.toughGlassMulti, 1, 12), "N/A");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.toughGlassMulti, 1, 13), "N/A");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.toughGlassMulti, 1, 14), "N/A");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.toughGlassMulti, 1, 15), "N/A");
        
		LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicWallMulti, 1, 0), "Ceramic Wall, Base");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicWallMulti, 1, 1), "Ceramic Wall, Base (Framed)");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicWallMulti, 1, 2), "Ceramic Wall");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicWallMulti, 1, 3), "Ceramic Wall, Center Line");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicWallMulti, 1, 4), "Ceramic Wall, Center Line (Thick)");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicWallMulti, 1, 5), "Ceramic Wall, Center Line (Framed)");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicWallMulti, 1, 6), "Ceramic Wall, Center Line (Framed, Thick)");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicWallMulti, 1, 7), "Ceramic Wall, Top");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicWallMulti, 1, 8), "Ceramic Wall, Top (Framed)");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicWallMulti, 1, 9), "Ceramic Wall, Base (Narrow)");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicWallMulti, 1, 10), "Ceramic Wall, Top (Narrow)");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicWallMulti, 1, 11), "Ceramic Wall, Double Framed"); //
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicWallMulti, 1, 12), "Ceramic Wall, Double Framed (Vertical)"); //
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicWallMulti, 1, 13), "Ceramic Wall, Left Framed"); //
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicWallMulti, 1, 14), "Ceramic Wall, Right Framed"); //
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.ceramicWallMulti, 1, 15), "Ceramic Wall, Patterned");
        
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.grillBlockMulti, 1, 0), "Horizontal Vent, Hazard Surround");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.grillBlockMulti, 1, 1), "Horizontal Vent");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.grillBlockMulti, 1, 2), "Horizontal Vent, H White Strips");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.grillBlockMulti, 1, 3), "Horizontal Vent, White Surround");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.grillBlockMulti, 1, 4), "Horizontal Vent, V White Strips");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.grillBlockMulti, 1, 5), "Vertical Vent");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.grillBlockMulti, 1, 6), "Vertical Vent, V White Strips");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.grillBlockMulti, 1, 7), "Vertical Vent, White Surround");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.grillBlockMulti, 1, 8), "Vertical Vent, H White Strips");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.grillBlockMulti, 1, 9), "Horizontal Vent, H Dark Strips");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.grillBlockMulti, 1, 10), "Horizontal Vent, Dark Surrounds");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.grillBlockMulti, 1, 11), "Horizontal Vent, V Dark Strips");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.grillBlockMulti, 1, 12), "Vertical Vent, V Dark Strips");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.grillBlockMulti, 1, 13), "Vertical Vent, Dark Surround");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.grillBlockMulti, 1, 14), "Vertical Vent, H Dark Strips");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.grillBlockMulti, 1, 15), "Vertical Vent, Hazard Surround");
        
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMultiB, 1, 0), "Horizontal Vent, H Hazard Strips");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMultiB, 1, 1), "Horizontal Vent, V Hazard Strips");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMultiB, 1, 2), "Vertical Vent, H Hazard Strips");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMultiB, 1, 3), "Vertical Vent, V Hazard Strips");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMultiB, 1, 4), "Horizontal Vent, Grey Hazard Surround");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMultiB, 1, 5), "Horizontal Vent, Grey Hazard H Strips");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMultiB, 1, 6), "Horizontal Vent, Grey Hazard V Strips");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMultiB, 1, 7), "Vertical Vent, Grey Hazard Surround");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMultiB, 1, 8), "Vertical Vent, Grey Hazard H Strips");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMultiB, 1, 9), "Vertical Vent, Grey Hazard V Strips");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMultiB, 1, 10), "Horizontal Vent, White CTM");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMultiB, 1, 11), "Horizontal Vent, Dark CTM");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMultiB, 1, 12), "Horizontal Vent, Hazard CTM");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMultiB, 1, 13), "Vertical Vent, White CTM");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMultiB, 1, 14), "Vertical Vent, Dark CTM");
        LanguageRegistry.addName(new ItemStack(FCR_Blocks.decorativeBlockMultiB, 1, 15), "Vertical Vent, Hazard CTM");
        
        LanguageRegistry.addName(FCR_Blocks.coolantBlock, "Liquid Coolant");
        LanguageRegistry.addName(FCR_Blocks.simplePlayerDetector, "Simple Player Detector");
	}
	
	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileSimplePlayerDetector.class, "simplePlayerDetector");
	}

}
