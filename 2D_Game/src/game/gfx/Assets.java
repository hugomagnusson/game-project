package game.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 32, height = 32;
	
	public static BufferedImage monster, player, grass, dirt, stone, tree;
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/spritesheet.png"));
		
		player = sheet.crop(32, 0, width, height);
		monster = sheet.crop(0, 0, width, height);
		dirt = sheet.crop(3 * width, 0, width, height);
		grass = sheet.crop(2 * width, 0, width, height);
		stone = sheet.crop(0, height, width, height);
		tree = sheet.crop(width, height, width, height);
		
	}
	
}
