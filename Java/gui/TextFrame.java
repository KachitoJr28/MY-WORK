package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextFrame extends JFrame implements ActionListener {
	
	JTextField textfield;
	JButton button;
	
	TextFrame() {
		
		button=new JButton("SUBMIT");
		button.addActionListener(this);
		
		textfield=new JTextField();
		textfield.setBackground(new Color(0x000000));
		textfield.setPreferredSize(new Dimension(300, 60));
		textfield.setText("your name goes here");
		textfield.setFont(new Font("Times New Roman",Font.BOLD,30));
		textfield.setForeground(new Color(0x00ff00));
		textfield.setCaretColor(Color.white);
		textfield.setEditable(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setVisible(true);
		this.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
		this.add(textfield);
		this.add(button);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			String t=textfield.getText();
				button.setEnabled(false);
				System.out.println(t+ " stop the TRABAYEMENT!");	
		}
	}

}
