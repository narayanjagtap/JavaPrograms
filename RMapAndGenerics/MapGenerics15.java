package JavaPrograms.RMapAndGenerics;

import java.util.ArrayList;

public class MapGenerics15 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("Sumit");
        al.add("Sagar");
        //al.add(45);   //in this case you cannot store int value.

        String name1 = al.get(0);
        String name2 = al.get(1);

        System.out.println(name1);
        System.out.println(name2);
    }
}
