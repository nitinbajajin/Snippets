package threading.lock;

/**
 * Created by nitlak on 19-12-2017.
 */
public class ThreadWaitForever {
    public static void main(String[] args) {
        ThreadWaitForever object = new ThreadWaitForever();
        object.callNotify();
        object.testMethod();

        System.out.println("Main ended");
    }

    public synchronized void callNotify() {
        notify();

    }

    public synchronized void testMethod(){
        System.out.println("Thread started");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread ended");

    }


}
