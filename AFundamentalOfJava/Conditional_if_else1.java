package JavaPrograms.AFundamentalOfJava;

import java.util.Scanner;

/*Write a Java program that checks if a given year (an integer) is a leap year or not. 
A leap year is divisible by 4, 
but if it is also divisible by 100, 
it must also be divisible by 400 to be a leap year. 
Display whether the input year is a leap year or not. */

/* लीप वर्ष 4 ने भाग जाते,
पण जर ते 100 ने भाग जात असेल तर
लीप वर्ष होण्यासाठी ते 400 ने भागले जाणे आवश्यक आहे. */

public class Conditional_if_else1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter frist number...");
        int year = scan.nextInt();

        if(year%4==0){
            
            if(year%100==0 && year%400==0)
            {
                System.out.println(year + " is a leap year...");
            }
            else{
                System.out.println(year + " is also leap year...");
            }
        }
        else{
            System.out.println(year + " is a not leap year...");
        }
    }
}
// Which are Leap Years? The complete list of leap years in the first half of the 21st century is therefore 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, and 2048.