package JavaPrograms.QCollectionFramework;

import java.util.*;
import java.util.concurrent.*;

public class CollectionFremwork29 {
    public static void main(String[] args) {
        CopyOnWriteArrayList al = new CopyOnWriteArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println(al);

        //Fail Safe
        Iterator itr= al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            al.add(500);    //in this case you are also fail but without any exception.
        }
    }
}
