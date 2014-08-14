package co.uk.silvania.cities.research.blocks;

public class ConnectedTextureHandler {
	
	static int blockID = 0;
	
	static boolean topBlockID = false;
	static boolean bottomBlockID = false;
	static boolean northBlockID = false;
	static boolean southBlockID = false;
	static boolean eastBlockID = false;
	static boolean westBlockID = false;
	
	public static int blockID(int id) {
		return blockID;
	}

	public static void checkTextures(int idTop, int idBottom, int idNorth, int idSouth, int idEast, int idWest) {
		if (idTop == blockID) {
			topBlockID = true;
		}
		if (idBottom == blockID) {
			bottomBlockID = true;
		}
		if (idNorth == blockID) {
			northBlockID = true;
		}
		if (idSouth == blockID) {
			southBlockID = true;
		}
		if (idEast == blockID) {
			eastBlockID = true;
		}
		if (idWest == blockID) {
			westBlockID = true;
		}
	}
	
	//Top Side
	public static String topSideTexture() {
		String textureStr = "";
		if (northBlockID) {
			textureStr = textureStr + 1;
		}
		if (southBlockID) {
			textureStr = textureStr + 2;
		}
		if (eastBlockID) {
			textureStr = textureStr + 3;
		}
		if (westBlockID) {
			textureStr = textureStr + 4;
		}
		
		if (textureStr.equals("")) {
			textureStr = "0";
		}
		return textureStr;
	}

}
