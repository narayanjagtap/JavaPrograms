package JavaPrograms.QCollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class CollectionFramework8 {
    public static void main(String[] args) {
        
        List a = new ArrayList();   //List is a Parent class of ArrayList ....
                                   //The ArrayList class implements the List interface.

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);

        System.out.println(a);
    }
}
