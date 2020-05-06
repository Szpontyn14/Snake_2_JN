package userInterface;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ShopPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	JButton b1;
	JButton b2;
	JButton b3;
	JLabel l1;
	
	public ShopPanel() {
		// TODO Auto-generated constructor stub
		this.setLayout(new FlowLayout());
		l1 = new JLabel("Welcome to the shop");
		b1 = new JButton("Buy");
		b2 = new JButton("Sell");
		b3 = new JButton("Gie³da papierów wartoœciowych");
		
		this.add(l1);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		
//		b1.setActionCommand("1");
//		b1.addActionListener(this);
//		b1.setSelected(true);
		}

	public ShopPanel(LayoutManager layout) {
		super(layout);
		// TODO Auto-generated constructor stub
	}

	public ShopPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	public ShopPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int actionSelected = Integer.parseInt(e.getActionCommand());
		switch (actionSelected) {
		case 1:
			
			break;
		case 2:
			
			break;
		default: // any other
			System.out.println("ërror");
			break;
		}
		
	}

}
