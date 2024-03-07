package JavaPrograms.OExceptionHandling;

public class Exception21 {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = -2;

        try {
            if(num2 <= 0 || num1 <= 0){
                System.out.println("Enter the valid number...");
            }
            else{
                int result = num1 / num2;
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("Enter the valid number...");
        }
    }
}
