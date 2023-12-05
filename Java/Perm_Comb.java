import java.util.Scanner;
public class Perm_Comb {
    static int Factorial(int x){
        int factorial=1;
        for (int i = x; i >= 1; i--) {
            factorial= factorial*i;
        }
        return factorial;
    }

    
    public int Permutation(int a,int b){
        int a_factorial=Factorial(a);
        int diff=a-b;
        int diff_factorial=(Factorial(diff));
        int permutation=(a_factorial)/(diff_factorial);
        return permutation;
    }
    public int Combination(int a,int b){
        int a_factorial=Factorial(a);
        int b_factorial=Factorial(b);
        int diff=a-b;
        int diff_factorial=(Factorial(diff));
        int combination=(a_factorial)/((diff_factorial)*(b_factorial));
        return combination;
    }
    
    public static void main(String[] args) {
        Perm_Comb myObj_1=new Perm_Comb();
        myObj_1.setName("KJr");
        System.out.println(myObj_1.getName());
        Perm_Comb myObj=new Perm_Comb();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Type two numbers I'll tell you their Permutation and combination");
            int dave=sc.nextInt();
            System.out.println("P  &  C");
            int reva=sc.nextInt();
            System.out.println(dave+"C"+reva+"="+myObj.Combination(dave,reva)); 
            System.out.println(dave+"P"+reva+"="+myObj.Permutation(dave,reva));
        }   
    }
    
        private String myName;
    
        public String getName(){
            return myName;
        }
    
        public void setName(String firstname){
            this.myName= firstname;
        }
}