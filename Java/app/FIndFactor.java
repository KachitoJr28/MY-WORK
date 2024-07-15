package app;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FIndFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tell me a number, I'll tell you it's factors");
		int inp = 0;
		try {
			inp = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("You've gotta type a number");
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
		ArrayList<Integer> factors=new ArrayList<Integer>();
		
		for (int i=1; i<=10000; i++) {
			int x=inp%i;
			if (x==0) {
				factors.add(i);
			}
			
		}
		System.out.println("The factors of "+inp+" are "+factors);

	}

}
