package app.AreYouStupid;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class IKnewIt {
	JFrame frame = new JFrame("A new Window");
	JLabel label = new JLabel("I knew it");
	
	public IKnewIt() {
		label.setBounds(150, 150, 200, 50);
		label.setFont(new Font("Cambria",Font.BOLD,40));
		
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.add(label);

	}
}