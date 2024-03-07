package JavaPrograms.QCollectionFramework;

import java.util.ArrayList;

public class CollectionFramework6 {
    public static void main(String[] args) {
        
        ArrayList a = new ArrayList();

        a.add(100);
        a.add(200);
        a.add(300);
        a.add(300);

        a.add(100);

        System.out.println(a);
    }
}
//in ArrayList Duplicates are allowed...
