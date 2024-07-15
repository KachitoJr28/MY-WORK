package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;

public class Calc implements ActionListener {
	
	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons=new JButton[10];
	JButton[] functionButtons=new JButton[9];
	JButton addButton,subButton,mulButton,divButton;
	JButton decButton,eqButton,delButton,clrButton,negButton;
	JPanel panel;
	
	Font calcFont=new Font("Bahnschrift",Font.BOLD,30);
	
	double num1=0,num2=0,result=0;
	char operator;
	
	Calc(){
		
		textfield=new JTextField();
		textfield.setEditable(false);
		textfield.setFont(calcFont);
		textfield.setBounds(25,25,440,50);
		
		addButton=new JButton("+");
		subButton=new JButton("-");
		mulButton=new JButton("*");
		divButton=new JButton("/");
		decButton=new JButton(".");
		eqButton=new JButton("=");
		negButton=new JButton("(-)");
		delButton=new JButton("DEL");
		clrButton=new JButton("CLR");
		
		functionButtons[0]=addButton;
		functionButtons[1]=subButton;
		functionButtons[2]=mulButton;
		functionButtons[3]=divButton;
		functionButtons[4]=decButton;
		functionButtons[5]=eqButton;
		functionButtons[6]=negButton;
		functionButtons[7]=delButton;
		functionButtons[8]=clrButton;
		
		for(int i=0; i<9; i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(calcFont);
			functionButtons[i].setFocusable(false);
		}
		
		for(int i=0; i<10; i++) {
			numberButtons[i]=new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(calcFont);
			numberButtons[i].setFocusable(false);
		}
		
		panel=new JPanel();
		panel.setBounds(25,100,440,350);
		panel.setLayout(new GridLayout(4,4,5,5));
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButton);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		panel.add(decButton);
		panel.add(numberButtons[0]);
		panel.add(eqButton);
		panel.add(divButton);
		
		negButton.setBounds(90,450,100,40);
		delButton.setBounds(190, 450, 100, 40);
		clrButton.setBounds(290,450,100,40);
		
		frame =new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.add(textfield);
		frame.add(panel);
		frame.add(negButton);
		frame.add(delButton);
		frame.add(clrButton);
		frame.setVisible(true);
		frame.setSize(500,600);
	}
	
	public static void main(String[] args) {
		Calc calc=new Calc();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<10; i++) {
			if (e.getSource()==numberButtons[i]) {
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}
		}
		if (e.getSource()==decButton) {
			textfield.setText(textfield.getText().concat("."));
		}
		if (e.getSource()==addButton) {
			num1=Double.parseDouble(textfield.getText());
			operator='+';
			textfield.setText("");
		}
		if (e.getSource()==subButton) {
			num1=Double.parseDouble(textfield.getText());
			operator='-';
			textfield.setText("");
		}
		if (e.getSource()==mulButton) {
			num1=Double.parseDouble(textfield.getText());
			operator='*';
			textfield.setText("");
		}
		if (e.getSource()==divButton) {
			num1=Double.parseDouble(textfield.getText());
			operator='/';
			textfield.setText("");
		}
		if (e.getSource()==eqButton) {
			num2=Double.parseDouble(textfield.getText());

			switch (operator) {
			case '+':
				result=num1+num2;
				break;
			case '-':
				result=num1-num2;
				break;
			case '*':
				result=num1*num2;
				break;
			case '/':
				result=num1/num2;
				break;
			}
			textfield.setText(String.valueOf(result));
			result=num1;
		}
		if (e.getSource()==clrButton) {
			textfield.setText("");
		}
		if (e.getSource()==delButton) {
			String str=textfield.getText();
			textfield.setText("");
			for(int i=0;i<str.length()-1;i++) {
				textfield.setText(textfield.getText()+str.charAt(i));
			}
		}
		if (e.getSource()==negButton) {
			double temp=Double.parseDouble(textfield.getText());
			temp*=-1;
			textfield.setText(String.valueOf(temp));
		}
	}

}
