package app.CreatenNewWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InitialFrame implements ActionListener{
	
	JFrame frame = new JFrame("Initial Window");
	JButton button = new JButton("New window");
	
	public InitialFrame() {
		button.setBounds(20, 20, 150, 40);
		button.addActionListener(this);
		
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.add(button);
	}
	
	int x=0;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button && x<=4) {
			NewWindow newWindow=new NewWindow();
			x+=1;
		}
		
		}
	}

