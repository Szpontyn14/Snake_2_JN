package model;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

//import constants.Constants;
import images.Image;
import images.ImageFactory;

public class SnakeTail extends Sprite {
	public SnakeTail() {
		initialize();
	}

	private void initialize() {
		ImageIcon imageIcon = ImageFactory.createImage(Image.SNAKETAIL100);
		// System.out.println(imageIcon.getIconHeight()); //debug
		setImage(imageIcon.getImage());
	}

	@Override
	public void move() {
		for (int i = 0; i < 2; i++) {
			System.out.println("i=" + i);
			System.out.print("x=" + SnakeHead.getPrev_x()[i]);
			System.out.println(" y=" + SnakeHead.getPrev_y()[i]);
		}
		setX(SnakeHead.getPrev_x()[2]);
		setY(SnakeHead.getPrev_y()[2]);
	}

	public void keyPressed(KeyEvent e) {

	}
}
