package gui;

import java.awt.*;
import javax.swing.*;

public class ProgressBar {
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();
	
	ProgressBar(){
		
		bar.setValue(0);
		bar.setBounds(0, 0, 800, 30);
		bar.setStringPainted(true);
		bar.setForeground(Color.green);
		bar.setBackground(Color.black);
		bar.setFont(new Font("Cambria",Font.BOLD,30));
		bar.setString("Loading...");
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(800,500);
		//frame.pack();
		
		fillBar();
	}
	
	public void fillBar() {
		int count=0;
		
		while (count<=100) {
			bar.setValue(count);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count +=1;
		}
		bar.setString("DONE!");
	}
	
}
