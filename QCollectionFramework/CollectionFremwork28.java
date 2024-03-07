package JavaPrograms.QCollectionFramework;

import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;

public class CollectionFremwork28 {
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println(al);

        //Fail Fast
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            al.add(500);    //reason of Fail Fast concept
        }
    }//Program are immediatlly fail in first loop.
}
