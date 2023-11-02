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
        firstMethod();
        int area=secondMethod(5, 7);
        String fname=thirdMethod("Omefome");
        float PE= thirdMethod(9.809f, 44.39f);

        System.out.println("Area:"+" "+area);
        System.out.println("Name:"+" "+fname);
        System.out.println("Potential Energy"+" "+PE);
    }
}