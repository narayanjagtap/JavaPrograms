package JavaPrograms.PMultiThreading;

import java.nio.file.Path;
import java.util.Scanner;

public class MultiThreading1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Task 1
        System.out.println("Enter the frist number...");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number...");
        int num2 = scan.nextInt();
        int result = num1 + num2;
        System.out.println("Result is : " + result);
        System.out.println("-------------------------------------------------------------");

        for(int i=0; i<=4; i++){ //Task 2
            System.out.println("Dada");
        }
        System.out.println("-------------------------------------------------------------");

        for(int i=0; i<=3; i++){ //Task 3
            System.out.println("Focus is important to master skills");
        }
        System.out.println("-----------------------------------------------------------");
    }
}
// Above Tasks are not depends on each other,
