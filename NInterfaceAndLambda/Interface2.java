package JavaPrograms.NInterfaceAndLambda;

interface Demo1{
    void show();
}
class Dada1 implements Demo1{
    public void show(){
        System.out.println("in show...");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        Dada1 n = new Dada1();
        n.show();
    }
}
