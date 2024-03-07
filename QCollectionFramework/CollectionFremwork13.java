package JavaPrograms.QCollectionFramework;

import java.util.LinkedList;

public class CollectionFremwork13 {
    public static void main(String[] args) {
        
        LinkedList l = new LinkedList();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        System.out.println(l.peek());
        System.out.println(l);

        System.out.println("--------------------------------------------------------");
        
        System.out.println(l.poll());
        System.out.println(l);
    }
}
