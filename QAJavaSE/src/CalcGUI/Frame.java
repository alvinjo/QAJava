package CalcGUI;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {
	
	
	public static void main(String[] args) {
		
		Frame frame = new Frame();
		
		frame.setSize(500,700);
		frame.setVisible(true);
		
	}
	
	public Frame() {
		
		JPanel jp = new JPanel(new GridLayout(3,6));
		
		
		
	}
	

}
