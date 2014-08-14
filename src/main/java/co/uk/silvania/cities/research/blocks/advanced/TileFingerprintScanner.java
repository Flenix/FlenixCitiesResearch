package co.uk.silvania.cities.research.blocks.advanced;

import net.minecraft.tileentity.TileEntity;

public class TileFingerprintScanner extends TileEntity {
	
	public boolean addMode;
	public boolean redstoneActive = false;
	public int timerDelay = 10;
	int tickCounter = 0;
	
	
	@Override
	public void updateEntity() {
		if (redstoneActive) {
			if (tickCounter < (timerDelay * 20)) {
				tickCounter++;
			} else {
				redstoneActive = false;
			}
		}
	}

}
