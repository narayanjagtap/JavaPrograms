package JavaPrograms.PMultiThreading;

import java.util.Scanner;

class calc extends Thread{
    public void run(){
        System.out.println("Calculation is started...");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First number : ");
        int num1 = scan.nextInt();
        System.out.println("Enter the Second number : ");
        int num2 = scan.nextInt();

        int result = num1 + num2 ;
        System.out.println("Result is : " + result);
        System.out.println("Calculation is Ended...");
        System.out.println("--------------------------------------------------------------");
    }
}
class Message extends Thread{
    public void run(){
        System.out.println("Display important message task...");
        for(int i=0; i<=3; i++){
            System.out.println("Focus is important to master skill...");
        }
        System.out.println("Displaying important message task ended...");
        System.out.println("----------------------------------------------------------------");
    }
}
public class MultiThreading5 {
    public static void main(String[] args) {
        
        calc c = new calc();
        Message m = new Message();

        c.start();
        m.start();
    }
}
//By extending Thread class