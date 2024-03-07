package JavaPrograms.PMultiThreading;

class MyThread extends Thread{
    public void run(){
        System.out.println("Child Thread....");
    }
}
public class MultiThreading4 {
    public static void main(String[] args) {

        System.out.println("main Thread..");
        
        MyThread m = new MyThread();
        m.start();
    }
}
//By extending Thread class