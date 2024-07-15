package gui;

import java.awt.Color;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class LearnPanels {

	public static void main(String[] args) {
		ImageIcon q=new ImageIcon("C:\\Users\\Administrator\\Desktop\\Coding\\Java\\gui\\images\\quadrant.png");
		Image image = q.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
		ImageIcon quad=new ImageIcon(image);
		Border border = BorderFactory.createLineBorder(new Color(0xffffff));
		
		JLabel label1=new JLabel();
		label1.setText("text");
		label1.setForeground(new Color(0xffffff));
		label1.setIcon(quad);
		//label1.setHorizontalAlignment(JLabel.CENTER);
		//label1.setVerticalAlignment(JLabel.CENTER);
		label1.setBounds(20, 20, 150, 150);
		label1.setBorder(border);		
		
		JPanel bluePanel=new JPanel();
		bluePanel.setLayout(null);
		bluePanel.setBounds(0,0,250,250);
		bluePanel.setBackground(new Color(0x4285f4));
		
		JPanel greenPanel=new JPanel();
		greenPanel.setLayout(null);
		greenPanel.setBounds(250,0,250,250);
		greenPanel.setBackground(new Color(0x34a853));
		
		JPanel orangePanel=new JPanel();
		orangePanel.setLayout(null);
		orangePanel.setBounds(0,250,250,250);
		orangePanel.setBackground(new Color(0xfbbc05));
		
		JPanel redPanel=new JPanel();
		redPanel.setLayout(null);
		redPanel.setBounds(250,250,250,250);
		redPanel.setBackground(new Color(0xea4335));
		
		JFrame win=new JFrame();
		win.setVisible(true);
		win.setSize(750,750);
		win.setLayout(null);
		bluePanel.add(label1);
		win.add(bluePanel);
		win.add(greenPanel);
		win.add(orangePanel);
		win.add(redPanel);
		

	}

}
