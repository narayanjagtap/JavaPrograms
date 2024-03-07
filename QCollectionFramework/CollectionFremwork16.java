package JavaPrograms.QCollectionFramework;

import java.util.ArrayDeque;

public class CollectionFremwork16 {
    public static void main(String[] args) {
        
        ArrayDeque ad = new ArrayDeque();

        ad.offer(100);      //offer() method are basically work as a add() method.
        ad.offer(55);       //but in offer() method offer may be rejected.
        ad.offer("Dada");

        System.out.println(ad);

        ad.offerFirst(5555);
        ad.offerLast("Brand");

        System.out.println(ad);
        
    }
}
