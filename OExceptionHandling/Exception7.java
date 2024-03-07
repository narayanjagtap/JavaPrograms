package JavaPrograms.OExceptionHandling;

public class Exception7 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;

        int result = 0;

        try {
            result = num1 / num2;
            System.out.println("In Try block ");
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divided by zero  " + e);
        }
        System.out.println(result);
    }
}
