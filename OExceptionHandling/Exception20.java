package JavaPrograms.OExceptionHandling;

public class Exception20 {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = -2;

        try {
            int result = num1 / num2;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Enter the valid number...");
        }
    }
}
