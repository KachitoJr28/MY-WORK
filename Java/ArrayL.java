import java.util.ArrayList;

public class ArrayL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> numArray=new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> years= new ArrayList<Integer>();
        years.add(2016);
        years.add(2009);
        years.add(2010);
        years.add(2011);
        years.add(2012);
        years.add(2013);
        years.add(2014);
        years.set(0,2008);

        for (int i = 0; i < years.size(); i++) {
        System.out.println(years.get(i));
        }

//        for (Integer year : years) {
//            System.out.println(year);
//        }

        ArrayList<Integer> ages=new ArrayList<Integer>();
        ages.add(16);
        ages.add(15);
        ages.add(14);
        ages.add(13);
        ages.add(12);
        ages.add(11);
        ages.add(10);

        ArrayList<Integer> id=new ArrayList<Integer>();
        id.add(1);
        id.add(2);
        id.add(3);
        id.add(4);
        id.add(5);
        id.add(6);
        id.add(7);

        numArray.add(years);
        numArray.add(ages);
        numArray.add(id);

        System.out.println(years);
        System.out.println(ages);
        System.out.println(id);
        System.out.println(numArray.get(1).get(3));
    }
}
