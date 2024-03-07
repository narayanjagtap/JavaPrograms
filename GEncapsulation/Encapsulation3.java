package JavaPrograms.GEncapsulation;

class Student3{
    private int age;
    private String name;

    public void setData(int a){
        age = a;
    }
    public void setData(String n){
        name = n;
    }

    public void setData1(int a1){
        age = a1;
    }
    public void setData2(String n1){
        name = n1;
    }

    public void show(){
        System.out.println("Student name is : " + name);
        System.out.println("And his age is : " + age);
    }
}
public class Encapsulation3 {
    public static void main(String[] args) {
        Student3 obj1 = new Student3();
        Student3 obj2 = new Student3();

        obj1.setData(17);
        obj2.setData1(35);
        obj1.setData("Sagar");
        obj2.setData2("Pratap");

        obj1.show();
        obj2.show();
    }
}
