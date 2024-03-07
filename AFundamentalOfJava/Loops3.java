package JavaPrograms.AFundamentalOfJava;

import java.util.Scanner;

//Calculate the Sum of N Numbers.

public class Loops3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number.:");
        int num = scan.nextInt();

        int sum = 0; //This variable will be used to store the running sum of numbers.

        for(int i=0; i<=num; i++){

            sum += i;
        }
        System.out.println("Sum of "+ num + " Numbers is " + sum );
    }
}