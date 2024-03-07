package JavaPrograms.RMapAndGenerics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class MapGenerics5 {
    public static void main(String[] args) {
        
        Map m = new HashMap();  //class HashMap is impliments interface Map...

        m.put(45, "Rohit"); //Entry
        m.put(46, "Sagar");
        m.put(47, "Deva");
        m.put(48, "Swaraj");

        System.out.println(m);

        System.out.println(m.get(46));

        Set keySet = m.keySet();    //return all keys
        Iterator itr1 = keySet.iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }

        Collection values = m.values(); //return all values.
        Iterator itr2 = values.iterator();
        while(itr2.hasNext())
        {
            System.out.println(itr2.next());
        }

        Set entrySet = m.entrySet();    //return all Entrys
        Iterator itr3 = entrySet.iterator();
        while(itr3.hasNext())
        {
            System.out.println(itr3.next());
        }

    }
}
