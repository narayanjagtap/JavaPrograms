package JavaPrograms.NInterfaceAndLambda;

interface Demo4{
    public void show();
    default void Config(){  /* Default Methods in Interfaces */
        System.out.println("Config method");
    }
}
class Dada4 implements Demo4{
    public void show(){
        System.out.println("In show...");
    }
}
public class Interface4 {
    public static void main(String[] args) {
        Dada4 d = new Dada4();
        d.show();
        d.Config();
    }
}
