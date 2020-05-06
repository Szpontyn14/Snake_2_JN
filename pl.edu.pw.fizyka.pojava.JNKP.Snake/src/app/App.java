package app;

import java.awt.EventQueue;

import userInterface.GameMainFrame;

public class App {
	public static void main(String[] args) // wielowatkowosc, nie rozumiem tego
	{
		EventQueue.invokeLater(() -> {
			new GameMainFrame();
		});
	}
}
