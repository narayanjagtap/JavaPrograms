package JavaPrograms.HConstructor;

//Constructor Overloading...
//Practic...

class Demo7{
    private String name;
    private int age;

    public Demo7(){
        name = "Narayan";
        age = 20;
    }

    public Demo7(int age){
        this.age = age;
        name = "Sagar";
    }

    public Demo7(int age , String name){
        this.age = age;
        this.name = name;
    }

    public void disp(){
        System.out.println("Student name is : " + name + " and his age is : " + age);
    }
}
public class Constructor7 {
    public static void main(String[] args) {
        Demo7 d = new Demo7();
        d.disp();

        Demo7 d1 = new Demo7(17);
        d1.disp();

        Demo7 d2 = new Demo7(2, "Devaa");
        d2.disp();
    }
}
