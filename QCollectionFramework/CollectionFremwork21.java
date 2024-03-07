package JavaPrograms.QCollectionFramework;

import java.util.TreeSet;

public class CollectionFremwork21 {
    public static void main(String[] args) {
        
        TreeSet ts = new TreeSet();

        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);

        System.out.println(ts.higher(50));      //Print higher value
        System.out.println(ts.lower(50));       //Print lower value

        System.out.println(ts.ceiling(40));     //40 set madhe asel tr 40 print karel, nasel tr mothi value print karel.
        System.out.println(ts.floor(40));       //40 set madhe asel tr 40 print karel, nasel tr lahan value print karel.

        System.out.println(ts.ceiling(50));     //50 set madhe asel tr 50 print karel, nasel tr mothi value print karel.
        System.out.println(ts.floor(50));       //50 set madhe asel tr 50 print karel, nasel tr lahan value print karel.

        
    }
}
