package JavaPrograms.PMultiThreading;

import java.util.Scanner;

class MyThread2 extends Thread{
    public void run(){
        String tname = Thread.currentThread().getName();
        if(tname.equals("calc")){
            calc();
        }
        else{
            importMessage();
        }
    }
    public void calc(){
        System.out.println("Calculation is Started...");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Frist number : ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = scan.nextInt();

        int result = num1 + num2;
        System.out.println("Result is : " + result);
        System.out.println("Calculation is Ended....");
        System.out.println("---------------------------------------");
    }
    public void importMessage(){
        System.out.println("Display important message task...");
        for(int i=0; i<=4; i++){
            System.out.println("Focus is important to master skill...");
        }
        System.out.println("Displaying important message task ended...");
        System.out.println("----------------------------------------");
    }
}
public class MultiThreading8 {
    public static void main(String[] args) {
        
        System.out.println("Main Thread is Started....");

        MyThread2 Thread1 = new MyThread2();
        MyThread2 Thread2 = new MyThread2();

        Thread1.setName("calc");
        Thread2.setName("print");

        Thread1.start();
        Thread2.start();
    }
}
//Multiple Threads using Single Run Method.