package gui;

import javax.swing.JOptionPane;

public class LearnOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "the message", "the title", JOptionPane.PLAIN_MESSAGE);
		/*
		 * The message types are
		 * plain
		 * information
		 * error
		 * question
		 * warning
		 */
		JOptionPane.showConfirmDialog(null, "can you code?", "question", JOptionPane.YES_NO_OPTION);
		/*
		 * default
		 * option types are
		 * yes_no_cancel
		 * yes_no
		 * closed (displays "ok" ad the only option)
		 */
		String[] options= {"Yes sir","Inokwelo eiyoo","Hmm"};
		int answer=JOptionPane.showOptionDialog(null, "No de trabaye", "option dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, 0);
		/*
		 * the options have integer values which you can store
		 * yes(the 1st option) = 0
		 * no(the 2nd option) = 1
		 * cancel(the 3rd option) = 2
		 * the x button = -1
		 * the third to last argument is to change the displayed icon to a defined ImageIcon
		 */
		System.out.println(answer);
	}

}
