package JavaPrograms.QCollectionFramework;

import java.util.ArrayDeque;

public class CollectionFremwork14 {
     public static void main(String[] args) {
        
        ArrayDeque ad = new ArrayDeque();

        ad.add(100);
        ad.add(200);
        ad.add(300);
        ad.add(400);

        System.out.println(ad);

        ad.addFirst(555);   //add Front end
        ad.addLast(666);    //add Rear end

        System.out.println(ad);

        ad.add(200);    //Duplicates are allowed

        System.out.println(ad);
        
     }
}
