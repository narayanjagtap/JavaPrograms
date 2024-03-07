package JavaPrograms.RMapAndGenerics;

import java.util.ArrayList;
import java.util.Collections;

public class MapGenerics18 {
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();

        al.add(100);
        al.add(50);
        al.add(150);
        al.add(70);
        al.add(125);

        System.out.println(al); //without Sorting.

        Collections.sort(al);
        System.out.println(al); //with Sorted.

        System.out.println("--------------------------------------------------");

        ArrayList<String> al1 = new ArrayList<String>();

        al1.add("Dada");
        al1.add("Sumit");
        al1.add("Sagar");
        al1.add("Mama");

        System.out.println(al1);

        Collections.sort(al1);
        System.out.println(al1);
    }
}
