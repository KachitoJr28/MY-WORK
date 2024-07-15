public class Arrays {
    public static void main(String[] args) {
        String[] users={"Will","Jake","Wade"};
        System.out.println(users[2]);

        int[][] sets={
                        {1,2,3,4,5},
                        {1,3,5,},
                        {2,4}
                     };
        System.out.println(sets[2][0]);
        for (int i=0; i< sets.length; i++) {
            for (int j = 0; j < sets[i].length; j++) {
                System.out.println(sets[i][j]);
            }
        }
    }
}
