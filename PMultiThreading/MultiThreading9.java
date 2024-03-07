package JavaPrograms.PMultiThreading;

class Demo implements Runnable{
    public void run(){
        System.out.println("Child Thread are Executing...");
        try {
            Thread.sleep(3000);  //Blocked State. (1 second = 1000 millisecond).
        } catch (Exception e) {
            System.out.println("Some Problem");
        }
        System.out.println("Child Thread Task Complited...");
    }
}
public class MultiThreading9 {
    public static void main(String[] args) {
        System.out.println("Main Thread Started...");
        Demo d = new Demo();//new state.
        Thread t = new Thread(d);// Pass the Runnable object 'd' to the Thread constructor.
        t.start();//Runnable State.
    }
}
