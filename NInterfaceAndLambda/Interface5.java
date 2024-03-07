package JavaPrograms.NInterfaceAndLambda;
interface Demo5{
    static void abc(){  /* Static Methods in Interfaces */
        System.out.println("abc...");
    }
}
public class Interface5 {
    public static void main(String[] args) {
        Demo5.abc();
    }
}
