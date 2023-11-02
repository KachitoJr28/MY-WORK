import java.util.Scanner;

//Just learning
class New {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter your Lastname");
            String Surname = sc.nextLine();

            System.out.println("Enter your Firstname");
            String Firstname = sc.nextLine();

            System.out.println("How old are you?");
            int age = sc.nextInt();

            if (age >= 18) {
                System.out.println("Welcome" + " " + Firstname + " " + Surname);
            } else {
                System.out.println("You're too young");
            }
        }
    }
}