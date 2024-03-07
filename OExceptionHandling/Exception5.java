package JavaPrograms.OExceptionHandling;

public class Exception5 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;

        int result = 0;

        try {
            result = num1 / num2;
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        }
        System.out.println(result);
    }
}
