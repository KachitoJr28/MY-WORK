package learning_OOP_2;
import java.util.InputMismatchException;
import java.util.Scanner;

import learning_OOP.*;

public class Tuckshop {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Biscuit biscuit = new Biscuit("Waferchoc");
		Drink drink = new Drink("Pepsi");
		Pastry pastry = new Pastry("Doughnut");
		
		Snack[] stock= {biscuit, drink, pastry};
		
		for (Snack snack : stock) {
			snack.digest();
		}
		
		biscuit.melt();
		drink.freeze();
		
		System.out.println();
		System.out.println();
		
		Snack snack;
		try {
			System.out.println("What snack do you want");
			System.out.println("1=biscuit, 2=drink ,3=pastry");
			System.out.print("Type the number for your desired snack: "); 
			int choice=sc.nextInt();
			
			if (choice==1) {
				System.out.print("Name your biscuit : "); 
				String biscuitName=sc.next();
				snack=new Biscuit(biscuitName);
				snack.digest();
			} else if(choice==2){
				System.out.print("Name your drink : "); 
				String drinkName=sc.next();
				snack=new Drink(drinkName);
				snack.digest();
			}
			else if(choice==3) {
				System.out.print("Name your pastry : "); 
				String pastryName=sc.next();
				snack=new Pastry(pastryName);
				snack.digest();
			}
			else {
				System.out.print("Sorry that's not available here");
			}
		} catch (InputMismatchException e) {
			System.out.println("Type in a number");
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}

	}

}
