package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Sliders extends JFrame implements ChangeListener {

	//JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	Sliders(){
		
		panel=new JPanel();
		label=new JLabel();
		
		slider=new JSlider(32,212,122);
		slider.addChangeListener(this);
		slider.setPreferredSize(new Dimension(650,250));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(5);
		slider.setMajorTickSpacing(10);
		slider.setPaintLabels(true);
		slider.setFont(new Font("Times New Roman",Font.PLAIN,20));
		//slider.setOrientation(SwingConstants.VERTICAL);
		
		label.setText(slider.getValue()+" ◦F");
		label.setFont(new Font("Times New Roman",Font.PLAIN,25));
		
		panel.setLayout(new GridLayout(2,1,1,1));
		panel.add(slider);
		panel.add(label);
		
		this.add(panel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(800,500);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		label.setText(slider.getValue()+" ◦F");
	}
	
}
