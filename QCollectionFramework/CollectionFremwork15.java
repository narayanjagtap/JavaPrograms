package JavaPrograms.QCollectionFramework;

import java.util.ArrayDeque;

public class CollectionFremwork15 {
    public static void main(String[] args) {
        
        ArrayDeque ad = new ArrayDeque();

        ad.add(1000);
        ad.add(2000);
        ad.add(3000);
        ad.add(4000);
        
        System.out.println(ad);

        ad.add("Dada");     //Heterogenous objects are allowed.

        System.out.println(ad);

    }
}
