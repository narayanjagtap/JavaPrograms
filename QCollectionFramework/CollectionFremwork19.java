package JavaPrograms.QCollectionFramework;

import java.util.PriorityQueue;

public class CollectionFremwork19 {
    public static void main(String[] args) {
        
        PriorityQueue pq = new PriorityQueue();

        pq.add(pq);     //null value are also not allowed.

        System.out.println(pq);
    }
}
