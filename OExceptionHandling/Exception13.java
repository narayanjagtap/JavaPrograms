package JavaPrograms.OExceptionHandling;

public class Exception13 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;
        int result = 0;

        String name = null;

        int values[] = {9,8,65,345,32,76,2};

        try {
            result = num1 / name.length();
            System.out.println(values[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit... " + e);
        }
        catch(ArithmeticException e){
            System.out.println("Can not divided by Zero..." + e);
        }
        catch(Exception e){
            System.out.println("Something went Worong..." + e);
        }
        System.out.println(result);
    }
}
