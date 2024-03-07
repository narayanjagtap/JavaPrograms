package JavaPrograms.OExceptionHandling;

class Demo{
    public void A(){
        B();
    }
    public void B(){
        int num1 = 6;
        int num2 = 0;

        try {
            int result = num1 / num2;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error................................ " + e);
        }
    }
}
public class Exception16 {
    public static void main(String[] args) {
        Demo d = new Demo();

        d.A();
    }
}
