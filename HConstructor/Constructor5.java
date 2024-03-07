package JavaPrograms.HConstructor;

class Demo5{
    private int age;
    private String name;

    public Demo5(){
        System.out.println("Default Constructor is colled...");
        name = "Pruthviii";
        age = 14;
    }

    public Demo5(int age){
        System.out.println("1 Paramaterised Constructor is Colled...");
        this.age = age;
        name = "Sagar";
    }

    public Demo5(int age, String name){
        System.out.println("2 Parameterised Constroctor is colled...");
        this.age = age;
        this.name = name;
    }

    public void disp(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
//Constructor overloading can be defined as having multiple constructors with different parameters and same name.

public class Constructor5 {
    public static void main(String[] args) {
        Demo5 d = new Demo5();
        d.disp();

        Demo5 d1 = new Demo5(17);
        d1.disp();

        Demo5 d2 = new Demo5(34, "Pratap");
        d2.disp();
    }
}
