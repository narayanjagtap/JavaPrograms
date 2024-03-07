package JavaPrograms.AFundamentalOfJava;

import java.util.Scanner;
// Print Numbers from 1 to N:


public class Loops2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number.:");
        int num = scan.nextInt();

        for(int i=0; i<=num; i++){

            System.out.println(i);

        }

    }
}
