package constants;

public class Constants {
	private Constants() {

	}

	// tytul
	public static final String TITLE = "Spacial Snake DC (Debris Collector)";

	// WSTEPNIE rozmiar okienka - potem zmienimy na mozliwy do zmiany, teraz
	// wywolywalo to bledy
	public static final int BOARD_WIDTH = 800;
	public static final int BOARD_HEIGHT = 600;

	public static int density[] = { 100, 50, 25 }; // kids , medium , hardcore
	
//	public enum density
//	{
//		kids, medium, hardcore;
//	}
	
	
	

	// tempo odswiezanie aplikacji
	public static final int GAME_SPEED = 300; /*
												 * 30ms = ponad 30 odswiezen na sekunde czyli ponad 30FPS -> optymalna
												 * plynnosc
												 */ // ZMIENIC W RAZIE ZASOBOZERNOSCI
	// userInterface/GamePanel/paintComponent i update nie dzialaja w 100%
	// prawidlowo

	// images dla obiektow
	
	
	public static final String CANDY100_IMAGE_URL = "images/100/debris100.png";
	public static final String SNAKEHEAD100l_IMAGE_URL = "images/100/head100l.png";
	public static final String SNAKEHEAD100r_IMAGE_URL = "images/100/head100r.png";
	public static final String SNAKEHEAD100u_IMAGE_URL = "images/100/head100u.png";
	public static final String SNAKEHEAD100d_IMAGE_URL = "images/100/head100d.png";
	public static final String SNAKETAIL100_IMAGE_URL = "images/100/tail100.png";
	
	public static final String CANDY50_IMAGE_URL = "images/50/debris50.png";
	public static final String SNAKEHEAD50l_IMAGE_URL = "images/50/head50l.png";
	public static final String SNAKEHEAD50r_IMAGE_URL = "images/50/head50r.png";
	public static final String SNAKEHEAD50u_IMAGE_URL = "images/50/head50u.png";
	public static final String SNAKEHEAD50d_IMAGE_URL = "images/50/head50d.png";
	public static final String SNAKETAIL50_IMAGE_URL = "images/50/tail50.png";
	
	public static final String CANDY25_IMAGE_URL = "images/25/debris25.png";
	public static final String SNAKEHEAD25l_IMAGE_URL = "images/25/head25l.png";
	public static final String SNAKEHEAD25r_IMAGE_URL = "images/25/head25r.png";
	public static final String SNAKEHEAD25u_IMAGE_URL = "images/25/head25u.png";
	public static final String SNAKEHEAD25d_IMAGE_URL = "images/25/head25d.png";
	public static final String SNAKETAIL25_IMAGE_URL = "images/25/tail25.png";
	
	public static final String BACKGROUND_IMAGE_URL = "images/background.png";
	

	// dane o glowie weza - do pozycjonowania
	public static final int SNAKEHEAD_HEIGHT = 100; // 87
	public static final int SNAKEHEAD_WIDTH = 100; // 89

}
