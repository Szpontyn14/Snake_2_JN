package images;

import javax.swing.ImageIcon;

import constants.Constants;

public class ImageFactory {
	public static ImageIcon createImage(Image image) {
		ImageIcon imageIcon = null;

		switch (image) {
		case BACKGROUND:
			imageIcon = new ImageIcon(Constants.BACKGROUND_IMAGE_URL);
			break;

		case CANDY100:
			imageIcon = new ImageIcon(Constants.CANDY100_IMAGE_URL);
			break;
		case SNAKEHEAD100l:
			imageIcon = new ImageIcon(Constants.SNAKEHEAD100l_IMAGE_URL);
			break;
		case SNAKEHEAD100r:
			imageIcon = new ImageIcon(Constants.SNAKEHEAD100r_IMAGE_URL);
			break;
		case SNAKEHEAD100u:
			imageIcon = new ImageIcon(Constants.SNAKEHEAD100u_IMAGE_URL);
			break;
		case SNAKEHEAD100d:
			imageIcon = new ImageIcon(Constants.SNAKEHEAD100d_IMAGE_URL);
			break;
		case SNAKETAIL100:
			imageIcon = new ImageIcon(Constants.SNAKETAIL100_IMAGE_URL);
			break;
			
		case CANDY50:
			imageIcon = new ImageIcon(Constants.CANDY50_IMAGE_URL);
			break;
		case SNAKEHEAD50l:
			imageIcon = new ImageIcon(Constants.SNAKEHEAD50l_IMAGE_URL);
			break;
		case SNAKEHEAD50r:
			imageIcon = new ImageIcon(Constants.SNAKEHEAD50r_IMAGE_URL);
			break;
		case SNAKEHEAD50u:
			imageIcon = new ImageIcon(Constants.SNAKEHEAD50u_IMAGE_URL);
			break;
		case SNAKEHEAD50d:
			imageIcon = new ImageIcon(Constants.SNAKEHEAD50d_IMAGE_URL);
			break;
		case SNAKETAIL50:
			imageIcon = new ImageIcon(Constants.SNAKETAIL50_IMAGE_URL);
			break;
			
		case CANDY25:
			imageIcon = new ImageIcon(Constants.CANDY25_IMAGE_URL);
			break;
		case SNAKEHEAD25l:
			imageIcon = new ImageIcon(Constants.SNAKEHEAD25l_IMAGE_URL);
			break;
		case SNAKEHEAD25r:
			imageIcon = new ImageIcon(Constants.SNAKEHEAD25r_IMAGE_URL);
			break;
		case SNAKEHEAD25u:
			imageIcon = new ImageIcon(Constants.SNAKEHEAD25u_IMAGE_URL);
			break;
		case SNAKEHEAD25d:
			imageIcon = new ImageIcon(Constants.SNAKEHEAD25d_IMAGE_URL);
			break;
		case SNAKETAIL25:
			imageIcon = new ImageIcon(Constants.SNAKETAIL25_IMAGE_URL);
			break;
			
		default:
			return null;
		}
		return imageIcon;
	}
}
