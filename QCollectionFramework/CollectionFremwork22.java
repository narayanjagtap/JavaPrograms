package JavaPrograms.QCollectionFramework;

import java.util.HashSet;

public class CollectionFremwork22 {
    public static void main(String[] args) {
        
        HashSet hs = new HashSet();

        hs.add(100);
        hs.add(20);
        hs.add(30);
        hs.add(40);

        System.out.println(hs);     //Order of intertion are not allowed...

        hs.add(100);
        
        System.out.println(hs);     //Duplicates are not allowed...
        
    }
}
