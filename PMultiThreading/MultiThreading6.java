package JavaPrograms.PMultiThreading;

import java.util.Scanner;

class calc1 implements Runnable{
    public void run(){
        System.out.println("Calculation is Started....");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Frist number : ");
        int num1 = scan.nextInt();
        System.out.println("Enter the Second number : ");
        int num2 = scan.nextInt();

        int result = num1 + num2;
        System.out.println("Result is : " + result);
        System.out.println("Calculation is Ended....");
        System.out.println("------------------------------------------");
    }
}
class message1 implements Runnable{
    public void run(){
        System.out.println("Display important message task...");
        for(int i=0; i<=4; i++){
            System.out.println("Focus is important to master skill...");
        }
        System.out.println("Displaying important message task ended...");
    }
}
public class MultiThreading6 {
    public static void main(String[] args) {
        
        System.out.println("Main Thread....");

        calc1 c = new calc1();
        message1 m = new message1();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(m);

        t1.start();
        t2.start();
    }
}
//By impliments Thread class