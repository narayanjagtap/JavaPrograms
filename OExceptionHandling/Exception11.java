package JavaPrograms.OExceptionHandling;

public class Exception11 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result = 0;

        int values[] = {9,5,6,8,3,2,4,8};

        try {
            System.out.println(values[2]);
            result = num1 / num2;
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divided by Zero..." + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit... " + e);
        }
        System.out.println(result);
    }
}
