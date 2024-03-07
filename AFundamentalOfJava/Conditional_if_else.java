package JavaPrograms.AFundamentalOfJava;

import java.util.Scanner;

public class Conditional_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age");
        int age = sc.nextInt();

        if(age <= 18){
            System.out.println("You are a kid...");
        }
        else if(age>18 && age<=45){
            System.out.println("You are Young");
        }
        else{
            System.out.println("You are Older man");
        }
    }
}
