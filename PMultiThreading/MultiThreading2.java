package JavaPrograms.PMultiThreading;

public class MultiThreading2 {
    public static void main(String[] args) {
        
        System.out.println("These Ptogram are Executed by main Thread");
        String name = Thread.currentThread().getName(); // find which Threads are Excecuted.
        System.out.println("name of Thread is : " + name);
        System.out.println("Priority of main Thread is : " + Thread.currentThread().getPriority()); //Priorities of main Threads

    }
}
