package JavaPrograms.IInheritance;

class Dada1{
    int a, b;

    public Dada1(){
        System.out.println("Parent class constructor...");
    }
    public Dada1(int x, int y){
        System.out.println("Parameterised parent class constructor...");
        x = a;
        y = b;
    }
}
class Narayan1 extends Dada1{
    int m, n;

    public Narayan1(){
        this(12, 42);  //this() method are colled...
        System.out.println("Child class constructor...");
    }
    public Narayan1(int x , int y){
        System.out.println("Parameterised child class constructor...");
        x = m;
        y = n;
    }
}
public class Inheritance13 {
    public static void main(String[] args) {
        Narayan1 n = new Narayan1();
    }
}
