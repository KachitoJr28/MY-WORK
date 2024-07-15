package app;
import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class gui_Perm_Comb {
    static long Factorial(long x){
        long factorial=1;
        for (long i = x; i >= 1; i--) {
            factorial= factorial*i;
        }
        return factorial;
    }

    
    public long Permutation(long a,long b){
        long a_factorial=Factorial(a);
        long diff=a-b;
        long diff_factorial=(Factorial(diff));
        long permutation=(a_factorial)/(diff_factorial);
        return permutation;
    }
    public long Combination(long a,long b){
        long a_factorial=Factorial(a);
        long b_factorial=Factorial(b);
        long diff=a-b;
        long diff_factorial=(Factorial(diff));
        long combination=(a_factorial)/((diff_factorial)*(b_factorial));
        return combination;
    }

    public static void main(String[] args) {
/*        gui_Perm_Comb myObj_1=new gui_Perm_Comb();
 *       myObj_1.setName("KJr");
 *      System.out.println(myObj_1.getName());
*/
        try {
			gui_Perm_Comb myObj=new gui_Perm_Comb();
			long num1=Long.parseLong(JOptionPane.showInputDialog("Type the 1st number")) ;
			long num2=Long.parseLong(JOptionPane.showInputDialog(null,"Type the 2nd number(It has to be less than the previous number)")) ;
			JOptionPane.showMessageDialog(null, num1+"C"+num2+"= "+myObj.Combination(num1,num2)+"   "+num1+"P"+num2+"= "+myObj.Permutation(num1,num2));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Type a number DUMBASS!");
		} catch (HeadlessException e) {
			JOptionPane.showMessageDialog(null, "Sorry, there's a problem somewhere");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Something went wrong");
		}
    }
}
