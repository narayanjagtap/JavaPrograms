package JavaPrograms.QCollectionFramework;

import java.util.ArrayList;

public class CollectionFramework7 {
    public static void main(String[] args) {
        
        ArrayList a = new ArrayList();

        a.add(100);
        a.add(200);
        a.add(300);
        a.add(400);

        System.out.println(a);

        System.out.println(a.contains(100)); //contains() method gives Boolean value(True/False).
        System.out.println(a.contains(500));

        System.out.println(a.indexOf(400));
        System.out.println(a.indexOf(300));//indexOf() method gives Index of given value.

        System.out.println("Size is : " + a.size());//size() metod are gives size of the ArrayList.

        a.clear();//Cleare the all Deta in ArrayList.
        System.out.println(a);
        
    }
}
