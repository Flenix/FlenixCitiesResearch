package co.uk.silvania.cities.research;

import co.uk.silvania.cities.research.blocks.*;
import co.uk.silvania.cities.research.blocks.advanced.SimplePlayerDetectorBlock;
import co.uk.silvania.cities.research.blocks.fluid.BlockCoolant;
import net.minecraft.block.Block;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FCR_Blocks {
	
	public static Block ceramicBlockMulti;
	public static Block toughGlassMulti;
	public static Block decorativeBlockMulti;
	public static Block decorativeBlockMultiB;
	public static Block ceramicWallMulti;
	public static Block grillBlockMulti;
	public static Block decorativeLineBlockMulti;
	
	public static Block simplePlayerDetector;
	
	public static Fluid coolantFluid;
	public static Block coolantBlock;
	
	public static void init() {
		initBlocks();
		initFluids();
		initAdvancedBlocks();
	}
	
	public static void initBlocks() {
		ceramicBlockMulti = new BlockMulti().setBlockName("ceramicBlockTiles");
		decorativeBlockMulti = new BlockMulti().setBlockName("decorativeBlock");
		toughGlassMulti = new GlassMulti().setBlockName("toughGlass");
		ceramicWallMulti = new BlockMulti().setBlockName("ceramicWall");
		grillBlockMulti = new BlockMulti().setBlockName("grillBlock");
		decorativeBlockMultiB = new BlockMultiCT().setBlockName("decorativeBlockB");
		decorativeLineBlockMulti = new BlockMultiCT().setBlockName("decorativeLine");
	}
	
	public static void initFluids() {
		coolantFluid = new Fluid("Coolant").setViscosity(1).setUnlocalizedName("coolantFluid");
		FluidRegistry.registerFluid(coolantFluid);
		
		coolantBlock = new BlockCoolant(coolantFluid);
	}
	
	public static void initAdvancedBlocks() {
		simplePlayerDetector = new SimplePlayerDetectorBlock().setBlockName("simplePlayerDetector");
		
	}

}
