package co.uk.silvania.cities.research.blocks.advanced;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import co.uk.silvania.cities.research.FlenixCities_Research;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SimplePlayerDetectorBlock extends Block implements ITileEntityProvider {

	public SimplePlayerDetectorBlock() {
		super(Material.iron);
		this.setCreativeTab(FlenixCities_Research.tabCitiesResearch);
		this.setHardness(2.0F);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		TileSimplePlayerDetector tileEntity = (TileSimplePlayerDetector) world.getTileEntity(x, y, z);
		if (!world.isRemote) {
			if (player.isSneaking()) {
				if (tileEntity.range > 2) {
					tileEntity.range--;
					player.addChatComponentMessage(new ChatComponentText("Detector's Range set to " + EnumChatFormatting.RED + "" + tileEntity.range + "."));
				} else {
					player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + "The range can't go any lower than that!"));
				}
			}
		}
		return true;
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		return blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	private IIcon blockIconP;
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(FlenixCities_Research.modid + ":" + (this.getUnlocalizedName().substring(5)));
		blockIconP = iconRegister.registerIcon(FlenixCities_Research.modid + ":" + (this.getUnlocalizedName().substring(5) + "_p"));
	}
	
	@Override
    public boolean canProvidePower() {
        return true;
    }
	
	@Override
	public int isProvidingWeakPower(IBlockAccess block, int x, int y, int z, int side) {
		int meta = block.getBlockMetadata(x, y, z);
		if (meta == 1) {
			return 15;
		} else
			return 0;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int id) {
		return new TileSimplePlayerDetector();
	}
}
