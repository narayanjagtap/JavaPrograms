package JavaPrograms.PMultiThreading;

class Demo4 implements Runnable{
    public void run(){
        for(int i=0; i<4; i++)
        {
            try {
                System.out.println("Focus is important...");
                Thread.sleep(4000);
            } catch (Exception e) {
                System.out.println("Thread is Interrupted...");
            }
        }
    }
}

public class MultiThreading13 {
    public static void main(String[] args) {
        Demo4 d = new Demo4();

        Thread t1 = new Thread(d);

        t1.start();
        t1.interrupt();    //Interrupt method

    }
}