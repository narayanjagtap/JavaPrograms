package JavaPrograms.NInterfaceAndLambda;
interface Car1{
    void drive();
}
public class Interface9 {
    public static void main(String[] args) {
        Car1 obj = () -> System.out.println("Driving..."); // Labda expretion

        obj.drive();
    }
}
