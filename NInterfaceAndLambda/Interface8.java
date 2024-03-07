package JavaPrograms.NInterfaceAndLambda;
interface car{
    void drive();
}
public class Interface8 {
    public static void main(String[] args) {
        car c = new car(){
            public void drive(){
                System.out.println("Driving...");
            }// Anonymous class
        };
        c.drive();
    }
}
