package JavaPrograms.QCollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionFremwork27 {
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println(al);

        ListIterator litr = al.listIterator(al.size());     //Concept of listItretion in reversed form.
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}
