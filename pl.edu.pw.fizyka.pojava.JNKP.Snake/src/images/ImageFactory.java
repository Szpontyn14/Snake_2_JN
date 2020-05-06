package images;

import javax.swing.ImageIcon;

import constants.Constants;
 
public class ImageFactory
{
	public static ImageIcon createImage(Image image)
	{
		ImageIcon imageIcon = null;
		
		switch(image)
		{
		case CANDY:
			imageIcon = new ImageIcon(Constants.CANDY_IMAGE_URL);
			break;
		case SNAKEHEAD:
			imageIcon = new ImageIcon(Constants.SNAKEHEAD_IMAGE_URL);
			break;
		case SNAKETAIL:
			imageIcon = new ImageIcon(Constants.SNAKETAIL_IMAGE_URL);
			break;
		case BACKGROUND:
			imageIcon = new ImageIcon(Constants.BACKGROUND_IMAGE_URL);
			break;
		default:
			return null;
		}
		return imageIcon;
	}
}
