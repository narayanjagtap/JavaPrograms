package JavaPrograms.RMapAndGenerics;

import java.util.HashMap;
import java.util.Map;

class Student{
    private String name ;
    private int age;
    private String city;

    public Student(String name, int age, String city){
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

}
public class MapGenerics6 {
    public static void main(String[] args) {

        Student st1 = new Student("Sagar", 17, "Latur");
        Student st2 = new Student("Sumit", 20, "Pune");
        Student st3 = new Student("Pratap", 35, "Raypur");

        Map m = new HashMap();

        m.put(1, st1);
        m.put(2, st2);
        m.put(3, st3);
        
        System.out.println(m);  //Your Keys are visible. but values are visible in form of "Hash code" or "Address code".

    }
}
//output are : {1=JavaPrograms.RMapAndGenerics.Student@5acf9800, 2=JavaPrograms.RMapAndGenerics.Student@4617c264, 3=JavaPrograms.RMapAndGenerics.Student@36baf30c}