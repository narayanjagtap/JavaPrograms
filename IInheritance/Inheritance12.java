package JavaPrograms.IInheritance;

class Dada{
    int a, b;

    public Dada(){
        System.out.println("Parent class constructor...");
    }
    public Dada(int x, int y){
        System.out.println("Parameterised Parent class constructor...");
        x = a;
        y = b;
    }
}
class Narayan extends Dada{
    int m, n;

    public Narayan(){
        super(12, 45);  //super() method are colled...
        System.out.println("Child class constructor...");
    }
    public Narayan(int x, int y){
        System.out.println("Parameterised child class constructor...");
        x = m;
        y = n;
    }
}

public class Inheritance12 {
    public static void main(String[] args) {
        Narayan n = new Narayan();
    }
}
