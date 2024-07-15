package learning_OOP_2;

public class Pastry extends Snack {
	Pastry(String name){
		super(name);
	}
	
	@Override
	void digest() {
		System.out.println("you have eaten "+this.name);
	}
}
