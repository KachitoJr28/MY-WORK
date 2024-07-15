package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateGrid {
    public static void main(String[] args) {
        int rows;
        int columns;
        String symbol;
        Scanner scanner=new Scanner(System.in);
        try {
			System.out.println("Enter # of rows: ");
			        rows= scanner.nextInt();
			System.out.println("Enter # of columns: ");
			        columns = scanner.nextInt();
			System.out.println("Enter symbol to use: ");
			        scanner.nextLine();
			        symbol = scanner.nextLine();
			for(int i=1; i<=rows; i++) {
			    System.out.println();
			    for(int j=1; j<=columns;j++)
			        System.out.print(symbol);
			}
		} catch (InputMismatchException e) {
			System.out.println("Type a number dumbass!");
		} catch (Exception e) {
			System.out.println("Something went wrong");
		} finally{
			scanner.close();
		} 
    }
}