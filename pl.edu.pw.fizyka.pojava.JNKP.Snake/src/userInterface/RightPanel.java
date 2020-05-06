package userInterface;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RightPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	JButton b1;
	JButton b2;
	JButton b3;
	JTextField f1;
	
	JPanel top;
	JPanel bottom;
	
	ShopPanel sklepik;

	public RightPanel() {
		top = new JPanel();
		bottom = new JPanel();
		
		this.add(top);
		this.add(bottom);
		
		this.setLayout(new GridLayout(2,1));
		
		// TODO Auto-generated constructor stub
		top.setLayout(new GridLayout(4,1));
		b1 = new JButton("Shop");
		b2 = new JButton("Scores");
		b3 = new JButton("More");
		f1 = new JTextField("");
		
		top.add(b1);
		top.add(b2);
		top.add(b3);
		top.add(f1);

		b1.setActionCommand("1a");
		b1.addActionListener(this);
		b1.setSelected(true);
		
		//bottom.setLayout(new GridLayout(2, 2));
		//bottom.add(b1);
		//bottom.add(new ShopPanel());
		sklepik = new ShopPanel();
		bottom.add(sklepik);
		sklepik.setVisible(false);
		//bottom.add(sklepik);
		}

	public RightPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public RightPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public RightPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionSelected = e.getActionCommand();
		System.out.println(actionSelected);
		switch (actionSelected) {
		case "1a":
//			bottom.add(sklepik);
//			bottom.setVisible(true);
//			sklepik.setBackground(Color.lightGray);
//			bottom.repaint();
			System.out.println("opening sklep panel");
			sklepik.setVisible(true);
			b1.setText("Shop close");
			b1.setActionCommand("1b");
			break;
		case "1b":
			System.out.println("closing sklep panel");
			sklepik.setVisible(false);
			b1.setText("Shop");
			b1.setActionCommand("1a");
			break;
		default: // any other
			System.out.println("ërror");
			break;
		}
		
	}

}
