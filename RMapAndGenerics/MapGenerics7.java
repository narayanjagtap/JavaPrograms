package JavaPrograms.RMapAndGenerics;

import java.util.HashMap;
import java.util.Map;

class Student1{
    private String name ;
    private int age;
    private String city;

    public Student1(String name, int age, String city){
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

    public String toString()    //Problem are solve using this method.
    {
        return name + " " + age + " " + city;
    }

}
public class MapGenerics7 {
    public static void main(String[] args) {

        Student1 st1 = new Student1("Sagar", 17, "Latur");
        Student1 st2 = new Student1("Sumit", 20, "Pune");
        Student1 st3 = new Student1("Pratap", 35, "Raypur");

        Map m = new HashMap();

        m.put(1, st1);
        m.put(2, st2);
        m.put(3, st3);
        
        System.out.println(m);  //Problem are solve using toString() method.
                                //Your Keys as well as values are also visible now.
    }
}
//Now output are : {1=Sagar 17 Latur, 2=Sumit 20 Pune, 3=Pratap 35 Raypur}