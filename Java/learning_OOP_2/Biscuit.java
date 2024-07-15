package learning_OOP_2;
import learning_OOP.*;

public class Biscuit extends Snack implements Solid {
	private double price;
	private String flavour;
	private String type;

	public Biscuit(String name,String type,String flavour,double price) {
		super(name);
		// TODO Auto-generated constructor stub
		setType(type);
		setFlavour(flavour);
		setPrice(price);
	}
	

	Biscuit(String name){
		super(name);
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void melt(){
		System.out.println(this.name +" has been melted");
	}
	
	@Override
	void digest() {
		System.out.println("you have eaten "+this.name);
	}
}
