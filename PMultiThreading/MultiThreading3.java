package JavaPrograms.PMultiThreading;

public class MultiThreading3 {
    public static void main(String[] args) {

        System.out.println("These Ptogram are Executed by main Thread");

        System.out.println("Befour changing..........................");
        String name = Thread.currentThread().getName();// find which Threads are Excecuted.
        System.out.println("Thread name is : " + name);
        System.out.println("Priority of the main Thread is : " + Thread.currentThread().getPriority());//Priorities of main Threads

        System.out.println("After changing.............................");
        Thread t = Thread.currentThread();/* current Thread information store in variable 't' */
        t.setName("PW");
        t.setPriority(1);
        String name1 = Thread.currentThread().getName();
        System.out.println("Thread name is :- " + name1);
        System.out.println("the Priority of main Thread is :- " + Thread.currentThread().getPriority());
        
    }
}
