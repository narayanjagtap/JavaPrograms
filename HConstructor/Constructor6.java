package JavaPrograms.HConstructor;

class Demo6{
    private int age;
    private String name;

    public Demo6(){
        this(34 , "Pratap");  //refers current class instance. now these method are goes from parameterriesd Constructor 2.
        age = 6;
        name = "Swarajjj";
    }

    public Demo6(int age){
        super();    //If we are not writing anything then compiler will generate super().but you are write super() method.
        this.age = age;
        name = "Devaa";
    }

    public Demo6(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void disp(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

//Constructor overloading can be defined as having multiple constructors with different parameters and same name.

public class Constructor6 {
    public static void main(String[] args) {
        Demo6 d = new Demo6();
        d.disp();

        Demo6 d1 = new Demo6(4);
        d1.disp();

        Demo6 d2 = new Demo6(2, "Shivaa");
        d2.disp();
    }
}
