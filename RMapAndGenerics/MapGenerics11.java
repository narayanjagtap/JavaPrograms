package JavaPrograms.RMapAndGenerics;

import java.util.TreeMap;

public class MapGenerics11 {
    public static void main(String[] args) {
        
        TreeMap tm = new TreeMap();
        Integer i = new Integer(5);

        tm.put(i, "Rahul");

        System.out.println(tm);
    }
}
