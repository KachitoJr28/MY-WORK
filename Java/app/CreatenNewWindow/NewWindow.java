package app.CreatenNewWindow;

import javax.swing.JFrame;

public class NewWindow {
	JFrame frame = new JFrame("A new Window");
	
	NewWindow() {
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
	}
}
