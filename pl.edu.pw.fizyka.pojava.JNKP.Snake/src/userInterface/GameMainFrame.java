package userInterface;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import constants.Constants;
import images.Image;
import images.ImageFactory;

public class GameMainFrame extends JFrame
{
	
	private static final long serialVersionUID = 1L;

	public GameMainFrame()
	{
		initializeLayout();
	}
	
	private void initializeLayout()
	{
		add(new GamePanel(), BorderLayout.CENTER);
		add(new MenuBar(), BorderLayout.PAGE_START);
		add(new RightPanel(), BorderLayout.LINE_END);
		
		setTitle(Constants.TITLE);
		setIconImage(ImageFactory.createImage(Image.SNAKEHEAD).getImage());
		
		pack();//dzieki temu i add(new GamePanel()) upewniamy sie, ze okno
		//bedzie w takim rozmiarze jak chcemy w GamePanel
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//to bedzie zmienione potem, na razie robimy "sztywne" okienko:
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
}
