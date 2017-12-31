package threading.exceptionhandling;

import threading.SampleThread;
import threading.SampleThreadThrowingException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by nitlak on 31-12-2017.
 *
 * In case of ThreadPoolExecutor also, if there is exception in any of the Thread, only that thread is affected
 * and others continue to execute.
 */
public class ThreadPoolExecute {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for(int i = 1 ; i<=100; i++){
            if(i != 3)
            service.execute(new SampleThread());
            else
                service.execute(new SampleThreadThrowingException());
        }
        service.shutdown();
        try {
            service.awaitTermination(10l, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i=1; i<=100; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MainThread running");
        }

    }
}
