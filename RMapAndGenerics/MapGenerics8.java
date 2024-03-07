package JavaPrograms.RMapAndGenerics;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

class Student2{
    private String name ;
    private int age;
    private String city;

    public Student2(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getCity(){
        return city;
    }

    public String toString()
    {
        return name + "  " + age + "  " + city;
    }

}
public class MapGenerics8 {
    public static void main(String[] args) {

        Student2 st1 = new Student2("Sagar", 17, "Latur");
        Student2 st2 = new Student2("Sumit", 20, "Pune");
        Student2 st3 = new Student2("Pratap", 35, "Shivali");

        Map m = new HashMap();

        m.put(1, st1);
        m.put(2, st2);
        m.put(3, st3);
        
        System.out.println(m);

        System.out.println("----------------------------------------------------------------");

        Set set = m.entrySet();
        Iterator itr = set.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
