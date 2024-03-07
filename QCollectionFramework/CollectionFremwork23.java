package JavaPrograms.QCollectionFramework;

import java.util.LinkedHashSet;

public class CollectionFremwork23 {
    public static void main(String[] args) {
        
        LinkedHashSet lh = new LinkedHashSet();

        lh.add(100);
        lh.add(20);
        lh.add(30);
        lh.add(40);

        System.out.println(lh);     //Order of intertion are allowed...

        lh.add(100);

        System.out.println(lh);     //Duplicates are not allowed...
    }
}
