package JavaPrograms.RMapAndGenerics;

import java.util.HashMap;

public class MapGenerics2 {
    public static void main(String[] args) {
        
        HashMap hm = new HashMap();
        
        hm.put(5481, "Dada");
        hm.put(4141, "Dada");

        System.out.println(hm);     //Dupicate Values are allowed.
    }
}
