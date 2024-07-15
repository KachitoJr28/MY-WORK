package app.AreYouStupid;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AreYouStupid implements ActionListener {
	JFrame frame = new JFrame("Initial Window");
	JButton yes = new JButton("YES");
	JButton no = new JButton("NO");
	JLabel question = new JLabel("Are You Stupid?");
	Random random = new Random();
	
	public AreYouStupid() {
		yes.setBounds(150, 300, 100, 40);
		yes.addActionListener(this);
		
		no.setBounds(400, 300, 100, 40);
		yes.addActionListener(this);
		
		question.setBounds(150,100,350,50);
		question.setFont(new Font("Times New Roman",Font.PLAIN,50));
		
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setSize(700,500);
		frame.add(yes);
		frame.add(no);
		frame.add(question);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==yes) {
			frame.dispose();
			IKnewIt newWindow=new IKnewIt();
		}else if (e.getSource()==no) {
			int a=random.nextInt(600)+0;
			int b=random.nextInt(400)+0;
			no.setBounds(a, b, 100, 40);
		}
		
		}

}
