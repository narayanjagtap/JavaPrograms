package JavaPrograms.IInheritance;

//Single-Level Inheritance

class Animal{
    void sleep(){
        System.out.println("Animal needs good sleep...");
    }
}
class Tiger extends Animal{

}
public class Inheritance3 {
    public static void main(String[] args) {
        Tiger t = new Tiger();

        t.sleep();
    }
}
