package JavaPrograms.AFundamentalOfJava;

import java.util.Scanner;

//Calculate Factorial of a Number:
public class Loops5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();

        int factorial = 1;  //if in this case you are initialise by '0' then your output is also '0';

        for(int i=1; i<=num; i++){

            factorial *= i;

        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
