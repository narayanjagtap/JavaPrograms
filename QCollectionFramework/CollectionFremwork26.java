package JavaPrograms.QCollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionFremwork26 {
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        System.out.println(al);

        ListIterator litr = al.listIterator();  //Concept of ListItretor.
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
    }
}
