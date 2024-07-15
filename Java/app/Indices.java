package app;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Indices{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
			System.out.println("Type in a number");
			int a=sc.nextInt();
			System.out.print(a+" raised to the power of ");
			int b=sc.nextInt();
			System.out.println(Math.pow(a, b));
		} catch (InputMismatchException e) {
			System.out.println("type a number");
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}

    }
}