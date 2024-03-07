package JavaPrograms.AFundamentalOfJava;

import java.util.Scanner;

public class Loops7While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Name:- ");
        String name = scan.nextLine();
        System.out.print("How many times your name are printed:- ");
        int num = scan.nextInt();

        int i = 1;
        while(i<=num){
            System.out.println(name);
            i++;
        }
    }
}
