package JavaPrograms.AFundamentalOfJava;

import java.util.Scanner;

// Print Even Numbers from 1 to N:
public class Loops4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number...");
        int num = scan.nextInt();

        for(int i=0; i<=num; i+=2){

            System.out.println(i);

        }
    }
}
