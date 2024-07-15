package learning_OOP_2;

public class Drink extends Snack implements Liquid {
	Drink(String name){
		super(name);
	}
	
	@Override
	public void freeze(){
		System.out.println(this.name+" has been frozen");
	}
	
	@Override
	void digest() {
		System.out.println("you have drank "+this.name);
	}
}
