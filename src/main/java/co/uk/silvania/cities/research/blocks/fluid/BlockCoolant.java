package co.uk.silvania.cities.research.blocks.fluid;

import co.uk.silvania.cities.research.FlenixCities_Research;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCoolant extends BlockFluidClassic {

	public BlockCoolant(Fluid fluid) {
		super(fluid, Material.water);
		this.setDensity(10);
		this.setTemperature(425);
	}
	
	@SideOnly(Side.CLIENT)
	protected IIcon stillIcon;
	@SideOnly(Side.CLIENT)
	protected IIcon flowingIcon;
	
	@Override
	public IIcon getIcon(int side, int meta) {
		return (side == 0 || side == 1) ? stillIcon : flowingIcon;
	}
	
    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        entity.attackEntityFrom(DamageSource.onFire, 1.0F);
    }

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister icon) {
		stillIcon = icon.registerIcon(FlenixCities_Research.modid + ":coolantStill");
		flowingIcon = icon.registerIcon(FlenixCities_Research.modid + ":coolantFlowing");
	}
	
	@Override
	public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
		return super.canDisplace(world, x, y, z);
	}
	
    @Override
    public boolean displaceIfPossible(World world, int x, int y, int z) {
    	return super.displaceIfPossible(world, x, y, z);
    }
}
