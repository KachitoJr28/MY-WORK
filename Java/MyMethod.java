import java.util.Iterator;

/**
 * MyMethod
 */
public class MyMethod {
    static void firstMethod(){
        System.out.println("This is my first method");
    }
    static int secondMethod(int x, int y){
        return x*y;
    }
    static String thirdMethod(String Firstname){
        return Firstname+" is handsome";
    }

    static float thirdMethod(float height, float weight){
        return height+weight;
    }

    public static void main(String[] args){
//        firstMethod();
//        int area=secondMethod(5, 7);
//        String fname=thirdMethod("Omefome");
//        float PE= thirdMethod(9.809f, 44.39f);
//
//        System.out.println("Area:"+" "+area);
//        System.out.println("Name:"+" "+fname);
//        System.out.println("Potential Energy"+" "+PE);
//        //Overloaded methods are methods that have same name but different parameters
//        System.out.printf("%+,d",123456);  //put symbol
//        System.out.println();
//        System.out.printf("%-6s","Oh!" ); //occupies 6 characters
//        System.out.println();
//        System.out.printf("%c",'#');  //outputs character
//        System.out.println();
//        System.out.printf("%.2f",123.321); //makes it 2 d.p
//        System.out.println();
//        System.out.println(Sum(1,2));
//        System.out.println(Sum(1,2,3));
//        System.out.println(Sum(1,2,3,4));
//        System.out.println(Sum(1,2,3,4,5));
         System.out.println(addUntil(13));
        
    }
    
  //Overloaded methods
    
    static int Sum(int a, int b) {
    	return a+b;
    }
    
    static int Sum(int a, int b, int c) {
    	return a+b+c;
    }
    
    static int Sum(int a, int b, int c, int d) {
    	return a+b+c+d;
    }
    
    static int Sum(int a, int b, int c, int d, int e) {
    	return a+b+c+d+e;
    }
    
    static int addUntil(int x) {
    	int y=1;
    	for (int i = x; i >1; i--) {
    		y=y+i;
			if (i==1) {
				System.out.println(y);	
			}
		}
		return y;
		
    }
}