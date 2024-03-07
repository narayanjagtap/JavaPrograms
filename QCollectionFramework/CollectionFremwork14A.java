package JavaPrograms.QCollectionFramework;

import java.util.LinkedList;

public class CollectionFremwork14A {
    public static void main(String[] args) {
        
        LinkedList l = new LinkedList();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(10);
        l.add(500);

        System.out.println(l);

        System.out.println(l.get(3));

        System.out.println(l.indexOf(30));

        System.out.println(l.indexOf(10));

        System.out.println(l.lastIndexOf(10));

        System.out.println(l.getFirst());

        System.out.println(l.getLast());

        l.push(46554351);
        System.out.println(l);

        System.out.println(l.pop());

    }
}
