package JavaPrograms.OExceptionHandling;

class Demo2{
    public void A(){
        try {
            B();
        } catch (Exception e) {
            System.out.println("Error..........." + e.getMessage());
        }
    }
    public void B() throws Exception{
        int num1 = 6;
        int num2 = 0;

        int result = num1 / num2;

        System.out.println(result);
    }
}
public class Exception18 {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.A();
    }
}
// Handling vs Ducking an Exception chaptor