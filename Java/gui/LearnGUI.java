package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LearnGUI {

	public static void main(String[] args) {
		
		ImageIcon Originallogo = new ImageIcon("C:\\Users\\Administrator\\Desktop\\Coding\\Java\\gui\\images\\pngegg.png");
		Image image = Originallogo.getImage().getScaledInstance(204,106, Image.SCALE_SMOOTH);
		ImageIcon logo=new ImageIcon(image);
		Border border = BorderFactory.createDashedBorder(new Color(0xffffff));
		
		JLabel label=new JLabel();
		label.setText("No de TRABAYE");//text to insert
		label.setForeground(new Color(0xe12600));//font color
		label.setFont(new Font("Cambria",Font.BOLD,30));//font name,style and size
		label.setIcon(logo);//image to insert
		label.setIconTextGap(10);
		//label.setBackground(Color.black); is used to change the bg color of a label
		//label.setOpaque(true);//displays bg color
		label.setBorder(border);//gives the label a border
		label.setHorizontalTextPosition(JLabel.CENTER);//horizontal text position relative to image
		label.setVerticalTextPosition(JLabel.BOTTOM);//vertical text position relative to image
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 250, 250);
		
		//method 1 of creating frames
		JFrame frame = new JFrame();
		
		//change Layout Manager
		frame.setLayout(null);
		/*The default layout manager allows the label take up the entire frame
		 * If you don't want that you can set the layout manager to null and set the size and position of your layout manager
		 * this is done using the setbounds method of labels
		*/
		
		//add a component
		frame.add(label);
		//set visibility
		frame.setVisible(true);
		//change frame's title
		frame.setTitle("This window was created using java");
		//size of the frame
		frame.setSize(450, 450);
		//what happens after x is clicked
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set if it would be resizable
		frame.setResizable(true);
		//set BG icon
		ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\Desktop\\Coding\\Java\\gui\\images\\epl.png");
		frame.setIconImage(icon.getImage());
		//set BG Color
		frame.getContentPane().setBackground(new Color(0x123456));
		
		//method 2
		//Window window=new Window();
		
	}

}
