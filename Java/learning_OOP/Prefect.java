package learning_OOP;
import learning_OOP_2.*;

public class Prefect extends Student {
	String prefectshipPosition;
	void punish(Student student) {
		System.out.println(this.name+" has told "+student.name+" to kneel down");
	}
	
	
	Prefect(String name, int age, String prefectshipPosition) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.prefectshipPosition=prefectshipPosition;
	}

}
