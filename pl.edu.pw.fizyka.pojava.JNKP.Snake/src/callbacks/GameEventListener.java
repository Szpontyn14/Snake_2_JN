package callbacks;

import java.awt.event.KeyListener;

import userInterface.GamePanel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameEventListener extends KeyAdapter implements KeyListener
{
	private GamePanel keyboard;
	
	public GameEventListener(GamePanel keyboard)
	{
		this.keyboard = keyboard;
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		this.keyboard.keyPressed(e);
	}
	
}
