package JavaPrograms.PMultiThreading;

class Demo2 implements Runnable{
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


public class MultiThreading11 {
    public static void main(String[] args) throws Exception //exception is throw becouse join(); are called.
    {
        System.out.println("Main Thread are Executing ...");

        Demo2 d2 = new Demo2();

        Thread t1 = new Thread(d2);

        t1.start();
        t1.join(); //If the thread has to wait until the other thread finishes its execution then we need to go for join().
        
        System.out.println("Main Thread finish the work...");

    }
}