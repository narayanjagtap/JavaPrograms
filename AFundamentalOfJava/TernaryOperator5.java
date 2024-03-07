package JavaPrograms.AFundamentalOfJava;

import java.util.Scanner;

//Write a program that takes a student's score as input (0-100) and uses the ternary operator to determine their grade (A, B, C, D, or F) based on the following grading scale:

public class TernaryOperator5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your marks...");
        int score = scan.nextInt();

        if(score > 100)
        {
            System.out.print("Enter marks in between 0-100 ");
        }
        else
        {
            char Gread = (score>=90)? 'A': (score>=80)? 'B': (score>=70)? 'c': (score>=50)? 'D': 'F';

            System.out.println(Gread);
        }
    }
}
