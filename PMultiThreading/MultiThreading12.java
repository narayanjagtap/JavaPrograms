package JavaPrograms.PMultiThreading;

class Demo3 implements Runnable{
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


public class MultiThreading12 {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Main Thread are Executing ...");

        Demo3 d3 = new Demo3();

        Thread t1 = new Thread(d3);
        System.out.println(t1.isAlive());// It returns true if thread status is live, false otherwise.

        t1.start();
        System.out.println(t1.isAlive());// It returns true if thread status is live, false otherwise.
        
        t1.join(); //If the thread has to wait until the other thread finishes its execution then we need to go for join().
        
        System.out.println("Main Thread finish the work...");

    }
}