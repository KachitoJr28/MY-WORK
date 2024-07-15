package gui;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxes extends JFrame implements ActionListener {

	JCheckBox checkBox;
	JButton button;
	ImageIcon tick;
	ImageIcon xIcon;
	
	CheckBoxes(){
		
		tick=new ImageIcon("C:\\Users\\Administrator\\Desktop\\Coding\\Java\\gui\\images\\tick.png");
		xIcon=new ImageIcon("C:\\Users\\Administrator\\Desktop\\Coding\\Java\\gui\\images\\x.png");
		//Image scaledTick=tick.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
		//Image scaledXIcon=xIcon.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
		//tick=new ImageIcon(scaledTick);
		//xIcon=new ImageIcon(scaledXIcon);
		
		button=new JButton("submit");
		button.addActionListener(this);
		
		checkBox = new JCheckBox();
		checkBox.setFocusable(false);
		checkBox.setText("I'm not a robot");
		checkBox.setIcon(xIcon);
		checkBox.setSelectedIcon(tick);
		
		this.add(checkBox);
		this.add(button);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			if(checkBox.isSelected()==true) {
				System.out.println("I believe you");
			}else {
				checkBox.setEnabled(false);
			};
		}
	}

}
