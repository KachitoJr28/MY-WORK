package learning_OOP;
import learning_OOP_2.*;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        User Jake=new User("Epelle Jake",30,76528.32);
        User Bro=new User("Bro Code", 23, 1234566.76);
        User Martina=new User("Martina",12);
		User Prince=new User("Prince");

        System.out.println(Jake.name+" has $"+Jake.money);
        System.out.println(Bro.name+" is "+Bro.age+" years old");
        Martina.run();
        System.out.println(Martina.toString());
        
        Food food1=new Food("Pizza");
        Food food2=new Food("Hamburger");
        Food food3=new Food("Cinnamon Buns");
        
        Food[] fridge= {food1,food2,food3};
        
        System.out.println(fridge[2].name);
        System.out.println(Martina.eat(food3));
        System.out.println("There are "+ User.numberOfUsers+" users");
        
        Student student1=new Student("James",13);
        Prefect prefect1=new Prefect("Adenike",15,"Labour");
        Prefect prefect2=new Prefect("Oyeyemi",16,"Head Boy");
        Student student2=new Student("Jane",14);
        
        prefect1.punish(student2);
        prefect2.punish(prefect1);
        
        
        Snack snack = new Snack("coke");
        System.out.println(snack.publicString);
        System.out.println(snack.getPrivateString());
    }
}
