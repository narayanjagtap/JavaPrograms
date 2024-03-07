package JavaPrograms.AFundamentalOfJava;

import java.util.Scanner;

public class ReturnStatement2 {
    public int add(int a , int b){
        int c = a + b;
        return c;
    }
    
    public static void main(String[] args) {
        ReturnStatemant1 res = new ReturnStatemant1();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Frist number...");
        int d = scan.nextInt();
        System.out.println("Enter Second Number...");
        int f = scan.nextInt();

        int result = res.add(d,f);

        System.out.println("Result is :  " + result);
    }
}
