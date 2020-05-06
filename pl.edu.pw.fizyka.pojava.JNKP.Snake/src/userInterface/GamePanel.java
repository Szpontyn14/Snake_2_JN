package userInterface;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.Timer;

import callbacks.GameEventListener;
import constants.Constants;
import images.Image;
import images.ImageFactory;
import model.Candy;
import model.SnakeHead;

public class GamePanel extends JPanel
{

	private static final long serialVersionUID = 1L;
	private ImageIcon backgroundImage;
	private Timer timer;
	private boolean inGame = true;
	
	private SnakeHead snakeHead;
	private Candy candy;
	
	
	public GamePanel()
	{
		initializeVariables();
		initializeLayout();
	}
	
	private void initializeVariables()
	{
		this.snakeHead = new SnakeHead();
		this.candy = new Candy();
		this.backgroundImage = ImageFactory.createImage(Image.BACKGROUND);
		this.timer = new Timer(Constants.GAME_SPEED,new GameLoop(this));
		this.timer.start();
	}

	private void initializeLayout()
	{
		addKeyListener(new GameEventListener(this));
		//callbacks/GameEventListener->GamePanel->userInterface/GamePanel->GamePanel
		setFocusable(true);
		setPreferredSize(new Dimension(Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT));
	}
	
	private void drawPlayer(Graphics g)
	{
		g.drawImage(snakeHead.getImage(), snakeHead.getX(), snakeHead.getY(), this);
		/*this wskazuje na observer -> observerem jest GamePanel ktory przekazuje nam 
		 * zaobserwowane dane i je wyswietla - tak to zrozumialem*/
		//Toolkit.getDefaultToolkit().sync();
		
		g.drawImage(candy.getImage(), candy.getX(), candy.getY(), this);
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.drawImage(backgroundImage.getImage(),0,0,null);
		
		//System.out.println("REPAINT");
		//Toolkit.getDefaultToolkit().sync();
		doDrawing(g);
	}

	private void doDrawing(Graphics g)
	{
		update();
		draw();

		if(inGame)
		{
			drawPlayer(g);
		}
		else
		{
			if(timer.isRunning())
			{
				timer.stop();
			}
		}
		
		Toolkit.getDefaultToolkit().sync();/*JN: jesli ten komentarz tu jest to znaczy, ze nie
		zapoznalem sie jeszcze z dzialaniem tego wiersza i nie rozumiem jak dziala - spotkalem 
		sie z nim zarowno na StackOverflow jak i na SoloLearn i wydaje sie konieczny*/
	}

	public void doOneLoop()
	{
		update();
		repaint();
	}
	
	private void update()
	{
		//System.out.println("UPDATE");
		this.snakeHead.move();
		this.candy.move();
	}
	
	private void draw()
	{
	}

	public void keyPressed(KeyEvent e)
	{
		this.snakeHead.keyPressed(e);
	}
}
