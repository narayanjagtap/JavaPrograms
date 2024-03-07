package JavaPrograms.IInheritance;
class Human1{
    private String name;
    int age;

    Human1(){
        System.out.println("Human class Constructor..."); /* This is a constructor becouse same name as a class name. */
        /*
         * in java constructor will not participiate in inheritance, but this
         * constructor are participiate in inheritance
         * 
         * student class are create a object in main method, hence in student class
         * create a difolt constructor at behind the seen.
         * 
         * And this constructor are inhetited by the difolt constructor of human class.
         */
    }
    void sleep(){
        age = 20;
        System.out.println("Human needs good sleep...");
        System.out.println(age);
    }
}
class Student1 extends Human1{
    void disp(){
        System.out.println("His age is : " + age);
        //System.out.println("His name is : " + name);

        /* Private member will not participiate in inheritance. */
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.sleep();
        s.disp();
    }
}
