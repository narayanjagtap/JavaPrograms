package JavaPrograms.QCollectionFramework;

import java.util.PriorityQueue;

public class CollectionFremwork18 {
    public static void main(String[] args) {
        
        PriorityQueue pq = new PriorityQueue();

        pq.add(100);
        pq.add("Dada");     //Heteroginious type of data are not allowed.

        System.out.println(pq);

    }
}
