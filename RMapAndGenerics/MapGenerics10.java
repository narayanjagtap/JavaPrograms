package JavaPrograms.RMapAndGenerics;

import java.util.TreeMap;

public class MapGenerics10 {
    public static void main(String[] args) {
        
        TreeMap tm = new TreeMap();

        tm.put(1, "Roshan");
        tm.put(2, "Lokesh");
        tm.put(10, "Rohit");
        tm.put(4, "Ramesh");
        tm.put(6, "Akshata");

        System.out.println(tm); //Deta is sorted in assending Sorted order.
    }
}
