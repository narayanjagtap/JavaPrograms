package JavaPrograms.PMultiThreading;

class car2 implements Runnable{
    public void run()
    {
        try {
            System.out.println(Thread.currentThread().getName() + "His entered parking lot");
            Thread.sleep(2000);

            synchronized(this) //Synchronised block are created.
            {
                System.out.println(Thread.currentThread().getName() + "Go into car to drive");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "Started to drive the car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "Come back and Parked the car");
                Thread.sleep(2000);
            }

        } catch (Exception e) {
            System.out.println("Some Probkem occures");
        }
    }
}

public class MultiThreading17 {
    public static void main(String[] args) {

        car2 c = new car2();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("Son-1");
        t2.setName("Son-2");
        t3.setName("Son-3");

        t1.start();
        t2.start();
        t3.start();
    }
}