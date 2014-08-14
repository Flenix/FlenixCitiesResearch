package co.uk.silvania.cities.research.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import co.uk.silvania.cities.research.FlenixCities_Research;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMultiCT extends Block {

	public BlockMultiCT() {
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
		icons = new IIcon[112];
		for (int i = 0; i < 10; i++) {
			icons[i] = iconRegister.registerIcon(FlenixCities_Research.modid + ":" + (this.getUnlocalizedName().substring(5)) + i);
		}
		for (int i = 10; i < 16; i++) {
			icons[i] = iconRegister.registerIcon(FlenixCities_Research.modid + ":" + (this.getUnlocalizedName().substring(5)) + i + "_0");
		}
		for (int i = 16; i < 32; i++) {
			icons[i] = iconRegister.registerIcon(FlenixCities_Research.modid + ":" + (this.getUnlocalizedName().substring(5)) + "10_" + (i - 16));
		}
		for (int i = 32; i < 48; i++) {
			icons[i] = iconRegister.registerIcon(FlenixCities_Research.modid + ":" + (this.getUnlocalizedName().substring(5)) + "11_" + (i - 32));
		}
		for (int i = 48; i < 64; i++) {
			icons[i] = iconRegister.registerIcon(FlenixCities_Research.modid + ":" + (this.getUnlocalizedName().substring(5)) + "12_" + (i - 48));
		}
		for (int i = 64; i < 80; i++) {
			icons[i] = iconRegister.registerIcon(FlenixCities_Research.modid + ":" + (this.getUnlocalizedName().substring(5)) + "13_" + (i - 64));
		}
		for (int i = 80; i < 96; i++) {
			icons[i] = iconRegister.registerIcon(FlenixCities_Research.modid + ":" + (this.getUnlocalizedName().substring(5)) + "14_" + (i - 80));
		}
		for (int i = 96; i < icons.length; i++) {
			icons[i] = iconRegister.registerIcon(FlenixCities_Research.modid + ":" + (this.getUnlocalizedName().substring(5)) + "15_" + (i - 96));
		}
		
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta) {
		return icons[meta];
	}
	
	@Override
	public IIcon getIcon(IBlockAccess block, int x, int y, int z, int side) {
		int meta = block.getBlockMetadata(x, y, z);
		if (meta >= 10) {
			return getConnectedBlockTexture(block, x, y, z, side, icons);
		}
		return getIcon(side, meta);
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
	
    public boolean shouldConnectToBlock (IBlockAccess block, int x, int y, int z, Block ctBlock, int ctMeta)
    {
        return ctBlock == block.getBlock(x, y, z);
    }
	
    public IIcon getConnectedBlockTexture (IBlockAccess block, int x, int y, int z, int side, IIcon[] icons) {
    	int meta = block.getBlockMetadata(x, y, z);
    	int c = (meta - 9) * 16;
        boolean connectUp = false, connectDown = false, connectLeft = false, connectRight = false;

        switch (side) {
        case 0:
            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x - 1, y, z), block.getBlockMetadata(x - 1, y, z))) {
                connectDown = true;
            }

            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x + 1, y, z), block.getBlockMetadata(x + 1, y, z))) {
                connectUp = true;
            }

            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x, y, z - 1), block.getBlockMetadata(x, y, z - 1))) {
                connectLeft = true;
            }

            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x, y, z + 1), block.getBlockMetadata(x, y, z + 1))) {
                connectRight = true;
            }

            if (connectUp && connectDown && connectLeft && connectRight) {
                return icons[15 + c];
            } else if (connectUp && connectDown && connectLeft) {
                return icons[11 + c];
            } else if (connectUp && connectDown && connectRight) {
                return icons[12 + c];
            } else if (connectUp && connectLeft && connectRight) {
                return icons[13 + c];
            } else if (connectDown && connectLeft && connectRight) {
                return icons[14 + c];
            } else if (connectDown && connectUp) {
                return icons[5 + c];
            } else if (connectLeft && connectRight) {
                return icons[6 + c];
            } else if (connectDown && connectLeft) {
                return icons[8 + c];
            } else if (connectDown && connectRight) {
                return icons[10 + c];
            } else if (connectUp && connectLeft) {
                return icons[7 + c];
            } else if (connectUp && connectRight) {
                return icons[9 + c];
            } else if (connectDown) {
                return icons[3 + c];
            } else if (connectUp) {
                return icons[4 + c];
            } else if (connectLeft) {
                return icons[2 + c];
            } else if (connectRight) {
                return icons[1 + c];
            } else if (!connectUp || !connectDown || !connectLeft || !connectRight) {
            	return icons[0 + c];
            }
            break;
            
        case 1:
            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x - 1, y, z), block.getBlockMetadata(x - 1, y, z))) {
                connectDown = true;
            }

            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x + 1, y, z), block.getBlockMetadata(x + 1, y, z))) {
                connectUp = true;
            }

            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x, y, z - 1), block.getBlockMetadata(x, y, z - 1))) {
                connectLeft = true;
            }

            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x, y, z + 1), block.getBlockMetadata(x, y, z + 1))) {
                connectRight = true;
            }

            if (connectUp && connectDown && connectLeft && connectRight) {
                return icons[15 + c];
            } else if (connectUp && connectDown && connectLeft) {
                return icons[11 + c];
            } else if (connectUp && connectDown && connectRight) {
                return icons[12 + c];
            } else if (connectUp && connectLeft && connectRight) {
                return icons[13 + c];
            } else if (connectDown && connectLeft && connectRight) {
                return icons[14 + c];
            } else if (connectDown && connectUp) {
                return icons[5 + c];
            } else if (connectLeft && connectRight) {
                return icons[6 + c];
            } else if (connectDown && connectLeft) {
                return icons[8 + c];
            } else if (connectDown && connectRight) {
                return icons[10 + c];
            } else if (connectUp && connectLeft) {
                return icons[7 + c];
            } else if (connectUp && connectRight) {
                return icons[9 + c];
            } else if (connectDown) {
                return icons[3 + c];
            } else if (connectUp) {
                return icons[4 + c];
            } else if (connectLeft) {
                return icons[2 + c];
            } else if (connectRight) {
                return icons[1 + c];
            } else if (!connectUp || !connectDown || !connectLeft || !connectRight) {
            	return icons[0 + c];
            }
            break;
            
        case 2:
            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x, y - 1, z), block.getBlockMetadata(x, y - 1, z))) {
                connectDown = true;
            }

            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x, y + 1, z), block.getBlockMetadata(x, y + 1, z))) {
                connectUp = true;
            }

            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x - 1, y, z), block.getBlockMetadata(x - 1, y, z))) {
                connectLeft = true;
            }

            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x + 1, y, z), block.getBlockMetadata(x + 1, y, z))) {
                connectRight = true;
            }

            if (connectUp && connectDown && connectLeft && connectRight) {
                return icons[15 + c];
            } else if (connectUp && connectDown && connectLeft) {
                return icons[13 + c];
            } else if (connectUp && connectDown && connectRight) {
                return icons[14 + c];
            } else if (connectUp && connectLeft && connectRight) {
                return icons[11 + c];
            } else if (connectDown && connectLeft && connectRight) {
                return icons[12 + c];
            } else if (connectDown && connectUp) {
                return icons[6 + c];
            } else if (connectLeft && connectRight) {
                return icons[5 + c];
            } else if (connectDown && connectLeft) {
                return icons[9 + c];
            } else if (connectDown && connectRight) {
                return icons[10 + c];
            } else if (connectUp && connectLeft) {
                return icons[7 + c];
            } else if (connectUp && connectRight) {
                return icons[8 + c];
            } else if (connectDown) {
                return icons[1 + c];
            } else if (connectUp) {
                return icons[2 + c];
            } else if (connectLeft) {
                return icons[4 + c];
            } else if (connectRight) {
                return icons[3 + c];
            } else if (!connectUp || !connectDown || !connectLeft || !connectRight) {
            	return icons[0 + c];
            }
            break;
            
        case 3:
            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x, y - 1, z), block.getBlockMetadata(x, y - 1, z))) {
                connectDown = true;
            }

            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x, y + 1, z), block.getBlockMetadata(x, y + 1, z))) {
                connectUp = true;
            }

            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x - 1, y, z), block.getBlockMetadata(x - 1, y, z))) {
                connectLeft = true;
            }

            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x + 1, y, z), block.getBlockMetadata(x + 1, y, z))) {
                connectRight = true;
            }

            if (connectUp && connectDown && connectLeft && connectRight) {
                return icons[15 + c];
            } else if (connectUp && connectDown && connectLeft) {
                return icons[14 + c];
            } else if (connectUp && connectDown && connectRight) {
                return icons[13 + c];
            } else if (connectUp && connectLeft && connectRight) {
                return icons[11 + c];
            } else if (connectDown && connectLeft && connectRight) {
                return icons[12 + c];
            } else if (connectDown && connectUp) {
                return icons[6 + c];
            } else if (connectLeft && connectRight) {
                return icons[5 + c];
            } else if (connectDown && connectLeft) {
                return icons[10 + c];
            } else if (connectDown && connectRight) {
                return icons[9 + c];
            } else if (connectUp && connectLeft) {
                return icons[8 + c];
            } else if (connectUp && connectRight) {
                return icons[7 + c];
            } else if (connectDown) {
                return icons[1 + c];
            } else if (connectUp) {
                return icons[2 + c];
            } else if (connectLeft) {
                return icons[3 + c];
            } else if (connectRight) {
                return icons[4 + c];
            } else if (!connectUp || !connectDown || !connectLeft || !connectRight) {
            	return icons[0 + c];
            }
            break;
            
        case 4:
            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x, y - 1, z), block.getBlockMetadata(x, y - 1, z))) {
                connectDown = true;
            }

            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x, y + 1, z), block.getBlockMetadata(x, y + 1, z))) {
                connectUp = true;
            }

            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x, y, z - 1), block.getBlockMetadata(x, y, z - 1))) {
                connectLeft = true;
            }

            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x, y, z + 1), block.getBlockMetadata(x, y, z + 1))) {
                connectRight = true;
            }
            //Same1
            if (connectUp && connectDown && connectLeft && connectRight) {
                return icons[15 + c];
            } else if (connectUp && connectDown && connectLeft) {
                return icons[14 + c];
            } else if (connectUp && connectDown && connectRight) {
                return icons[13 + c];
            } else if (connectUp && connectLeft && connectRight) {
                return icons[11 + c];
            } else if (connectDown && connectLeft && connectRight) {
                return icons[12 + c];
            } else if (connectDown && connectUp) {
                return icons[6 + c];
            } else if (connectLeft && connectRight) {
                return icons[5 + c];
            } else if (connectDown && connectLeft) {
                return icons[10 + c];
            } else if (connectDown && connectRight) {
                return icons[9 + c];
            } else if (connectUp && connectLeft) {
                return icons[8 + c];
            } else if (connectUp && connectRight) {
                return icons[7 + c];
            } else if (connectDown) {
                return icons[1 + c];
            } else if (connectUp) {
                return icons[2 + c];
            } else if (connectLeft) {
                return icons[3 + c];
            } else if (connectRight) {
                return icons[4 + c];
            } else if (!connectUp || !connectDown || !connectLeft || !connectRight) {
            	return icons[0 + c];
            }            
            break;
            
        case 5:
            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x, y - 1, z), block.getBlockMetadata(x, y - 1, z))) {
                connectDown = true;
            }

            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x, y + 1, z), block.getBlockMetadata(x, y + 1, z))) {
                connectUp = true;
            }

            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x, y, z - 1), block.getBlockMetadata(x, y, z - 1))) {
                connectLeft = true;
            }

            if (shouldConnectToBlock(block, x, y, z, block.getBlock(x, y, z + 1), block.getBlockMetadata(x, y, z + 1))) {
                connectRight = true;
            }
            
            if (connectUp && connectDown && connectLeft && connectRight) {
                return icons[15 + c];
            } else if (connectUp && connectDown && connectLeft) {
                return icons[13 + c];
            } else if (connectUp && connectDown && connectRight) {
                return icons[14 + c];
            } else if (connectUp && connectLeft && connectRight) {
                return icons[11 + c];
            } else if (connectDown && connectLeft && connectRight) {
                return icons[12 + c];
            } else if (connectDown && connectUp) {
                return icons[6 + c];
            } else if (connectLeft && connectRight) {
                return icons[5 + c];
            } else if (connectDown && connectLeft) {
                return icons[9 + c];
            } else if (connectDown && connectRight) {
                return icons[10 + c];
            } else if (connectUp && connectLeft) {
                return icons[7 + c];
            } else if (connectUp && connectRight) {
                return icons[8 + c];
            } else if (connectDown) {
                return icons[1 + c];
            } else if (connectUp) {
                return icons[2 + c];
            } else if (connectLeft) {
                return icons[4 + c];
            } else if (connectRight) {
                return icons[3 + c];
            } else if (!connectUp || !connectDown || !connectLeft || !connectRight) {
            	return icons[0 + c];
            }
            break;
        }
        return icons[0];
    }
}
