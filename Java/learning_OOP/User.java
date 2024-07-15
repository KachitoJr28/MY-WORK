package learning_OOP;
import learning_OOP_2.*;

public class User {
    String name;
    int age;
    double money;
    static int numberOfUsers;

    User(String name, int age, double money){
        this.name=name;
        this.age=age;
        this.money=money;
        numberOfUsers++;
    }

    void run(){
        System.out.println(this.name +" is running");
        
    }
    
    User(String name, int age){
    	this.age =age; 
    	this.name=name;
    	numberOfUsers++;
    }
    
    User(String name){
    	this.name=name;
    	numberOfUsers++;
    }
    
    @Override
    public String toString(){
    	return name+" is "+age+" years old";
    }
    
    public String eat(Food food) {
    	return name+" is eating "+ food.name;
    }
}
//	Never forget the abstract keyword, it is used to make a class uninstantiable