package JavaPrograms.RMapAndGenerics;

import java.util.HashMap;

public class MapGenerics1 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(18, "Virat Kohali");     //"18 = key" and "virat Kohali = value" .
        hm.put(45, "Rohit Sharma");
        hm.put(07, "Ms Dhoniii");
        hm.put(4403, null);       //null values are also allowed in many time,
        hm.put(null, null);     //keys are allowed null insertion but only Once.

        System.out.println(hm);     //OutPut are not Given in Order of Insertion...
    }
}
