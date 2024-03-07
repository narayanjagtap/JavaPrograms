package JavaPrograms.QCollectionFramework;

import java.util.PriorityQueue;

public class CollectionFremwork17 {
    public static void main(String[] args) {
        
        PriorityQueue pq = new PriorityQueue();

        pq.add(45);
        pq.add(200);
        pq.add(32);
        pq.add(400);
        pq.add(10);

        System.out.println(pq);     //Order of insertion is not PRESERVED.

        pq.add(45);     //Duplicates values are allowed.

        System.out.println(pq);
    }
}
