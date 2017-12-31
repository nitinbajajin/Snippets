package threading.exceptionhandling;

import threading.SampleThread;
import threading.SampleThreadThrowingException;

/**
 * Created by nitlak on 31-12-2017.
 *
 *
 *
 * If multiple threads are running and Exception in One Thread does not affect another Thread it keeps on running.
 * Exception in Thread2 is not affecting Thread1 and main thread, they continue to run
 *
 *
 */
public class MultipleThreads {

    public static void main(String[] args) {
        Thread t1 = new Thread(new SampleThread());
        t1.setName("Thread 1");


        Thread t2 = new Thread(new SampleThreadThrowingException());
        t2.setName("Thread 2");

        t1.start();
        t2.start();

        for(int i =1; i<=1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }

        System.out.println("Main Thread completed");


    }
}
