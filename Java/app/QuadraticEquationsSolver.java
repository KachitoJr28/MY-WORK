package app;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class QuadraticEquationsSolver {
    public double discriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public Object solve(double a, double b, double c) {
        double d = discriminant(a, b, c);
        if (d < 0) {
            JOptionPane.showMessageDialog(null,"No roots");
        } else if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(d)) / (2.0 * a);
            JOptionPane.showMessageDialog(null,"x1 = " + x1 + ", x2 = " + x2);
        } else {
            JOptionPane.showMessageDialog(null,"x = " + ((-b) / (2.0 * a)));
        }
        return null;
    }

    public static void main(String[] args) {
        try {
			QuadraticEquationsSolver obj= new QuadraticEquationsSolver();
			JOptionPane.showMessageDialog(null, "The format is ax^2 + bx + c");
			double a=Double.parseDouble(JOptionPane.showInputDialog("Input a"));
			double b=Double.parseDouble(JOptionPane.showInputDialog("Input b"));
			double c=Double.parseDouble(JOptionPane.showInputDialog("Input c"));

			JOptionPane.showMessageDialog(null, obj.solve(a, b, c));
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Type a number DUMBASS!");
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error! No input");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Something's Wrong");
		}
    }
}