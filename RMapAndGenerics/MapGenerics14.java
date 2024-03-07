package JavaPrograms.RMapAndGenerics;

import java.util.WeakHashMap;
import java.util.*;

class Employee2{
    private String EmplName;
    private int EmplID;

    public Employee2(String EmplName, int EmplID){
        this.EmplName=EmplName;
        this.EmplID=EmplID;
    }
    public String toString(){   //Your Keys are visible. but values are visible in form of "Hash code" or "Address code".
        return EmplID + " ";    //This problem are solve using the toString() method.
    }
    @Override
    public void finalize(){
        System.out.println("Clean up work by Garbage collector before de allocating Memory from heap");
    }
}
public class MapGenerics14 {
    public static void main(String[] args) {
        
        Employee2 e = new Employee2("Sagar", 71);

        WeakHashMap hm = new WeakHashMap(); //Coll Weak HashMap..

        hm.put(e, "Narayan");
        System.out.println(hm);

        e = null;   //Eligible for Garbage Collection.

        System.gc();    // Invoking Garbage collector.

        System.out.println(hm);

        System.out.println("Last line...");
    }
}