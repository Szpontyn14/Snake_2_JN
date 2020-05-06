package model;

import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import model.Candy;
import constants.Constants;
import images.Image;
import images.ImageFactory;

public class SnakeHead extends Sprite {

	static int[] prev_x = new int[100];
	static int[] prev_y = new int[100];

	public static int[] getPrev_x() {
		return prev_x;
	}

	public static int[] getPrev_y() {
		return prev_y;
	}

	public static int grid_x;
	public static int grid_y;

	public int getGrid_x() {
		return grid_x;
	}

	public int getGrid_y() {
		return grid_y;
	}

	public SnakeHead() {
		initialize();
	}

	private void initialize() {
		ImageIcon imageIcon = ImageFactory.createImage(Image.SNAKEHEAD100r);
		System.out.println(imageIcon.getIconHeight()); // debug
		setImage(imageIcon.getImage());

		grid_x = Constants.BOARD_WIDTH / Constants.density[1];
		grid_y = Constants.BOARD_HEIGHT / Constants.density[1];

		Random r = new Random();
		int randpos_x = r.nextInt(grid_x); // n liczb 0,...,n
		int randpos_y = r.nextInt(grid_y); // n liczb 0,...,n
		int start_x = Constants.density[1] * randpos_x;
		int start_y = Constants.density[1] * randpos_y;

//		int start_x = Constants.BOARD_WIDTH / 2 - Constants.SNAKEHEAD_WIDTH / 2;
//		int start_y = Constants.BOARD_HEIGHT / 2 - Constants.SNAKEHEAD_HEIGHT / 2;
		setX(start_x);
		setY(start_y);

	}

	@Override
	public void move() {
		for (int i = 5; i >= 0; i--) {
			prev_x[i + 1] = prev_x[i];
			prev_y[i + 1] = prev_y[i];
			System.out.println("wykonanie" + i);
		}
//			prev_x[1] = prev_x[0];
//			prev_y[1] = prev_y[0];
		prev_x[0] = x;// wpisujemy bie¿ wartosc
		prev_y[0] = y;
		x += dx;
		y += dy;

		if (x < 0) {
			x = 0;
			setDead(true);
		}

		if (x > (Constants.BOARD_WIDTH - Constants.SNAKEHEAD_WIDTH)) {
			x = Constants.BOARD_WIDTH - Constants.SNAKEHEAD_WIDTH;
			setDead(true);
		}

		if (y < 0) {
			y = 0;
			setDead(true);
		}
		if (y > Constants.BOARD_HEIGHT - Constants.SNAKEHEAD_HEIGHT) {
			y = Constants.BOARD_HEIGHT - Constants.SNAKEHEAD_HEIGHT;
			setDead(true);
		}

//		System.out.println(Candy.getRandomStartX()+" "+Candy.getRandomStartY()); //debug
		if (Math.abs(Candy.getRandomStartX() - getX()) < 20 && Math.abs(Candy.getRandomStartY() - getY()) < 20) {
			System.out.println("owocek");
		}

//		if (isDead())
//			System.out.println("dead");
//		else
//			System.out.println("alive");
	}

	public void keyPressed(KeyEvent e) {
		int pushbutton = e.getKeyCode();
		/*
		 * w=87 a=65 s=83 d=68
		 */
//		System.out.println("key pressed is " + pushbutton); // debug

		switch (pushbutton) {
		case KeyEvent.VK_LEFT:
		case KeyEvent.VK_A:
			ImageIcon imageIconl = ImageFactory.createImage(Image.SNAKEHEAD100l);
			setImage(imageIconl.getImage());
			dx = -Constants.SNAKEHEAD_WIDTH / 6;
			dy = 0;
			break;

		case KeyEvent.VK_RIGHT:
		case KeyEvent.VK_D:
			ImageIcon imageIconr = ImageFactory.createImage(Image.SNAKEHEAD100r);
			setImage(imageIconr.getImage());
			dx = Constants.SNAKEHEAD_WIDTH / 6;
			dy = 0;
			break;

		case KeyEvent.VK_UP:
		case KeyEvent.VK_W:
			ImageIcon imageIconu = ImageFactory.createImage(Image.SNAKEHEAD100u);
			setImage(imageIconu.getImage());
			dx = 0;
			dy = -Constants.SNAKEHEAD_HEIGHT / 6;
			break;

		case KeyEvent.VK_DOWN:
		case KeyEvent.VK_S:
			ImageIcon imageIcond = ImageFactory.createImage(Image.SNAKEHEAD100d);
			setImage(imageIcond.getImage());
			dx = 0;
			dy = Constants.SNAKEHEAD_HEIGHT / 6;
			break;

		case 32:
			dy = 0;
			dx = 0;
			break;

		default:
			break;
		}
	}
}
