package JavaPrograms.QCollectionFramework;

import java.util.ArrayList;

public class CollectionFremwork24 {
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        System.out.println(al);

        //For loop
        for(int i=0; i<al.size(); i++){
            Object o = al.get(i);
            System.out.println(o);
        }
        System.out.println("--------------------------------------------------------");

        //For each
        for(Object o:al){
            System.out.println(o);
        }

    }
}
//Basic of Iterator concept