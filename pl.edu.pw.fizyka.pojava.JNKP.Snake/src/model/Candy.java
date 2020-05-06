package model;

import java.util.Random;
import constants.Constants;
import javax.swing.ImageIcon;

import images.Image;
import images.ImageFactory;

public class Candy extends Sprite
{
	public Candy()
	{
		initialize();
	}
	
	private void initialize()
	{
		ImageIcon imageIcon = ImageFactory.createImage(Image.CANDY);
		setImage(imageIcon.getImage());
		
		Random rand = new Random();
		/*int randomStartX = rand.nextInt(Constants.BOARD_WIDTH/2-Constants.SNAKEHEAD_WIDHT || Constants.BOARD_WIDTH/2+Constants.SNAKEHEAD_WIDHT);
		int randomStartY = rand.nextInt(Constants.BOARD_HEIGHT/2-Constants.SNAKEHEAD_HEIGHT || Constants.BOARD_HEIGHT/2+Constants.SNAKEHEAD_HEIGHT);
		
		setX(randomStartX);
		setY(randomStartY);*/
		
		/*int aaaa_x = rand.nextInt(Constants.BOARD_WIDTH/2-Constants.SNAKEHEAD_WIDHT);
		int bbbb_x = rand.nextInt(Constants.BOARD_WIDTH/2)+(Constants.BOARD_WIDTH/2-Constants.SNAKEHEAD_WIDHT);
		
		int aaaa_y = rand.nextInt(Constants.BOARD_WIDTH/2-Constants.SNAKEHEAD_WIDHT);
		int bbbb_y = rand.nextInt(Constants.BOARD_WIDTH/2)+(Constants.BOARD_WIDTH/2-Constants.SNAKEHEAD_WIDHT);
		setX(random.nextBoolean() ? a : b);
		setY(randomStartY);*/
		
		int randomStartX = rand.nextInt(Constants.BOARD_WIDTH);
		int randomStartY = rand.nextInt(Constants.BOARD_HEIGHT);
		
		setX(randomStartX);
		setY(randomStartY);
	}
	
	@Override
	public void move()
	{
		x += dx;
		y += dy;
	}
}
