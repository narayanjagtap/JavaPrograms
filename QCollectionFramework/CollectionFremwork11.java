package JavaPrograms.QCollectionFramework;

import java.util.LinkedList;

public class CollectionFremwork11 {
    public static void main(String[] args) {
        
        LinkedList l = new LinkedList();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        System.out.println(l);

        l.addFirst("Sagar");    //add First Position.
        l.addLast("Jagtap");    //add last Position.

        System.out.println(l);

    }
}
