package JavaPrograms.RMapAndGenerics;

import java.util.Hashtable;

public class MapGenerics9 {
    public static void main(String[] args) {
        
        Hashtable ht = new Hashtable();

        ht.put(1, "Rohit");
        ht.put(2, "Rahul");
        ht.put(3, "Virat");

        System.out.println(ht); //Order of Insertion are not return.

        ht.put(null, "Sumit");

        System.out.println(ht); //null values and keys are not acseptable.
        
    }
}
