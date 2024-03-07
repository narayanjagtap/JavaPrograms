package JavaPrograms.OExceptionHandling;

class Demo3{
    public void A() throws Exception{
        B();
    }
    public void B() throws Exception{
        int num1 = 8;
        int num2 = 0;
        int result = num1 / num2;
        System.out.println(result);
    }
}
public class Exception19 {
    public static void main(String[] args) {
        Demo3 d = new Demo3();

        try {
            d.A();
        } catch (Exception e) {
            System.out.println("Error........" + e.getMessage());
        }
    }
}
// Handling vs Ducking an Exception chaptor