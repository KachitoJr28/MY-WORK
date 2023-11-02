import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input a number and I'll tell you it's factorial");
            long x = sc.nextInt();
            long y = 1;
            for (long i = x; i >= 1; i--) {
                y = y * i;
            }
            System.out.println(y);
        }
    }
}
