package JavaPrograms.OExceptionHandling;

import java.util.Scanner;

public class Exception15 {
    public static void main(String[] args) {
        int num = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number...");

        try {
            num = scan.nextInt();
        } 
        catch (Exception e) {
            System.out.println("Please enter the valid number...");
        }
        finally{
            System.out.println("'finally' blocks are Always Exicuted");
        }
        System.out.println("Number is : " + num);
    }
}
/* 'finally' blocks are Always Exicuted */