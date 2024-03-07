package JavaPrograms.GEncapsulation;

class Student6{
    private int age;
    private String name;

    public void setAge(int age){
        this.age = age;        // these are shadowing problem, it is solve using "this" keyword.
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;      // these are shadowing problem, it is solve using "this" keyword.
    }
    public String getName(){
        return name;
    }

    public void show(){
        System.out.println(name + "   " + age);
    }
}
public class Encapsulation6 {
    public static void main(String[] args) {
        Student6 obj1 = new Student6();
        Student6 obj2 = new Student6();

        obj1.setAge(20);
        obj1.setName("Narayan Jagtap");

        obj2.setAge(35);
        obj2.setName("Pratap Kure");

        int studAge = obj1.getAge();
        System.out.println(studAge);
        String studName = obj1.getName();
        System.out.println(studName);
        
        int studAge1 = obj2.getAge();
        System.out.println(studAge1);
        String studName1 = obj2.getName();
        System.out.println(studName1);
    }
}
