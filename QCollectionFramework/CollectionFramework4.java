package JavaPrograms.QCollectionFramework;

import java.util.ArrayList;

public class CollectionFramework4 {
    public static void main(String[] args) {

        System.out.println("------------------------------------------------");
        
        ArrayList al4 = new ArrayList();
        al4.add("Name : ");
        al4.add("Narayan");
        System.out.println(al4);

        System.out.println("-------------------------------------------------");

        ArrayList al5 = new ArrayList();
        al5.add(4403);
        al5.add(17);
        al5.addAll(al4); //added whole array al4 in al5.
        System.out.println(al5);

        System.out.println("--------------------------------------------------");
    }
}
