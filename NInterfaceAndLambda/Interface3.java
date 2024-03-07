package JavaPrograms.NInterfaceAndLambda;

interface DemoA{
    public void show();
}
interface DemoB{
    public void sleep();
}

class Dada2 implements DemoA,DemoB{
    public void show(){
        System.out.println("In show...");
    }
    public void sleep(){
        System.out.println("In sleep...");
    }
}

public class Interface3 {
    public static void main(String[] args) {
        Dada2 d = new Dada2();
        d.show();
        d.sleep();
    }
}
