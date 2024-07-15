package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menus extends JFrame implements ActionListener {
	
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu viewMenu;
	JMenuItem load;
	JMenuItem save;
	JMenuItem exit;
	
	Menus(){
		
		load=new JMenuItem("Load");
		load.addActionListener(this);
		load.setMnemonic(KeyEvent.VK_L);//tap l
		
		save=new JMenuItem("Save");
		save.addActionListener(this);
		save.setMnemonic(KeyEvent.VK_S);//tap s
		
		exit=new JMenuItem("Exit");
		exit.addActionListener(this);
		exit.setMnemonic(KeyEvent.VK_X);//tap x
		
		fileMenu=new JMenu("File");
		fileMenu.add(load);
		fileMenu.add(save);
		fileMenu.add(exit);
		fileMenu.setMnemonic(KeyEvent.VK_F);//alt+f
		
		editMenu=new JMenu("Edit");
		editMenu.setMnemonic(KeyEvent.VK_E);//alt+e
		
		viewMenu=new JMenu("View");
		viewMenu.setMnemonic(KeyEvent.VK_V);//alt+v
		
		menuBar=new JMenuBar();
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(viewMenu);
		
		this.setJMenuBar(menuBar);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.setSize(700,500);
		
		//DON'T FORGET THE SETICON METHOD OF JMENUITEMS
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==load) {
			System.out.println("Loaded");
		}
		if (e.getSource()==save) {
			System.out.println("Saved");
		}
		if (e.getSource()==exit) {
			System.exit(ABORT);
		}
	}


}
