package JavaPrograms.PMultiThreading;

class Demo1 implements Runnable{
    public void run(){
        System.out.println("Child Thread are Executing...");
        try {
            for(int i=0; i<=2; i++)
            {
                System.out.println("Focuse is Important...");
                Thread.sleep(4000);
            }
        } catch (Exception e) {
            System.out.println("Some Problem...");
        }

    }
}


public class MultiThreading10 {
    public static void main(String[] args) {
        System.out.println("Main Thread are Executing ...");

        Demo1 d = new Demo1();

        Thread t1 = new Thread(d);

        t1.start();

        System.out.println("Main Thread finish the work...");
    }
}