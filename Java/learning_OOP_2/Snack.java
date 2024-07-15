package learning_OOP_2;
import learning_OOP.*;

public class Snack extends Food {
	public Snack(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	String noModifier="no modifier";
	private String privateString="this is privates";
	public String publicString="this is public";
	protected String protectedString="this is protected";
	
	public String getPrivateString() {
		return privateString;
	}
	public void setPrivateString(String privateString) {
		this.privateString = privateString;
	}
	
	void digest() {
		System.out.println("the snack has been digested");
	}
}
