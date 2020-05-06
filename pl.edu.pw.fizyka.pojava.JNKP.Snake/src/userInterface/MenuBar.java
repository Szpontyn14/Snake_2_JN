package userInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar {

	private static final long serialVersionUID = 1L;
	JMenuBar bar;
	JMenu menu;
	JMenuItem it1;
	JMenuItem it2;
	JMenuItem it3;
	JMenuItem it4;

	public MenuBar() {

		bar = new JMenuBar();

		menu = new JMenu("Menu");
		this.add(menu);

		it1 = new JMenuItem("New game");
		it2 = new JMenuItem("Reset");
		it3 = new JMenuItem("Return");
		it4 = new JMenuItem("Close");

		menu.add(it1);
		menu.add(it2);
		menu.add(it3);
		menu.add(it4);

		it1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
			}

		});
		it2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
			}

		});
		it3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				GameMainFrame.setFocus();
			}

		});
		it4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
				System.exit(0);
			}

		});
	}

}
