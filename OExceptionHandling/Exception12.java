package JavaPrograms.OExceptionHandling;

public class Exception12 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result = 0;

        int values[] = {1,4,3,2,5,7,9,5};

        try {
            result = num1 / num2;
            System.out.println(values[23]);
        } 
        catch (ArithmeticException e) {
            System.out.println("can not devide by Zero... " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit... " + e);
        }
        System.out.println(result);
    }
}
