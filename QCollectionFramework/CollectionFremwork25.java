package JavaPrograms.QCollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionFremwork25 {
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        System.out.println(al);

        Iterator itr = al.iterator();   //Concept of Itretor.
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
