package JavaPrograms.OExceptionHandling;

public class Exception22 {
    public static void main(String[] args) {
        int num1 = 8; 
        int num2 = -2;

        try {
            if(num1 <= 0 || num2 <=0){
                Exception e = new ArithmeticException();
                throw e;
            }
            else{
                int result = num1 / num2;
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("Enter the valid number.,..");
        }
    }
}
