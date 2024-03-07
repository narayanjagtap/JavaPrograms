package JavaPrograms.OExceptionHandling;

public class Exception10 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;

        int result = 0;

        int values[] = {1,2,3,4,5,6,7,8};

        try {
            result = num1 / num2;
            System.out.println(values[25]);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divided by zero... " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit... " + e);
        }
        System.out.println(result);
    }
}
