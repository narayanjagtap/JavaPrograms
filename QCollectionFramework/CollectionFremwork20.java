package JavaPrograms.QCollectionFramework;

import java.util.TreeSet;

public class CollectionFremwork20 {
    public static void main(String[] args) {
        
        TreeSet ts = new TreeSet();

        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);

        System.out.println(ts);     //Order of intertion are not allowed...

        ts.add(100);    //Duplicates are not allowed...

        System.out.println(ts);

        //null value are also not allowed.
    }
}
