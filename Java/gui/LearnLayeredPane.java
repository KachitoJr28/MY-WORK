package gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class LearnLayeredPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel panel1=new JPanel();
		panel1.setBounds(10, 10, 200, 200);
		panel1.setBackground(Color.red);
		
		JPanel panel2=new JPanel();
		panel2.setBounds(60, 60, 200, 200);
		panel2.setBackground(Color.pink);
		
		JPanel panel3=new JPanel();
		panel3.setBounds(110, 110, 200, 200);
		panel3.setBackground(Color.orange);
		
		JLayeredPane layeredpanel=new JLayeredPane();
		layeredpanel.setBorder(new EtchedBorder());
		layeredpanel.add(panel1,Integer.valueOf(0));
		layeredpanel.add(panel2,Integer.valueOf(2));
		layeredpanel.add(panel3,Integer.valueOf(1));
		
		JFrame frame=new JFrame("layered panels");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		frame.add(layeredpanel);
	}

}
