package gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class RadioButtons extends JFrame implements ActionListener {
	
	JRadioButton Rbutton1;
	JRadioButton Rbutton2;
	JRadioButton Rbutton3;
	ImageIcon tick;
	ImageIcon def;
	
	RadioButtons(){
		
		def=new ImageIcon("C:\\Users\\Administrator\\Desktop\\Coding\\Java\\gui\\images\\default.png");
		tick=new ImageIcon("C:\\Users\\Administrator\\Desktop\\Coding\\Java\\gui\\images\\tick.png");;
		
		Rbutton1=new JRadioButton("Male");
		Rbutton2=new JRadioButton("Female");
		Rbutton3=new JRadioButton("Other");
		
		ButtonGroup group=new ButtonGroup();
		group.add(Rbutton1);
		group.add(Rbutton2);
		group.add(Rbutton3);
		
		Rbutton1.addActionListener(this);
		Rbutton2.addActionListener(this);
		Rbutton3.addActionListener(this);
		
		Rbutton1.setIcon(def);
		Rbutton2.setIcon(def);
		Rbutton3.setIcon(def);
		
		Rbutton1.setSelectedIcon(tick);
		Rbutton2.setSelectedIcon(tick);
		Rbutton3.setSelectedIcon(tick);
		
		Rbutton1.setFont(new Font("Times New Roman",Font.PLAIN,30));
		Rbutton2.setFont(new Font("Times New Roman",Font.PLAIN,30));
		Rbutton3.setFont(new Font("Cambria",Font.PLAIN,30));
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		this.add(Rbutton1);
		this.add(Rbutton2);
		this.add(Rbutton3);
		this.pack();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==Rbutton1) {
			System.out.println("Yeah bro");
		}else if(e.getSource()==Rbutton2) {
			System.out.println("Good girl");
		}else if(e.getSource()==Rbutton3) {
			System.out.println("REPENT!");
		}
	}

}
