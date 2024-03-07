package JavaPrograms.AFundamentalOfJava;

import java.util.Scanner;

/*Write a Java program that takes an integer as input and determines whether it is an odd or even number. 
Display an appropriate message. */

public class Conditional_if_else2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Integer number : ");
        int num = scan.nextInt();

        if(num%2==0){
            System.out.println(num + " is a EVEN number...");
        }
        else{
            System.out.println(num + " is a ODD number...");
        }
    }
}
