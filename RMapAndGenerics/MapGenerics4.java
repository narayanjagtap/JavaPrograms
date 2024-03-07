package JavaPrograms.RMapAndGenerics;

import java.util.LinkedHashMap;

public class MapGenerics4 {
    public static void main(String[] args) {
        
        LinkedHashMap lhm = new LinkedHashMap();

        lhm.put(01, "Dada");
        lhm.put(02, "Mama");
        lhm.put(03, "Me");
        lhm.put(04, "Sagar");

        System.out.println(lhm);    //OutPut are Given in Order of Insertion...
    }
}
