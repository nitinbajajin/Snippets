package threading;

/**
 * Created by nitlak on 31-12-2017.
 */
public class SampleThread implements Runnable {

    @Override
    public void run() {
        for(int i =1; i<=1000; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());

        }
    }
}
