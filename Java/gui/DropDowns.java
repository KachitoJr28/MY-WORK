package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class DropDowns extends JFrame implements ActionListener  {
	
	JComboBox comboBox;
	
	DropDowns() {
		
		String[] fruits= {"kiwi","apple","mango","pineapple","watermelon"};
		
		comboBox = new JComboBox(fruits);
		comboBox.addActionListener(this);
		comboBox.setEditable(true);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(new Dimension(200,200));
		this.setLayout(new FlowLayout());
		this.add(comboBox);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedIndex()+" is the index of "+comboBox.getSelectedItem());
		}
	}

}
