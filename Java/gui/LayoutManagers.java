package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LayoutManagers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		
		p1.setBackground(new Color(0x7fdaf8));
		p2.setBackground(new Color(0x174576));
		p3.setBackground(new Color(0x174576));
		p4.setBackground(new Color(0x7fdaf8));
		p5.setBackground(new Color(0x2672c3));
		
		p1.setPreferredSize(new Dimension(100,100));
		p2.setPreferredSize(new Dimension(100,100));
		p3.setPreferredSize(new Dimension(100,100));
		p4.setPreferredSize(new Dimension(100,100));
		p5.setPreferredSize(new Dimension(100,100));
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(700,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setTitle("border & flow");
		frame.add(p1,BorderLayout.NORTH);
		frame.add(p2,BorderLayout.EAST);
		frame.add(p3,BorderLayout.WEST);
		frame.add(p4,BorderLayout.SOUTH);
		frame.add(p5,BorderLayout.CENTER);
		
		p4.add(new JLabel("This window is using border layout"),BorderLayout.SOUTH);
		
		p5.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		p5.add(new JButton("[]"));
		p5.add(new JButton("[]"));
		p5.add(new JButton("[]"));
		p5.add(new JButton("[]"));
		p5.add(new JButton("[]"));
		p5.add(new JButton("[]"));
		p5.add(new JButton("[]"));
		p5.add(new JButton("[]"));
		p5.add(new JButton("[]"));
		p5.add(new JButton("[]"));
		p5.add(new JButton("[]"));
		p5.add(new JButton("[]"));
		p5.add(new JButton("[]"));
		p5.add(new JButton("[]"));
		p5.add(new JButton("[]"));
		p5.add(new JButton("[]"));
		p5.add(new JButton("[]"));
		p5.add(new JButton("[]"));
		p5.add(new JButton("[]"));
		p5.add(new JLabel("This panel is using flow layout"));
		
		JFrame frame2 = new JFrame();
		frame2.setVisible(true);
		frame2.setSize(700,500);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setTitle("grid");
		frame2.setLayout(new GridLayout(4,4,1,1));
		frame2.add(new JButton("1"));
		frame2.add(new JButton("2"));
		frame2.add(new JButton("3"));
		frame2.add(new JButton("4"));
		frame2.add(new JButton("5"));
		frame2.add(new JButton("6"));
		frame2.add(new JButton("7"));
		frame2.add(new JButton("8"));
		frame2.add(new JButton("9"));
		frame2.add(new JButton("10"));
		frame2.add(new JButton("11"));
		frame2.add(new JButton("12"));
	}

}
