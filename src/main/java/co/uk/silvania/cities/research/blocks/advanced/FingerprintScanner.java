package co.uk.silvania.cities.research.blocks.advanced;

import co.uk.silvania.cities.research.FlenixCities_Research;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class FingerprintScanner extends Block implements ITileEntityProvider {

	public FingerprintScanner() {
		super(Material.iron);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float j, float k, float l) {
		if (!world.isRemote) {
			player.openGui(FlenixCities_Research.instance, 0, world, x, y, z);
			TileFingerprintScanner te = (TileFingerprintScanner) world.getTileEntity(x, y, z);
			if (te.redstoneActive) {
				
			}
		}
		return true;
	}
	
	//Right click block ->
	// Check player name
	// If (allowedPlayer) {
	    //Apply redstone pulse for 5 seconds
	// } else {
		// Setting; either nothing, alarm, or log.
		// Upgrade lets log copy the fingerprint. Very expensive to do.

	@Override
	public TileEntity createNewTileEntity(World world, int id) {
		return new TileFingerprintScanner();
	}

}
