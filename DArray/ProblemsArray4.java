package JavaPrograms.DArray;

/*Find Maximum and Mimimum Element:
This program finds the maximum and mininum element in an array. */

import java.util.*;

public class ProblemsArray4 {
    public static void main(String[] args) {
        int Data[] = {8,6,3,21,5};

        Arrays.sort(Data);

        for(int obj : Data){ //Enhanced for loop.
            System.out.println(obj);
        }

        System.out.println("Minimum elemints are : " + Data[0]);

        System.out.println("Maximum elements are : "+ Data[Data.length-1]);
    }
}
