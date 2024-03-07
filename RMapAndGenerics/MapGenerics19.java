package JavaPrograms.RMapAndGenerics;

import java.util.ArrayList;
import java.util.Collections;

public class MapGenerics19 {
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println(al);

        int index = Collections.binarySearch(al, 30);   //To find out index of 30.
        System.out.println("Index is : " + index);

        int index1 = Collections.binarySearch(al, 65450);  //If you find out the value is out of the Arraylist then compilar show negative index.
        System.out.println("Index1 is : " + index1);

        System.out.println("--------------------------------------");

        Collections.rotate(al, 3);  
        System.out.println(al);

        Collections.shuffle(al);    //Randamly change index of the data in any time.
        System.out.println(al);

        int fre = Collections.frequency(al, 50);    //frequency measns one elementt are how many times are repited.
        System.out.println(fre);
    }
}
