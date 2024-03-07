package JavaPrograms.OExceptionHandling;

class Demo1{
    public void A(){
        B();
    }
    public void B(){
        int num1 = 8;
        int num2 = 0;

        try {
            int result = num1 / num2;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error........." + e.getMessage());// e.getMessage():- es method ne sirph message print hoga
                                                                  // error print nahi hoga.
        }
    }
}
public class Exception17 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();

        d.A();
    }
}
