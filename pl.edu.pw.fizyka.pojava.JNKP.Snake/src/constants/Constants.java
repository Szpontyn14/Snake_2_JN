package constants;

public class Constants
{
	private Constants()
	{
		
	}
	
	//tytul
	public static final String TITLE = "Spacial Snake DC (Debris Collector)";
	
	//WSTEPNIE rozmiar okienka - potem zmienimy na mozliwy do zmiany, teraz wywolywalo to bledy
	public static final int BOARD_WIDTH = 800;
	public static final int BOARD_HEIGHT = 600;
	
	//tempo odswiezanie aplikacji
	public static final int GAME_SPEED = 30; /*30ms = ponad 30 odswiezen na sekunde
	czyli ponad 30FPS -> optymalna plynnosc*/ //ZMIENIC W RAZIE ZASOBOZERNOSCI
	//userInterface/GamePanel/paintComponent i update nie dzialaja w 100% prawidlowo
	
	//images dla obiektow
	public static final String CANDY_IMAGE_URL = "images/debris.png";
	public static final String SNAKEHEAD_IMAGE_URL = "images/head.png";
	public static final String SNAKETAIL_IMAGE_URL = "images/tail.png";
	public static final String BACKGROUND_IMAGE_URL = "images/background.png";
	
	//dane o glowie weza - do pozyccjonowania
	public static final int SNAKEHEAD_HEIGHT = 87;
	public static final int SNAKEHEAD_WIDTH = 89;
	
}
