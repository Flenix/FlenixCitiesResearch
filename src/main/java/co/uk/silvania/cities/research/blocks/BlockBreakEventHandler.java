package co.uk.silvania.cities.research.blocks;

import co.uk.silvania.cities.research.blocks.advanced.SimplePlayerDetectorBlock;
import co.uk.silvania.cities.research.blocks.advanced.TileSimplePlayerDetector;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

public class BlockBreakEventHandler {
	
	
	@SubscribeEvent
	public void onBreakEvent(BreakEvent event) {
		World world = event.world;
		EntityPlayer player = event.getPlayer();
		
		if (player.isSneaking()) {
			if (event.block instanceof SimplePlayerDetectorBlock) {
				event.setCanceled(true);

				TileSimplePlayerDetector tileEntity = (TileSimplePlayerDetector) world.getTileEntity(event.x, event.y, event.z);
				if (!world.isRemote) {
					if (player.isSneaking()) {
						if (tileEntity.range < 32) {
							tileEntity.range++;
							player.addChatComponentMessage(new ChatComponentText("Detector's Range set to " + EnumChatFormatting.GREEN + "" + tileEntity.range + "."));
						} else {
							player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.DARK_RED + "The range can't go any higher than that!"));
						}
					}
				}
			}
		}
	}
}
