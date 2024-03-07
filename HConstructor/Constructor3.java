package JavaPrograms.HConstructor;

class Demo1{
    private int age;
    private String name;

    public Demo1(int age, String name){   /*If we write at least one constructor then the compiler don't generate any default constructor, so we say every java class will have a compiler generated default constructor or programmer written constructor but not both simultaneously. */
        this.age = age;
        this.name = name;
    }

    public void Disp(){
        System.out.println(age);
        System.out.println(name);
    }
}
public class Constructor3 {
    public static void main(String[] args) {
        // Demo1 obj = new Demo1();  /*compilar show error becouse If we write at least one constructor then the compiler don't generate any default constructor, */
        // obj.Disp();

        Demo1 obj1 = new Demo1(20, "Narayan");
        obj1.Disp();
    }
}