package JavaPrograms.RMapAndGenerics;

import java.util.HashMap;

public class MapGenerics3 {
    public static void main(String[] args) {
        
        HashMap hm = new HashMap();

        hm.put(18, "Kohali");
        hm.put(18, "Rohit");

        System.out.println(hm);     //Duplicates Keys  arenot allowed..
    }
}
