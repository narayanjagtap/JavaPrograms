package JavaPrograms.AFundamentalOfJava;

import java.util.Scanner;

//Write a Java program that takes a numeric grade as input and uses a switch statement to display the corresponding letter grade (A, B, C, D, or F).


public class Switch5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Marks in between 0-100 ...");
        int score = scan.nextInt();

        if(score>0 && score<=100){

            switch (score/10) {

            case 10: 
            case 9: System.out.println("Gread is :- A");
                break;

            case 8: System.out.println("Gread is :- B");
                break;

            case 7: System.out.println("Gread is :- C");
                break;

            case 6: System.out.println("Gread is :- D");
                break;

            case 5: System.out.println("Gread is :- P");
                break;
                
            default:System.out.println("Gread is :- F");
                break;
            }
        }
        else{
            System.out.println("Enter valid number in between 0-100...");
        }
    }
}
