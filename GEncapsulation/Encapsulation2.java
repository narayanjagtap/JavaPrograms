package JavaPrograms.GEncapsulation;

class Student1{
    private int age;
    private String name;

    public void setData(){
        age = 35;
        name = "Pratap";
    }

    public void show(){
        System.out.println("Student name is " + name + ", and his age is " + age);
    }
}
public class Encapsulation2 {
    public static void main(String[] args) {
        Student1 obj = new Student1();
        Student1 obj1 = new Student1();

        obj.setData();
        obj1.setData();

        obj.show();
        obj1.show();
    }
}
