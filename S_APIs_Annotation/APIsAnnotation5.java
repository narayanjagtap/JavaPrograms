package JavaPrograms.S_APIs_Annotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class APIsAnnotation5 {
    public static void main(String[] args) {
        
        List<Integer> l1 = new ArrayList<Integer>();    //yha pe Generics ka use kiya hain.
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);  //Collection aise bhi bana sakate hai.
        System.out.println(l1); 

        List l2 = Arrays.asList(1,3,4,5,6,7);   //Collection aise bhi bana sakate hai.
        System.out.println(l2);

        for(Integer i:l1){
            System.out.println(i);
        }

        
    }
}
