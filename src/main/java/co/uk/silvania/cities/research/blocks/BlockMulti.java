package co.uk.silvania.cities.research.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import co.uk.silvania.cities.research.FlenixCities_Research;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMulti extends Block {

	public BlockMulti() {
		super(Material.rock);
		this.setCreativeTab(FlenixCities_Research.tabCitiesResearch);
		this.setHardness(10.0F);
	}
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	@SideOnly(Side.CLIENT)
	private IIcon basicTile;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		icons = new IIcon[16];
		for (int i = 0; i < icons.length; i++) {
			icons[i] = iconRegister.registerIcon(FlenixCities_Research.modid + ":" + (this.getUnlocalizedName().substring(5)) + i);
		}
		basicTile = iconRegister.registerIcon(FlenixCities_Research.modid + ":ceramicBlockTiles0");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta) {
		if (this.getUnlocalizedName().contains("ceramicWall")) {
			if (side == 0 || side == 1) {
				return basicTile;
			}
		}
		return icons[meta];
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubBlocks(Item item, CreativeTabs ctabs, List list) {
		for (int i = 0; i < 16; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
	
	@Override
	public int damageDropped(int meta) {
		return meta;
	}

}
