package JavaPrograms.AFundamentalOfJava;

import java.util.Scanner;

//Problem 1
//Write a program that takes two numbers as input and uses the ternary operator to find and print the maximum of the two numbers.

public class TernaryOperator3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Frist Number :");
        int num1 = scan.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = scan.nextInt();

        int result = (num1>num2)? num1: num2;

        System.out.println("Maximum number is : " + result);
    }
}
