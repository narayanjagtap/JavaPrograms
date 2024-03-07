package JavaPrograms.AFundamentalOfJava;

import java.util.Scanner;

public class ScannerClass1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Name:- ");
        String name = scan.nextLine();

        System.out.print("Enter your age:- ");
        int age = scan.nextInt();

        System.out.print("Enter your salary:- ");
        double salary = scan.nextDouble();

        System.out.println("Your Name is " + name + "," + " your age is " + age + "," + " and your Salary is " + salary);
    }
}
