package JavaPrograms.OExceptionHandling;

import java.util.Scanner;

public class Exception14 {
    public static void main(String[] args) {
        int num1 = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");

        try {
            num1 = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Please Enter the valid number..." + e);
        }
        System.out.println("Number is : " + num1);
    }
}
//compiler ask 'Enter the number' if you write your name then the compiler show Error 'Please Enter the number' .