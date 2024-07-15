import java.util.Scanner;

public class Loops {
    /*
         * You will write code to output all numbers from 1-100 using 
         * While loop
         * For loop
         * Do loop
        */

         public static void main(String[] args) {
            try(Scanner sc=new Scanner(System.in)) {
                System.out.println("This is for while loops");
                //While Loop
                int x=1;
                while (x<=100) {
                    System.out.println(x);
                    x++;                   
                }

                System.out.println("This is for for loops");
                //For loop
                for(int y=1; y<=100; y++){
                    System.out.println(y);
                }

                System.out.println("This is for do loops");
                //Do loop
                int z=1;
                do{
                    System.out.println(z);
                    z++;
                }
                while(z<=100);

                }
            }


         }