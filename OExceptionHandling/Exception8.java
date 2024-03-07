package JavaPrograms.OExceptionHandling;

public class Exception8 {
    public static void main(String[] args) {

        int values[] = {4,5,6,7,8,9,3};

        try {
            System.out.println(values[1]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit....");
        }
    }
}
