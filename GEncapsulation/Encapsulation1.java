package JavaPrograms.GEncapsulation;

class Student{
    private int age;
    private String name;

    public void setData(){
        age = 20;
        name = "Sumit";
    }

    public void show(){
        System.out.println("Student Name is " + name + ", and age is " + age);
    }
}
public class Encapsulation1 {
    public static void main(String[] args) {
        Student obj = new Student();

        obj.setData();
        obj.show();
    }
}
