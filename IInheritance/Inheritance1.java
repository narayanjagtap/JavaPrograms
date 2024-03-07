package JavaPrograms.IInheritance;
class Human{
    int age;
    void sleep(){
        age = 20;
        System.out.println("Human needs good sleep...");
        System.out.println(age);
    }
}
class Student extends Human{

}
public class Inheritance1 {
    public static void main(String[] args) {
        Student st = new Student();
        st.sleep();  
        
        /*
        * And call the sleep method in Humen class but not show any error
        * becouse class student are extend by class Humen.
        */
    }
}
