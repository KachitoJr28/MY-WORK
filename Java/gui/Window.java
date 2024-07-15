package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame implements ActionListener {
	
	static JButton button;
	static Random random;
	
	Window(){
		
		ImageIcon win=new ImageIcon("C:\\Users\\Administrator\\Desktop\\Coding\\Java\\gui\\images\\windows_1.png");
		
		random=new Random();
		
		button = new JButton();
		button.setBounds(50, 50, 140, 70);
		button.addActionListener(this);
		button.setText("Click me!");
		button.setIcon(win);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setIconTextGap(-5);
		button.setForeground(Color.pink);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setVisible(true);
		//size of the this
		this.setSize(350, 350);
		//what happens after x is clicked
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set if it would be resizable
		this.setResizable(true);
		this.add(button);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int x=random.nextInt(200)+140;
		int y=random.nextInt(130)+70;
		int a=random.nextInt(300)+0;
		int b=random.nextInt(350)+0;
		if(e.getSource()==button) {
		button.setBounds(a, b, x, y);
		}
		
	}
}
