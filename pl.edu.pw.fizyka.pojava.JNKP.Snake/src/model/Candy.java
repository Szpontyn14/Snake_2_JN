package model;

import model.SnakeHead;
import java.util.Random;
import constants.Constants;
import javax.swing.ImageIcon;

import images.Image;
import images.ImageFactory;

public class Candy extends Sprite {
	public Candy() {
		initialize();
	}

	static int randomStartX;
	static int randomStartY;

	public static int getRandomStartX() {
		return randomStartX;
	}

	public static int getRandomStartY() {
		return randomStartY;
	}

	private void initialize() {
		ImageIcon imageIcon = ImageFactory.createImage(Image.CANDY100);
		setImage(imageIcon.getImage());

//		Random rand = new Random();
		/*
		 * int randomStartX =
		 * rand.nextInt(Constants.BOARD_WIDTH/2-Constants.SNAKEHEAD_WIDHT ||
		 * Constants.BOARD_WIDTH/2+Constants.SNAKEHEAD_WIDHT); int randomStartY =
		 * rand.nextInt(Constants.BOARD_HEIGHT/2-Constants.SNAKEHEAD_HEIGHT ||
		 * Constants.BOARD_HEIGHT/2+Constants.SNAKEHEAD_HEIGHT);
		 * 
		 * setX(randomStartX); setY(randomStartY);
		 */

		/*
		 * int aaaa_x = rand.nextInt(Constants.BOARD_WIDTH/2-Constants.SNAKEHEAD_WIDHT);
		 * int bbbb_x =
		 * rand.nextInt(Constants.BOARD_WIDTH/2)+(Constants.BOARD_WIDTH/2-Constants.
		 * SNAKEHEAD_WIDHT);
		 * 
		 * int aaaa_y = rand.nextInt(Constants.BOARD_WIDTH/2-Constants.SNAKEHEAD_WIDHT);
		 * int bbbb_y =
		 * rand.nextInt(Constants.BOARD_WIDTH/2)+(Constants.BOARD_WIDTH/2-Constants.
		 * SNAKEHEAD_WIDHT); setX(random.nextBoolean() ? a : b); setY(randomStartY);
		 */

		Random r = new Random();
		int randpos_x = r.nextInt(SnakeHead.grid_x); // n liczb 0,...,n
		int randpos_y = r.nextInt(SnakeHead.grid_y); // n liczb 0,...,n
		randomStartX = Constants.density[1] * randpos_x; //size * liczba kratek
		randomStartY = Constants.density[1] * randpos_y;

		setX(randomStartX);
		setY(randomStartY);
	}

	@Override
	public void move() {

	}
}
