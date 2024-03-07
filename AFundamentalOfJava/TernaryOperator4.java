package JavaPrograms.AFundamentalOfJava;

import java.util.Scanner;

//Write a program that takes an integer as input and uses the ternary operator to determine if it's even or odd.

public class TernaryOperator4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        String result = (num%2 == 0)? "Even number...": "Odd number...";
        System.out.println(result);

    }
}
