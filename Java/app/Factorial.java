package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            try {
				System.out.println("Input a number and I'll tell you it's factorial");
				long x = sc.nextInt();
				long y = 1;
				for (long i = x; i >= 1; i--) {
				    y = y * i;
				}
				System.out.println(y);
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				System.out.println("You've gotta type a number");
				}catch (Exception e) {
					System.out.println("Something went wrong");
			}
        
    }
}
