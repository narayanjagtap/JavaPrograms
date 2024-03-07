package JavaPrograms.OExceptionHandling;

public class Exception9 {
    public static void main(String[] args) {
        
        int values[] = {9,8,7,6,5,4,2,34,5};

        try {
            System.out.println(values[34]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit...");
        }
    }
}
