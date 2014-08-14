package co.uk.silvania.cities.research;

import net.minecraftforge.client.event.TextureStitchEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EventListener {
	
	@SideOnly(Side.CLIENT)
	public void postStitch(TextureStitchEvent.Post event) {
		System.out.println("Registering FC Research Coolant Fluid Texture for tank usage");
		FCR_Blocks.coolantFluid.setIcons(FCR_Blocks.coolantBlock.getBlockTextureFromSide(0), FCR_Blocks.coolantBlock.getBlockTextureFromSide(1));
	}

}
