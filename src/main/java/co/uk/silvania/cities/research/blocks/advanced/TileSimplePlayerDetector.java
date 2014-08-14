package co.uk.silvania.cities.research.blocks.advanced;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

public class TileSimplePlayerDetector extends TileEntity {
	
	public int range = 5;
	public boolean playerInRange;
	public boolean isPowering;
	
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setInteger("range", range);
		nbt.setBoolean("isPowering", isPowering);
	}
	
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		this.range = nbt.getInteger("range");
		this.isPowering = nbt.getBoolean("isPowering");
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public void updateEntity() {
		worldObj.notifyBlockChange(xCoord, yCoord, zCoord, worldObj.getBlock(xCoord, yCoord, zCoord));
		List players = worldObj.getEntitiesWithinAABB(EntityPlayer.class, AxisAlignedBB.getBoundingBox(xCoord - range, yCoord - range, zCoord - range, xCoord + range, yCoord + range, zCoord + range));
		EntityPlayer player = worldObj.getClosestPlayer(xCoord, yCoord, zCoord, range);
		System.out.println("Player list: " + players);
		if (player != null) {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 1, 3);
			this.isPowering = true;
		} else {
			worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 0, 3);
			this.isPowering = false;
		}
	}
}
