package JavaPrograms.OExceptionHandling;

public class Exception6 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;

        int result = 0;

        try {
            result = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong... " + e);
        }
        System.out.println(result);
    }
}
