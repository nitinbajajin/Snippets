package threading.exceptionhandling;

import threading.SampleCallable;
import threading.SampleCallableThrowingException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by nitlak on 31-12-2017.
 *
 * Future.get throws exception for submitted Threads that threw Exception
 */
public class ThreadPoolSubmitWithCallable {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Future> results = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {

            if (i != 3)
                results.add(service.submit(new SampleCallable("Thread "+i)));
            else
                results.add(service.submit(new SampleCallableThrowingException("Thread "+i)));
        }
        service.shutdown();

        while (!service.isTerminated()) ;

        System.out.println("Results ");
        for(Future future: results){
            try {
                System.out.println("Result is " +future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MainThread running");
        }
    }
}
